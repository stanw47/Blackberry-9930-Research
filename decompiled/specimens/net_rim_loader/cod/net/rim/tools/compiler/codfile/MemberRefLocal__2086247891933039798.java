// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 79
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class MemberRefLocal extends net.rim.tools.compiler.codfile.MemberRef

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.MemberRefLocal, net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Member ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_2 
	invokevirtual net.rim.tools.compiler.codfile.Identifier getName( net.rim.tools.compiler.codfile.Member ) // pc=1
	aload_2 
	invokevirtual module:net_rim_loader-2.class#51 getTypeList( net.rim.tools.compiler.codfile.Member ) // pc=1
	invokespecial_lib .routine_37447 // pc=5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.MemberRefLocal, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokevirtual writeRelativeOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual writeOrdinal( net.rim.tools.compiler.codfile.CodfileItem, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}

}
