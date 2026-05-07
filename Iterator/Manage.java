package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Manage {
	private List<Item> manageItems = new ArrayList<>();
	
	public void addItem(Item item) {
		manageItems.add(item);
	}
	
	public ItemIterator<Item> iterator(){
		return new ManageItemIterator();
	}
	
	class ManageItemIterator implements ItemIterator<Item> {
		private int currentIndex = 0;
		
		@Override
		public boolean hasNext() {
			while(currentIndex < manageItems.size()) {
				if( manageItems.get(currentIndex).getQuantity() > 0) {
					return true; //chỉ nhận item còn hàng
				}
				currentIndex++; //bỏ qua nếu hết hàng
			}
			return false;
		}
		
		@Override
		public Item next() {
			return manageItems.get(currentIndex++);
		}
	}
}
