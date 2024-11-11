package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.dtos.UserDTO;
import eafit.nodo.lovelace.entities.User;
import eafit.nodo.lovelace.repositories.UserRepository;
import eafit.nodo.lovelace.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public ApiResponse<UserDTO> create(UserDTO userDTO) {

        if (userDTO == null) {
            return null;
        }

        if (repository.findById(userDTO.getId()).isPresent()) {
            return new ApiResponse<>(null, "User already exists");
        }

        LocalDate date = LocalDate.now();

        User newUser = User.builder().build();

        newUser.setId(userDTO.getId());
        newUser.setName(userDTO.getName());
        newUser.setLast_name(userDTO.getLastName());
        newUser.setEmail(userDTO.getEmail());
        newUser.setRegister_at(date);

        repository.save(newUser);

        return new ApiResponse<>(userDTO, null);
    }

    @Override
    public ApiResponse<User> getUserById(Long id) {

        Optional<User> reponse = repository.findById(id);

        return reponse.map(user -> new ApiResponse<>(user, null))
                .orElseGet(() -> new ApiResponse<>(null, "User not found"));

    }
}