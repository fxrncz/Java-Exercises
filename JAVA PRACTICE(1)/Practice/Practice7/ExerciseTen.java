import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int month, year;
        int numberofDays = 0;
        String monthofName = "Unknown";

        System.out.println("Test Data");
        System.out.println();

        System.out.println("Input number of Month: ");
        month = sc.nextInt();

        System.out.println("Input a year: ");
        year = sc.nextInt();

        switch (month) {
            case 1:
                monthofName = "January";
                numberofDays = 31;
                break;
            case 2:
                monthofName = "February";
                if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0 )) {
                    numberofDays = 29;
                } else {
                    numberofDays = 28;
                }
                break;
            case 3:
                monthofName = "March";
                numberofDays = 30;
                break;
            case 4:
                monthofName = "April";
                numberofDays = 31;
                break;
            case 5:
                monthofName = "May";
                numberofDays = 30;
                break;
            case 6:
                monthofName = "June";
                numberofDays = 31;
                break;
            case 7:
                monthofName = "July";
                numberofDays = 30;
                break;
            case 8:
                monthofName = "August";
                numberofDays = 31;
                break;  
            case 9:
                monthofName = "September";
                numberofDays = 30;
                break;     
            case 10:
                monthofName = "October";
                numberofDays = 31;
                break;     
            case 11:
                monthofName = "November";
                numberofDays = 30;
                break;     
            case 12:
                monthofName = "December";
                numberofDays = 31;
                break;                                 
        }

        System.out.println(monthofName + " " + year + " has " + numberofDays );
        sc.close();
    }
}
