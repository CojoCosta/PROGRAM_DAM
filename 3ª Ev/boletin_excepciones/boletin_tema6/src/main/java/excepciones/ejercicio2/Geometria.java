package excepciones.ejercicio2;

public class Geometria {
    private boolean figura;
    private double altura;
    private double base;

//#region MÉTODOS (FUNCIONES DE "CALCULO")
    public String tipo(){
        if (figura == true){
            return "Rectangulo";
        } else {
            return "Triangulo";
        }
    }
    public double area(){
        if (figura == true) {
            return  base*altura;
        }else{
            return  (base*altura)/2;
        }
    }
    public double diagonal(){
        double diagonal;
        diagonal = Math.sqrt((base*base)+(altura*altura));
        return diagonal;
    }
    
    public double perimetro(){
        double perimetro;
        if (figura == true) {
            return  base*2 + altura*2;
        }else{
            perimetro = base + altura + diagonal();
        }
        return perimetro;
    }
//#endregion
//#region CONSTRUCTORES
    public Geometria() {
        figura = false;
        altura = 2;
        base = 2;
    }

    public Geometria(double altura, double base) {
        figura = false;
        setAltura(altura);
        setBase(base);
    }

    public Geometria(boolean figura, double altura, double base) {
        this.figura = figura;
        setAltura(altura);
        setBase(base);
    }
    //#endregion
//#region FUNCIONES  SET/GET PARA OTORGAR O DEVOLVER VALORES
    public boolean getFigura() {
        return figura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Introduce una numero positivo");
        } else {
            this.altura = altura;
        }
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setBase(double base) {
        if (base < 0) {
            throw new IllegalArgumentException("Introduce una numero positivo");
        } else {
            this.base = base;
        }
    }

    public double getBase() {
        return base;
    }
//#endregion
}

