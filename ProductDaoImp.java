package packg1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDaoImp {
	
	Connection conn = DataBaseConnection.getDBConnection();

	public int addId(Product p) {

		String insertQuery = "insert into product values(?,?,?)";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, p.getPid());
			pstmt.setString(2, p.getPname());
			pstmt.setString(3, p.getPdept());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	public int updateDept(Product p) {

		String updateQuery = "update product set pname =? , pdept =? where pid = ?";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setInt(1,p.getPid());
			pstmt.setString(2,p.getPname());
			pstmt.setString(3,p.getPdept());
		//	pstmt.setInt(4,p.getPrice());
			

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public Product getproductById(int pno) {

		String selectQuery = "select * from product where pid = ?";

		Product p= null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(selectQuery);

			pstmt.setInt(1,pno);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int pid = rs.getInt("pid");
				String pname = rs.getString("pname");
				String pdept = rs.getString("pdept");

				  p= new Product();
				p.setPid(pid);
				p.setPname(pname);
				p.setPdept(pdept);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p;
	}

	public int deleteProductById(int pno) {

		// delete from dept where dno = ?;

		String deleteQuery = "delete from Product where pid = ?";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, pno);

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

//	public List<Department> getAll() {
//
//		String selectAllQuery = "select * from dept";
//
//		List<Department> list = new ArrayList<Department>();
//
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(selectAllQuery);
//
//			ResultSet rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//
//				int dno = rs.getInt("dno");
//				String dname = rs.getString("dname");
//				String location = rs.getString("location");
//
//				Department dept = new Department();
//				list.add(dept);
//
//				dept.setDno(dno);
//				dept.setDname(dname);
//				dept.setLocation(location);
//
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return list;
	}



