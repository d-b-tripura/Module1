package collections;
import day8.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CollectionList {
	Scanner sc = new Scanner(System.in);
	public void flightList() {
		List<Flight> flist = new ArrayList<>();
		
		flist.add(new Flight("AS780912", "Sara airlines", "Mumbai", LocalDateTime.parse("2021-04-11T10:00:00"), "Delhi", LocalDateTime.parse("2021-05-16T12:00:00"), true, 20000));
		flist.add(new Flight("BHYJIK12", "VPR airlines", "Delhi", LocalDateTime.parse("2021-05-12T10:00:00"), "Goa", LocalDateTime.parse("2021-05-16T12:00:00"), false, 10000));
		flist.add(new Flight("AS780865", "HLR airlines", "Hyderabad", LocalDateTime.parse("2021-05-12T10:00:00"), "Tamilnadu", LocalDateTime.parse("2021-05-16T12:00:00"), false, 25000));
		flist.add(new Flight("GJ780912", "RSA airlines", "Deheradhun", LocalDateTime.parse("2021-05-12T10:00:00"), "China", LocalDateTime.parse("2021-05-16T12:00:00"), true, 30000));
		flist.add(new Flight("MO780912", "QWT airlines", "Banglore", LocalDateTime.parse("2021-05-12T10:00:00"), "Quwait", LocalDateTime.parse("2021-05-16T12:00:00"), true, 40000));
		
		
		
		
		for(Flight fl : flist) {
			System.out.println(fl.getFlightNumber() + " " + fl.getAirliner() + " " + fl.getSource() + " " + fl.getDestination());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectionList cl = new CollectionList();
		cl.flightList();
	
	}

}
