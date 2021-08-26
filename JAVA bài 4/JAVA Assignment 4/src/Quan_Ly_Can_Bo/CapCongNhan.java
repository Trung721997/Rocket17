package Quan_Ly_Can_Bo;

public class CapCongNhan extends Can_Bo {
	private Level level;
	public enum Level {
		ONE, TWO, THREE, FOUR
	}
		
	public Level getLevel() {
		return level;
	}

	public CapCongNhan(String fullName, int age, Gioi_Tinh goithinh, String diaChi, Level level) {
		super(fullName, age, goithinh, diaChi);
		this.level = level;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + "Level: " + level;
	}

}
