package lk.epic.spring.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Amayuru indeewara
 * @created 30/11/2022 - 13:09
 * @project EpicLoginApp
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserDTO {
    private String userID;
    private String userName;
    private String address;
    private String email;
    private String contact;
    private String password;
    private String createTime;
    private String lastUpdateTime;
}
