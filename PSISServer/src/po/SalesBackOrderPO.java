package po;

import java.util.List;
/*
 * �����˻���
 */
public class SalesBackOrderPO {

	
	/*
	 * ���
	 */
	private String number;
	/*
	 * ������
	 */
	private String salesperson;
	/*
	 * ҵ��Ա
	 */
	private String defaultname;
	/*
	 * ����Ա
	 */
	private String operator;
	/*
	 * �ֿ�
	 */
	private String warehouse;
	/*
	 * ����ǰ�ܶ�
	 */
	private double total;
	/*
	 * ����
	 */
	private double discount;
	/*
	 * ����ȯ
	 */
	private double voucher;
	/*
	 * ���ú��ܶ�
	 */
	private double lasttotal;
	/*
	 * ������Ʒ�б�
	 */
	private List<GoodsListPO> list;
	public SalesBackOrderPO(String number, String salesperson, String defaultname, String operator, String warehouse,
			double total, double discount, double voucher, double lasttotal, List<GoodsListPO> list) {
		super();
		this.number = number;
		this.salesperson = salesperson;
		this.defaultname = defaultname;
		this.operator = operator;
		this.warehouse = warehouse;
		this.total = total;
		this.discount = discount;
		this.voucher = voucher;
		this.lasttotal = lasttotal;
		this.list = list;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public String getDefaultname() {
		return defaultname;
	}
	public void setDefaultname(String defaultname) {
		this.defaultname = defaultname;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getVoucher() {
		return voucher;
	}
	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}
	public double getLasttotal() {
		return lasttotal;
	}
	public void setLasttotal(double lasttotal) {
		this.lasttotal = lasttotal;
	}
	public List<GoodsListPO> getList() {
		return list;
	}
	public void setList(List<GoodsListPO> list) {
		this.list = list;
	}
	
	
}
