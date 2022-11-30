package lk.epic.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amayuru indeewara
 * @created 30/11/2022 - 09:57
 * @project IntelliJ IDEA
 */

@RestController
@RequestMapping("avc/user")
@CrossOrigin
public class UserController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public void getAllUser(){
        System.out.println("hello");
    }
}
