/**
 * 
 */
package jp.ryans.factory.codecamp.factorytype;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

/**
 * @author ryan
 *
 */
public class InitialData extends HashMap<String,Object> {

	/**
	 * シリアルバージョン
	 */
	private static final long serialVersionUID = 1L;
	
	public Integer getInteger(String key) {
		Object obj = this.get(key);
		
		if( obj instanceof Integer) {
			return (Integer) obj;
		}
		throw new IllegalArgumentException();
	}

	public Long getLong(String key) {
		Object obj = this.get(key);
		
		if( obj instanceof Long) {
			return (Long) obj;
		}
		throw new IllegalArgumentException();
	}

	public Double getDouble(String key) {
		Object obj = this.get(key);
		
		if( obj instanceof Double) {
			return (Double) obj;
		}
		throw new IllegalArgumentException();
	}
	public String getString(String key) {

		return this.get(key).toString();
	}
	
	public InputStream getStdIn() {
		Object obj = this.get("stdin");
		if( null == obj ) {
			obj = System.in;
		}
		if( obj instanceof InputStream) {
			return (InputStream) obj;
		}
		throw new IllegalArgumentException();
	}
	
	public OutputStream getStdOut() {
		Object obj = this.get("stdout");
		if( null == obj ) {
			obj = System.out;
		}
		if( obj instanceof OutputStream) {
			return (OutputStream) obj;
		}
		throw new IllegalArgumentException();
	}
	
}
