package po;
/*
 * ����Ա����������Ա������������Ա��������Ա���ܾ���
 */
public class PersonAccountPO {
	/*
	 * ���
	 */
	private String number;
	/*
	 * ����
	 */
	private String password;
	/*
	 * ���
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

