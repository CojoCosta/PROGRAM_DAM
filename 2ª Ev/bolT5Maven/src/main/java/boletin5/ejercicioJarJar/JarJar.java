package boletin5.ejercicioJarJar;

public class JarJar {
    public static void main(String[] args) {
        
        String fraseEjercicio = "Jar-Jar is the Big Boss";
        // • Muestra la longitud de la cadena
        System.out.print("Longitud: ");
        System.out.println(fraseEjercicio.length());
        
        // • Muestra el primer carácter, el último y comprueba lo que pasa al acceder al carácter de la posición 100.
        System.out.print("Posicion 0: ");
        System.out.println(fraseEjercicio.charAt(0));
        System.out.print("Ultima posiocion: ");
        System.out.println(fraseEjercicio.charAt(fraseEjercicio.length() - 1));
        // fraseEjercicio.charAt(100);
        
        // • Crea una segunda cadena a partir de la primera pasándola a mayúsculas y observa el resultado de equals y equalsIgnoreCase.
        String fraseEjercicio2 = fraseEjercicio.toUpperCase();
        System.out.print("Equals: ");
        System.out.println(fraseEjercicio.equals(fraseEjercicio2));
        System.out.print("EqualsIgnoreCase: ");
        System.out.println(fraseEjercicio.equalsIgnoreCase(fraseEjercicio2));
        
        // • Muestra la cadena en minúsculas.
        System.out.print("Minusculas: ");
        System.out.println(fraseEjercicio.toLowerCase());
        
        // • Comprueba si la cadena acaba por “Boss” y por “Jar”.
        System.out.print("Termina en Boss: ");
        System.out.println(fraseEjercicio.endsWith("Boss"));
        System.out.print("Termina en Jar: ");
        System.out.println(fraseEjercicio.endsWith("Jar"));
        
        // • Muestra la posición de la primera y la última vez que aparece la palabra “Jar”.
        System.out.print("Primera vez Jar: ");
        System.out.println(fraseEjercicio.indexOf("Jar"));
        System.out.print("Ultima vez Jar: ");
        System.out.println(fraseEjercicio.lastIndexOf("Jar"));

        // • Crea otra variable String a partir del fragmento de la cadena anterior que empieza en la posición 7 y acaba en la 14 (ambos incluidos).
        String fraseEjercicio3 = fraseEjercicio.substring(7, 15);
        System.out.println(fraseEjercicio3);

        // • Quita los espacios de los extremos de la anterior cadena creada y muéstrala.
        System.out.println(fraseEjercicio3.trim());

        // • Crea un array de Strings con las palabras de la primera cadena (los separadores son el espacio y el guion).
        String [] frase = fraseEjercicio.split("[ -]");
        // • Muestra cada palabra del array anterior en una linea ocupando 3 caracteres (cortala si es mayor). Esto no lo hagas con substring si no jugando con el formateo de printf. frase.
        for (int i = 0; i < frase.length; i++) {
            System.out.printf("%3.3s\n",frase[i]);
        }
    }

}
