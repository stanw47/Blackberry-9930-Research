// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 5
// ########################################################


package net.rim.tools.compiler.types;


abstract public final class ClassUninitializedType extends net.rim.tools.compiler.types.ReferenceType

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.types.ClassType /*net.rim.tools.compiler.types.ClassType*/  _classType ; // ofs = 9990 addr = 0)
	private int /*int*/  _offset ; // ofs = 9994 addr = 0)
	private boolean /*boolean*/  _preverified ; // ofs = 9998 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.ClassUninitializedType, net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter 
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_489:"<"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Type.getName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_490:">"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.types.ReferenceType.<init> // pc=2
	aload_0 
	aload_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	iconst_0 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


public <init>( net.rim.tools.compiler.types.ClassUninitializedType, net.rim.tools.compiler.types.ClassType, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_489:"<"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Type.getName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_490:">"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.types.ReferenceType.<init> // pc=2
	aload_0 
	aload_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	iload_3 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getTypeId( net.rim.tools.compiler.types.ClassUninitializedType ); // address: 0
	{
	ireturn_bipush 9
	}


public final net.rim.tools.compiler.types.ClassType getClassType( net.rim.tools.compiler.types.ClassUninitializedType ); // address: 0
	{
	areturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final int getOffset( net.rim.tools.compiler.types.ClassUninitializedType ); // address: 0
	{
	ireturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public final fixupOffset( net.rim.tools.compiler.types.ClassUninitializedType, int, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifeq Label12
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	if_icmpne Label12
	aload_0 
	iload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	iconst_0 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label12:
	return 
	}


public final boolean isPreverified( net.rim.tools.compiler.types.ClassUninitializedType ); // address: 0
	{
	ireturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public final boolean equals( net.rim.tools.compiler.types.ClassUninitializedType, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	if_acmpne Label6
	iconst_1 
	ireturn 
Label6:
	aload_1 
	checkcastbranch 
	astore_2 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_2 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	if_icmpeq Label15
	iconst_0 
	ireturn 
Label15:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label22
	iconst_0 
	ireturn 
Label22:
	iconst_1 
	ireturn 
Label24:
	iconst_0 
	ireturn 
	}


public final int hashCode( net.rim.tools.compiler.types.ClassUninitializedType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 31
	imul 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	ireturn 
	}


public final net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.types.ClassUninitializedType, net.rim.tools.compiler.types.TypeModule ); // address: 0
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
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getClassDef // pc=2
	astore_3 
	aload_0 
	aload_3 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.setClassDef // pc=3
Label20:
	aload_3 
	areturn 
	}


final net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.ClassUninitializedType, net.rim.tools.compiler.types.TypeModule ); // address: 0
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
	ifnonnull Label24
	new TypeItem
	dup 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassUninitializedType.getClassDef // pc=2
	bipush 9
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=3
	astore_3 
	aload_0 
	aload_3 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.setTypeItem // pc=3
Label24:
	aload_3 
	areturn 
	}


final net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.ClassUninitializedType, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getOrdinal // pc=1
	istore_2 
	aload_0 
	iload_2 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getCount // pc=1
	invokenonvirtual net.rim.tools.compiler.types.Type.getTypeList // pc=3
	astore_3 
	aload_3 
	ifnonnull Label32
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDefined // pc=1
	ifne Label21
	new TypeList
	dup 
	bipush -1
	invokespecial net.rim.tools.compiler.codfile.TypeList.<init> // pc=2
	astore_3 
	goto Label28
Label21:
	new TypeList
	dup 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassUninitializedType.makeTypeItem // pc=2
	invokespecial net.rim.tools.compiler.codfile.TypeList.<init> // pc=2
	astore_3 
Label28:
	aload_0 
	aload_3 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.types.Type.setTypeList // pc=3
Label32:
	aload_3 
	areturn 
	}

}
