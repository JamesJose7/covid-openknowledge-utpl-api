package com.jeeps.covidopenknowledgeutplapi.model.noticia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@RepositoryRestResource()
@CrossOrigin(origins = "*")
public interface NoticiaRepository extends CrudRepository<Noticia, Long> {
    List<Noticia> findAllByEstadoCuarentenaIsTrue();
}
