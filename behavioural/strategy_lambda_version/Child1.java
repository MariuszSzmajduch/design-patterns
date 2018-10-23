package behavioural.strategy_lambda_version;

/**
 * This class implements feature one and changes its behaviour in runtime.
 * 
 * @author jo
 *
 */
public final class Child1 extends Main {
	Feature1 f;  // cherry-pick
	
	public Child1() { this.setVersion(this.featuresA.get(0)); }
	
	public void setVersion(Feature1 f) { this.f = f; }    

	public void feature() { this.f.feature1(); }
}
