package com.training.websocket.chat;

import com.google.gson.Gson;
import com.training.websocket.model.Message;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class MessageEncoder implements Encoder.Text<Message> {

    @Override
    public String encode(Message message) throws EncodeException {
        Gson gson=new Gson();
        String json=gson.toJson(message);
        return json;
    }
    @Override
    public void init(EndpointConfig endpointConfig) {

    }
    @Override
    public void destroy() {

    }
}
