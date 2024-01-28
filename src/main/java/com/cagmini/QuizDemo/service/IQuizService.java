package com.cagmini.QuizDemo.service;

import java.util.List;

import com.cagmini.QuizDemo.entity.QuizDemo;
import com.cagmini.QuizDemo.entity.QuizEntityDemo;

public interface IQuizService {

	
	public QuizEntityDemo addQuestion(QuizEntityDemo q);
	
	public List<QuizEntityDemo> viewAllAllQuestions();
	
	public String deleteById(Integer qid);
	
	public List<QuizEntityDemo> startQuiz();
	
	public String checkResult(List<QuizDemo> l);
}
