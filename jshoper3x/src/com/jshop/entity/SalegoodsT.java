package com.jshop.entity;

// Generated 2014-7-25 23:44:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SalegoodsT generated by hbm2java
 */
@Entity
@Table(name = "salegoods_t", catalog = "jshoper3")
public class SalegoodsT implements java.io.Serializable {

	private String salegoodsid;
	private String salegoodsname;
	private String salegoodsnumber;
	private String salegoodspictureurl;
	private String salegoodsinformation;
	private String salegoodsstate;
	private Date begingtime;
	private Date endingtime;
	private String salepeople;
	private double salestartingprice;
	private int salejoinpeople;
	private String salebudget;
	private String realname;
	private String userid;
	private double saleprice;
	private String htmlpath;
	private Double marketprice;
	private String newornot;
	private String salegoodsmessage;
	private Double lowprice;
	private String place;
	private String manufacturer;

	public SalegoodsT() {
	}

	public SalegoodsT(String salegoodsid, String salegoodsname,
			String salegoodsnumber, String salegoodspictureurl,
			String salegoodsstate, double salestartingprice,
			int salejoinpeople, String realname, String userid, double saleprice) {
		this.salegoodsid = salegoodsid;
		this.salegoodsname = salegoodsname;
		this.salegoodsnumber = salegoodsnumber;
		this.salegoodspictureurl = salegoodspictureurl;
		this.salegoodsstate = salegoodsstate;
		this.salestartingprice = salestartingprice;
		this.salejoinpeople = salejoinpeople;
		this.realname = realname;
		this.userid = userid;
		this.saleprice = saleprice;
	}

	public SalegoodsT(String salegoodsid, String salegoodsname,
			String salegoodsnumber, String salegoodspictureurl,
			String salegoodsinformation, String salegoodsstate,
			Date begingtime, Date endingtime, String salepeople,
			double salestartingprice, int salejoinpeople, String salebudget,
			String realname, String userid, double saleprice, String htmlpath,
			Double marketprice, String newornot, String salegoodsmessage,
			Double lowprice, String place, String manufacturer) {
		this.salegoodsid = salegoodsid;
		this.salegoodsname = salegoodsname;
		this.salegoodsnumber = salegoodsnumber;
		this.salegoodspictureurl = salegoodspictureurl;
		this.salegoodsinformation = salegoodsinformation;
		this.salegoodsstate = salegoodsstate;
		this.begingtime = begingtime;
		this.endingtime = endingtime;
		this.salepeople = salepeople;
		this.salestartingprice = salestartingprice;
		this.salejoinpeople = salejoinpeople;
		this.salebudget = salebudget;
		this.realname = realname;
		this.userid = userid;
		this.saleprice = saleprice;
		this.htmlpath = htmlpath;
		this.marketprice = marketprice;
		this.newornot = newornot;
		this.salegoodsmessage = salegoodsmessage;
		this.lowprice = lowprice;
		this.place = place;
		this.manufacturer = manufacturer;
	}

	@Id
	@Column(name = "SALEGOODSID", unique = true, nullable = false, length = 20)
	public String getSalegoodsid() {
		return this.salegoodsid;
	}

	public void setSalegoodsid(String salegoodsid) {
		this.salegoodsid = salegoodsid;
	}

	@Column(name = "SALEGOODSNAME", nullable = false, length = 20)
	public String getSalegoodsname() {
		return this.salegoodsname;
	}

	public void setSalegoodsname(String salegoodsname) {
		this.salegoodsname = salegoodsname;
	}

	@Column(name = "SALEGOODSNUMBER", nullable = false, length = 50)
	public String getSalegoodsnumber() {
		return this.salegoodsnumber;
	}

	public void setSalegoodsnumber(String salegoodsnumber) {
		this.salegoodsnumber = salegoodsnumber;
	}

	@Column(name = "SALEGOODSPICTUREURL", nullable = false, length = 225)
	public String getSalegoodspictureurl() {
		return this.salegoodspictureurl;
	}

	public void setSalegoodspictureurl(String salegoodspictureurl) {
		this.salegoodspictureurl = salegoodspictureurl;
	}

	@Column(name = "SALEGOODSINFORMATION", length = 200)
	public String getSalegoodsinformation() {
		return this.salegoodsinformation;
	}

	public void setSalegoodsinformation(String salegoodsinformation) {
		this.salegoodsinformation = salegoodsinformation;
	}

	@Column(name = "SALEGOODSSTATE", nullable = false, length = 1)
	public String getSalegoodsstate() {
		return this.salegoodsstate;
	}

	public void setSalegoodsstate(String salegoodsstate) {
		this.salegoodsstate = salegoodsstate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BEGINGTIME", length = 0)
	public Date getBegingtime() {
		return this.begingtime;
	}

	public void setBegingtime(Date begingtime) {
		this.begingtime = begingtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDINGTIME", length = 0)
	public Date getEndingtime() {
		return this.endingtime;
	}

	public void setEndingtime(Date endingtime) {
		this.endingtime = endingtime;
	}

	@Column(name = "SALEPEOPLE", length = 20)
	public String getSalepeople() {
		return this.salepeople;
	}

	public void setSalepeople(String salepeople) {
		this.salepeople = salepeople;
	}

	@Column(name = "SALESTARTINGPRICE", nullable = false, precision = 10)
	public double getSalestartingprice() {
		return this.salestartingprice;
	}

	public void setSalestartingprice(double salestartingprice) {
		this.salestartingprice = salestartingprice;
	}

	@Column(name = "SALEJOINPEOPLE", nullable = false)
	public int getSalejoinpeople() {
		return this.salejoinpeople;
	}

	public void setSalejoinpeople(int salejoinpeople) {
		this.salejoinpeople = salejoinpeople;
	}

	@Column(name = "SALEBUDGET", length = 200)
	public String getSalebudget() {
		return this.salebudget;
	}

	public void setSalebudget(String salebudget) {
		this.salebudget = salebudget;
	}

	@Column(name = "REALNAME", nullable = false, length = 20)
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(name = "USERID", nullable = false, length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "SALEPRICE", nullable = false, precision = 10)
	public double getSaleprice() {
		return this.saleprice;
	}

	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}

	@Column(name = "HTMLPATH", length = 45)
	public String getHtmlpath() {
		return this.htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}

	@Column(name = "MARKETPRICE", precision = 10)
	public Double getMarketprice() {
		return this.marketprice;
	}

	public void setMarketprice(Double marketprice) {
		this.marketprice = marketprice;
	}

	@Column(name = "NEWORNOT", length = 10)
	public String getNewornot() {
		return this.newornot;
	}

	public void setNewornot(String newornot) {
		this.newornot = newornot;
	}

	@Column(name = "SALEGOODSMESSAGE", length = 50)
	public String getSalegoodsmessage() {
		return this.salegoodsmessage;
	}

	public void setSalegoodsmessage(String salegoodsmessage) {
		this.salegoodsmessage = salegoodsmessage;
	}

	@Column(name = "LOWPRICE", precision = 10)
	public Double getLowprice() {
		return this.lowprice;
	}

	public void setLowprice(Double lowprice) {
		this.lowprice = lowprice;
	}

	@Column(name = "PLACE", length = 30)
	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Column(name = "MANUFACTURER", length = 35)
	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
