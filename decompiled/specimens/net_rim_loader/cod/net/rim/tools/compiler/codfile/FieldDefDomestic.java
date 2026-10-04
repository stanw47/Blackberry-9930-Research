// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 62
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class FieldDefDomestic extends net.rim.tools.compiler.codfile.FieldDef

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.FieldDefLocal /*net.rim.tools.compiler.codfile.FieldDefLocal*/  _sibling ; // ofs = 20694 addr = 0)
	private String /*java.lang.String*/  _actualName ; // ofs = 20698 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.FieldDefDomestic, net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	iload_4 
	invokespecial net.rim.tools.compiler.codfile.FieldDef.<init> // pc=5
	aload_0 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.Identifier.getString // pc=1
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setActualName( net.rim.tools.compiler.codfile.FieldDefDomestic, java.lang.String ); // address: 0
	{
	putfield_return .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	}


public final setSibling( net.rim.tools.compiler.codfile.FieldDefDomestic, net.rim.tools.compiler.codfile.FieldDefLocal ); // address: 0
	{
	putfield_return .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	}


public final makeSymbolic( net.rim.tools.compiler.codfile.FieldDefDomestic, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual net.rim.tools.compiler.codfile.ClassRef getClassRef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	pop 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getDataBytes // pc=1
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getTypeLists // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_29492 // pc=4
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	}


public final write( net.rim.tools.compiler.codfile.FieldDefDomestic, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_364:"cannot write non-local member fields"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeStaticOffset( net.rim.tools.compiler.codfile.FieldDefDomestic, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_365:"local static ref of domestic field"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeStaticOffsetLib( net.rim.tools.compiler.codfile.FieldDefDomestic, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label7
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.getAddress // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label7:
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.codfile.FieldDef.writeStaticOffsetLib // pc=4
	return 
	}


public final writeMemberAddress( net.rim.tools.compiler.codfile.FieldDefDomestic, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label7
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.getAddress // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label7:
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.codfile.FieldDef.writeMemberAddress // pc=4
	return 
	}

}
