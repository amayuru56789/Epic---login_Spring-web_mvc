package lk.epic.spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Amayuru indeewara
 * @created 30/11/2022 - 12:51
 * @project EpicLoginApp
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

@Entity
public class User {
    @Id
    private String userID;
    private String userName;
    private String address;
    private String email;
    private String contact;
    private String password;
    private String createTime;
    private String lastUpdateTime;
}
