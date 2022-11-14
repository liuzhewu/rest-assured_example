package com.liu.test;

import org.junit.Test;

import com.liu.parents.ParentTest;
import com.liu.utils.LogUtils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

public class PostTest extends ParentTest
{

	@Test
	@Override
	public void test()
	{
		LogUtils.info("begin to test post");
		//header参数必须设置，否则无法连接
		Map<String, String> headerMap=new HashMap<String, String>();
		headerMap.put("content-type", "application/json");
		Map<String, String> paramsMap=new HashMap<String, String>();
		paramsMap.put("name", "morpheuss");
		paramsMap.put("job", "leader");
		Response res= given().headers(headerMap).queryParams(paramsMap).when().post(url+"/api/users");
		assertThat(res.getStatusCode()).isEqualTo(201);
		assertThat(res.getBody().asString()).contains("createdAt");
		
		LogUtils.info("end to test post");
	}
	
	

}
