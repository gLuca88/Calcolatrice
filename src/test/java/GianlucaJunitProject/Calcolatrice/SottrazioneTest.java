package GianlucaJunitProject.Calcolatrice;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SottrazioneTest {

	private static int countTest = 0;

	@BeforeClass
	public static void inizioEsecuzioneTestUnita() {
		System.out.println("Inizio dei test dell'unita SOTTRAZIONE" + "\n");
		countTest = 1;
	}

	@Before
	public void inzioEsecuzioneMetodo() {
		System.out.println("inizio esecuzione test n " + countTest + "\n");
	}

	@Test
	public void scenarioUnoSottrazioneTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 5.0, c1.sottrazione(10.0, 5.0));

	}// chiusura 1 scenario

	// scenario dove passiamo un valore null
	// deve generare un eccezione abbiamo creato la classe
	// ErroreCalcoltriceException
	@Test(expected = ErroreCalcolatriceException.class)
	public void scenarioDueSottrazioneTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 5.0, c1.sottrazione(null, 5.0));
	}

	@Test(timeout = 5000) // deve eseguire il metodo entro 5 secondi
	public void scenarioTreSottrazioneTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 5.0, c1.sottrazione(10.0, 5.0));
	}

	@After
	public void fineEsecuzioneMetodo() {
		System.out.println("fine esecuzione test n " + countTest + "\n");
		countTest++;
	}

	@AfterClass
	public static void fineEsecuzioneTestUnita() {
		System.out.println("fine dei test dell'unita SOTTRAZIONE" + "\n");
	}

}// chiusura classe test sottr
