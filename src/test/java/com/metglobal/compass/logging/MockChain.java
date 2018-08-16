package com.metglobal.compass.logging;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * a mock implementation for testing because package has no services
 */
public class MockChain implements FilterChain {
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse)
			throws IOException, ServletException {
		servletRequest.getInputStream();
		servletRequest.getReader();
		servletResponse.getWriter().println("Here is your response");
	}
}
