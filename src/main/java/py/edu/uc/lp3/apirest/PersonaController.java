package py.edu.uc.lp3.apirest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


import java.util.*;

@RestController
@RequestMapping("/personasxx")

public class PersonaController {

    private static final Logger log = LoggerFactory.getLogger(PersonaController.class);


    private static final Map<Long, Persona> personas = new HashMap<>();

    static {
        personas.put(1L, new Persona(1L, "Juan", "Pérez"));
        personas.put(2L, new Persona(2L, "Ana", "García"));
    }

    @GetMapping
    public List<Persona> getAllPersonas() {
        log.info("Se ha recibido una solicitud para obtener todas las personas");
        return new ArrayList<>(personas.values());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable Long id) {
        log.info("Se ha recibido una solicitud para obtener la persona con ID {}", id);
        return personas.containsKey(id) ?
                ResponseEntity.ok(personas.get(id)) :
                ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Persona> createPersona(@RequestBody Persona persona) {
        log.info("Se ha recibido una solicitud para crear una nueva persona: {}", persona);
        long nextId = personas.size() + 1;
        persona.setId(nextId);
        personas.put(nextId, persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(persona);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Persona> updatePersona(@PathVariable Long id, @RequestBody Persona persona) {
        log.info("Se ha recibido una solicitud para actualizar la persona con ID {}", id);
        if (personas.containsKey(id)) {
            persona.setId(id);
            personas.put(id, persona);
            return ResponseEntity.ok(persona);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable Long id)
    {
        log.info("Se ha recibido una solicitud para eliminar la persona con ID {}", id);
        personas.remove(id);
        return ResponseEntity.noContent().build();
    }
}