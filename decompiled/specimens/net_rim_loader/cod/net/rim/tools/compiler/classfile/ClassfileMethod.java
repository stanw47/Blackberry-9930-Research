// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 30
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ClassfileMethod extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _accessFlags ; // ofs = 18192 addr = 0)
	private net.rim.tools.compiler.classfile.AttributeList /*net.rim.tools.compiler.classfile.AttributeList*/  _attributes ; // ofs = 18196 addr = 0)
	private int /*int*/  _iName ; // ofs = 18200 addr = 0)
	private String /*java.lang.String*/  _name ; // ofs = 18204 addr = 0)
	private int /*int*/  _iDescriptor ; // ofs = 18208 addr = 0)
	private net.rim.tools.compiler.classfile.TypeDescriptor /*net.rim.tools.compiler.classfile.TypeDescriptor*/  _descriptor ; // ofs = 18212 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ClassfileMethod, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, boolean ); // address: 0
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
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual_short .virtual_5 // idx=5 pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new TypeDescriptor
	dup 
	aload_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_5 // idx=5 pc=2
	invokespecial net.rim.tools.compiler.classfile.TypeDescriptor.<init> // pc=2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	new AttributeList
	dup 
	aload_1 
	aload_2 
	bipush 3
	iload_3 
	invokespecial net.rim.tools.compiler.classfile.AttributeList.<init> // pc=5
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String getName( net.rim.tools.compiler.classfile.ClassfileMethod ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final int getAccessFlags( net.rim.tools.compiler.classfile.ClassfileMethod ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final net.rim.tools.compiler.classfile.TypeDescriptor getDescriptor( net.rim.tools.compiler.classfile.ClassfileMethod ); // address: 0
	{
	areturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final boolean hasAttribute( net.rim.tools.compiler.classfile.ClassfileMethod, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	ifnull Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final net.rim.tools.compiler.classfile.Attribute getAttribute( net.rim.tools.compiler.classfile.ClassfileMethod, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual_short .virtual_3 // idx=3 pc=2
	areturn 
	}

}
