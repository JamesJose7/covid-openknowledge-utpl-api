package com.jeeps.covidopenknowledgeutplapi.model.noticia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends CrudRepository<Noticia, Long> {
}
