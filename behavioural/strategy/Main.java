package behavioural.strategy;

/**
 * This project is a simple application of Strategy Pattern.
 * 
 * 
 * @author jo
 *
 */
public class Main {
	//TODO - design 2 child classes and demonstrate runtime 
	// behaviour change
	
	
	private ExtractedFeatureOne efo;
	private ExtractedFeatureTwo eft;
	
	public Main() {
		efo = new FeatureOneWrapper();
		eft = new FeatureTwoWrapper();
	}
	
	public ExtractedFeatureOne getEfo() {
		return efo;
	}



	public void setEfo(ExtractedFeatureOne efo) {
		this.efo = efo;
	}



	public ExtractedFeatureTwo getEft() {
		return eft;
	}



	public void shared() {
		System.out.println("shared feature");
	}

}
