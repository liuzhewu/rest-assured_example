package com.liu.test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.liu.parents.ParentTest;
import com.liu.utils.LogUtils;

import io.restassured.response.Response;

public class GetTest extends ParentTest
{

	@Test
	@Override
	public void test()
	{
		LogUtils.info("begin to test get");
		Response res= given().get(url+"/api/users?page=2");
		assertThat(res.getStatusCode()).isEqualTo(200);
		assertThat(res.getBody().asString()).contains("michael.lawson@reqres.in");
		LogUtils.info("end to test get");
	}

}
