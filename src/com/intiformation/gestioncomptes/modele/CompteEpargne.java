package com.intiformation.gestioncomptes.modele;

import java.io.Serializable;

public class CompteEpargne extends Compte implements Serializable {
	
	/* Propri�t�s */
	
	private double taux = 3;
	
	/* Constructeurs */
	
	public CompteEpargne(int idCompte, double solde,  double taux) {
		super(idCompte, solde, "epargne");
	
	}
	
	/* Getters et Setters */

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	
}//end class
