package com.jeeps.covidopenknowledgeutplapi.model.posibleContagio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@RepositoryRestResource(collectionResourceRel = "posiblesContagios", path = "posiblesContagios", exported = false)
@CrossOrigin(origins = "*")
public interface PosibleContagioRepository extends CrudRepository<PosibleContagio, Long> {
}
