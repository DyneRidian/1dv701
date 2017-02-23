package lab2.Request;

public class HttpRequest {

	private String filename;

	public HttpRequest(String method) {
		String[] temp = method.split("\n");
		setFilename(temp[0].split(" ")[1]);
	}

	public String getFilename() {
		return filename;
	}

	private void setFilename(String filename) {
		this.filename = filename;
	}
}