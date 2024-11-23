package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.entities.SuggestionHistory;
import eafit.nodo.lovelace.entities.Suggestions;
import eafit.nodo.lovelace.entities.User;
import eafit.nodo.lovelace.repositories.SuggestionHistoryRepository;
import eafit.nodo.lovelace.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuggestionHistoryServiceImpl implements SuggestionHistoryService{

    @Autowired
    SuggestionHistoryRepository suggestionHistoryRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public void insertSuggestion(Suggestions suggestionHistory, Long id_user) {

        User user = userRepository.findById(id_user).get();

        SuggestionHistory suggestion = SuggestionHistory.builder().build();

        suggestion.setHousing(suggestionHistory.getHousing());
        suggestion.setAmerica_country(suggestionHistory.getAmerica_country());
        suggestion.setEuropa_country(suggestionHistory.getEuropa_country());
        suggestion.setAge(suggestionHistory.getAge());
        suggestion.setDuration(suggestionHistory.getDuration());
        suggestion.setActivity(suggestionHistory.getActivity());
        suggestion.setClimate(suggestionHistory.getClimate());
        suggestion.setUser(user);

        suggestionHistoryRepository.save(suggestion);
    }
}
