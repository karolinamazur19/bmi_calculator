import java.util.Scanner;
public class BMICalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją masę w kg ");
        double mass = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj swój wzrost w m ");
        double growth = scanner1.nextDouble();


        double BMI = (mass/ (growth* growth));


        if (BMI< 18.5) {
            System.out.println("Niedowaga ");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Waga prawidłowa");
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("Nadwaga");
        } else {
            System.out.println("Otyłość");
        }

        scanner.close();



    }

}