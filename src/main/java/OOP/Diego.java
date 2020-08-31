package OOP;

public class Diego extends Persona{

    public void saludo() {
        System.out.println("Soy una persona de nacionalidad " + super.getNacionalidad());
    }

    public void dormir(){
        System.out.println("Me voy a dormir");
    }
}
