package excepciones_pooavanzada.ejercicio3;

import java.util.ArrayList;

public class Cadena {
    private ArrayList<Character> cadena;

    public void setCadena(String cadena) {// TODO trim sin trim
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                this.cadena.add(cadena.charAt(i));
            }
        }
    } // "     lkusdhfiu dshfg dhsfl dh       "

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
        if (obj.getClass() == char[].class) {
            char[] arrayDelObj = (char[]) obj;
            if (arrayDelObj.length == cadena.size()) {
                for (int i = 0; i < arrayDelObj.length; i++) {
                    for (int j = 0; j < cadena.size(); j++) {
                        //TODO HACER ESTO A SABER COMO
                        // if (arrayDelObj.clone() == cadena.clone()) {
                            
                        // }
                    }
                }
                return this.equals(obj);
            } else if (obj.getClass() == Cadena.class) {
                ArrayList<Character> cadena2 = (ArrayList<Character>) obj;
                if (cadena2.size() == cadena.size()) {
                    for (int i = 0; i < cadena.size(); i++) {
                        
                            if (cadena.get(i) == cadena2.get(i)) {
                                return false;
                            
                        }
                    }
                    return this.equals(obj);
                }
                return this.equals(obj);
            } else if(obj.getClass() == String.class){//TODO String hacer esto
                

            }
            
            
        }
        return false;
    }

    public int elimnar(char caracter) {
        int acu = 0;
        for (int i = 0; i < cadena.size(); i++) {
            if (cadena.get(i) == caracter) {
                cadena.remove(cadena.get(i));
                i--;
                acu++;
            }
        }
        return acu;
    }
}