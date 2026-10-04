// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 38
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class RoutineDomestic extends net.rim.tools.compiler.codfile.Routine

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.RoutineLocal /*net.rim.tools.compiler.codfile.RoutineLocal*/  _sibling ; // ofs = 12278 addr = 0)
	private String /*java.lang.String*/  _actualName ; // ofs = 12282 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.RoutineDomestic, net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#66, net.rim.tools.compiler.codfile.TypeList, net.rim.tools.compiler.codfile.TypeList ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	aload_4 
	invokespecial net.rim.tools.compiler.codfile.Routine.<init> // pc=5
	aload_0 
	aload_2 
	invokenonvirtual_lib .routine_31586 // pc=1
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setActualName( net.rim.tools.compiler.codfile.RoutineDomestic, java.lang.String ); // address: 0
	{
	putfield_return .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	}


public final setSibling( net.rim.tools.compiler.codfile.RoutineDomestic, net.rim.tools.compiler.codfile.RoutineLocal ); // address: 0
	{
	putfield_return .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	}


public final makeSymbolic( net.rim.tools.compiler.codfile.RoutineDomestic, module:net_rim_loader-1.class#57, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokenonvirtual net.rim.tools.compiler.codfile.Routine.makeSymbolic // pc=4
	return 
	}


public final write( net.rim.tools.compiler.codfile.RoutineDomestic, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_539:"unable to write domestic routine"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeOffset( net.rim.tools.compiler.codfile.RoutineDomestic, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label7
	aload_0 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokenonvirtual_lib .routine_22910 // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label7:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual writeModuleOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeStaticOffset( net.rim.tools.compiler.codfile.RoutineDomestic, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_540:"local static ref of domestic routine"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeStaticOffsetLib( net.rim.tools.compiler.codfile.RoutineDomestic, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label7
	aload_0 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokenonvirtual_lib .routine_22910 // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label7:
	aload_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_acmpne Label19
	iload_3 
	ifne Label19
	aload_2 
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
Label19:
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


public final writeMemberAddress( net.rim.tools.compiler.codfile.RoutineDomestic, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label7
	aload_0 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokenonvirtual_lib .routine_22998 // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label7:
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.codfile.Routine.writeMemberAddress // pc=4
	return 
	}


public final int getVTableOffset( net.rim.tools.compiler.codfile.RoutineDomestic, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label7
	aload_0 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokenonvirtual_lib .routine_22998 // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label7:
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.codfile.Routine.getVTableOffset // pc=2
	ireturn 
	}

}
