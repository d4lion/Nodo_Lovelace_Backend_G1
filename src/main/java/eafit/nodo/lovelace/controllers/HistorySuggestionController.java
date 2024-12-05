package eafit.nodo.lovelace.controllers;

import eafit.nodo.lovelace.dtos.DeleteSuggestionDto;
import eafit.nodo.lovelace.services.SuggestionHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Map;
import java.util.UUID;


@RestController
@RequestMapping("api/v1/history")
@CrossOrigin(origins = "http://localhost:4200")
public class HistorySuggestionController {

    @Autowired
    SuggestionHistoryServiceImpl suggestionHistoryServiceImpl;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getSuggestionHistoryById(@PathVariable UUID id) {

        if (suggestionHistoryServiceImpl.getSuggestionHistoryById(id).getData() == null) {
            return ResponseEntity.status(404).body(Map.of("error", "Suggestion no found"));
        }
        return ResponseEntity.ok(suggestionHistoryServiceImpl.getSuggestionHistoryById(id));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteSuggestion(@RequestBody DeleteSuggestionDto request) throws InterruptedException {
        suggestionHistoryServiceImpl.deleteSuggestion(request.getId());
        Thread.sleep(100);
        return ResponseEntity.ok(Map.of("message", "Suggestion deleted"));
    }
}
