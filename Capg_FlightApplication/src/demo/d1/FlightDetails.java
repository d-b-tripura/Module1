package demo.d1;

public class FlightDetails {
	
	public void printDomesticFlightDetails(Flight flight)
	{
		/* Write code to print the flight information and fare break up*/
		System.out.println("Flight number:" + flight.getFlightNumber());
		System.out.println("Airliner name:" + flight.getAirliner());
		System.out.println("Flight Departure place:" + flight.getSource());
		System.out.println("Flight Arrival Place:" + flight.getDestination());
		System.out.println("Flight Departure date and time:" + flight.getFlyDateTime());
		System.out.println("Flight Arrival date and time:" + flight.getArrivalDateTime());
		System.out.println();
		System.out.println("-----------------Hault Locations and Durations----------------");
		for(Hault h : flight.getHault()) {
			System.out.println("Hault Airport: " + h.getAirportName());
			System.out.println("Hault Durstion: " + h.getDuration() + " hrs");
		}
		System.out.println("-----------------Fare Breakup---------------------");
		System.out.println();
		flight.calculateCost();
		System.out.println("Flight Base Fare:" + flight.getBaseFare());
		System.out.println("Flight Fuel Cost:" + flight.getFuelCost());
		System.out.println("Flight Holiday Charges:" + flight.getHolidayCharge());
		System.out.println("Flight Noon Arrival Charge:" + flight.getNoonArrivalCharge());
		System.out.println("Airport Surcharge:" + flight.getSurcharge());
		System.out.println("Flight Final cost:" + flight.getFinalCost());
	}

	public void printInternationalFlightDetails(Flight flight)
	{
		/* Write code to print the flight information and fare break up*/
		System.out.println("Flight number:" + flight.getFlightNumber());
		System.out.println("Airliner name:" + flight.getAirliner());
		System.out.println("Flight Departure place:" + flight.getSource());
		System.out.println("Flight Arrival Place:" + flight.getDestination());
		System.out.println("Flight Departure date and time:" + flight.getFlyDateTime());
		System.out.println("Flight Arrival date and time:" + flight.getArrivalDateTime());
		System.out.println();
		System.out.println("-----------------Hault Locations and Durations----------------");
		for(Hault h : flight.getHault()) {
			System.out.println("Hault Airport: " + h.getAirportName());
			System.out.println("Hault Durstion: " + h.getDuration() + " hrs");
		}
		System.out.println("-----------------Fare Breakup---------------------");
		System.out.println();
		flight.calculateCost();
		System.out.println("Flight Base Fare:" + flight.getBaseFare());
		System.out.println("Flight Fuel Cost:" + flight.getFuelCost());
		System.out.println("Flight Holiday Charges:" + flight.getHolidayCharge());
		System.out.println("Flight International Fly Tax:" + flight.getInternationFlyTax());
		System.out.println("Flight Noon Arrival Charge:" + flight.getNoonArrivalCharge());
		System.out.println("Airport Surcharge:" + flight.getSurcharge());
		System.out.println("Flight Final cost:" + flight.getFinalCost());
	}
}