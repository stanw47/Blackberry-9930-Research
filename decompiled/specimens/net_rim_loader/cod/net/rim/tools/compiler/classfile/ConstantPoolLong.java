// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 50
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ConstantPoolLong extends net.rim.tools.compiler.classfile.ConstantPoolEntry

{

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  _value ; // ofs = 19696 addr = 0)
	private boolean /*boolean*/  _isDouble ; // ofs = 19700 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPoolLong, int, module:net_rim_loader-2.class#45, boolean ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolEntry.<init> // pc=2
	aload_0 
	aload_2 
	invokenonvirtual_lib .routine_23686 // pc=1
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}


public <init>( net.rim.tools.compiler.classfile.ConstantPoolLong, long ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush -1
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolEntry.<init> // pc=2
	aload_0 
	lload 1
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final long getValue( net.rim.tools.compiler.classfile.ConstantPoolLong ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lreturn 
	}


public final boolean isDouble( net.rim.tools.compiler.classfile.ConstantPoolLong ); // address: 0
	{
	ireturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}

}
