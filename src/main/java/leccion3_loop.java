import java.util.Scanner;

public class leccion3_loop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int day = 0;
        while (day != 10){

            day = scan.nextInt();

            switch (day){
                case(1):
                    System.out.println("Lunes");
                    break;
                case(2):
                    System.out.println("Martes");
                    break;
                case(3):
                    System.out.println("Miercoles");
                    break;
                case(4):
                    System.out.println("Jueves");
                    break;
                case(5):
                    System.out.println("Viernes");
                    break;
                case(6):
                    System.out.println("Sabado");
                    break;
                case(7):
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Numero de la semana incorrecto");
                    break;
            }


        }


    }
}
