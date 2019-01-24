package HomeTask_Lesson_2;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

        if (day > 31 || day < 1 || month > 12 || month < 1) {
            System.out.println("Information incorrect");
        } else if (month == 2 && day >= 30) {
            System.out.println("Information incorrect");
        } else if ((month == 4 && day > 30) || (month == 6 && day == 30)) {
            System.out.println("Information incorrect");
        } else if ((month == 9 && day > 30) || (month == 11 && day > 30)) {
            System.out.println("Information incorrect");
        } else {
            System.out.println(izFollowDay(day, month, year));
        }
    }

    public static int izLeapYear(int year) {
        int maxDayMonthTwo;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            maxDayMonthTwo = 29;
        } else {
            maxDayMonthTwo = 28;
        }
        return maxDayMonthTwo;
    }

    public static int izMaxDayMonth(int month, int year) {
        int maxDayMonth;
        if (month == 2) {
            maxDayMonth = izLeapYear(year);
        } else if (month == 3 || month == 6 || month == 9 || month == 11) {
            maxDayMonth = 30;
        } else {
            maxDayMonth = 31;
        }
        return maxDayMonth;
    }

    public static String izFollowDay(int day, int month, int year) {
        day += 1;
        if (day > izMaxDayMonth(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year += 1;
            }
        }
        return String.valueOf(day + "." + month + "." + year);
    }
}
 /* switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    maxDateMonth = 29;
                } else {
                    maxDateMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDateMonth = 30;
                break;
            default:
                maxDateMonth = 31;
                break;
        }

        if (date > maxDateMonth) {
            date = 1;
            month++;
            if (month > 12) {
                month = 1;
                year += 1;
                System.out.println(date + "." + month + "." + year);
            } else {
                System.out.println(date + "." + month + "." + year);
            }
        } else {
            System.out.println(date + "." + month + "." + year);
        }*/
