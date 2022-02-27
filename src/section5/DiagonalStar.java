package section5;

public class DiagonalStar {


    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.print("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i == 0 || i == (number - 1)) || i == j || j == 0 || (i + j + 1 - number) == 0) {
                    if (j == (number - 1)) {
                        System.out.println("*");
                    } else {
                        System.out.print("*");
                    }
                } else if (j == (number - 1)) {
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }

            }
        }
    }


}
