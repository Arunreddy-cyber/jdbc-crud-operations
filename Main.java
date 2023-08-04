package packg1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		ProductDaoImp dao = new ProductDaoImp();

		while (flag) {

			System.out.println("WELCOME TO DMS");
			System.out.println("1. ADD Department");
			System.out.println("2. UPDATE Department");
			System.out.println("3. DELETE Department");
			System.out.println("4. SELECT Department");
			System.out.println("5. SELECT ALL");
			System.out.println("0. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Enter Dept No.");
				int dno1 = scanner.nextInt();
				System.out.println("Enter Dept Name");
				String dname1 = scanner.next();
				System.out.println("Enter Location");
				String location1 = scanner.next();

			Product dept1=new Product();

				dept1.setPid(dno1);
				dept1.setPname(dname1);
				dept1.setPdept(location1);
				int count = dao.addId(dept1);

				System.out.println(count + " records inserted");

				break;
			case 2:

				System.out.println("Enter Dept No.");
				int dno2 = scanner.nextInt();
				System.out.println("Enter Dept Name");
				String dname2 = scanner.next();
				System.out.println("Enter Location");
				String location2 = scanner.next();
				ProductDaoImp dept2 = new ProductDaoImp();
				
				Product dept3=new Product();
				
				dept3.setPid(dno2);
				dept3.setPname(dname2);
				dept3.setPdept(location2);
				int count1 = dao.updateDept(dept3);

				System.out.println(count1 + " records updated");

				break;
			case 3:

				System.out.println("Enter DeptNo to delete one record");

				int dno3 = scanner.nextInt();

				int count3 = dao.deleteProductById(dno3);

				System.out.println(count3 + " record deleted");

				break;
			case 4:

				System.out.println("Enter Dno to select record");
				int dno4 = scanner.nextInt();

				Product deptObj = dao.getproductById(dno4);

				System.out.println(deptObj);

				break;

			case 0:

				flag = false;

				break;

			default:
				System.err.println("Invalid input");
				break;
			}

		}


	}

}
