package com.atb.ninja.srv.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.atb.ninja.domain.Block;
import com.atb.ninja.srv.BlockSrv;
import com.atb.ninja.srv.EncriptSrv;

public class BlockSrvImpl implements BlockSrv{
	
	private EncriptSrv encriptSrv;

	public Block linkBlockToTheChain(Block block) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		block.setHash(new EncriptSrvImpl().generateHash(assemblyBlock(block)));
		return block;
	}

	private String assemblyBlock(Block block) {
		return block.getLinkHash() + block.getTimestamp() + (block.getData()).toString();
	}
	
	

}
