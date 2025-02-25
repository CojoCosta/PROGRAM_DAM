public class Unidimensionales {
    public static void main(String[] args) {
        double[] temperaturas = new double[9];
        // double temperaturas[] = new double[4]; //AMBAS OPCIONES CORRECTAS
        // temperaturas = new double[4];
        // temperaturas[0] = 7.5;
        // temperaturas[1] = 3.2;
        // temperaturas[2] = 1.3;
        // temperaturas[3] = 10;
        //System.out.println(temperaturas[3]);
        for (int i = 0; i < temperaturas.length; i++){
            temperaturas[i]=Math.random()*50-25;
            }

        for (int i = 0; i < temperaturas.length; i++) {
            //System.out.println(temperaturas[i]);
            System.out.printf("Indice:%2d valor:%7.2fºC\n", i, temperaturas[i]);
        }
    }
}
