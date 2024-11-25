package eafit.nodo.lovelace.controllers;

import eafit.nodo.lovelace.dtos.SuggestionHistoryDto;
import eafit.nodo.lovelace.entities.Suggestions;
import eafit.nodo.lovelace.services.SuggestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/suggestions")
@CrossOrigin(origins = "*")
public class SuggestionController {
    @Autowired
    private SuggestionServiceImpl suggestionService;

    @PostMapping("/filter")
    public ResponseEntity<Suggestions> getSuggestionsByUserInput(@RequestBody SuggestionHistoryDto filters) {
        Suggestions suggestions = suggestionService.getSuggestionsByFilters(filters);

        return ResponseEntity.ok(suggestions);
    }
}
