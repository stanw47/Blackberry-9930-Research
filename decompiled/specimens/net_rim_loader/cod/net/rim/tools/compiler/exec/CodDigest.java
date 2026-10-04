// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 6
// ########################################################


package net.rim.tools.compiler.exec;


public class CodDigest extends Object

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.exec.CodDigest ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public update( net.rim.tools.compiler.exec.CodDigest, byte[], int, int ); // address: 0
	{
	noenter_return 
	}


public byte[] getDigest( net.rim.tools.compiler.exec.CodDigest ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


public byte[] readDigest( net.rim.tools.compiler.exec.CodDigest, java.io.InputStream ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


public writeDigest( net.rim.tools.compiler.exec.CodDigest, java.io.PrintStream ); // address: 0
	{
	noenter_return 
	}


public net.rim.tools.compiler.exec.CodDigest$ClassDigest getClassDigest( net.rim.tools.compiler.exec.CodDigest, java.lang.String ); // address: 0
	{
	enter_narrow 
	new CodDigest$ClassDigest
	dup 
	aload_0 
	invokespecial net.rim.tools.compiler.exec.CodDigest$ClassDigest.<init> // pc=2
	areturn 
	}

}
