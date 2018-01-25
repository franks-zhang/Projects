package sara;

public class JsonThird {

	private String parentName; //父节点的名称
	private String update_time;
	private String cell_phone;
	private String idcard;
	private String reg_time;
	private String real_name;
	private String place;
	private String other_cell_phone;
	private float subtotal;
	private String start_time;
	private String init_type;
	private String call_type;
	private float use_time;
	private float subflow;
	private float total_amt;
	private String bill_cycle;
	private String pay_amt; // 将null值设置给float类型，会报错。。此处思考。。
	private float plan_amt;
	
	
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public String getCell_phone() {
		return cell_phone;
	}
	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getReg_time() {
		return reg_time;
	}
	public void setReg_time(String reg_time) {
		this.reg_time = reg_time;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getOther_cell_phone() {
		return other_cell_phone;
	}
	public void setOther_cell_phone(String other_cell_phone) {
		this.other_cell_phone = other_cell_phone;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getInit_type() {
		return init_type;
	}
	public void setInit_type(String init_type) {
		this.init_type = init_type;
	}
	public String getCall_type() {
		return call_type;
	}
	public void setCall_type(String call_type) {
		this.call_type = call_type;
	}
	public String getBill_cycle() {
		return bill_cycle;
	}
	public void setBill_cycle(String bill_cycle) {
		this.bill_cycle = bill_cycle;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public float getUse_time() {
		return use_time;
	}
	public void setUse_time(float use_time) {
		this.use_time = use_time;
	}
	public float getSubflow() {
		return subflow;
	}
	public void setSubflow(float subflow) {
		this.subflow = subflow;
	}
	public float getTotal_amt() {
		return total_amt;
	}
	public void setTotal_amt(float total_amt) {
		this.total_amt = total_amt;
	}
	public String getPay_amt() {
		return pay_amt;
	}
	public void setPay_amt(String pay_amt) {
		this.pay_amt = pay_amt;
	}
	public float getPlan_amt() {
		return plan_amt;
	}
	public void setPlan_amt(float plan_amt) {
		this.plan_amt = plan_amt;
	}
	
}
