package po;
/*
 * ��Ŀ�б������һ����Ŀ
 */
public class TiaoMuPO {
	/*
	 * ��Ŀ��
	 */
	private String name;
	/*
	 * ���
	 */
	private double money;
	/*
	 * ��ע
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
