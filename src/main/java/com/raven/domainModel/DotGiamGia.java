
package com.raven.domainModel;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "DotGiamGia")
public class DotGiamGia implements Serializable {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaGiamGia", unique = true)
    private String maGiamGia;

    @Column(name = "TenDotGiamGia")
    private String tenDotGiamGia;

    @Column(name = "NgayBatDau")
    private Date ngayBatDau;

    @Column(name = "NgayKetThuc")
    private Date ngayKetThuc;

    @Column(name = "giaTriNhoNhat")
    private int giaTriNhoNhat;

    @Column(name = "giaTriLonNhat")
    private int giaTriLonNhat;

    @Column(name = "PhanTramGiamGia")
    private int phanTramGiamGia;

    @Column(name = "TrangThai")
    private int trangThai;

    @Column(name = "NgayTao")
    private LocalDate ngayTao;

    @Column(name = "NguoiTao")
    private String nguoiTao;

    @Column(name = "NgayCapNhat")
    private LocalDate ngayCapNhat;

    @Column(name = "NguoiCapNhat")
    private String nguoiCapNhat;

    public DotGiamGia() {
    }

    public DotGiamGia(UUID id, String maGiamGia, String tenDotGiamGia, Date ngayBatDau, Date ngayKetThuc, int giaTriNhoNhat, int giaTriLonNhat, int phanTramGiamGia, int trangThai, LocalDate ngayTao, String nguoiTao, LocalDate ngayCapNhat, String nguoiCapNhat) {
        this.id = id;
        this.maGiamGia = maGiamGia;
        this.tenDotGiamGia = tenDotGiamGia;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.giaTriNhoNhat = giaTriNhoNhat;
        this.giaTriLonNhat = giaTriLonNhat;
        this.phanTramGiamGia = phanTramGiamGia;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.nguoiTao = nguoiTao;
        this.ngayCapNhat = ngayCapNhat;
        this.nguoiCapNhat = nguoiCapNhat;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public String getTenDotGiamGia() {
        return tenDotGiamGia;
    }

    public void setTenDotGiamGia(String tenDotGiamGia) {
        this.tenDotGiamGia = tenDotGiamGia;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getGiaTriNhoNhat() {
        return giaTriNhoNhat;
    }

    public void setGiaTriNhoNhat(int giaTriNhoNhat) {
        this.giaTriNhoNhat = giaTriNhoNhat;
    }

    public int getGiaTriLonNhat() {
        return giaTriLonNhat;
    }

    public void setGiaTriLonNhat(int giaTriLonNhat) {
        this.giaTriLonNhat = giaTriLonNhat;
    }

    public int getPhanTramGiamGia() {
        return phanTramGiamGia;
    }

    public void setPhanTramGiamGia(int phanTramGiamGia) {
        this.phanTramGiamGia = phanTramGiamGia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public LocalDate getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(LocalDate ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    public String getNguoiCapNhat() {
        return nguoiCapNhat;
    }

    public void setNguoiCapNhat(String nguoiCapNhat) {
        this.nguoiCapNhat = nguoiCapNhat;
    }
    
    
    
    
}
