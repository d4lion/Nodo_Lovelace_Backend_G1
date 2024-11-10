package eafit.nodo.lovelace.repositories;


import eafit.nodo.lovelace.entities.SuggestionsHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SuggestionHistoryRepository extends JpaRepository<SuggestionsHistory, UUID> {
}
