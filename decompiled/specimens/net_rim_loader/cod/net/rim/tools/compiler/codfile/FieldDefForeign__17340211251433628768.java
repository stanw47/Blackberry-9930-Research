// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 63
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class FieldDefForeign extends net.rim.tools.compiler.codfile.FieldDef

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  _actualName ; // ofs = 20756 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.FieldDefForeign, net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	iload_4 
	invokespecial net.rim.tools.compiler.codfile.FieldDef.<init> // pc=5
	aload_0 
	bipush -1
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setAddress // pc=2
	aload_0 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.Identifier.getString // pc=1
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final makeSymbolic( net.rim.tools.compiler.codfile.FieldDefForeign, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getDataBytes // pc=1
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
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


public final setActualName( net.rim.tools.compiler.codfile.FieldDefForeign, java.lang.String ); // address: 0
	{
	putfield_return .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	}


public final write( net.rim.tools.compiler.codfile.FieldDefForeign, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_364:"cannot write non-local member fields"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeStaticOffset( net.rim.tools.compiler.codfile.FieldDefForeign, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_366:"local static ref of foriegn field"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final writeStaticOffsetLib( net.rim.tools.compiler.codfile.FieldDefForeign, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.FieldDef.writeStaticOffsetLib // pc=4
	return 
	}

}
