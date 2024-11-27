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
    public ResponseEntity<Object> getSuggestionsByUserInput(@RequestBody SuggestionHistoryDto filters) {
        Suggestions suggestions = suggestionService.getSuggestionsByFilters(filters);

        if (suggestions == null) {
            System.out.println("Suggestion not found");

            SuggestionHistoryDto defaultFilterConfig = new SuggestionHistoryDto();
            defaultFilterConfig.setUser_id(filters.getUser_id());
            defaultFilterConfig.setClimate("default");
            defaultFilterConfig.setActivity("default");
            defaultFilterConfig.setHousing("default");
            defaultFilterConfig.setDuration("default");
            defaultFilterConfig.setAge("default");

            Suggestions suggestion = suggestionService.getSuggestionsByFilters(defaultFilterConfig);

            return ResponseEntity.ok(suggestion);
        }

        return ResponseEntity.ok(suggestions);
    }
}
