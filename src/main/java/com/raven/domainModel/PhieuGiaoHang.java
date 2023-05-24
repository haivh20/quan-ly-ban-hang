
package com.raven.domainModel;


import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "PhieuGiaoHang")
public class PhieuGiaoHang implements Serializable{
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaPhieuGiaoHang", unique = true)
    private String maPhieuGiaoHang;

    @Column(name = "TenNguoiGiaoHang")
    private String tenNguoiGiaoHang;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "GhiChu")
    private String ghiChu;

    @Column(name = "SoDienThoaiNguoiNhan")
    private String soDienThoaiNguoiNhan;

    @Column(name = "NgayXuatHang")
    private LocalDate ngayXuatHang;

    @Column(name = "NgayGiaoHang")
    private LocalDate ngayGiaoHang;

    @Column(name = "PhuongThucGiaoHang")
    private String phuongThucGiaoHang;

    @Column(name = "TrangThai")
    private String trangThai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HoaDonId")
    private HoaDon hoaDon;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KhachHangId")
    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NhanVienId")
    private NhanVien nhanVien;

    public PhieuGiaoHang() {
    }

    public PhieuGiaoHang(UUID id, String maPhieuGiaoHang, String tenNguoiGiaoHang, String diaChi, String ghiChu, String soDienThoaiNguoiNhan, LocalDate ngayXuatHang, LocalDate ngayGiaoHang, String phuongThucGiaoHang, String trangThai, HoaDon hoaDon, KhachHang khachHang, NhanVien nhanVien) {
        this.id = id;
        this.maPhieuGiaoHang = maPhieuGiaoHang;
        this.tenNguoiGiaoHang = tenNguoiGiaoHang;
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
        this.soDienThoaiNguoiNhan = soDienThoaiNguoiNhan;
        this.ngayXuatHang = ngayXuatHang;
        this.ngayGiaoHang = ngayGiaoHang;
        this.phuongThucGiaoHang = phuongThucGiaoHang;
        this.trangThai = trangThai;
        this.hoaDon = hoaDon;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaPhieuGiaoHang() {
        return maPhieuGiaoHang;
    }

    public void setMaPhieuGiaoHang(String maPhieuGiaoHang) {
        this.maPhieuGiaoHang = maPhieuGiaoHang;
    }

    public String getTenNguoiGiaoHang() {
        return tenNguoiGiaoHang;
    }

    public void setTenNguoiGiaoHang(String tenNguoiGiaoHang) {
        this.tenNguoiGiaoHang = tenNguoiGiaoHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getSoDienThoaiNguoiNhan() {
        return soDienThoaiNguoiNhan;
    }

    public void setSoDienThoaiNguoiNhan(String soDienThoaiNguoiNhan) {
        this.soDienThoaiNguoiNhan = soDienThoaiNguoiNhan;
    }

    public LocalDate getNgayXuatHang() {
        return ngayXuatHang;
    }

    public void setNgayXuatHang(LocalDate ngayXuatHang) {
        this.ngayXuatHang = ngayXuatHang;
    }

    public LocalDate getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(LocalDate ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public String getPhuongThucGiaoHang() {
        return phuongThucGiaoHang;
    }

    public void setPhuongThucGiaoHang(String phuongThucGiaoHang) {
        this.phuongThucGiaoHang = phuongThucGiaoHang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
    
    
}
