package com.jeeps.covidopenknowledgeutplapi.model.herramienta;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "*")
public interface HerramientaRepository extends CrudRepository<Herramienta, Long> {
}
