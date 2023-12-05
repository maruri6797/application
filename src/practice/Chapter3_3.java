package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Chapter3_3 {
	public static void main(String[] args) throws Exception {
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(dateTimeFormatter.format(localDateTime));
	}
}
