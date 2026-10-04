// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 14
// ########################################################


package net.rim.tools.compiler.io;


public class DigestInputStream extends java.io.InputStream

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.crypto.Digest /*net.rim.device.api.crypto.Digest*/  _digest ; // ofs = 10508 addr = 0)
	private java.io.InputStream /*java.io.InputStream*/  _inputStream ; // ofs = 10512 addr = 0)
	private int /*int*/  _length ; // ofs = 10516 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.io.DigestInputStream, net.rim.device.api.crypto.Digest, java.io.InputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.io.InputStream.<init> // pc=1
	aload_1 
	ifnull Label7
	aload_2 
	ifnonnull Label11
Label7:
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label11:
	aload_0 
	aload_1 
	putfield _digest   // get_name_1:  _digest   // get_name_2:  _digest   // get_Name:    _digest   // getName->1:  _digest   // getName->2:  _digest   // getName->N:  _digest   // ofs = 10508 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 10512 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public int read( net.rim.tools.compiler.io.DigestInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 10512 ord = 1 addr = 0
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_1 
	iload_1 
	bipush -1
	if_icmpeq Label15
	aload_0 
	aload_0_getfield _length   // get_name_1:  _length   // get_name_2:  _length   // get_Name:    _length   // getName->1:  _length   // getName->2:  _length   // getName->N:  _length   // ofs = 10516 ord = 2 addr = 0
	iconst_1 
	iadd 
	putfield _length   // get_name_1:  _length   // get_name_2:  _length   // get_Name:    _length   // getName->1:  _length   // getName->2:  _length   // getName->N:  _length   // ofs = 10516 ord = 2 addr = 0
	aload_0_getfield _digest   // get_name_1:  _digest   // get_name_2:  _digest   // get_Name:    _digest   // getName->1:  _digest   // getName->2:  _digest   // getName->N:  _digest   // ofs = 10508 ord = 0 addr = 0
	iload_1 
	invokeinterface interfacemethodref_18 // pc=2 guess=8
Label15:
	iload_1 
	ireturn 
	}


public int read( net.rim.tools.compiler.io.DigestInputStream, byte[], int, int ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label13
	iload_2 
	iflt Label13
	iload_3 
	iflt Label13
	aload_1 
	arraylength 
	iload_3 
	isub 
	iload_2 
	if_icmpge Label17
Label13:
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label17:
	aload_0_getfield _inputStream   // get_name_1:  _inputStream   // get_name_2:  _inputStream   // get_Name:    _inputStream   // getName->1:  _inputStream   // getName->2:  _inputStream   // getName->N:  _inputStream   // ofs = 10512 ord = 1 addr = 0
	aload_1 
	iload_2 
	iload_3 
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore_4 
	iload_4 
	ifle Label35
	aload_0 
	aload_0_getfield _length   // get_name_1:  _length   // get_name_2:  _length   // get_Name:    _length   // getName->1:  _length   // getName->2:  _length   // getName->N:  _length   // ofs = 10516 ord = 2 addr = 0
	iload_4 
	iadd 
	putfield _length   // get_name_1:  _length   // get_name_2:  _length   // get_Name:    _length   // getName->1:  _length   // getName->2:  _length   // getName->N:  _length   // ofs = 10516 ord = 2 addr = 0
	aload_0_getfield _digest   // get_name_1:  _digest   // get_name_2:  _digest   // get_Name:    _digest   // getName->1:  _digest   // getName->2:  _digest   // getName->N:  _digest   // ofs = 10508 ord = 0 addr = 0
	aload_1 
	iload_2 
	iload_4 
	invokeinterface interfacemethodref_19 // pc=4 guess=9
Label35:
	iload_4 
	ireturn 
	}


public int getLength( net.rim.tools.compiler.io.DigestInputStream ); // address: 0
	{
	ireturn_field _length   // get_name_1:  _length   // get_name_2:  _length   // get_Name:    _length   // getName->1:  _length   // getName->2:  _length   // getName->N:  _length   // ofs = 10516 ord = 2 addr = 0
	}


public net.rim.device.api.crypto.Digest getDigest( net.rim.tools.compiler.io.DigestInputStream ); // address: 0
	{
	areturn_field _digest   // get_name_1:  _digest   // get_name_2:  _digest   // get_Name:    _digest   // getName->1:  _digest   // getName->2:  _digest   // getName->N:  _digest   // ofs = 10508 ord = 0 addr = 0
	}

}
