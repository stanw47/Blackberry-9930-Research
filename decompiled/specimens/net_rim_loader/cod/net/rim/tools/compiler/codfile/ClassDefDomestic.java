// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 22
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class ClassDefDomestic extends net.rim.tools.compiler.codfile.ClassDef

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.ClassDefLocal /*net.rim.tools.compiler.codfile.ClassDefLocal*/  _sibling ; // ofs = 17402 addr = 0)
	private String /*java.lang.String*/  _actualPackageName ; // ofs = 17406 addr = 0)
	private String /*java.lang.String*/  _actualClassName ; // ofs = 17410 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.codfile.DataSection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	bipush -1
	invokespecial net.rim.tools.compiler.codfile.ClassDef.<init> // pc=3
	aload_0 
	aload_2 
	aload_3 
	invokespecial net.rim.tools.compiler.codfile.ClassDefDomestic.setActualName // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final setActualName( net.rim.tools.compiler.codfile.ClassDefDomestic, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	ifnonnull Label6
	ldc_nullstr 
	goto Label7
Label6:
	aload_1 
Label7:
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	aload_2 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String getPackageNameString( net.rim.tools.compiler.codfile.ClassDefDomestic ); // address: 0
	{
	areturn_field .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	}


public final java.lang.String getClassNameString( net.rim.tools.compiler.codfile.ClassDefDomestic ); // address: 0
	{
	areturn_field .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	}


public final setSibling( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.codfile.ClassDefLocal ); // address: 0
	{
	putfield_return .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	}


public final int getOrdinal( net.rim.tools.compiler.codfile.ClassDefDomestic ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label7
	aload_0 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.getOrdinal // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label7:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ireturn 
	}


public final write( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_332:"unable to write domestic class def"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeOrdinal( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefDomestic.writeAbsoluteOrdinal // pc=2
	return 
	}


public final writeRelativeOrdinal( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_333:"cannot write ordinal for non-local class"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeAbsoluteOrdinal( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label7
	aload_0 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.getOrdinal // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label7:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDef.writeModuleOrdinal // pc=2
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label17
	aload_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int getOrdinal( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label13
	aload_0 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.getOrdinal // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label13:
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
Label17:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefDomestic.writeAbsoluteOrdinal // pc=2
	return 
	}


public final net.rim.tools.compiler.codfile.ClassRef getClassRef( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getDataBytes // pc=1
	astore_2 
	aload_0 
	aload_2 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDef.setPackageName // pc=2
	aload_0 
	aload_2 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDef.setClassName // pc=2
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.ClassDef.getClassRef // pc=2
	areturn 
	}


public final net.rim.tools.compiler.codfile.FieldDef createFieldDef( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	enter 
	new FieldDefDomestic
	dup 
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.codfile.FieldDefDomestic.<init> // pc=5
	areturn 
	}


public final net.rim.tools.compiler.codfile.FieldDef makeFieldDef( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.codfile.DataSection, java.lang.String, boolean, module:net_rim_loader-2.class#51, boolean ); // address: 0
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
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefDomestic.createFieldDef // pc=4
	checkcast FieldDefDomestic
	astore_7 
	aload_7 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.FieldDefDomestic.setActualName // pc=2
	aload_0 
	aload_7 
	iload_5 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDef.addFieldDef // pc=3
	aload_7 
	areturn 
	}


public final net.rim.tools.compiler.codfile.Routine createRoutine( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, module:net_rim_loader-2.class#51 ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.codfile.RoutineDomestic//module:net_rim_loader-2.class#38 module:net_rim_loader-2.class#38 module:net_rim_loader-2.class#38
	dup 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial_lib .routine_21627 // pc=5
	areturn 
	}


public final net.rim.tools.compiler.codfile.Routine makeRoutine( net.rim.tools.compiler.codfile.ClassDefDomestic, net.rim.tools.compiler.codfile.DataSection, java.lang.String, boolean, module:net_rim_loader-2.class#51, module:net_rim_loader-2.class#51 ); // address: 0
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
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefDomestic.createRoutine // pc=4
	checkcast_lib net.rim.tools.compiler.codfile.RoutineDomestic//module:net_rim_loader-2.class#38 module:net_rim_loader-2.class#38 module:net_rim_loader-2.class#38
	astore_7 
	aload_7 
	aload_2 
	invokenonvirtual_lib .routine_21344 // pc=2
	aload_7 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int getNumRoutines( net.rim.tools.compiler.codfile.Module ) // pc=1
	iipush 65536
	iadd 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_7 
	invokevirtual addRoutine( net.rim.tools.compiler.codfile.Module, net.rim.tools.compiler.codfile.Routine ) // pc=2
	aload_7 
	areturn 
	}


public final int compareTo( net.rim.tools.compiler.codfile.ClassDefDomestic, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast ClassDef
	astore_2 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_2 
	invokevirtual java.lang.String getClassNameString( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	invokenonvirtual_lib java.lang.String.compareTo // pc=2
	istore_3 
	iload_3 
	ifeq Label13
	iload_3 
	ireturn 
Label13:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_2 
	invokevirtual java.lang.String getPackageNameString( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	invokenonvirtual_lib java.lang.String.compareTo // pc=2
	ireturn 
	}


public final boolean equals( net.rim.tools.compiler.codfile.ClassDefDomestic, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcastbranch 
	astore_2 
	aload_0 
	aload_2 
	if_acmpne Label9
	iconst_1 
	ireturn 
Label9:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_2 
	getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label21
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_2 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label21
	iconst_1 
	ireturn 
Label21:
	iconst_0 
	ireturn 
Label23:
	iconst_0 
	ireturn 
	}


public final int hashCode( net.rim.tools.compiler.codfile.ClassDefDomestic ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokevirtual_short .virtual_ // idx=0 pc=1
	bipush 31
	imul 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	ireturn 
	}

}
