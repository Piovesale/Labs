package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private List<String> parole;
		
	public Parole() {
		parole = new ArrayList<>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public void removeParola(String p) {
		parole.remove(p);
	}
	
	public List<String> getElenco() {
		//TODO
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}

	@Override
	public String toString() {
		
		String lello=""; 
		
		for(String s : parole)
			{
			lello = lello+s+"\n";
			}
		
		return lello;
	}
	
	

}
