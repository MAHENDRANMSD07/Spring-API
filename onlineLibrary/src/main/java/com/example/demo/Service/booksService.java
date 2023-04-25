package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Contents.books;
import com.example.demo.Repository.booksRepo;

@Service
public class booksService {

	@Autowired
	booksRepo ar;
	
	public List<books> getter()
	{
		return ar.findAll();
	}
	
	public  books poster(books ss)
	{
		return ar.save(ss);
	}
	
	public books putter(books ee)
	{
		return ar.save(ee);
	}
	
	public void delete(int id)
	{
		ar.deleteById(id);
	}
	
	public Optional<books> get(int id)
	{
		return ar.findById(id);
	}
}
