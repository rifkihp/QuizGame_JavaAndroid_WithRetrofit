package com.example.quizgame.model;

import com.example.quizgame.QuestionsList;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseRequestSoal {

	@SerializedName("java")
	private List<QuestionsList> soal_java;

	@SerializedName("php")
	private List<QuestionsList> soal_php;

	@SerializedName("python")
	private List<QuestionsList> soal_python;

	@SerializedName("javascript")
	private List<QuestionsList> soal_javascript;


	public List<QuestionsList> getSoalJava() {
		return soal_java;
	}

	public List<QuestionsList> getSoalPhp() {
		return soal_php;
	}

	public List<QuestionsList> getSoalPython() {
		return soal_python;
	}

	public List<QuestionsList> getSoalJavascript() {
		return soal_javascript;
	}

}
