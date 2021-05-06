package day8;
import java.time.LocalDateTime;
import java.util.Scanner;




public class TravelApp {
	
	static Scanner sc = new Scanner(System.in);
	Flight flightInfo[] = new Flight[1000000];   // Database or ArrayList or Set or Map
	int index = 0;
	
	public static void main(String[] args) {
		/* Write code to call Flight constructor and Flight class setter methods*/
		
		TravelApp t = new TravelApp();
		
		
		
		while(true) {
			System.out.println("Functionalities:");
			System.out.println("1. Enter Flight details");
			System.out.println("2. Retrieve Flight information");
			System.out.println("3. Show all flight details");
			System.out.println("4.Exit");
			System.out.println("Enter choice:");
			
			int n = Integer.parseInt(sc.nextLine());
			
			switch(n) {
				case 1:
					t.insertFlightDetails();
					break;
				case 2:
					System.out.println("Enter flight number: ");
					String flightNumber = sc.nextLine();
					t.findFlightDetails(flightNumber);
					break;
				case 3:
					t.displayAll();
					break;
				case 4:
					System.exit(0);
			}
		}
		
		
		
	}

	private void findFlightDetails(String flightNumber) {
		FlightDetails flightDetails = new FlightDetails();
		int flag = 0;
		for(int i = 0; i < index; i++) {
			if(flightInfo[i].getFlightNumber().equals(flightNumber)) {
				flag = 1;
				flightDetails.printFlightDetails(flightInfo[i]);
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Flight with that number does not exist");
		}
		
	}

	private void insertFlightDetails() {
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
		
		System.out.println(" Enter 'true' if fly type is international or enter 'false':");
		Boolean flyType = Boolean.parseBoolean(sc.nextLine());
		
		System.out.println("No.of haults:");
		int noOfHaults = Integer.parseInt(sc.nextLine());
		
		Hault hault[] = new Hault[noOfHaults];
		for(int i = 0; i < noOfHaults; i++) {
			String airportName = sc.nextLine();
			int duration = Integer.parseInt(sc.nextLine());
			hault[i] = new Hault(airportName, duration);
		}
		
		Flight obj = new Flight();
		obj.setFlightNumber(flightNumber);
		obj.setAirliner(airlinerName);
		obj.setSource(sourceName);
		obj.setFlyDateTime(departure);
		obj.setDestination(destinationName);
		obj.setArrivalDateTime(arrival);
		obj.setFlyType(flyType);
		obj.setBaseFare(baseFare);
		obj.setHault(hault);
		addFlight(obj);
	}
	
	public boolean addFlight(Flight flight)
	{
		boolean isInserted = true;
		
		flightInfo[index] = flight;   // SQL Insert Query insert into Car values(....);
		index++;
		return isInserted;
	}

	public void displayAll() {
		for(int i = 0; i < index; i++) {
			System.out.println(" ----- Flight Information ----");
			System.out.println(" Flight Name "+ flightInfo[i].getAirliner());
			System.out.println(" Flight Number "+ flightInfo[i].getFlightNumber());
			System.out.println(" Source "+ flightInfo[i].getSource());
			System.out.println(" Destination "+ flightInfo[i].getDestination());
			System.out.println(" Base Fare "+ flightInfo[i].getBaseFare());
		}
		
	}
}