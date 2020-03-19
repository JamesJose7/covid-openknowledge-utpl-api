package com.jeeps.covidopenknowledgeutplapi.model.redes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(exported = false)
public interface RedesRepository extends CrudRepository<Redes, Long> {
}
