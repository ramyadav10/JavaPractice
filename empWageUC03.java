package javapractice;

public class empWageUC03{

public static final int IS_FULL_TIME=1;
public static final int IS_PART_TIME=2;

public static void main(String [] args){
	//Calling function to check employee attendance
	empCheck();
}

public static void empCheck(){
	// Generate random number to check present and absent status
	double ranNumber = Math.floor(Math.random() * 10 ) % 3;
	// Calculate employee wage as per attendance
	if(IS_FULL_TIME == ranNumber){
		System.out.println("FullTime");
		final double wage = calculateWage(20, 8);
		System.out.println("Total employee wage is:" + wage);
	}
	else if(IS_PART_TIME == ranNumber){
		System.out.println("PartTime");
		final double wage = calculateWage(20, 4);
		System.out.println("Total employee wage is:" + wage);
	}
	else{
		System.out.println("Absent : 0.0");
	}
}
	//Function for Calculation of Daily wage for present employee
public static double calculateWage(final int ratePerHr, final int hrsPerDay){
	final double cal= ratePerHr*hrsPerDay;
	return cal;
}
}
