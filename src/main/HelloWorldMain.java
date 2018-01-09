package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorldMain {
	
	public Date parseDate(String dateTarget) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'+'HH:mm");
		Date parsedDate = dateFormat.parse(dateTarget);
		return parsedDate;
	}

	public static void main(String[] args) throws ParseException {
		HelloWorldMain hwm = new HelloWorldMain();
		EmptyClass emptyClassObj = new EmptyClass();
		System.out.println(hwm.parseDate("2017-10-26T07:34:57.213228+00:00"));
		
		
		String test = ": here are some changes";
		System.out.println("Hello World "+test);
		
		String randomString = "qwgsudkjfgkleavnlsdkb uilsabvklsd";
		System.out.println(randomString);
		
		System.out.println(emptyClassObj.syso());
	}
}
