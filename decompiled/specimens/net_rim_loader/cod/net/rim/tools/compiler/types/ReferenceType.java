// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 36
// ########################################################


package net.rim.tools.compiler.types;


public class ReferenceType extends net.rim.tools.compiler.types.Type

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.ReferenceType, java.lang.String ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.types.Type, java.lang.String )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getSize( net.rim.tools.compiler.types.ReferenceType ); // address: 0
	{
	ireturn_bipush 4
	}


public setTypeModule( net.rim.tools.compiler.types.ReferenceType, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	putfield_return .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final net.rim.tools.compiler.types.TypeModule getTypeModule( net.rim.tools.compiler.types.ReferenceType ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


final net.rim.tools.compiler.codfile.TypeItem getTypeItem( net.rim.tools.compiler.types.ReferenceType, int, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnonnull Label7
	aload_0 
	iload_2 
	newarray_object TypeItem
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label7:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	aaload 
	areturn 
	}


final setTypeItem( net.rim.tools.compiler.types.ReferenceType, net.rim.tools.compiler.codfile.TypeItem, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_2 
	aload_1 
	aastore 
	return 
	}


final net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.types.ReferenceType, int, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label7
	aload_0 
	iload_2 
	newarray_object_lib net.rim.tools.compiler.codfile.ClassDef//net.rim.tools.compiler.codfile.ClassDef net.rim.tools.compiler.codfile.ClassDef net.rim.tools.compiler.codfile.ClassDef
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label7:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	aaload 
	areturn 
	}


final setClassDef( net.rim.tools.compiler.types.ReferenceType, net.rim.tools.compiler.codfile.ClassDef, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_2 
	aload_1 
	aastore 
	return 
	}


abstract public net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.types.ReferenceType, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	halt 
	}

}
