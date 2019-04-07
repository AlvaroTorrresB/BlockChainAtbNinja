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
		//Generaci�n del bloque Genesis de la cadena 
		Block genesis=new Block();              //Asignaci�n del Hash del bloque previo
			genesis.setData(new Data("REF00001"));  //Asignaci�n de la informaci�n del bloque
			genesis.setLinkHash("0");               //Generaci�n del hash del bloque y vinculaci�n a la cadena
			genesis=srv.linkBlockToTheChain(genesis);
		//Generacion del bloque 1
		Block block1=new Block();
			block1.setLinkHash(genesis.getHash());  //Asignaci�n del Hash del bloque previo
			block1.setData(new Data("REF00002"));   //Asignaci�n de la informaci�n del bloque
			block1=srv.linkBlockToTheChain(block1); //Generaci�n del hash del bloque y vinculaci�n a la cadena
		//Generacion del bloque 2
		Block block2=new Block();
			block2.setLinkHash(block1.getHash());  //Asignaci�n del Hash del bloque previo
			block2.setData(new Data("REF00002"));   //Asignaci�n de la informaci�n del bloque
			block2=srv.linkBlockToTheChain(block2); //Generaci�n del hash del bloque y vinculaci�n a la cadena
			
		//Sacamos por consola la informaci�n de la cadena
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
