package jp.ryans.factory.codecamp.factorytype;

public class Factory {

	enum Objects {
		BigOrSmall,Trump,Card,Tip
	}



	public static Object getNewInstance(Objects className) {

		Object obj = null;

		switch(className) {

		case BigOrSmall:

			obj = new BigOrSmall();

			break;

		default:
			break;


		}

		return obj;

	}

}
