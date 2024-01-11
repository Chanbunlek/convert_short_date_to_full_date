import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Convert_Date {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        String shortDate;
        String month[] = { 
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        };

        System.out.print( "Enter a short date in format YYYY-MM-DD : " );
        shortDate = scanner.nextLine();

        String sliter[] = shortDate.split( "-" );

        System.out.println( month[ Integer.parseInt( sliter[1] ) - 1 ] + " " + sliter[2] + ", " + sliter[0] );
    }
}