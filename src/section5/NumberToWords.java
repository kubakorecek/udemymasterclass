package section5;

public class NumberToWords {

    public static void numberToWords(int number) {

        int cnt = NumberToWords.getDigitCount(number);

        int reversed = NumberToWords.reverse(number);

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int lastDigit;

        int cnt_w = 0;
        while (cnt_w < cnt) {

            lastDigit = reversed % 10;

            switch (lastDigit) {
                case 0:

                    System.out.println("Zero");
                    break;
                case 1:

                    System.out.println("One");
                    break;
                case 2:

                    System.out.println("Two");
                    break;
                case 3:

                    System.out.println("Three");
                    break;
                case 4:

                    System.out.println("Four");
                    break;
                case 5:

                    System.out.println("Five");
                    break;
                case 6:

                    System.out.println("Six");
                    break;
                case 7:

                    System.out.println("Seven");
                    break;
                case 8:

                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

                default:

                    System.out.println("Invalid Value");
                    break;


            }
            cnt_w++;
            reversed = reversed / 10;
        }


    }

    private static int getDigitCount(int number) {
        int cnt = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        while (number > 0) {
            number = number / 10;
            cnt++;
        }
        return cnt;
    }

    public static int reverse(int number) {
        int reverse, remainder;
        reverse = 0;

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }
}

