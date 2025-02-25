package boletin5.ejercicio4;

public class Ejercicio4 {
    // #region A)
    /**
     * Función que muestra una cadena letra a letra
     * @param frase String que le pasamos a la función
     */
    public static void muestraEnLinea(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
    }
    // #endregion

    // #region B)
    /**
     * Función que devuelve una cantidad de caracteres desde una determinada
     * posición
     * 
     * @param frase              cadena principal
     * @param posicionInicio     posición de la cadena donde empezamos a devolver
     *                           caracteres
     * @param cantidadCaracteres nº de caracteres que devolvemos
     * @return La subcadena especificada
     */
    public static String subCadena(String frase, int posicionInicio, int cantidadCaracteres) {
        String cadenaFinal = "";
        if (posicionInicio < 0 || posicionInicio > frase.length() || (posicionInicio + cantidadCaracteres) > frase.length()) {
            return cadenaFinal;
        } else {
            for (int i = posicionInicio; i < cantidadCaracteres + posicionInicio; i++) {
                cadenaFinal += frase.charAt(i);
            }
            return cadenaFinal;
        }
    }
    // #endregion

    // #region C)
    /**
     * Función que muestra una cadena centrada en un nargen de 80 caracteres
     * 
     * @param frase cadena que pasamos
     */
    public static void muestraCentrado(String frase) {
        int mitadDeAncho = 80/2;
        int largoDeCadena = frase.length()/2;
        int centrado = mitadDeAncho - largoDeCadena;
        String espacios = " ";
        for (int i = 0; i < centrado; i++) {
            System.out.print(espacios);
        }
        System.out.println(frase);
    }
    // #endregion

    // #region D)
    /**
     * Función que le pasamos una cadena y la devuleve como un array de tipo char[]
     * 
     * @param frase cadena que pasamos
     * @return
     */
    public static char[] cadenaAVector(String frase) {
        char vector[] = new char[frase.length()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = frase.charAt(i);
        }
        System.err.println(vector);
        return vector;
    }
    // #endregion

    // #region E)
    /**
     * Función que le pasamos una cadena y la devuleve escrita al revés
     * 
     * @param frase cadena que pasamos
     * @return
     */
    public static String alReves(String frase) {
        String fraseAlReves = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseAlReves += frase.charAt(i);
        }
        System.err.println(fraseAlReves);
        return fraseAlReves;
    }
    // #endregion

    // #region F)
    /**
     * funcion que pasa varias cadenas de string a mayusculas si estan en minusculas
     * y cambia "_" por espacios.
     * @param frase conjunto de string que se le pasan.
     * @return
     */
    public static String pasoAMayusculas(String... frase) {
        String fraseConcatenada = "";
        char letra;
        for (int i = 0; i < frase.length; i++) {
            for (int j = 0; j < frase[i].length(); j++) {
                if (frase[i].charAt(j) == '_') {
                    fraseConcatenada += " "; 
                }else if(frase[i].charAt(j) >= 'a' && frase[i].charAt(j) <= 'z' ){
                    letra = (char)(frase[i].charAt(j) - 32);
                    fraseConcatenada += letra ;
                } else{
                    fraseConcatenada += frase[i].charAt(j);
                }
            }
        }
        System.err.println(fraseConcatenada);
        return fraseConcatenada;
    }

    // #endregion
    public static void main(String[] args) {
        String frase = "Hola Curro";
        muestraEnLinea(frase);
        System.out.println("--------------------------------------------");
        subCadena(frase, 4, 5);
        System.out.println("--------------------------------------------");
        muestraCentrado(frase);
        System.out.println("--------------------------------------------");
        cadenaAVector(frase);
        System.out.println("--------------------------------------------");
        alReves(frase);
        System.out.println("--------------------------------------------");
        pasoAMayusculas("Hola_Curro ", "Hola_Hugo ", "Hola Italiani ","ABC___abc_123 ()={}[]ñÑ");
    }
}
