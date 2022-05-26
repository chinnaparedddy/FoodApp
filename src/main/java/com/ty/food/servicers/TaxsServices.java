package com.ty.food.servicers;

import com.ty.food.dao.TaxsDao;
import com.ty.food.dto.Taxs;

public class TaxsServices {
	TaxsDao taxsDao=new TaxsDao();

	public Taxs saveTaxs(Taxs taxs) {
		return taxsDao.saveTaxs(taxs);
	}
}
