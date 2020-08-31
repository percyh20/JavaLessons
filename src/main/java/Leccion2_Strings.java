import java.util.Arrays;

public class Leccion2_Strings {

    public static void main(String[] args) {
        String s = "Hola mundo";
        System.out.println("El valor del texto de la variable s " + s);

        System.out.println("El valor del largo de la variable s es " + s.length());

        System.out.println("El indice de la L es " + s.indexOf('l') );

        System.out.println("La variable s contiene mu ? " + s.contains("mu") );

        String v1 = "hola-todos-los-saprissistas-del-mundo";

        String[] arregloStr =  v1.split("-");

        System.out.println(Arrays.toString(arregloStr));

        System.out.println(s.toUpperCase());

        s = s.replace('o','0');
        System.out.println(s);


    }


}
