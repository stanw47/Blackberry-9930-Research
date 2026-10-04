// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 36
// ########################################################


package net.rim.tools.compiler.codfile;


public class CodfileItemRelative extends net.rim.tools.compiler.codfile.CodfileItem

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.CodfileItemRelative ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.codfile.CodfileItem )
	}


public <init>( net.rim.tools.compiler.codfile.CodfileItemRelative, int ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.codfile.CodfileItem, int )
	}


public <init>( net.rim.tools.compiler.codfile.CodfileItemRelative, module:net_rim_loader-2.class#45 ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.codfile.CodfileItem, module:net_rim_loader-2.class#45 )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public write( net.rim.tools.compiler.codfile.CodfileItemRelative, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokevirtual routine
	aload_0 
	aload_1 
	iconst_0 
	invokevirtual writeRelative( net.rim.tools.compiler.codfile.CodfileItemRelative, net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=3
	aload_0 
	aload_1 
	invokevirtual routine
	return 
	}


abstract public writeRelative( net.rim.tools.compiler.codfile.CodfileItemRelative, net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	halt 
	}

}
