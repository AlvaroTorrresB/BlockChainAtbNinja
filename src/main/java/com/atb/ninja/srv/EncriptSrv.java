package com.atb.ninja.srv;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.atb.ninja.domain.Block;

public interface EncriptSrv {
	
	
	public String generateHash(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException;	

}
