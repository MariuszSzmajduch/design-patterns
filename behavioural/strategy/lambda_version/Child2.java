package behavioural.strategy.lambda_version;

/**
 * This class implements feature 2.
 * 
 * @author jo
 *
 */
public class Child2 extends Main {
	Feature2 f;
	
	public Child2() { this.setVersion(this.featuresB.get(0)); }
	
	public void setVersion(Feature2 f) { this.f = f; }

	public void feature() { this.f.feature2(); }
}
