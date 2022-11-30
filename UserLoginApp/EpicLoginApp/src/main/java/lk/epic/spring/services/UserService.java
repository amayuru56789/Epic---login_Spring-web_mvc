package lk.epic.spring.services;

import lk.epic.spring.DTO.UserDTO;

import java.util.List;

/**
 * @author Amayuru indeewara
 * @created 30/11/2022 - 18:58
 * @project EpicLoginApp
 */
public interface UserService {
    public void saveUser(UserDTO dto);
    public void deleteUser(String userID);
    public void updateUser(UserDTO dto);
    public UserDTO searchUser(String userID);
    public List<UserDTO> getAllUsers();
}
