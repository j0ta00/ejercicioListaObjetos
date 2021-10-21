package es.iesnervion.juanjomz.ejerciciolistaobjetos;

import java.util.Locale;

public class Arma{
    private String nombre;
    private int idFoto;

    public Arma(String nombre,int idFoto){
        this.nombre = nombre;
        this.idFoto=idFoto;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
