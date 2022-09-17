package com.example.gitexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitExampleController {
@GetMapping("/gitexample")
public String gitExample() {
	return "git example";
}
}
