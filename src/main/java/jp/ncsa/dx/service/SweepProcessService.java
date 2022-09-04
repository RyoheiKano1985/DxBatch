package jp.ncsa.dx.service;

import org.springframework.stereotype.Component;

import jp.ncsa.dx.type.BatchExecuteResultTypes;

/**
 * スイープ処理サービス
 */
@Component
public class SweepProcessService {

	/**
	 * 保存期間を超えたデータをスイープする。
	 * 
	 * @param status ステータス
	 */
	public BatchExecuteResultTypes execute(int status) {

		// 実行結果
		BatchExecuteResultTypes executeResult = null;

		if (status == BatchExecuteResultTypes.SUCCESS.getCode()) {
			executeResult = BatchExecuteResultTypes.SUCCESS;
			System.out.println("正常終了する");
		} else if (status == BatchExecuteResultTypes.ERROR.getCode()) {
			executeResult = BatchExecuteResultTypes.ERROR;
			System.out.println("異常終了する");
		} else if (status == BatchExecuteResultTypes.WARN.getCode()) {
			executeResult = BatchExecuteResultTypes.WARN;
			System.out.println("警告終了する");
		} else {
			throw new RuntimeException("想定外の例外が発生しました。");
		}

		return executeResult;
	}

}
