package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.dtos.UserDTO;
import eafit.nodo.lovelace.dtos.UserDataDto;
import eafit.nodo.lovelace.entities.User;
import eafit.nodo.lovelace.mappers.UserDataMapper;
import eafit.nodo.lovelace.mappers.UserMapper;
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
    public List<UserDTO> findAll() {

        List<User> users = repository.findAll();

        return users.stream().map(UserMapper.mapper::userToUserDTO).toList();
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
    public ApiResponse<UserDataDto> getUserById(Long id) {

        Optional<User> reponse = repository.findById(id);

        return reponse.map(user -> new ApiResponse<>(UserDataMapper.mapper.userToUserDataDTO(user), null))
                .orElseGet(() -> new ApiResponse<>(null, "User not found"));

    }
}