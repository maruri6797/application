package practice;

import java.sql.Date;

public class Chapter3_1 {
	public static void main(String[] args) {
		Date now = new Date(0);
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(163484397000L);
		System.out.println(past);
	}
}
