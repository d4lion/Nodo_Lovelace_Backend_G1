package eafit.nodo.lovelace.controllers;

import eafit.nodo.lovelace.entities.Suggestions;
import eafit.nodo.lovelace.services.SuggestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/suggestions")
public class SuggestionController {
    @Autowired
    private SuggestionServiceImpl suggestionService;

    @PostMapping("/filter")
    public ResponseEntity<List<Suggestions>> getSuggestionsByUserInput(@RequestBody Map<String, String> filters) {
        List<Suggestions> suggestions = suggestionService.getSuggestionsByFilters(filters);

        if (suggestions.isEmpty()) {
            return ResponseEntity.badRequest().body(null);
        }

        return ResponseEntity.ok(suggestions);
    }
}
