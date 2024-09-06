package id.co.digipos.model.entity;

import id.co.digipos.common.base.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_CONFIG_PARAM")
public class ConfigParam extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "key_param", length = 50)
    private String keyParam;

    @Column(length = 150)
    private String name;

    private String description;

    @Column(name = "active_flag", length = 1)
    private boolean activeFlag;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKeyParam() {
        return keyParam;
    }

    public void setKeyParam(String keyParam) {
        this.keyParam = keyParam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }
}
