package com.atb.ninja.srv.impl;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.atb.ninja.srv.EncriptSrv;

public class EncriptSrvImpl implements EncriptSrv{
	
	public String generateHash(String data) throws NoSuchAlgorithmException, UnsupportedEncodingException{		
		MessageDigest digest = MessageDigest.getInstance("SHA-256");	        
		byte[] hash = digest.digest(data.getBytes("UTF-8"));	        
		StringBuffer hexString = new StringBuffer(); 
		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if(hex.length() == 1) hexString.append('0');
			hexString.append(hex);
		}
		return hexString.toString();
}

}
