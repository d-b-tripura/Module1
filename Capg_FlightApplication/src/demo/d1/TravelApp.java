package demo.d1;

import java.time.LocalDateTime;
import java.util.Scanner;




public class TravelApp {
	
	static Scanner sc = new Scanner(System.in);
	Flight domesticFlightInfo[] = new Flight[1000000];
	Flight internationalFlightInfo[] = new Flight[1000000];// Database or ArrayList or Set or Map
	int index_d = 0;
	int index_f = 0;
	
	public static void main(String[] args) {
		/* Write code to call Flight constructor and Flight class setter methods*/
		
		TravelApp t = new TravelApp();
		
		
		
		while(true) {
			System.out.println("Functionalities:");
			System.out.println("1. Enter Domestic Flight details");
			System.out.println("2. Enter International Flight details");
			System.out.println("3. Retrieve Domestic Flight information");
			System.out.println("4. Retrieve International Flight information");
			System.out.println("5. Show all Domestic flight details");
			System.out.println("6. Show all International flight details");
			System.out.println("7.Exit");
			System.out.println("Enter choice:");
			
			int n = Integer.parseInt(sc.nextLine());
			
			switch(n) {
				case 1:
					t.insertDomesticFlightDetails();
					break;
				case 2:
					t.insertInternationalFlightDetails();
					break;
				case 3:
					System.out.println("Enter flight number: ");
					String flightNumber = sc.nextLine();
					t.findDomesticFlightDetails(flightNumber);
					break;
				case 4:
					System.out.println("Enter flight number: ");
					String flightNum = sc.nextLine();
					t.findInternationalFlightDetails(flightNum);
					break;
				case 5:
					t.displayAllDomestic();
					break;
				case 6:
					t.displayAllInternational();
					break;
				case 7:
					System.exit(0);
			}
		}
		
		
		
	}

	private void findDomesticFlightDetails(String flightNumber) {
		FlightDetails flightDetails = new FlightDetails();
		int flag = 0;
		for(int i = 0; i < index_d; i++) {
			if(domesticFlightInfo[i].getFlightNumber().equals(flightNumber)) {
				flag = 1;
				flightDetails.printDomesticFlightDetails(domesticFlightInfo[i]);
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Flight with that number does not exist");
		}
	}
	
	private void findInternationalFlightDetails(String flightNumber) {
		FlightDetails flightDetails = new FlightDetails();
		int flag = 0;
		for(int i = 0; i < index_f; i++) {
			if(internationalFlightInfo[i].getFlightNumber().equals(flightNumber)) {
				flag = 1;
				flightDetails.printInternationalFlightDetails(internationalFlightInfo[i]);
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Flight with that number does not exist");
		}	
	}

	private void insertDomesticFlightDetails() {
		// TODO Auto-generated method stub
		System.out.println(" Enter Flight number ");
		String flightNumber = sc.nextLine();
		
		System.out.println(" Enter 	airliner Name ");
		String airlinerName = sc.nextLine();
		
		System.out.println(" Enter 	Source Name ");
		String sourceName = sc.nextLine();
		
		System.out.println("Enter departure date and time in the format 'YYYY-MM-DDTHH:MM:SS.ZZZ' :" );
		String s = sc.nextLine();
		LocalDateTime departure = LocalDateTime.parse(s);
	
		System.out.println(" Enter 	Destination Name ");
		String destinationName = sc.nextLine();
		
		System.out.println("Enter Arrival date and time in the format 'YYYY-MM-DDTHH:MM:SS.ZZZ' :" );
		String s1 = sc.nextLine();
		LocalDateTime arrival = LocalDateTime.parse(s1);
		
		System.out.println(" Enter Base Fare ");
		int baseFare = Integer.parseInt(sc.nextLine());
		
		System.out.println("No.of haults:");
		int noOfHaults = Integer.parseInt(sc.nextLine());
		
		Hault hault[] = new Hault[noOfHaults];
		for(int i = 0; i < noOfHaults; i++) {
			String airportName = sc.nextLine();
			int duration = Integer.parseInt(sc.nextLine());
			hault[i] = new Hault(airportName, duration);
		}
		
		DomesticFlight obj = new DomesticFlight();
		obj.setFlightNumber(flightNumber);
		obj.setAirliner(airlinerName);
		obj.setSource(sourceName);
		obj.setFlyDateTime(departure);
		obj.setDestination(destinationName);
		obj.setArrivalDateTime(arrival);
		obj.setBaseFare(baseFare);
		obj.setHault(hault);
		addDomesticFlight(obj);
	}
	
	private void insertInternationalFlightDetails() {
		// TODO Auto-generated method stub
		System.out.println(" Enter Flight number ");
		String flightNumber = sc.nextLine();
		
		System.out.println(" Enter 	airliner Name ");
		String airlinerName = sc.nextLine();
		
		System.out.println(" Enter 	Source Name ");
		String sourceName = sc.nextLine();
		
		System.out.println("Enter departure date and time in the format 'YYYY-MM-DDTHH:MM:SS.ZZZ' :" );
		String s = sc.nextLine();
		LocalDateTime departure = LocalDateTime.parse(s);
	
		System.out.println(" Enter 	Destination Name ");
		String destinationName = sc.nextLine();
		
		System.out.println("Enter Arrival date and time in the format 'YYYY-MM-DDTHH:MM:SS.ZZZ' :" );
		String s1 = sc.nextLine();
		LocalDateTime arrival = LocalDateTime.parse(s1);
		
		System.out.println(" Enter Base Fare ");
		int baseFare = Integer.parseInt(sc.nextLine());
		
		System.out.println("No.of haults:");
		int noOfHaults = Integer.parseInt(sc.nextLine());
		
		Hault hault[] = new Hault[noOfHaults];
		for(int i = 0; i < noOfHaults; i++) {
			String airportName = sc.nextLine();
			int duration = Integer.parseInt(sc.nextLine());
			hault[i] = new Hault(airportName, duration);
		}
		
		InternationalFlight obj = new InternationalFlight();
		obj.setFlightNumber(flightNumber);
		obj.setAirliner(airlinerName);
		obj.setSource(sourceName);
		obj.setFlyDateTime(departure);
		obj.setDestination(destinationName);
		obj.setArrivalDateTime(arrival);
		obj.setBaseFare(baseFare);
		obj.setHault(hault);
		addInternationalFlight(obj);
	}
	
	public boolean addDomesticFlight(Flight flight)
	{
		boolean isInserted = true;
		
		domesticFlightInfo[index_d] = flight;   // SQL Insert Query insert into Car values(....);
		index_d++;
		return isInserted;
	}
	
	public boolean addInternationalFlight(Flight flight)
	{
		boolean isInserted = true;
		
		internationalFlightInfo[index_f] = flight;   // SQL Insert Query insert into Car values(....);
		index_f++;
		return isInserted;
	}

	public void displayAllDomestic() {
		for(int i = 0; i < index_d; i++) {
			System.out.println(" ----- Flight Information ----");
			System.out.println(" Flight Name "+ domesticFlightInfo[i].getAirliner());
			System.out.println(" Flight Number "+ domesticFlightInfo[i].getFlightNumber());
			System.out.println(" Source "+ domesticFlightInfo[i].getSource());
			System.out.println(" Destination "+ domesticFlightInfo[i].getDestination());
			System.out.println(" Base Fare "+ domesticFlightInfo[i].getBaseFare());
		}
	}
	
	public void displayAllInternational() {
		for(int i = 0; i < index_f; i++) {
			System.out.println(" ----- Flight Information ----");
			System.out.println(" Flight Name "+ internationalFlightInfo[i].getAirliner());
			System.out.println(" Flight Number "+ internationalFlightInfo[i].getFlightNumber());
			System.out.println(" Source "+ internationalFlightInfo[i].getSource());
			System.out.println(" Destination "+ internationalFlightInfo[i].getDestination());
			System.out.println(" Base Fare "+ internationalFlightInfo[i].getBaseFare());
		}	
	}
}