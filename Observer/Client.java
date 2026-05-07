package Observer;

public class Client {
	public static void main(String[] args) {
		Connection user = new Connection("Trạng thái ban đầu");
		
		SocialMediaFeed feed1 = new  SocialMediaFeed("Feed 1: ");
		SocialMediaFeed feed2 = new SocialMediaFeed("Feed 2: ");
		
		user.attach(feed1);
		user.attach(feed2);
		
		user.setStatus("Hello world");
		user.setStatus("Observer");
		
		//show
		feed1.showFeed();
		feed2.showFeed();
	}
}
