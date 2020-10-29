public class Report{
	public static void main(String[] marks){
		System.out.println("JVM invoked main method");
		
		String marksInString=marks[0];
		
		float percentage=Float.parseFloat(marksInString);
		
		String score=ProgressCard.report(percentage);
		
        System.out.println("EXIT:: main");

	}
}