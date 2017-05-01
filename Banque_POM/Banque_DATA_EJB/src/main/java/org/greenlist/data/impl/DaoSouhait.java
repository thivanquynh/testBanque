package org.greenlist.data.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.greenlist.data.api.IDaoSouhait;
import org.greenlist.entity.Liste;
import org.greenlist.entity.Souhait;
import org.greenlist.entity.Utilisateur;

/**
 * 
 * @author Stagiaire permet de faire le lien avec la base de donn�e
 */
@Remote(IDaoSouhait.class)
@Singleton
public class DaoSouhait implements IDaoSouhait {
	@PersistenceContext(unitName = "Banque_DATA_EJB")
	private EntityManager em;

	/**
	 * renvoi la liste de souhait avec un utilisateur en argument
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Souhait> getSouhaits(Utilisateur utilisateur) throws Exception{

		final String req = "SELECT s FROM Souhait s " + "INNER JOIN Liste li ON li.id = s.idListe "
				+ "INNER JOIN Utilisateur u ON u.id = li.idUtilisateur" + "WHERE u.id = :pidUtilisateur";

		Query query = em.createQuery(req).setParameter("pidUtilisateur", utilisateur.getId());
		return query.getResultList();
	}

	/**
	 * renvoi une liste de souhait et prend une Liste en argument
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Souhait> getSouhaits(Liste liste) throws Exception {
		final String req = "SELECT s FROM Souhait s " + "INNER JOIN Liste li ON li.id=s.idListe"
				+ "WHERE li.id = :pidListe";

		Query query = em.createQuery(req).setParameter("pidListe", liste.getId());
		return query.getResultList();
	}

	/**
	 * renvoie une liste de souhaits de l'utilisateur
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Liste> getListes(Utilisateur utilisateur) throws Exception {

		final String req = "SELECT li FROM Liste li" + "INNER JOIN Utilisateur u ON u.id = li.idUtilisateur"
				+ "WHERE u.id = :pidUtilisateur";

		// String sg ="SELECT li FROM Liste li WHERE li.utilisateur.id
		// =:pidUtilisateur";
		Query query = em.createQuery(req).setParameter("pidUtilisateur", utilisateur.getId());
		return query.getResultList();
	}

	/**
	 * renvoi un souhait
	 */
	@Override
	public Souhait getSouhait(Souhait souhait) throws Exception {
		final String req = "SELECT s FROM Souhait s " + "WHERE s.id = :pid";

		Query query = em.createQuery(req).setParameter("pid", souhait.getId());
		return (Souhait) query.getSingleResult();
	}

	/**
	 * permet d'ajouter un souhait
	 */
	@Override
	public Souhait addSouhait(Souhait souhait) {

		em.getTransaction().begin();
		em.persist(souhait);
		em.getTransaction().commit();
		em.close();

		return souhait;
	}

	/**
	 * permet d'ajouter une liste
	 */
	@Override
	public Liste addListe(Liste liste) {

		em.getTransaction().begin();
		em.persist(liste);
		em.getTransaction().commit();
		em.close();
		
		return liste;
	}

}
