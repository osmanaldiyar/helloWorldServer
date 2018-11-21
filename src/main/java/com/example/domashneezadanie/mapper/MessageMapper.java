package com.example.domashneezadanie.mapper;

import com.example.domashneezadanie.model.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MessageMapper {

    @Select("select * from message")
    List<Message> findAll();

}
