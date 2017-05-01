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
 * MotifRadiation generated by hbm2java
 */
@Entity
@Table(name = "motif_radiation", catalog = "projet3")
public class MotifRadiation implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	@Column(name = "LIBELLE", nullable = false, length = 250)
	private String libelle;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "motifRadiation")
	private List<Utilisateur> utilisateurs = new ArrayList<>();

	public MotifRadiation() {
	}

	public MotifRadiation(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	public MotifRadiation(int id, String libelle, List<Utilisateur> utilisateurs) {
		this.id = id;
		this.libelle = libelle;
		this.utilisateurs = utilisateurs;
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

	public List<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}