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
 * Messagepublic generated by hbm2java
 */
@Entity
@Table(name = "messagepublic", catalog = "projet3")
public class Messagepublic implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDPARENT")
	private Messagepublic messagepublic;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDOBJET", nullable = false)
	private Objet objet;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDUtilisateur")
	private Utilisateur utilisateur;
	@Column(name = "MESSAGE", nullable = false, length = 0)
	private String message;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "messagepublic")
	private List<Messagepublic> messagepublics = new ArrayList<>();

	public Messagepublic() {
	}

	public Messagepublic(int id, Objet objet, String message) {
		this.id = id;
		this.objet = objet;
		this.message = message;
	}

	public Messagepublic(int id, Messagepublic messagepublic, Objet objet, Utilisateur utilisateur, String message,
			List<Messagepublic> messagepublics) {
		this.id = id;
		this.messagepublic = messagepublic;
		this.objet = objet;
		this.utilisateur = utilisateur;
		this.message = message;
		this.messagepublics = messagepublics;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Messagepublic getMessagepublic() {
		return this.messagepublic;
	}

	public void setMessagepublic(Messagepublic messagepublic) {
		this.messagepublic = messagepublic;
	}

	public Objet getObjet() {
		return this.objet;
	}

	public void setObjet(Objet objet) {
		this.objet = objet;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Messagepublic> getMessagepublics() {
		return this.messagepublics;
	}

	public void setMessagepublics(List<Messagepublic> messagepublics) {
		this.messagepublics = messagepublics;
	}

}
