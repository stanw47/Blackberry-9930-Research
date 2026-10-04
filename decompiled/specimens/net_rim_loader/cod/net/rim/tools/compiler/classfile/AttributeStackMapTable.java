// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 11
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class AttributeStackMapTable extends net.rim.tools.compiler.classfile.Attribute

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.classfile.AttributeStackMapFrame /*net.rim.tools.compiler.classfile.AttributeStackMapFrame[]*/  _stackMaps ; // ofs = 16252 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.AttributeStackMapTable, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_3 
	aload_4 
	invokespecial net.rim.tools.compiler.classfile.Attribute.<init> // pc=4
	aload_1 
	invokenonvirtual_lib .routine_23341 // pc=1
	istore_5 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	istore_6 
	iload_6 
	ifle Label41
	bipush -1
	istore_7 
	aload_0 
	iload_6 
	newarray_object AttributeStackMapFrame
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	istore 8
Label22:
	iload 8
	iload_6 
	if_icmpge Label41
	new AttributeStackMapFrame
	dup 
	aload_1 
	aload_2 
	iload_7 
	invokespecial net.rim.tools.compiler.classfile.AttributeStackMapFrame.<init> // pc=4
	astore 9
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload 8
	aload 9
	aastore 
	aload 9
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore_7 
	iinc 8 1
	goto Label22
Label41:
	iload_5 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iadd 
	aload_1 
	invokenonvirtual_lib .routine_23341 // pc=1
	if_icmpeq Label52
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_324:"incorrect stack map table attribute length"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label52:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.tools.compiler.classfile.AttributeStackMapFrame[] getStackMaps( net.rim.tools.compiler.classfile.AttributeStackMapTable ); // address: 0
	{
	areturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}

}
