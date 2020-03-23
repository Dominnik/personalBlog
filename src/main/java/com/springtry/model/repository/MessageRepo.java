package com.springtry.model.repository;

import com.springtry.model.entity.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {
}
