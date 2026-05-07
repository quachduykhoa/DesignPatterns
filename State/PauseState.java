package State;

public class PauseState implements State {
	@Override
	public void play(MediaPlayer player) {
		player.setState(new PlayState());
		player.setIcon("Icon_Phát_Nhạc");
		System.out.println("Bắt đầu phát nhạc.");
	}
	
	@Override
    public void pause(MediaPlayer player) {
        System.out.println("Máy đang tạm dừng sẵn rồi...");
    }
}
