package org.greenlist.entity;
// Generated 28 avr. 2017 10:03:43 by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Motifticket generated by hbm2java
 */
@Entity
@Table(name = "motifticket", catalog = "projet3")
public class Motifticket implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	@Column(name = "LIBELLE", nullable = false, length = 50)
	private String libelle;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "motifticket")
	private List<Ticket> tickets = new ArrayList<>();

	public Motifticket() {
	}

	public Motifticket(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	public Motifticket(int id, String libelle, List<Ticket> tickets) {
		this.id = id;
		this.libelle = libelle;
		this.tickets = tickets;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

}
