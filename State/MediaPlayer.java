package State;

public class MediaPlayer {
	private State state;
	private String icon;
	
	public MediaPlayer() {
		//mặc định là dừng nhạc
		this.state = new PauseState();
		this.icon = "Icon_Dừng_Nhạc";
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public void play() {
		state.play(this);
	}
	
	public void pause() {
		state.pause(this);
	}
}
