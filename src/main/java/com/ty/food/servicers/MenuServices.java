package com.ty.food.servicers;

import java.util.List;

import com.ty.food.dao.Menudao;
import com.ty.food.dto.Menu;

public class MenuServices {
	
	Menudao menudao =new Menudao();
	public Menu saveMenu(Menu menu) {
		return menudao.saveMenu(menu);
	}
	public List<Menu> getAll(){
		return menudao.getAll();
	}
	public Menu getById(int id) {
		return menudao.getById(id);
	}
	public Menu validateById(int id,Menu menu) {
		return menudao.updateById(id, menu);
	}

	public Menu deleteById(int id) {
		return menudao.deleteById(id);
	}
}
