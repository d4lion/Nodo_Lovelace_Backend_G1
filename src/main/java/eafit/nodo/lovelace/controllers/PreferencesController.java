package eafit.nodo.lovelace.controllers;


import eafit.nodo.lovelace.dtos.CreatePreferesDto;
import eafit.nodo.lovelace.services.PreferencesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/preferences")
@CrossOrigin(origins = "*")
public class PreferencesController {

    @Autowired
    private PreferencesServiceImpl preferencesService;

    @PostMapping("/create")
    public ResponseEntity<Object> createPreferences(@RequestBody CreatePreferesDto createPreferesDto) {
        CreatePreferesDto response = preferencesService.insertPreferences(createPreferesDto);


        return ResponseEntity.ok(response);

    }
}
