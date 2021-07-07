package javapractice;

public class empWageUC04{

public static final int IS_FULL_TIME=1;
public static final int IS_PART_TIME=2;
public static double wage;

public static void main(String [] args){
	//Calling function to check employee attendance
   empCheck();
}

public static void empCheck(){
	// Generate random number to check present and absent status
   int ranNumber =(int) (Math.floor(Math.random() * 10 ) % 3);
   // Switch case function to calculate the wage for employee
	switch (ranNumber){
	case 1:
		System.out.println("FullTime");
      wage = calculateWage(20, 8);
      System.out.println(wage);
   break;
   case 2:
      System.out.println("PartTime");
      wage = calculateWage(20, 4);
      System.out.println(wage);
   break;
   default:
      System.out.println("Absent");
   break;
}
}

//Function for Calculation of Daily wage for present employee
public static double calculateWage(final double ratePerHrs, final double totalHrs){
   final double cal= ratePerHrs*totalHrs;
   return cal;
}
}
