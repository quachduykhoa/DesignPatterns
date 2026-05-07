package Observer;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements Observer{
	private String name;
	private List<String> feed = new ArrayList<>(); 
	
	public SocialMediaFeed(String name) {
		this.name = name;
	}
	
	@Override
	public void update(String status) {
		feed.add(status);
		System.out.println(name + " nhận trạng thái mới: " +  status);
	}
	
	public void showFeed() {
		System.out.println("=== Feed of " + name + " ===");
		for(String s : feed) {
			System.out.println(s);
		}
	}

}
