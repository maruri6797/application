package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Chapter3_6 {
	public static void main(String[] args) throws Exception {
		LocalDate d1 = LocalDate.of(2021, 10, 10);
		DayOfWeek week = d1.getDayOfWeek();
		String str = week.getDisplayName(TextStyle.SHORT, Locale.getDefault());
		System.out.println(str);
	}
}
