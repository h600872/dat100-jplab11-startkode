package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
		File myObj = new File("blogg.txt");
		if (myObj.createNewFile()) {
			System.out.println("File created: " + myObj.getName());
			return true;
		}
		else {
			System.out.println("File already exists.");
		}
		}
			catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		return false;
		}
	}

