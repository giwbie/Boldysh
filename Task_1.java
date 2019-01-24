public class NextDate {

      public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = 6;
        int y = x++;
        System.out.println("Y=" + y + " x: " + x);

        System.out.println(">>> Enter the YEAR: ");
        int year = reader.nextInt();

        System.out.println(">>> Enter the MONTH (1-12)");
        int month = reader.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("!!!!!!!!! Entered month in INCORRECT. Program STOPPED");
            return;
        }

        int monthNumDays = getMonthNumDays(year, month);

        System.out.println(">>> Enter the day of month (1-" + monthNumDays + "):");
        int day = reader.nextInt();
        if (day < 1 || day > monthNumDays) {
            System.out.println(
                "!!!!!!!!! Entered day in INCORRECT. Day of month should be 1-" + monthNumDays + ". Program  STOPPED");
            return;
        }

        String nextDate = getNextDate(year, month, day, monthNumDays);
        System.out.println("Entered date: " + day + "." + month + "." + year + ". Next date => " + nextDate);
    }

    private static int getMonthNumDays(int year, int month) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) { // Leap year
                    return 29;
                }
                return 28;
            default:
                return 31;
        }
    }

    private static String getNextDate(int year, int month, int day, int monthNumDays) {
        if (day == monthNumDays) {
            if (month == 12) {
                return "1.1." + (year + 1);
            }
            return "1." + (month + 1) + "." + year;
        }
        return (day + 1) + "." + month + "." + year;
    }
}
