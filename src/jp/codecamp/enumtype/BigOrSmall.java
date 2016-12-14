package jp.codecamp.enumtype;

public class BigOrSmall {

	/**
	 * 開始時のチップ総数
	 */
	private static final long StartChips = 100L;

	public static void main(String[] args) {
		// キーボードの生成
		Keyboard key = new Keyboard();
		// ディスプレイの生成
		Display display = new Display();
		// トランプの生成
		Trump trump = new Trump();
		// チップの生成
		Chips chips = new Chips(StartChips);
		// ゲーム開始する
		do {
			// トランプをシャッフルする
			trump.shuffle();
			// 最初のカードをひく
			Card firstCard = trump.getCard();
			// ゲーム開始の表示
			display.viewGameStart(chips, firstCard);
			// ベット数を入力して、それを手持ちのチップから引いてテーブル上のチップ数とする
			long tableChip = chips.betChips(key.betValue(chips));
			while (true) {
				// BigOrSmallの選択
				boolean bigOrSmall = key.isBigOrSmall(firstCard);
				// 次のカードをひく
				Card secondCard = trump.getCard(firstCard);
				// ゲームの状況を表示する
				display.viewGameSituation(tableChip, bigOrSmall, firstCard, secondCard);
				// 勝敗の判定
				if (bigOrSmall == firstCard.isBigOrSmall(secondCard)) {
					// 勝利したときの報酬を得る
					tableChip = chips.getReward(tableChip);
					// 勝利の表示
					display.viewWin(tableChip);
					// そのままゲームを続けるか選択する
					if (key.isNextBet(tableChip)) {
						// 引いたカードを最初のカードにする
						firstCard = secondCard;
						// そのままゲームを続ける
						continue;
					}
					// チップを精算する
					chips.payOff(tableChip);
				} else {
					// 敗退の表示
					display.viewLoss();
				}
				// 次のゲームへ
				break;
			}
			// チップ枚数を表示する
			display.viewGameResult(chips);
			// ゲームの終了判定
		} while (key.isGameEnd(chips));
		// 終了の表示
		display.viewEnd();
		// キーボードを閉じる
		key.close();
	}
}
