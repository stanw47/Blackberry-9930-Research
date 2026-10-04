// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 15
// ########################################################


package net.rim.tools.compiler.util;


abstract public final class DuplicateException extends net.rim.tools.compiler.util.CompileException

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  _where ; // ofs = 10568 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.util.DuplicateException, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=3
	aload_0 
	aload_3 
	putfield _where   // get_name_1:  _where   // get_name_2:  _where   // get_Name:    _where   // getName->1:  _where   // getName->2:  _where   // getName->N:  _where   // ofs = 10568 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String getMessage( net.rim.tools.compiler.util.DuplicateException ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_503:"Duplicate definition for '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield _word   // get_name_1:  _word   // get_name_2:  _word   // get_Name:    _word   // getName->1:  _word   // getName->2:  _word   // getName->N:  _word   // ofs = 10210 ord = 2 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_504:"' found in: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield _where   // get_name_1:  _where   // get_name_2:  _where   // get_Name:    _where   // getName->1:  _where   // getName->2:  _where   // getName->N:  _where   // ofs = 10568 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
