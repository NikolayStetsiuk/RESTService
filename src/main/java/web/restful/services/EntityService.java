package web.restful.services;

import web.restful.domain.BaseEntity;
import web.restful.domain.Users;

import java.util.List;
import java.util.Optional;


public interface EntityService <E extends BaseEntity>{

    public E create(E entity);

    public void deleteByID(Long id);

    public Optional<E> getById(Long id);

    public E update();

    public List<E> ListAll(E entities);

    public List<E> read();

    public Iterable<E> save();

}
