package eafit.nodo.lovelace.repositories;

import eafit.nodo.lovelace.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Integer> {
}
