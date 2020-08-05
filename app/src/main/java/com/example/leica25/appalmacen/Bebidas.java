package com.example.leica25.appalmacen;

public class Bebidas {

    private String nombre;
    private String descripcion;
    private int imagenId;


    public Bebidas(String nombre, String descripcion, int imagenId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenId = imagenId;
    }

    public final static Bebidas drinks[]={
            new Bebidas("Capuccino","café con leche",R.drawable.capuchino),
            new Bebidas("Mokachino","café con chocolate",R.drawable.mocaccino),

    };



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagenId() {
        return imagenId;
    }

    public void setImagenId(int imagenId) {
        this.imagenId = imagenId;
    }

    @Override
    public String toString() {
        return  nombre;
    }

}
