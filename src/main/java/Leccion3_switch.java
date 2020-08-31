import java.util.Scanner;

public class Leccion3_switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String xvar = scan.next();  //L K M J V S D
        //xvar = xvar.toUpperCase();
        int day = scan.nextInt();

//        if(xvar.equals("L") ){
//            System.out.println("Lunes");
//        }else if(xvar.equals("K")){
//            System.out.println("Martes");
//        }else if (xvar.equals("M")){
//            System.out.println("Miercoles");
//        }else if(xvar.equals("J")){
//            System.out.println("Jueves");
//        }else if (xvar.equals("V")){
//            System.out.println("Viernes");
//        }else if(xvar.equals("S")){
//            System.out.println("Sabado");
//        }else if (xvar.equals("D")){
//            System.out.println("Domingo");
//        }

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
