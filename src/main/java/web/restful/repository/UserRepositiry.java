package web.restful.repository;

import org.springframework.data.repository.CrudRepository;
import web.restful.domain.User;

public interface UserRepositiry extends CrudRepository <User,Long> {
}
