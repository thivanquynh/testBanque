package org.greenlist.business.api;

import org.greenlist.entity.Utilisateur;

public interface IBusinessUtilisateur {
	/*
	 * R�cup�ration de l'utilisateur souhaite se connecter � partir de son
	 * pseudo et son mdp.
	 * 
	 * @param pseudo le pseudo de l'utilisateur
	 * 
	 * @param mdp le mot de passe de l'utilisateur
	 * 
	 * @return l'utilisateur connect�. Renvoie l'utilisateur si les pseudo et
	 * mdp sont les bons, renvoie null sinon.
	 */
	public Utilisateur seConnecter(String pseudo, String mdp);

	/*
	 * R�cup�ration d'un utilisateur � partir de son ID.
	 * 
	 * @param idUtilisateur l'id de l'utilisateur cherch�
	 * 
	 * @return l'utilisateur cherch�. Renvoie l'utilisateur si l'ID existe, et
	 * null sinon.
	 */
	public Utilisateur getUtilisateurById(int idUtilisateur);

}
