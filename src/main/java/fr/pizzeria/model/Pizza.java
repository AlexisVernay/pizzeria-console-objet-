package fr.pizzeria.model;

public class Pizza {
		private
			int id;
			String code, libelle;
			double prix;
			
		public Pizza(String code, String libelle, double prix) 
		{
			id++;
			this.code = code;
			this.libelle = libelle;
			this.prix = prix;
		}
		
		public Pizza(int id, String code, String libelle, double prix) 
		{
			this.id = id;
			this.code = code;
			this.libelle = libelle;
			this.prix = prix;
		}

}