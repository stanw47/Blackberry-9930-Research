// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 61
// ########################################################


package net.rim.tools.compiler.codfile;


public class FieldDef extends net.rim.tools.compiler.codfile.Member

{

	// @@@@@@@@@@@@@ Fields 
	protected boolean /*boolean*/  _isStatic ; // ofs = 20622 addr = 0)
	protected net.rim.tools.compiler.codfile.FixupTableEntry /*net.rim.tools.compiler.codfile.FixupTableEntry*/  _fixups ; // ofs = 20626 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _specificFixups ; // ofs = 20630 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial_lib .routine_37242 // pc=4
	aload_0 
	iload_4 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aconst_null 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public makeSymbolic( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	noenter_return 
	}


protected net.rim.tools.compiler.codfile.MemberRef getFixupRef( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.codfile.MemberRef//net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef
	dup 
	aload_2 
	aload_2 
	aload_1 
	invokevirtual net.rim.tools.compiler.codfile.ClassRef getClassRef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokespecial_lib .routine_37409 // pc=5
	astore_3 
	aload_3 
	areturn 
	}


protected net.rim.tools.compiler.codfile.FixupTableEntry addFixupList( net.rim.tools.compiler.codfile.FieldDef, java.util.Vector, net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	aconst_null 
	astore_5 
	iconst_0 
	istore_6 
Label8:
	iload_6 
	iload_4 
	if_icmpge Label29
	aload_1 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast FixupTableEntry
	astore_7 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.getRef // pc=1
	checkcast_lib net.rim.tools.compiler.codfile.MemberRef//net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef
	astore 8
	aload 8
	invokevirtual net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.codfile.MemberRef ) // pc=1
	aload_3 
	if_acmpne Label27
	aload_7 
	astore_5 
	goto Label29
Label27:
	iinc 6 1
	goto Label8
Label29:
	aload_5 
	ifnonnull Label50
	aload_0 
	aload_2 
	invokevirtual makeSymbolic( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	new FixupTableEntry
	dup 
	bipush 2
	invokespecial net.rim.tools.compiler.codfile.FixupTableEntry.<init> // pc=2
	astore_5 
	aload_0 
	aload_2 
	aload_3 
	invokevirtual net.rim.tools.compiler.codfile.MemberRef getFixupRef( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.ClassDef ) // pc=3
	astore_6 
	aload_5 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setRef // pc=2
	aload_1 
	aload_5 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label50:
	aload_5 
	areturn 
	}


protected int addFixup( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	astore_3 
	bipush -1
	istore_4 
	aload_3 
	ifnull Label29
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label15
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
Label15:
	aload_0 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	checkcast DataSection
	aload_2 
	invokevirtual net.rim.tools.compiler.codfile.FixupTableEntry addFixupList( net.rim.tools.compiler.codfile.FieldDef, java.util.Vector, net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.ClassDef ) // pc=4
	astore_5 
	aload_5 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.addFixup // pc=2
	aload_5 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.getOrdinal // pc=1
	istore_4 
Label29:
	iload_4 
	ireturn 
	}


public writeStaticOffset( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifne Label13
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
Label13:
	aload_2 
	aload_1 
	invokevirtual writeOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload_1 
	invokevirtual routine
	return 
	}


public writeStaticOffsetLib( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifne Label10
	aload_1 
	bipush -1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	bipush -1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
Label10:
	aload_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_acmpne Label25
	iload_3 
	ifne Label25
	aload_0 
	invokevirtual routine
	ifne Label25
	aload_2 
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload_1 
	invokevirtual routine
	return 
Label25:
	aload_0 
	aload_1 
	aload_2 
	invokevirtual int addFixup( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ) // pc=3
	istore_4 
	aload_1 
	bipush -1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	iload_4 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public writeMemberAddress( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifne Label8
	iload_3 
	ifne Label8
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush -1
	if_icmpne Label19
Label8:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifne Label15
	aload_0 
	aload_1 
	aload_2 
	invokevirtual int addFixup( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ) // pc=3
	pop 
Label15:
	aload_1 
	bipush -1
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
Label19:
	aload_0 
	aload_1 
	invokevirtual routine
	return 
	}


public writeFixups( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label13
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifeq Label10
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.addStaticFieldFixup // pc=3
	goto Label13
Label10:
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.addFieldFixup // pc=2
Label13:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label40
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label20:
	iload_3 
	iload_2 
	if_icmpge Label40
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast FixupTableEntry
	astore_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifeq Label35
	aload_1 
	aload_4 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.addStaticFieldFixup // pc=3
	goto Label38
Label35:
	aload_1 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.addFieldFixup // pc=2
Label38:
	iinc 3 1
	goto Label20
Label40:
	return 
	}

}
