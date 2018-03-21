/**
 * 
 */
package jp.ryans.factory.codecamp.factorytype;

/**
 * カードゲームのルールのインターフェイス
 * @author ryan
 *
 */
public abstract class GameRule {

	/**
	 * 開始するゲーム名称
	 */
	static final String ARG_GAME_NAME_1 = "BigOrSmall";
	/**
	 * 開始するゲーム名称
	 */
	static final String ARG_GAME_NAME_2 = "WarGame";

	/**
	 * ゲームの状態もしくは遷移すべき状態
	 */
	public enum State {
		GAME_END,GAME_START,PRE_START_VIEW
	}
	
	static final int SUCCESS = 0;
	
	static final int ERROR = 1;

	public abstract int init(InitialData param);
	/**
	 * ゲームを開始する
	 * @return 正常に終了した場合は０を返却し、エラーが発生した場合は１を返却する
	 */
	public abstract int run();
	
	/**
	 * ゲームを終了する条件がそろったか検査する
	 * @return 終了する場合はTRUE、ゲームを継続する場合はFALSEを返却する
	 */
	public abstract boolean isEnd();
	
	/**
	 * ゲームを開始する前に表示する
	 * @param args 表示に必要なオブジェクト
	 * @return 次の状態を返却
	 */
	public abstract State viewPreStart(Object[] args);

}
