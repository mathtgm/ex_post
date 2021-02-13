package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment = Calendar.getInstance().getTime();
	private String title;
	private String content;
	private int likes = 0;
	
	public Post(String title, String content, int likes) {
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	private List<Comment> comments = new ArrayList<>();
	
	public String getMoment() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dateFormated = sdf.format(moment);
		return dateFormated;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public void addComment(Comment comment) {
		likes++;
		comments.add(comment);
	}
}
