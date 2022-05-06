package com.codingdojo.bookclub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="book")
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @NotNull(message="Must not be blank")
    @Size(min = 5, max = 200, message="Title must be between 5 and 200 characters")
    private String title;
    @NotNull(message="Must not be blank")
    @Size(min = 3, max = 40, message="Author must be between 3 and 40 characters")
    private String authorName;
    @NotNull(message="Must not be blank")
    @Size(min=50, message="Must be at least 50 characters")
    private String myThoughts;
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;



	public Book() {
	}


	public User getUser() {
			return user;
		}
	
	
	public void setUser(User user) {
			this.user = user;
		}
	
	
	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getAuthorName() {
		return authorName;
	}
	
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
	public String getMyThoughts() {
		return myThoughts;
	}
	
	
	public void setMyThoughts(String myThoughts) {
		this.myThoughts = myThoughts;
	}
	
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}



}
