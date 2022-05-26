package com.ty.tax.controlers;

import com.ty.food.dto.Taxs;
import com.ty.food.servicers.TaxsServices;

public class TestSaveTaxes {

	public static void main(String[] args) {

		TaxsServices taxsServices=new TaxsServices();
		Taxs taxs=new Taxs();
		taxs.setCgst(11);
		taxs.setSgst(12);
		taxs.setFoodgst(6);
		
		taxsServices.saveTaxs(taxs);
		System.out.println("Saved");
	}

}
