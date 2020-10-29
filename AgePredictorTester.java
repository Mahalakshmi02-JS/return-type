public class AgePredictorTester{


public static void main(String[] args)
{
	
	System.out.println("JVM invoked main");
	
	String ageInString=args[0];

	byte age=Byte.parseByte(ageInString) ;//type
	AgePredictor.ageDefnition(age);
	
	System.out.println("EXIT :: main");
	
}

}