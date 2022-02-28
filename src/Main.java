import section5.DiagonalStar;
import section5.NumberToWords;
import section6.Account;
import section6.Person;
import section6.SimpleCalculator;

public class Main {

    public static void main(String[] args) {

        if (args[0].equals("5")) {
            NumberToWords a = new NumberToWords();
            System.out.println(NumberToWords.reverse(123));
            NumberToWords.numberToWords(100);
            NumberToWords.numberToWords(123);


            DiagonalStar.printSquareStar(5);
            DiagonalStar.printSquareStar(8);
        }

        if (args[0].equals("6")) {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(4);
            System.out.println("add= " + calculator.getAdditionResult());
            System.out.println("subtract= " + calculator.getSubtractionResult());
            calculator.setFirstNumber(5.25);
            calculator.setSecondNumber(0);
            System.out.println("multiply= " + calculator.getMultiplicationResult());
            System.out.println("divide= " + calculator.getDivisionResult());


            Person person = new Person();
            person.setFirstName("");   // firstName is set to empty string
            person.setLastName("");    // lastName is set to empty string
            person.setAge(10);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setFirstName("John");    // firstName is set to John
            person.setAge(18);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setLastName("Smith");    // lastName is set to Smith
            System.out.println("fullName= " + person.getFullName());

            Account bobsAccount = new Account();
            bobsAccount.withdrawal(100.0);

            bobsAccount.deposit(50.);
            bobsAccount.withdrawal(100.0);

            bobsAccount.deposit(51.0);
            bobsAccount.withdrawal(100.0);

        }
    }


}
