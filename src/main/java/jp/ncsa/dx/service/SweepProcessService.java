package jp.ncsa.dx.service;

import org.springframework.stereotype.Component;

import jp.ncsa.dx.type.ExecuteResultTypes;

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
	public ExecuteResultTypes execute(int status) {

		// 実行結果
		ExecuteResultTypes executeResult = null;

		if (status == ExecuteResultTypes.SUCCESS.getCode()) {
			executeResult = ExecuteResultTypes.SUCCESS;
			System.out.println("正常終了する");
		} else if (status == ExecuteResultTypes.ERROR.getCode()) {
			executeResult = ExecuteResultTypes.ERROR;
			System.out.println("異常終了する");
		} else if (status == ExecuteResultTypes.WARN.getCode()) {
			executeResult = ExecuteResultTypes.WARN;
			System.out.println("警告終了する");
		} else {
			throw new RuntimeException("想定外の例外が発生しました。");
		}

		return executeResult;
	}

}
