import java.util.Scanner;

public class leccion4_MetodosFunciones {


    public static void calculoSumatoria(Integer[] arreglo,Integer valor){
        Integer suma = 0;
        for (Integer x: arreglo ) {
            suma = suma + x;
        }
        System.out.println("resultado calculo sumatoria " + (suma * valor));
        //Llamado a funcion
        Integer resultadoComodin = calculoComodin(arreglo,valor);
        System.out.println("Resultado calculo comodin " + resultadoComodin);
    }

    public static Integer calculoComodin(Integer[] arreglo,Integer valor){
        Integer comodin = 0;
        for (Integer x: arreglo ) {
            //comodin = comodin + (x  valor);
        }
        return comodin;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] numeros = {1,2,3,9,5};
        Integer[] decenas = {10,20,30,40,50};
        Integer[] numeros2 = {1,4,6,9,5};
        Integer[] decenas2 = {10,25,30,40,50};
        Integer[] numeros3 = {1,2,37,9,5};
        Integer[] decenas3 = {10,28,30,40,50};
        Integer[][] vectores = {numeros,numeros2,numeros3,decenas,decenas2,decenas3};

        Integer var = 0;

        while( var != 99 ){

            System.out.println("Escriba un numero");

            var = scan.nextInt();

            for (Integer[] tren: vectores) {
                calculoSumatoria(tren,var);
            }

//            calculoSumatoria(decenas,var);
//            calculoSumatoria(numeros2,var);
//            calculoSumatoria(decenas2,var);
//            calculoSumatoria(numeros3,var);
//            calculoSumatoria(decenas3,var);

        }


    }


}
