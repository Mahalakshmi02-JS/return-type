public class ProgressCard{
	public static String report(double percentage)
	{
		System.out.println("report invoked");
		System.out.println("percentage = "+percentage);
		if(percentage>90 && percentage<=100){
			System.out.println("Grade A+");
			return "Grade A+";
		}
		if(percentage>80 && percentage<=90){
			System.out.println("Grade B");
			return "Grade B";
		}
		if(percentage>65 && percentage<=80){
			System.out.println("Grade C");
			return "Grade C";
		}
		if(percentage>45 && percentage<=65){
			System.out.println("Grade D");
			return "Grade D";
		}
		if(percentage>30 && percentage<45){
			System.out.println("Grade E");
			return "Grade E";
		}
		if(percentage<30){
			System.out.println("Fail");
			return "Fail";
		}
		System.out.println("No Match");

		return "No Match";
	}
}
