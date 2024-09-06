package id.co.digipos.model.entity;

import id.co.digipos.common.base.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_PRODUCT")
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_code", length = 16)
    private String productCode;

    @Column(name = "product_type_code", length = 16)
    private String productTypeCode;

    @Column(name = "name", length = 150)
    private String name;

    @Column(name = "active_flag", length = 1)
    private boolean activeFlag;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
