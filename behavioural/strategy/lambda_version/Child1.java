package behavioural.strategy.lambda_version;

/**
 * This class implements feature one and changes its behaviour in runtime.
 * 
 * @author jo
 *
 */
public final class Child1 extends Main {
	Feature f;
	
	public Child1() { this.setVersion(this.featuresA.get(0)); }
	
	/**
	 * Sets behaviour of Child1
	 * 
	 * @param f - a behaviour definition
	 */
	public void setVersion(Feature f) { this.f = f; }    

	/**
	 * This is the method that does the expected behaviour
	 * 
	 */
	public void feature() { this.f.feature(); }
}
