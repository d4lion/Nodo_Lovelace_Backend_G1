package eafit.nodo.lovelace.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eafit.nodo.lovelace.entities.SuggestionHistory;


@Repository
public interface SuggestionHistoryRepository extends JpaRepository<SuggestionHistory, Integer> {
}
