package javapractice;

public class empWageUC06{

public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE_PER_HRS=20;
public static final int NUM_OF_WORKING_DAYS=20;
public static final int MAX_HRS_IN_MONTH=100;

	//Function for Calculation of wages for employee
public static int computeEmpWage(){
	int empHrs= 0, totalEmpHrs=0, totalWorkingDays=0;
	while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
		totalWorkingDays++;
	   // Generate random number to check present and absent status   
	   final int value = (int) Math.floor(Math.random() * 10) % 3;
	   // Switch case function to calculate the wage for employee     
	   	switch(value) {
	      case 1:
	      	empHrs=4;
	         break;
	      case 2:
	         empHrs=8;
	         break;
	      case 3:
	         empHrs=0;
	         break;
	      }
	  	totalEmpHrs+=empHrs;
	   System.out.println("Day#:"+ totalWorkingDays +"Emp Hrs: "+ empHrs);
	}

	int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HRS;
	System.out.println("Total Emp wage ; "+ totalEmpWage);
	return totalEmpWage;
}

public static void main(String [] args){
	//Calling function to calculate employee wages
	computeEmpWage();
}
}
