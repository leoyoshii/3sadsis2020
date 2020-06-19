package Forum18062020;

public class Address {
	private String street;
	private int number;
	private String complement;
	private String district;
	private String city;
	private String state;
	private boolean main;

	public Address(String street, int number, String complement, String district, String city, String state, boolean main) {
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.district = district;
		this.city = city;
		this.state = state;
		this.main = main;
	}

	public String getStreet() {
		return street;
	}
	public int getNumber() {
		return number;
	}
	public String getComplement() {
		return complement;
	}
	public String getDistrict() {
		return district;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public boolean getMain() {
		return main;
	}
}
