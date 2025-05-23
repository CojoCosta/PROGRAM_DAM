package excepciones_pooavanzada.ejercicio3;

import java.util.ArrayList;

public class Cadena {
    private ArrayList<Character> cadena;

    public void setCadena(String cadena) {// TODO trim sin trim
        System.err.println(cadena);
        ArrayList<Character> cadenaConTrim = new ArrayList<Character>();
        for (int j = 0; j < cadena.length(); j++) {
            cadenaConTrim.add(cadena.charAt(j));
        }
        while (cadenaConTrim.get(0) == ' ') {
            cadenaConTrim.remove(0);
        }
        while (cadenaConTrim.get(cadenaConTrim.size() - 1) == ' ') {
            cadenaConTrim.remove(cadenaConTrim.size() - 1);
        }
        this.cadena = cadenaConTrim;
        System.err.print(cadenaConTrim);

    }

    // " lkusdhfiu dshfg dhsfl dh "

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
            char[] arrayDeCadena = (char[]) obj;
            if (arrayDeCadena.length == cadena.size()) {
                for (int i = 0; i < arrayDeCadena.length; i++) {
                    // TODO HACER ESTO A SABER COMO
                    if (arrayDeCadena[i] == cadena.get(i)) {
                        return false;
                    }
                }
                return this.equals(obj);
            } else if (obj.getClass() == Cadena.class) {
                ArrayList<Character> cadena2 = (ArrayList<Character>) obj;
                if (cadena2.size() == cadena.size()) {
                    for (int i = 0; i < cadena2.size(); i++) {
                        if (cadena.get(i) == cadena2.get(i)) {
                            return false;
                        }
                    }
                    return this.equals(obj);
                }
                return this.equals(obj);
            } else if (obj.getClass() == String.class) {// TODO String hacer esto
                String cadenaString = (String) obj;
                if (cadenaString.length() == cadena.size()) {
                    for (int i = 0; i < cadenaString.length(); i++) {
                        if (cadenaString.charAt(i) == cadena.get(i)) {
                            return false;
                        }
                    }
                }
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