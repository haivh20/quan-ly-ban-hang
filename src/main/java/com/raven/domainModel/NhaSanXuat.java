
package com.raven.domainModel;


import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "NhaSX")
public class NhaSanXuat implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaNhaSanXuat", unique = true)
    private String maNhaSanXuat;

    @Column(name = "TenNhaSanXuat")
    private String tenNhaSanXuat;

    public NhaSanXuat() {
    }

    public NhaSanXuat(UUID id, String maNhaSanXuat, String tenNhaSanXuat) {
        this.id = id;
        this.maNhaSanXuat = maNhaSanXuat;
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaNhaSanXuat() {
        return maNhaSanXuat;
    }

    public void setMaNhaSanXuat(String maNhaSanXuat) {
        this.maNhaSanXuat = maNhaSanXuat;
    }

    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }
    
    
    
    
}
