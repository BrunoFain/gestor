package ar.com.gestor.serviceimp;

import ar.com.gestor.dao.IRolDao;
import ar.com.gestor.entities.Rol;
import ar.com.gestor.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RolService implements IRolService {
    @Autowired
    private IRolDao entityDao;

    public List<Rol> getAll() {
        return entityDao.findAll(Sort.by(Sort.Direction.ASC, "descripcion"));
    }

    public List<Rol> findByDescripcion(String descripcion) {
        return entityDao.findByDescripcion("%" + descripcion + "%");
    }

    public Rol get(Integer id) {
        return entityDao.findById(id).orElse(null);
    }
    @Transactional
    public void save(Rol entity) {
    entityDao.save(entity);
    }

    @Transactional
    public String delete(Rol entity) {
        try{
            entityDao.delete(entity);
            return null;
        }catch (Exception e){
            return e.getMessage().toString();
        }
    }
}
