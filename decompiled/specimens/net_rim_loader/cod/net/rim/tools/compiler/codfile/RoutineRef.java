// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 42
// ########################################################


package net.rim.tools.compiler.codfile;


public class RoutineRef extends net.rim.tools.compiler.codfile.MemberRef

{

	// @@@@@@@@@@@@@ Fields 
	protected net.rim.tools.compiler.codfile.TypeList /*net.rim.tools.compiler.codfile.TypeList*/  _retList ; // ofs = 12562 addr = 0)
	private boolean /*boolean*/  _writeRet ; // ofs = 12566 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.RoutineRef, net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#26, module:net_rim_loader-1.class#66, net.rim.tools.compiler.codfile.TypeList, net.rim.tools.compiler.codfile.TypeList ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	aload_4 
	invokespecial_lib .routine_37409 // pc=5
	aload_0 
	aload_5 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	iconst_0 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public write( net.rim.tools.compiler.codfile.RoutineRef, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokevirtual routine
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifeq Label18
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	invokenonvirtual_lib .routine_22798 // pc=2
Label18:
	aload_0 
	aload_1 
	invokevirtual routine
	return 
	}


public setWriteRet( net.rim.tools.compiler.codfile.RoutineRef, module:net_rim_loader-1.class#57 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_29035 // pc=1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	return 
	}

}
