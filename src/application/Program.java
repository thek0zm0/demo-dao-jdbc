package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
		Department department = new Department(2, null);
		List<Seller> list = sellerdao.findByDeparment(department);
		
		for(Seller obj: list)
		{
			System.out.println(obj);
		}

	}

}
