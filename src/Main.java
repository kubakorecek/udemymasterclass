import section5.DiagonalStar;
import section5.NumberToWords;

public class Main {

    public static void main(String[] args) {

        NumberToWords a = new NumberToWords();
        System.out.println(NumberToWords.reverse(123));
        NumberToWords.numberToWords(100);
        NumberToWords.numberToWords(123);


        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(8);
    }
}
