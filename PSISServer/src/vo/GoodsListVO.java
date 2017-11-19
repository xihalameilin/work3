package vo;

public class GoodsListVO {
	/*
	 * 编号
	 */
	private long number;
	/*
	 *名称
	 */
	private String name;
	/*
	 * 库存数量
	 */
	private long stocknumber;
	/*
	 * 零售价
	 */
	double price;
	public GoodsListVO(long number, String name, long stocknumber, double price) {
		super();
		this.number = number;
		this.name = name;
		this.stocknumber = stocknumber;
		this.price = price;
	}
	public long getStocknumber() {
		return stocknumber;
	}
	public void setStocknumber(long stocknumber) {
		this.stocknumber = stocknumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
