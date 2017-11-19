package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import factory.BLservicefactory;
import service.loginblservice.Loginblservice;



public class DataRemoteObject extends UnicastRemoteObject implements Loginblservice {
	private static final long serialVersionUID = 4029039744279087114L;
	/*
	private StockmanagerService stockmanagerservice;
	private SalesmanService salesmanservice;
	private FinacialmanService finacialmanservice;
	private GeneralmanagerService generalmanagerservice;*/
	//private Loginblservice login;
	protected DataRemoteObject() throws RemoteException {
		/*salesmanservice=new SalesmanServiceImpl();
		stockmanagerservice=new StockmanagerServiceImpl();
		finacialmanservice=new FinacialmanServiceImpl();
		generalmanagerservice=new GeneralmanagerServiceImpl();*/
		//login =new LoginblserviceImpl();
	}
	@Override
	public int login(String name, String password) throws RemoteException {
		return BLservicefactory.getInsance().getLoginblserviceImpl().login(name, password);
	}


}
