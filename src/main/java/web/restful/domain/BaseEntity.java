package web.restful.domain;

import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BaseEntity {

    @Id
    private Long ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
}
