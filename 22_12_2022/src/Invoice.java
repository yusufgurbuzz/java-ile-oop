
public class Invoice implements Payable {

	private String partNumber,partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber,String partDescription,int quantity,double pricePerItem){
		
		this.setPartNumber(partNumber);
		this.setPartDescription(partDescription);
		this.setQuantity(quantity);
		this.setPricePerItem(pricePerItem);
	}
	
	
	@Override
	public double getPaymentAmount() {
		
		return getQuantity()*getPricePerItem();
	}


	public String getPartNumber() {
		return partNumber;
	}


	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}


	public String getPartDescription() {
		return partDescription;
	}


	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}


	public double getPricePerItem() {
		return pricePerItem;
	}


	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem>0?pricePerItem:0;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity>0?quantity:0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PartNumber :"+partNumber+"\nPartDescription :"+partDescription+"\nQuantity :"+quantity+"\nPricePerItem : "+pricePerItem; 
	}
	
	
	

}
