package org.greenlist.entity;
// Generated 28 avr. 2017 10:03:43 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ItemFaq generated by hbm2java
 */
@Entity
@Table(name = "item_faq", catalog = "projet3")
public class ItemFaq implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDADMINISTRATEUR", nullable = false)
	private Admin admin;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDTHEME", nullable = false)
	private Theme theme;
	@Column(name = "QUESTION", nullable = false, length = 500)
	private String question;
	@Column(name = "REPONSE", nullable = false, length = 10000)
	private String reponse;

	public ItemFaq() {
	}

	public ItemFaq(int id, Admin admin, Theme theme, String question, String reponse) {
		this.id = id;
		this.admin = admin;
		this.theme = theme;
		this.question = question;
		this.reponse = reponse;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Theme getTheme() {
		return this.theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getReponse() {
		return this.reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

}
