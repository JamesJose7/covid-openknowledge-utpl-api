package com.jeeps.covidopenknowledgeutplapi.model.sintoma;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "*")
public interface SintomaRepository extends CrudRepository<Sintoma, Long> {
}
