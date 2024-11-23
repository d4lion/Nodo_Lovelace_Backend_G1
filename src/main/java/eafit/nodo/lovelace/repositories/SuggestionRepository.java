package eafit.nodo.lovelace.repositories;

import eafit.nodo.lovelace.entities.SuggestionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuggestionRepository extends JpaRepository<eafit.nodo.lovelace.entities.SuggestionHistory, Integer> {

    @Query("SELECT s FROM SuggestionHistory s WHERE " +
            "(:climate IS NULL OR s.climate = :climate) AND " +
            "(:activity IS NULL OR s.activity = :activity) AND " +
            "(:housing IS NULL OR s.housing = :housing) AND " +
            "(:duration IS NULL OR s.duration = :duration) AND " +
            "(:age IS NULL OR CAST(s.age AS string) = :age)")
    List<SuggestionHistory> findByFilters(@Param("climate") String climate,
                                   @Param("activity") String activity,
                                   @Param("housing") String housing,
                                   @Param("duration") String duration,
                                   @Param("age") String age);
}