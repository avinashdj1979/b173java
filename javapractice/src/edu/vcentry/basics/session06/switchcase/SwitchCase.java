package edu.vcentry.basics.session06.switchcase;

public class SwitchCase {

	public static void main(String[] args) {
			
		String month = "May";
		int days = 0;
		
		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			days = 31;
			break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			days = 30;
			break;
		case "Feb":
			days = 28;
			break;
		default:
			days = 0;
			break;
		}
		
		if(days > 0) {
			System.out.printf("%s has %d days\n", month, days);
		} else {
			System.out.println("Invalid Month");
		}
		

	}

}
/*
		if(month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
				|| month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
			days = 31;
		} else if (month.equals("Apr") || month.equals("June") || month.equals("Sep") || month.equals("Nov")) {
			days = 30;
		} else if (month.equals("Feb")) {
			days = 28;
		} 
		
		if(days > 0) {
			System.out.printf("%s has %d days\n", month, days);
		} else {
			System.out.println("Invalid Month");
		}
*/