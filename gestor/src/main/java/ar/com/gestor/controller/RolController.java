package ar.com.gestor.controller;

import ar.com.gestor.entities.Rol;
import ar.com.gestor.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RolController {

    @Autowired
    IRolService entityService;

    @GetMapping(path = "/rol")
    public List<Rol> getAll(){
        return entityService.getAll();
    }

    @GetMapping(path = "/rol/{id}")
    public Rol get(@PathVariable Integer id){
        return entityService.get(id);
    }

    @GetMapping(path = "/rol/search/{expresion}")
    public List<Rol> getListRol(@PathVariable String expresion){
        return entityService.findByDescripcion(expresion);
    }

    @PostMapping(value = "/rol", consumes = "application/json", produces = "application/json")
    public Rol save(@RequestBody Rol entity){
        entityService.save(entity);
        return entity;
    }

    @GetMapping(path = "/rol/delete/{id}")
    public String delete(@PathVariable Integer id){
        Rol entity = null;
        try {
            entity = entityService.get(id);
            entityService.delete(entity);
            return null;
        }catch (Exception e){
            return e.getMessage().toString();
        }
    }

}
