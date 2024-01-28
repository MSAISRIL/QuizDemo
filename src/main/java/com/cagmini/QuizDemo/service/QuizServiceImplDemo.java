package com.cagmini.QuizDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cagmini.QuizDemo.entity.QuizDemo;
import com.cagmini.QuizDemo.entity.QuizEntityDemo;
import com.cagmini.QuizDemo.repository.QuizRepositoryDemo;

public class QuizServiceImplDemo implements IQuizService {

	@Autowired
	QuizRepositoryDemo quizrepositorydemo;
	
	@Autowired
	QuizEntityDemo quizentitydemo;
	
	
	@Override
	public QuizEntityDemo addQuestion(QuizEntityDemo q) {
		
		return quizrepositorydemo.save(q);
		
	}


	@Override
	public List<QuizEntityDemo> viewAllAllQuestions() {
		
		return quizrepositorydemo.findAll();
	}


	@Override
	public String deleteById(Integer qid) {
		
		try {
			
			quizrepositorydemo.deleteById(qid);
			
			return "Question with this id as been deleted";
			
		}
	     catch(Exception e){
	    	 
			return "Question with id does not exist";
		}
	}


	@Override
	public List<QuizEntityDemo> startQuiz() {
		
		List<QuizEntityDemo> l=quizrepositorydemo.findAll();
		
		for(QuizEntityDemo i:l) {
			i.setQanswer(null);
		}
		return l;
	}


	@Override
	public String checkResult(List<QuizDemo> l) {
		
		int c=0;
		
		for(QuizDemo i:l) {
			
			Optional<QuizEntityDemo> que= quizrepositorydemo.findById(i.getQid());
			if(que.get().getQanswer()==i.getAnswer()) {
				c++;
			}
			
		}
		
		
		
		return "The no of correct answers are"+c;
	}

}
