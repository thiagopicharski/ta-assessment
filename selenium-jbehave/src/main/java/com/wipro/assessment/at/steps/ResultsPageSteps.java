package com.wipro.assessment.at.steps;

import static org.junit.Assert.assertEquals;

import com.wipro.assessment.at.pages.ResultsPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResultsPageSteps extends AbstractSteps {
	
	@Autowired
	private ResultsPage resultsPage;
	
	@Then("I should see first result as '$firstResult'")
	public void IShouldSeeFirstResultAs(@Named("firstResult") String titleExpected) {
		assertEquals(titleExpected, resultsPage.firstResultText());
	}
	
}
