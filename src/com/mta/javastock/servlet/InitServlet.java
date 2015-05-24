package com.mta.javastock.servlet;

import javax.servlet.ServletException;

import org.algo.service.ServiceManager;

import com.mta.javastock.service.PortfolioManager;

public class InitServlet extends  javax.servlet.http.HttpServlet{

	@Override
	
	public void init() throws ServletException {
		PortfolioManager pm = new PortfolioManager();
		ServiceManager.setPortfolioManager(pm);
	}
}

