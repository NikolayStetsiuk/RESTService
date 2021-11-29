package web.restful.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users  extends BaseEntity {

    private int UserId;
    private String title;
    private String body;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
