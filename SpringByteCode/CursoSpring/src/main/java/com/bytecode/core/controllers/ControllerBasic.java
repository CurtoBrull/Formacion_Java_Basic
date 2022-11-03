package com.bytecode.core.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bytecode.core.model.Post;

@Controller
@RequestMapping("/home")
public class ControllerBasic {
	
	public List<Post> getPost() {
		ArrayList<Post> post = new ArrayList<>();
		post.add(new Post(1, "Texto de ejemplo"
				, "http://localhost/image/C_Maria_Dolores_28-08-22.jpg",
				new Date(0, 0, 0), "Desarrollo Spring"));
		post.add(new Post(2, "Texto de ejemplo"
				, "http://localhost/image/C_Maria_Dolores_28-08-22.jpg",
				new Date(0, 0, 0), "Desarrollo Spring"));
		post.add(new Post(3, "Texto de ejemplo"
				, "http://localhost/image/C_Maria_Dolores_28-08-22.jpg",
				new Date(0, 0, 0), "Desarrollo Spring"));
		post.add(new Post(4, "Texto de ejemplo"
				, "http://localhost/image/C_Maria_Dolores_28-08-22.jpg",
				new Date(0, 0, 0), "Desarrollo Spring"));
		return post;
	}
	
	@GetMapping(path = {"/post", "/"})
	public String saludar(Model model) {
		model.addAttribute("posts", this.getPost());
		return "index";
	}
}