// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 2
// ########################################################


package net.rim.tools.compiler.types;


abstract public final class BaseType extends net.rim.tools.compiler.types.Type

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _size ; // ofs = 9558 addr = 0)
	private int /*int*/  _typeId ; // ofs = 9562 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.BaseType, java.lang.String, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.types.Type.<init> // pc=2
	aload_0 
	iload_2 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iload_3 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getSize( net.rim.tools.compiler.types.BaseType ); // address: 0
	{
	ireturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final int getTypeId( net.rim.tools.compiler.types.BaseType ); // address: 0
	{
	ireturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


final net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.BaseType, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.BaseType.getTypeId // pc=1
	invokestatic net.rim.tools.compiler.codfile.TypeItem makeTypeItem( int ) // TypeItem
	areturn 
	}

}
