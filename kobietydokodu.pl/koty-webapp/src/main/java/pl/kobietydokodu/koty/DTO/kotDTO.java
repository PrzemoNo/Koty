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
	
	@Pattern(regexp="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")
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
