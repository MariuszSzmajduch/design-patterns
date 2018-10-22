package behavioural.strategy;

/**
 * This class implements feature one.
 * 
 * @author jo
 *
 */
public class Child1 extends Main {
	
	public Child1() {
		this.efo = new FeatureOneWrapper();
	}
	
	public void feature() { efo.feature1(); }
}
