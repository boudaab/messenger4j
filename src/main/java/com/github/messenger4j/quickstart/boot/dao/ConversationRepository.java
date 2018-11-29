package com.github.messenger4j.quickstart.boot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.messenger4j.quickstart.boot.model.Conversation;

@Repository
public interface ConversationRepository extends CrudRepository<Conversation, Integer> {
	Iterable<Conversation> findAll();
	List<Conversation> findByPsid(String id);
	
}