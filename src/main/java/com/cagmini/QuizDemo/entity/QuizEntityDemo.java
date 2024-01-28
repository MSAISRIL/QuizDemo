package com.cagmini.QuizDemo.entity;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

public class QuizEntityDemo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer qid;
	private Integer qanswer;
	private String qdesc;
	
	@ElementCollection
	@CollectionTable(name="qoptions",joinColumns = @JoinColumn(name="qid"))
	@MapKeyColumn(name="option_key")
	@Column(name="option_value")
	private Map<Integer,String> qoptions;

	public QuizEntityDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuizEntityDemo(Integer qid, Integer qanswer, String qdesc, Map<Integer, String> qoptions) {
		super();
		this.qid = qid;
		this.qanswer = qanswer;
		this.qdesc = qdesc;
		this.qoptions = qoptions;
	}

	public Integer getQid() {
		return qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	public Integer getQanswer() {
		return qanswer;
	}

	public void setQanswer(Integer qanswer) {
		this.qanswer = qanswer;
	}

	public String getQdesc() {
		return qdesc;
	}

	public void setQdesc(String qdesc) {
		this.qdesc = qdesc;
	}

	public Map<Integer, String> getQoptions() {
		return qoptions;
	}

	public void setQoptions(Map<Integer, String> qoptions) {
		this.qoptions = qoptions;
	}

	@Override
	public String toString() {
		return "QuizEntityDemo [qid=" + qid + ", qanswer=" + qanswer + ", qdesc=" + qdesc + ", qoptions=" + qoptions
				+ "]";
	}
	
	
	
	
	
	
	

}
