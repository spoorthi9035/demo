package com.example.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "surveyModel")
public class ModelClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="street_address")
    private String street_address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zipcode")
    private String zipcode;
    @Column(name="telephone_number")
    private String telephone_number;
    @Column(name="email")
    private String email;
    @Column(name="dateOfSurvey")
    private String date_of_survey;
    @Column(name="liked_most")
    private String liked_most;
    @Column(name="interested_in")
    private String interested_in;
    @Column(name="likelihood")
    private String likelihood;

    // Default constructor (required by JPA)
    public ModelClass() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getTelephone_number() {
		return telephone_number;
	}

	public void setTelephone_number(String telephone_number) {
		this.telephone_number = telephone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate_of_survey() {
		return date_of_survey;
	}

	public void setDate_of_survey(String date_of_survey) {
		this.date_of_survey = date_of_survey;
	}

	public String getLiked_most() {
		return liked_most;
	}

	public void setLiked_most(String liked_most) {
		this.liked_most = liked_most;
	}

	public String getInterested_in() {
		return interested_in;
	}

	public void setInterested_in(String interested_in) {
		this.interested_in = interested_in;
	}

	public String getLikelihood() {
		return likelihood;
	}

	public void setLikelihood(String likelihood) {
		this.likelihood = likelihood;
	}

    
    
    
    

}