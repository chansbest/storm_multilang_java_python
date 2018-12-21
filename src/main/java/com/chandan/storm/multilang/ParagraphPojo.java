package com.chandan.storm.multilang;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class ParagraphPojo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String createdOnDate = LocalDateTime.now().toString();
	List<String> latlongList = new ArrayList<String>();
	List<String> state = new ArrayList<String>();
	List<String> country = new ArrayList<String>();
	private String usage = "NLP WorkBench";
	private String language = "English";
	private String status = "";
	private String debugMsg = "";
	private String paragraph = new String();
	private String original_doc = new String();
	private String content_type = "paragraph";
	private String twitterUser = "";
	private String source = "";
	private Date date = null;
	private String keyword = "";
	
	
	private String link = "";
	private Map<String, Integer> mapOfAbusiveWords;
	private Map<String, Integer> mapOfKeyWords;
	private String sentiment;
	private long sentimentCount;

	private Map<String,List<String>> allEntityValuesMap = new HashMap<String,List<String>>();
	private HashMap<String,Set<String>> posTaggerAttributelist = new HashMap<String,Set<String>>();
	private List<String> rov_crimes = new ArrayList<String>();  						// Types of crimes Keywords
	private List<String> rov_emergencies = new ArrayList<String>(); 					// Types of emergencies
	private List<String> rov_fire = new ArrayList<String>();							// types of fire and incidents
	private List<String> rov_zone = new ArrayList<String>();							// Zone List
	private List<String> rov_police_stn = new ArrayList<String>();						// Police station List
	private List<String> rov_police_rank = new ArrayList<String>(); 					// Police station Designation and ranks
	private List<String>  rov_weapons = new ArrayList<String>();						// Weapons list
	private List<String> rov_vehicle = new ArrayList<String>();							// Vehicle used
	private List<String> rov_officer_name = new ArrayList<String>();					// Persons Names with Designation
	private List<String> rov_forensic_data = new ArrayList<String>();					// Types of forensic data
	private List<String> rov_threats = new ArrayList<String>();							// types of threats
	private List<String> rov_drugs = new ArrayList<String>();							// types of drugs
	private List<String> rov_law_agency = new ArrayList<String>();						// law enforcement agency
	private List<String> rov_ipc_code = new ArrayList<String>();						// Ipc Codes
	private List<String> rov_criminal_org = new ArrayList<String>();					// Criminal Organizations
	private List<String> rov_prison = new ArrayList<String>();							// Prisons
	private List<String> rov_stopword = new ArrayList<String>();						// Stop Words
	private List<String> rov_abusiveword = new ArrayList<String>();						// Abusive Words
	private List<String> rov_keyword = new ArrayList<String>();							// Key words
	private List<String> rov_organization = new ArrayList<String>();
	private List<String> rov_medicalword = new ArrayList<String>();
	private List<String> rov_fireword = new ArrayList<String>();
	
	private List<String> rov_area = new ArrayList<String>();
	private List<String> rov_district = new ArrayList<String>();


	private String type = "";
		public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public List<String> getRov_medicalword() {
		return rov_medicalword;
	}

	public void setRov_medicalword(List<String> rov_medicalword) {
		this.rov_medicalword = rov_medicalword;
	}

	public List<String> getRov_fireword() {
		return rov_fireword;
	}

	public void setRov_fireword(List<String> rov_fireword) {
		this.rov_fireword = rov_fireword;
	}

	public List<String> getRov_keyword() {
		return rov_keyword;
	}

	public void setRov_keyword(List<String> rov_keyword) {
		this.rov_keyword = rov_keyword;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTwitterUser() {
		return twitterUser;
	}

	public void setTwitterUser(String twitterUser) {
		this.twitterUser = twitterUser;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public String getDebugMsg() {
		return debugMsg;
	}

	public void setDebugMsg(String debugMsg) {
		this.debugMsg = debugMsg;
	}



	public String getParagraph() {
		return paragraph;
	}

	public void setParagraph(String paraghraph) {
		this.paragraph = paraghraph;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Map<String, Integer> getMapOfAbusiveWords() {
		return mapOfAbusiveWords;
	}

	public void setMapOfAbusiveWords(Map<String, Integer> mapOfAbusiveWords) {
		this.mapOfAbusiveWords = mapOfAbusiveWords;
	}

	public String getSentiment() {
		return sentiment;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

	public long getSentimentCount() {
		return sentimentCount;
	}

	public void setSentimentCount(long sentimentCount) {
		this.sentimentCount = sentimentCount;
	}

	public Map<String, Integer> getMapOfKeyWords() {
		return mapOfKeyWords;
	}

	public void setMapOfKeyWords(Map<String, Integer> mapOfKeyWords) {
		this.mapOfKeyWords = mapOfKeyWords;
	}
	public String getCreatedOnDate() {
		return createdOnDate;
	}

	public void setCreatedOnDate(String createdOnDate) {
		this.createdOnDate = createdOnDate;
	}

	public Map<String, List<String>> getAllEntityValuesMap() {
		return allEntityValuesMap;
	}

	public void setAllEntityValuesMap(Map<String, List<String>> allEntityValuesMap) {
		this.allEntityValuesMap = allEntityValuesMap;
	}

	public List<String> getState() {
		return state;
	}

	public void setState(List<String> state) {
		this.state = state;
	}

	public List<String> getCountry() {
		return country;
	}

	public void setCountry(List<String> country) {
		this.country = country;
	}

	public List<String> getLatlongList() {
		return latlongList;
	}

	public void setLatlongList(List<String> latlongList) {
		this.latlongList = latlongList;
	}

	public HashMap<String, Set<String>> getPosTaggerAttributelist() {
		return posTaggerAttributelist;
	}

	public void setPosTaggerAttributelist(HashMap<String, Set<String>> posTaggerAttributelist) {
		this.posTaggerAttributelist = posTaggerAttributelist;
	}
	public List<String> getRov_crimes() {
		return rov_crimes;
	}

	public void setRov_crimes(List<String> rov_crimes) {
		this.rov_crimes = rov_crimes;
	}

	public List<String> getRov_emergencies() {
		return rov_emergencies;
	}

	public void setRov_emergencies(List<String> rov_emergencies) {
		this.rov_emergencies = rov_emergencies;
	}

	public List<String> getRov_fire() {
		return rov_fire;
	}

	public void setRov_fire(List<String> rov_fire) {
		this.rov_fire = rov_fire;
	}

	public List<String> getRov_zone() {
		return rov_zone;
	}

	public void setRov_zone(List<String> rov_zone) {
		this.rov_zone = rov_zone;
	}

	public List<String> getRov_police_stn() {
		return rov_police_stn;
	}

	public void setRov_police_stn(List<String> rov_police_stn) {
		this.rov_police_stn = rov_police_stn;
	}

	public List<String> getRov_police_rank() {
		return rov_police_rank;
	}

	public void setRov_police_rank(List<String> rov_police_rank) {
		this.rov_police_rank = rov_police_rank;
	}

	public List<String> getRov_weapons() {
		return rov_weapons;
	}

	public void setRov_weapons(List<String> rov_weapons) {
		this.rov_weapons = rov_weapons;
	}

	public List<String> getRov_vehicle() {
		return rov_vehicle;
	}

	public void setRov_vehicle(List<String> rov_vehicle) {
		this.rov_vehicle = rov_vehicle;
	}

	public List<String> getRov_officer_name() {
		return rov_officer_name;
	}

	public void setRov_officer_name(List<String> rov_officer_name) {
		this.rov_officer_name = rov_officer_name;
	}

	public List<String> getRov_forensic_data() {
		return rov_forensic_data;
	}

	public void setRov_forensic_data(List<String> rov_forensic_data) {
		this.rov_forensic_data = rov_forensic_data;
	}

	public List<String> getRov_threats() {
		return rov_threats;
	}

	public void setRov_threats(List<String> rov_threats) {
		this.rov_threats = rov_threats;
	}

	public List<String> getRov_drugs() {
		return rov_drugs;
	}

	public void setRov_drugs(List<String> rov_drugs) {
		this.rov_drugs = rov_drugs;
	}

	public List<String> getRov_law_agency() {
		return rov_law_agency;
	}

	public void setRov_law_agency(List<String> rov_law_agency) {
		this.rov_law_agency = rov_law_agency;
	}

	public List<String> getRov_ipc_code() {
		return rov_ipc_code;
	}

	public void setRov_ipc_code(List<String> rov_ipc_code) {
		this.rov_ipc_code = rov_ipc_code;
	}
	
	public List<String> getRov_criminal_org() {
		return rov_criminal_org;
	}

	public void setRov_criminal_org(List<String> rov_criminal_org) {
		this.rov_criminal_org = rov_criminal_org;
	}

	public List<String> getRov_prison() {
		return rov_prison;
	}

	public void setRov_prison(List<String> rov_prison) {
		this.rov_prison = rov_prison;
	}

	public List<String> getRov_stopword() {
		return rov_stopword;
	}

	public void setRov_stopword(List<String> rov_stopword) {
		this.rov_stopword = rov_stopword;
	}

	public List<String> getRov_abusiveword() {
		return rov_abusiveword;
	}

	public void setRov_abusiveword(List<String> rov_abusiveword) {
		this.rov_abusiveword = rov_abusiveword;
	}

	public List<String> getRov_organization() {
		return rov_organization;
	}

	public void setRov_organization(List<String> rov_organization) {
		this.rov_organization = rov_organization;
	}

	public List<String> getRov_area() {
		return rov_area;
	}

	public void setRov_area(List<String> rov_area) {
		this.rov_area = rov_area;
	}

	public List<String> getRov_district() {
		return rov_district;
	}

	public void setRov_district(List<String> rov_district) {
		this.rov_district = rov_district;
	}


	public String getOriginal_doc() {
		return original_doc;
	}

	public void setOriginal_doc(String original_doc) {
		this.original_doc = original_doc;
	}


}
