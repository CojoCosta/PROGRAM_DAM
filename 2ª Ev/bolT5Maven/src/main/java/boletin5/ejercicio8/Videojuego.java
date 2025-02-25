package boletin5.ejercicio8;

import java.time.LocalDate;

public class Videojuego {
    String titulo;
    String fabricante;
    int año;

    //#region SET Y GET
    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }
    public String getTitulo() {
        return titulo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante.toUpperCase();
    }
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año < 1950) {
            this.año = LocalDate.now().getYear();
        } else{
            this.año = año;
        }
    }

    public String getFabricante() {
        return fabricante;
    }
    //#endregion

    //#region CONSTRUCTORES
    public Videojuego(){
        setTitulo("");
        setFabricante("");
        setAño(0);
    }
    
    public Videojuego(String titulo){
        setTitulo(titulo);
        setFabricante("");
        setAño(0);
    }
    
    public Videojuego(int año){
        setTitulo("");
        setFabricante("");
        setAño(año);
    }
    
    public Videojuego(String titulo, String fabricante){
        setTitulo(titulo);
        setFabricante(fabricante);
        setAño(0);
    }
    
    public Videojuego(String titulo, int año){
        setTitulo(titulo);
        setFabricante("");
        setAño(año);
        
    }
    
    public Videojuego(int año, String fabricante){
        setTitulo("");
        setFabricante(fabricante);
        setAño(año);
    }
    //#endregion    
}
