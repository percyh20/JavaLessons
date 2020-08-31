public class Leccion2_if {

    public static void main(String[] args) {
        int x =8, y = 5, z =5;

        if (x > y){
            System.out.println("Si x es mayor que y... yuppy");
        }else{
            System.out.println("Que mal nos quedamos cortos");
        }

        if(y >= z){
            System.out.println("Mira si que casualidad son iguales");

            if(x > y ){
                System.out.println("Que exagerado tambien X es mayor que y");
            }
        }else{
            System.out.println("Y no es igual a z ni mayor");
        }

        //al usar el operador && estamos validando que la comparacion 1 'Y' la comparacion 2 sean verdaderas
        if(x > y && y == z){
            System.out.println("ambas comparaciones son positivas");
        }

        //al usar el operador || estamos validando que la comparacion 1 'O' la comparacion 2 sean verdaderas
        //se ejecutara el codigo cuando alguna de las 2 sea positiva
        if(x > y || y == z){
            System.out.println("ambas comparaciones son positivas");
        }


    }

}
