package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.dtos.SuggestionDto;
import eafit.nodo.lovelace.dtos.SuggestionHistoryDto;
import eafit.nodo.lovelace.entities.SuggestionHistory;
import eafit.nodo.lovelace.entities.Suggestions;
import eafit.nodo.lovelace.entities.User;
import eafit.nodo.lovelace.repositories.SuggestionHistoryRepository;
import eafit.nodo.lovelace.repositories.SuggestionRepository;
import eafit.nodo.lovelace.repositories.UserRepository;
import eafit.nodo.lovelace.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class SuggestionServiceImpl {

    @Autowired
    private SuggestionRepository suggestionRepository;

    @Autowired
    SuggestionHistoryServiceImpl suggestionHistoryServiceImpl;

    @Autowired
    UserRepository userRepository;

    public Suggestions getSuggestionsByFilters(SuggestionHistoryDto suggestions) {

        String climate = suggestions.getClimate();
        String activity = suggestions.getActivity();
        String housing = suggestions.getHousing();
        String duration = suggestions.getDuration();
        String age = suggestions.getAge();
        Long id_user = suggestions.getUser_id();

        Suggestions finalSuggestionResp = suggestionRepository.findByFilters(climate, activity, housing, duration, age);

        suggestionHistoryServiceImpl.insertSuggestion(finalSuggestionResp,id_user);

        return finalSuggestionResp;
    }
}