package GianlucaJunitProject.Calcolatrice;

public interface CalcolatriceInterface {

	public double somma(Double oper1, Double oper2)throws ErroreCalcolatriceException;

	public double sottrazione(Double oper1, Double oper2)throws ErroreCalcolatriceException ;

	public double moltiblicazione(Double oper1, Double oper2)throws ErroreCalcolatriceException;

	public double divisione(Double oper1, Double oper2)throws ErroreCalcolatriceException;

	

}// chiusura interface
