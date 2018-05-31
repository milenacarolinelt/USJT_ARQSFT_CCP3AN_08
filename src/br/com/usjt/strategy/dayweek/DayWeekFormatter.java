package br.com.usjt.strategy.dayweek;

import java.util.Calendar;
import java.util.Date;

public class DayWeekFormatter {
	
	public void format(Date date, String text) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		DayWeek dayWeek = null;
		switch (dayOfWeek) {
		case 1: 
			dayWeek = new Domingo();
			break;
		case 2: 
			dayWeek = new Segunda();
			break;
		case 3: 
			dayWeek = new Terca();
			break;
		case 4: 
			dayWeek = new Quarta();
			break;
		case 5: 
			dayWeek = new Quinta();
			break;
		case 6: 
			dayWeek = new Sexta();
			break;
		case 7: 
			dayWeek = new Sabado();
			break;
		}
		dayWeek.day(text);
	}
}
