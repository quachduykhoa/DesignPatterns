package Builder;


public class Bedroom {
	private String bed;      // loại giường
    private int beds;        // số giường
    private String color;    // màu phòng
    private boolean tv;      // có TV
    private boolean wifi;    // có wifi
    private boolean ac;      // có máy lạnh
    private int windows;     // số cửa sổ
    private int size;        // diện tích phòng
    
	public Bedroom(String bed, int beds, String color, boolean tv, boolean wifi, boolean ac, int windows, int size) {
		this.bed = bed;
		this.beds = beds;
		this.color = color;
		this.tv = tv;
		this.wifi = wifi;
		this.ac = ac;
		this.windows = windows;
		this.size = size;
	}

	
	public String toString() {
		return "Bedroom [bed=" + bed + ", beds=" + beds + ", color=" + color + ", tv=" + tv + ", wifi=" + wifi + ", ac="
				+ ac + ", windows=" + windows + ", size=" + size + "]";
	}
	
	
	public Bedroom(BedroomBuilder bedroomBuilder) {
		this.bed = bedroomBuilder.bed;
		this.beds = bedroomBuilder.beds;
		this.color = bedroomBuilder.color;
		this.tv = bedroomBuilder.tv;
		this.wifi = bedroomBuilder.wifi;
		this.ac = bedroomBuilder.ac;
		this.windows = bedroomBuilder.windows;
		this.size = bedroomBuilder.size;
	}
	
	public static class BedroomBuilder{
		private String bed;      // loại giường
	    private int beds;        // số giường
	    private String color;    // màu phòng
	    private boolean tv;      // có TV
	    private boolean wifi;    // có wifi
	    private boolean ac;      // có máy lạnh
	    private int windows;     // số cửa sổ
	    private int size;        // diện tích phòng
	    
	    
		
		public BedroomBuilder buildBed(String bed) {
			this.bed = bed;
			return this;
		}


		
		public BedroomBuilder buildBeds(int beds) {
			this.beds = beds;
			// TODO Auto-generated method stub
			return this;
		}


	
		public BedroomBuilder buildColor(String color) {
			this.color = color;
			// TODO Auto-generated method stub
			return this;
		}



		public BedroomBuilder buildTV(boolean tv) {
			this.tv = tv;
			// TODO Auto-generated method stub
			return this;
		}



		public BedroomBuilder buildWifi(boolean wifi) {
			this.wifi = wifi;
			// TODO Auto-generated method stub
			return this;
		}



		public BedroomBuilder buildAC(boolean ac) {
			this.ac = ac;
			// TODO Auto-generated method stub
			return this;
		}



		public BedroomBuilder buildWindows(int windows) {
			this.windows = windows;
			// TODO Auto-generated method stub
			return this;
		}


		
		public BedroomBuilder buildSize(int size) {
			this.size = size;
			// TODO Auto-generated method stub
			return this;
		}


		 
		public Bedroom build() {
			// TODO Auto-generated method stub
			return new Bedroom(this);
		}
	}
    
    
}
