// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 45
// ########################################################


package net.rim.tools.compiler.classfile;


public class ConstantPoolField extends net.rim.tools.compiler.classfile.ConstantPoolTwoIndex

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ConstantPoolField, int, module:net_rim_loader-2.class#45 ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.classfile.ConstantPoolTwoIndex, int, module:net_rim_loader-2.class#45 )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public resolve( net.rim.tools.compiler.classfile.ConstantPoolField, net.rim.tools.compiler.classfile.ConstantPool ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label15
	aload_0 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_4 // idx=4 pc=2
	checkcast ConstantPoolClass
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_4 // idx=4 pc=2
	checkcast ConstantPoolNameAndType
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label15:
	return 
	}


public net.rim.tools.compiler.classfile.ConstantPoolClass getConstantPoolClass( net.rim.tools.compiler.classfile.ConstantPoolField ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public setConstantPoolClass( net.rim.tools.compiler.classfile.ConstantPoolField, net.rim.tools.compiler.classfile.ConstantPoolClass ); // address: 0
	{
	putfield_return .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public java.lang.String getClassName( net.rim.tools.compiler.classfile.ConstantPoolField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolClass.getName // pc=1
	areturn 
	}


public module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.classfile.ConstantPoolField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolClass.getType // pc=1
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	areturn 
	}


public java.lang.String getName( net.rim.tools.compiler.classfile.ConstantPoolField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolNameAndType.getName // pc=1
	areturn 
	}


public java.lang.String getType( net.rim.tools.compiler.classfile.ConstantPoolField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolNameAndType.getType // pc=1
	areturn 
	}

}
