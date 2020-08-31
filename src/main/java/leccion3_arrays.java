import java.util.Arrays;

public class leccion3_arrays {
    public static void main(String[] args) {

        int [] ar1 = {1,2,3,4,5,6,7};
        int array[] = new int[5];
        int [][] arregloDeArreglos = { {1, 2, 3, 4}, {5, 6, 7},{9,8,7,3,2} };

        /*
            1 2 3 4
            5 6 7
            9,8,7,3,2
         */


        Arrays.fill(array, 0, 3, 88);

        for (int a: array) {
            System.out.println(a);
        }

        for (int[] item: arregloDeArreglos) {
            for (int n: item) {
                System.out.println(n);
            }
        }

        ar1[0] = 9;
        System.out.println(ar1[3]);

        System.out.println("ejercicio agregar vagon, tupla o casilla a un arreglo ****");

        System.out.println(Arrays.toString(ar1));

        //agregando un vagon al array y asignandole 18
        ar1 = agregarDato(ar1,18);
        System.out.println(Arrays.toString(ar1));

    }

    public static int[] agregarDato(int[] orig,int z){
        int[] artemp = new int[orig.length+1];
        for (int i = 0; i < orig.length-1 ; i++) {
            artemp[i] = orig[i];
        }

        artemp[orig.length] = z;
        orig = null;
        return artemp;
    }

}
