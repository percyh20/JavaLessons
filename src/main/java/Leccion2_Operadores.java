public class Leccion2_Operadores {




    public static void main(String[] args) {
        int x =2;
        int y = 4;
        double z = 2;

        int resultado = x + y;

        //Operadores de aritmeticos  + - / * %  ++  --

        System.out.println(resultado);

        double resultado2 = y / z;

        System.out.println(resultado2);

        resultado = 7 % 2;


        //Operadores de asignacion

        /*

        =	x = 5	x = 5
        +=	x += 3	x = x + 3
        -=	x -= 3	x = x - 3
        *=	x *= 3	x = x * 3
        /=	x /= 3	x = x / 3
        %=	x %= 3	x = x % 3
        &=	x &= 3	x = x & 3
        |=	x |= 3	x = x | 3
        ^=	x ^= 3	x = x ^ 3
        >>=	x >>= 3	x = x >> 3
        <<=	x <<= 3	x = x << 3

         */

        System.out.println(resultado);

        System.out.println("El valor decrementado de y " + --y);

        System.out.println("El valor de y " + y);

        y = y-1;

        System.out.println("El valor de y " + y);

        ++y;
        y = y + 1;

        System.out.println("El valor de y " + y);

        //Operadores de Comparacion

        /*
        ==	Equal to	x == y
        !=	Not equal	x != y
        >	Greater than	x > y
        <	Less than	x < y
        >=	Greater than or equal to	x >= y
        <=	Less than or equal to	x <= y
         */

        Boolean vb = x==y;

        System.out.println("El valor de x es " + x + " y valor de y es " + y + " son iguales? >> " +  String.valueOf(x == y));

        System.out.println("El valor de x es " + x + " y valor de y es " + y + " son diferentes? >> " +  String.valueOf(x != y));

        System.out.println("El valor de x es " + x + " y valor de y es " + y + " es x > y >> " +  String.valueOf(x > y));

        System.out.println("El valor de x es " + x + " y valor de y es " + y + " es x < y >> " +  String.valueOf(x < y));





    }


}
