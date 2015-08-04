package com.illucit.ejbremote.server;

import java.util.Map;

public class ExampleServiceDummy implements ExampleService {

	@Override
	public Map<Object, Object> getSystemProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String greet(String arg0) {
		return "Test " + arg0;
	}

}
