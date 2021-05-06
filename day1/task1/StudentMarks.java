package day1.task1;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int englishMarks = 98;
		int java = 85;
		int db = 70;
		int springTools = 75;
		int totalMarks = englishMarks + java + db + springTools;
		float avgMarks = totalMarks/4;
		System.out.println("Total Marks:" + totalMarks);
		System.out.println("Average Marks:" + avgMarks);
	}

}
