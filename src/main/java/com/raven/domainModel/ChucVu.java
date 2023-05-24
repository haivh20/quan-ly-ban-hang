package com.raven.domainModel;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "ChucVu")
public class ChucVu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaChucVu", unique = true)
    private String maChucVu;

    @Column(name = "TenChucVu")
    private String tenChucVu;

    public ChucVu() {
    }

    public ChucVu(UUID id, String maChucVu, String tenChucVu) {
        this.id = id;
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    @Override
    public String toString() {
        return "ChucVu{" + "id=" + id + ", maChucVu=" + maChucVu + ", tenChucVu=" + tenChucVu + '}';
    }

}
