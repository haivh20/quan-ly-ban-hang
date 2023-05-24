 
package com.raven.domainModel;


import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaHoaDonChiTiet", unique = true)
    private String maHoaDonChiTiet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HoaDonId")
    private HoaDon hoaDon;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SanPhamId")
    private SanPham sanPham;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MauSacId")
    private MauSac mauSac;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KichThuocId")
    private KichThuoc kichThuoc;

    @Column(name = "SoLuong")
    private int soLuong;

    @Column(name = "GiaCa")
    private float giaCa;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(UUID id, String maHoaDonChiTiet, HoaDon hoaDon, SanPham sanPham, MauSac mauSac, KichThuoc kichThuoc, int soLuong, float giaCa) {
        this.id = id;
        this.maHoaDonChiTiet = maHoaDonChiTiet;
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
        this.mauSac = mauSac;
        this.kichThuoc = kichThuoc;
        this.soLuong = soLuong;
        this.giaCa = giaCa;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaHoaDonChiTiet() {
        return maHoaDonChiTiet;
    }

    public void setMaHoaDonChiTiet(String maHoaDonChiTiet) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public KichThuoc getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(KichThuoc kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaCa() {
        return giaCa;
    }

    public void setGiaCa(float giaCa) {
        this.giaCa = giaCa;
    }
    
    
    
}
