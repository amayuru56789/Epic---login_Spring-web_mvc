package lk.epic.spring.controller;

import lk.epic.spring.DTO.UserDTO;
import lk.epic.spring.services.LoginService;
import lk.epic.spring.services.UserService;
import lk.epic.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Amayuru indeewara
 * @created 30/11/2022 - 10:00
 * @project EpicLoginApp
 */
@RestController
@RequestMapping("avc/login")
@CrossOrigin
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping(params = {"userName", "password"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil userLogin(@RequestParam String userName, String password){
        System.out.println(userName+" "+password);
        for (UserDTO dto : loginService.fetchAllUser()) {
            if(dto.getUserName().equalsIgnoreCase(userName) & dto.getPassword().equalsIgnoreCase(password)){
                return new ResponseUtil(200, "Ok", null);
            }else {
                return new ResponseUtil(400, "error", null);
            }
        }

        return new ResponseUtil(400, "error", null);
    }
}
