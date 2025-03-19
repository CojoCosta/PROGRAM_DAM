package poo_avanzada;

public class Mosca extends Animal {
    public Mosca() {
        this.nombreCientifico = "Drosophila Melanogaster";
    }

    @Override //PONER SIEMPRE AL SOBREESCRIBIR
    public void muestraDatos(){
        super.muestraDatos(); //PARA LLAMAR A LA FUNCION QUE SOBREESCRIBIMOS
        System.out.println("\nLa mosca no tiene vida");
    }
}
