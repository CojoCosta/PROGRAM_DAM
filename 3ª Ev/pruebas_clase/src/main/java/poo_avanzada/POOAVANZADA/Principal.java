package poo_avanzada.POOAVANZADA;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // -------Clase Animal y subclases-------//
        Mosca m = new Mosca();
        Perro p2 = new Perro(5, "Palleiro", "Lucky");
        System.out.println(m.nombreCientifico);
        System.out.println(m.getEdad());
        System.out.println();
        System.out.println(p2.nombreHumano);
        System.out.println(p2.nombreCientifico);

        p2.muestraDatos();
        m.muestraDatos();

        // -------POLIMORFISMO------------//
        Perro objPerro = new Perro(5, "Pastor", "Laika");
        Animal objAnimal;
        objAnimal = objPerro;
        System.out.println(objAnimal.getEdad());
        System.out.println(objAnimal.nombreCientifico);
        Perro p = (Perro) objAnimal;
        System.out.println(p.nombreCientifico);
        ((Perro) objAnimal).ladrar();

        // -ARRAY DE TIPO ANIMAL QUE PUEDE CONTENER TODAS SUS SUBCLASES-//
        Animal[] bichos = new Animal[3];
        bichos[0] = new Perro(5, "Pastor", "Laika");
        bichos[1] = new Mosca();
        bichos[2] = new Mosca();
        for (Animal animal : bichos) {
            if (animal.getClass() == Perro.class) {
                System.out.println(((Perro) animal).nombreHumano);
            } else {
                if (animal.getClass() == Mosca.class) {
                    animal.muestraDatos();
                } else {
                    System.out.println(animal.nombreCientifico);
                }
            }
            System.out.println(animal.nombreCientifico);
        }

        // ---ArrayList de 'Object' que puede meter de todo---//
        ArrayList<Object> cosas = new ArrayList<>();
        cosas.add("hola");
        cosas.add(4);
        cosas.add(new Perro());
        cosas.add(bichos);

// ----------------EQUALS USADO POR 'contains' ------------------//
        ArrayList<Perro> perros = new ArrayList<>();
        perros.add(new Perro(2, "Pastor", "Richard"));
        perros.add(new Perro(5, "Palleiro", "Lucky"));
        perros.add(new Perro(5, "Pekines", "Buff"));
        perros.add(new Perro(5, "Caniche", "Thor"));

        // Perro p1 = new Perro(5, "Pekines", "Buff");  //Da false
        Perro p1 = perros.get(2); //Da true

        System.out.printf("%s %s existe en la colección\n", p1.nombreHumano, perros.contains(p1) ? "Sí" : "No");

        //-------------------//
        
    }
}