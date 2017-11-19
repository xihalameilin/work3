package po;
/*
 * 转账列表的每一条记录
 */
public class TransferAccountPO {
	/*
	 * 银行账户
	 */
	private String bankaccount;
	/*
	 * 转账金额
	 */
	private double money;
	/*
	 * 备注
	 */
	private String comment;
	
	public TransferAccountPO(String bankaccount, double money, String comment) {
		super();
		this.bankaccount = bankaccount;
		this.money = money;
		this.comment = comment;
	}
	public String getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
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
