package behavioural.strategy;

/**
 * Driver class demonstrating proper implementation of Strategy Pattern.
 * 
 * @author jo
 *
 */
public class driver {

	public static void main(String[] args) {
		Main m = new Main();
		m.getEfo().feature1();
		m.getEft().feature1();

		System.out.println("runtime behaviour change:");
		m.setEfo(new AnotherFeatureOneWrapper());
		m.getEfo().feature1();
	}

}
