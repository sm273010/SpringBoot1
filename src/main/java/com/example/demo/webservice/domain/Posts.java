package com.example.demo.webservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Posts {

	@Id
	@GeneratedValue
	public long id;
	
	@Column(length = 500, nullable = false)
	public String title;
	
	@Column(columnDefinition = "TEXT", nullable = false)	
	public String content;
	
	public String author;
	
	@Builder
	public Posts(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}
}
