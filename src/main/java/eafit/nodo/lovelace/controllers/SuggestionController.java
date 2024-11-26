package eafit.nodo.lovelace.controllers;

import eafit.nodo.lovelace.dtos.SuggestionHistoryDto;
import eafit.nodo.lovelace.entities.Suggestions;
import eafit.nodo.lovelace.services.SuggestionServiceImpl;
import eafit.nodo.lovelace.utils.ApiResponse;
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
    public ResponseEntity<ApiResponse<Suggestions>> getSuggestionsByUserInput(@RequestBody SuggestionHistoryDto filters) {
        Suggestions suggestions = suggestionService.getSuggestionsByFilters(filters);

        if (suggestions == null) {
            return ResponseEntity.status(404)
                    .body(new ApiResponse<>(null, "Suggestion not found"));
        }

        return ResponseEntity.ok(new ApiResponse<>(suggestions, null));
    }
}
