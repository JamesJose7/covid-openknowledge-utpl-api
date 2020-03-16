package com.jeeps.covidopenknowledgeutplapi.model.cuidado;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuidadoRepository extends CrudRepository<Cuidado, Long> {
}
