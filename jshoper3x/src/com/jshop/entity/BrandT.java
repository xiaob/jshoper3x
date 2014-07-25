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
 * BrandT generated by hbm2java
 */
@Entity
@Table(name = "brand_t", catalog = "jshoper3")
public class BrandT implements java.io.Serializable {

	private String brandid;
	private String brandname;
	private String creatorid;
	private String username;
	private Date createtime;
	private String intro;
	private String logoPath;
	private Integer sort;
	private String url;

	public BrandT() {
	}

	public BrandT(String brandid, String brandname, Date createtime) {
		this.brandid = brandid;
		this.brandname = brandname;
		this.createtime = createtime;
	}

	public BrandT(String brandid, String brandname, String creatorid,
			String username, Date createtime, String intro, String logoPath,
			Integer sort, String url) {
		this.brandid = brandid;
		this.brandname = brandname;
		this.creatorid = creatorid;
		this.username = username;
		this.createtime = createtime;
		this.intro = intro;
		this.logoPath = logoPath;
		this.sort = sort;
		this.url = url;
	}

	@Id
	@Column(name = "BRANDID", unique = true, nullable = false, length = 20)
	public String getBrandid() {
		return this.brandid;
	}

	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}

	@Column(name = "BRANDNAME", nullable = false, length = 50)
	public String getBrandname() {
		return this.brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	@Column(name = "CREATORID", length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "USERNAME", length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "INTRO", length = 65535)
	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Column(name = "LOGO_PATH")
	public String getLogoPath() {
		return this.logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	@Column(name = "SORT")
	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Column(name = "URL")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
