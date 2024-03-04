package GianlucaJunitProject.Calcolatrice;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoltiblicazioneTest {

	private static int countTest = 0;

	@BeforeClass
	public static void inizioEsecuzioneTestUnita() {
		System.out.println("Inizio dei test dell'unita MOLTIBLICAZIONE" + "\n");
		countTest = 1;
	}

	@Before
	public void inzioEsecuzioneMetodo() {
		System.out.println("inizio esecuzione test n " + countTest + "\n");
	}

	@Test
	public void scenarioUnoMoltiblicazioneTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 6.0, c1.moltiblicazione(2.0,3.0));

	}// chiusura 1 scenario

	// scenario dove passiamo un valore null
	// deve generare un eccezione abbiamo creato la classe
	// ErroreCalcoltriceException
	@Test(expected = ErroreCalcolatriceException.class)
	public void scenarioDueMoltiblicazioneTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 5.0, c1.moltiblicazione(null, 3.0));
	}

	@Test(timeout = 5000) // deve eseguire il metodo entro 5 secondi
	public void scenarioTreMoltiblicazioneTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 6.0, c1.moltiblicazione(2.0,3.0));
	}

	@After
	public void fineEsecuzioneMetodo() {
		System.out.println("fine esecuzione test n " + countTest + "\n");
		countTest++;
	}

	@AfterClass
	public static void fineEsecuzioneTestUnita() {
		System.out.println("fine dei test dell'unita MOLTIBLICAZIONE" + "\n");
	}

}// chiusyura mmolt test
