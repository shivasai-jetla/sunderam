package com.sundaram.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sundaram.model.Budget;
import com.sundaram.service.BudgetService;

@RestController
public class BudgetController {
	
	@Autowired
	BudgetService service;
	
	@GetMapping("/getAll")
	public List<Budget> getAllBudget()
	{
		return service.getAllBudget();
	}
	
	@GetMapping("/budget/{id}")
	public Budget getBudgetById(@PathVariable int id)
	{
		return service.getBudgetById(id);
	}
	
	@PostMapping("/budget/save")
	public List<Budget> saveBudget(@RequestBody Budget budget)
	{
		return service.saveBudget(budget);
		
	}
	
	
	@PutMapping("/budget/update/{id}")
	public List<Budget> updateBudget(@PathVariable int id,@RequestBody Budget budget)
	{
		return service.updateBudget(id, budget);
	}
	
	@DeleteMapping("/budget/delete/{id}")
	public List<Budget> deleteBudgetById(@PathVariable int id)
	{
		return service.deleteBudgetById(id);
	}
}
