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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getFechalimite() {
        return fechalimite;
    }

    public void setFechalimite(String fechalimite) {
        this.fechalimite = fechalimite;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
