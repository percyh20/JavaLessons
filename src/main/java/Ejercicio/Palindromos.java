package Ejercicio;

import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String var = "";

        while( !var.equals("x") ){

            System.out.println("Escriba una palabra");

            var = scan.nextLine();
            StringBuilder sb = new StringBuilder(var);

//            String reves="";
//
//            for (int i = var.length() -1; i >= 0; i--){
//                reves = reves.concat(String.valueOf(var.charAt(i)));
//            }

            if(sb.reverse().toString().equals(var)){
                System.out.println("La palabra " + var + " es palindromo " );
            }else {
                System.out.println("La palabra " + var + " NO es palindromo " );
            }


        }

    }
}
