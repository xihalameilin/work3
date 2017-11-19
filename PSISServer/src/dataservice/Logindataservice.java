package dataservice;

import po.PersonAccountPO;

public interface Logindataservice {
	public int addPersonAccount(PersonAccountPO p);
	
	public String getpassword(String name);


}
