// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 51
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class TypeList extends net.rim.tools.compiler.codfile.CodfileItem

{

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  _compressable ; // ofs = 13296 addr = 0)
	private net.rim.tools.compiler.codfile.TypeItem /*net.rim.tools.compiler.codfile.TypeItem[]*/  _types ; // ofs = 13300 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.TypeList, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib .routine_23030 // pc=2
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public <init>( net.rim.tools.compiler.codfile.TypeList, net.rim.tools.compiler.codfile.TypeItem ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_23051 // pc=1
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iconst_1 
	newarray_object TypeItem
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	aload_1 
	aastore 
	return 
	}


public <init>( net.rim.tools.compiler.codfile.TypeList, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_23051 // pc=1
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.TypeList.init // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final init( net.rim.tools.compiler.codfile.TypeList, java.util.Vector ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	aload_0 
	iload_2 
	newarray_object TypeItem
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	istore_3 
Label10:
	iload_3 
	iload_2 
	if_icmpge Label22
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_3 
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast TypeItem
	aastore 
	iinc 3 1
	goto Label10
Label22:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final makeSymbolic( net.rim.tools.compiler.codfile.TypeList, module:net_rim_loader-1.class#57 ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label6:
	iload_3 
	iload_2 
	if_icmpge Label16
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_3 
	aaload 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeItem.makeSymbolic // pc=2
	iinc 3 1
	goto Label6
Label16:
	return 
	}


public final write( net.rim.tools.compiler.codfile.TypeList, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_22880 // pc=2
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	istore_2 
	iload_2 
	ifne Label13
	aload_1 
	iconst_0 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label157
Label13:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	aaload 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeItem.getExtent // pc=1
	istore_3 
	iload_2 
	iconst_1 
	if_icmple Label67
	iconst_0 
	istore_4 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	aaload 
	astore_5 
	iconst_1 
	istore_6 
Label29:
	iload_6 
	iload_2 
	if_icmpge Label67
	iload_6 
	iload_2 
	iconst_1 
	isub 
	if_icmpge Label43
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_6 
	iconst_1 
	iadd 
	aaload 
	goto Label44
Label43:
	aconst_null 
Label44:
	astore_7 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label56
	iload_4 
	bipush 15
	if_icmpge Label56
	aload_5 
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label56
	iinc 4 1
	goto Label65
Label56:
	iload_3 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeItem.getExtent // pc=1
	iadd 
	istore_3 
	iconst_0 
	istore_4 
	aload_7 
	astore_5 
Label65:
	iinc 6 1
	goto Label29
Label67:
	iload_3 
	bipush 7
	if_icmple Label93
	iinc 3 1
	iload_3 
	bipush 64
	if_icmpge Label82
	aload_1 
	sipush 128
	iload_3 
	iadd 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iconst_0 
	istore_3 
	goto Label93
Label82:
	aload_1 
	sipush 192
	iload_3 
	bipush 4
	ishr 
	iadd 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iload_3 
	bipush 15
	iand 
	istore_3 
Label93:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	aaload 
	aload_1 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeItem.write // pc=3
	iload_2 
	iconst_1 
	if_icmple Label157
	iconst_0 
	istore_4 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	aaload 
	astore_5 
	iconst_1 
	istore_6 
Label110:
	iload_6 
	iload_2 
	if_icmpge Label157
	iload_6 
	iload_2 
	iconst_1 
	isub 
	if_icmpge Label124
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_6 
	iconst_1 
	iadd 
	aaload 
	goto Label125
Label124:
	aconst_null 
Label125:
	astore_7 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label139
	iload_4 
	bipush 15
	if_icmpge Label139
	aload_5 
	ifnull Label139
	aload_5 
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label139
	iinc 4 1
	goto Label155
Label139:
	aload_5 
	ifnull Label146
	aload_5 
	aload_1 
	iload_4 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeItem.write // pc=3
	goto Label151
Label146:
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_552:"null typelist entry"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label151:
	iconst_0 
	istore_4 
	aload_7 
	astore_5 
Label155:
	iinc 6 1
	goto Label110
Label157:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_22921 // pc=2
	return 
	}


public final setCompressable( net.rim.tools.compiler.codfile.TypeList, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label8
	iload_1 
	ifeq Label8
	iconst_1 
	goto Label9
Label8:
	iconst_0 
Label9:
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final int length( net.rim.tools.compiler.codfile.TypeList ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	arraylength 
	ireturn 
	}


public final net.rim.tools.compiler.codfile.TypeItem getTypeItem( net.rim.tools.compiler.codfile.TypeList, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	aaload 
	areturn 
	}


public final int getLocalCount( net.rim.tools.compiler.codfile.TypeList ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	istore_1 
	iload_1 
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_1 
	if_icmpge Label25
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_3 
	aaload 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeItem.getId // pc=1
	istore_4 
	iload_4 
	bipush 6
	if_icmpeq Label22
	iload_4 
	bipush 12
	if_icmpne Label23
Label22:
	iinc 2 1
Label23:
	iinc 3 1
	goto Label8
Label25:
	iload_2 
	ireturn 
	}


public final int compareTo( net.rim.tools.compiler.codfile.TypeList, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast TypeList
	astore_2 
	aload_0 
	aload_2 
	if_acmpne Label9
	iconst_0 
	ireturn 
Label9:
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	istore_3 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	istore_4 
	iload_3 
	iload_4 
	if_icmpge Label20
	bipush -1
	ireturn 
Label20:
	iload_3 
	iload_4 
	if_icmple Label25
	iconst_1 
	ireturn 
Label25:
	iconst_0 
	istore_5 
Label27:
	iload_5 
	iload_3 
	if_icmpge Label45
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_5 
	aaload 
	aload_2 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_5 
	aaload 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeItem.compareTo // pc=2
	istore_6 
	iload_6 
	ifeq Label43
	iload_6 
	ireturn 
Label43:
	iinc 5 1
	goto Label27
Label45:
	iconst_0 
	ireturn 
	}


public final boolean equals( net.rim.tools.compiler.codfile.TypeList, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcastbranch 
	astore_2 
	aload_0 
	aload_2 
	if_acmpne Label9
	iconst_1 
	ireturn 
Label9:
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	istore_3 
	iload_3 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	if_icmpeq Label18
	iconst_0 
	ireturn 
Label18:
	iconst_0 
	istore_4 
Label20:
	iload_4 
	iload_3 
	if_icmpge Label36
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_4 
	aaload 
	aload_2 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_4 
	aaload 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label34
	iconst_0 
	ireturn 
Label34:
	iinc 4 1
	goto Label20
Label36:
	iconst_1 
	ireturn 
Label38:
	iconst_0 
	ireturn 
	}


public final boolean equalsSkip( net.rim.tools.compiler.codfile.TypeList, net.rim.tools.compiler.codfile.TypeList ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	if_acmpne Label6
	iconst_1 
	ireturn 
Label6:
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	istore_2 
	iload_2 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	if_icmpeq Label15
	iconst_0 
	ireturn 
Label15:
	iconst_1 
	istore_3 
Label17:
	iload_3 
	iload_2 
	if_icmpge Label33
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_3 
	aaload 
	aload_1 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_3 
	aaload 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label31
	iconst_0 
	ireturn 
Label31:
	iinc 3 1
	goto Label17
Label33:
	iconst_1 
	ireturn 
	}


public final int hashCode( net.rim.tools.compiler.codfile.TypeList ); // address: 0
	{
	enter 
	iipush 305419896
	istore_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_2 
	if_icmpge Label22
	iload_1 
	bipush 31
	imul 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_3 
	aaload 
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	istore_1 
	iinc 3 1
	goto Label8
Label22:
	iload_1 
	ireturn 
	}

}
