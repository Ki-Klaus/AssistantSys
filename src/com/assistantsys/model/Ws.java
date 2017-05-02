package com.assistantsys.model;

import java.util.List;

public class Ws {

	private int bg;

	private List<Cw> cw;

	public void setBg(int bg) {
		this.bg = bg;
	}

	public int getBg() {
		return this.bg;
	}

	public void setCw(List<Cw> cw) {
		this.cw = cw;
	}

	public List<Cw> getCw() {
		return this.cw;
	}
}
