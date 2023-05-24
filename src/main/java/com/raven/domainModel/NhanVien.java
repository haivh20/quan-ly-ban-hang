package com.raven.domainModel;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "NhanVien")
public class NhanVien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaNhanVien", unique = true)
    private String maNhanVien;

    @Column(name = "HoTen")
    private String hoTen;

    @Column(name = "Email")
    private String email;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "NgaySinh")
    private LocalDate ngaySinh;

    @Column(name = "CCCD")
    private String cccd;

    @Column(name = "GioiTinh")
    private int gioiTinh;

    @Column(name = "NgayBatDau")
    private LocalDate ngayBatDau;

    @Column(name = "Luong")
    private int luong;

    @Column(name = "SoTKNH")
    private String soTKNH;

    @Column(name = "TenNH")
    private String tenNH;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ChucVuId")
    private ChucVu chucVu;

    public NhanVien() {
    }

    public NhanVien(UUID id, String maNhanVien, String hoTen, String email, String sdt, String diaChi, LocalDate ngaySinh, String cccd, int gioiTinh, LocalDate ngayBatDau, int luong, String soTKNH, String tenNH, ChucVu chucVu) {
        this.id = id;
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.cccd = cccd;
        this.gioiTinh = gioiTinh;
        this.ngayBatDau = ngayBatDau;
        this.luong = luong;
        this.soTKNH = soTKNH;
        this.tenNH = tenNH;
        this.chucVu = chucVu;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getSoTKNH() {
        return soTKNH;
    }

    public void setSoTKNH(String soTKNH) {
        this.soTKNH = soTKNH;
    }

    public String getTenNH() {
        return tenNH;
    }

    public void setTenNH(String tenNH) {
        this.tenNH = tenNH;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }
    
    
    
    

}
