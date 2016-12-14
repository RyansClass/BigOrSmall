package jp.ryans.factory.codecamp.enumtype;

import java.util.ArrayList;
import java.util.Collections;

/**
 * トランプ
 */
public class Trump extends ArrayList<Card>{
	/**
	 * シリアライズバージョンID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * コンストラクタ
	 */
	public Trump() {
		super();
		// 初期化する
		this.clear();
		// クラブ
		this.addAll( Card.getNewInstance(CardMark.Clubs));
		// ダイヤ
		this.addAll( Card.getNewInstance(CardMark.Diamond));
		// ハート
		this.addAll( Card.getNewInstance(CardMark.Heart));
		// スペード
		this.addAll( Card.getNewInstance(CardMark.Spade));
	}
	/**
	 * トランプをシャッフルする
	 */
	public void shuffle() {
		Collections.shuffle(this);
	}
	/**
	 * トランプからカードを取り出す
	 * @return カード
	 */
	public Card getCard() {
		Card result = this.remove(0);
		this.add(result);
		return result;
	}
	/**
	 * トランプからカードを取り出す
	 * 同一のカードならば別のカードにする
	 * @param c 比較するカード
	 * @return カード
	 */
	public Card getCard(Card c) {
		// カードを取り出す
		Card result = getCard();
		// 同じカードの場合は次を取り出す
		if (result.equals(c) ) {
			result = getCard();
		}
		return result;
	}
}
