package jp.ncsa.dx.schedulingtask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import jp.ncsa.dx.service.SweepProcessService;
import jp.ncsa.dx.type.ExecuteResultTypes;

/**
 * 
 * スイープ処理スケジュール
 *
 */
@Component
public class SweepProcessScheduledTask {

	@Autowired
	SweepProcessService sweepProcessService;

	/**
	 * スイープ実行処理
	 */
	// SpringBoot起動した後１秒後に５秒間隔で繰り返し実行する。
	// @Scheduled(initialDelay = 1000, fixedRate = 5000)
	// application.ymlで指定したスケジュールで起動する
	// @Scheduled(cron = "${cron.sweepProcess}", zone = "${timezone}")

	@Scheduled(cron = "${scheduled.cron.sweepProcess}", zone = "${scheduled.timezone}")
	public void execute() {
		try {
			// 開始ログ ※本来はログファイルに出力する。
			System.out.println("スイープ処理を開始します。");

			// スイープ処理の実行
			ExecuteResultTypes exeResult = sweepProcessService.execute(0);

			// 終了ログ ※本来はログファイルに出力する。
			System.out.println("スイープ処理を終了します。実行結果＝" + exeResult);

		} catch (Throwable e) {
			// 終了ログ ※本来はログファイルに出力する。
			System.out.println("スイープ処理を終了します。実行結果＝" + ExecuteResultTypes.ERROR);

		}
	}
}
