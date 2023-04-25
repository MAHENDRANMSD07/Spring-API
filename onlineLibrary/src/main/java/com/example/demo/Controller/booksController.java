package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Contents.books;
import com.example.demo.Service.booksService;

@RestController
public class booksController {

	
	@Autowired
	booksService re;
	
	@GetMapping("/get")
	public List<books> getter()
	{
		return re.getter();
	}
	
	@PostMapping("/post")
	public books poster(@RequestBody books cc)
	{
		return re.poster(cc);
	}
	
	@PutMapping("/put")
	public books putter(@RequestBody books aa)
	{
		return re.putter(aa);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		re.delete(id);
		return "deleted";
	}
	
	@GetMapping("/get/{id}")
	public Optional<books> get(@PathVariable int id)
	{
		return re.get(id);
	}
}
