package id.co.digipos.model.entity;

import id.co.digipos.common.base.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_USER")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id", length = 16)
    private String userId;

    @Column(length = 50)
    private String name;

    @Column(name = "active_flag", length = 1)
    private boolean activeFlag;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }
}
