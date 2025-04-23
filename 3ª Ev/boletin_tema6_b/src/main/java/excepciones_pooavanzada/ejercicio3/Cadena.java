package excepciones_pooavanzada.ejercicio3;

import java.util.ArrayList;

public class Cadena {
    private ArrayList<Character> cadena;

    public void setCadena(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            cadena.charAt(i);
            if (cadena.charAt(i) != ' ') {
                this.cadena.add(cadena.charAt(i));
            } else{
            }                
        }
    }
    @Override
    public String toString() {
        String cadenaCompleta = "";
        for (int i = 0; i < cadena.size(); i++) {
            cadenaCompleta += cadena.get(i);
        }
        return cadenaCompleta;
    } 
    
    @Override 
    public boolean equals(Object obj) {
        
        return this.equals(obj);
    }
    public int elimnar(char caracter){
        int acu = 0;
        for (int i = 0; i < cadena.size(); i++) {
            if (cadena.get(i) == caracter) {
                cadena.remove(cadena.get(i));
                i --;
                acu ++;
            }
        }
        return acu;
    }
}
