package MoreExercises.E01FirstStepsInCoding;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double C = Double.parseDouble(scanner.nextLine());
        double F = (C * 9 / 5) + 32;
        System.out.printf("%.2f", F);
    }
}
