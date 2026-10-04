// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 20
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class Bytes extends net.rim.tools.compiler.codfile.CodfileData

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.Bytes, net.rim.tools.compiler.codfile.DataSection, byte[], int, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	iload_3 
	iload_4 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileData.<init> // pc=5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean matches( net.rim.tools.compiler.codfile.Bytes, byte[], int ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_2 
	if_icmpeq Label9
	iload_2 
	bipush -1
	if_icmpeq Label9
	iconst_0 
	ireturn 
Label9:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	arraylength 
	aload_1 
	arraylength 
	if_icmpeq Label16
	iconst_0 
	ireturn 
Label16:
	aload_1 
	arraylength 
	istore_3 
	iconst_0 
	istore_4 
Label21:
	iload_4 
	iload_3 
	if_icmpge Label35
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_4 
	baload 
	aload_1 
	iload_4 
	baload 
	if_icmpeq Label33
	iconst_0 
	ireturn 
Label33:
	iinc 4 1
	goto Label21
Label35:
	iconst_1 
	ireturn 
	}


public final writeTerminator( net.rim.tools.compiler.codfile.Bytes, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	noenter_return 
	}

}
