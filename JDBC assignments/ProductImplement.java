package com.sonata.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sonata.DAO.ProductInterface;
import com.sonata.Model.Product;

public class ProductImplement implements ProductInterface {
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;
	int status = 0;
	@Override
	public int addProduct(Object object) {
		Product p = (Product) object;
		// INSERT INTO table_name VALUES();
		try {
			ps = db.getConnection().prepareStatement("INSERT INTO product VALUES(?,?,?)");
			ps.setInt(1, p.getProductID());
			ps.setString(2, p.getProductName());
			ps.setDouble(3, p.getProductPrice());
			status = ps.executeUpdate();
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
		System.out.print("Record added ");
		return status;
	}
	@Override
	public int deleteProduct(Object object) {
		Product p = (Product) object;
		// DELETE FROM table_name WHERE condition;
		try {
			ps = db.getConnection().prepareStatement("DELETE FROM product WHERE productID = ?");
			ps.setInt(1, p.getProductID());
			status = ps.executeUpdate();
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
		System.out.print("Record deleted ");
		return status;
	}
	@Override
	public int updateProduct(Object object) {
		Product p = (Product) object;
		/*	
		 * 	UPDATE table_name
		 *  SET column1 = value1, column2 = value2, ...
		 *  WHERE condition;
		 */
		try {
			ps = db.getConnection().prepareStatement("UPDATE product SET productName = ? , productPrice = ? WHERE productID = ?");
			ps.setString(1, p.getProductName());
			ps.setDouble(2, p.getProductPrice());
			ps.setInt(3, p.getProductID());
			status = ps.executeUpdate();
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
		System.out.print("Record updated ");
		return status;
	}
	@Override
	public void displayProduct() {
		// SELECT * FROM table_name;
		try {
			ps = db.getConnection().prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("productID\tproductName\tproductPrice");
				do {
				   System.out.println(rs.getInt("productID") + "\t\t" + rs.getString("productName") + "\t\t" + rs.getDouble("productPrice"));
				} while (rs.next());
			} else {
				System.out.println("No Records Found!!");
			}
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
	}
	public void closeStatement() {
		if (ps != null) {
			try { ps.close(); } catch (SQLException e) {e.printStackTrace();}
		}
	}
}