package Iterator;

public class Client {
	public static void main(String[] args) {
		Manage manage = new Manage();
		
		manage.addItem(new Item("Bánh", "/banh", 10));
		manage.addItem(new Item("Kẹo", "/keo", 5));
		manage.addItem(new Item("Sữa", "/sua", 0));
		
		ItemIterator<Item> it = manage.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
