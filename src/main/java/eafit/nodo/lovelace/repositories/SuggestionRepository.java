package eafit.nodo.lovelace.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuggestionRepository extends JpaRepository<eafit.nodo.lovelace.entities.SuggestionHistory, Integer> {
}
