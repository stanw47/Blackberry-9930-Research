// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 16
// ########################################################


package net.rim.tools.compiler.util;


abstract public final class ExecutionTimer extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  _name ; // ofs = 10620 addr = 0)
	private long /*long*/  _time ; // ofs = 10624 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.util.ExecutionTimer, java.lang.String, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_2 
	aload_0 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final stop( net.rim.tools.compiler.util.ExecutionTimer ); // address: 0
	{
	enter 
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	lsub 
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final java.lang.String toString( net.rim.tools.compiler.util.ExecutionTimer ); // address: 0
	{
	enter 
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	l2i 
	istore_1 
	iload_1 
	sipush 1000
	idiv 
	istore_2 
	iload_1 
	sipush 1000
	irem 
	istore_3 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	stringlength 
	bipush 11
	iadd 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 40
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	bipush 46
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	astore_4 
	iload_3 
	bipush 100
	if_icmpge Label43
	aload_4 
	bipush 48
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iload_3 
	bipush 10
	if_icmpge Label43
	aload_4 
	bipush 48
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label43:
	aload_4 
	iload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_505:"s)"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
