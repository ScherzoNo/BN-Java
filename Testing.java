/*
 * The one and only GodLooper 
 * (facebook - > https://www.facebook.com/profile.php?id=100010724801843)
 *
 * JavaSE-17
 *
 * © = Don't care
 * 
 */

public class Testing {
    /**
     * Costruttore
     */
	public Testing() {
		purchase = 0;
		payment = 0;
		track ++;
	}
    /**
     * Metodo 1
     * @param value
     */
	public void recordPurchase(double value) {
		purchase += value;
	}
    /**
     * Metodo 2
     * @param n
     * @param t
     */
	public void enterPayment(double n, double t) {
		payment += t*n;
	}
    /**
     * Metodo 3
     * @return
     */
	public double giveChange() {
		if (payment >= purchase) {
			return payment - purchase;
		}
		else {
			purchase -= payment;
			return -(purchase);
		}
	}
    /**
     * Metodo 3
     * @return
     */
	public static int giveTrack() {
		return track;
	}
	private double purchase;
	private double payment;
	private static int track = 0;
}