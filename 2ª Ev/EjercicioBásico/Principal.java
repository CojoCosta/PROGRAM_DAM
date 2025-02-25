public class Principal {
    public static void intercambiaRadios(Pelota pelota, Pelota pelota1){
        double radioAux;
        radioAux = pelota.getRadio();
        pelota.setRadio(pelota1.getRadio());
        pelota1.setRadio(radioAux);

    }
    public static void main(String[] args) {
        Pelota pelota; //Primer objeto (Objeto 0)
        pelota = new Pelota();
        pelota.tipo = "baloncesto";
        pelota.setRadio(20);
        System.out.printf("Esta pelota es de %s y de un radio de %.2f cm\n", pelota.tipo, pelota.getRadio());
        pelota.inflar();
        System.out.printf("Tras inflar la pelota el radio es de %.2f cm\n\n", pelota.getRadio());
        
        Pelota pelota1; //Objeto 1
        pelota1 = new Pelota();
        System.out.printf("Esta otra pelota es de %s y de radio %.2f cm\n", pelota1.tipo, pelota1.getRadio());
        pelota1.inflar(10);
        System.out.printf("Tras inflar la pelota el radio es de %.2f cm\n\n", pelota1.getRadio());
        
        Pelota pelota2; //Objeto 2  
        pelota2 = new Pelota("futbol", 22);
        System.out.printf("Esta otra pelota es de %s y de radio %.2f cm\n\n", pelota2.tipo, pelota2.getRadio());

        intercambiaRadios(pelota, pelota1);
        System.out.printf("%.2f y %.2f", pelota.getRadio(), pelota1.getRadio());
    }
}
