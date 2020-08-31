import java.util.Arrays;

public class leccion3_foreach {
    public static void main(String[] args) {
        String texto = "dia de la semana";
        String [] wkd = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
        String [] excepciones = {"Martes","Jueves"};

        System.out.println(wkd[2]);
        System.out.println("Imprimiendo los dias laborales de la semana");

//        for (String dia: wkd ) {
//
//            System.out.println(dia);
//
////            if(dia.equals("Martes")){
////                continue;
////            }
//            if(Arrays.asList(excepciones).contains(dia)){
//                continue;
//            }
//            System.out.println("buen " + dia);
//
//
//        }

        for (String dia: wkd ) {

            if(dia.equals("Miercoles")){
                break;
            }
            System.out.println(dia);

        }

    }
}
