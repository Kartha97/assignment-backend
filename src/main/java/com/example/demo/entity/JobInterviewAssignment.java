package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_interview_assignment")
public class JobInterviewAssignment {
	
	private Integer dx_esrd;
	
	private Integer dx_mi;
	
	private Integer dx_stroke;
	
	private Integer dx_htn;
	
	private Integer dx_lpd;
	
	private Integer dx_obe;
	
	private Integer dx_dneu;
	
	private Integer dx_cad;
	
	private Integer dx_pvd;
	
	private Integer dx_anm;
	
	@Id
	private String POP;

	public Integer getDx_esrd() {
		return dx_esrd;
	}

	public void setDx_esrd(Integer dx_esrd) {
		this.dx_esrd = dx_esrd;
	}

	public Integer getDx_mi() {
		return dx_mi;
	}

	public void setDx_mi(Integer dx_mi) {
		this.dx_mi = dx_mi;
	}

	public Integer getDx_stroke() {
		return dx_stroke;
	}

	public void setDx_stroke(Integer dx_stroke) {
		this.dx_stroke = dx_stroke;
	}

	public Integer getDx_htn() {
		return dx_htn;
	}

	public void setDx_htn(Integer dx_htn) {
		this.dx_htn = dx_htn;
	}

	public Integer getDx_lpd() {
		return dx_lpd;
	}

	public void setDx_lpd(Integer dx_lpd) {
		this.dx_lpd = dx_lpd;
	}

	public Integer getDx_obe() {
		return dx_obe;
	}

	public void setDx_obe(Integer dx_obe) {
		this.dx_obe = dx_obe;
	}

	public Integer getDx_dneu() {
		return dx_dneu;
	}

	public void setDx_dneu(Integer dx_dneu) {
		this.dx_dneu = dx_dneu;
	}

	public Integer getDx_cad() {
		return dx_cad;
	}

	public void setDx_cad(Integer dx_cad) {
		this.dx_cad = dx_cad;
	}

	public Integer getDx_pvd() {
		return dx_pvd;
	}

	public void setDx_pvd(Integer dx_pvd) {
		this.dx_pvd = dx_pvd;
	}

	public Integer getDx_anm() {
		return dx_anm;
	}

	public void setDx_anm(Integer dx_anm) {
		this.dx_anm = dx_anm;
	}

	@Override
	public String toString() {
		return "JobInterviewAssignment [dx_esrd=" + dx_esrd + ", dx_mi=" + dx_mi + ", dx_stroke=" + dx_stroke
				+ ", dx_htn=" + dx_htn + ", dx_lpd=" + dx_lpd + ", dx_obe=" + dx_obe + ", dx_dneu=" + dx_dneu
				+ ", dx_cad=" + dx_cad + ", dx_pvd=" + dx_pvd + ", dx_anm=" + dx_anm + ", POP=" + POP + "]";
	}

	public String getPOP() {
		return POP;
	}

	public void setPOP(String pOP) {
		POP = pOP;
	}

}
