package com.raven.domainModel;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "HoaDon")
public class HoaDon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaHoaDon", unique = true)
    private String maHoaDon;

    @Column(name = "NgayTao")
    private LocalDate ngayTao;

    @Column(name = "TongTien")
    private int tongTien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KhachHangId")
    private KhachHang khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NhanVienId")
    private NhanVien nhanVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DotGiamGiaId")
    private DotGiamGia dotGiamGia;

    public HoaDon() {
    }

    public HoaDon(UUID id, String maHoaDon, LocalDate ngayTao, int tongTien, KhachHang khachHang, NhanVien nhanVien, DotGiamGia dotGiamGia) {
        this.id = id;
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.dotGiamGia = dotGiamGia;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
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

    public DotGiamGia getDotGiamGia() {
        return dotGiamGia;
    }

    public void setDotGiamGia(DotGiamGia dotGiamGia) {
        this.dotGiamGia = dotGiamGia;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", maHoaDon=" + maHoaDon + ", ngayTao=" + ngayTao + ", tongTien=" + tongTien + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", dotGiamGia=" + dotGiamGia + '}';
    }
    
    
    
    
}
