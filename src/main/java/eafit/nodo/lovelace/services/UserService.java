package eafit.nodo.lovelace.services;

import eafit.nodo.lovelace.dtos.UserDTO;
import eafit.nodo.lovelace.dtos.UserDataDto;
import eafit.nodo.lovelace.utils.ApiResponse;


import java.util.List;

public interface UserService {
    List<UserDTO> findAll();

    List<UserDataDto> findAllWithSuggestions();

    ApiResponse<UserDTO> create(UserDTO userDTO);

    ApiResponse<UserDataDto> getUserById(Long id);
}
