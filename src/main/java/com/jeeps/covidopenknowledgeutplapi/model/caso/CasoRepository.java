package com.jeeps.covidopenknowledgeutplapi.model.caso;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "casos", path = "casos")
public interface CasoRepository extends CrudRepository<Caso, Long> {
}
