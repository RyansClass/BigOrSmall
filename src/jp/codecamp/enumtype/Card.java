package jp.codecamp.enumtype;

import java.util.ArrayList;

/**
 * カード
 */
public class Card implements Comparable<Card>{
	/**
	 * カード番号の最小値
	 */
	private static final int MinNumber = 1;
	/**
	 * カード番号の最大値
	 */
	private static final int MaxNumber = 13;
	/**
	 * カード番号
	 */
	private int number;
	/**
	 * カードマーク
	 */
	private CardMark mark;

	/**
	 * 指定のカードマークのカードを生成する
	 * @param mark カードマーク
	 * @return カードをリストで返却
	 */
	public static ArrayList<Card> getNewInstance(CardMark mark) {
		ArrayList<Card> result = new ArrayList<Card>();
		for(int i = MinNumber; i <= MaxNumber;i++) {
			result.add(new Card(i,mark) );
		}
		return result;
	}

	/**
	 * コンストラクタ
	 * @param number カード番号
	 * @param markIndex カードマーク
	 */
	public Card(int number, CardMark mark) {
		this.number = number;
		this.mark = mark;
	}
	/**
	 * カード番号を取得
	 * @return
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * カードマークを取得
	 * @return
	 */
	public CardMark getMark() {
		return mark;
	}
	/**
	 * カードのBigOrSmall判定
	 * @param c 比較するカード
	 * @return
	 * true: Big
	 * false: Small
	 */
	public boolean isBigOrSmall(Card c) {

		assert ( equals(c) ) : "カードの強さが等しい";

		if( 0 < compareTo(c) ) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.mark.getMarkName() + String.format("%2d", this.number);
	}

	@Override
	public int compareTo(Card o) {
		if( this.number == o.getNumber()) {
			return this.mark.getLevel() - o.getMark().getLevel();
		}
		return  this.number - o.getNumber();
	}

	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Card ) {
			if ( 0 == this.compareTo((Card)obj) ) {
				return true;
			}
		}
		return false;
	}
}
