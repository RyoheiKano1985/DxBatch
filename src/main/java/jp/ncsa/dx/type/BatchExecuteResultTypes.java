package jp.ncsa.dx.type;

public enum BatchExecuteResultTypes {
	SUCCESS(0, "正常終了"), ERROR(1, "異常終了"), WARN(9, "警告終了");

	// 実行結果コード
	private int code;
	// 実行結果名
	private String name;

	/**
	 * コードの取得
	 * 
	 * @return コード
	 */
	public int getCode() {
		return code;
	}

	/**
	 * 名称の取得
	 * 
	 * @return 名称
	 */
	public String getName() {
		return name;
	}

	private BatchExecuteResultTypes(int code, String name) {
		this.code = code;
		this.name = name;

	}

}
