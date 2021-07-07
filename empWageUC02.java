package javapractice;


public class empWageUC02{

public static final int IS_PRESENT=1;

public static void main(String [] args){
		//Calling function to check employee attendance
		empCheck();
}

public static void empCheck(){
	// Generate random number to check present and absent status
	double ranNumber = Math.floor(Math.random() * 10 ) % 3;
	// Calculate if employee is present
	if(IS_PRESENT == ranNumber){
		System.out.println("Present");
		final double wage = calculateWage(20, 8);
		System.out.println("Total employee wage is:" + wage);
	}else{
		System.out.println("Absent : 0.0");
		}
}
	//Function for Calclation of Daily wage for present employee
public static double calculateWage(final int ratePerHr, final int hrsPerDay){
	final double cal= ratePerHr*hrsPerDay;
	return cal;
}
}

