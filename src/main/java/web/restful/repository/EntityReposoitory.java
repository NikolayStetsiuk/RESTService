package web.restful.repository;

import org.springframework.data.repository.CrudRepository;
import web.restful.domain.BaseEntity;

public interface EntityReposoitory <E extends BaseEntity> extends CrudRepository <E, Long> {
}
