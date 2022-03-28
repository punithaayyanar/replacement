package com.aspire.navajoreplacement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class PublicationChannelQuanta {

	@Id
	@NotNull
	@Column(name = "PUBLICATIONID")
	int publicationId;
	 
	@NotNull
	@Column(name = "PUBLICATIONCHANNELID")
	String publicationChannelId;
	
	@NotNull
	@Column(name = "TYPEOFORGANIZATION")
	String typeOfOrganization;
	
	@NotNull
	@Column(name = "OBJECTROLE")
	String objectRole;
	
	@NotNull
	@Column(name = "OBJECTFUNCTION")
	String objectFunction;
	
	@NotNull
	@Column(name = "CHECKORGANIZATIONID")
	char checkOrganizationId;
	
	@NotNull
	@Column(name = "GAMETYPE")
	String gameType;
	
	@NotNull
	@Column(name = "FREECOPIES")
	int freeCopies;
	
	@NotNull
	@Column(name = "PAIDCOPIES")
	int paidCopies;
	
	@NotNull
	@Column(name = "UPDATEBY")
	String updatedBy;
	
	@NotNull
	@Column(name = "LASTUPDATE")
	Date lastUpdate ;

	public int getPublicationId() {
		return publicationId;
	}

	public void setPublicationId(int publicationId) {
		this.publicationId = publicationId;
	}

	public String getPublicationChannelId() {
		return publicationChannelId;
	}

	public void setPublicationChannelId(String publicationChannelId) {
		this.publicationChannelId = publicationChannelId;
	}

	public String getTypeOfOrganization() {
		return typeOfOrganization;
	}

	public void setTypeOfOrganization(String typeOfOrganization) {
		this.typeOfOrganization = typeOfOrganization;
	}

	public String getObjectRole() {
		return objectRole;
	}

	public void setObjectRole(String objectRole) {
		this.objectRole = objectRole;
	}

	public String getObjectFunction() {
		return objectFunction;
	}

	public void setObjectFunction(String objectFunction) {
		this.objectFunction = objectFunction;
	}

	public char getCheckOrganizationId() {
		return checkOrganizationId;
	}

	public void setCheckOrganizationId(char checkOrganizationId) {
		this.checkOrganizationId = checkOrganizationId;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public int getFreeCopies() {
		return freeCopies;
	}

	public void setFreeCopies(int freeCopies) {
		this.freeCopies = freeCopies;
	}

	public int getPaidCopies() {
		return paidCopies;
	}

	public void setPaidCopies(int paidCopies) {
		this.paidCopies = paidCopies;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
	
}
