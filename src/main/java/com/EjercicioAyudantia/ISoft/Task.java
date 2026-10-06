package com.EjercicioAyudantia.ISoft;

public class Task {
    private String id;
    private String titulo;
    private String prioridad;
    private String fechalimite;
    private boolean completada;

    public Task(String id, String titulo, String prioridad, String fechalimite) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.fechalimite = fechalimite;
        this.completada = false;

    }
}
