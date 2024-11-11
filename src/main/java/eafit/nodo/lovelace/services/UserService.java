package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.dtos.UserDTO;
import eafit.nodo.lovelace.entities.User;
import eafit.nodo.lovelace.utils.ApiResponse;


import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();

    ApiResponse<UserDTO> create(UserDTO userDTO);

    ApiResponse<User> getUserById(Long id);
}
