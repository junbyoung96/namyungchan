package com.board.domain;

import java.util.Date;

public class BoardVO {

		private int mno;
		private Date gotowork;
		private Date offwork;
		private String name;
		public int getMno() {
			return mno;
		}
		public void setMno(int mno) {
			this.mno = mno;
		}
		public Date getGotowork() {
			return gotowork;
		}
		public void setGotowork(Date gotowork) {
			this.gotowork = gotowork;
		}
		public Date getOffwork() {
			return offwork;
		}
		public void setOffwork(Date offwork) {
			this.offwork = offwork;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}
