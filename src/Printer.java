import java.util.Date;

public class Printer implements Printable {

    private Date checkDate;
    private int checkNumber;


    @Override
    public void printCheck() {
        System.out.println("I printed check! Check number is " + checkNumber + "/n Check date is " + checkDate);
    }
}
