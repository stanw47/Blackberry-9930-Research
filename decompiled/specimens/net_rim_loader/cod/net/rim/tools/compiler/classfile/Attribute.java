// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 0
// ########################################################


package net.rim.tools.compiler.classfile;


public class Attribute extends Object
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.tools.compiler.classfile.Attribute, module:net_rim_loader-2.class#45, int, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23618 // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


public <init>( net.rim.tools.compiler.classfile.Attribute, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_3 
	aload_4 
	invokespecial net.rim.tools.compiler.classfile.Attribute.<init> // pc=4
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23341 // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_23330 // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_23352 // pc=2
	pop 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iadd 
	aload_1 
	invokenonvirtual_lib .routine_23341 // pc=1
	if_icmpeq Label32
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_296:"incorrect attribute length"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label32:
	return 
	}


static public net.rim.tools.compiler.classfile.Attribute read( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int, boolean ); // address: 0
	{
	enter 
	aconst_null 
	astore_4 
	aload_0 
	invokenonvirtual_lib .routine_23570 // pc=1
	istore_5 
	aload_1 
	iload_5 
	invokevirtual_short .virtual_5 // idx=5 pc=2
	astore_6 
	iload_3 
	ifeq Label21
	new Attribute
	dup 
	aload_0 
	aload_1 
	iload_5 
	aload_6 
	invokespecial net.rim.tools.compiler.classfile.Attribute.<init> // pc=5
	astore_4 
	goto_w Label172
Label21:
	aload_6 
	getstatic NAME_CODE // AttributeList
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label42
	iload_2 
	bipush 3
	if_icmpeq Label33
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_297:"Code attribute found outside of method"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label33:
	new AttributeCode
	dup 
	aload_0 
	aload_1 
	iload_5 
	aload_6 
	invokespecial net.rim.tools.compiler.classfile.AttributeCode.<init> // pc=5
	astore_4 
	goto_w Label172
Label42:
	aload_6 
	getstatic NAME_LINENUMBERTABLE // AttributeList
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label62
	iload_2 
	bipush 4
	if_icmpeq Label54
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_298:"LineNumberTable attribute found outside of Code attribute"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label54:
	new AttributeLineNumberTable
	dup 
	aload_0 
	iload_5 
	aload_6 
	invokespecial net.rim.tools.compiler.classfile.AttributeLineNumberTable.<init> // pc=4
	astore_4 
	goto_w Label172
Label62:
	aload_6 
	getstatic NAME_STACKMAP // AttributeList
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label83
	iload_2 
	bipush 4
	if_icmpeq Label74
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_299:"StackMap attribute found outside of Code attribute"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label74:
	new AttributeStackMap
	dup 
	aload_0 
	aload_1 
	iload_5 
	aload_6 
	invokespecial net.rim.tools.compiler.classfile.AttributeStackMap.<init> // pc=5
	astore_4 
	goto_w Label172
Label83:
	aload_6 
	getstatic NAME_STACKMAPTABLE // AttributeList
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label104
	iload_2 
	bipush 4
	if_icmpeq Label95
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_300:"StackMapTable attribute found outside of Code attribute"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label95:
	new AttributeStackMapTable
	dup 
	aload_0 
	aload_1 
	iload_5 
	aload_6 
	invokespecial net.rim.tools.compiler.classfile.AttributeStackMapTable.<init> // pc=5
	astore_4 
	goto_w Label172
Label104:
	aload_6 
	getstatic NAME_LOCALVARIABLETABLE // AttributeList
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label125
	iload_2 
	bipush 4
	if_icmpeq Label116
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_301:"LocalVariableTable attribute found outside of Code attribute"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label116:
	new AttributeLocalVariableTable
	dup 
	aload_0 
	aload_1 
	iload_5 
	aload_6 
	invokespecial net.rim.tools.compiler.classfile.AttributeLocalVariableTable.<init> // pc=5
	astore_4 
	goto Label172
Label125:
	new Attribute
	dup 
	aload_0 
	aload_1 
	iload_5 
	aload_6 
	invokespecial net.rim.tools.compiler.classfile.Attribute.<init> // pc=5
	astore_4 
	aload_6 
	getstatic NAME_DEPRECATED // AttributeList
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label141
	aload_6 
	getstatic NAME_SYNTHETIC // AttributeList
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label155
Label141:
	aload_4 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifeq Label172
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_302:"incorrect attribute length for: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label155:
	aload_6 
	iconst_1 
	iconst_0 
	getstatic NAME_STACKMAP // AttributeList
	iconst_0 
	aload_6 
	stringlength 
	invokenonvirtual_lib java.lang.String.regionMatches // pc=6
	ifeq Label172
	iload_2 
	bipush 4
	if_icmpne Label172
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_303:"StackMap attribute found with incorrect case"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label172:
	aload_4 
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private int getShort( net.rim.tools.compiler.classfile.Attribute, int ); // address: 0
	{
	enter 
	iload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iadd 
	istore_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	baload 
	sipush 255
	iand 
	bipush 8
	ishl 
	istore_2 
	iload_2 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iconst_1 
	iadd 
	baload 
	sipush 255
	iand 
	ior 
	istore_2 
	iload_2 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public java.lang.String getName( net.rim.tools.compiler.classfile.Attribute ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public int getConstantValue( net.rim.tools.compiler.classfile.Attribute, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.Attribute.getShort // pc=2
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	iload_1 
	invokevirtual_short .virtual_8 // idx=8 pc=3
	ireturn 
	}


public long getConstantValueLong( net.rim.tools.compiler.classfile.Attribute, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.Attribute.getShort // pc=2
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	iload_1 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	lreturn 
	}


public java.lang.String getConstantString( net.rim.tools.compiler.classfile.Attribute ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.Attribute.getShort // pc=2
	istore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	areturn 
	}


public int getNumExceptions( net.rim.tools.compiler.classfile.Attribute ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.Attribute.getShort // pc=2
	ireturn 
	}


public java.lang.String getExceptionClassName( net.rim.tools.compiler.classfile.Attribute, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	iconst_1 
	iadd 
	bipush 2
	imul 
	istore_1 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.Attribute.getShort // pc=2
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokevirtual_short .virtual_6 // idx=6 pc=2
	areturn 
	}


public java.lang.String getSourceFileName( net.rim.tools.compiler.classfile.Attribute ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.Attribute.getShort // pc=2
	istore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=2
	areturn 
	}

}
