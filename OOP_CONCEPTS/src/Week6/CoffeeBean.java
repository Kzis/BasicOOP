package Week6;

public class CoffeeBean {
	
	private static final String DISCOUNT_0_PERCENT = "0%";
	private static final String DISCOUNT_5_PERCENT = "5%";
	private static final String DISCOUNT_10_PERCENT = "10%";
	private static final String DISCOUNT_15_PERCENT = "15%";
	private static final String DISCOUNT_20_PERCENT = "20%";
	private static final String DISCOUNT_25_PERCENT = "25%";
	private static final String DISCOUNT_30_PERCENT = "30%";
	
	String bags;

	public CoffeeBean(String bags) {
		this.bags = bags;
	}
	
	public String getBags() {
		return bags;
	}


	public void discountCalculator(){
		
		System.out.println("**************************");
		System.out.println("buy (bags) : " + this.bags);
		System.out.println("total price ($) : " + getTotalPrice(this.bags));
		System.out.println("discount (%) : " + getDiscount(this.bags));
		System.out.println("total discount ($) : " + getTotalDiscount(getDiscount(this.bags)));
		System.out.println("net price ($) : " + getNetPrice(getTotalPrice(this.bags) ,getTotalDiscount(getDiscount(this.bags))));
		
	}
	
	private static double getTotalPrice(String bags){
		return Double.parseDouble(bags)*5.50;
	}
	
	private static String getDiscount(String bags){
		
		if(Integer.parseInt(bags) >= 25 && Integer.parseInt(bags) <= 49){
			return DISCOUNT_5_PERCENT;
		}else if(Integer.parseInt(bags) >= 50 && Integer.parseInt(bags) <= 99){
			return DISCOUNT_10_PERCENT;
		}else if(Integer.parseInt(bags) >= 100 && Integer.parseInt(bags) <= 149){
			return DISCOUNT_15_PERCENT;
		}else if(Integer.parseInt(bags) >= 150 && Integer.parseInt(bags) <= 199){
			return DISCOUNT_20_PERCENT;
		}else if(Integer.parseInt(bags) >= 200 && Integer.parseInt(bags) <= 299){
			return DISCOUNT_25_PERCENT;
		}else if(Integer.parseInt(bags) >= 300){
			return DISCOUNT_30_PERCENT;
		}
		
		return DISCOUNT_0_PERCENT;
	}
	
	private double getTotalDiscount(String percent){
		
		switch (percent) {
		case DISCOUNT_0_PERCENT:
			return getTotalPrice(getBags()) * 0.0;
		case DISCOUNT_5_PERCENT:
			return getTotalPrice(getBags()) * 0.05;
		case DISCOUNT_10_PERCENT:
			return getTotalPrice(getBags()) * 0.10;	
		case DISCOUNT_15_PERCENT:
			return getTotalPrice(getBags()) * 0.15;
		case DISCOUNT_20_PERCENT:
			return getTotalPrice(getBags()) * 0.20;
		case DISCOUNT_25_PERCENT:
			return getTotalPrice(getBags()) * 0.25;
		case DISCOUNT_30_PERCENT:
			return getTotalPrice(getBags()) * 0.30;
		default:
			return 0.0;
		}
		
	}
	
	private double getNetPrice(Double totalPricce,Double totalDiscount){
		return totalPricce - totalDiscount;
	}

}
