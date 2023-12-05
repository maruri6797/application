package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Chapter3_2 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d = f.parse("2021/10/23 01:23:45");
		System.out.println(d);
		Date now = new Date();
		String s = f.format(now);
		System.out.println(s);
	}
}
