package pl.kobietydokodu.koty.domain;

import java.util.Date ;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="koty")
public class Kot {

	@Column(name = "kot_imie")
    private String imie;
    
	@Column(name = "kot_dataUrodzin")
    private Date dataUrodzenia;
    
	@Column(name = "kot_waga")
    private Float waga;
    
	@Column(name = "kot_imieOpiekuna")
    private String imieOpiekuna;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="kot_id")
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
