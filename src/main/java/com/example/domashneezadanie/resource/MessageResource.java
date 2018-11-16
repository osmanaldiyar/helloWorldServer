package com.example.domashneezadanie.resource;

import com.example.domashneezadanie.model.Message;
import com.example.domashneezadanie.mapper.MessageMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/homework")
public class MessageResource {


    private MessageMapper messageMapper;

    public MessageResource(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    @GetMapping("/messages")
    public List<Message> getMessage(){
        return messageMapper.findAll();
    }
}
