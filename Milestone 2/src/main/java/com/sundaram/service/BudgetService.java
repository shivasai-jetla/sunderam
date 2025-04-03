package com.sundaram.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sundaram.model.Budget;


@Service
public class BudgetService {
	
	List<Budget> list = new ArrayList<>();
	
	
	public List<Budget> saveBudget(Budget b)
	{
		list.add(b);
		return list;
	}
	
	public Budget getBudgetById(int id)
	{
		
		for(Budget b:list)
		{
			if(b.getId()==id) {
			return b;
			}
		}
		return null;
	}
	
	public List<Budget> updateBudget(int id,Budget budget)
	{
		for(Budget b:list)
		{
			if(b.getId()==id)
			{
				b.setId(budget.getId());
				b.setCategory(budget.getCategory());
				b.setAmount(budget.getAmount());
				b.setMonth(budget.getMonth());
				
				return list;
			}
		}
		return list;
	}

	

	public List<Budget> deleteBudgetById(int id) {
		for(Budget b:list)
		{
			if(b.getId()==id)
			{
				list.remove(b);
				
				return list;
			}
		}
		return list;
	}

	public List<Budget> getAllBudget() {
		
		return list;
	}

}
