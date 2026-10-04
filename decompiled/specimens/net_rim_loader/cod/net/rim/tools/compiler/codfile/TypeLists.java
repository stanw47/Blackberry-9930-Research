// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 52
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class TypeLists extends net.rim.tools.compiler.codfile.CodfileItem

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.TypeList /*net.rim.tools.compiler.codfile.TypeList*/  _markerTypeList ; // ofs = 13356 addr = 0)
	private net.rim.tools.compiler.codfile.TypeList /*net.rim.tools.compiler.codfile.TypeList*/  _nullTypeList ; // ofs = 13360 addr = 0)
	private net.rim.tools.compiler.codfile.TypeList /*net.rim.tools.compiler.codfile.TypeList*/  _emptyTypeList ; // ofs = 13364 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVectorHash /*net.rim.tools.compiler.codfile.CodfileVectorHash*/  _typeLists ; // ofs = 13368 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.TypeLists ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_23051 // pc=1
	aload_0 
	new_lib net.rim.tools.compiler.codfile.CodfileVectorHash//net.rim.tools.compiler.codfile.CodfileVectorHash net.rim.tools.compiler.codfile.CodfileVectorHash net.rim.tools.compiler.codfile.CodfileVectorHash
	dup 
	bipush 33
	invokespecial_lib .routine_24012 // pc=2
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	new TypeList
	dup 
	bipush -1
	invokespecial net.rim.tools.compiler.codfile.TypeList.<init> // pc=2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new TypeList
	dup 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.TypeList.<init> // pc=2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.TypeLists, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_22880 // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokevirtual write( module:net_rim_loader-1.class#39, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_22921 // pc=2
	return 
	}


public final net.rim.tools.compiler.codfile.TypeList getNullTypeList( net.rim.tools.compiler.codfile.TypeLists ); // address: 0
	{
	areturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final net.rim.tools.compiler.codfile.TypeList getEmptyTypeList( net.rim.tools.compiler.codfile.TypeLists ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label23
	new TypeList
	dup 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.TypeList.<init> // pc=2
	astore_1 
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokevirtual module:net_rim_loader-1.class#35 get( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object ) // pc=2
	checkcast TypeList
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label23
	aload_0 
	aload_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual put( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object, module:net_rim_loader-1.class#35 ) // pc=3
Label23:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	areturn 
	}


public final net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.codfile.TypeLists, net.rim.tools.compiler.codfile.TypeList, module:net_rim_loader-1.class#57, boolean ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_acmpne Label6
	aload_1 
	areturn 
Label6:
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	if_acmpne Label11
	aload_1 
	areturn 
Label11:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokevirtual module:net_rim_loader-1.class#35 get( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object ) // pc=2
	checkcast TypeList
	astore_4 
	aload_4 
	ifnonnull Label27
	aload_1 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.makeSymbolic // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	aload_1 
	invokevirtual put( net.rim.tools.compiler.codfile.CodfileVectorHash, java.lang.Object, module:net_rim_loader-1.class#35 ) // pc=3
	aload_1 
	astore_4 
Label27:
	aload_4 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.setCompressable // pc=2
	aload_4 
	areturn 
	}

}
