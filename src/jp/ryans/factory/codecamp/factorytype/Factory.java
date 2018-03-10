package jp.ryans.factory.codecamp.factorytype;

public class Factory {

	enum Objects {
		BigOrSmall,WarGame,Trump,Card,Tips
	}



	public static Object getNewInstance(Objects className) {

		Object obj = null;

		switch(className) {

		case BigOrSmall:

			obj = new BigOrSmall();

			break;
			
		case Tips:
			
			obj = new Tips();

		default:
			break;


		}

		return obj;

	}

}
