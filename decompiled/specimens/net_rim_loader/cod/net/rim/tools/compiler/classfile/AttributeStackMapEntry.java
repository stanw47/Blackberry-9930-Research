// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 9
// ########################################################


package net.rim.tools.compiler.classfile;


public class AttributeStackMapEntry extends Object

{

	// @@@@@@@@@@@@@ Fields 
	protected int /*int*/  _codeOffset ; // ofs = 16114 addr = 0)
	protected net.rim.tools.compiler.classfile.AttributeStackMapType /*net.rim.tools.compiler.classfile.AttributeStackMapType[]*/  _locals ; // ofs = 16118 addr = 0)
	protected net.rim.tools.compiler.classfile.AttributeStackMapType /*net.rim.tools.compiler.classfile.AttributeStackMapType[]*/  _stacks ; // ofs = 16122 addr = 0)
	protected net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type[]*/  _localTypes ; // ofs = 16126 addr = 0)
	protected net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type[]*/  _stackTypes ; // ofs = 16130 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( net.rim.tools.compiler.classfile.AttributeStackMapEntry ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


public <init>( net.rim.tools.compiler.classfile.AttributeStackMapEntry, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_1 
	aload_2 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	invokestatic net.rim.tools.compiler.classfile.AttributeStackMapType[] readArray( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int ) // AttributeStackMapType
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_1 
	aload_2 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	invokestatic net.rim.tools.compiler.classfile.AttributeStackMapType[] readArray( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int ) // AttributeStackMapType
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public int getCodeOffset( net.rim.tools.compiler.classfile.AttributeStackMapEntry ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public net.rim.tools.compiler.classfile.AttributeStackMapType[] getLocals( net.rim.tools.compiler.classfile.AttributeStackMapEntry ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public net.rim.tools.compiler.classfile.AttributeStackMapType[] getStacks( net.rim.tools.compiler.classfile.AttributeStackMapEntry ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public setLocalTypes( net.rim.tools.compiler.classfile.AttributeStackMapEntry, net.rim.tools.compiler.types.Type[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public net.rim.tools.compiler.types.Type[] getLocalTypes( net.rim.tools.compiler.classfile.AttributeStackMapEntry ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public int getLocalTypeSize( net.rim.tools.compiler.classfile.AttributeStackMapEntry ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	arraylength 
	ireturn 
	}


public setStackTypes( net.rim.tools.compiler.classfile.AttributeStackMapEntry, net.rim.tools.compiler.types.Type[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public net.rim.tools.compiler.types.Type[] getStackTypes( net.rim.tools.compiler.classfile.AttributeStackMapEntry ); // address: 0
	{
	areturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public int getStackTypeSize( net.rim.tools.compiler.classfile.AttributeStackMapEntry ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	arraylength 
	ireturn 
	}

}
