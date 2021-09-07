package com.gvr.cdmx.servicio.mb.consulta.dto;

 
public class MetroBusDTO {
	private String id;
	private String dateUpdated;
	private String vehicleId;
	private String vehicleLabel;
	private String vehicleCurrentStatus;
	private String positionLatitude;
	private String positionLongitude;
	private String geographicPoint;
	private String positionSpeed;
	private String positionOdometer;
	private String tripScheduleRelationship;
	private String tripId;
	private String tripStartDate;
	private String tripRouteId;

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
