package behavioural.strategy.lambda_version;

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
		c1.setVersion(c1.featuresA.get(1));
		c1.feature();
		
		c1.shared();
		c2.shared();
	}

}
