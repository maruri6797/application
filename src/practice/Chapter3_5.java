package practice;

import java.time.LocalDate;
import java.time.Period;

public class Chapter3_5 {
	public static void main(String[] args) throws Exception {
		LocalDate d1 = LocalDate.of(2021, 10, 10);
		LocalDate d2 = LocalDate.of(2021, 10, 13);
		
		Period p1 = Period.between(d1, d2);
		System.out.println(p1);
		LocalDate d3 = d2.plus(p1);
		System.out.println(d3);
	}
}
