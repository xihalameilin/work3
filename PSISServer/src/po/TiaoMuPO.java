package po;
/*
 * 条目列表里面的一个条目
 */
public class TiaoMuPO {
	/*
	 * 条目名
	 */
	private String name;
	/*
	 * 金额
	 */
	private double money;
	/*
	 * 备注
	 */
	private String comment;
	public TiaoMuPO(String name, double money, String comment) {
		super();
		this.name = name;
		this.money = money;
		this.comment = comment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
