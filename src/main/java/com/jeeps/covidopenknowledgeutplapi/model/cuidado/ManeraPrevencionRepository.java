package com.jeeps.covidopenknowledgeutplapi.model.cuidado;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@RepositoryRestResource(collectionResourceRel = "manerasPrevencion", path = "manerasPrevencion")
@CrossOrigin(origins = "*")
public interface ManeraPrevencionRepository extends CrudRepository<ManeraPrevencion, Long> {
}
