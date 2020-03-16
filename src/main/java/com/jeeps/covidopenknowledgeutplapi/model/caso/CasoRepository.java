package com.jeeps.covidopenknowledgeutplapi.model.caso;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasoRepository extends CrudRepository<Caso, Long> {
}
