// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 40
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class RoutineLocal extends net.rim.tools.compiler.codfile.Routine

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.CodfileArray /*module:net_rim_loader-1.class#33*/  _stackMaps ; // ofs = 12428 addr = 0)
	private int /*int*/  _attributes ; // ofs = 12432 addr = 0)
	private int /*int*/  _numLocals ; // ofs = 12436 addr = 0)
	private int /*int*/  _numStack ; // ofs = 12440 addr = 0)
	private net.rim.tools.compiler.codfile.Code /*module:net_rim_loader-1.class#31*/  _code ; // ofs = 12444 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileArray /*module:net_rim_loader-1.class#33*/  _exceptionHandlers ; // ofs = 12448 addr = 0)
	private int /*int*/  _byteCodeWeight ; // ofs = 12452 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.RoutineLocal, net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#66, net.rim.tools.compiler.codfile.TypeList, net.rim.tools.compiler.codfile.TypeList ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	aload_4 
	invokespecial net.rim.tools.compiler.codfile.Routine.<init> // pc=5
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.RoutineLocal.init // pc=1
	return 
	}


public <init>( net.rim.tools.compiler.codfile.RoutineLocal, net.rim.tools.compiler.codfile.ClassDef, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iload_2 
	invokespecial net.rim.tools.compiler.codfile.Routine.<init> // pc=3
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.RoutineLocal.init // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final init( net.rim.tools.compiler.codfile.RoutineLocal ); // address: 0
	{
	enter_narrow 
	aload_0 
	new_lib net.rim.tools.compiler.codfile.Code//module:net_rim_loader-1.class#31 module:net_rim_loader-1.class#31 module:net_rim_loader-1.class#31
	dup 
	invokespecial_lib .routine_20755 // pc=1
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setByteCodeWeight( net.rim.tools.compiler.codfile.RoutineLocal, int ); // address: 0
	{
	putfield_return .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	}


public final write( net.rim.tools.compiler.codfile.RoutineLocal, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	istore_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	checkcast_lib net.rim.tools.compiler.codfile.ClassDefLocal//module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24
	iload_2 
	invokenonvirtual_lib .routine_12412 // pc=2
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.RoutineLocal.getNumStackMaps // pc=1
	istore_3 
	iconst_0 
	istore_4 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	sipush 255
	if_icmpgt Label36
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	sipush 253
	if_icmpgt Label36
	iload_3 
	bipush 3
	if_icmpgt Label36
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 3
	if_icmpgt Label36
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	bipush 3
	if_icmpgt Label36
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	bipush 3
	if_icmpgt Label36
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokenonvirtual_lib .routine_18926 // pc=1
	ifeq Label36
	iconst_1 
	istore_4 
Label36:
	iload_2 
	iload_3 
	invokestatic int getSize(  ) // StackMap
	imul 
	iadd 
	iload_4 
	ifeq Label45
	bipush 9
	goto Label46
Label45:
	bipush 14
Label46:
	iadd 
	istore_5 
	iload_3 
	ifle Label54
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_1 
	iload_5 
	invokenonvirtual_lib .routine_21909 // pc=3
Label54:
	iload_4 
	ifeq Label102
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokenonvirtual_lib .routine_18961 // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
	aload_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokenonvirtual_lib .routine_22954 // pc=1
	bipush 2
	iadd 
	sipush 255
	iand 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	sipush 255
	iand 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
	iload_3 
	bipush 6
	ishl 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	bipush 4
	ishl 
	iadd 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	ishl 
	iadd 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	iconst_0 
	ishl 
	iadd 
	istore_6 
	aload_1 
	iload_6 
	sipush 255
	iand 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto Label140
Label102:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
	aload_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokenonvirtual_lib .routine_22954 // pc=1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iipush 65535
	iand 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	iload_3 
	sipush 255
	iand 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	sipush 255
	iand 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	sipush 255
	iand 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	sipush 255
	iand 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label140:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_22880 // pc=2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	invokenonvirtual_lib .routine_14856 // pc=2
	goto Label169
	astore_6 
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_6 
	invokevirtual java.lang.String getMessage( java.io.IOException ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_543:" in: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_544:"."
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_31586 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label169:
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.RoutineLocal.getNumExceptionHandlers // pc=1
	istore_6 
	iload_6 
	ifle Label181
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_1 
	iload_5 
	invokenonvirtual_lib .routine_21909 // pc=3
	aload_1 
	iipush 65535
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label181:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	checkcast_lib net.rim.tools.compiler.codfile.ClassDefLocal//module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	invokenonvirtual_lib .routine_12432 // pc=2
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	iload_2 
	isub 
	invokenonvirtual_lib .routine_22943 // pc=2
	return 
	}


public final writeStaticOffset( net.rim.tools.compiler.codfile.RoutineLocal, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_2 
	aload_1 
	invokevirtual writeOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeStaticOffsetLib( net.rim.tools.compiler.codfile.RoutineLocal, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.Routine.addStaticFixup // pc=3
	istore_4 
	aload_1 
	bipush -1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	iload_4 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeNativeInvoke( net.rim.tools.compiler.codfile.RoutineLocal, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_1 
	bipush -1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeFixups( net.rim.tools.compiler.codfile.RoutineLocal, module:net_rim_loader-1.class#57 ); // address: 0
	{
	jumpspecial writeFixups( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57 )
	}


public final writeOffset( net.rim.tools.compiler.codfile.RoutineLocal, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual_lib .routine_37187 // pc=1
	ifne Label7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	if_acmpeq Label15
Label7:
	aload_0 
	aload_1 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.Routine.addFixup // pc=3
	pop 
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label15:
	aload_0 
	aload_1 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.Routine.writeOffset // pc=3
	return 
	}


public final module:net_rim_loader-1.class#31 getCode( net.rim.tools.compiler.codfile.RoutineLocal ); // address: 0
	{
	areturn_field .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	}


public final setAttributes( net.rim.tools.compiler.codfile.RoutineLocal, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iload_1 
	ior 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	return 
	}


public final setNumLocals( net.rim.tools.compiler.codfile.RoutineLocal, int ); // address: 0
	{
	putfield_return .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	}


public final setNumStack( net.rim.tools.compiler.codfile.RoutineLocal, int ); // address: 0
	{
	putfield_return .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	}


public final int getNumStackMaps( net.rim.tools.compiler.codfile.RoutineLocal ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokenonvirtual_lib .routine_22103 // pc=1
	ireturn 
	}


public final allocateStackMaps( net.rim.tools.compiler.codfile.RoutineLocal, int ); // address: 0
	{
	enter 
	iload_1 
	ifle Label11
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnonnull Label11
	aload_0 
	new_lib net.rim.tools.compiler.codfile.CodfileArray//module:net_rim_loader-1.class#33 module:net_rim_loader-1.class#33 module:net_rim_loader-1.class#33
	dup 
	iload_1 
	invokespecial_lib .routine_22327 // pc=2
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
Label11:
	return 
	}


public final addStackMap( net.rim.tools.compiler.codfile.RoutineLocal, net.rim.tools.compiler.codfile.StackMap ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_1 
	invokenonvirtual_lib .routine_22134 // pc=2
	return 
	}


public final int getNumExceptionHandlers( net.rim.tools.compiler.codfile.RoutineLocal ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokenonvirtual_lib .routine_22103 // pc=1
	ireturn 
	}


public final allocateExceptionHandlers( net.rim.tools.compiler.codfile.RoutineLocal, int ); // address: 0
	{
	enter 
	iload_1 
	ifle Label14
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifnonnull Label14
	aload_0 
	bipush 64
	invokenonvirtual net.rim.tools.compiler.codfile.RoutineLocal.setAttributes // pc=2
	aload_0 
	new_lib net.rim.tools.compiler.codfile.CodfileArray//module:net_rim_loader-1.class#33 module:net_rim_loader-1.class#33 module:net_rim_loader-1.class#33
	dup 
	iload_1 
	invokespecial_lib .routine_22327 // pc=2
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
Label14:
	return 
	}


public final addExceptionHandler( net.rim.tools.compiler.codfile.RoutineLocal, module:net_rim_loader-1.class#59 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_1 
	invokenonvirtual_lib .routine_22134 // pc=2
	return 
	}

}
