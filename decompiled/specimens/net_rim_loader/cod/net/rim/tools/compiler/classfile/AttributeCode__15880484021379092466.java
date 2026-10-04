// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 1
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class AttributeCode extends net.rim.tools.compiler.classfile.Attribute

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _maxStack ; // ofs = 15624 addr = 0)
	private int /*int*/  _maxLocals ; // ofs = 15628 addr = 0)
	private byte[] /*byte[]*/  _code ; // ofs = 15632 addr = 0)
	private net.rim.tools.compiler.classfile.ClassfileExceptionHandler /*net.rim.tools.compiler.classfile.ClassfileExceptionHandler[]*/  _handlers ; // ofs = 15636 addr = 0)
	private net.rim.tools.compiler.classfile.AttributeList /*net.rim.tools.compiler.classfile.AttributeList*/  _attributes ; // ofs = 15640 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.AttributeCode, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int, java.lang.String ); // address: 0
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
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokenonvirtual_lib .routine_23618 // pc=1
	istore_6 
	iload_6 
	ifle Label30
	aload_0 
	iload_6 
	newarray 2
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokenonvirtual_lib .routine_23409 // pc=2
	pop 
Label30:
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	istore_7 
	iload_7 
	ifle Label54
	aload_0 
	iload_7 
	newarray_object ClassfileExceptionHandler
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_0 
	istore 8
Label41:
	iload 8
	iload_7 
	if_icmpge Label54
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload 8
	new ClassfileExceptionHandler
	dup 
	aload_1 
	aload_2 
	invokespecial net.rim.tools.compiler.classfile.ClassfileExceptionHandler.<init> // pc=3
	aastore 
	iinc 8 1
	goto Label41
Label54:
	aload_0 
	new AttributeList
	dup 
	aload_1 
	aload_2 
	bipush 4
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.AttributeList.<init> // pc=5
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_5 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iadd 
	aload_1 
	invokenonvirtual_lib .routine_23341 // pc=1
	if_icmpeq Label74
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_304:"incorrect code attribute length"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label74:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final byte[] getCode( net.rim.tools.compiler.classfile.AttributeCode ); // address: 0
	{
	areturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public final int getMaxStack( net.rim.tools.compiler.classfile.AttributeCode ); // address: 0
	{
	ireturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final int getMaxLocals( net.rim.tools.compiler.classfile.AttributeCode ); // address: 0
	{
	ireturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public final int getNumHandlers( net.rim.tools.compiler.classfile.AttributeCode ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	arraylength 
	ireturn 
	}


public final net.rim.tools.compiler.classfile.ClassfileExceptionHandler[] getHandlers( net.rim.tools.compiler.classfile.AttributeCode ); // address: 0
	{
	areturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final boolean hasAttribute( net.rim.tools.compiler.classfile.AttributeCode, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.AttributeCode.getAttribute // pc=2
	ifnull Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final net.rim.tools.compiler.classfile.Attribute getAttribute( net.rim.tools.compiler.classfile.AttributeCode, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_1 
	invokevirtual_short .virtual_3 // idx=3 pc=2
	areturn 
	}

}
