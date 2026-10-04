// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 33
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class CodfileArray extends net.rim.tools.compiler.codfile.CodfileItem
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.CodfileItem /*net.rim.tools.compiler.codfile.CodfileItem[]*/  _items ; // ofs = 18572 addr = 0)
	private int /*int*/  _numItems ; // ofs = 18576 addr = 0)
	private int /*int*/  _align ; // ofs = 18580 addr = 0)
	private boolean /*boolean*/  _sizePrefix ; // ofs = 18584 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.CodfileArray, int, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=1
	iload_1 
	ifle Label9
	aload_0 
	iload_1 
	newarray_object CodfileItem
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label9:
	aload_0 
	iload_2 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iload_3 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


public <init>( net.rim.tools.compiler.codfile.CodfileArray, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iconst_1 
	iload_2 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=4
	return 
	}


public <init>( net.rim.tools.compiler.codfile.CodfileArray, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=4
	return 
	}


public <init>( net.rim.tools.compiler.codfile.CodfileArray, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iconst_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=4
	return 
	}


public <init>( net.rim.tools.compiler.codfile.CodfileArray ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	iconst_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int writePrefix( net.rim.tools.compiler.codfile.CodfileArray, net.rim.tools.compiler.io.StructuredOutputStream, boolean ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int writeSlack( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	pop 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	istore_3 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifeq Label15
	aload_1 
	iload_3 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label15:
	iload_3 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.CodfileArray, net.rim.tools.compiler.io.StructuredOutputStream, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.writePrefix // pc=3
	istore_3 
	iconst_0 
	istore_4 
Label8:
	iload_4 
	iload_3 
	if_icmpge Label18
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_4 
	aaload 
	aload_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileItem, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	iinc 4 1
	goto Label8
Label18:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}


public final write( net.rim.tools.compiler.codfile.CodfileArray, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.write // pc=3
	return 
	}


public final writeRelative( net.rim.tools.compiler.codfile.CodfileArray, net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.writePrefix // pc=3
	istore_3 
	iconst_0 
	istore_4 
Label8:
	iload_4 
	iload_3 
	if_icmpge Label30
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_4 
	aaload 
	astore_5 
	aload_5 
	checkcastbranch 
	astore_6 
	aload_6 
	aload_1 
	iload_2 
	invokevirtual writeRelative( net.rim.tools.compiler.codfile.CodfileItemRelative, net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=3
	goto Label28
Label23:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_350:"cannot write relative offset for non-relative item"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label28:
	iinc 4 1
	goto Label8
Label30:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}


public final writeAbsoluteOrdinals( net.rim.tools.compiler.codfile.CodfileArray, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.writePrefix // pc=3
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_2 
	if_icmpge Label29
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_3 
	aaload 
	astore_4 
	aload_4 
	checkcastbranch 
	astore_5 
	aload_5 
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	goto Label27
Label22:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_351:"cannot write absolute ordinals for non-classdef item"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label27:
	iinc 3 1
	goto Label8
Label29:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}


public final writeOffsets( net.rim.tools.compiler.codfile.CodfileArray, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.writePrefix // pc=3
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_2 
	if_icmpge Label18
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_3 
	aaload 
	aload_1 
	invokevirtual writeLocalOffset( net.rim.tools.compiler.codfile.CodfileItem, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	iinc 3 1
	goto Label8
Label18:
	return 
	}


public final int size( net.rim.tools.compiler.codfile.CodfileArray ); // address: 0
	{
	ireturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final net.rim.tools.compiler.codfile.CodfileItem elementAt( net.rim.tools.compiler.codfile.CodfileArray, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	aaload 
	areturn 
	}


public final addElement( net.rim.tools.compiler.codfile.CodfileArray, net.rim.tools.compiler.codfile.CodfileItem ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label8
	aload_0 
	iconst_1 
	newarray_object CodfileItem
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label20
Label8:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	arraylength 
	if_icmpne Label20
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	arraylength 
	bipush 2
	imul 
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19212(  ) // class#29
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label20:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	aastore 
	return 
	}

}
