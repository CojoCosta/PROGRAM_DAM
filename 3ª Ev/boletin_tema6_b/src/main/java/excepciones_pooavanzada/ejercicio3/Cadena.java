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
    //TODO ni puta idea las sobre escrituras
    @Override
    public String toString() {
        return this.toString();
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
