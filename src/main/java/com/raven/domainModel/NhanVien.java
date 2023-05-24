
package com.raven.domainModel;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class NhanVien implements Serializable{
    
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "[maNV]")
    private String maNV;
}
