package com.gvr.cdmx.servicio.mb.scheduler.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetroBus {
	private String _id;
	private String id;
	@JsonProperty("date_updated") private String dateUpdated;
	@JsonProperty("vehicle_id") private String vehicleId;
	@JsonProperty("vehicle_label") private String vehicleLabel;
	@JsonProperty("vehicle_current_status")	private String vehicleCurrentStatus;
	@JsonProperty("position_latitude") private String positionLatitude;
	@JsonProperty("position_longitude") private String positionLongitude;
	@JsonProperty("geographic_point") private String geographicPoint;
	@JsonProperty("position_speed") private String positionSpeed;
	@JsonProperty("position_odometer") private String positionOdometer;
	@JsonProperty("trip_schedule_relationship") private String tripScheduleRelationship;
	@JsonProperty("trip_id") private String tripId;
	@JsonProperty("trip_start_date") private String tripStartDate;
	@JsonProperty("trip_route_id") private String tripRouteId;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleLabel() {
		return vehicleLabel;
	}
	public void setVehicleLabel(String vehicleLabel) {
		this.vehicleLabel = vehicleLabel;
	}
	public String getVehicleCurrentStatus() {
		return vehicleCurrentStatus;
	}
	public void setVehicleCurrentStatus(String vehicleCurrentStatus) {
		this.vehicleCurrentStatus = vehicleCurrentStatus;
	}
	public String getPositionLatitude() {
		return positionLatitude;
	}
	public void setPositionLatitude(String positionLatitude) {
		this.positionLatitude = positionLatitude;
	}
	public String getPositionLongitude() {
		return positionLongitude;
	}
	public void setPositionLongitude(String positionLongitude) {
		this.positionLongitude = positionLongitude;
	}
	public String getGeographicPoint() {
		return geographicPoint;
	}
	public void setGeographicPoint(String geographicPoint) {
		this.geographicPoint = geographicPoint;
	}
	public String getPositionSpeed() {
		return positionSpeed;
	}
	public void setPositionSpeed(String positionSpeed) {
		this.positionSpeed = positionSpeed;
	}
	public String getPositionOdometer() {
		return positionOdometer;
	}
	public void setPositionOdometer(String positionOdometer) {
		this.positionOdometer = positionOdometer;
	}
	public String getTripScheduleRelationship() {
		return tripScheduleRelationship;
	}
	public void setTripScheduleRelationship(String tripScheduleRelationship) {
		this.tripScheduleRelationship = tripScheduleRelationship;
	}
	public String getTripId() {
		return tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public String getTripStartDate() {
		return tripStartDate;
	}
	public void setTripStartDate(String tripStartDate) {
		this.tripStartDate = tripStartDate;
	}
	public String getTripRouteId() {
		return tripRouteId;
	}
	public void setTripRouteId(String tripRouteId) {
		this.tripRouteId = tripRouteId;
	}
	

}