package _05_netflix;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class Movie implements Comparable<Movie> {

	private String title;
	private int stars;

	public Movie(String title, int stars) {
		this.title = title;
		this.stars = stars;
	}

	public String getTitle() {
		return this.title;
	}

	public int getRating() {
		return this.stars;
	}

	public String toString() {
		return "\"" + title + "\" - " + stars + " stars";
	}

public String getTicketPrice() {
		if (this.stars > 2) {
			return "That will be $12 please.";
		} else if (this.title.contains("Twilight")) {
			return "This movie is so bad, we'll pay YOU to watch it!";
		} else {
			return "Don't waste your money on this horrible rubbish.";
		}
	}
 

	public int compareTo(Movie otherMovie) {
		int compareQuantity = otherMovie.getRating();

		// return this.stars - compareQuantity; //ascending order
		return compareQuantity - this.stars; // descending order
	}
}
