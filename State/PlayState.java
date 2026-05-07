package State;

public class PlayState implements State{
	@Override
	public void play(MediaPlayer player) {
		System.out.println("Đang phát.....!");
	}
	
	@Override
	public void pause(MediaPlayer player) {
		player.setState(new PauseState());
		player.setIcon("Icon_Dừng_Nhạc");
		System.out.println("Đã tạm dừng âm nhạc.");
	}
}
