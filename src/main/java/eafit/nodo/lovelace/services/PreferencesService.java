package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.entities.Suggestions;

public interface PreferencesService {
    void insertPreferences(Suggestions createPreferesDto, Long id_user);
}

