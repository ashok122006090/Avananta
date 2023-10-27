package com.Avananta.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class YourEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String yourColumn;
//    {
//        "id": 12,
//        "yourColumn": "name"
//    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getYourColumn() {
		return yourColumn;
	}
	public void setYourColumn(String yourColumn) {
		this.yourColumn = yourColumn;
	}
	@Override
	public String toString() {
		return "YourEntity [id=" + id + ", yourColumn=" + yourColumn + "]";
	}
	public YourEntity(Long id, String yourColumn) {
		super();
		this.id = id;
		this.yourColumn = yourColumn;
	}
	public YourEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}


