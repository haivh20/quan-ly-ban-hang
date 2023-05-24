package com.raven.domainModel;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "KichThuoc")
public class KichThuoc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaKichThuoc", unique = true)
    private String maKichThuoc;

    @Column(name = "TenKichThuoc")
    private String tenKichThuoc;

    public KichThuoc() {
    }

    public KichThuoc(UUID id, String maKichThuoc, String tenKichThuoc) {
        this.id = id;
        this.maKichThuoc = maKichThuoc;
        this.tenKichThuoc = tenKichThuoc;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaKichThuoc() {
        return maKichThuoc;
    }

    public void setMaKichThuoc(String maKichThuoc) {
        this.maKichThuoc = maKichThuoc;
    }

    public String getTenKichThuoc() {
        return tenKichThuoc;
    }

    public void setTenKichThuoc(String tenKichThuoc) {
        this.tenKichThuoc = tenKichThuoc;
    }

    
    
    
    
}
