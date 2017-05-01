package org.greenlist.entity;
// Generated 28 avr. 2017 10:03:43 by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Liste generated by hbm2java
 */
@Entity
@Table(name = "liste", catalog = "projet3")
public class Liste implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDUTILISATEUR")
	private Utilisateur utilisateur;
	@Column(name = "LIBELLE", nullable = false, length = 50)
	private String libelle;
	@Column(name = "DESCRIPTION", length = 10000)
	private String description;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_CREATION", nullable = false, length = 10)
	private Date dateCreation;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_EXPIRATION", length = 10)
	private Date dateExpiration;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DESACTIVATION_DEBUT", length = 10)
	private Date dateDesactivationDebut;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DESACTIVATION_FIN", length = 10)
	private Date dateDesactivationFin;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "liste")
	private List<Souhait> souhaits = new ArrayList<>();

	public Liste() {
	}

	public Liste(int id, String libelle, Date dateCreation) {
		this.id = id;
		this.libelle = libelle;
		this.dateCreation = dateCreation;
	}

	public Liste(int id, Utilisateur utilisateur, String libelle, String description, Date dateCreation,
			Date dateExpiration, Date dateDesactivationDebut, Date dateDesactivationFin, List<Souhait> souhaits) {
		this.id = id;
		this.utilisateur = utilisateur;
		this.libelle = libelle;
		this.description = description;
		this.dateCreation = dateCreation;
		this.dateExpiration = dateExpiration;
		this.dateDesactivationDebut = dateDesactivationDebut;
		this.dateDesactivationFin = dateDesactivationFin;
		this.souhaits = souhaits;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateExpiration() {
		return this.dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public Date getDateDesactivationDebut() {
		return this.dateDesactivationDebut;
	}

	public void setDateDesactivationDebut(Date dateDesactivationDebut) {
		this.dateDesactivationDebut = dateDesactivationDebut;
	}

	public Date getDateDesactivationFin() {
		return this.dateDesactivationFin;
	}

	public void setDateDesactivationFin(Date dateDesactivationFin) {
		this.dateDesactivationFin = dateDesactivationFin;
	}

	public List<Souhait> getSouhaits() {
		return this.souhaits;
	}

	public void setSouhaits(List<Souhait> souhaits) {
		this.souhaits = souhaits;
	}

}