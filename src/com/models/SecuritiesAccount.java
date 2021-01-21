package com.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "accountId", "roundTrips", "isDayTrader", "isClosingOnlyRestricted", "initialBalances",
		"currentBalances", "projectedBalances" })
public class SecuritiesAccount {

	@JsonProperty("type")
	private String type;
	@JsonProperty("accountId")
	private String accountId;
	@JsonProperty("roundTrips")
	private int roundTrips;
	@JsonProperty("isDayTrader")
	private boolean isDayTrader;
	@JsonProperty("isClosingOnlyRestricted")
	private boolean isClosingOnlyRestricted;
	@JsonProperty("initialBalances")
	private InitialBalances initialBalances;
	@JsonProperty("currentBalances")
	private CurrentBalances currentBalances;
	@JsonProperty("projectedBalances")
	private ProjectedBalances projectedBalances;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public SecuritiesAccount() {
	}

	/**
	 *
	 * @param accountId
	 * @param roundTrips
	 * @param initialBalances
	 * @param isDayTrader
	 * @param projectedBalances
	 * @param type
	 * @param currentBalances
	 * @param isClosingOnlyRestricted
	 */
	public SecuritiesAccount(String type, String accountId, int roundTrips, boolean isDayTrader,
			boolean isClosingOnlyRestricted, InitialBalances initialBalances, CurrentBalances currentBalances,
			ProjectedBalances projectedBalances) {
		super();
		this.type = type;
		this.accountId = accountId;
		this.roundTrips = roundTrips;
		this.isDayTrader = isDayTrader;
		this.isClosingOnlyRestricted = isClosingOnlyRestricted;
		this.initialBalances = initialBalances;
		this.currentBalances = currentBalances;
		this.projectedBalances = projectedBalances;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("accountId")
	public String getAccountId() {
		return accountId;
	}

	@JsonProperty("accountId")
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@JsonProperty("roundTrips")
	public int getRoundTrips() {
		return roundTrips;
	}

	@JsonProperty("roundTrips")
	public void setRoundTrips(int roundTrips) {
		this.roundTrips = roundTrips;
	}

	@JsonProperty("isDayTrader")
	public boolean isIsDayTrader() {
		return isDayTrader;
	}

	@JsonProperty("isDayTrader")
	public void setIsDayTrader(boolean isDayTrader) {
		this.isDayTrader = isDayTrader;
	}

	@JsonProperty("isClosingOnlyRestricted")
	public boolean isIsClosingOnlyRestricted() {
		return isClosingOnlyRestricted;
	}

	@JsonProperty("isClosingOnlyRestricted")
	public void setIsClosingOnlyRestricted(boolean isClosingOnlyRestricted) {
		this.isClosingOnlyRestricted = isClosingOnlyRestricted;
	}

	@JsonProperty("initialBalances")
	public InitialBalances getInitialBalances() {
		return initialBalances;
	}

	@JsonProperty("initialBalances")
	public void setInitialBalances(InitialBalances initialBalances) {
		this.initialBalances = initialBalances;
	}

	@JsonProperty("currentBalances")
	public CurrentBalances getCurrentBalances() {
		return currentBalances;
	}

	@JsonProperty("currentBalances")
	public void setCurrentBalances(CurrentBalances currentBalances) {
		this.currentBalances = currentBalances;
	}

	@JsonProperty("projectedBalances")
	public ProjectedBalances getProjectedBalances() {
		return projectedBalances;
	}

	@JsonProperty("projectedBalances")
	public void setProjectedBalances(ProjectedBalances projectedBalances) {
		this.projectedBalances = projectedBalances;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}