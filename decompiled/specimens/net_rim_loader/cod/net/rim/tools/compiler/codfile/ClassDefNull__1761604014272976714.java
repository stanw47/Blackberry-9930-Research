// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 25
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class ClassDefNull extends net.rim.tools.compiler.codfile.ClassDef

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.Identifier, net.rim.tools.compiler.codfile.Identifier ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	bipush -1
	invokespecial net.rim.tools.compiler.codfile.ClassDef.<init> // pc=3
	aload_0 
	aload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload_3 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_335:"cannot write null classDef"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeModuleOrdinal( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeOrdinal( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefNull.writeAbsoluteOrdinal // pc=2
	return 
	}


public final writeRelativeOrdinal( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeAbsoluteOrdinal( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefNull.writeModuleOrdinal // pc=2
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefNull.writeAbsoluteOrdinal // pc=2
	return 
	}


public final net.rim.tools.compiler.codfile.FieldDef createFieldDef( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	enter 
	new FieldDefForeign
	dup 
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.codfile.FieldDefForeign.<init> // pc=5
	areturn 
	}


public final net.rim.tools.compiler.codfile.FieldDef makeFieldDef( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.codfile.DataSection, java.lang.String, boolean, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getDataBytes // pc=1
	astore_6 
	aload_0 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getNullIdentifier // pc=1
	aload_4 
	iload_5 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefNull.createFieldDef // pc=4
	checkcast FieldDefForeign
	astore_7 
	aload_7 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.FieldDefForeign.setActualName // pc=2
	aload_7 
	areturn 
	}


public final net.rim.tools.compiler.codfile.ClassRef getClassRef( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnonnull Label7
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getNullClassRef // pc=1
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
Label7:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	areturn 
	}


public final net.rim.tools.compiler.codfile.Routine createRoutine( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, module:net_rim_loader-2.class#51 ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.codfile.RoutineForeign//module:net_rim_loader-2.class#39 module:net_rim_loader-2.class#39 module:net_rim_loader-2.class#39
	dup 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial_lib .routine_21837 // pc=5
	areturn 
	}


public final net.rim.tools.compiler.codfile.Routine makeRoutine( net.rim.tools.compiler.codfile.ClassDefNull, net.rim.tools.compiler.codfile.DataSection, java.lang.String, boolean, module:net_rim_loader-2.class#51, module:net_rim_loader-2.class#51 ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getDataBytes // pc=1
	astore_6 
	aload_0 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getNullIdentifier // pc=1
	aload_4 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefNull.createRoutine // pc=4
	checkcast_lib net.rim.tools.compiler.codfile.RoutineForeign//module:net_rim_loader-2.class#39 module:net_rim_loader-2.class#39 module:net_rim_loader-2.class#39
	astore_7 
	aload_7 
	aload_2 
	invokenonvirtual_lib .routine_21681 // pc=2
	aload_7 
	areturn 
	}

}
