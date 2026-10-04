// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 31
// ########################################################


package net.rim.tools.compiler.types;


abstract public final class NullType extends net.rim.tools.compiler.types.ReferenceType

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.NullType ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_538:"NullType"
	invokespecial net.rim.tools.compiler.types.ReferenceType.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getTypeId( net.rim.tools.compiler.types.NullType ); // address: 0
	{
	ireturn_bipush 7
	}


public final net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.types.NullType, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getOrdinal // pc=1
	istore_2 
	aload_0 
	iload_2 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getCount // pc=1
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.getClassDef // pc=3
	astore_3 
	aload_3 
	ifnonnull Label20
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getNullClassDef // pc=2
	astore_3 
	aload_0 
	aload_3 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.setClassDef // pc=3
Label20:
	aload_3 
	areturn 
	}


final net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.NullType, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getOrdinal // pc=1
	istore_2 
	aload_0 
	iload_2 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getCount // pc=1
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.getTypeItem // pc=3
	astore_3 
	aload_3 
	ifnonnull Label23
	new TypeItem
	dup 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.NullType.getClassDef // pc=2
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	astore_3 
	aload_0 
	aload_3 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.setTypeItem // pc=3
Label23:
	aload_3 
	areturn 
	}

}
