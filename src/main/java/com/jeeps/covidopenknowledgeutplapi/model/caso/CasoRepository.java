package com.jeeps.covidopenknowledgeutplapi.model.caso;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@RepositoryRestResource(collectionResourceRel = "casos", path = "casos")
@CrossOrigin(origins = "*")
public interface CasoRepository extends CrudRepository<Caso, Long> {
}
