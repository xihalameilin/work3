package po;

import java.util.List;
/*
 * 付款单
 */
public class PayOrderPO {
	
	/*
	 * 编号
	 */
	private String number;
	/*
	 * 供应商
	 */
	private String provider;
	/*
	 * 销售商
	 */
	private String salesperson;
	/*
	 * 操作员
	 */
	private String operator;
	/*
	 * 总额
	 */
	private double total;
	/*
	 * 条目清单
	 */
	private List<TiaoMuPO> list;
	public PayOrderPO(String number, String provider, String salesperson, String operator, double total,
			List<TiaoMuPO> list) {
		super();
		this.number = number;
		this.provider = provider;
		this.salesperson = salesperson;
		this.operator = operator;
		this.total = total;
		this.list = list;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<TiaoMuPO> getList() {
		return list;
	}
	public void setList(List<TiaoMuPO> list) {
		this.list = list;
	}
	
	

}
