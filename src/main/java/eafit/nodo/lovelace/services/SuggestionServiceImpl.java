package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.entities.Suggestions;
import eafit.nodo.lovelace.repositories.SuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class SuggestionServiceImpl {

    @Autowired
    private SuggestionRepository suggestionRepository;

    public List<Suggestions> getSuggestionsByFilters(Map<String, String> suggestions) {
        // Extraer filtros del JSON
        String climate = suggestions.get("climate");
        String activity = suggestions.get("activity");
        String housing = suggestions.get("housing");
        String duration = suggestions.get("duration");
        String age = suggestions.get("age");
        
        // Consultar las sugerencias con base en los filtros
        return suggestionRepository.findByFilters(climate, activity, housing, duration, age);
    }
}