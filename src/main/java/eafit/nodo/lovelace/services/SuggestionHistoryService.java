package eafit.nodo.lovelace.services;


import eafit.nodo.lovelace.dtos.SuggestionHistoryDto;
import eafit.nodo.lovelace.dtos.UserDataDto;
import eafit.nodo.lovelace.entities.SuggestionHistory;
import eafit.nodo.lovelace.entities.Suggestions;
import eafit.nodo.lovelace.utils.ApiResponse;

import java.util.Optional;
import java.util.UUID;

public interface SuggestionHistoryService {
    void insertSuggestion(Suggestions suggestionHistory, Long id_user);
    ApiResponse<SuggestionHistoryDto> getSuggestionHistoryById(UUID id);
    void deleteSuggestion(UUID id);
}
