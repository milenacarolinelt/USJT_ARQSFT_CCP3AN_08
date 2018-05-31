package br.com.usjt.strategy.dayweek;

import java.util.Date;

public class TestDayWeek {
	public static void main(String[] args) {
		DayWeekFormatter dayWeekFormatter = new DayWeekFormatter();
		dayWeekFormatter.format(new Date(), "Milena");
	}
}
