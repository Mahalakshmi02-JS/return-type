public class Age{
	public static String AgeDefnition(int age)
	{
		System.out.println("AgeDefnition invoked");
	 System.out.println("Age= "+age);

		if(age>1 && age<=4){
		System.out.println("Age= "+age);

		System.out.println("Child");
		return "Child";
		}
		if(age>4 && age<=12){
			System.out.println("Kid");
			return "Kid";
		}
		if(age>12 && age<=19){
			System.out.println("Teen");
			return "Teen";
		}
		if(age>19 && age<=50){
			System.out.println("Adult");
			return "Adult";
		}
		if(age>50 && age<=100){
			System.out.println("Old");
			return "Old";
		}
		return "dead";
	}
}
