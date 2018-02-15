package com.stackroute;

import java.util.Calendar;

public class FirstDayLastDay {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

	    System.out.println(c.get(Calendar.DATE) + "/"+ c.get(Calendar.MONTH)+1 +"/"+c.get(Calendar.YEAR));
	    c.roll(Calendar.DATE, +6);
		System.out.println();
	    System.out.println(c.get(Calendar.DATE) + "/"+ c.get(Calendar.MONTH)+1 +"/"+c.get(Calendar.YEAR));
	}

}
