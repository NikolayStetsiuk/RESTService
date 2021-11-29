package web.restful.repository;

import org.springframework.data.repository.CrudRepository;
import web.restful.domain.BaseEntity;
import web.restful.domain.Users;

public interface UserRepositiry extends CrudRepository <Users ,Long> {
}
