package demo.d1;

public class DomesticFlight extends Flight{
	
	public DomesticFlight() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateCost() {
		arrivalDate();
		arrivalTime();
		surcharge = (baseFare/100)*5;
		fuelCost = (baseFare/100)*30;
		finalCost = baseFare + surcharge + fuelCost + noonArrivalCharge + holidayCharge;
		return finalCost;
	}

}
