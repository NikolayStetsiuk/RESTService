package web.restful.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import web.restful.domain.BaseEntity;
import web.restful.domain.Users;
import web.restful.services.EntityService;
import web.restful.services.UserService;

import java.util.List;
import java.util.Optional;

public  class BaseController <E extends BaseEntity>{

    EntityService entityService;

    public BaseController(EntityService entityService) {
        this.entityService = entityService;
    }

    @GetMapping
    public List<E> read() {
        return entityService.read();
    }

    @PostMapping("/save")
    public Iterable<E> save(){
        return entityService.save();
    }

    @GetMapping("/get/{id}")
    public Optional<E> getById(@PathVariable("id") String id){
        return entityService.getById(Long.valueOf(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteByID(@PathVariable("id") String id){
        entityService.deleteByID(Long.valueOf(id));
    }

}

