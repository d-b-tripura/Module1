package demo.d1;

public class InternationalFlight extends Flight{
	
	public InternationalFlight() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public int calculateCost() {
		arrivalDate();
		arrivalTime();
		internationlTax();
		surcharge = (baseFare/100)*5;
		fuelCost = (baseFare/100)*30;
		finalCost = baseFare + surcharge + fuelCost + internationFlyTax + noonArrivalCharge + holidayCharge;
		return finalCost;
	}

}
