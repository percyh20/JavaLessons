package OOP;

public class main {

    public static void arrancarVehiculo(Vehiculo vh){
        vh.arrancar();
    }

    public static void acelerarVehiculo(Vehiculo vh){
        vh.acelerar();
    }

    public static void frenarVehiculo(Vehiculo vh){
        vh.frenando();
    }


    public static void main(String[] args) {

        Jeep jeep = new Jeep(4,3,4,"Gasolina",Boolean.TRUE,"Jeep");
        Motocicleta moto = new Motocicleta(2,0,2,"Gasolina",Boolean.FALSE,"Motocicleta","Motocross");
        Microbus micro = new Microbus(6,4,6,"Diesel",Boolean.TRUE,"MicroBus",20);

        //Persona p1 = new Persona() ;   // clase persona es abstracta no puede ser instanciada
        Persona p1 = new Diego();
        Diego p2 = new Diego();
        p2.dormir();

        arrancarVehiculo(jeep);
        arrancarVehiculo(micro);
        arrancarVehiculo(moto);

        acelerarVehiculo(jeep);
        acelerarVehiculo(moto);
        acelerarVehiculo(micro);

        frenarVehiculo(jeep);
        frenarVehiculo(micro);
        frenarVehiculo(moto);



    }

}
