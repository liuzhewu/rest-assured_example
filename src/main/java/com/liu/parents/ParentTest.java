package com.liu.parents;

import com.liu.utils.ConfigManger;
import com.liu.utils.Constants;

public abstract class ParentTest
{
	protected static String url=ConfigManger.getConfig().getProperty(Constants.URL);

	public abstract void test();
}
