package fr.dominiquesauvignon.model;

public class Capture {

	private String string;
	
	
	public Capture() {
		super();
	}

	public Capture(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "Capture [string=" + string + "]";
	}
}