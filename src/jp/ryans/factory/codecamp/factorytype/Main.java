/**
 * 
 */
package jp.ryans.factory.codecamp.factorytype;

/**
 * プログラムを開始するクラス
 * @author Ryan's Factory
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// プログラムの引数を検査
		Factory.Objects gameName = null;
		if (0 != args.length) {
			// ゲームの選択
			if (GameRule.ARG_GAME_NAME_1.equals(args[0])) {
				gameName = Factory.Objects.BigOrSmall;
			}
			if (GameRule.ARG_GAME_NAME_2.equals(args[0])) {
				gameName = Factory.Objects.WarGame;
			}
			// バージョンの選択

		} else {
			// ゲーム名の引数がない場合は、メッセージを出力して終了
			System.out.println("引数がありません！");
			System.exit(1);
		}
		// ゲームクラスのインスタンスを取得
		GameRule game = (GameRule) Factory.getNewInstance(gameName);
		// ゲームを実行
		int result = game.run();
		// プログラム結果を返却
		System.exit(result);
	}

}
