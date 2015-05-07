package com.mta.javastock.model;


/**
 * This class represents a Portfolio of Stocks.
 * where the maximum of stocks in the Portfolio is 5.
 * 
 * @author AdiShlomo
 * @since 26/4/2015
 */

public class Portfolio {
	
	private final static int MAX_PORTFOLIO_SIZE = 5;
	private String title;
	private int portfolioSize;
	private Stock[] stocks;
	
	/**
	 * C'tor of Portfolio.
	 * Receives the title of the portfolio.
	 * Creates an instance of an array of Stocks
	 * Set the Portfolio Size to start as 0.
	 * @param title
	 * 		  the title of the Portfolio
	 * @see com.Adi-MTA
	 */
	
	public Portfolio(String title) {
		this.title = title ;
		this.stocks = new Stock[MAX_PORTFOLIO_SIZE]; //in constractors arr should be new
		this.portfolioSize = 0;
	}  
	
	
	public Portfolio(Portfolio portfolio ) {
		this(portfolio.getTitle());
		this.portfolioSize = portfolio.getPortfolioSize();
		for (int i=0;i<portfolioSize; i++)
		{
			this.stocks[i] = new Stock(portfolio.getStocks()[i]);
		}
	}
	
	/**
	 * Add Stock to the portfolio's array of stocks.
	 * @param stock : a refferance of Stock type
	 * @author AdiShlomo
	 */
	
	public void addStock(Stock stock){
		
		if(portfolioSize< MAX_PORTFOLIO_SIZE && stock != null )
		{
			stocks[this.portfolioSize] = stock;
			portfolioSize++;
		}
		else 	System.out.println("Sorry, mail is full or is shop is null");
	}
	
	/**
	 * Removes all stocks from portfolio with the same symbol as received. 
	 * @param stockSymbol : the stock's symbol
	 */
	
	public void removeStock(String symbol)
	{
		for(int i = 0; i < portfolioSize; i++){
			if(this.stocks[i].getSymbol().equals(symbol)){
				if(i != portfolioSize-1 && portfolioSize > 1)
					for(int j = i; j < portfolioSize-1; j++){
						this.stocks[j] = new Stock(this.stocks[j+1]);
					}
			}
		}
		portfolioSize--;
	}

	public Stock[] getStocks(){
		return stocks;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPortfolioSize() {
		return portfolioSize;
	}
	public void setPortfolioSize(int portfolioSize) {
		this.portfolioSize = portfolioSize;
	}
	public static int getMaxPortfolioSize() {
		return MAX_PORTFOLIO_SIZE;
	}
	public void setStocks(Stock[] stocks) {
		this.stocks = stocks;
	}
	
	/**
	 * Method uses the portfolio's stock details.
	 * @return string with portfolio's detains in HTML code.
	 */
	
	public String getHtmlString(){
		
		String res = new String();
		res = res+"<h1>"+getTitle()+"</h1> <br>";
		
		for(int i=0; i<portfolioSize;i++)
		{
			res = res + stocks[i].getHtmlDescription()+"<br>";
		}
		
		return res;	
	}
}