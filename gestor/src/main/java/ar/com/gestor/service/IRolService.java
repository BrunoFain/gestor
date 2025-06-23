package ar.com.gestor.service;

import ar.com.gestor.entities.Rol;

import java.util.List;

public interface IRolService {
    List<Rol> getAll();
    List<Rol> findByDescripcion(String descripcion);
    Rol get (Integer id);
    void save (Rol entity);
    String delete (Rol entity);
}
