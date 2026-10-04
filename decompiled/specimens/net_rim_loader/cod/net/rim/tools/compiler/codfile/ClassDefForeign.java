// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 23
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class ClassDefForeign extends net.rim.tools.compiler.codfile.ClassDef

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.CodfileOffset /*net.rim.tools.compiler.codfile.CodfileOffset*/  _fixupRef ; // ofs = 17498 addr = 0)
	private net.rim.tools.compiler.codfile.FixupTableEntry /*net.rim.tools.compiler.codfile.FixupTableEntry*/  _codeFixups ; // ofs = 17502 addr = 0)
	private String /*java.lang.String*/  _actualPackageName ; // ofs = 17506 addr = 0)
	private String /*java.lang.String*/  _actualClassName ; // ofs = 17510 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.codfile.DataSection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	bipush -1
	invokespecial net.rim.tools.compiler.codfile.ClassDef.<init> // pc=3
	aload_0 
	aload_2 
	aload_3 
	invokespecial net.rim.tools.compiler.codfile.ClassDefForeign.setActualName // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final setActualName( net.rim.tools.compiler.codfile.ClassDefForeign, java.lang.String, java.lang.String ); // address: 0
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
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0 
	aload_2 
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String getPackageNameString( net.rim.tools.compiler.codfile.ClassDefForeign ); // address: 0
	{
	areturn_field .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	}


public final java.lang.String getClassNameString( net.rim.tools.compiler.codfile.ClassDefForeign ); // address: 0
	{
	areturn_field .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	}


public final makeSymbolic( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefForeign.getClassRef // pc=2
	pop 
	return 
	}


protected final net.rim.tools.compiler.codfile.CodfileOffset getFixupRef( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnonnull Label11
	aload_0 
	new CodfileOffset
	dup 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefForeign.getClassRef // pc=2
	invokespecial net.rim.tools.compiler.codfile.CodfileOffset.<init> // pc=2
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
Label11:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	areturn 
	}


public final write( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_334:"unable to write foreign class def"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeOrdinal( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefForeign.writeAbsoluteOrdinal // pc=2
	return 
	}


public final writeRelativeOrdinal( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_333:"cannot write ordinal for non-local class"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeAbsoluteOrdinal( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	astore_2 
	aload_2 
	ifnull Label29
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	istore_3 
	aload_1 
	invokevirtual boolean writingCode( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	ifeq Label29
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnonnull Label26
	aload_0 
	new FixupTableEntry
	dup 
	bipush 2
	invokespecial net.rim.tools.compiler.codfile.FixupTableEntry.<init> // pc=2
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	aload_2 
	checkcast DataSection
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefForeign.getFixupRef // pc=2
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setRef // pc=2
Label26:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.addFixup // pc=2
Label29:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDef.writeModuleOrdinal // pc=2
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label4
	goto_w Label67
Label4:
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	istore_2 
	aload_1 
	invokevirtual boolean writingCode( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	ifeq Label16
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label16
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDef.writeModuleOrdinal // pc=2
	goto Label20
Label16:
	aload_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int getOrdinal( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label20:
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	astore_3 
	aload_3 
	ifnull Label54
	aload_0 
	aload_3 
	checkcast DataSection
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefForeign.getClassRef // pc=2
	pop 
	aload_1 
	invokevirtual boolean writingCode( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	ifeq Label50
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnonnull Label47
	aload_0 
	new FixupTableEntry
	dup 
	bipush 2
	invokespecial net.rim.tools.compiler.codfile.FixupTableEntry.<init> // pc=2
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	aload_3 
	checkcast DataSection
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefForeign.getFixupRef // pc=2
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setRef // pc=2
Label47:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.addFixup // pc=2
Label50:
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
Label54:
	aload_1 
	invokevirtual boolean writingCode( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	ifeq Label63
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label63
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
Label63:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOrdinal // pc=2
	return 
Label67:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefForeign.writeAbsoluteOrdinal // pc=2
	return 
	}


public final writeFixups( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label6
	aload_1 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.addClassDefCodeFixup // pc=2
Label6:
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.ClassDef.writeFixups // pc=2
	return 
	}


public final net.rim.tools.compiler.codfile.ClassRef getClassRef( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getDataBytes // pc=1
	astore_2 
	aload_0 
	aload_2 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDef.setPackageName // pc=2
	aload_0 
	aload_2 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDef.setClassName // pc=2
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.ClassDef.getClassRef // pc=2
	areturn 
	}


public final net.rim.tools.compiler.codfile.FieldDef createFieldDef( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, boolean ); // address: 0
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


public final net.rim.tools.compiler.codfile.FieldDef makeFieldDef( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.codfile.DataSection, java.lang.String, boolean, module:net_rim_loader-2.class#51, boolean ); // address: 0
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
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefForeign.createFieldDef // pc=4
	checkcast FieldDefForeign
	astore_7 
	aload_7 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.FieldDefForeign.setActualName // pc=2
	aload_0 
	aload_7 
	iload_5 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDef.addFieldDef // pc=3
	aload_7 
	areturn 
	}


public final net.rim.tools.compiler.codfile.Routine createRoutine( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, module:net_rim_loader-2.class#51 ); // address: 0
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


public final net.rim.tools.compiler.codfile.Routine makeRoutine( net.rim.tools.compiler.codfile.ClassDefForeign, net.rim.tools.compiler.codfile.DataSection, java.lang.String, boolean, module:net_rim_loader-2.class#51, module:net_rim_loader-2.class#51 ); // address: 0
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
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefForeign.createRoutine // pc=4
	checkcast_lib net.rim.tools.compiler.codfile.RoutineForeign//module:net_rim_loader-2.class#39 module:net_rim_loader-2.class#39 module:net_rim_loader-2.class#39
	astore_7 
	aload_7 
	aload_2 
	invokenonvirtual_lib .routine_21681 // pc=2
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


public final int compareTo( net.rim.tools.compiler.codfile.ClassDefForeign, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast ClassDef
	astore_2 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_2 
	invokevirtual java.lang.String getClassNameString( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	invokenonvirtual_lib java.lang.String.compareTo // pc=2
	istore_3 
	iload_3 
	ifeq Label13
	iload_3 
	ireturn 
Label13:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_2 
	invokevirtual java.lang.String getPackageNameString( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	invokenonvirtual_lib java.lang.String.compareTo // pc=2
	ireturn 
	}


public final boolean equals( net.rim.tools.compiler.codfile.ClassDefForeign, java.lang.Object ); // address: 0
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
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_2 
	getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label21
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_2 
	getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
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


public final int hashCode( net.rim.tools.compiler.codfile.ClassDefForeign ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokevirtual_short .virtual_ // idx=0 pc=1
	bipush 31
	imul 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	ireturn 
	}

}
