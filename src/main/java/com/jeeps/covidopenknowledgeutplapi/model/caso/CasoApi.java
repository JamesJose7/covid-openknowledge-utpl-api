package com.jeeps.covidopenknowledgeutplapi.model.caso;

import com.jeeps.covidopenknowledgeutplapi.model.posibleContagio.PosibleContagio;
import com.jeeps.covidopenknowledgeutplapi.model.posibleContagio.PosibleContagioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class CasoApi {
    @Autowired
    private CasoRepository casoRepository;
    @Autowired
    private PosibleContagioRepository posibleContagioRepository;

    @GetMapping("/api/v1/casos")
    public Iterable<Caso> findAllCasos() {
        return casoRepository.findAll();
    }

    @PostMapping(value = "/api/v1/casos", produces = "application/json")
    public ResponseEntity<Object> postCaso(@RequestBody Caso caso) {
        casoRepository.save(caso);
        return ResponseEntity.ok().body("{ message: \"saved successfully\" }");
    }

    @PostMapping(value = "/api/v1/casos/{casoId}/posibleContagio", produces = "application/json")
    public ResponseEntity<Object> postPosibleContagio(@RequestBody PosibleContagio posibleContagio,
                                                      @RequestParam("casoId") Long id) {
        Optional<Caso> casoOptional = casoRepository.findById(id);
        if (!casoOptional.isPresent())
            return ResponseEntity.notFound().build();
        Caso caso = casoOptional.get();
        posibleContagio.setCaso(caso);
        caso.addPosibleContagio(posibleContagio);
        casoRepository.save(caso);
        return ResponseEntity.ok().body("{ message: \"posible caso added successfully\" }");
    }
}
