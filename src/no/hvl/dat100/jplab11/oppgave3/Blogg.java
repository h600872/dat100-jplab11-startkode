package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		
		innleggtabell = new Innlegg[20];
	
	}

	public Blogg(int lengde) {

		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {

		return nesteledig;
	}
	
	public Innlegg[] getSamling() {

		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		if (nesteledig < innleggtabell.length) {
			return true;
		}
		return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String innleggTxt = "";
		
		for (int i = 0; i < nesteledig; i++) {
			innleggTxt += innleggtabell[i];
		}
		return nesteledig + "\n" + innleggTxt;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
//		Innlegg[] innlegg = new Innlegg[innleggtabell.length * 2];

	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		
//		for (int i = 0; i < innleggtabell.length; i++) {
//		innleggtabell[i] = innlegg;
//		return true;
//		}
//		return false;
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}