// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 3
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class AttributeInnerClassesTable extends net.rim.tools.compiler.classfile.Attribute

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.classfile.AttributeInnerClasses /*net.rim.tools.compiler.classfile.AttributeInnerClasses[]*/  _classes ; // ofs = 15742 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.AttributeInnerClassesTable, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int, java.lang.String ); // address: 0
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
	ifle Label56
	aload_0 
	iload_6 
	newarray_object AttributeInnerClasses
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	istore_7 
Label20:
	iload_7 
	iload_6 
	if_icmpge Label56
	new AttributeInnerClasses
	dup 
	aload_1 
	aload_2 
	invokespecial net.rim.tools.compiler.classfile.AttributeInnerClasses.<init> // pc=3
	astore 8
	aload 8
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore 9
	iconst_0 
	istore 10
Label34:
	iload 10
	iload_7 
	if_icmpge Label50
	iload 9
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload 10
	aaload 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	if_icmpne Label48
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_305:"duplicate inner classes table entry"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label48:
	iinc 10 1
	goto Label34
Label50:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_7 
	aload 8
	aastore 
	iinc 7 1
	goto Label20
Label56:
	iload_5 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iadd 
	aload_1 
	invokenonvirtual_lib .routine_23341 // pc=1
	if_icmpeq Label67
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_306:"incorrect inner classes table attribute length"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label67:
	return 
	}

}
