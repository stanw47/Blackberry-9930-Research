// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 55
// ########################################################


package net.rim.tools.compiler.util;


abstract public final class VerificationException extends net.rim.tools.compiler.util.CompileException

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _offset ; // ofs = 13638 addr = 0)
	private String /*java.lang.String*/  _info ; // ofs = 13642 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.util.VerificationException, java.lang.String, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=3
	aload_0 
	iload_3 
	putfield _offset   // get_name_1:  _offset   // get_name_2:  _offset   // get_Name:    _offset   // getName->1:  _offset   // getName->2:  _offset   // getName->N:  _offset   // ofs = 13638 ord = 0 addr = 0
	return 
	}


public <init>( net.rim.tools.compiler.util.VerificationException, java.lang.String, java.lang.String, int, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=3
	aload_0 
	iload_3 
	putfield _offset   // get_name_1:  _offset   // get_name_2:  _offset   // get_Name:    _offset   // getName->1:  _offset   // getName->2:  _offset   // getName->N:  _offset   // ofs = 13638 ord = 0 addr = 0
	aload_0 
	aload_4 
	putfield _info   // get_name_1:  _info   // get_name_2:  _info   // get_Name:    _info   // getName->1:  _info   // getName->2:  _info   // getName->N:  _info   // ofs = 13642 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final addInfo( net.rim.tools.compiler.util.VerificationException, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield _info   // get_name_1:  _info   // get_name_2:  _info   // get_Name:    _info   // getName->1:  _info   // getName->2:  _info   // getName->N:  _info   // ofs = 13642 ord = 1 addr = 0
	ifnonnull Label7
	aload_0 
	aload_1 
	putfield _info   // get_name_1:  _info   // get_name_2:  _info   // get_Name:    _info   // getName->1:  _info   // getName->2:  _info   // getName->N:  _info   // ofs = 13642 ord = 1 addr = 0
	return 
Label7:
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	aload_0_getfield _info   // get_name_1:  _info   // get_name_2:  _info   // get_Name:    _info   // getName->1:  _info   // getName->2:  _info   // getName->N:  _info   // ofs = 13642 ord = 1 addr = 0
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield _info   // get_name_1:  _info   // get_name_2:  _info   // get_Name:    _info   // getName->1:  _info   // getName->2:  _info   // getName->N:  _info   // ofs = 13642 ord = 1 addr = 0
	return 
	}


public final java.lang.String getMessage( net.rim.tools.compiler.util.VerificationException ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _info   // get_name_1:  _info   // get_name_2:  _info   // get_Name:    _info   // getName->1:  _info   // getName->2:  _info   // getName->N:  _info   // ofs = 13642 ord = 1 addr = 0
	ifnonnull Label11
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_556:"verification failed at opcode offset: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield _offset   // get_name_1:  _offset   // get_name_2:  _offset   // get_Name:    _offset   // getName->1:  _offset   // getName->2:  _offset   // getName->N:  _offset   // ofs = 13638 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label11:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_556:"verification failed at opcode offset: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield _offset   // get_name_1:  _offset   // get_name_2:  _offset   // get_Name:    _offset   // getName->1:  _offset   // getName->2:  _offset   // getName->N:  _offset   // ofs = 13638 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_557:" cause: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield _info   // get_name_1:  _info   // get_name_2:  _info   // get_Name:    _info   // getName->1:  _info   // getName->2:  _info   // getName->N:  _info   // ofs = 13642 ord = 1 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
