package com.cagmini.QuizDemo.entity;

public class QuizDemo {
	
	private Integer qid;
	private Integer answer;
	public QuizDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuizDemo(Integer qid, Integer answer) {
		super();
		this.qid = qid;
		this.answer = answer;
	}
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public Integer getAnswer() {
		return answer;
	}
	public void setAnswer(Integer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "QuizDemo [qid=" + qid + ", answer=" + answer + "]";
	}
	
	
	

}
