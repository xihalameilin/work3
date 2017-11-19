package po;
/*
 * 商品列表中的商品
 */
public class GoodsListPO {
	
	/*
	 * 编号
	 */
	long number;
	/*
	 *名称
	 */
	String name;
	/*
	 * 型号
	 */
	String type;
	/*
	 * 库存数量
	 */
	long stocknumber;
	/*
	 * 进价
	 */
	double pricein;
	/*
	 * 零售价
	 */
	double price;
	/*
	 * 最近进价
	 */
	double latestpricein;
	/*
	 * 最近零售价
	 */
	double latestpeice;
	/*
	 * 日期
	 */
	String data;
	/*
	 * 警戒数量
	 */
	long dangernumber;
	public GoodsListPO(long number, String name, String type, long stocknumber, double pricein, double price,
			double latestpricein, double latestpeice, String data, long dangernumber) {
		super();
		this.number = number;
		this.name = name;
		this.type = type;
		this.stocknumber = stocknumber;
		this.pricein = pricein;
		this.price = price;
		this.latestpricein = latestpricein;
		this.latestpeice = latestpeice;
		this.data = data;
		this.dangernumber = dangernumber;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getStocknumber() {
		return stocknumber;
	}
	public void setStocknumber(long stocknumber) {
		this.stocknumber = stocknumber;
	}
	public double getPricein() {
		return pricein;
	}
	public void setPricein(double pricein) {
		this.pricein = pricein;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getLatestpricein() {
		return latestpricein;
	}
	public void setLatestpricein(double latestpricein) {
		this.latestpricein = latestpricein;
	}
	public double getLatestpeice() {
		return latestpeice;
	}
	public void setLatestpeice(double latestpeice) {
		this.latestpeice = latestpeice;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public long getDangernumber() {
		return dangernumber;
	}
	public void setDangernumber(long dangernumber) {
		this.dangernumber = dangernumber;
	}
	
	

}
