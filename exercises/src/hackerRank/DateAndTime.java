package hackerRank;

import java.util.Calendar;

public class DateAndTime {

	public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        int dayNum = cal.get(Calendar.DAY_OF_WEEK); 
        String dayStr = "";
        
        switch(dayNum) {
            case 1:
                dayStr = "SUNDAY";
                break;
            case 2:
                dayStr = "MONDAY";
                break;
            case 3:
                dayStr = "TUESDAY";
                break;
            case 4:
                dayStr = "WEDNESDAY";
                break;
            case 5:
                dayStr = "THURSDAY";
                break;
            case 6:
                dayStr = "FRIDAY";
                break;
            case 7:
                dayStr = "SATURDAY";
                break;   
        }
        return dayStr;
    } 
	
	public static void main(String[] args) {
		int year = 2015;
		int month = 8;
		int day = 5;
		
		String dayStr = findDay(month,day,year);
		System.out.println(dayStr);
	}

}
