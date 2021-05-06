package day8;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Flight {

	private String flightNumber;

	private String airliner;
	
	private String source;
	private LocalDateTime flyDateTime;
	
	private String destination;
	private LocalDateTime arrivalDateTime;
	
	private Hault[] hault; // can be null;
	
	private boolean flyType; // domestic (false) or international(true)
	
	private int internationFlyTax; 
	private int baseFare; // always include 5% as airport surcharge and 30% as fuel cost
	private int holidayCharge;
	private int noonArrivalCharge;
	private int surcharge;
	private int fuelCost;
	private int finalCost;// based on Airliner calendar and other criteria's 
	
	
	public Flight(String flightNumber, String airliner, String source, LocalDateTime flyDateTime, String destination,
			LocalDateTime arrivalDateTime, boolean flyType, int baseFare) {
		super();
		this.flightNumber = flightNumber;
		this.airliner = airliner;
		this.source = source;
		this.flyDateTime = flyDateTime;
		this.destination = destination;
		this.arrivalDateTime = arrivalDateTime;
		//this.hault = hault;
		this.flyType = flyType;
		this.baseFare = baseFare;
	}


	public Flight() {
		// TODO Auto-generated constructor stub
	}


	public int getSurcharge() {
		return surcharge;
	}


	public void setSurcharge(int surcharge) {
		this.surcharge = surcharge;
	}


	public int getFuelCost() {
		return fuelCost;
	}


	public void setFuelCost(int fuelCost) {
		this.fuelCost = fuelCost;
	}

	
	public int getHolidayCharge() {
		return holidayCharge;
	}


	public void setHolidayCharge(int holidayCharge) {
		this.holidayCharge = holidayCharge;
	}
	
	public int getNoonArrivalCharge() {
		return noonArrivalCharge;
	}


	public void setNoonArrivalCharge(int noonArrivalCharge) {
		this.noonArrivalCharge = noonArrivalCharge;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getAirliner() {
		return airliner;
	}


	public void setAirliner(String airliner) {
		this.airliner = airliner;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public LocalDateTime getFlyDateTime() {
		return flyDateTime;
	}


	public void setFlyDateTime(LocalDateTime flyDateTime) {
		this.flyDateTime = flyDateTime;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}


	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}


	public Hault[] getHault() {
		return hault;
	}


	public void setHault(Hault[] hault) {
		this.hault = hault;
	}


	public boolean isFlyType() {
		return flyType;
	}


	public void setFlyType(boolean flyType) {
		this.flyType = flyType;
	}


	public int getInternationFlyTax() {
		return internationFlyTax;
	}


	public void setInternationFlyTax(int internationFlyTax) {
		this.internationFlyTax = internationFlyTax;
	}


	public int getBaseFare() {
		return baseFare;
	}


	public void setBaseFare(int baseFare) {
		this.baseFare = baseFare;
	}


	public int getFinalCost() {
		return finalCost;
	}


	public void setFinalCost(int finalCost) {
		this.finalCost = finalCost;
	}
	
	public int calculateCost()
	{
		/*
		 * Cost of the flight will be decided by 
		 * 1. arrival date. :-
		 * 		1.a)  If 10 to 2 days prior to the AirlinerCalendar Date	 :- 20% extra
		 * 		1.b)  If 1 to 0 day prior to the AirlinerCalendar Date 	:-  50% extra	
		 * 2. arrival time.
		 * 		2.a) If flight land time is 2 hr +/- to 12:00 Noon (Any Date)	:- 10% extra
		 * 3. Non free travel countries (List of FriendlyCountry.java)
		 * 		3.a) If destination belongs to non free travel, friendly country :- 30% extra
		 * */
		LocalDate depTime = flyDateTime.toLocalDate();
		AirlinerCalendar ac = new AirlinerCalendar();
		for(LocalDate lh : ac.getListOfHolidays()) {
			if(lh.isAfter(depTime.minusDays(11)) && lh.isBefore(depTime.minusDays(1))) {
				holidayCharge = (baseFare/100)*20;
				break;
			} else if(lh.isAfter(depTime.minusDays(2)) && lh.isBefore(depTime.plusDays(1))) {
				holidayCharge = (baseFare/100)*50;
				break;
			} else {
				holidayCharge = 0;
			}
		}
		LocalTime noon = LocalTime.of(12, 00, 00, 0);
		LocalTime arrTime = arrivalDateTime.toLocalTime();
		if(arrTime.isAfter(noon.minusMinutes(120)) && arrTime.isBefore(noon.plusMinutes(120))) {
			noonArrivalCharge = (baseFare/100)*10;
		} else {
			noonArrivalCharge = 0;
		}
		FriendlyCountry fc = new FriendlyCountry();
		if(isFlyType()) {
			int flag = 1;
			for(String c : fc.getCountries()) {
				if(destination.equals(c)) {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				internationFlyTax = (baseFare/100)*30;
			} else {
				internationFlyTax = 0;
			}
		}
		surcharge = (baseFare/100)*5;
		fuelCost = (baseFare/100)*30;
		finalCost = baseFare + surcharge + fuelCost + internationFlyTax + noonArrivalCharge + holidayCharge;
		return finalCost;
	}
	
}