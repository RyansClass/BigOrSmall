/**
 * 
 */
package jp.ryans.factory.codecamp.factorytype;

/**
 * @author ryan
 *
 */
public class Tips {
	
	private final long TIPS_SUMARY = 10;
	
	private final long MAX = 20;
	
	private final long MIN = 1;
	
	private long value;
	
	Tips(long initValue) {
		this.value = initValue;
	}
	
	
	public long getTenTipsValue() {
		return value / TIPS_SUMARY;
	}
	
	public long getOwnTipsValue() {
		return value % TIPS_SUMARY;
	}
	
	/**
	 * 要件項目３
	 * @return
	 */
	public long getMaxBetValue() {
		if ( value > MAX ) {
			return MAX;
		} else {
			return value;
		}
	}
	/**
	 * 要件項目３
	 * @return
	 */
	public long getMinBetValue() {
		return MIN;
	}

}