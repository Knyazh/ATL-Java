//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for(int i = 0; i<7; i++){
            for(int j = 0; j<7-i; j++){
                System.out.print(" ");

            }
            for(int k = 0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

//
//            for(int i = 7 ; i>0; i--){
//                for(int j = 0 ; j < i ; j++){
//                    System.out.print("*");
//                }
//                System.out.println();

        }
    }
