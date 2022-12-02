package lk.epic.spring.controller;

import lk.epic.spring.DTO.UserDTO;
import lk.epic.spring.services.UserService;
import lk.epic.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Amayuru indeewara
 * @created 30/11/2022 - 09:57
 * @project IntelliJ IDEA
 */

@RestController
@RequestMapping("avc/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllUser(){

        return new ResponseUtil(200, "Ok", userService.getAllUsers());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveUser(@ModelAttribute UserDTO user){
        userService.saveUser(user);
        return new ResponseUtil(200, "Ok", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateUser(@RequestBody UserDTO user){
        userService.updateUser(user);
        return new ResponseUtil(200, "Ok", null);
    }

    @DeleteMapping(params = {"userID"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteUser(@RequestParam String userID){
        userService.deleteUser(userID);
        return new ResponseUtil(200, "Ok", null);
    }

    @GetMapping(path = "/{userID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchUser(@PathVariable String userID){
        return new ResponseUtil(200, "Ok", userService.searchUser(userID));
    }
}
