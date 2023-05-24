package com.raven.utility;

import com.raven.domainModel.ChatLieu;
import com.raven.domainModel.ChucVu;
import com.raven.domainModel.DotGiamGia;
import com.raven.domainModel.HoaDon;
import com.raven.domainModel.NhanVien;
import com.raven.domainModel.NhaCungCap;
import com.raven.domainModel.NhaSanXuat;
import com.raven.domainModel.HoaDonChiTiet;
import com.raven.domainModel.KhachHang;
import com.raven.domainModel.KichThuoc;
import com.raven.domainModel.LoaiSanPham;
import com.raven.domainModel.MauSac;
import com.raven.domainModel.PhieuGiaoHang;
import com.raven.domainModel.SanPham;
import com.raven.domainModel.SanPhamChiTiet;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtility {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=SaleSystemDB");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "root");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(ChatLieu.class);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(DotGiamGia.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(HoaDonChiTiet.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(KichThuoc.class);
        conf.addAnnotatedClass(LoaiSanPham.class);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(NhaCungCap.class);
        conf.addAnnotatedClass(NhaSanXuat.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(PhieuGiaoHang.class);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(SanPhamChiTiet.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {

        System.out.println(getFACTORY());
    }
}
