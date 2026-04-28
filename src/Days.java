public class Days {
    public static void main() {
       int days = 5000;
       int years = days / 365;
       int month = (days % 365) / 31;
       int leftDays = days - years * 365 - month * 31;
       System.out.println("total number of days " + days);
       System.out.println("Total years: " + years);
       System.out.println("Total months: " + month);
       System.out.println("Total days: " + leftDays);
    }
}
