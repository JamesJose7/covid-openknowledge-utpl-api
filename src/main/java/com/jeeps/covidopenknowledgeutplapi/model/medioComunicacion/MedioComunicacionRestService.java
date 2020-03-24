package com.jeeps.covidopenknowledgeutplapi.model.medioComunicacion;

import com.jeeps.covidopenknowledgeutplapi.model.redes.Redes;
import com.jeeps.covidopenknowledgeutplapi.model.redes.RedesRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ExampleProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RepositoryRestResource(collectionResourceRel = "mediosComunicacion", path = "mediosComunicacion", itemResourceRel = "mediosComunicacion")
@Api(tags = {"Medio Comunicacion Entity"})
@CrossOrigin(origins = "*")
public class MedioComunicacionRestService {
    @Autowired
    private MedioComunicacionRepository medioComunicacionRepository;
    @Autowired
    private RedesRepository redesRepository;

    @GetMapping(value = "/api/v1/mediosComunicacion", produces = "application/json")
    public MedioComunicacionJsonResponse findAllMediosComunicacion() {
        List<MedioComunicacion> all = medioComunicacionRepository.findAll();
        Map<String, List<MedioComunicacion>> listMap = new HashMap<>();
        listMap.put("mediosComunicacion", all);
        return new MedioComunicacionJsonResponse(listMap);
    }

    @GetMapping("/api/v1/mediosComunicacion/{id}")
    public ResponseEntity<Object> findMedioComunicacion(@RequestParam("id") Long id) {
        Optional<MedioComunicacion> optionalMedioComunicacion = medioComunicacionRepository.findById(id);
        if (optionalMedioComunicacion.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(optionalMedioComunicacion.get());
    }

    @PostMapping("/api/v1/mediosComunicacion")
    public MedioComunicacion saveMedioComunicacion(MedioComunicacion medioComunicacion) {
        MedioComunicacion savedEntity = medioComunicacionRepository.save(medioComunicacion);
        return savedEntity;
    }

    @PutMapping("/api/v1/mediosComunicacion/{id}")
    public ResponseEntity<Object> updateMedioComunicacion(MedioComunicacion medioComunicacion,
                                                  @RequestParam("id") Long id) {
        Optional<MedioComunicacion> optionalMedioComunicacion = medioComunicacionRepository.findById(id);
        if (optionalMedioComunicacion.isEmpty())
            return ResponseEntity.notFound().build();
        medioComunicacion.getRedes().setId(optionalMedioComunicacion.get().getRedes().getId());
        Redes tempRedes = medioComunicacion.getRedes();
        tempRedes.setMedioComunicacion(null);
        redesRepository.save(tempRedes);
        MedioComunicacion savedEntity = medioComunicacionRepository.save(medioComunicacion);
        return ResponseEntity.ok(savedEntity);
    }

    @DeleteMapping("/api/v1/mediosComunicacion/{id}")
    public ResponseEntity<Object> deleteMedioComunicacion(@RequestParam("id") Long id) {
        Optional<MedioComunicacion> optionalMedioComunicacion = medioComunicacionRepository.findById(id);
        if (optionalMedioComunicacion.isEmpty())
            return ResponseEntity.notFound().build();
        medioComunicacionRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
