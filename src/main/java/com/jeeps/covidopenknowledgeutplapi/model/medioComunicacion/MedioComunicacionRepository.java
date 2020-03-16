package com.jeeps.covidopenknowledgeutplapi.model.medioComunicacion;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "mediosComunicacion", path = "mediosComunicacion")
public interface MedioComunicacionRepository extends CrudRepository<MedioComunicacion, Long> {
}
