package stepDefinations.examPortalSteps;

import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import pageBucket.PageReferences;

public class RegistrationPageStepDef extends PageReferences {

	@Then("User gets redirected to register page")
	public void user_gets_redirected_to_register_page() {

	}

	@Then("User fills registration form with details")
	public void user_fills_registration_form_with_details(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

	}

	@Then("clicks on Register button")
	public void clicks_on_register_button() {

	}

	@Then("Registeration gets successful and alerts is displayed with user ID")
	public void registeration_gets_successful_and_alerts_is_displayed_with_user_id() {

	}

}