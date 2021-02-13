package application;

import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre o titulo da publicação: ");
		String postTitle = sc.nextLine();
		System.out.print("Entre o conteudo da publicação: ");
		String postContent = sc.nextLine();
		Post post1 = new Post(postTitle, postContent, 10);
		
		System.out.print("Deixar um comentario: ");
		Comment c1 = new Comment(sc.nextLine());
		System.out.print("Deixar outro comentario: ");
		Comment c2 = new Comment(sc.nextLine());
		
		post1.addComment(c1);
		post1.addComment(c2);

		System.out.println("---- " + post1.getTitle() + " ----");
		System.out.println(post1.getLikes() + " Likes - " + post1.getMoment());
		System.out.println(post1.getContent());
		System.out.println("Comentarios: ");
		for (Comment comments : post1.getComments()) {
			System.out.println(comments + " - " + comments.getDateComment());
		}

		sc.close();
	}

}
