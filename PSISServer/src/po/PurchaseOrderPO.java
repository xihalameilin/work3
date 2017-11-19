package po;

import java.util.List;
/*
 * ������
 */
public class PurchaseOrderPO {
	
	/*
	 * ���
	 */
	private String number;
	/*
	 * ��Ӧ��
	 */
	private String provider;
	/*
	 * �ֿ�
	 */
	private String warehouse;
	/*
	 * ����Ա
	 */
	private String operator;
	/*
	 * ��ע
	 */
	private String comment;
	/*
	 * �ܶ�ϼ�
	 */
	private double total;
	/*
	 * ��Ʒ�б�
	 */
	private List<GoodsListPO> list;
	public PurchaseOrderPO(String number, String provider, String warehouse, String operator, String comment,
			double total, List<GoodsListPO> list) {
		super();
		this.number = number;
		this.provider = provider;
		this.warehouse = warehouse;
		this.operator = operator;
		this.comment = comment;
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
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<GoodsListPO> getList() {
		return list;
	}
	public void setList(List<GoodsListPO> list) {
		this.list = list;
	}
	
	
}
