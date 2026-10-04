// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 64
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class FieldDefLocal extends net.rim.tools.compiler.codfile.FieldDef

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _attributes ; // ofs = 20814 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.FieldDefLocal, net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, boolean )
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final int addFixup( net.rim.tools.compiler.codfile.FieldDefLocal, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	bipush -1
	istore_3 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifeq Label12
	aload_0 
	aload_1 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.FieldDef.addFixup // pc=3
	istore_3 
	iload_3 
	ireturn 
Label12:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	sipush 255
	if_icmpgt Label18
	aload_0 
	invokenonvirtual_lib .routine_37187 // pc=1
	ifeq Label25
Label18:
	aload_0 
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial net.rim.tools.compiler.codfile.FieldDef.addFixup // pc=3
	istore_3 
	iload_3 
	ireturn 
Label25:
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	astore_4 
	aload_4 
	ifnull Label52
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label45
	aload_0 
	new FixupTableEntry
	dup 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.FixupTableEntry.<init> // pc=2
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	new MemberRefLocal
	dup 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.MemberRefLocal.<init> // pc=3
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setRef // pc=2
Label45:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.addFixup // pc=2
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.getOrdinal // pc=1
	istore_3 
Label52:
	iload_3 
	ireturn 
	}


public final write( net.rim.tools.compiler.codfile.FieldDefLocal, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifeq Label15
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeAddress // pc=2
Label15:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}


public final writeAttributes( net.rim.tools.compiler.codfile.FieldDefLocal, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	istore_2 
	aload_1 
	iload_2 
	sipush 255
	iand 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeFixups( net.rim.tools.compiler.codfile.FieldDefLocal, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifeq Label7
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.FieldDef.writeFixups // pc=2
	return 
Label7:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label22
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	sipush 255
	if_icmpgt Label15
	aload_0 
	invokenonvirtual_lib .routine_37187 // pc=1
	ifeq Label19
Label15:
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.FieldDef.writeFixups // pc=2
	return 
Label19:
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.addFieldLocalFixup // pc=2
Label22:
	return 
	}


public final setAttributes( net.rim.tools.compiler.codfile.FieldDefLocal, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_1 
	ior 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	return 
	}

}
