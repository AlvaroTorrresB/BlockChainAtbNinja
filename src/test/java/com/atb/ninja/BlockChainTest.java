package com.atb.ninja;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.junit.Before;
import org.junit.Test;

import com.atb.ninja.domain.Block;
import com.atb.ninja.domain.Data;
import com.atb.ninja.srv.BlockSrv;
import com.atb.ninja.srv.impl.BlockSrvImpl;

import junit.framework.Assert;

public class BlockChainTest {

	
	private BlockSrv srv;
	
	@Before
	public void load()
	{
		srv=new BlockSrvImpl();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void checkLinkBloks() throws NoSuchAlgorithmException, UnsupportedEncodingException
	{
		Block genesis=new Block();              //Asignación del Hash del bloque previo
		genesis.setData(new Data("REF00001"));  //Asignación de la información del bloque
		genesis.setLinkHash("0");               //Generación del hash del bloque y vinculación a la cadena
		genesis=srv.linkBlockToTheChain(genesis);
		//Generacion del bloque 1
		Block block1=new Block();
		block1.setLinkHash(genesis.getHash());  //Asignación del Hash del bloque previo
		block1.setData(new Data("REF00002"));   //Asignación de la información del bloque
		block1=srv.linkBlockToTheChain(block1);
		Assert.assertEquals(genesis.getHash(),block1.getLinkHash());
	}
}
