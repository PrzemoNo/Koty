package pl.kobietydokodu.koty.domain;

import java.util.Date ;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kot {
	
  
    private String imie;
    

    private Date dataUrodzenia;
    

    private Float waga;
    
 
    private String imieOpiekuna;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer kotId;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }

	public void setId(Integer kotId) {
		this.kotId = kotId;
	}
	 public Integer getkotId() {
		 
	    return kotId;
	    }
}
