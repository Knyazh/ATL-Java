import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.metal.MetalLookAndFeel;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        for(int i = 0; i<7; i++){
//            for(int j = 0; j<7-i; j++){
//                System.out.print(" ");
//
//            }
//            for(int k = 0; k<i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//
//            for(int i = 7 ; i>0; i--){
//                for(int j = 0 ; j < i ; j++){
//                    System.out.print("*");
//                }
//                System.out.println();

//        for (int i = 10; i<100;i++){
//            int onluq = i / 10;
//            int teklik = i % 10;
//            System.out.println(onluq + " " + teklik);
//        }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int bolme  = m/n;
//        System.out.println(bolme);


//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("Düzbucaqlının uzunluğunu daxil edin:");
//        double uzunluq = scanner.nextDouble();
//
//
//        System.out.println("Düzbucaqlının enini daxil edin:");
//        double en = scanner.nextDouble();
//
//
//        double perimetri = 2 * (uzunluq + en);
//
//
//        System.out.println("Düzbucaqlının perimetri: " + perimetri);
//
//        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("1-dən 12-yə qədər bir ədəd daxil edin:");
//        int number = scanner.nextInt();
//
//        if (number >= 1 && number <= 3) {
//            System.out.println("Initial");
//        } else if (number >= 4 && number <= 6) {
//            System.out.println("Average");
//        } else if (number >= 7 && number <= 9) {
//            System.out.println("Sufficient");
//        } else if (number >= 10 && number <= 12) {
//            System.out.println("High");
//        } else {
//            System.out.println("Zəhmət olmasa 1-dən 12-yə qədər bir ədəd daxil edin.");
//        }
//
//        scanner.close();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("3 reqemli eded daxil edin");
//        int number = sc.nextInt();
//
//        if (number >=100 && number <=999) {
//
//            int firstDigit = number /100;
//            int lastDigit = number % 10;
//            if (firstDigit == lastDigit) {
//                System.out.println("Birinci ve axirinci reqemler beraberdir");
//            } else if (firstDigit>lastDigit) {
//                System.out.println("Birinci reqem boyukdur : " + firstDigit );
//            } else   {
//                System.out.println("Ikinci reqem boyukdur : " + lastDigit );
//            }
//
//        }
//        else {
//            System.out.println("3 reqemli eded daxil edin");
//        }


        Scanner sc = new Scanner(System.in);

        System.out.println("1 den 12 e qeder isdenilen ayi daxil edin hansi fesil olmasini orenin");

        int ay = sc.nextInt();

        String fesil;

        if(ay==12 || ay==1 || ay==2){
            fesil = "Qis";
        }
        else if(ay>=3 && ay<=5){
            fesil = "Yaz";
        }
        else if(ay>=6 && ay<=8){
            fesil = "Yay";
        }
        else if(ay>=9&& ay<=11){
            fesil = "Payiz";
        }
        else {
            fesil = "Yalnis ay nomresi daxil etdiniz";
        }

        System.out.println("Daxil etdiyiniz ilin ayi :" + fesil + " fesline aiddir");



//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Havanın temperaturunu daxil edin :");
//        int t = scanner.nextInt();
//
//        if (t > 0) {
//            System.out.println("Water");
//        } else {
//            System.out.println("Ice");
//        }
//
//        scanner.close();
//

        }
    }
