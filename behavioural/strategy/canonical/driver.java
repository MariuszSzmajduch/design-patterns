package behavioural.strategy.canonical;

/**
 * Driver class demonstrating proper implementation of Strategy Pattern.
 * 
 * @author jo
 *
 */
public class driver {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		c1.feature();
		c2.feature();

		System.out.println("runtime behaviour change:");
		c2.setEft(new AnotherFeatureOneWrapper());
		c2.feature();
		
		c1.shared();
		c2.shared();
	}

}
