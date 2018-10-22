package behavioural.strategy;

/**
 * This project is a simple application of Strategy Pattern.
 * 
 * 
 * @author jo
 *
 */
public class Main {
	
	ExtractedFeatureOne efo;
	ExtractedFeatureTwo eft;
	
	public Main() {}
		
	public void shared() {
		System.out.println("shared feature");
	}

}
