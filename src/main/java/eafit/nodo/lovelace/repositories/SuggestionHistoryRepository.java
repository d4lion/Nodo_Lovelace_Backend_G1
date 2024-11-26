package eafit.nodo.lovelace.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface SuggestionHistoryRepository extends JpaRepository<eafit.nodo.lovelace.entities.SuggestionHistory, UUID> {
}
