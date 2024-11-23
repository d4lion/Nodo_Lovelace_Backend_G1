package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.entities.Suggestions;

public interface SuggestionHistoryService {
    void insertSuggestion(Suggestions suggestionHistory, Long id_user);
}
