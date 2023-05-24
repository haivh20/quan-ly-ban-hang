
package com.raven.domainModel;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Entity
@Table(name = "SanPham")
public class SanPham implements  Serializable{
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaSanPham", unique = true)
    private String maSanPham;

    @Column(name = "TenSanPham")
    private String tenSanPham;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "GiaBan")
    private int giaBan;

    @Column(name = "ThuongHieu")
    private String thuongHieu;

    @Column(name = "XuatXu")
    private String xuatXu;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SanPhamChiTietId")
    private SanPhamChiTiet sanPhamChiTiet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NhaCungCapID")
    private NhaCungCap nhaCungCap;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NhaSanXuatID")
    private NhaSanXuat nhaSanXuat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LoaiSanPhamID")
    private LoaiSanPham loaiSanPham;

    public SanPham() {
    }

    public SanPham(UUID id, String maSanPham, String tenSanPham, String moTa, int giaBan, String thuongHieu, String xuatXu, SanPhamChiTiet sanPhamChiTiet, NhaCungCap nhaCungCap, NhaSanXuat nhaSanXuat, LoaiSanPham loaiSanPham) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.moTa = moTa;
        this.giaBan = giaBan;
        this.thuongHieu = thuongHieu;
        this.xuatXu = xuatXu;
        this.sanPhamChiTiet = sanPhamChiTiet;
        this.nhaCungCap = nhaCungCap;
        this.nhaSanXuat = nhaSanXuat;
        this.loaiSanPham = loaiSanPham;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public SanPhamChiTiet getSanPhamChiTiet() {
        return sanPhamChiTiet;
    }

    public void setSanPhamChiTiet(SanPhamChiTiet sanPhamChiTiet) {
        this.sanPhamChiTiet = sanPhamChiTiet;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public NhaSanXuat getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(NhaSanXuat nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    
    
    
}
