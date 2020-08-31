import java.util.Scanner;

public class Leccion3_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var = scan.nextInt();

//        for (int i = 1; i <= var; i+=5) {
//
//            System.out.println("imprimiendo los numeros hasta " + var + " voy por " + i);
//
//        }

        for (int i = 0; i < var; i++) {

            System.out.println("imprimiendo los numeros hasta " + var + " voy por " + i);

        }

    }
}
