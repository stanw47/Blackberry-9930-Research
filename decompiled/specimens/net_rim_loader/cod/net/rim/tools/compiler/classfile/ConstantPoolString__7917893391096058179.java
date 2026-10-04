// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 53
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ConstantPoolString extends net.rim.tools.compiler.classfile.ConstantPoolIndex

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.classfile.ConstantPoolUTF8 /*net.rim.tools.compiler.classfile.ConstantPoolUTF8*/  _string ; // ofs = 19870 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPoolString, int, module:net_rim_loader-2.class#45 ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.classfile.ConstantPoolIndex, int, module:net_rim_loader-2.class#45 )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final resolve( net.rim.tools.compiler.classfile.ConstantPoolString, net.rim.tools.compiler.classfile.ConstantPool ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label9
	aload_0 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_4 // idx=4 pc=2
	checkcast ConstantPoolUTF8
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label9:
	return 
	}


public final java.lang.String getString( net.rim.tools.compiler.classfile.ConstantPoolString ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolUTF8.getString // pc=1
	areturn 
	}

}
