package eafit.nodo.lovelace.controllers;

import eafit.nodo.lovelace.repositories.SuggestionHistoryRepository;
import eafit.nodo.lovelace.services.SuggestionHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/history")
@CrossOrigin(origins = "*")
public class HistorySuggestionController {

    @Autowired
    SuggestionHistoryServiceImpl suggestionHistoryServiceImpl;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getSuggestionHistoryById(@PathVariable UUID id) {

        if (suggestionHistoryServiceImpl.getSuggestionHistoryById(id) != null) {
            return ResponseEntity.status(404).body(Map.of("error", "Suggestion no found"));
        }

        return ResponseEntity.ok(suggestionHistoryServiceImpl.getSuggestionHistoryById(id));
    }
}
