package com.example.demo.Contents;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class books {

	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getJournal() {
		return journal;
	}
	public void setJournal(String journal) {
		this.journal = journal;
	}
	public int getVolumes() {
		return volumes;
	}
	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}
	private String author;
	private String journal;
	private int volumes;
}
