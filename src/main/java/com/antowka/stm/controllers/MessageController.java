package com.antowka.stm.controllers;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

/**
 * Created by Anton Nikanorov on 6/25/15.
 * email: 662307@gmail.com
 */
public class MessageController {

    private AuthController authController;

    public void setAuthFilter(AuthController authController) {
        this.authController = authController;
    }

    public void getTypeMessage(WebSocketSession session, TextMessage message){
        this.authController.auth("admin2", "pass");
    }
}