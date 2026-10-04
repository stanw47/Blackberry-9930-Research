// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 18
// ########################################################


package net.rim.tools.compiler.types;


abstract public final class Field extends net.rim.tools.compiler.types.NameAndType

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.types.Constant /*net.rim.tools.compiler.types.Constant*/  _expr ; // ofs = 10760 addr = 0)
	private boolean /*boolean*/  _eliminate ; // ofs = 10764 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.Field, java.lang.String, net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.ClassType, int, int, net.rim.tools.compiler.types.Constant ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	iload_4 
	iload_5 
	invokespecial net.rim.tools.compiler.types.NameAndType.<init> // pc=6
	aload_0 
	aload_6 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean hasValue( net.rim.tools.compiler.types.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label5
	iconst_1 
	ireturn 
Label5:
	iconst_0 
	ireturn 
	}


public final long getValue( net.rim.tools.compiler.types.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual_short .virtual_3 // idx=3 pc=1
	lreturn 
	}


public final java.lang.String getStringValue( net.rim.tools.compiler.types.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual_short .virtual_4 // idx=4 pc=1
	areturn 
	}


public final setEliminate( net.rim.tools.compiler.types.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


public final boolean isEliminate( net.rim.tools.compiler.types.Field ); // address: 0
	{
	ireturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public final referenced( net.rim.tools.compiler.types.Field, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	ifeq Label6
	iipush 268435456
	goto Label7
Label6:
	iipush 16777216
Label7:
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.addModifiers // pc=2
	return 
	}


public final boolean isRequired( net.rim.tools.compiler.types.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iipush 285212672
	iand 
	iipush 285212672
	if_icmpne Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


public final allocateStatic( net.rim.tools.compiler.types.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label17
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.hasOffset // pc=1
	ifne Label17
	aload_0 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label17
	aload_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual net.rim.tools.compiler.types.ClassType.allocateStatic // pc=2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label17:
	return 
	}


public final int getAbsoluteOffset( net.rim.tools.compiler.types.Field ); // address: 0
	{
	enter_narrow 
	bipush -1
	istore_1 
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label23
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iipush 8388608
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label23
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.hasOffset // pc=1
	ifeq Label23
	aload_0 
	bipush 4
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label23
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getBaseSize // pc=1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iadd 
	istore_1 
Label23:
	iload_1 
	ireturn 
	}


public final populate( net.rim.tools.compiler.types.Field, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.exec.CodDigest$ClassDigest ); // address: 0
	{
	enter 
	aload_0 
	bipush 4
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label17
	aload_0 
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.getTypeModule // pc=1
	invokenonvirtual net.rim.tools.compiler.types.Field.getMember // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.FieldDefLocal//module:net_rim_loader-1.class#64 module:net_rim_loader-1.class#64 module:net_rim_loader-1.class#64
	astore_3 
	aload_3 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.Field.getAbsoluteOffset // pc=1
	invokenonvirtual_lib .routine_22987 // pc=2
	return 
Label17:
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.hasOffset // pc=1
	ifeq Label60
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.getTypeModule // pc=1
	astore_3 
	aload_0 
	aload_1 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.Field.getMember // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.FieldDefLocal//module:net_rim_loader-1.class#64 module:net_rim_loader-1.class#64 module:net_rim_loader-1.class#64
	astore_4 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_5 
	aload_4 
	iload_5 
	invokenonvirtual_lib .routine_22987 // pc=2
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.Field.hasValue // pc=1
	ifeq Label60
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	astore_6 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual_short .virtual_5 // idx=5 pc=1
	ifeq Label53
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual_short .virtual_4 // idx=4 pc=1
	astore_7 
	aload_6 
	iload_5 
	aload_7 
	aload_7 
	invokestatic_lib module:net_rim_loader-1.class#68.routine_39028(  ) // class#68
	invokenonvirtual_lib .routine_28092 // pc=4
	return 
Label53:
	aload_6 
	iload_5 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual_short .virtual_3 // idx=3 pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	invokenonvirtual_lib .routine_28033 // pc=5
Label60:
	return 
	}


public final module:net_rim_loader.class#23 getMember( net.rim.tools.compiler.types.Field, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getOrdinal // pc=1
	istore_3 
	aload_0 
	iload_3 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getCount // pc=1
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getMember // pc=3
	astore_4 
	aload_4 
	ifnull Label13
	goto_w Label74
Label13:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.suppressMemberName // pc=2
	istore_5 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getClassDef // pc=2
	astore_6 
	aload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.Type ) // Type
	astore_7 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	astore 8
	aload_0 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	istore 9
	aload_6 
	aload 8
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_5 
	aload_7 
	iload 9
	invokevirtual module:net_rim_loader-1.class#61 makeFieldDef( net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#57, java.lang.String, boolean, net.rim.tools.compiler.codfile.TypeList, boolean ) // pc=6
	astore 10
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label69
	aload 10
	checkcastbranch_lib 
	astore 11
	aload 11
	aload_0 
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.getTypeModule // pc=1
	invokenonvirtual net.rim.tools.compiler.types.Field.getMember // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.FieldDefLocal//module:net_rim_loader-1.class#64 module:net_rim_loader-1.class#64 module:net_rim_loader-1.class#64
	invokenonvirtual_lib .routine_30548 // pc=2
	goto Label69
Label56:
	aload 10
	checkcastbranch_lib 
	astore 11
	aload 11
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic int toCodfileProtectionAttribute( int ) // Modifier
	invokenonvirtual_lib .routine_31183 // pc=2
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.isUndefined // pc=1
	ifeq Label69
	aload_6 
	aload 10
	invokevirtual undefinedFieldDef( net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#61 ) // pc=2
Label69:
	aload_0 
	aload 10
	iload_3 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setMember // pc=3
	astore_4 
Label74:
	aload_4 
	areturn 
	}

}
