package practice;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;



public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now = LocalDate.now();
		
        LocalDate born = LocalDate.of(1990,Month.NOVEMBER,26);
        Period period = Period.between(born,now);
        System.out.println("Years: "+period.getYears());
        System.out.println("Months: "+period.getMonths());
        System.out.println("Days: "+period.getDays());
		
	}

}
