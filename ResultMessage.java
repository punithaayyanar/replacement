package com.aspire.navajoreplacement.dto;

import org.springframework.stereotype.Component;


@Component
public class ResultMessage {

	private String organizationId;
	private String addressId;
	private String telephoneId;
	private String faxId;
	private String emailId;
	private String websiteId;
	private String accountId;
	private int updateCount;
	private String navajoUser;
	private String databaseVersion;
	private String databaseProductName;
	
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getTelephoneId() {
		return telephoneId;
	}
	public void setTelephoneId(String telephoneId) {
		this.telephoneId = telephoneId;
	}
	public String getFaxId() {
		return faxId;
	}
	public void setFaxId(String faxId) {
		this.faxId = faxId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getWebsiteId() {
		return websiteId;
	}
	public void setWebsiteId(String websiteId) {
		this.websiteId = websiteId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public int getUpdateCount() {
		return updateCount;
	}
	public void setUpdateCount(int updateCount) {
		this.updateCount = updateCount;
	}
	public String getNavajoUser() {
		return navajoUser;
	}
	public void setNavajoUser(String navajoUser) {
		this.navajoUser = navajoUser;
	}
	public String getDatabaseVersion() {
		return databaseVersion;
	}
	public void setDatabaseVersion(String databaseVersion) {
		this.databaseVersion = databaseVersion;
	}
	public String getDatabaseProductName() {
		return databaseProductName;
	}
	public void setDatabaseProductName(String databaseProductName) {
		this.databaseProductName = databaseProductName;
	}
	
	
	
}
