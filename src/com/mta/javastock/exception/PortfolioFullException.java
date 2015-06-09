package com.mta.javastock.exception;

import org.algo.exception.PortfolioException;

public class PortfolioFullException extends PortfolioException {
	
	public PortfolioFullException(){
		super("adding more stocks than max stocks limitation");
	}

}
