package eafit.nodo.lovelace.controllers;

import eafit.nodo.lovelace.dtos.UserDTO;
import eafit.nodo.lovelace.entities.User;
import eafit.nodo.lovelace.services.UserServiceImpl;
import eafit.nodo.lovelace.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{id}")
    // Ideal de retorno --> ResponseEntity<ApiResponse<User>>
    public ResponseEntity<Object> getUserById(@PathVariable Long id) {

        if (userService.getUserById(id).getError() != null) {
            return ResponseEntity.badRequest().body(Map.of("error", "User not found"));
        }

        return ResponseEntity.ok(userService.getUserById(id).getData());
    }

    @PostMapping("/create")
    // Ideal de retorno --> ResponseEntity<ApiResponse<UserDTO>>
    public ResponseEntity<Object> create(@RequestBody UserDTO userDTO) {
        ApiResponse<UserDTO> creationResponse = userService.create(userDTO);

        // Si se intenta crear un usuario que ya existe
        if (creationResponse.getError() != null) {
            return ResponseEntity.badRequest().body(Map.of("error", "User already exists"));
        }

        return ResponseEntity.ok(creationResponse.getData());
    }
}
