package State;

public class Client {
	public static void main(String[] args) {
		MediaPlayer player = new MediaPlayer();
		player.play();  //mặc định là dừng nên chỉ lại đối tượng PauseState để gọi phương thức play trong đối ttuowngj đó, sẽ gọi đến đối tượng PlaySate 

		
		player.play(); //nhấn play lần nữa trong đối tươngj PlayState
		
		player.pause();
	}
}
