package com.illucit.ejbremote.server;

import java.util.HashMap;
import java.util.Map;
import org.jboss.logging.Logger;

import javax.ejb.Stateless;

/**
 * Implementation of {@link ExampleService}.
 * 
 * @author Christian Simon
 *
 */
@Stateless
public class ExampleServiceImpl implements ExampleService {
        private static final Logger log = Logger.getLogger(ExampleServiceImpl.class.getName());

	@Override
	public String greet(String name) {
                log.info("greet called with name " + name);
		return "Hello " + name + "!";
	}

	@Override
	public Map<Object, Object> getSystemProperties() {
                log.info("getSystemProperties called");
		return new HashMap<>(System.getProperties());
	}

}
