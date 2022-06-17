package com.ahmedelzubair.simplifiedlinkedin.addresses.controller;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.ContinentDTO;
import com.ahmedelzubair.simplifiedlinkedin.addresses.service.ContinentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController("api/v1/address/continent")
public class ContinentController {

    private final ContinentService continentService;

    public ContinentController(ContinentService continentService) {
        this.continentService = continentService;
    }

    @PostMapping("/create")
    public ResponseEntity<ContinentDTO>
    createContinent(@RequestBody ContinentDTO continentDTO) {
        ContinentDTO createdContinent = continentService.createContinent(continentDTO);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(createdContinent.getId()).toUri();

        return ResponseEntity.created(location).body(createdContinent);
    }

    @PutMapping("/update")
    public ResponseEntity<ContinentDTO>
    updateContinent(@RequestBody ContinentDTO continentDTO) {
        return ResponseEntity.ok(continentService.updateContinent(continentDTO));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void>
    deleteContinent(@RequestBody ContinentDTO continentDTO) {
        continentService.deleteContinent(continentDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<Void>
    deleteContinentById(@PathVariable Long id) {
        continentService.deleteContinentById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContinentDTO> getContinent(@PathVariable Long id) {
        return ResponseEntity.ok(continentService.findContinentById(id));
    }

    @GetMapping("/{name}")
    public ResponseEntity<ContinentDTO> getContinentByName(@PathVariable String name) {
        return ResponseEntity.ok(continentService.findContinentByName(name));
    }


}
