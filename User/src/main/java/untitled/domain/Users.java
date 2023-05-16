package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import untitled.UserApplication;
import untitled.domain.UsersAdd;

@Entity
@Table(name = "Users_table")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String loginId;

    private String pw;

    private Boolean isAdmin;

    private String phoneNumber;

    @ElementCollection
    private List<DepartmentId> departmentId;

    @PostPersist
    public void onPostPersist() {
        UsersAdd usersAdd = new UsersAdd(this);
        usersAdd.publishAfterCommit();
    }

    public static UsersRepository repository() {
        UsersRepository usersRepository = applicationContext()
            .getBean(UsersRepository.class);
        return usersRepository;
    }

    public static ApplicationContext applicationContext() {
        return UserApplication.applicationContext;
    }
}
