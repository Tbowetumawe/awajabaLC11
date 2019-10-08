import java.util.*;

class Repas
{
	private int numero ;
	private LocalDate date; 
	
	public Repas(numero int, date LocalDate){
		this.numero=numero;
		this.date=date;
	}
	
	public int getNumero(){
		return numero
	}
	
	public void SetNumero(int numero){
		this.numero=numero;
	}
	
	
	public LocalDate getDate(){
		return date;
	}
	
	public void setDate(LocalDate date){
		this.date=date;
	}
};
