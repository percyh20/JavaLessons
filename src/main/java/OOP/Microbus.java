package OOP;

public final class Microbus extends Vehiculo {



    public Microbus(Integer ruedas, Integer puertas, Integer luces, String motor, Boolean dobleTraccion, String tipo, Integer pasajeros) {
        super(ruedas, puertas, luces, motor, dobleTraccion, tipo);
        //super.setRuedas(ruedas);
        super.setPasajeros(pasajeros);
        this.numeroSerie=4654;
    }


}
