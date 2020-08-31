import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leccion5_CollectionsArrayList {

    public static int[] agregarDato(int[] orig,int z){
        //forma antigua de crear un nodo al final de un array
        //creando un arreglo nuevo y pasando los datos del arreglo original

        int[] artemp = new int[orig.length+1];
        for (int i = 0; i < orig.length ; i++) {
            artemp[i] = orig[i];
        }

        artemp[orig.length] = z;
        orig = null;
        return artemp;
    }

    public static void main(String[] args) {
        int[] ar1 = {4,5,6,7,1,2,3};  //Array
        Integer ar2[] = {9,8,4,6,2};
        ArrayList<Integer> arlist1 = new ArrayList<Integer>();

        System.out.println(Arrays.toString(ar1));
        ar1 = agregarDato(ar1,20);
        System.out.println(Arrays.toString(ar1));

        for (int x: ar1) {
            arlist1.add(x);
        }

        System.out.println(arlist1);
        Collections.sort(arlist1);
        System.out.println(arlist1);








    }

}
