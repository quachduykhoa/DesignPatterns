package Iterator;

public class Item {
	private String tittle;
	private String url;
    private int quantity; 

	
	public Item(String tittle, String url, int quantity) {
		this.tittle = tittle;
		this.url = url;
		this.quantity = quantity;
	}

	public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item [title=" + tittle + ", url=" + url + ", quantity=" + quantity + "]";
    }

	
}
