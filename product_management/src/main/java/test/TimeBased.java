//package test;
//
//import java.time.DayOfWeek;
//import java.time.LocalDate;
//import java.util.Arrays;
//import java.util.List;
//
//public class TimeBased {
//
//
//	static boolean checkWorkDay(List<String> holiday,LocalDate date)
//	{
//	
//	return  holiday.stream().anyMatch(dates-> LocalDate.parse(dates).isEqual(date));
//
//	}
//
//	
//	public static void main(String[] args) {
//
//
//		String holiday[]= {"2001-01-26", "2001-08-15", "2002-01-24", "2002-08-12", "2003-01-26", "2003-08-11", "2004-01-26", "2004-08-09", "2005-01-26", "2005-08-10", "2006-01-26", "2006-08-11", "2007-01-26", "2007-08-15", "2008-01-26", "2008-08-08", "2009-01-26", "2009-08-17", "2010-01-26", "2010-08-09", "2011-01-26", "2011-08-08", "2012-01-26", "2012-08-15", "2013-01-26", "2013-08-10", "2014-01-26", "2014-08-19", "2015-01-26", "2015-08-17", "2016-01-26", "2016-08-09", "2017-01-26", "2017-08-15", "2018-01-26", "2018-08-10", "2019-01-26", "2019-08-15", "2020-01-26", "2020-08-11", "2021-01-26", "2021-08-09", "2022-01-26", "2022-08-15", "2023-01-26", "2023-08-11", "2024-01-26", "2024-08-19"};
//	
//		LocalDate date = LocalDate.parse("2001-12-19");
//
//		LocalDate date1 = LocalDate.now();
//
//		long diffdays = 0;
//
//		long leapYears = 0;
//
//		long year = date.getYear();
//
//        long totalWorkDays =0;
//        
//		long weekDays=0;
//	    long weekEnds=0;
//	    
//	    long summerBreaks = 600;
//	    
//		while (!date1.isEqual(date)) {
//			diffdays++;
//	
//			if(date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek()!= DayOfWeek.SUNDAY)
//			{
//			 weekDays++;
//			}
//			if(date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek()!= DayOfWeek.SUNDAY && !TimeBased.checkWorkDay(Arrays.asList(holiday), date))
//			{
//			 totalWorkDays++;
//			}
//			else
//			{
//			 weekEnds++;
//			}
//			
//			date = date.plusDays(1);
//			long newYear = date.getYear();
//		
//			
//			if (newYear > year) {
//				if ((date.isLeapYear())) {
//					leapYears++;
//				}
//				year = newYear;
//			}
//		}
//		
//
//		long diffMonths = diffdays / 12;
//
//	 	long diffenceInYears = diffdays / 365;
//	 	
//		System.out.println("Age in Days: "+diffdays);
//	 	
//		System.out.println("Age in Month: "+diffMonths);
//
//		System.out.println("Age:" + diffenceInYears);
//
//		System.out.println("LeapYear: "+leapYears);
//
//        System.out.println("Weekdays: "+weekDays);
//    
//	    System.out.println("Weekends: "+weekEnds);
//	   
//	    System.out.println("Worked For Without SummerBreaks: "+totalWorkDays);
//	
//	    System.out.println("Worked For:" + (totalWorkDays-summerBreaks));
//	}
//	
//
//}