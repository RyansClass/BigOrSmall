/**
 *
 */
package jp.ryans.factory.codecamp.factorytype;

/**
 *
 * @author Ryan's Factory
 *
 */
public class BigOrSmall {

	static final int START_TIPS = 100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BigOrSmall game = (BigOrSmall) Factory.getNewInstance(Factory.Objects.BigOrSmall);


		int result = game.run(BigOrSmall.START_TIPS);



		System.exit(result);
	}


	public int run(int tipValue) {




		return 0;
	}

}
