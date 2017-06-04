package pl.lhsystems.successFactors.Utils;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtils {

	public static String getTodayDate(String format){
		 DateTime dateTime = new DateTime();
		 DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);
		 return dateTimeFormatter.print(dateTime);
	}
	
	public static String getUTCTimestamp(){
		String format = "yyyyMMddHHmmss.SSS";
		DateTime dateTime = new DateTime(DateTimeZone.UTC);
		DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);
		return dateTimeFormatter.print(dateTime);
	}
}
