package javapractice;
public class empCheck {

public static final int IS_FULL_TIME=1;
public static void main(String [] args){
	//Calling function to check employee attanance
	empCheck();
}

public static void empCheck(){
	// Generate random number to check present and absent status
	double ranNumber = Math.floor(Math.random() * 10) % 2;
	// Check the employee status
	if(IS_FULL_TIME == ranNumber){
		System.out.println("Present");
	}else{
		System.out.println("Absent");
	}
}
}



