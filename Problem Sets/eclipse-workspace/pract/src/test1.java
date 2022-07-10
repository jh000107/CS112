
public class test1 {
	
	public static double discountPrice(double originalPrice, int percentDiscount){
		double newPrice = originalPrice - percentDiscount / 100.0 * originalPrice;
		return newPrice;
	}
	
}
