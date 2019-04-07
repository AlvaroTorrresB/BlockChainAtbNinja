package com.atb.ninja.srv;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.atb.ninja.domain.Block;

public interface BlockSrv {
	
	public Block linkBlockToTheChain(Block block) throws NoSuchAlgorithmException, UnsupportedEncodingException;
	

}
