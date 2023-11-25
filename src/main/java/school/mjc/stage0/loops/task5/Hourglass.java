package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= i && i < height - j) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = height / 2; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j <= i && j >= height - 1 - i) {
                    System.out.print("8");
                } else {
                    System.out.print (" ");
                }
            }
            System.out.println();
        }
    }
}
