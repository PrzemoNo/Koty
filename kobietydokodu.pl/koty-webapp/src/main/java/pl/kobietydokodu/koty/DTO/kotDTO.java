package pl.kobietydokodu.koty.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class kotDTO {
	
	@NotBlank
	@Size(min = 3)
	private String imie;
	
	@NotBlank
	private String imieOpiekuna;
	
	@NotNull
	private Float waga;
	
	@Pattern(regexp="[0-3]?[0-9]\\.[0-1]?[0-9]\\.[1-2][0-9]{3}")
	private String dataUrodzenia;


	public void setImie(String imie) {
		this.imie = imie;
	}
	public void setImieOpiekuna(String imieOpiekuna) {
		this.imieOpiekuna = imieOpiekuna;
	}
	public void setWaga(Float waga) {
		this.waga = waga;
	}
	public void setDataUrodzenia(String dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
	public String getImie() {
		// TODO Auto-generated method stub
		return imie;
	}
	
	public String getDataUrodzenia() {
		// TODO Auto-generated method stub
		return dataUrodzenia;
	}

	public String getImieOpiekuna() {
		// TODO Auto-generated method stub
		return imieOpiekuna;
	}

	public Float getWaga() {
		// TODO Auto-generated method stub
		return waga;
	}

}
