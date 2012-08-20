package net.joastbg.sampleapp.entities;

import java.io.Serializable;
import javax.persistence.*;
import org.joda.time.DateTime;

import org.hibernate.annotations.Type;

/**
 * Describes a Book
	* 
 * @author Johan Astborg <joastbg@gmail.com>
 */
@Entity(name="Campaign")
public class Book implements Serializable {
						
				@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
				private Long id;
				
				private String title;
				private String ISBN;
				private String summary;
				
				@Column
				@Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
				private DateTime published;

				public Book(String title) throws IllegalArgumentException {
								if (title == null || title.isEmpty()) {
												throw new IllegalArgumentException("Title must not be empty");
								}
								setTitle(title);
				}
				
				/**
					* 
					* @return 
					*/
				public String getISBN() {
								return ISBN;
				}

				/**
					* 
					* @param ISBN 
					*/
				public void setISBN(String ISBN) {
								this.ISBN = ISBN;
				}

				/**
					* 
					* @return 
					*/
				public Long getId() {
								return id;
				}

				/**
					* 
					* @param id 
					*/
				public void setId(Long id) {
								this.id = id;
				}

				/**
					* 
					* @return 
					*/
				public DateTime getPublished() {
								return published;
				}

				/**
					* 
					* @param published 
					*/
				public void setPublished(DateTime published) {
								this.published = published;
				}

				/**
					* 
					* @return 
					*/
				public String getSummary() {
								return summary;
				}

				/**
					* 
					* @param summary 
					*/
				public void setSummary(String summary) {
								this.summary = summary;
				}

				/**
					* 
					* @return 
					*/
				public String getTitle() {
								return title;
				}

				/**
					* 
					* @param title 
					*/
				public void setTitle(String title) {
								this.title = title;
				}
}
