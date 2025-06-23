package ar.com.gestor.dao;

import ar.com.gestor.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRolDao extends JpaRepository<Rol,Integer > {
    @Query("select c from Rol c where c.descripcion like ?1")
    public List<Rol> findByDescripcion (String descripcion);
}
