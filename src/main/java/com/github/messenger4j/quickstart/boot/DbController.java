package com.github.messenger4j.quickstart.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	private @ResponseBody String handleTextMessageEvent(@RequestParam("id") Integer id) {
		System.out.println("debut");
		conversationRepository.save(new Conversation("AZE",2,"RTY"));
		
		for (Conversation conv : conversationRepository.findAll()) {
			System.out.println(conv);
		}
		return "Rien";
	}
}
