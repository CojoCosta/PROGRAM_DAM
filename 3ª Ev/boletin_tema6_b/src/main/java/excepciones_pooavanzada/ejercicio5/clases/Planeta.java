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

    public Planeta(String nombre, double radio, boolean gaseoso, ArrayList<Astro> satelites){
        super.setNombre(nombre);
        super.setRadio(radio);
        this.setGaseoso(gaseoso);
        this.satelites = satelites;
    }

    public Planeta(){
        this("", 0, false, null);
    }
    
}
