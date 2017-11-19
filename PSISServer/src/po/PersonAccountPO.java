package po;
/*
 * 操作员：库存管理人员，进货销售人员，财务人员，总经理
 */
public class PersonAccountPO {
	/*
	 * 编号
	 */
	private String number;
	/*
	 * 密码
	 */
	private String password;
	/*
	 * 身份
	 */
	private String identity;
	public PersonAccountPO(String number, String password, String identity) {
		super();
		this.number = number;
		this.password = password;
		this.identity = identity;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
	

}

