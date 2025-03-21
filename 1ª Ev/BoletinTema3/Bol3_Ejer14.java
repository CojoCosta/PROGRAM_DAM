package Programas.BoletinTema3;

public class Bol3_Ejer14 {
    /**
     * Mestra por pantallaelresultado de dtirar dos dados de 6 caras
     * @return la suma de los dados
     */
    public static int tiradaDados() {
        int numeroAleatorio1 = (int) (Math.random() * 6 + 1);
        int numeroAleatorio2 = (int) (Math.random() * 6 + 1);
        int tirada = numeroAleatorio1 + numeroAleatorio2;
        System.out.printf("El dado 1 sale: %d\n", numeroAleatorio1);
        System.out.printf("El dado 2 sale: %d\n", numeroAleatorio2);
        return tirada;
    }
    /**
     * comprobacion de resultados
     * @param tirada que es el resultado
     * @return 0    1      suma
     */
    public static int comprobaciónTirada(int tirada) {
        if (tirada == 7 || tirada == 11) {
            return 0;
        } else if (tirada == 2 || tirada == 3 || tirada == 12) {
            return -1;
        } else if (tirada >= 4 || tirada <= 10 && tirada != 7) {
            return tirada;
        } else {
            return tirada;
        }
    }

    public static void main(String[] args) {//TODO revisar lógica del juego (que no aparezca la cpu si gana o pierde el usuario)
        int tiradaUsuario = tiradaDados();
        int tiradaCPU = tiradaDados();

        System.out.printf("Tirada jugador 1: %d\n", tiradaUsuario);
        if (comprobaciónTirada(tiradaUsuario) == 0) {
        } else if (comprobaciónTirada(tiradaUsuario) == -1) {
        }

        System.out.printf("Turno de la CPU: %d\n", tiradaCPU);
        if (comprobaciónTirada(tiradaCPU) == 0) {
        } else if (comprobaciónTirada(tiradaCPU) == -1) {
        } 

        if (comprobaciónTirada(tiradaUsuario) == 0) {
            System.out.println("Ganador ususario en la primera tirada");
        } else if (comprobaciónTirada(tiradaUsuario) == -1) {
            System.out.println("Ganador CPU en la tirada del usuario");
        } else {
            if (comprobaciónTirada(tiradaCPU) == 0) {
                System.out.println("Ganador CPU en su primera tirada");
            } else if (comprobaciónTirada(tiradaCPU) == -1) {
                System.out.println("Ganador usuario en la tirada de la CPU");
            } else if (tiradaUsuario > tiradaCPU) {
                System.out.println("Ganador usuario por mayor puntuacion");
            } else if (tiradaUsuario < tiradaCPU) {
                System.out.println("Ganador CPU por mayor puntuacion");
            }else {
                System.out.println("Empate");
            }
        }
    }
}

// 14. Juego Craps: Se desea simular este juego de dados. Para ello:
// • Se simula que el jugador tira dos dados de seis caras y se calcula la suma
// de ambos.
// • Si la suma es 7 u 11 en la primera tirada el jugador gana.
// • Si la suma es 2, 3 o 12 en la primera tirada (se denomina craps) el jugador
// pierde (gana la CPU).
// • Si la suma es un nº entre 4 y 10 salvo el 7, dicha suma son los puntos del
// jugador.
// • Luego tira la CPU con las mismas reglas. Si al final ambos sacan puntuación
// gana la de mayor valor o empate en caso de igualdad.
// Deben existir al menos las siguientes funciones:
// • tirada: Tira dos dados, muestra sus valores en pantalla y devuelve la suma.
// • comprobacion: Se el pasa un valor y devuelve -1 si pierde, 0 si gana o la
// puntuación en otro caso.
// Como siempre haz otras para organizar código y evitar repetir código.