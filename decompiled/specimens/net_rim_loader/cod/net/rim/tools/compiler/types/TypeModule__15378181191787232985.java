// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 53
// ########################################################


package net.rim.tools.compiler.types;


abstract public final class TypeModule extends Object
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  _name ; // ofs = 13468 addr = 0)
	private String /*java.lang.String*/  _version ; // ofs = 13472 addr = 0)
	private int /*int*/  _timeStamp ; // ofs = 13476 addr = 0)
	private net.rim.tools.compiler.codfile.Codfile /*module:net_rim_loader-1.class#32*/  _codfile ; // ofs = 13480 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _classes ; // ofs = 13484 addr = 0)
	private StringBuffer /*java.lang.StringBuffer*/  _undefinedClasses ; // ofs = 13488 addr = 0)
	private int /*int*/  _codeWeight ; // ofs = 13492 addr = 0)
	private int /*int*/  _dataWeight ; // ofs = 13496 addr = 0)
	private int /*int*/  _vtableWeight ; // ofs = 13500 addr = 0)
	private int /*int*/  _fieldWeight ; // ofs = 13504 addr = 0)
	private int /*int*/  _icallIndex ; // ofs = 13508 addr = 0)
	private int /*int*/  _staticSize ; // ofs = 13512 addr = 0)
	private int /*int*/  _maxTypeListSize ; // ofs = 13516 addr = 0)
	private net.rim.tools.compiler.codfile.Module /*net.rim.tools.compiler.codfile.Module[]*/  _modules ; // ofs = 13520 addr = 0)
	private int /*int*/  _ordinal ; // ofs = 13524 addr = 0)
	private int /*int*/  _count ; // ofs = 13528 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.TypeModule, java.lang.String, java.lang.String, int, module:net_rim_loader-1.class#32 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_4 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	bipush 74
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	bipush -1
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	iconst_1 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setOrdinalCount( net.rim.tools.compiler.types.TypeModule, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	iload_2 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getModule // pc=2
	pop 
	return 
	}


public final java.lang.String getName( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final module:net_rim_loader-1.class#32 getCodfile( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final module:net_rim_loader-1.class#57 getDataSection( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_21723 // pc=1
	areturn 
	}


public final net.rim.tools.compiler.codfile.Module getModule( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnonnull Label8
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getCount // pc=1
	newarray_object_lib net.rim.tools.compiler.codfile.Module//net.rim.tools.compiler.codfile.Module net.rim.tools.compiler.codfile.Module net.rim.tools.compiler.codfile.Module
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
Label8:
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getOrdinal // pc=1
	istore_2 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_2 
	aaload 
	ifnonnull Label41
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush -1
	if_icmpeq Label23
	aload_0 
	aload_1 
	if_acmpeq Label23
	iconst_1 
	goto Label24
Label23:
	iconst_0 
Label24:
	istore_3 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_6 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_2 
	aload_4 
	aload_5 
	aload_6 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_3 
	invokenonvirtual_lib .routine_27795 // pc=5
	aastore 
Label41:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_2 
	aaload 
	areturn 
	}


public final int getOrdinal( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	ireturn_field .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	}


public final int getCount( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	ireturn_field .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	}


public final int getNumClasses( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_1 
	aload_1 
	ifnonnull Label7
	iconst_0 
	ireturn 
Label7:
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}


public final addClass( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter 
	aload_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setTypeModule // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_2 
	aload_2 
	ifnonnull Label16
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	aload_0 
	aload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label38
Label16:
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label21:
	iload_4 
	iload_3 
	if_icmpge Label38
	aload_1 
	aload_2 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ClassType
	invokenonvirtual net.rim.tools.compiler.types.ClassType.codfileOrder // pc=2
	ifge Label36
	aload_2 
	aload_1 
	iload_4 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	return 
Label36:
	iinc 4 1
	goto Label21
Label38:
	aload_2 
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final optimize( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_1 
	aload_1 
	ifnonnull Label10
	new CompileException
	dup 
	ldc literal_553:"No classes found"
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=2
	athrow 
Label10:
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label15:
	iload_3 
	iload_2 
	if_icmpge Label29
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ClassType
	astore_4 
	aload_4 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getClassDef // pc=2
	pop 
	iinc 3 1
	goto Label15
Label29:
	return 
	}


public final populate( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.Compiler, int ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual module:net_rim_loader.class#7 getHost( net.rim.tools.compiler.Compiler ) // pc=1
	astore_3 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_4 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iconst_0 
	istore_6 
Label11:
	iload_6 
	iload_5 
	if_icmpge Label27
	aload_4 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ClassType
	astore_7 
	aload_7 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.populate // pc=2
	aload_3 
	bipush -1
	invokeinterface interfacemethodref_20 // pc=2 guess=10
	iinc 6 1
	goto Label11
Label27:
	aload_0 
	aconst_null 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_2 
	invokenonvirtual_lib .routine_21698 // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual_lib .routine_21676 // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokenonvirtual_lib .routine_21687 // pc=2
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	astore_6 
	aload_6 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokenonvirtual_lib .routine_28501 // pc=2
	aload_6 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokenonvirtual_lib .routine_28490 // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnull Label75
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual_short .toString // idx=2 pc=1
	ldc literal_554:"UTF-8"
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	astore_7 
	aload_6 
	invokenonvirtual_lib .routine_28006 // pc=1
	aload_7 
	bipush 2
	iconst_0 
	invokenonvirtual_lib .routine_26802 // pc=4
	astore 8
	aload_6 
	new_lib net.rim.tools.compiler.codfile.ExportedData//module:net_rim_loader-1.class#60 module:net_rim_loader-1.class#60 module:net_rim_loader-1.class#60
	dup 
	aload_6 
	aload 8
	ldc literal_555:".UNDF"
	invokespecial_lib .routine_29933 // pc=4
	invokenonvirtual_lib .routine_28163 // pc=2
	goto Label72
	astore_7 
Label72:
	aload_0 
	aconst_null 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label75:
	return 
	}


public final addUndefinedClass( net.rim.tools.compiler.types.TypeModule, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_1 
	stringlength 
	bipush 2
	imul 
	istore_2 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnonnull Label15
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iinc 2 13
	goto Label20
Label15:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	bipush 44
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iinc 2 1
Label20:
	aload_0 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.addDataWeight // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	return 
	}


public final net.rim.tools.compiler.codfile.ClassDef makeClassDef( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.TypeModule, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getModule // pc=2
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	aload_2 
	aload_3 
	invokevirtual net.rim.tools.compiler.codfile.ClassDef makeClassDef( net.rim.tools.compiler.codfile.Module, module:net_rim_loader-1.class#57, java.lang.String, java.lang.String ) // pc=4
	areturn 
	}


public final net.rim.tools.compiler.codfile.ClassDef getNullClassDef( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getModule // pc=2
	invokevirtual net.rim.tools.compiler.codfile.ClassDef getNullClassDef( net.rim.tools.compiler.codfile.Module ) // pc=1
	areturn 
	}


public final addDataWeight( net.rim.tools.compiler.types.TypeModule, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	iadd 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


public final int getDataWeight( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	ireturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public final addCodeWeight( net.rim.tools.compiler.types.TypeModule, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	iadd 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	}


public final int getCodeWeight( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	ireturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final addVtableWeight( net.rim.tools.compiler.types.TypeModule, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	iadd 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


public final int getVtableWeight( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	ireturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public final addFieldWeight( net.rim.tools.compiler.types.TypeModule, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_1 
	iadd 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}


public final int getFieldWeight( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	ireturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final int getIcallIndex( net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ireturn 
	}


public final int allocateStaticData( net.rim.tools.compiler.types.TypeModule, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	istore_2 
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_1 
	iadd 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_2 
	ireturn 
	}


public final setMaxTypeListSize( net.rim.tools.compiler.types.TypeModule, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	if_icmple Label7
	aload_0 
	iload_1 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
Label7:
	return 
	}

}
