package com.liu.test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.liu.parents.ParentTest;
import com.liu.utils.LogUtils;

import io.restassured.response.Response;

public class PatchTest extends ParentTest
{

	@Test
	@Override
	public void test()
	{
		LogUtils.info("begin to test patch");
		Map<String, String> paramsMap=new HashMap<String, String>();
		paramsMap.put("name", "morpheuss");
		paramsMap.put("job", "zion resident");
		Response res= given().queryParams(paramsMap).when().patch(url+"/api/users/2");
		assertThat(res.getStatusCode()).isEqualTo(200);
		assertThat(res.getBody().asString()).contains("updatedAt");
		LogUtils.info("end to test patch");
	}

}
