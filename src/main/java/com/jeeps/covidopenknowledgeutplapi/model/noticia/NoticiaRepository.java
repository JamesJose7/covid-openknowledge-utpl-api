package com.jeeps.covidopenknowledgeutplapi.model.noticia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource()
public interface NoticiaRepository extends CrudRepository<Noticia, Long> {
}
