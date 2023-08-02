package bai2;

public enum Season {
	
	PRINT("asdas"),SUMER(6),DONG("abb");
	
	private String value;
	public int valueint;
	public String getValue() {
		return value;
	}
	public int getValueint() {
		return valueint;
	}
	private Season(String value) {
		this.value = value;
	}
	private Season(int valueint) {
		this.valueint = valueint;
	}
	
	
	
}
