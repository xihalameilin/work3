package factory;

import serviceImpl.loginblserviceImpl.LoginblserviceImpl;

public class BLservicefactory {
	private static BLservicefactory factory=new BLservicefactory();
	public static BLservicefactory getInsance(){
		return factory;
	}
	
	public LoginblserviceImpl getLoginblserviceImpl(){
		return new LoginblserviceImpl();
	}
	
	

}
