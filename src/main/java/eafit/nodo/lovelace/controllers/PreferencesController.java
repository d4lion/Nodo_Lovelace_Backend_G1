package eafit.nodo.lovelace.controllers;


import eafit.nodo.lovelace.dtos.CreatePreferesDto;
import eafit.nodo.lovelace.dtos.PreferencesDto;
import eafit.nodo.lovelace.dtos.UserDTO;
import eafit.nodo.lovelace.services.PreferencesService;
import eafit.nodo.lovelace.services.PreferencesServiceImpl;
import eafit.nodo.lovelace.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/preferences")
public class PreferencesController {

    @Autowired
    private PreferencesServiceImpl preferencesService;

    @PostMapping("/create")
    public ResponseEntity<Object> createPreferences(@RequestBody CreatePreferesDto createPreferesDto) {
        CreatePreferesDto response = preferencesService.insertPreferences(createPreferesDto);


        return ResponseEntity.ok(response);

    }
}
