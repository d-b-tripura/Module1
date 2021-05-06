  package demo.d1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Flight {

	protected String flightNumber;

	protected String airliner;
	
	protected String source;
	protected LocalDateTime flyDateTime;
	
	protected String destination;
	protected LocalDateTime arrivalDateTime;
	
	protected Hault[] hault; // can be null; 
	protected int baseFare; // always include 5% as airport surcharge and 30% as fuel cost
	protected int holidayCharge;
	protected int noonArrivalCharge;
	protected int surcharge;
	protected int fuelCost;
	protected int finalCost;// based on Airliner calendar and other criteria's 
	protected int internationFlyTax;

	
	
	
	public Flight() {
		super();
	}

	public int getInternationFlyTax() {
		return internationFlyTax;
	}

	public void setInternationFlyTax(int internationFlyTax) {
		this.internationFlyTax = internationFlyTax;
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
	
	public void arrivalDate() {
		// TODO Auto-generated method stub
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
		LocalDate arTime = arrivalDateTime.toLocalDate();
		AirlinerCalendar ac = new AirlinerCalendar();
		for(LocalDate lh : ac.getListOfHolidays()) {
			if(lh.isAfter(arTime.minusDays(11)) && lh.isBefore(arTime.minusDays(1))) {
				holidayCharge = (baseFare/100)*20;
				break;
			} else if(lh.isAfter(arTime.minusDays(2)) && lh.isBefore(arTime.plusDays(1))) {
				holidayCharge = (baseFare/100)*50;
				break;
			} else {
				holidayCharge = 0;
			}
		}
	}
	
	public void arrivalTime() {
		LocalTime noon = LocalTime.of(12, 00, 00, 0);
		LocalTime arrTime = arrivalDateTime.toLocalTime();
		if(arrTime.isAfter(noon.minusMinutes(120)) && arrTime.isBefore(noon.plusMinutes(120))) {
			noonArrivalCharge = (baseFare/100)*10;
		} else {
			noonArrivalCharge = 0;
		}
	}
	
	public void internationlTax() {
		FriendlyCountry fc = new FriendlyCountry();
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
		surcharge = (baseFare/100)*5;
		fuelCost = (baseFare/100)*30;
	}
	
	public abstract int calculateCost();
	
}