package excepciones_pooavanzada.ejercicio5.clases;

import java.util.ArrayList;

public class Planeta extends Astro{
    private boolean gaseoso;
    public ArrayList<Astro> satelites;

    public void setGaseoso(boolean gaseoso) {
        this.gaseoso = gaseoso;
    }

    public boolean getGaseoso() {
        return this.gaseoso;
    }

    public Planeta(String nombre, double radio, boolean gaseoso){
        super(nombre, radio);
        this.setGaseoso(gaseoso);
        satelites = new ArrayList<Astro>();
    }

    public Planeta(){
        this("", 0, false);
    }
}