package com.chaitanya.root.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name = "places")
public class ClickBus {
	@Id
	@GeneratedValue
	@Column
	private long id;
	@Column
	private String slug;
	@Column
	private String city;
	@Column
	private String state;
	@Column(name = "created_at")
	private String createdAt;
	@Column(name = "updated_at")
	private String updatedAt;

	public ClickBus() {

	}

	public ClickBus(String slug, String city, String state, String createdAt, String updatedAt) {
		super();
		this.slug = slug;
		this.city = city;
		this.state = state;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
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

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "ClickBus [id=" + id + ", slug=" + slug + ", city=" + city + ", state=" + state + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
