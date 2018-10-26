package behavioural.strategy.lambda_version;

import java.util.Arrays;
import java.util.List;

/**
 * This project is a simple application of Strategy Pattern.
 * Lambda expressions is applied in order to simplify design.
 * No defensive code in order to maximize readability.
 * 
 * 
 * @author jo
 *
 */
public class Main {
	
	List<Feature> featuresA = Arrays.asList(
			() -> System.out.println("feature 1.0"),
			() -> System.out.println("feature 1.1")
			);
	List<Feature> featuresB = Arrays.asList(
			() -> System.out.println("feature 2.0")
			);
			
	public void shared() {
		System.out.println("shared feature");
	}

}
