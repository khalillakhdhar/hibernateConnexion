package com.hb.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false,length = 30)
private String nom,prenom;
@Column(unique = true)
@Email
private String email;
@Column(name = "mdp")
private String password;
@Temporal(TemporalType.TIMESTAMP)
@CreatedDate
// récupére la date et heure systéme
private Date dateCreation;
@Min(value = 18)
private int age;
@Column(columnDefinition = "varchar(30) default 'étudiant' ") // valeur par défaut
private String grade;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}




public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(long id, String nom, String prenom, String email, String password, Date dateCreation) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.password = password;
	this.dateCreation = dateCreation;
}






}
