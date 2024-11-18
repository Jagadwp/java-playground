package com.simplilearn.playground.model;

public class Statistik {
	private int id;
	private String bulan;
	private int nilai;

	public Statistik(int id, String bulan, int nilai) {
		this.id = id;
		this.bulan = bulan;
		this.nilai = nilai;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBulan() {
		return bulan;
	}

	public void setBulan(String bulan) {
		this.bulan = bulan;
	}

	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}
}