package alexia_ioana_cazan_1.quiz1.t2.oil.sub;

import alexia_ioana_cazan_1.quiz1.t2.oil.A21;
import alexia_ioana_cazan_1.quiz1.t2.cake.rehearsal.A22;

public class R21 {
  public static void main(String[] args) {
    // Print the area of the rectangle from the "R21". The area should be calculated according to the "A21" class variables. The hardcoded answer is not requested.
    A21 a21 = new A21();
    a21.setWidth(23);
    a21.setHeight(37);
    System.out.println("The area of the rectangle is " + a21.getWidth() * a21.getHeight());

    // Print the name of the month from the "R21". The name of the month should be determined according to the "A22" class variable. The hardcoded answer is not requested. Checking of invalid value is mandatory.
    A22 a22 = new A22();
    int month = a22.getMonth();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
        } 
        else {
            String monthName;
            switch (month) {
                case 1:  monthName = "January"; break;
                case 2:  monthName = "February"; break;
                case 3:  monthName = "March"; break;
                case 4:  monthName = "April"; break;
                case 5:  monthName = "May"; break;
                case 6:  monthName = "June"; break;
                case 7:  monthName = "July"; break;
                case 8:  monthName = "August"; break;
                case 9:  monthName = "September"; break;
                case 10: monthName = "October"; break;
                case 11: monthName = "November"; break;
                case 12: monthName = "December"; break;
                default: monthName = "Invalid"; 
            }
            System.out.println("The month is " + monthName);
        }
      
  }
}
