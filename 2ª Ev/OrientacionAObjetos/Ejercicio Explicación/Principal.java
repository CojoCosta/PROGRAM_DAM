public class Principal {
    public static void main(String[] args) {
        Perro perro;
        perro = new Perro();

        perro.nombre = "Hugo";

        perro.raza = "Can Palleiro";

        perro.setEdad(5);

        System.out.printf("Tengo un %s llamado %s de %d años\n",
                perro.raza, perro.nombre,
                perro.getEdad());
    }
}
