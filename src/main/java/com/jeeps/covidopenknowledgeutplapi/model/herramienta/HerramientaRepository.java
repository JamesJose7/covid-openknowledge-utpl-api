package com.jeeps.covidopenknowledgeutplapi.model.herramienta;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HerramientaRepository extends CrudRepository<Herramienta, Long> {
}
