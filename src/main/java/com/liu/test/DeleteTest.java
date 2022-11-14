package com.liu.test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.liu.parents.ParentTest;
import com.liu.utils.LogUtils;

import io.restassured.response.Response;

public class DeleteTest extends ParentTest
{

	@Test
	@Override
	public void test()
	{
		LogUtils.info("begin to test delete");
		Response res= given().when().delete(url+"/api/users/2");
		assertThat(res.getStatusCode()).isEqualTo(204);
		LogUtils.info("end to test delete");
	}

}
