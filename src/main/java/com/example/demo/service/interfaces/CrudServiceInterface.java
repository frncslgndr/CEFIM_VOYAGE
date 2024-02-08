package com.example.demo.service.interfaces;

import java.util.List;

//Interface pour les services, à l'image de l'interface des controller
public interface CrudServiceInterface<T> {

    void create(T object);

    List<T> list();

    T read(int id) throws Exception;

    void update(int id, T object) throws Exception;

    void delete(int id) throws Exception;

}
