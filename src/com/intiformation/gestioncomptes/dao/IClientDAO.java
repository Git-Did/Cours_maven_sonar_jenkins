package com.intiformation.gestioncomptes.dao;

import java.sql.Connection;
import java.util.List;

import com.intiformation.gestioncomptes.model.Client;
import com.intiformation.gestioncomptes.tool.DBConnection;

public interface IClientDAO {
	
	// r�cup de la connexion
	public Connection connection = DBConnection.getInstance();

	// m�thodes de la DAO
	
	/**
	 * R�cup�ration de la liste de tous les clients
	 * @return
	 */
	public List<Client> getAllClients();
	
	/**
	 * Ajouter un client
	 * @param client
	 */
	public void ajouterClient(Client client);

	/**
	 * Modifier un client
	 * @param client
	 */
	public void modifierClient(Client client);

	/**
	 * Supprime un client a partir de son ID
	 * @param pIdClient
	 */
	public void supprimerClientById(int pIdClient);

	/**
	 * R�cup�rer un client a partir de son ID
	 * @param pIdClient
	 * @return
	 */
	public Client getClientById(int pIdClient);

	
}
