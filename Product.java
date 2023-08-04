package packg1;

public class Product {
	
	private int pid;
	private String pname;
	private String pdept;
	private int price;
	
	public Product() {
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdept() {
		return pdept;
	}

	public void setPdept(String pdept) {
		this.pdept = pdept;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdept=" + pdept + ", price=" + price + "]";
	}
	
	

	

}
