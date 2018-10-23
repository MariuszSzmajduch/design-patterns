package behavioural.strategy.canonical;

/**
 * This class implements feature 2 and changes its behaviour in runtime.
 * 
 * @author jo
 *
 */
public class Child2 extends Main {
	
	public Child2() { this.eft = new FeatureTwoWrapper(); }
	
	public void setEft(ExtractedFeatureTwo eft){ this.eft = eft; }

	public void feature() { this.eft.feature(); }
}
