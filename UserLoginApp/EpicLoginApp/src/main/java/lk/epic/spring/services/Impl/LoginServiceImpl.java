package lk.epic.spring.services.Impl;

import lk.epic.spring.DTO.UserDTO;
import lk.epic.spring.Entity.User;
import lk.epic.spring.repo.LoginRepo;
import lk.epic.spring.repo.UserRepo;
import lk.epic.spring.services.LoginService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Amayuru indeewara
 * @created 05/12/2022 - 12:49
 * @project EpicLoginApp
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepo loginRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO searchUser(String userID) {
        if (loginRepo.existsById(userID)){
            User user = loginRepo.findById(userID).get();
            return modelMapper.map(user, UserDTO.class);
        }else {
            throw new RuntimeException("no user for "+userID+"...!");
        }
    }

    public List<UserDTO> fetchAllUser() {
        List<User> all = loginRepo.findAll();
        return modelMapper.map(all, new TypeToken<List<UserDTO>>(){

        }.getType());
    }
}
