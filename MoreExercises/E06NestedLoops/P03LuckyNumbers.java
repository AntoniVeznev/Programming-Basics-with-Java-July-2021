package MoreExercises.E06NestedLoops;

import java.util.Scanner;

public class P03LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i + j == k + l) {
                            if (number % (i + j) == 0) {
                                System.out.print(i);
                                System.out.print(j);
                                System.out.print(k);
                                System.out.print(l);
                                System.out.print(" ");
                            }
                        }
                    }
                }
            }
        }
    }
}
