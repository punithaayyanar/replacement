package com.aspire.navajoreplacement.dto;

import org.springframework.stereotype.Component;


@Component
public class DefaultSubscription {

	
	private String objectId;
	private String objectType;
	private int insertCount;
	private String insertedTypeOfOrganization;
	private String insertedObjectRole;
	private String insertedObjectFunctions;
	private int deleteCount;
	private String deletedTypeOfOrganization;
	private String deletedObjectRole;
	private String deletedObjectFunctions;
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getObjectType() {
		return objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
	public int getInsertCount() {
		return insertCount;
	}
	public void setInsertCount(int insertCount) {
		this.insertCount = insertCount;
	}
	public String getInsertedTypeOfOrganization() {
		return insertedTypeOfOrganization;
	}
	public void setInsertedTypeOfOrganization(String insertedTypeOfOrganization) {
		this.insertedTypeOfOrganization = insertedTypeOfOrganization;
	}
	public String getInsertedObjectRole() {
		return insertedObjectRole;
	}
	public void setInsertedObjectRole(String insertedObjectRole) {
		this.insertedObjectRole = insertedObjectRole;
	}
	public String getInsertedObjectFunctions() {
		return insertedObjectFunctions;
	}
	public void setInsertedObjectFunctions(String insertedObjectFunctions) {
		this.insertedObjectFunctions = insertedObjectFunctions;
	}
	public int getDeleteCount() {
		return deleteCount;
	}
	public void setDeleteCount(int deleteCount) {
		this.deleteCount = deleteCount;
	}
	public String getDeletedTypeOfOrganization() {
		return deletedTypeOfOrganization;
	}
	public void setDeletedTypeOfOrganization(String deletedTypeOfOrganization) {
		this.deletedTypeOfOrganization = deletedTypeOfOrganization;
	}
	public String getDeletedObjectRole() {
		return deletedObjectRole;
	}
	public void setDeletedObjectRole(String deletedObjectRole) {
		this.deletedObjectRole = deletedObjectRole;
	}
	public String getDeletedObjectFunctions() {
		return deletedObjectFunctions;
	}
	public void setDeletedObjectFunctions(String deletedObjectFunctions) {
		this.deletedObjectFunctions = deletedObjectFunctions;
	}
	
	
}
