package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.dtos.CreatePreferesDto;
import eafit.nodo.lovelace.entities.Preferences;
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
    public CreatePreferesDto insertPreferences(CreatePreferesDto createPreferesDto) {

        Preferences newPreferences = Preferences.builder().build();

        User user = userRepository.findById(createPreferesDto.getUser_id())
                .orElseThrow(() -> new RuntimeException("User not found"));

        newPreferences.setUser(user);
        newPreferences.setActivity(createPreferesDto.getActivity());
        newPreferences.setAge(createPreferesDto.getAge());
        newPreferences.setClimate(createPreferesDto.getClimate());
        newPreferences.setDuration(createPreferesDto.getDuration());
        newPreferences.setHousing(createPreferesDto.getHousing());

        repository.save(newPreferences);

        return createPreferesDto;
    }
}
