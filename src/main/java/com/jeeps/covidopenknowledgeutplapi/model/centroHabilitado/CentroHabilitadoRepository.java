package com.jeeps.covidopenknowledgeutplapi.model.centroHabilitado;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "centrosHabilitados", path = "centrosHabilitados")
public interface CentroHabilitadoRepository extends CrudRepository<CentroHabilitado, Long> {
}
