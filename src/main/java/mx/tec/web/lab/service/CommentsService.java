/*
 * CommentsService
 * Version 1.0
 * August 21, 2021 
 * Copyright 2021 Tecnologico de Monterrey
 */
package mx.tec.web.lab.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import mx.tec.web.lab.service.vo.Post;
import mx.tec.web.lab.service.vo.User;
import mx.tec.web.lab.vo.CommentVO;

/**
 * Comments Service that gets the Comments from jsonplaceholder REST Service 
 * @author Enrique Sanchez
 */
@Component
public class CommentsService {
	/**
	 * Maximum number of comments to get
	 */
	public static final int MAX_NUMBER_OF_COMMENTS = 5;
	
	/** Random Generator */
	private Random randomGenerator = new Random();
	
	/** Web Client */
	private WebClient webClient;
	
	/** Rest end point */
	private String endpoint;

	/**
	 * No args constructor
	 */
	public CommentsService(@Value("${commentsEndpoint}") String endpoint) {
		setEndpoint(endpoint);
		this.webClient = WebClient.create(endpoint);
	}
	
	/**
	 * Get randomly from 1 to 5 comments from the endpoint and return a list of Comment Value Objects
	 * @return List of Value Objects
	 */
	public List<CommentVO> getComments() {
		List<CommentVO> comments = new ArrayList<>();
		
		int numberOfComments = randomGenerator.nextInt(MAX_NUMBER_OF_COMMENTS);
		
		for (int i = 1; i <= numberOfComments; i++) {
	        Post post = webClient.get()
	                .uri("/posts/" + (i * 10))
	                .accept(MediaType.APPLICATION_JSON)
	                .retrieve()
	                .bodyToMono(Post.class)
	                .block();
	        
	        if (null != post) {
		        User user = webClient.get()
		                .uri("/users/" + post.getUserId())
		                .accept(MediaType.APPLICATION_JSON)
		                .retrieve()
		                .bodyToMono(User.class)
		                .block();

		        if (null != user) {
					CommentVO comment = new CommentVO(i, user.getName(), post.getBody(), Calendar.getInstance());
					comments.add(comment);
		        }
	        }
		}
		
		return comments;		
	}

	/**
	 * @return the endpoint
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint the endpoint to set
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
}
