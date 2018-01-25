package sara;

import java.util.List;

public class JsonSecond {

	private List<JsonThird> transactions;
	private List<JsonThird> nets;
	private List<JsonThird> smses;
	private List<JsonThird> calls;
	private List<JsonThird> basic;
	private String juid;
	private String datasource;
	private String version;
	private String token;
	
	
	public List<JsonThird> getSmses() {
		return smses;
	}
	public void setSmses(List<JsonThird> smses) {
		this.smses = smses;
	}
	public List<JsonThird> getCalls() {
		return calls;
	}
	public void setCalls(List<JsonThird> calls) {
		this.calls = calls;
	}
	public List<JsonThird> getNets() {
		return nets;
	}
	public void setNets(List<JsonThird> nets) {
		this.nets = nets;
	}
	public List<JsonThird> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<JsonThird> transactions) {
		this.transactions = transactions;
	}
	public List<JsonThird> getBasic() {
		return basic;
	}
	public void setBasic(List<JsonThird> basic) {
		this.basic = basic;
	}
	public String getDatasource() {
		return datasource;
	}
	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	public String getJuid() {
		return juid;
	}
	public void setJuid(String juid) {
		this.juid = juid;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	
}
