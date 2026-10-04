// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 77
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class InterfaceMethodRef extends net.rim.tools.compiler.codfile.CodfileItem

{

	// @@@@@@@@@@@@@ Fields 
	protected net.rim.tools.compiler.codfile.Member /*net.rim.tools.compiler.codfile.Member*/  _member ; // ofs = 21956 addr = 0)
	protected net.rim.tools.compiler.codfile.ClassDef /*net.rim.tools.compiler.codfile.ClassDef*/  _classDef ; // ofs = 21960 addr = 0)
	protected net.rim.tools.compiler.codfile.Identifier /*net.rim.tools.compiler.codfile.Identifier*/  _name ; // ofs = 21964 addr = 0)
	protected net.rim.tools.compiler.codfile.TypeList /*module:net_rim_loader-2.class#51*/  _protoTypeList ; // ofs = 21968 addr = 0)
	protected net.rim.tools.compiler.codfile.TypeList /*module:net_rim_loader-2.class#51*/  _typeList ; // ofs = 21972 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.InterfaceMethodRef, net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.Member ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=1
	aload_0 
	aload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokevirtual net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.codfile.Member ) // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_2 
	invokevirtual net.rim.tools.compiler.codfile.Identifier getName( net.rim.tools.compiler.codfile.Member ) // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	instanceof_lib net.rim.tools.compiler.codfile.RoutineNull//module:net_rim_loader-2.class#41 module:net_rim_loader-2.class#41 module:net_rim_loader-2.class#41
	ifne Label32
	aload_2 
	checkcast_lib net.rim.tools.compiler.codfile.Routine//net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine
	astore_3 
	aload_3 
	aload_1 
	iconst_1 
	invokevirtual makeSymbolic( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.codfile.DataSection, boolean ) // pc=3
	aload_0 
	aload_3 
	invokevirtual module:net_rim_loader-2.class#51 getProtoTypeList( net.rim.tools.compiler.codfile.Routine ) // pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload_3 
	invokevirtual module:net_rim_loader-2.class#51 getTypeList( net.rim.tools.compiler.codfile.Member ) // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label32:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.InterfaceMethodRef, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}

}
