package jp.ryans.factory.codecamp.enumtype;

/**
 * チップ
 */
public class Chips {
	/**
	 * 最大のベット数
	 */
	private final long MaxBetValue = 20;
	/**
	 * 最小のベット数
	 */
	private final long MinBetValue = 1;
	/**
	 * チップ数
	 */
	private long value = 0;
	/**
	 * コンストラクタ
	 * @param value チップ数の初期値
	 */
	public Chips(long value) {
		this.value = value;
	}
	/**
	 * チップをベットする
	 * @param bet
	 * @return ベットしたチップ数
	 */
	public long betChips(long bet) {
		value -= bet;
		return bet;
	}
	/**
	 * チップを精算
	 * @param tableChip 受け取るチップ数
	 */
	public void payOff(long tableChip) {
		// オーバーフローを起こした場合は、受け取るチップ数とする
		if( 0 > value + tableChip ) {
			value = tableChip;
		} else {
			value += tableChip;
		}
	}
	/**
	 * 勝利したときの報酬を計算する
	 * @param tableChip テーブルのチップ数
	 * @return 勝利したときの報酬
	 */
	public long getReward(long tableChip) {
		// テーブルのチップ数を２倍にする
		return tableChip *2;
	}
	/**
	 * チップの総計を取得する
	 * @return
	 */
	public long getTatal() {
		return value;
	}
	/**
	 * 10チップを取得する
	 * @return
	 */
	public long getTenValue() {
		return value / 10;
	}
	/**
	 * 1チップを取得する
	 * @return
	 */
	public long getOneValue() {
		return value % 10;
	}
	/**
	 * ベットできる最大値を取得する
	 * @return
	 */
	public long getMaxBetValue() {
		if ( MaxBetValue > value ) {
			return value;
		}
		return MaxBetValue;
	}
	/**
	 * ベットできる最小値を取得する
	 * @return
	 */
	public long getMinBetValue() {
		return MinBetValue;
	}
}
