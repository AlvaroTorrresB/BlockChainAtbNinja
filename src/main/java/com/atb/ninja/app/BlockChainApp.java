package com.atb.ninja.app;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.atb.ninja.domain.Block;
import com.atb.ninja.domain.Data;
import com.atb.ninja.srv.BlockSrv;
import com.atb.ninja.srv.impl.BlockSrvImpl;

public class BlockChainApp {

	public static void main(String[] args) {
		
		try
		{
		BlockSrv srv=new BlockSrvImpl();
		//Generación del bloque Genesis de la cadena 
		Block genesis=new Block();              //Asignación del Hash del bloque previo
			genesis.setData(new Data("REF00001"));  //Asignación de la información del bloque
			genesis.setLinkHash("0");               //Generación del hash del bloque y vinculación a la cadena
			genesis=srv.linkBlockToTheChain(genesis);
		//Generacion del bloque 1
		Block block1=new Block();
			block1.setLinkHash(genesis.getHash());  //Asignación del Hash del bloque previo
			block1.setData(new Data("REF00002"));   //Asignación de la información del bloque
			block1=srv.linkBlockToTheChain(block1); //Generación del hash del bloque y vinculación a la cadena
		//Generacion del bloque 2
		Block block2=new Block();
			block2.setLinkHash(block1.getHash());  //Asignación del Hash del bloque previo
			block2.setData(new Data("REF00002"));   //Asignación de la información del bloque
			block2=srv.linkBlockToTheChain(block2); //Generación del hash del bloque y vinculación a la cadena
			
		//Sacamos por consola la información de la cadena
		System.out.println(genesis.toString());
		System.out.println(block1.toString());
		System.out.println(block2.toString());
		}
		catch (NoSuchAlgorithmException e ) 
		{
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
