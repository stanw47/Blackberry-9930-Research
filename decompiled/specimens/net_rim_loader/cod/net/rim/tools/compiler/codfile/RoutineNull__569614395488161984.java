// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 41
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class RoutineNull extends net.rim.tools.compiler.codfile.Routine

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.RoutineNull, net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#57 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	bipush -1
	invokespecial net.rim.tools.compiler.codfile.Routine.<init> // pc=3
	aload_0 
	aload_2 
	invokenonvirtual_lib .routine_28006 // pc=1
	invokenonvirtual_lib .routine_26724 // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_2 
	invokenonvirtual_lib .routine_28017 // pc=1
	invokenonvirtual net.rim.tools.compiler.codfile.TypeLists.getNullTypeList // pc=1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.RoutineNull, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	istore_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	checkcast_lib net.rim.tools.compiler.codfile.ClassDefLocal//module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24
	astore_3 
	aload_3 
	iload_2 
	invokenonvirtual_lib .routine_12412 // pc=2
	aload_3 
	iload_2 
	invokenonvirtual_lib .routine_12432 // pc=2
	return 
	}


public final writeStaticOffset( net.rim.tools.compiler.codfile.RoutineNull, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_2 
	aload_1 
	invokevirtual writeOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib .routine_22798 // pc=2
	return 
	}


public final writeStaticOffsetLib( net.rim.tools.compiler.codfile.RoutineNull, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_2 
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib .routine_22798 // pc=2
	return 
	}


public final writeOffset( net.rim.tools.compiler.codfile.RoutineNull, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual net.rim.tools.compiler.codfile.Module getModule( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	invokevirtual int getOrdinal( module:net_rim_loader-1.class#35 ) // pc=1
	ifeq Label8
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label8:
	aload_1 
	bipush -1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeOrdinal( net.rim.tools.compiler.codfile.RoutineNull, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_1 
	bipush -1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}

}
