package com.github.messenger4j.quickstart.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.messenger4j.quickstart.boot.dao.ConversationRepository;
import com.github.messenger4j.quickstart.boot.model.Conversation;

@RestController
@RequestMapping("/db")
public class DbController {

	@Autowired
	ConversationRepository conversationRepository;

	@GetMapping
	private @ResponseBody Iterable<Conversation> findAll() {
		return conversationRepository.findAll();
		
	}
	
	@GetMapping("/{id}")
	private @ResponseBody List<Conversation> findByPsid(@PathVariable String id) {
		return conversationRepository.findByPsidOrderByPsidDesc(id);		
	}

}
