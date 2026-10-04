// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 9
// ########################################################


package net.rim.tools.compiler.util;


public class CompileException extends Exception

{

	// @@@@@@@@@@@@@ Fields 
	protected int /*int*/  _resultCode ; // ofs = 10202 addr = 0)
	protected String /*java.lang.String*/  _fileName ; // ofs = 10206 addr = 0)
	protected String /*java.lang.String*/  _word ; // ofs = 10210 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.util.CompileException, int, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_3 
	invokespecial_lib java.lang.Exception.<init> // pc=2
	aload_0 
	iload_1 
	putfield _resultCode   // get_name_1:  _resultCode   // get_name_2:  _resultCode   // get_Name:    _resultCode   // getName->1:  _resultCode   // getName->2:  _resultCode   // getName->N:  _resultCode   // ofs = 10202 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield _fileName   // get_name_1:  _fileName   // get_name_2:  _fileName   // get_Name:    _fileName   // getName->1:  _fileName   // getName->2:  _fileName   // getName->N:  _fileName   // ofs = 10206 ord = 1 addr = 0
	aload_0 
	aload_3 
	putfield _word   // get_name_1:  _word   // get_name_2:  _word   // get_Name:    _word   // getName->1:  _word   // getName->2:  _word   // getName->N:  _word   // ofs = 10210 ord = 2 addr = 0
	return 
	}


public <init>( net.rim.tools.compiler.util.CompileException, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	aload_1 
	aload_2 
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=4
	return 
	}


public <init>( net.rim.tools.compiler.util.CompileException, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	aconst_null 
	aload_1 
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public int getResultCode( net.rim.tools.compiler.util.CompileException ); // address: 0
	{
	ireturn_field _resultCode   // get_name_1:  _resultCode   // get_name_2:  _resultCode   // get_Name:    _resultCode   // getName->1:  _resultCode   // getName->2:  _resultCode   // getName->N:  _resultCode   // ofs = 10202 ord = 0 addr = 0
	}


public java.lang.String getMessage( net.rim.tools.compiler.util.CompileException ); // address: 0
	{
	areturn_field _word   // get_name_1:  _word   // get_name_2:  _word   // get_Name:    _word   // getName->1:  _word   // getName->2:  _word   // getName->N:  _word   // ofs = 10210 ord = 2 addr = 0
	}


public java.lang.String toString( net.rim.tools.compiler.util.CompileException ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	aload_0_getfield _fileName   // get_name_1:  _fileName   // get_name_2:  _fileName   // get_Name:    _fileName   // getName->1:  _fileName   // getName->2:  _fileName   // getName->N:  _fileName   // ofs = 10206 ord = 1 addr = 0
	ifnull Label13
	aload_1 
	aload_0_getfield _fileName   // get_name_1:  _fileName   // get_name_2:  _fileName   // get_Name:    _fileName   // getName->1:  _fileName   // getName->2:  _fileName   // getName->N:  _fileName   // ofs = 10206 ord = 1 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_491:": "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label13:
	aload_1 
	ldc literal_492:"Error!"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield _resultCode   // get_name_1:  _resultCode   // get_name_2:  _resultCode   // get_Name:    _resultCode   // getName->1:  _resultCode   // getName->2:  _resultCode   // getName->N:  _resultCode   // ofs = 10202 ord = 0 addr = 0
	ifeq Label23
	aload_1 
	aload_0_getfield _resultCode   // get_name_1:  _resultCode   // get_name_2:  _resultCode   // get_Name:    _resultCode   // getName->1:  _resultCode   // getName->2:  _resultCode   // getName->N:  _resultCode   // ofs = 10202 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
Label23:
	aload_1 
	ldc literal_491:": "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokevirtual java.lang.String getMessage( net.rim.tools.compiler.util.CompileException ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
