package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Chapter3_Ex {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now().withDayOfMonth(1);
		int lastday = d.lengthOfMonth();
		for (int i = 1; i < lastday; i++) {
			DayOfWeek w = d.getDayOfWeek();
			String str = w.getDisplayName(TextStyle.SHORT, Locale.getDefault());
			System.out.print(d.getDayOfMonth() + " (" + str + ") ");
			if (w == DayOfWeek.SATURDAY) {
				System.out.println();
			}
			d = d.plusDays(1);
		}
	}
}
