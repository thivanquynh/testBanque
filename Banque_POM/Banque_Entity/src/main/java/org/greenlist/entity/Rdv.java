package org.greenlist.entity;
// Generated 28 avr. 2017 10:03:43 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Rdv generated by hbm2java
 */
@Entity
@Table(name = "rdv", catalog = "projet3")
public class Rdv implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDADRESSE", nullable = false)
	private Adresse adresse;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDECHANGE")
	private Echange echange;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE", nullable = false, length = 10)
	private Date date;

	public Rdv() {
	}

	public Rdv(int id, Adresse adresse, Date date) {
		this.id = id;
		this.adresse = adresse;
		this.date = date;
	}

	public Rdv(int id, Adresse adresse, Echange echange, Date date) {
		this.id = id;
		this.adresse = adresse;
		this.echange = echange;
		this.date = date;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Echange getEchange() {
		return this.echange;
	}

	public void setEchange(Echange echange) {
		this.echange = echange;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
