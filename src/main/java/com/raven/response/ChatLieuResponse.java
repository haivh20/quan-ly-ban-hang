package com.raven.response;

import com.raven.domainModel.ChatLieu;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class ChatLieuResponse {

    private UUID id;
    private String maChatLieu;
    private String tenChatLieu;

    public ChatLieuResponse(ChatLieu chatLieu) {
    }

    public ChatLieuResponse(UUID id, String maChatLieu, String tenChatLieu) {
        this.id = id;
        this.maChatLieu = maChatLieu;
        this.tenChatLieu = tenChatLieu;
    }
    
    
    
    
}
