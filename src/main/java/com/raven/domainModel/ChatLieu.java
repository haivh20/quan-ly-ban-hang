package com.raven.domainModel;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "ChatLieu")
public class ChatLieu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "MaChatLieu", unique = true)
    private String maChatLieu;

    @Column(name = "TenChatLieu")
    private String tenChatLieu;

    public ChatLieu() {
    }

    public ChatLieu(UUID id, String maChatLieu, String tenChatLieu) {
        this.id = id;
        this.maChatLieu = maChatLieu;
        this.tenChatLieu = tenChatLieu;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(String maChatLieu) {
        this.maChatLieu = maChatLieu;
    }

    public String getTenChatLieu() {
        return tenChatLieu;
    }

    public void setTenChatLieu(String tenChatLieu) {
        this.tenChatLieu = tenChatLieu;
    }

    @Override
    public String toString() {
        return "ChatLieu{" + "id=" + id + ", maChatLieu=" + maChatLieu + ", tenChatLieu=" + tenChatLieu + '}';
    }
    
    
    
    
}
