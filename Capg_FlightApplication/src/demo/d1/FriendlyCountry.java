package demo.d1;

/* No International Flyer Tax on these countries, Considering as Free Travel*/
public class FriendlyCountry {

	public String countries[] =
		{
				"UAE",
				"Nepal",
				"Bhutan",
				"Mauritius",
				"Afganistan",
				"Mangolia",
		};

	public String[] getCountries() {
		return countries;
	}

	public void setCountries(String[] countries) {
		this.countries = countries;
	}
}