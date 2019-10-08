import java.util.*;

class Repas
{
	int numero ;
	LocalDate date; 
	
	public Repas(numero int, date LocalDate){
		this.numero=numero;
		this.date=date;
	}
	
	public int getNumero(){
		return numero
	}
	
	public int SetNumero(int numero){
		this.numero=numero;
	}
	
	
	public LocalDate getDate(LocalDate date){
		this.date=date;
	}
	
	public LocalDate setDate(){
		return date;
	}
};
