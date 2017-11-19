package po;
/*
 * 银行账户
 */
public class BankAccountPO {
	
	/*
	 * 名称
	 */
	private String name;
	/*
	 * 金额
	 */
	private double money;
	public BankAccountPO(String name, double money) {
		super();
		this.name = name;
		this.money = money;
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
	
	

}
