package application.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Person {

	private String name;
	private String vorname;
	private String ort;
	private String anschrift;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date geburtsdatum;
	private Integer plz;
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getVorname() {
		return vorname;
	}
	public final void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public final String getOrt() {
		return ort;
	}
	public final void setOrt(String ort) {
		this.ort = ort;
	}
	public final String getAnschrift() {
		return anschrift;
	}
	public final void setAnschrift(String anschrift) {
		this.anschrift = anschrift;
	}
	public final Date getGeburtsdatum() {
		return geburtsdatum;
	}
	public final void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public final Integer getPlz() {
		return plz;
	}
	public final void setPlz(Integer plz) {
		this.plz = plz;
	}
	
	
}
