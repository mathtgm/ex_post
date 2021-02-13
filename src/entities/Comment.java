package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {
	private String text;
	private Date dateComment = new Date();
	
	public Comment(String text) {
		this.text = text;
	}
	
	public String toString() {
		return text;
	}

	public String getDateComment() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dateConverted = sdf.format(dateComment);
		return dateConverted;
	}

}
