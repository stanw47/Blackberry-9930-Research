// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 43
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class StackMap extends net.rim.tools.compiler.codfile.CodfileItemRelative

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.CodfileLabel /*module:net_rim_loader-1.class#37*/  _label ; // ofs = 12618 addr = 0)
	private net.rim.tools.compiler.codfile.TypeList /*net.rim.tools.compiler.codfile.TypeList*/  _typeList ; // ofs = 12622 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.StackMap, module:net_rim_loader-1.class#37, module:net_rim_loader-1.class#57, net.rim.tools.compiler.codfile.TypeList ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_23131 // pc=1
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokenonvirtual_lib .routine_28017 // pc=1
	aload_3 
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeLists.getTypeList // pc=4
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


static public final int getSize(  ); // address: 0
	{
	enter_narrow 
	bipush 4
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final writeRelative( net.rim.tools.compiler.codfile.StackMap, net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_5 // idx=5 pc=1
	iload_2 
	iadd 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
	return 
	}

}
