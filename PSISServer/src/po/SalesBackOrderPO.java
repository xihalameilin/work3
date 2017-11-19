package po;

import java.util.List;
/*
 * 销售退货单
 */
public class SalesBackOrderPO {

	
	/*
	 * 编号
	 */
	private String number;
	/*
	 * 销售商
	 */
	private String salesperson;
	/*
	 * 业务员
	 */
	private String defaultname;
	/*
	 * 操作员
	 */
	private String operator;
	/*
	 * 仓库
	 */
	private String warehouse;
	/*
	 * 折让前总额
	 */
	private double total;
	/*
	 * 折让
	 */
	private double discount;
	/*
	 * 代金券
	 */
	private double voucher;
	/*
	 * 折让后总额
	 */
	private double lasttotal;
	/*
	 * 出库商品列表
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
