package Test;

public class Office {
	protected String hello;

	public Office(String hello) {
		super();
		this.hello = hello;
	}
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void start() {
		System.out.println(hello);
	}
}
