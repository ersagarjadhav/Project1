package assingment5;

import java.util.Scanner;

public class Placement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int CSE = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ECE = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int MECH = sc.nextInt();
        
        if(CSE==ECE && ECE==MECH && CSE==MECH)
        {
            System.out.println("None of the department has got the highest placement");
        }
        else if(CSE>=0 && ECE>=0 && MECH>=0)
        {
        
            if (MECH>ECE && MECH>CSE)
            {
                System.out.println("Highest placement MECH");
            }
            else if(CSE>MECH && CSE>ECE)
            {
                System.out.println("Highest placement CSE");
            }
            else if(ECE>MECH && ECE>CSE)
            {
                System.out.println("Highest placement ECE");
            }
            else if(ECE==MECH)
            {
                System.out.println("Highest Placement ECE MECH");
            }
            else if(CSE==ECE)
            {
                System.out.println("Highest Placement CSE ECE");
            }
            else if(CSE==MECH)
            {
                System.out.println("Highest Placement CSE MECH");
            }
        }  
        else
        {
            System.out.println("Input is invalid");
        }
    }
}