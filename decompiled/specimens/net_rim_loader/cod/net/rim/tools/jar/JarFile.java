// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 23
// ########################################################


package net.rim.tools.jar;


public class JarFile extends Object

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.jar.JarFile ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static int extractShort( byte[], int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	baload 
	sipush 255
	iand 
	aload_0 
	iload_1 
	iconst_1 
	iadd 
	baload 
	sipush 255
	iand 
	bipush 8
	ishl 
	ior 
	iipush 65535
	iand 
	ireturn 
	}


static int extractInt( byte[], int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	baload 
	sipush 255
	iand 
	aload_0 
	iload_1 
	iconst_1 
	iadd 
	baload 
	sipush 255
	iand 
	bipush 8
	ishl 
	ior 
	aload_0 
	iload_1 
	bipush 2
	iadd 
	baload 
	sipush 255
	iand 
	bipush 16
	ishl 
	ior 
	aload_0 
	iload_1 
	bipush 3
	iadd 
	baload 
	bipush 24
	ishl 
	ior 
	ireturn 
	}

}
