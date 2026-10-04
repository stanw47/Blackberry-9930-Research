// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 40
// ########################################################


package net.rim.tools.compiler.codfile;


public class CodfileVectorHash extends net.rim.tools.compiler.codfile.CodfileVector

{

	// @@@@@@@@@@@@@ Fields 
	protected java.util.Hashtable /*java.util.Hashtable*/  _table ; // ofs = 19100 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.CodfileVectorHash, int ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	iload_1 
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield _table   // get_name_1:  _table   // get_name_2:  _table   // get_Name:    _table   // getName->1:  _table   // getName->2:  _table   // getName->N:  _table   // ofs = 19100 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public net.rim.tools.compiler.codfile.CodfileItem get( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _table   // get_name_1:  _table   // get_name_2:  _table   // get_Name:    _table   // getName->1:  _table   // getName->2:  _table   // getName->N:  _table   // ofs = 19100 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast CodfileItem
	areturn 
	}


public inject( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object, net.rim.tools.compiler.codfile.CodfileItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _table   // get_name_1:  _table   // get_name_2:  _table   // get_Name:    _table   // getName->1:  _table   // getName->2:  _table   // getName->N:  _table   // ofs = 19100 ord = 0 addr = 0
	aload_1 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


public put( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object, net.rim.tools.compiler.codfile.CodfileItem ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aload_2 
	invokevirtual inject( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object, net.rim.tools.compiler.codfile.CodfileItem ) // pc=3
	aload_0 
	aload_2 
	invokevirtual routine
	pop 
	return 
	}

}
