package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.entities.Preferences;
import eafit.nodo.lovelace.entities.Suggestions;
import eafit.nodo.lovelace.entities.User;
import eafit.nodo.lovelace.repositories.PreferencesRepository;
import eafit.nodo.lovelace.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferencesServiceImpl implements PreferencesService {

    @Autowired
    PreferencesRepository repository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void insertPreferences(Suggestions createPreferesDto, Long id_user) {

        Preferences newPreferences = Preferences.builder().build();

        User user = userRepository.findById(id_user).get();

        newPreferences.setUser(user);
        newPreferences.setActivity(createPreferesDto.getActivity());
        newPreferences.setAge(createPreferesDto.getAge());
        newPreferences.setClimate(createPreferesDto.getClimate());
        newPreferences.setDuration(createPreferesDto.getDuration());
        newPreferences.setHousing(createPreferesDto.getHousing());

        repository.save(newPreferences);
    }
}
