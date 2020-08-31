import OOP.Vehiculo;

public class Leccion1 {

    public static void main(String[] args) {
        String v1 = "Chango mayor";

        Vehiculo vh1 = new Vehiculo();
        //vh1.defaultModifier="No Visible"; // se encuentra fuera del packete

        //primitive type
        int v2 = 120;
        int v23 = 123;
        int v24 = 150;
        double v3 = 1321654.23;
        long vl1 = 465498546;
        short vs1 = 7879;
        boolean vb = true;
        char vc1 = 'C';
        float vf1 = 54.99F;
        byte vbt1 = 1;

        //Wrap type

        Integer vI1 = 123;
        Double vD1 = 23253.23;
        Long vL2 = 4654654L;
        Short vs2 = 445;
        Boolean vb2 =false;
        Character vc2 = 'D';
        Float vf2 = 5496.32F;
        Byte vbt2 =0;

        String varStr1 ="";
        String varStr2 =null;
        String varStr3;
        vl1 = v2;

        int x = 5, z = 9,g=6,a = 0;
        double c =23, f =45,y=56;

        //CASTING

        v2 = (int) vl1;
        vI1 = vL2.intValue() ;


        Boolean vbcomparacion = vI1.equals(145);


        System.out.println("Hola mundo " + v1 + " " + String.valueOf(v2));
        System.out.println("La comparacion es " + vbcomparacion);
    }
}
