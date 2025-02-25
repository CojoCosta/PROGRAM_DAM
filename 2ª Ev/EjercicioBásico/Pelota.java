public class Pelota {
    public String tipo;
    //public double radio;
    private double radio;
    public double inflar;

    
//Constructor sin parametros
    public Pelota(){ 
        tipo= "playa";
        radio = 40;
    }
//Constructor con parametros
    public Pelota(String tipo, double radio){ 
        this.tipo = tipo;
        this.radio = radio;
    }
//Establece valor al radio por estar en privado
    public void setRadio(double radio) {
        this.radio = radio;
    }
//Devuelve el valor del radio
    public double getRadio(){
        return radio;
    }

    public void inflar(){
        this.radio = radio + 1;
    }
    public void inflar(int inflar){
        this.radio = radio + inflar;
    }
    
}
