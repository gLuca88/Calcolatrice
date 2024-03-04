package GianlucaJunitProject.Calcolatrice;

public class Calcolatrice implements CalcolatriceInterface {

	@Override
	public double somma(Double oper1, Double oper2) throws ErroreCalcolatriceException {
		if(oper1==null||oper2==null) {
			throw new  ErroreCalcolatriceException("Uno dei due operandi è uguale a null");
		}
		return oper1.doubleValue() + oper2.doubleValue();// int value permette di accedere al valore del dato primitivo di
													// integer
	}

	@Override
	public double sottrazione(Double oper1, Double oper2) throws ErroreCalcolatriceException {
		if(oper1==null||oper2==null) {
			throw new  ErroreCalcolatriceException("Uno dei due operandi è uguale a null");
		}
		return oper1.doubleValue() - oper2.doubleValue();
	}

	@Override
	public double moltiblicazione(Double oper1, Double oper2) throws ErroreCalcolatriceException {
		if(oper1==null||oper2==null) {
			throw new  ErroreCalcolatriceException("Uno dei due operandi è uguale a null");
		}
		return oper1.doubleValue() * oper2.doubleValue();
	}

	@Override
	public double divisione(Double oper1, Double oper2) throws ErroreCalcolatriceException {
		if(oper1==null||oper2==null||oper2.intValue()==0) {
			throw new  ErroreCalcolatriceException("Uno dei due operandi è uguale a null oppure stai dividendo per zero");
		}
		return oper1.doubleValue() / oper2.doubleValue();
	}


}
