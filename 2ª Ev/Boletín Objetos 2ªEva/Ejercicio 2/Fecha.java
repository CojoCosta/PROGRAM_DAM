public class Fecha {

    private int dia;
    private int mes;
    private int año;

    // #region FUNCIONES GET Y SET
    public void setDia(int dia) { 
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    // #endregion
    // #region CONSTRUCTORES
    public Fecha() {
        this.dia = 18;
        this.mes = 8;
        this.año = 2000;
    }

    public Fecha(int dia, int mes, int año) {
        setDia(dia);
        setMes(mes);
        setAño(año);
    }
    // #endregion

    // #region METODOS 
    public String fechaFormateada(boolean fecha) {
        String fechaFormateada = "";
        if (fecha == true) {
            return dia + "/" + mes + "/" + año;
        } else {
            switch (mes) {
                case 1:
                    return   getDia() + " de enero de " + getAño();

                case 2:
                    return getDia() + " de febrero de " + getAño();

                case 3:
                    return fechaFormateada = getDia() + " de marzo de " + getAño();

                case 4:
                    return fechaFormateada = getDia() + " de abril de " + getAño();

                case 5:
                    return fechaFormateada = getDia() + " de mayo de " + getAño();

                case 6:
                    return fechaFormateada = getDia() + " de junio de " + getAño();

                case 7:
                    return fechaFormateada = getDia() + " de julio de " + getAño();

                case 8:
                    return fechaFormateada = getDia() + " de agosto de " + getAño();

                case 9:
                    return fechaFormateada = getDia() + " de septiembre de " + getAño();

                case 10:
                    return fechaFormateada = getDia() + " de octubre de " + getAño();

                case 11:
                    return fechaFormateada = getDia() + " de noviembre de " + getAño();

                default:
                    return fechaFormateada = getDia() + " de diciembre de " + getAño();

                }
            }
         //   return fechaFormateada;
    }

    public static int diferenciaFechas(Fecha fecha1, Fecha fecha2){
        if (fecha1.getAño()>fecha2.getAño()) {
            return  fecha1.getAño() - fecha2.getAño();
        } else{
            return  fecha2.getAño() - fecha1.getAño();
        }
    }

    // #endregion
}