package com.cagmini.QuizDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cagmini.QuizDemo.entity.QuizDemo;
import com.cagmini.QuizDemo.entity.QuizEntityDemo;
import com.cagmini.QuizDemo.service.IQuizService;

public class QuizControllerDemo {
	
	@Autowired
	IQuizService iquizservice;
	
	@PostMapping("/addQuestions")
	ResponseEntity<QuizEntityDemo> addQuestion(@RequestBody  QuizEntityDemo q){
		
		return new ResponseEntity<QuizEntityDemo>(iquizservice.addQuestion(q),HttpStatus.OK);
	}
	
	@GetMapping("/viewAllQuestions")
	ResponseEntity<List<QuizEntityDemo>> viewAllQuestions(){
		
		return new ResponseEntity<List<QuizEntityDemo>>(iquizservice.viewAllAllQuestions(),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteById")
	ResponseEntity<String> deleteById(@RequestParam Integer qid){
		
		return new ResponseEntity<String>(iquizservice.deleteById(qid),HttpStatus.OK);
	}
	
	
	@GetMapping("/startQuiz")
		ResponseEntity<List<QuizEntityDemo>> startQuiz(){
		
		return new ResponseEntity<List<QuizEntityDemo>> (iquizservice.startQuiz(),HttpStatus.OK);
	}
 	
	
	@PostMapping("/result")
	
	ResponseEntity<String> checkResult(@RequestBody List<QuizDemo> q){
		 return new ResponseEntity<String> (iquizservice.checkResult(q),HttpStatus.OK);
	}
	
}
