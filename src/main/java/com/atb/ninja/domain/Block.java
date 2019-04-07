package com.atb.ninja.domain;

import java.util.Date;

public class Block {
	
	private Data data;
	private String hash;
	private String linkHash;
	private String timestamp;
	
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getLinkHash() {
		return linkHash;
	}
	public void setLinkHash(String linkHash) {
		this.linkHash = linkHash;
	}
	public String getTimestamp() {
		return Long.toString(new Date().getTime());
	}
	
	@Override
	public String toString() {
		return "Block [data=" + data + ", hash=" + hash + ", linkHash=" + linkHash + "]";
	}
	
	
	

}
