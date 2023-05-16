package untitled.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import untitled.domain.*;

@RestController
// @RequestMapping(value="/users")
@Transactional
public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @PutMapping("/users/search/findByLoginId")
    public Object findByLoginId(@RequestBody UsersViewQuery query) {
        return usersRepository.findByLoginId(query.getLoginId());
    }
}
