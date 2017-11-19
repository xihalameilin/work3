package blservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Salesmanblservice extends Remote{
	public int addCustomer(CustomerVO customer) throws RemoteException;
	
	public int removeCustomer(long number) throws RemoteException;
	
	public int updateCustomer(long number,CustomerVO customer) throws RemoteException;
	
	public List<CustomerVO> queryCustomer() throws RemoteException;
	
	public List<GoodsVO> getGoodsList() throws RemoteException;
	
	public int getCustomerLevel(String name) throws RemoteException;
	
	public int createNewPurchaseOrder(PurchaseOrderVO p ,List<GoodsListVO> list) throws RemoteException;
	
	public int createNewPurchaseBackOrder(PurchaseBackOrderVO p£¬List<GoodsListVO> list) throws RemoteException;
	
	public int createNewSalesOrder(SalesOrderVO s,ist<GoodsListVO> list) throws RemoteException;
	
	public int createNewSalesBackOrder(SalesBackOrderVO s,List<GoodsListVO> list) throws RemoteException;

}
