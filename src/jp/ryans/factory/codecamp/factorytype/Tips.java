/**
 * 
 */
package jp.ryans.factory.codecamp.factorytype;

/**
 * @author ryan
 *
 */
public class Tips {
	
	public static final long TEN_TIPS_VALUE = 10;
	
	private final long TIPS_SUMMARY = TEN_TIPS_VALUE;
	
	private final long MAX = 20;
	
	private final long MIN = 1;
	
	private long value;
	
	Tips() {
		this.value = 0;
	}
	
	public void setValue(long value) {
		this.value = value;
	}
	
	public long getTenTipsValue() {
		return value / TIPS_SUMMARY;
	}
	
	public long getOwnTipsValue() {
		return value % TIPS_SUMMARY;
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
