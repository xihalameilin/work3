package po;
/*
 * ת���б��ÿһ����¼
 */
public class TransferAccountPO {
	/*
	 * �����˻�
	 */
	private String bankaccount;
	/*
	 * ת�˽��
	 */
	private double money;
	/*
	 * ��ע
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
