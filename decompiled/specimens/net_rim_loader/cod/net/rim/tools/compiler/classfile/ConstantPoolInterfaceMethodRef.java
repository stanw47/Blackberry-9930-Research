// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 49
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ConstantPoolInterfaceMethodRef extends net.rim.tools.compiler.classfile.ConstantPoolField

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPoolInterfaceMethodRef, int, module:net_rim_loader-2.class#45 ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.classfile.ConstantPoolField, int, module:net_rim_loader-2.class#45 )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final verify( net.rim.tools.compiler.classfile.ConstantPoolInterfaceMethodRef ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolNameAndType.checkMethodType // pc=1
	return 
	}


public final setMethod( net.rim.tools.compiler.classfile.ConstantPoolInterfaceMethodRef, module:net_rim_loader-2.class#26 ); // address: 0
	{
	putfield_return .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public final module:net_rim_loader-2.class#26 getMethod( net.rim.tools.compiler.classfile.ConstantPoolInterfaceMethodRef ); // address: 0
	{
	areturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}

}
