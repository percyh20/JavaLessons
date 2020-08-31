import java.util.Calendar;

public class leccion3_metodos {

    public static void metodo1(){
        System.out.println("Soy parte del metodo 1");
    }

    public static void metodo2(){
        System.out.println("Soy parte del metodo 2");
        System.out.println("Hoy es en ingles " + queDiaEsHoy());
        metodo3();
    }
    public static void metodo3(){
        System.out.println("Soy parte del metodo 3");
        metodo1();
    }

    public static String queDiaEsHoy(){
        String dia = "";
        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.DAY_OF_WEEK);
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                dia = "SUNDAY";
                break;
            case Calendar.MONDAY:
                dia = "MONDAY";
                break;
            case Calendar.TUESDAY:
                dia ="TUESDAY";
                break;
            case Calendar.WEDNESDAY:
                dia ="WEDNESDAY";
                break;
            case Calendar.THURSDAY:
                dia ="THURSDAY";
                break;
            case Calendar.FRIDAY:
                dia ="FRIDAY";
                break;
            case Calendar.SATURDAY:
                dia ="SATURDAY";
                break;
        }
        return dia;

    }



    public static void main(String[] args) {

        System.out.println("Soy parte del codigo principal");

        metodo1();
        metodo2();




    }
}
