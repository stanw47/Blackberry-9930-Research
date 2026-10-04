// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 31
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class Code extends net.rim.tools.compiler.codfile.CodfileItem
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _numOpcodes ; // ofs = 18352 addr = 0)
	private byte[] /*byte[]*/  _opcodes ; // ofs = 18356 addr = 0)
	private int[] /*int[]*/  _operands ; // ofs = 18360 addr = 0)
	private short[] /*short[]*/  _referenceIndex ; // ofs = 18364 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileLabel /*net.rim.tools.compiler.codfile.CodfileLabel[]*/  _labels ; // ofs = 18368 addr = 0)
	private short /*short*/  _numReferences ; // ofs = 18372 addr = 0)
	private Object /*java.lang.Object[]*/  _references ; // ofs = 18376 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.Code ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.codfile.CodfileItem )
	}


static public final int getOpcodeSize( int, int, int[], boolean, boolean ); // address: 0
	{
	enter 
	iconst_0 
	istore_5 
	bipush 4
	istore_6 
	iconst_0 
	istore_7 
	iload_0 
Label9:
	iload_3 
	ifeq Label13
	iinc 5 3
	goto_w Label143
Label13:
	iload_5 
	getstatic_lib module:net_rim_loader-2.class#32.static_87 // class#32
	iload_0 
	baload 
	iadd 
	istore_5 
	goto_w Label143
Label20:
	iload_1 
	bipush 2
	if_icmpne Label32
	iload_5 
	getstatic_lib module:net_rim_loader-2.class#32.static_87 // class#32
	sipush 283
	baload 
	iconst_1 
	iadd 
	iadd 
	istore_5 
	goto_w Label143
Label32:
	iload_1 
	bipush 3
	if_icmpne Label44
	iload_5 
	getstatic_lib module:net_rim_loader-2.class#32.static_87 // class#32
	sipush 284
	baload 
	iconst_1 
	iadd 
	iadd 
	istore_5 
	goto_w Label143
Label44:
	iload_5 
	getstatic_lib module:net_rim_loader-2.class#32.static_87 // class#32
	iload_0 
	baload 
	iadd 
	istore_5 
	goto_w Label143
Label51:
	iload_5 
	getstatic_lib module:net_rim_loader-2.class#32.static_87 // class#32
	iload_0 
	baload 
	iadd 
	istore_5 
	iload_3 
	ifeq Label61
	iinc 5 3
	goto_w Label143
Label61:
	iload_1 
	iconst_1 
	if_icmpne Label66
	iinc 5 3
	goto Label143
Label66:
	iload_1 
	bipush 2
	if_icmpne Label78
	iload_5 
	getstatic_lib module:net_rim_loader-2.class#32.static_87 // class#32
	sipush 283
	baload 
	iconst_1 
	iadd 
	iadd 
	istore_5 
	goto Label143
Label78:
	iload_1 
	bipush 3
	if_icmpne Label143
	iload_5 
	getstatic_lib module:net_rim_loader-2.class#32.static_87 // class#32
	sipush 283
	baload 
	iconst_1 
	iadd 
	iadd 
	istore_5 
	goto Label143
Label90:
	bipush 2
	istore_6 
Label92:
	aload_2 
	ifnull Label101
	aload_2 
	arraylength 
	iload_6 
	bipush 2
	iadd 
	imul 
	istore_7 
Label101:
	bipush 5
	iload_7 
	iadd 
	istore_5 
	aload_2 
	invokestatic int numTableEntries( int[] ) // Code
	istore_7 
	bipush 7
	iload_7 
	bipush 2
	imul 
	iadd 
	istore 8
	iload_4 
	ifeq Label143
	iload 8
	iload_5 
	if_icmpge Label143
	iload 8
	istore_5 
	goto Label143
Label122:
	aload_2 
	ifnull Label130
	aload_2 
	iconst_0 
	iaload 
	bipush 2
	imul 
	istore_7 
Label130:
	iload_5 
	bipush 7
	iload_7 
	iadd 
	iadd 
	istore_5 
	goto Label143
Label137:
	iload_5 
	getstatic_lib module:net_rim_loader-2.class#32.static_87 // class#32
	iload_0 
	baload 
	iadd 
	istore_5 
Label143:
	iload_5 
	ireturn 
	}


static private final int numTableEntries( int[] ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0 
	arraylength 
	istore_1 
	iload_1 
	iconst_1 
	iadd 
	istore_2 
	iload_2 
	bipush 8
	imul 
	istore_3 
	iconst_1 
	istore_4 
Label18:
	iload_4 
	iload_1 
	if_icmpge Label65
	aload_0 
	iload_4 
	iaload 
	aload_0 
	iload_4 
	iconst_1 
	isub 
	iaload 
	if_icmpgt Label34
	iload_3 
	istore_2 
	iload_2 
	ireturn 
Label34:
	aload_0 
	iload_4 
	iaload 
	aload_0 
	iload_4 
	iconst_1 
	isub 
	iaload 
	isub 
	iconst_1 
	isub 
	istore_5 
	iload_5 
	ifge Label52
	iload_3 
	istore_2 
	iload_2 
	ireturn 
Label52:
	iload_5 
	iload_3 
	if_icmple Label59
	iload_3 
	istore_2 
	iload_2 
	ireturn 
Label59:
	iload_2 
	iload_5 
	iadd 
	istore_2 
	iinc 4 1
	goto Label18
Label65:
	iload_2 
	ireturn 
	}


static public final int getStringArrayInitSize( int, int ); // address: 0
	{
	enter_narrow 
	bipush 3
	bipush 2
	iload_1 
	imul 
	iadd 
	ireturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int getTarget( net.rim.tools.compiler.codfile.Code, net.rim.tools.compiler.codfile.CodfileLabel, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	iadd 
	aload_2 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	isub 
	istore_3 
	iload_3 
	sipush -32768
	if_icmplt Label15
	iload_3 
	iipush 32768
	if_icmplt Label20
Label15:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_341:" branch target out of range"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label20:
	iload_3 
	ireturn 
	}


private final int getTargetLong( net.rim.tools.compiler.codfile.Code, net.rim.tools.compiler.codfile.CodfileLabel, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	iadd 
	aload_2 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	isub 
	istore_3 
	iload_3 
	iipush -65535
	if_icmplt Label15
	iload_3 
	iipush 65535
	if_icmplt Label20
Label15:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_341:" branch target out of range"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label20:
	iload_3 
	ireturn 
	}


private final writeAsTableswitch( net.rim.tools.compiler.codfile.Code, net.rim.tools.compiler.io.StructuredOutputStream, int[], net.rim.tools.compiler.codfile.CodfileLabel[], int ); // address: 0
	{
	enter 
	aload_1 
	bipush 47
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iload_4 
	ifeq Label9
	bipush -1
	istore_4 
	goto Label12
Label9:
	aload_2 
	invokestatic int numTableEntries( int[] ) // Code
	istore_4 
Label12:
	aload_1 
	iload_4 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_2 
	iconst_0 
	iaload 
	iconst_1 
	isub 
	istore_5 
	aload_1 
	iload_5 
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_2 
	arraylength 
	istore_6 
	iinc 5 -1
	iconst_0 
	istore 8
Label30:
	iload 8
	iload_6 
	if_icmpge Label71
	aload_2 
	iload 8
	iaload 
	iload_5 
	isub 
	istore 9
Label39:
	iinc 9 -1
	iload 9
	ifle Label53
	aload_0 
	aload_3 
	iconst_0 
	aaload 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore_7 
	aload_1 
	iload_7 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto Label39
Label53:
	aload_0 
	aload_3 
	iload 8
	iconst_1 
	iadd 
	aaload 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore_7 
	aload_1 
	iload_7 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_2 
	iload 8
	iaload 
	istore_5 
	iinc 8 1
	goto Label30
Label71:
	return 
	}


private final writeAsLookupswitch( net.rim.tools.compiler.codfile.Code, net.rim.tools.compiler.io.StructuredOutputStream, boolean, int[], net.rim.tools.compiler.codfile.CodfileLabel[], int ); // address: 0
	{
	enter 
	iload_2 
	ifeq Label5
	sipush 163
	goto Label6
Label5:
	sipush 164
Label6:
	istore_6 
	aload_1 
	iload_6 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_3 
	arraylength 
	istore_7 
	iload_5 
	ifeq Label18
	bipush -1
	istore_5 
	goto Label20
Label18:
	iload_7 
	istore_5 
Label20:
	aload_1 
	iload_5 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iconst_0 
	istore 9
Label25:
	iload 9
	iload_7 
	if_icmpge Label55
	iload_2 
	ifeq Label36
	aload_1 
	aload_3 
	iload 9
	iaload 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto Label41
Label36:
	aload_1 
	aload_3 
	iload 9
	iaload 
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label41:
	aload_0 
	aload_4 
	iload 9
	iconst_1 
	iadd 
	aaload 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore 8
	aload_1 
	iload 8
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iinc 9 1
	goto Label25
Label55:
	aload_0 
	aload_4 
	iconst_0 
	aaload 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore 8
	aload_1 
	iload 8
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


private final setOperandShorts( net.rim.tools.compiler.codfile.Code, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_2 
	bipush 16
	ishl 
	iload_1 
	iipush 65535
	iand 
	ior 
	iastore 
	return 
	}


private final int getOperandShort1( net.rim.tools.compiler.codfile.Code, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	iaload 
	iipush 65535
	iand 
	ireturn 
	}


private final int getOperandShort2( net.rim.tools.compiler.codfile.Code, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	iaload 
	bipush 16
	ishr 
	ireturn 
	}


private final setOperandBytes( net.rim.tools.compiler.codfile.Code, int, int, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	iload_4 
	bipush 16
	ishl 
	iload_3 
	sipush 255
	iand 
	bipush 8
	ishl 
	ior 
	iload_2 
	sipush 255
	iand 
	ior 
	iastore 
	return 
	}


private final setOperandBytes( net.rim.tools.compiler.codfile.Code, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	iload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.codfile.Code.setOperandBytes // pc=5
	return 
	}


private final int getOperandByte1( net.rim.tools.compiler.codfile.Code, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	iaload 
	sipush 255
	iand 
	ireturn 
	}


private final int getOperandByte2( net.rim.tools.compiler.codfile.Code, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	iaload 
	bipush 8
	ishr 
	sipush 255
	iand 
	ireturn 
	}


private final int getOperandByte3( net.rim.tools.compiler.codfile.Code, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	iaload 
	bipush 16
	ishr 
	ireturn 
	}


private final short addReference( net.rim.tools.compiler.codfile.Code, java.lang.Object ); // address: 0
	{
	enter 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	istore_2 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label10
	aload_0 
	iconst_1 
	newarray_object_lib Object//java.lang.Object java.lang.Object java.lang.Object
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	goto Label22
Label10:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	arraylength 
	if_icmpne Label22
	aload_0 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	arraylength 
	bipush 2
	imul 
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19117(  ) // class#29
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
Label22:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	dup_x1 
	iconst_1 
	iadd 
	i2s 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	aastore 
	iload_2 
	ireturn 
	}


private final setReference( net.rim.tools.compiler.codfile.Code, int, int, java.lang.Object ); // address: 0
	{
	enter 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	saload 
	iload_2 
	iadd 
	aload_3 
	aastore 
	return 
	}


private final java.lang.Object getReference( net.rim.tools.compiler.codfile.Code, int, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	saload 
	iload_2 
	iadd 
	aaload 
	areturn 
	}


private final int getOpcodeSize( net.rim.tools.compiler.codfile.Code, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	iload_1 
	ifle Label16
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	iconst_1 
	isub 
	baload 
	sipush 255
	iand 
	sipush 216
	if_icmpne Label16
	sipush 256
	istore_2 
Label16:
	aconst_null 
	astore_3 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	baload 
	sipush 255
	iand 
	iload_2 
	iadd 
	istore_4 
	iload_4 
Label28:
	iload_4 
	aload_0 
	iload_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_arrayobject_lib class#22
	arraylength 
	invokestatic int getStringArrayInitSize( int, int ) // Code
	ireturn 
Label37:
	aload_0 
	iload_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_array 1 5
	astore_3 
Label43:
	iload_4 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	iaload 
	aload_3 
	iconst_0 
	iconst_1 
	invokestatic int getOpcodeSize( int, int, int[], boolean, boolean ) // Code
	ireturn 
	}


private final int setOffsets( net.rim.tools.compiler.codfile.Code, int, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	bipush -1
	istore_4 
	iconst_0 
	istore_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label28
	iload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	arraylength 
	if_icmpge Label28
Label13:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_5 
	iinc 5 1
	aaload 
	astore_3 
	aload_3 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore_4 
	iload_4 
	iload_2 
	if_icmpge Label28
	iload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	arraylength 
	if_icmplt Label13
Label28:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_7 
	iload_2 
	istore_6 
Label32:
	iload_6 
	iload_7 
	if_icmpge Label67
	aload_3 
	ifnull Label59
	iload_4 
	iload_6 
	if_icmpne Label59
	aload_3 
	iload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	aconst_null 
	astore_3 
	bipush -1
	istore_4 
	iload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	arraylength 
	if_icmpge Label59
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_5 
	iinc 5 1
	aaload 
	astore_3 
	aload_3 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore_4 
Label59:
	iload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOpcodeSize // pc=2
	iadd 
	istore_1 
	iinc 6 1
	goto Label32
Label67:
	aload_3 
	ifnull Label84
	aload_3 
	iload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	aconst_null 
	astore_3 
	iload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	arraylength 
	if_icmpge Label67
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_5 
	iinc 5 1
	aaload 
	astore_3 
	goto Label67
Label84:
	iload_1 
	ireturn 
	}


private final int invertSense( net.rim.tools.compiler.codfile.Code, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

Label3:
	sipush 160
	ireturn 
Label5:
	sipush 149
	ireturn 
Label7:
	sipush 159
	ireturn 
Label9:
	sipush 146
	ireturn 
Label11:
	sipush 150
	ireturn 
Label13:
	sipush 148
	ireturn 
Label15:
	sipush 147
	ireturn 
Label17:
	sipush 145
	ireturn 
Label19:
	sipush 156
	ireturn 
Label21:
	sipush 155
	ireturn 
Label23:
	sipush 158
	ireturn 
Label25:
	sipush 157
	ireturn 
Label27:
	sipush 152
	ireturn 
Label29:
	sipush 151
	ireturn 
Label31:
	sipush 154
	ireturn 
Label33:
	sipush 153
	ireturn 
Label35:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.Code, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	astore_2 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_3 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_4 
	iconst_0 
	istore_5 
	iconst_0 
	istore_6 
Label14:
	iload_6 
	iload_4 
	if_icmplt Label18
	goto_w Label878
Label18:
	aload_2 
	iload_6 
	baload 
	sipush 255
	iand 
	iload_5 
	iadd 
	istore_7 
	iconst_0 
	istore_5 
	iconst_0 
	istore 8
	iload_7 
	tableswitch  :
		
		
		

Label32:
	iconst_1 
	istore 8
Label34:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_array 1 5
	astore 9
	aload_0 
	iload_6 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_arrayobject CodfileLabel
	astore 10
	iload 8
	ifeq Label50
	bipush 2
	goto Label51
Label50:
	bipush 4
Label51:
	istore 11
	aload 9
	arraylength 
	iload 11
	bipush 2
	iadd 
	imul 
	istore 12
	bipush 5
	iload 12
	iadd 
	istore 13
	aload 9
	invokestatic int numTableEntries( int[] ) // Code
	istore 12
	bipush 2
	iload 12
	imul 
	istore 12
	bipush 7
	iload 12
	iadd 
	istore 14
	iload 14
	iload 13
	if_icmpgt Label90
	aload_3 
	iload_6 
	iaload 
	ifne Label90
	aload_0 
	aload_1 
	aload 9
	aload 10
	aload_3 
	iload_6 
	iaload 
	invokespecial net.rim.tools.compiler.codfile.Code.writeAsTableswitch // pc=5
	goto_w Label876
Label90:
	aload_0 
	aload_1 
	iload 8
	aload 9
	aload 10
	aload_3 
	iload_6 
	iaload 
	invokespecial net.rim.tools.compiler.codfile.Code.writeAsLookupswitch // pc=6
	goto_w Label876
Label100:
	iload_7 
	sipush 162
	if_icmpne Label126
	aload_3 
	iload_6 
	iaload 
	bipush 2
	if_icmplt Label126
	aload_1 
	sipush 216
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_3 
	iload_6 
	iaload 
	bipush 2
	if_icmpne Label119
	sipush 283
	istore_7 
	goto Label126
Label119:
	aload_3 
	iload_6 
	iaload 
	bipush 3
	if_icmpne Label126
	sipush 284
	istore_7 
Label126:
	aload_1 
	iload_7 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iload_7 
Label131:
	sipush 256
	istore_5 
	goto_w Label876
Label134:
	aload_1 
	aload_3 
	iload_6 
	iaload 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label140:
	aload_1 
	aload_3 
	iload_6 
	iaload 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label146:
	aload_1 
	aload_3 
	iload_6 
	iaload 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label152:
	aload_1 
	aload_3 
	iload_6 
	iaload 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label158:
	aload_1 
	aload_3 
	iload_6 
	iaload 
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label164:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Literal//module:net_rim_loader.class#22 module:net_rim_loader.class#22 module:net_rim_loader.class#22
	astore 13
	aload_1 
	aload 13
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileData.length // pc=1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload 13
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	goto_w Label876
Label178:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Literal//module:net_rim_loader.class#22 module:net_rim_loader.class#22 module:net_rim_loader.class#22
	astore 13
	aload 13
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	goto_w Label876
Label188:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast CodfileData
	astore 13
	aload_1 
	aload_3 
	iload_6 
	iaload 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload 13
	invokevirtual int length( net.rim.tools.compiler.codfile.CodfileData ) // pc=1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload 13
	aload_1 
	invokevirtual routine
	goto_w Label876
Label207:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_arrayobject_lib class#22
	astore 13
	aload_1 
	aload 13
	arraylength 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iconst_0 
	istore 14
Label219:
	iload 14
	aload 13
	arraylength 
	if_icmplt Label224
	goto_w Label876
Label224:
	aload 13
	iload 14
	aaload 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	iinc 14 1
	goto Label219
Label231:
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort1 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort2 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label242:
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort1 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort2 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label253:
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort1 // pc=2
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort2 // pc=2
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label264:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib Long//java.lang.Long java.lang.Long java.lang.Long
	astore 13
	aload_1 
	aload 13
	invokevirtual long longValue( java.lang.Long ) // pc=1
	invokevirtual writeLong( net.rim.tools.compiler.io.StructuredOutputStream, long ) // pc=3
	goto_w Label876
Label275:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload_0 
	iload_6 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Member//net.rim.tools.compiler.codfile.Member net.rim.tools.compiler.codfile.Member net.rim.tools.compiler.codfile.Member
	astore 13
	aload 13
	aload_1 
	aload 10
	invokevirtual writeStaticOffset( net.rim.tools.compiler.codfile.Member, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ) // pc=3
	goto_w Label876
Label292:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload_0 
	iload_6 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Member//net.rim.tools.compiler.codfile.Member net.rim.tools.compiler.codfile.Member net.rim.tools.compiler.codfile.Member
	astore 13
	aload 13
	aload_1 
	aload 10
	aload_3 
	iload_6 
	iaload 
	ifeq Label313
	iconst_1 
	goto Label314
Label313:
	iconst_0 
Label314:
	invokevirtual writeStaticOffsetLib( net.rim.tools.compiler.codfile.Member, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ) // pc=4
	goto_w Label876
Label316:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload_0 
	iload_6 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Member//net.rim.tools.compiler.codfile.Member net.rim.tools.compiler.codfile.Member net.rim.tools.compiler.codfile.Member
	astore 13
	aload 13
	aload_1 
	aload 10
	aload_3 
	iload_6 
	iaload 
	ifeq Label337
	iconst_1 
	goto Label338
Label337:
	iconst_0 
Label338:
	invokevirtual writeMemberAddress( net.rim.tools.compiler.codfile.Member, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ) // pc=4
	goto_w Label876
Label340:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Routine//net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine
	astore 11
	aload_1 
	aload 11
	invokevirtual int getLocalCount( net.rim.tools.compiler.codfile.Routine ) // pc=1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload 11
	checkcast_lib net.rim.tools.compiler.codfile.RoutineLocal//module:net_rim_loader-2.class#40 module:net_rim_loader-2.class#40 module:net_rim_loader-2.class#40
	aload_1 
	invokenonvirtual_lib .routine_22411 // pc=2
	goto_w Label876
Label355:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload_0 
	iload_6 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Routine//net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine
	astore 11
	aload 11
	aload_1 
	aload 10
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ) // pc=3
	goto_w Label876
Label372:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload_0 
	iload_6 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Routine//net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine
	astore 11
	aload 11
	aload_1 
	aload 10
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ) // pc=3
	aload_1 
	aload 11
	invokevirtual int getLocalCount( net.rim.tools.compiler.codfile.Routine ) // pc=1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label393:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Routine//net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine
	astore 11
	aload 11
	aload_1 
	aload 11
	invokevirtual net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.codfile.Member ) // pc=1
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ) // pc=3
	aload_1 
	aload 11
	invokevirtual int getLocalCount( net.rim.tools.compiler.codfile.Routine ) // pc=1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label409:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload_0 
	iload_6 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Routine//net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine
	astore 11
	aload 11
	aload_1 
	aload 10
	aload_3 
	iload_6 
	iaload 
	ifeq Label430
	iconst_1 
	goto Label431
Label430:
	iconst_0 
Label431:
	invokevirtual writeMemberAddress( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ) // pc=4
	aload_1 
	aload 11
	invokevirtual int getLocalCount( net.rim.tools.compiler.codfile.Routine ) // pc=1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label437:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.Routine//net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine
	astore 11
	aload 11
	aload_3 
	iload_6 
	iaload 
	ifeq Label450
	iconst_1 
	goto Label451
Label450:
	iconst_0 
Label451:
	invokevirtual int getVTableOffset( net.rim.tools.compiler.codfile.Routine, boolean ) // pc=2
	istore 14
	aload 11
	invokevirtual int getAddress( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	bipush 2
	ishl 
	istore 15
	aload 11
	invokevirtual int getLocalCount( net.rim.tools.compiler.codfile.Routine ) // pc=1
	istore 16
	iload 15
	iload 16
	iconst_1 
	isub 
	ior 
	istore 15
	aload_1 
	iload 15
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label471:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast InterfaceMethodRef
	astore 14
	aload 14
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort1 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort2 // pc=2
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label491:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload 10
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	goto_w Label876
Label501:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload 10
	aload_1 
	invokevirtual writeOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	goto_w Label876
Label511:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload 10
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	aload_3 
	iload_6 
	iaload 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label526:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload 10
	aload_1 
	invokevirtual writeOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	aload_3 
	iload_6 
	iaload 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label541:
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandByte1 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandByte2 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandByte3 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label557:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload 10
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort1 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort2 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label577:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload 10
	aload_1 
	invokevirtual writeOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort1 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort2 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label597:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload_0 
	iload_6 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast CodfileLabel
	astore 9
	aload 10
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload 9
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore 12
	aload_1 
	iload 12
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label621:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast ClassDef
	astore 10
	aload_0 
	iload_6 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast CodfileLabel
	astore 9
	aload 10
	aload_1 
	invokevirtual writeOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload 9
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore 12
	aload_1 
	iload 12
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label645:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast CodfileLabel
	astore 9
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort1 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandShort2 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	aload 9
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore 12
	aload_1 
	iload 12
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label670:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_array 1 5
	astore 14
	aload_0 
	iload_6 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_arrayobject CodfileLabel
	astore 15
	aload 15
	arraylength 
	istore 16
	aload_3 
	iload_6 
	iaload 
	ifeq Label691
	bipush -1
	istore 16
Label691:
	aload_1 
	iload 16
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload 14
	iconst_1 
	iaload 
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload 15
	arraylength 
	istore 16
	iconst_0 
	istore 17
Label704:
	iload 17
	iload 16
	if_icmplt Label708
	goto_w Label876
Label708:
	aload_0 
	aload 15
	iload 17
	aaload 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore 12
	aload_1 
	iload 12
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iinc 17 1
	goto Label704
Label720:
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandByte1 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandByte2 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOperandByte3 // pc=2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label736:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast CodfileLabel
	astore 9
	aload_3 
	iload_6 
	iaload 
	ifne Label755
	aload_0 
	aload 9
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore 12
	aload_1 
	iload 12
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label755:
	aload_3 
	iload_6 
	iaload 
	iconst_1 
	if_icmpne Label779
	bipush 4
	istore 12
	aload_1 
	iload 12
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	sipush 162
	istore 14
	aload_1 
	iload 14
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	aload 9
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore 12
	aload_1 
	iload 12
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto_w Label876
Label779:
	aload_3 
	iload_6 
	iaload 
	bipush 2
	if_icmpeq Label790
	aload_3 
	iload_6 
	iaload 
	bipush 3
	if_icmpeq Label790
	goto_w Label876
Label790:
	bipush 5
	istore 12
	aload_1 
	iload 12
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	sipush 216
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	sipush 284
	istore 14
	aload_3 
	iload_6 
	iaload 
	bipush 2
	if_icmpne Label807
	sipush 283
	istore 14
Label807:
	aload_1 
	iload 14
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	aload 9
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTargetLong // pc=3
	istore 12
	aload_3 
	iload_6 
	iaload 
	bipush 2
	if_icmpne Label823
	iload 12
	ineg 
	istore 12
Label823:
	aload_1 
	iload 12
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto Label876
Label827:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast CodfileLabel
	astore 9
	aload_0 
	aload 9
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore 12
	aload_1 
	iload 12
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto Label876
Label842:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast CodfileLabel
	astore 9
	aload_0 
	aload 9
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTarget // pc=3
	istore 12
	aload_1 
	iload 12
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto Label876
Label857:
	aload_0 
	iload_6 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast CodfileLabel
	astore 9
	aload_0 
	aload 9
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getTargetLong // pc=3
	istore 12
	iload 12
	ifge Label873
	iload 12
	ineg 
	istore 12
Label873:
	aload_1 
	iload 12
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label876:
	iinc 6 1
	goto_w Label14
Label878:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}


public final allocateOpcodes( net.rim.tools.compiler.codfile.Code, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	newarray 2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	iload_1 
	newarray 5
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iload_1 
	newarray 4
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int ); // address: 0
	{
	enter 
	iload_1 
Label3:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
Label8:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, int ); // address: 0
	{
	enter_narrow 
	iload_1 
Label3:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_2 
	iastore 
Label12:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, module:net_rim_loader.class#22 ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
Label14:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, module:net_rim_loader.class#22[] ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, int, net.rim.tools.compiler.codfile.CodfileData ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_2 
	iastore 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_3 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
Label8:
	aload_0 
	iload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.codfile.Code.setOperandShorts // pc=3
Label12:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, long ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	lload 2
	invokespecial_lib java.lang.Long.<init> // pc=3
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Member, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_4 
	ifeq Label20
	iconst_1 
	goto Label21
Label20:
	iconst_0 
Label21:
	iastore 
	aload_0 
	aload_3 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	pop 
Label26:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, net.rim.tools.compiler.codfile.Member, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_3 
	ifeq Label20
	iconst_1 
	goto Label21
Label20:
	iconst_0 
Label21:
	iastore 
Label22:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, net.rim.tools.compiler.codfile.ClassDef, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_3 
	iastore 
Label18:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, int, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
Label8:
	aload_0 
	iload_2 
	iload_3 
	iload_4 
	invokespecial net.rim.tools.compiler.codfile.Code.setOperandBytes // pc=4
Label13:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, int, int, java.lang.Object ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_4 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
	aload_0 
	iload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.codfile.Code.setOperandShorts // pc=3
Label18:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, net.rim.tools.compiler.codfile.ClassDef, java.lang.Object ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
	tableswitch  :
		
		
		

Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
	aload_0 
	aload_3 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	pop 
Label18:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, int[] ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
Label8:
	aload_0 
	aload_2 
	iconst_0 
	iaload 
	aload_2 
	iconst_1 
	iaload 
	aload_2 
	bipush 2
	iaload 
	invokespecial net.rim.tools.compiler.codfile.Code.setOperandBytes // pc=4
Label19:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, java.lang.Object ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
Label14:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addOpcode( net.rim.tools.compiler.codfile.Code, int, int[], java.lang.Object[], boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	i2b 
	bastore 
	iload_1 
Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	sastore 
	aload_0 
	aload_3 
	invokespecial net.rim.tools.compiler.codfile.Code.addReference // pc=2
	pop 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_4 
	ifeq Label24
	iconst_1 
	goto Label25
Label24:
	iconst_0 
Label25:
	iastore 
Label26:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final boolean newStyleEnterOk( net.rim.tools.compiler.codfile.Code ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifle Label9
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	baload 
Label7:
	iconst_0 
	ireturn 
Label9:
	iconst_1 
	ireturn 
	}


public final setNewStyleEnter( net.rim.tools.compiler.codfile.Code ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifle Label11
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	baload 
Label7:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	bipush -35
	bastore 
Label11:
	return 
	}


public final net.rim.tools.compiler.codfile.CodfileLabel plantLabel( net.rim.tools.compiler.codfile.Code ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label10
	aload_0 
	iconst_1 
	newarray_object CodfileLabel
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	goto Label21
Label10:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	arraylength 
	istore_1 
	aload_0 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	arraylength 
	iconst_1 
	iadd 
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19231(  ) // class#29
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label21:
	new CodfileLabel
	dup 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush -1
	invokespecial net.rim.tools.compiler.codfile.CodfileLabel.<init> // pc=3
	astore_2 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	aload_2 
	aastore 
	aload_2 
	areturn 
	}


public final int computeBranches( net.rim.tools.compiler.codfile.Code ); // address: 0
	{
	enter 
Label1:
	iconst_0 
	istore_2 
	iconst_0 
	istore_3 
	aload_0 
	iload_3 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.setOffsets // pc=3
	istore_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_4 
	iconst_0 
	istore_5 
	iconst_0 
	istore_6 
Label16:
	iload_6 
	iload_4 
	if_icmplt Label20
	goto_w Label129
Label20:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_6 
	baload 
	sipush 255
	iand 
	iload_5 
	iadd 
	istore_7 
	iconst_0 
	istore_5 
	iload_7 
Label32:
	sipush 256
	istore_5 
	goto_w Label121
Label35:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_6 
	iaload 
	ifeq Label40
	goto_w Label121
Label40:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_6 
	saload 
	aaload 
	checkcast CodfileLabel
	astore 8
	aload 8
	invokevirtual_short .virtual_5 // idx=5 pc=1
	iload_3 
	iconst_1 
	iadd 
	isub 
	istore 9
	bipush -128
	iload 9
	if_icmpgt Label61
	iload 9
	sipush 128
	if_icmpge Label61
	goto Label121
Label61:
	iinc 9 2
	sipush -32768
	iload 9
	if_icmpgt Label88
	iload 9
	iipush 32768
	if_icmpge Label88
	iload_7 
	sipush 161
	if_icmpne Label76
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_6 
	bipush -94
	bastore 
	goto Label114
Label76:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_6 
	aload_0 
	iload_7 
	invokespecial net.rim.tools.compiler.codfile.Code.invertSense // pc=2
	i2b 
	bastore 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_6 
	iconst_1 
	iastore 
	goto Label114
Label88:
	iload 9
	ifge Label95
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_6 
	bipush 2
	iastore 
	goto Label99
Label95:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_6 
	bipush 3
	iastore 
Label99:
	iload_7 
	sipush 161
	if_icmpne Label107
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_6 
	bipush -94
	bastore 
	goto Label114
Label107:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_6 
	aload_0 
	iload_7 
	invokespecial net.rim.tools.compiler.codfile.Code.invertSense // pc=2
	i2b 
	bastore 
Label114:
	aload_0 
	iload_3 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.setOffsets // pc=3
	istore_1 
	iconst_1 
	istore_2 
Label121:
	iload_3 
	aload_0 
	iload_6 
	invokespecial net.rim.tools.compiler.codfile.Code.getOpcodeSize // pc=2
	iadd 
	istore_3 
	iinc 6 1
	goto_w Label16
Label129:
	iload_2 
	ifeq Label132
	goto_w Label1
Label132:
	iload_1 
	ireturn 
	}


public final resolveBranches( net.rim.tools.compiler.codfile.Code ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_2 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
Label7:
	iload_4 
	iload_2 
	if_icmplt Label11
	goto_w Label88
Label11:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_4 
	baload 
	sipush 255
	iand 
	iload_3 
	iadd 
	istore_5 
	iconst_0 
	istore_3 
	iload_5 
Label23:
	sipush 256
	istore_3 
	goto Label86
Label26:
	aload_0 
	iload_4 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast InstructionTarget
	astore_1 
	aload_0 
	iload_4 
	iconst_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionTarget.getLabel // pc=1
	invokespecial net.rim.tools.compiler.codfile.Code.setReference // pc=4
	goto Label86
Label39:
	aload_0 
	iload_4 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast InstructionTarget
	astore_1 
	aload_0 
	iload_4 
	iconst_1 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionTarget.getLabel // pc=1
	invokespecial net.rim.tools.compiler.codfile.Code.setReference // pc=4
	goto Label86
Label52:
	aload_0 
	iload_4 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.Code.getReference // pc=3
	checkcast_arrayobject_lib Object
	astore_6 
	aload_6 
	arraylength 
	istore_7 
	iload_7 
	newarray_object CodfileLabel
	astore 8
	iconst_0 
	istore 9
Label66:
	iload 9
	iload_7 
	if_icmpge Label81
	aload_6 
	iload 9
	aaload 
	checkcast InstructionTarget
	astore_1 
	aload 8
	iload 9
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionTarget.getLabel // pc=1
	aastore 
	iinc 9 1
	goto Label66
Label81:
	aload_0 
	iload_4 
	iconst_1 
	aload 8
	invokespecial net.rim.tools.compiler.codfile.Code.setReference // pc=4
Label86:
	iinc 4 1
	goto_w Label7
Label88:
	return 
	}

}
