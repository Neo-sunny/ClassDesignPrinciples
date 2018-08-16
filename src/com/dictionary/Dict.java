package com.dictionary;

public class Dict {

	private String word;
	private String meaning;

	public Dict(String wd, String mean) {
		this.word = wd;
		this.meaning = mean;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	@Override
	public String toString() {
		return "Dict [word=" + word + ", meaning=" + meaning + "]";
	}

	
}
