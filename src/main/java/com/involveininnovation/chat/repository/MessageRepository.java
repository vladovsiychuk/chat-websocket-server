package com.involveininnovation.chat.repository;

import com.involveininnovation.chat.entity.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {
}
