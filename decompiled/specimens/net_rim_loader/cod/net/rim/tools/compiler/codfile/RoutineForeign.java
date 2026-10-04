// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 39
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class RoutineForeign extends net.rim.tools.compiler.codfile.Routine

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  _actualName ; // ofs = 12342 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.RoutineForeign, net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#66, net.rim.tools.compiler.codfile.TypeList, net.rim.tools.compiler.codfile.TypeList ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	aload_4 
	invokespecial net.rim.tools.compiler.codfile.Routine.<init> // pc=5
	aload_0 
	bipush -1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	bipush -1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_2 
	invokenonvirtual_lib .routine_31586 // pc=1
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final makeSymbolic( net.rim.tools.compiler.codfile.RoutineForeign, module:net_rim_loader-1.class#57, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokenonvirtual net.rim.tools.compiler.codfile.Routine.makeSymbolic // pc=4
	return 
	}


public final setActualName( net.rim.tools.compiler.codfile.RoutineForeign, java.lang.String ); // address: 0
	{
	putfield_return .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	}


public final write( net.rim.tools.compiler.codfile.RoutineForeign, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_541:"unable to write foreign routine"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeOffset( net.rim.tools.compiler.codfile.RoutineForeign, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	bipush -1
	istore_3 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	instanceof_lib net.rim.tools.compiler.codfile.ClassDefNull//module:net_rim_loader-1.class#25 module:net_rim_loader-1.class#25 module:net_rim_loader-1.class#25
	ifne Label11
	aload_0 
	aload_1 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.Routine.addFixup // pc=3
	istore_3 
Label11:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual writeModuleOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	iload_3 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeStaticOffset( net.rim.tools.compiler.codfile.RoutineForeign, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.crypto.Digest//net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest net.rim.device.api.crypto.Digest
	dup 
	ldc literal_542:"local static ref of foreign routine"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeStaticOffsetLib( net.rim.tools.compiler.codfile.RoutineForeign, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	bipush -1
	istore_4 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	instanceof_lib net.rim.tools.compiler.codfile.ClassDefNull//module:net_rim_loader-1.class#25 module:net_rim_loader-1.class#25 module:net_rim_loader-1.class#25
	ifne Label11
	aload_0 
	aload_1 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.Routine.addStaticFixup // pc=3
	istore_4 
Label11:
	aload_1 
	bipush -1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	iload_4 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}

}
