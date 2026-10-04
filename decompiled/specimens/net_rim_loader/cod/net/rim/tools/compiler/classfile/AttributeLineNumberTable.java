// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 4
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class AttributeLineNumberTable extends net.rim.tools.compiler.classfile.Attribute

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.AttributeLineNumberTable, module:net_rim_loader-2.class#45, int, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	aload_3 
	invokespecial net.rim.tools.compiler.classfile.Attribute.<init> // pc=4
	aload_1 
	invokenonvirtual_lib .routine_23341 // pc=1
	istore_4 
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	istore_5 
	aload_1 
	iload_5 
	bipush 4
	imul 
	invokenonvirtual_lib .routine_23352 // pc=2
	pop 
	iload_4 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iadd 
	aload_1 
	invokenonvirtual_lib .routine_23341 // pc=1
	if_icmpeq Label29
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_307:"incorrect line number table attribute length"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label29:
	return 
	}

}
