// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 0
// ########################################################


package net.rim.tools.compiler.types;


abstract public final class ArrayType extends net.rim.tools.compiler.types.ReferenceType

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _nesting ; // ofs = 9454 addr = 0)
	private net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type*/  _baseType ; // ofs = 9458 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.ArrayType, net.rim.tools.compiler.types.Type, int ); // address: 0
	{
	enter 
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	ldc literal_462:"[]"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.types.ReferenceType.<init> // pc=2
	aload_0 
	iload_2 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	sipush 255
	if_icmple Label25
	new CompileException
	dup 
	ldc literal_464:"Error!: Array nesting is too deep"
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=2
	athrow 
Label25:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.tools.compiler.types.ArrayType getArrayType( net.rim.tools.compiler.types.ArrayType ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label12
	aload_0 
	new ArrayType
	dup 
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	iadd 
	invokespecial net.rim.tools.compiler.types.ArrayType.<init> // pc=3
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label12:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	areturn 
	}


public final java.lang.String getFullName( net.rim.tools.compiler.types.ArrayType ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getMostBaseType // pc=1
	astore_1 
	aload_1 
	instanceof BaseType
	ifeq Label9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	areturn 
Label9:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	aload_1 
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.types.Type ) // pc=1
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_2 
	iconst_0 
	istore_3 
Label17:
	iload_3 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	if_icmpge Label26
	aload_2 
	ldc literal_462:"[]"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iinc 3 1
	goto Label17
Label26:
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


public final int getTypeId( net.rim.tools.compiler.types.ArrayType ); // address: 0
	{
	ireturn_bipush 8
	}


public final int getNesting( net.rim.tools.compiler.types.ArrayType ); // address: 0
	{
	ireturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final net.rim.tools.compiler.types.Type getBaseType( net.rim.tools.compiler.types.ArrayType ); // address: 0
	{
	areturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public final net.rim.tools.compiler.types.Type getMostBaseType( net.rim.tools.compiler.types.ArrayType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	astore_1 
Label3:
	aload_1 
	checkcastbranch 
	astore_2 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getBaseType // pc=1
	astore_1 
	goto Label3
Label10:
	aload_1 
	areturn 
	}


public final net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.types.ArrayType, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter_narrow 
	new CompileException
	dup 
	ldc literal_463:"cannot get class def for array type"
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=2
	athrow 
	}


final net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.ArrayType, net.rim.tools.compiler.types.TypeModule ); // address: 0
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
	ifnonnull Label38
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getMostBaseType // pc=1
	astore_4 
	aload_4 
	checkcastbranch 
	astore_5 
	new TypeItem
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	aload_1 
	invokevirtual net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.types.ReferenceType, net.rim.tools.compiler.types.TypeModule ) // pc=2
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=3
	astore_3 
	goto Label34
Label27:
	new TypeItem
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=3
	astore_3 
Label34:
	aload_0 
	aload_3 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.setTypeItem // pc=3
Label38:
	aload_3 
	areturn 
	}

}
