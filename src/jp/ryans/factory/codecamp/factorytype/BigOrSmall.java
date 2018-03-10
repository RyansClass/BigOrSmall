/**
「Big or Small」ゲームは、以下の要件を満たすように作成してください。

1．ゲーム開始時、[10]チップを10枚、総計100点を保有している（表示例、総計:100（[10]:10枚、[1]:0枚））。
2．カードが1枚、配られる（表示例、スペード11）。
3．「Big or Small」を始める前に、チップを何枚BETするのか、ユーザが決定する。 画面に適切な文言を表示する（表示例、■BET枚数選択）。 チップは最低1ポイントから最大20ポイントまでBETできる。BETするチップポイントは画面から入力できる
4．入力したチップポイントをチェックする。
入力したチップポイントが、もし半角数字の1〜20以外の文字が入力された場合、エラーメッセージを表示させて（表示例、チップポイントは半角数字の1〜20を入力してください）、上記の3に戻る。
入力したチップポイントが、もし総計のチップポイントより多く入力（BET）した場合、エラーメッセーを表示させて（表示例、BETするチップポイントは総計のチップポイント以下で入力してください）、上記の3に戻る（例、現在のチップポイントの総計が15の場合、BETできるチップポイントは15までになる）。
5．現在のカードに対し、次に配られるカードが大きい(Big)カードになるのか、小さい(Small)カードになるのかを選択できる。
6．Big or Smallの選択が、もし半角数字の0あるいは1以外の文字が入力された場合、エラーメッセージを表示させて（表示例、半角数字の0あるいは1のみ入力してください）、上記の5に戻る。
7．「Big or Small」の選択後に、カードが1枚、配られる。「Big or Small」結果の情報を表示する（表示例は以下の画像を参照）。
8．「Big or Small」に正解した場合はBETしたチップポイントが倍になり、外れた場合は没収される 。外れた場合は、下記の12を参照。
9．「Big or Small」に正解した場合、倍になったチップポイントを、次のBETに利用し、連続してゲームを行うかどうか選択できる（この場合、最大チップポイントの20を超えてBETすることが可能）。
10．Yes or No の選択が、もし半角数字の0あるいは1以外の文字が入力された場合、エラーメッセージを表示させて（表示例、半角数字の0あるいは1のみ入力してください）、上記の9に戻る。
11．Yes or No の選択で、「Yes」を選択した場合、再度、次に配られるカードが大きい(Big)カードになるのか、小さい(Small)カードになるのかを選択する（表示例は以下の画像を参照）。
12．上記の9で「Big or Smallを続けますか？」について「No」を選択した場合、あるいは「Big or Small」に外れた場合は、「Big or Small」ゲームを続けるかどうか選択する。 画面に適切な文言を表示する（表示メッセージの例は以下画像の参照 ）。 Yes or No の選択を画面から入力できる 。
13．Yes or No の選択が、もし半角数字の0あるいは1以外の文字が入力された場合、エラーメッセージを表示させて（例、半角数字の0あるいは1のみ入力してください）、上記の12に戻る。
14．上記の12で「ゲームを続けますか？」について、「Yes」を選択した場合、カードデッキについては初期状態に戻し 、現在のチップ数を保持したままで初期状態（上記の2）に戻り、処理を繰り返す 。
15．上記の12で「ゲームを続けますか？」について、「No」を選択した場合、プログラムを終了する（表示例は以下の画像参照）。
[総計について]
16．チップの総計が0になった場合は、ゲームが終了する。
17．1回目の「Big or Small」に正解した場合、獲得したチップポイントが総計にプラスされる（最初の総計：100、BETしたチップポイント：20、獲得したチップポイント：40、BET後の総計：120）。
18．1回目と2回目の「Big or Small」に正解した場合、獲得したチップポイントが総計にプラスされる（最初の総計：100、1回目のBETしたチップポイント：20、1回目で獲得したチップポイント：40、2回目のBETしたチップポイント：40、2回目で獲得したチップポイント：80、2回目のBET後の総計：160）。
19．1回目の「Big or Small」に正解し、2回目の「Big or Small」に外れた場合、BETしたチップポイントが総計からマイナスされる（最初の総計：100、1回目のBETしたチップポイント：20、2回目のBET後の総計：80）。
20．1回目の「Big or Small」に外れた場合、BETしたチップポイントが総計からマイナスされる（最初の総計：100、BETしたチップポイント：20、BET後の総計：80）。
21．1回目と2回目の「Big or Small」に外れた場合、BETしたチップポイントが総計からマイナスされる（最初の総計：100、1回目と2回目のBETしたチップポイント：20、2回目のBET後の総計：60）。

 */
package jp.ryans.factory.codecamp.factorytype;

/**
 * BigOrSmallゲームのルールおよび状態遷移をコントロールするクラス
 * @author Ryan's Factory
 *
 */
public class BigOrSmall extends GameRule {

	static final int START_TIPS = 100;
	
	@Override
	public int run() {
		GameRule.State state = GameRule.State.GAME_START;

		while ( GameRule.State.GAME_END != state) {
			// 次の状態に遷移（メソッドを呼び出す）する
			switch (state) {
			case GAME_START:
				// ゲームの開始を表示する
				state = viewPreStart(null);
				break;
			case GAME_END:
				break;
			default:
				break;

			}
		}
		return 0;
	}

	@Override
	public boolean isEnd() {

		return false;
	}

	@Override
	public State viewPreStart(Object[] args) {
		
		return GameRule.State.GAME_END;
	}
}