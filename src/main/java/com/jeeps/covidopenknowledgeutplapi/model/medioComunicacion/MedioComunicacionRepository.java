package com.jeeps.covidopenknowledgeutplapi.model.medioComunicacion;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "mediosDeComunicacion", path = "mediosDeComunicacion", exported = false)
@CrossOrigin(origins = "*")
public interface MedioComunicacionRepository extends CrudRepository<MedioComunicacion, Long> {
    List<MedioComunicacion> findAll();
}
