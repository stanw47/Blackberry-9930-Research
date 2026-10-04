// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 8
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class AttributeStackMap extends net.rim.tools.compiler.classfile.Attribute

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.classfile.AttributeStackMapEntry /*net.rim.tools.compiler.classfile.AttributeStackMapEntry[]*/  _stackMaps ; // ofs = 16046 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.AttributeStackMap, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int, java.lang.String ); // address: 0
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
	ifle Label51
	aload_0 
	iload_6 
	newarray_object AttributeStackMapEntry
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	istore_7 
Label20:
	iload_7 
	iload_6 
	if_icmpge Label51
	new AttributeStackMapEntry
	dup 
	aload_1 
	aload_2 
	invokespecial net.rim.tools.compiler.classfile.AttributeStackMapEntry.<init> // pc=3
	astore 8
	iload_7 
	ifle Label45
	aload 8
	invokevirtual_short .virtual_3 // idx=3 pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_7 
	iconst_1 
	isub 
	aaload 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	if_icmpgt Label45
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_322:"incorrect stack map entry ordering"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label45:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_7 
	aload 8
	aastore 
	iinc 7 1
	goto Label20
Label51:
	iload_5 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iadd 
	aload_1 
	invokenonvirtual_lib .routine_23341 // pc=1
	if_icmpeq Label62
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_323:"incorrect stack map attribute length"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label62:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.tools.compiler.classfile.AttributeStackMapEntry[] getStackMaps( net.rim.tools.compiler.classfile.AttributeStackMap ); // address: 0
	{
	areturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}

}
