//package lk.epic.spring.services.Impl;
//
//import lk.epic.spring.DTO.UserDTO;
//import lk.epic.spring.Entity.User;
//import lk.epic.spring.repo.UserRepo;
//import lk.epic.spring.services.UserService;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.TypeToken;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
///**
// * @author Amayuru indeewara
// * @created 30/11/2022 - 19:08
// * @project EpicLoginApp
// */
//@Service
//@Transactional
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserRepo userRepo;
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @Override
//    public void saveUser(UserDTO dto) {
//        if (!userRepo.existsById(dto.getUserID())){
//            User entity = modelMapper.map(dto, User.class);
//            userRepo.save(entity);
//        }else {
//            throw new RuntimeException("User already exists...");
//        }
//    }
//
//    @Override
//    public void deleteUser(String userID) {
//        if (userRepo.existsById(userID)){
//            userRepo.deleteById(userID);
//        }else {
//            throw new RuntimeException("Please check the userID.. no such as user...!");
//        }
//    }
//
//    @Override
//    public void updateUser(UserDTO dto) {
//        if (userRepo.existsById(dto.getUserID())){
//            User entity = modelMapper.map(dto, User.class);
//            userRepo.save(entity);
//        }else {
//            throw new RuntimeException("no such as user to update.. please Check the userID...!");
//        }
//    }
//
//    @Override
//    public UserDTO searchUser(String userID) {
//        if (userRepo.existsById(userID)){
//            User user = userRepo.findById(userID).get();
//            return modelMapper.map(user, UserDTO.class);
//        }else {
//            throw new RuntimeException("no user for "+userID+"...!");
//        }
//    }
//
//    @Override
//    public List<UserDTO> getAllUsers() {
//        List<User> all = userRepo.findAll();
//        return modelMapper.map(all, new TypeToken<List<UserDTO>>(){
//
//        }.getType());
//    }
//}
