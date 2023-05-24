package com.raven.domainModel;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "KhachHang")
public class KhachHang implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaKhachHang", unique = true)
    private String maKhachHang;

    @Column(name = "TenKhachHang")
    private String tenKhachHang;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "GioiTinh")
    private int gioiTinh;

    @Column(name = "NgayDangKy")
    private LocalDate ngayDangKy;

    @Column(name = "Email")
    private String email;

    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "LoaiKhachHang")
    private String loaiKhachHang;

    @Column(name = "SoLanMuaHang")
    private int soLanMuaHang;

    @Column(name = "LanCuoiMuaHang")
    private LocalDate lanCuoiMuaHang;

    @Column(name = "GhiChu")
    private String ghiChu;

    public KhachHang() {
    }

    public KhachHang(UUID id, String maKhachHang, String tenKhachHang, String diaChi, String sdt, int gioiTinh, LocalDate ngayDangKy, String email, Date ngaySinh, String loaiKhachHang, int soLanMuaHang, LocalDate lanCuoiMuaHang, String ghiChu) {
        this.id = id;
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.ngayDangKy = ngayDangKy;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.loaiKhachHang = loaiKhachHang;
        this.soLanMuaHang = soLanMuaHang;
        this.lanCuoiMuaHang = lanCuoiMuaHang;
        this.ghiChu = ghiChu;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(LocalDate ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public int getSoLanMuaHang() {
        return soLanMuaHang;
    }

    public void setSoLanMuaHang(int soLanMuaHang) {
        this.soLanMuaHang = soLanMuaHang;
    }

    public LocalDate getLanCuoiMuaHang() {
        return lanCuoiMuaHang;
    }

    public void setLanCuoiMuaHang(LocalDate lanCuoiMuaHang) {
        this.lanCuoiMuaHang = lanCuoiMuaHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }


    
    

}

