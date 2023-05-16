package untitled.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersRepository
    extends PagingAndSortingRepository<Users, Long> {
    List<Users> findByLoginId(String loginId);
}
