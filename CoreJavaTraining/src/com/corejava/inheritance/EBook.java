package com.corejava.inheritance;

public class EBook extends Book {
	String downloadURL;
	int sizeMB;

	public String getDownloadURL() {
		return downloadURL;
	}

	public void setDownloadURL(String downloadURL) {
		this.downloadURL = downloadURL;
	}

	public int getSizeMB() {
		return sizeMB;
	}

	public void setSizeMB(int sizeMB) {
		this.sizeMB = sizeMB;
	}

}
