package id.co.digipos.model.entity;

import id.co.digipos.common.base.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_PRODUCT_TYPE")
public class ProductType extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_type_code")
    private String productTypeCode;

    @Column(length = 50)
    private String name;

    @Column(length = 1)
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
