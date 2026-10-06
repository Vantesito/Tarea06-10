package service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public  class TaskService {

    private final List<Task> tareas = new CopyOnWriteArrayList<>();

    public Task agregar(Task tarea) {
        tareas.add(tarea);
        return tarea;
    }

    public List<Task> filtrar(String prioridad, String titulo, String fechaLimite) {
        return tareas.stream()
                .filter(t -> vacio(prioridad)
                        || (t.getPrioridad() != null && t.getPrioridad().equalsIgnoreCase(prioridad.trim())))
                .filter(t -> vacio(titulo)
                        || (t.getTitulo() != null && t.getTitulo().toLowerCase().contains(titulo.trim().toLowerCase())))
                .filter(t -> vacio(fechaLimite)
                        || fechaLimite.trim().equals(t.getFechaLimite()))
                .toList();
    }

    private boolean vacio(String valor) {
        return valor == null || valor.isBlank();
    }
}
