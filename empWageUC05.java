package javapractice;

public class empWageUC05{

public static final int IS_FULL_TIME=1;
public static final int IS_PART_TIME=2;
private static final int days=20;
public static double totalEarn=0;
public static double wage=0;

public static void main(String [] args){
	//Calling function to check employee attendance
   empCheck();
   System.out.println("Total Employee Wage :" + totalEarn);
}

public static void empCheck(){
	//Using a loop function to calculate wages for month
   for (int i=1; i <= days; i++){
	// Generate random number to check present and absent status
   int ranNumber =(int) (Math.floor(Math.random() * 10 ) % 3);
// Switch case function to calculate the wage for employee 
      switch (ranNumber){
      case 1:
         System.out.println("FullTime");
         wage = calculateWage(20, 8);
         totalEarn = totalEarn + wage ;
      	break;
      case 2:
         System.out.println("PartTime");
         wage = calculateWage(20, 4);
         totalEarn = totalEarn + wage ;
         break;
    	default:
         System.out.println("Absent");
         break;

}
}
}
//Function for Calculation of Daily wage for present employee
public static double calculateWage(final double ratePerHrs, final double totalHrs){
   final double cal= ratePerHrs*totalHrs;
   return cal;
}
}
