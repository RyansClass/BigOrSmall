package jp.ryans.factory.codecamp.enumtype;

/**
 * カードマーク
 */
public enum CardMark {
	/**
	 *  カードのマーク クラブ 
	 */
	Clubs("クラブ", 0),
	/**
	 *  カードのマーク ダイヤ 
	 */
	Diamond("ダイヤ", 1),
	/**
	 *  カードのマーク ハート 
	 */
	Heart("ハート", 2),
	/**
	 *  カードのマーク スペード 
	 */
	Spade("スペード", 3);

	/* マークの名前 */
	private String markName;
	/* マークのレベル（強さ) */
	private int level;

	/**
	 * コンストラクタ
	 * @param markName マークの名前
	 * @param level マークのレベル
	 */
	CardMark(String markName, int level) {
		this.markName = markName;
		this.level = level;
	}

	/**
	 * マークの名前を取得
	 * @return
	 */
	public String getMarkName() {
		return this.markName;
	}

	/**
	 * マークのレベルを取得
	 * @return
	 */
	public int getLevel() {
		return this.level;
	}
}
