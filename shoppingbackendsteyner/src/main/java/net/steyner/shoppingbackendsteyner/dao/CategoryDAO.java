package net.steyner.shoppingbackendsteyner.dao;

import java.util.List;

import net.steyner.shoppingbackendsteyner.dto.Category;

public interface CategoryDAO {
	
	public List<Category> list();
	public Category get(int id);

}
