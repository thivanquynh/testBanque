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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Produit generated by hbm2java
 */
@Entity
@Table(name = "produit", catalog = "projet3")
public class Produit implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDGROUPE", nullable = false)
	private Groupe groupe;
	@Column(name = "LIBELLE", nullable = false, length = 50)
	private String libelle;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produit")
	private List<Souhait> souhaits = new ArrayList<>();
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produit")
	private List<Objet> objets = new ArrayList<>();

	public Produit() {
	}

	public Produit(int id, Groupe groupe, String libelle) {
		this.id = id;
		this.groupe = groupe;
		this.libelle = libelle;
	}

	public Produit(int id, Groupe groupe, String libelle, List<Souhait> souhaits, List<Objet> objets) {
		this.id = id;
		this.groupe = groupe;
		this.libelle = libelle;
		this.souhaits = souhaits;
		this.objets = objets;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Groupe getGroupe() {
		return this.groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Souhait> getSouhaits() {
		return this.souhaits;
	}

	public void setSouhaits(List<Souhait> souhaits) {
		this.souhaits = souhaits;
	}

	public List<Objet> getObjets() {
		return this.objets;
	}

	public void setObjets(List<Objet> objets) {
		this.objets = objets;
	}

}
