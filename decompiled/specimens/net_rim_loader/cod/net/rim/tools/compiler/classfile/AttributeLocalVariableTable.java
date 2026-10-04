// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 6
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class AttributeLocalVariableTable extends net.rim.tools.compiler.classfile.Attribute

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.AttributeLocalVariableTable, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int, java.lang.String ); // address: 0
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
	ifle Label20
	aload_1 
	iload_6 
	bipush 10
	imul 
	invokenonvirtual_lib .routine_23352 // pc=2
	pop 
Label20:
	iload_5 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iadd 
	aload_1 
	invokenonvirtual_lib .routine_23341 // pc=1
	if_icmpeq Label31
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_321:"incorrect local variable table attribute length"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label31:
	return 
	}

}
