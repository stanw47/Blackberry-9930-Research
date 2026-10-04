// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 48
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ConstantPoolInteger extends net.rim.tools.compiler.classfile.ConstantPoolEntry

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _value ; // ofs = 19584 addr = 0)
	private boolean /*boolean*/  _isFloat ; // ofs = 19588 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPoolInteger, int, module:net_rim_loader-2.class#45, boolean ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolEntry.<init> // pc=2
	aload_0 
	aload_2 
	invokenonvirtual_lib .routine_23618 // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public <init>( net.rim.tools.compiler.classfile.ConstantPoolInteger, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush -1
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolEntry.<init> // pc=2
	aload_0 
	iload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getValue( net.rim.tools.compiler.classfile.ConstantPoolInteger ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final boolean isFloat( net.rim.tools.compiler.classfile.ConstantPoolInteger ); // address: 0
	{
	ireturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}

}
