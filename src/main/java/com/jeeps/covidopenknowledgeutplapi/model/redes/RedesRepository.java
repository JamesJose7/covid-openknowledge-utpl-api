package com.jeeps.covidopenknowledgeutplapi.model.redes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@RepositoryRestResource(collectionResourceRel = "redes", path = "redes", exported = false)
@CrossOrigin(origins = "*")
public interface RedesRepository extends CrudRepository<Redes, Long> {
}
