package com.mta.javastock;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Calculation extends  HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			resp.setContentType("text/html");
			
			int radius = 50;
			double area;
			area = radius* radius * Math.PI;
			String line1 = new String("calculation 1: Area of circle with radius "+radius+ "is:  " + area + "square­cm");

			
			int hypotenuse = 50;
			int angleB = 30;
			double angleBInRadians = Math.toRadians(angleB);
			double opposite = hypotenuse * angleBInRadians;
			String roundOpposite = String.format("%.2f", opposite);
			String line2 = new String ("calculation 2: Length of opposite, where angle B is: " + angleB + " is: " + roundOpposite + ".");

			
			int base= 20;
			int exp= 13;
			
			long powerRes = (long) Math.pow(base, exp);
			String line3 = new String ("calculation 3: Power of " + base +" with exp of " + exp + " is: " + powerRes);
			
			String resultStr = line1 + "<br>" + line2 + "<br>" + line3 + "<br>";
			resp.getWriter().println(resultStr);
			
			
		
			}
			}
