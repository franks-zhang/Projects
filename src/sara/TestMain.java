package sara;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class TestMain {

	public static void main(String[] args) throws ParseException {
		
		/** 传入一个json格式，解析成对象 */
		
		String str = "{"
						+ "\"code\":\"0\","
						+ "\"code_description\":\"SUCCESS\","
						+ "\"data\":"
						+ "[{"
							+ "\"smses\":"
								+ "[{"
									+ "\"start_time\":\"2016-07-17 03:51:38\","
									+ "\"update_time\":\"2016-07-18 10:16:31\","
									+ "\"subtotal\":\"0\","
									+ "\"place\":\"021\","
									+ "\"init_type\":null,"
									+ "\"other_cell_phone\":\"138****8888\","
									+ "\"cell_phone\":\"131****9999\""
								+ "}],"
								
							+ "\"calls\":"
								+ "[{"
									+ "\"start_time\":\"2016-07-17 21:55:37\","
									+ "\"update_time\":\"2016-07-18 10:16:31\","
									+ "\"use_time\":\"125\","
									+ "\"subtotal\":\"0.6\","
									+ "\"place\":\"上海\","
									+ "\"init_type\":\"主叫\","
									+ "\"call_type\":\"国内长途\","
									+ "\"other_cell_phone\":\"134****8888\","
									+ "\"cell_phone\":\"131****7777\""
								+ "}],"
									
							+ "\"nets\":"
								+ "[{"
									+ "\"start_time\":\"2016-07-01 00:52:05\","
									+ "\"update_time\":\"2016-07-18 10:16:31\","
									+ "\"use_time\":\"11263\","
									+ "\"subflow\":\"47\","
									+ "\"net_type\":\"4G网络\","
									+ "\"subtotal\":\"0\","
									+ "\"place\":\"上海\","
									+ "\"cell_phone\":\"131****9999\""
								+ "}],"	
									
							+ "\"datasource\":\"chinaunicom\","
							+ "\"juid\":\"\","
							
							+ "\"transactions\":"
								+ "[{"
									+ "\"total_amt\":\"138\","
									+ "\"update_time\":\"2016-07-18 10:16:31\","
									+ "\"pay_amt\":null,"
									+ "\"plan_amt\":\"64\","
									+ "\"bill_cycle\":\"2016-06-01 00:00:00\","
									+ "\"cell_phone\":\"131****9999\""
								+ "}],"
									
							+ "\"basic\":"
								+ "[{"
									+ "\"update_time\":\"2016-07-18 10:16:31\","
									+ "\"idcard\":\"140429991534513543135135\","
									+ "\"reg_time\":\"2016-07-18 10:16:31\","
									+ "\"real_time\":\"董成龙\","
									+ "\"cell_phone\":\"131****9999\""
								+ "}],"
						
							+ "\"version\":\"1\","
							+ "\"token\":\"easd3513asda35132assa\""
								
						+ "}],"
						
						+ "\"message\":\"请求成功\","
						
					+"}";
		
		// str为拿到的 json字符串
		System.out.println(str);
		
		if(StringUtils.isBlank(str)){
			// 调接口没有拿到json数据
			return;
		}
		
		// com.alibaba.fastjson.JSON
		JsonFirst first = (JsonFirst)JSON.parseObject(str, JsonFirst.class);
		
		// 最后待保存的对象
		JsonFourth end = new JsonFourth();
		// 第一层   单个值   保存进去
		end.setCode(first.getCode());
		end.setCode_description(first.getCode_description());
		end.setMessage(first.getMessage());
		// 第二层   单个值   保存进去
		List<JsonSecond> data = first.getData();
		if(null == data || data.size() < 0){
			// 返回没有 data 信息
			return;
		}
		JsonSecond second = data.get(0);
		end.setJuid(second.getJuid());
		end.setDatasource(second.getDatasource());
		end.setVersion(second.getVersion());
		end.setToken(second.getToken());
		
		// 遍历 smses 集合
		List<JsonThird> smses = second.getSmses();
		if(null == smses || smses.size() < 0){
			// 返回没有 smses 信息
			return;
		}
		JsonThird thirdSmses = smses.get(0);
		
		end.setParentName("smses");
		end.setUpdate_time(thirdSmses.getUpdate_time());
		end.setStart_time(thirdSmses.getStart_time());
		end.setSubtotal(thirdSmses.getSubtotal());
		end.setPlace(thirdSmses.getPlace());
		end.setInit_type(thirdSmses.getInit_type());
		end.setCell_phone(thirdSmses.getCell_phone());
		end.setOther_cell_phone(thirdSmses.getOther_cell_phone());
		
		// 保存到数据库中
		// 直接保存对象 end
		//...................................
		System.out.println(end.toString());
		
		end.setParentName("");
		end.setUpdate_time("");
		end.setStart_time("");
		end.setSubtotal(0.0f);
		end.setPlace("");
		end.setInit_type("");
		end.setCell_phone("");
		end.setOther_cell_phone("");
		
		// 遍历 calls 集合
		List<JsonThird> calls = second.getCalls();
		if(null == calls || calls.size() < 0){
			// 返回没有 calls 信息
			return;
		}
		JsonThird thirdCalls = calls.get(0);
		
		end.setParentName("calls");
		end.setUpdate_time(thirdCalls.getUpdate_time());
		end.setStart_time(thirdCalls.getStart_time());
		end.setUse_time(thirdCalls.getUse_time());
		end.setSubtotal(thirdCalls.getSubtotal());
		end.setPlace(thirdCalls.getPlace());
		end.setInit_type(thirdCalls.getInit_type());
		end.setCall_type(thirdCalls.getCall_type());
		end.setCell_phone(thirdCalls.getCell_phone());
		end.setOther_cell_phone(thirdCalls.getOther_cell_phone());
		
		// 保存到数据库中
		// 直接保存对象 end
		//...................................
		System.out.println(end.toString());
		
		end.setParentName("");
		end.setUpdate_time("");
		end.setUse_time(0.0f);
		end.setStart_time("");
		end.setSubtotal(0.0f);
		end.setPlace("");
		end.setInit_type("");
		end.setCall_type("");
		end.setCell_phone("");
		end.setOther_cell_phone("");
		
		// 遍历 nets
		
		// 遍历 transactions
		
		// 遍历 basic
		
		
		
		
		/*
		JSONObject first = JSONObject.parseObject(str);
		JSONArray object = (JSONArray)first.get("data");
		System.out.println(object);
		
		JSONObject jsonObject = object.getJSONObject(0);
		System.out.println(jsonObject);

		JSONArray jsonArray = jsonObject.getJSONArray("smses");
		System.out.println(jsonArray);
		
		for(int i =0; i < jsonArray.size(); i++){
			
			JSONObject jsonObject2 = jsonArray.getJSONObject(i);
			System.out.println(jsonObject2);
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date parse = simpleDateFormat.parse(jsonObject2.getString("start_time"));
			System.out.println(parse);
		}
		*/
		
	}
}
