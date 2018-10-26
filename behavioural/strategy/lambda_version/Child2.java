package behavioural.strategy.lambda_version;

/**
 * This class implements feature 2.
 * 
 * @author jo
 *
 */
public class Child2 extends Main {
	Feature f;
	
	public Child2() { this.setVersion(this.featuresB.get(0)); }
	
	/**
	 * Sets behaviour of Child2
	 * 
	 * @param f - a behaviour definition
	 */
	public void setVersion(Feature f) { this.f = f; }

	/**
	 * 
	 * This is the method that does the expected behaviour
	 */
	public void feature() { this.f.feature(); }
}
