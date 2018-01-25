package sara;

import java.util.List;


public class JsonFirst {

	private String code;
	private String code_description;
	private String message;
	private List<JsonSecond> data;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode_description() {
		return code_description;
	}
	public void setCode_description(String code_description) {
		this.code_description = code_description;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<JsonSecond> getData() {
		return data;
	}
	public void setData(List<JsonSecond> data) {
		this.data = data;
	}
	
}
