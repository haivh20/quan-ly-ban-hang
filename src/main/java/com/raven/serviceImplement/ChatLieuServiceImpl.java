package com.raven.serviceImplement;

import com.raven.response.ChatLieuResponse;
import com.raven.service.ICommon;
import com.raven.domainModel.ChatLieu;
import com.raven.domainModel.ChucVu;
import java.util.ArrayList;
import java.util.List;
import com.raven.repository.ChatLieuRepo;

public class ChatLieuServiceImpl implements ICommon<ChatLieuResponse, ChatLieu> {

    private ChatLieuRepo chatLieuRepo = new ChatLieuRepo();

    @Override
    public List<ChatLieuResponse> getAll() {

        List<ChatLieuResponse> listResponse = new ArrayList<>();
        try {
            List<ChatLieu> listChatLieus = this.chatLieuRepo.getAll();
            System.out.println("Hellloooooooo" + listChatLieus);
            for (ChatLieu chatLieu : listChatLieus) {
                ChatLieuResponse chatLieuResponse = new ChatLieuResponse(chatLieu);
                listResponse.add(chatLieuResponse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listResponse;
    }

    @Override
    public Boolean create(ChatLieu y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean update(ChatLieu y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int genMaTuDong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
