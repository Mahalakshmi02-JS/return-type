public class Swap{
public static void main(String[] zoom){
	System.out.println("JVM invokes main");
		System.out.println("Program will change string to number");
   String weight="35.36";
	float valueOfWeight=Float.parseFloat(weight);
	System.out.println("Weight is :" +valueOfWeight);
	
	String alphabets="26";
	byte convertedAlphabet=Byte.parseByte(alphabets);
	System.out.println("convertedAlphabet :" +convertedAlphabet);
	
	String adharNo ="526987502412";
	long convertedadharNo=Long.parseLong(adharNo);
	System.out.println("convertedadharNo :" +convertedadharNo);
	
	String bonesInHumanBody ="206";
	short convertedBonesInHumanBody=Short.parseShort(bonesInHumanBody);
	System.out.println("convertedBonesInHumanBody :" +convertedBonesInHumanBody);
	
	String areaOfIndianOcean ="73426000";
	int convertedAreaOfIndianOcean=Integer.parseInt(areaOfIndianOcean);
	System.out.println("convertedAreaOfIndianOcean :" +convertedAreaOfIndianOcean);
		
	String ValueOfPermitivity ="8.854187817";
	double convertedValueOfPermitivity=Double.parseDouble(ValueOfPermitivity);
	System.out.println("convertedValueOfPermitivity :" +convertedValueOfPermitivity);
}
}