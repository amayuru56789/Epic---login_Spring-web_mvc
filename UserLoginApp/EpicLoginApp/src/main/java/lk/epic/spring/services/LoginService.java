package lk.epic.spring.services;

import lk.epic.spring.DTO.UserDTO;

import java.util.List;

/**
 * @author Amayuru indeewara
 * @created 30/11/2022 - 18:59
 * @project EpicLoginApp
 */
public interface LoginService {
    public UserDTO searchUser(String userID);
    public List<UserDTO> fetchAllUser();
}
