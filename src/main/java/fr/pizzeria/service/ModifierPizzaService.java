package fr.pizzeria.service;

import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.PizzaMemDao;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(PizzaMemDao dao) throws UpdatePizzaException {
		LOG.info("\nVeuillez choisir le code de la pizza � modifier. \n");
		code = choiceUser.next();
		
		LOG.info("Veuillez saisir le nouveau code \n");
		String newCode = choiceUser.next();
		LOG.info("Veuillez saisir le nouveau nom (sans espace) \n");
		libelle = choiceUser.next();
		LOG.info("Veuillez saisir le nouveau prix \n");
		prix = Double.parseDouble(choiceUser.next());
		LOG.info("Veuillez saisir la cat�gorie \n");
		cat = choiceUser.next();
		
		if(!dao.pizzaExists(code))
		{			
			throw new UpdatePizzaException("Ce code n'existe pas");
		}

		dao.updatePizza(code, new Pizza(newCode, libelle, prix, CategoriePizza.valueOf(cat)));				
	}
}
