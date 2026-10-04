// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader.cod
// Module version  : 7.1.0.1066
// Class ID        : 1
// ########################################################


package net.rim.tools.compiler;


public class Compiler extends Object
implements net.rim.tools.compiler.vm.Optimization

{
	// @@@@@@@@@@@@@ Static fields 
	public static int /*int*/  _verbosity ; // ofs = 40766 addr = 4)
	private static java.util.Vector /*java.util.Vector*/  _parmTypes ; // ofs = 40772 addr = 5)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.types.NullType /*module:net_rim_loader-2.class#31*/  _nullType ; // ofs = 40498 addr = 0)
	private net.rim.tools.compiler.types.BaseType /*module:net_rim_loader-2.class#2*/  _voidType ; // ofs = 40502 addr = 0)
	private net.rim.tools.compiler.types.BaseType /*module:net_rim_loader-2.class#2*/  _booleanType ; // ofs = 40506 addr = 0)
	private net.rim.tools.compiler.types.BaseType /*module:net_rim_loader-2.class#2*/  _byteType ; // ofs = 40510 addr = 0)
	private net.rim.tools.compiler.types.BaseType /*module:net_rim_loader-2.class#2*/  _shortType ; // ofs = 40514 addr = 0)
	private net.rim.tools.compiler.types.BaseType /*module:net_rim_loader-2.class#2*/  _charType ; // ofs = 40518 addr = 0)
	private net.rim.tools.compiler.types.BaseType /*module:net_rim_loader-2.class#2*/  _intType ; // ofs = 40522 addr = 0)
	private net.rim.tools.compiler.types.BaseType /*module:net_rim_loader-2.class#2*/  _longType ; // ofs = 40526 addr = 0)
	private net.rim.tools.compiler.types.BaseType /*module:net_rim_loader-2.class#2*/  _floatType ; // ofs = 40530 addr = 0)
	private net.rim.tools.compiler.types.BaseType /*module:net_rim_loader-2.class#2*/  _doubleType ; // ofs = 40534 addr = 0)
	private int /*int*/  _timeStamp ; // ofs = 40538 addr = 0)
	private int /*int*/  _optimization ; // ofs = 40542 addr = 0)
	private boolean /*boolean*/  _traceback ; // ofs = 40546 addr = 0)
	private boolean /*boolean*/  _preverified ; // ofs = 40550 addr = 0)
	private boolean /*boolean*/  _warning ; // ofs = 40554 addr = 0)
	private boolean /*boolean*/  _optimizePackage ; // ofs = 40558 addr = 0)
	private boolean /*boolean*/  _makingMIDlet ; // ofs = 40562 addr = 0)
	private boolean /*boolean*/  _makingWidget ; // ofs = 40566 addr = 0)
	private boolean /*boolean*/  _noVerifyErr ; // ofs = 40570 addr = 0)
	private boolean /*boolean*/  _inclusive ; // ofs = 40574 addr = 0)
	private boolean /*boolean*/  _noname ; // ofs = 40578 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _typeModules ; // ofs = 40582 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _classes ; // ofs = 40586 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _classesReferenced ; // ofs = 40590 addr = 0)
	private int /*int*/  _classesReferencedIndex ; // ofs = 40594 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _classTypesUsed ; // ofs = 40598 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _methodsUsed ; // ofs = 40602 addr = 0)
	private int /*int*/  _methodsUsedIndex ; // ofs = 40606 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _potentialMIDlets ; // ofs = 40610 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _timers ; // ofs = 40614 addr = 0)
	private net.rim.tools.compiler.util.CompilerProperties /*net.rim.tools.compiler.util.CompilerProperties*/  _properties ; // ofs = 40618 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _finalStatics ; // ofs = 40622 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _exportedStaticMethods ; // ofs = 40626 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _exportedStaticData ; // ofs = 40630 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _exportedFields ; // ofs = 40634 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _exportedStrings ; // ofs = 40638 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _objectClassVTable ; // ofs = 40642 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _objectClassVirtualMethods ; // ofs = 40646 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _objectClassMethods ; // ofs = 40650 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _objectClass ; // ofs = 40654 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _classClass ; // ofs = 40658 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _stringClass ; // ofs = 40662 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _stringBufferClass ; // ofs = 40666 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _exceptionClass ; // ofs = 40670 addr = 0)
	private net.rim.tools.compiler.JadSupport /*net.rim.tools.compiler.JadSupport*/  _jad ; // ofs = 40674 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _jarFiles ; // ofs = 40678 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _resourceBinaries ; // ofs = 40682 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _jadStrings ; // ofs = 40686 addr = 0)
	private String /*java.lang.String*/  _packageName ; // ofs = 40690 addr = 0)
	private String /*java.lang.String*/  _codeName ; // ofs = 40694 addr = 0)
	private String /*java.lang.String*/  _moduleName ; // ofs = 40698 addr = 0)
	private String /*java.lang.String*/  _moduleVersion ; // ofs = 40702 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _resourceClassType ; // ofs = 40706 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _widgetClassType ; // ofs = 40710 addr = 0)
	private int /*int*/  _codeFull ; // ofs = 40714 addr = 0)
	private int /*int*/  _dataFull ; // ofs = 40718 addr = 0)
	private int /*int*/  _vtableFull ; // ofs = 40722 addr = 0)
	private int /*int*/  _fieldFull ; // ofs = 40726 addr = 0)
	private int /*int*/  _resourceSize ; // ofs = 40730 addr = 0)
	private int /*int*/  _sliceSize ; // ofs = 40734 addr = 0)
	private int /*int*/  _maxIconSize ; // ofs = 40738 addr = 0)
	private boolean /*boolean*/  _noLimit ; // ofs = 40742 addr = 0)
	private boolean /*boolean*/  _includeResources ; // ofs = 40746 addr = 0)
	private net.rim.tools.compiler.exec.CodDigest /*module:net_rim_loader-2.class#6*/  _exportDigest ; // ofs = 40750 addr = 0)
	private net.rim.tools.compiler.Host /*net.rim.tools.compiler.Host*/  _host ; // ofs = 40754 addr = 0)
	private byte[] /*byte[]*/  _midletPolicy ; // ofs = 40758 addr = 0)
	private byte[] /*byte[]*/  _signerCertEncoding ; // ofs = 40762 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.Compiler, java.lang.Object, net.rim.tools.compiler.util.CompilerProperties ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	sipush 11007
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	iconst_1 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	new_lib net.rim.tools.compiler.types.NullType//module:net_rim_loader-2.class#31 module:net_rim_loader-2.class#31 module:net_rim_loader-2.class#31
	dup 
	invokespecial_lib .routine_19931 // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	dup 
	ldc literal_105:"void"
	iconst_0 
	bipush 10
	invokespecial_lib .routine_451 // pc=4
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	new_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	dup 
	ldc literal_106:"boolean"
	iconst_1 
	iconst_1 
	invokespecial_lib .routine_451 // pc=4
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	dup 
	ldc literal_107:"byte"
	iconst_1 
	bipush 2
	invokespecial_lib .routine_451 // pc=4
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	new_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	dup 
	ldc literal_108:"short"
	bipush 2
	bipush 4
	invokespecial_lib .routine_451 // pc=4
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	dup 
	ldc literal_109:"char"
	bipush 2
	bipush 3
	invokespecial_lib .routine_451 // pc=4
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	new_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	dup 
	ldc literal_110:"int"
	bipush 4
	bipush 5
	invokespecial_lib .routine_451 // pc=4
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	new_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	dup 
	ldc literal_111:"long"
	bipush 8
	bipush 6
	invokespecial_lib .routine_451 // pc=4
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	new_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	dup 
	ldc literal_112:"float"
	bipush 4
	bipush 11
	invokespecial_lib .routine_451 // pc=4
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	new_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	dup 
	ldc literal_113:"double"
	bipush 8
	bipush 12
	invokespecial_lib .routine_451 // pc=4
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload_1 
	checkcast Host
	putfield .field_64_64   // get_name_1:  .field_64_64   // get_name_2:  .field_64_64   // get_Name:    .field_64_64   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 64
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	bipush 64
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0 
	aload_2 
	putfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_0 
	aload_2 
	ldc literal_114:"rapc_jarFiles"
	invokevirtual java.util.Vector getVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	putfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	aload_0 
	aload_2 
	ldc literal_115:"rapc_resourceBinaries"
	invokevirtual java.util.Vector getVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	putfield .field_46_46   // get_name_1:  .field_46_46   // get_name_2:  .field_46_46   // get_Name:    .field_46_46   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 46
	aload_0 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_116:"rapc"
	iconst_0 
	invokevirtual java.util.Vector parseVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, boolean ) // pc=3
	putfield .field_47_47   // get_name_1:  .field_47_47   // get_name_2:  .field_47_47   // get_Name:    .field_47_47   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 47
	aload_0 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_117:"codename"
	invokevirtual java.lang.String getQuotedProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	putfield .field_49_49   // get_name_1:  .field_49_49   // get_name_2:  .field_49_49   // get_Name:    .field_49_49   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 49
	aload_0_getfield .field_49_49   // get_name_1:  .field_49_49   // get_name_2:  .field_49_49   // get_Name:    .field_49_49   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 49
	ifnonnull Label149
	aload_0 
	ldc literal_118:"_"
	putfield .field_49_49   // get_name_1:  .field_49_49   // get_name_2:  .field_49_49   // get_Name:    .field_49_49   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 49
	aload_0 
	ldc literal_118:"_"
	putfield .field_50_50   // get_name_1:  .field_50_50   // get_name_2:  .field_50_50   // get_Name:    .field_50_50   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 50
	goto Label155
Label149:
	aload_0 
	aload_0 
	aload_0_getfield .field_49_49   // get_name_1:  .field_49_49   // get_name_2:  .field_49_49   // get_Name:    .field_49_49   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 49
	invokestatic_lib module:net_rim_loader-2.class#19.routine_13195(  ) // class#19
	invokespecial net.rim.tools.compiler.Compiler.validateModuleName // pc=2
	putfield .field_50_50   // get_name_1:  .field_50_50   // get_name_2:  .field_50_50   // get_Name:    .field_50_50   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 50
Label155:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_119:"midlet"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label162
	aload_0 
	iconst_1 
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
Label162:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_120:"widget"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label169
	aload_0 
	iconst_1 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label169:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_121:"noverifyerr"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label176
	aload_0 
	iconst_1 
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
Label176:
	aload_0 
	iipush 942069600
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	putstatic _verbosity // Compiler
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_122:"verbose"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label193
	bipush 2
	putstatic _verbosity // Compiler
	aload_0 
	iconst_1 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
Label193:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_123:"traceback"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label200
	aload_0 
	iconst_1 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
Label200:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_124:"quiet"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label206
	iconst_0 
	putstatic _verbosity // Compiler
Label206:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_125:"VERBOSE"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label215
	bipush 2
	putstatic _verbosity // Compiler
	aload_0 
	iconst_1 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
Label215:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_126:"warning"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label222
	aload_0 
	iconst_1 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label222:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_127:"inclusive"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label229
	aload_0 
	iconst_1 
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
Label229:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_128:"noname"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label236
	aload_0 
	iconst_1 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label236:
	aload_0 
	ldc literal_129:"optimize"
	iconst_1 
	invokespecial net.rim.tools.compiler.Compiler.parseOptimizations // pc=3
	aload_0 
	ldc literal_130:"nooptimize"
	iconst_0 
	invokespecial net.rim.tools.compiler.Compiler.parseOptimizations // pc=3
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_131:"optimizepackage"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label251
	aload_0 
	iconst_1 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
Label251:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_132:"nopreverified"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label258
	aload_0 
	iconst_0 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
Label258:
	aload_0 
	iipush 63488
	putfield .field_54_54   // get_name_1:  .field_54_54   // get_name_2:  .field_54_54   // get_Name:    .field_54_54   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 54
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_133:"codefull"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	ifnull Label273
	aload_0 
	aload_3 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield .field_54_54   // get_name_1:  .field_54_54   // get_name_2:  .field_54_54   // get_Name:    .field_54_54   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 54
	goto Label273
	astore_4 
Label273:
	aload_0 
	iipush 61440
	putfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_134:"datafull"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	ifnull Label288
	aload_0 
	aload_3 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	goto Label288
	astore_4 
Label288:
	aload_0 
	iipush 61440
	putfield .field_56_56   // get_name_1:  .field_56_56   // get_name_2:  .field_56_56   // get_Name:    .field_56_56   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 56
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_135:"vtablefull"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	ifnull Label303
	aload_0 
	aload_3 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield .field_56_56   // get_name_1:  .field_56_56   // get_name_2:  .field_56_56   // get_Name:    .field_56_56   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 56
	goto Label303
	astore_4 
Label303:
	aload_0 
	iipush 61440
	putfield .field_57_57   // get_name_1:  .field_57_57   // get_name_2:  .field_57_57   // get_Name:    .field_57_57   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 57
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_136:"fieldfull"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	ifnull Label318
	aload_0 
	aload_3 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield .field_57_57   // get_name_1:  .field_57_57   // get_name_2:  .field_57_57   // get_Name:    .field_57_57   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 57
	goto Label318
	astore_4 
Label318:
	aload_0 
	iipush 61440
	putfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_137:"resourcesize"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	ifnull Label333
	aload_0 
	aload_3 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	goto Label333
	astore_4 
Label333:
	aload_0 
	sipush 8192
	putfield .field_59_59   // get_name_1:  .field_59_59   // get_name_2:  .field_59_59   // get_Name:    .field_59_59   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 59
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_138:"slicesize"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	ifnull Label348
	aload_0 
	aload_3 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield .field_59_59   // get_name_1:  .field_59_59   // get_name_2:  .field_59_59   // get_Name:    .field_59_59   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 59
	goto Label348
	astore_4 
Label348:
	aload_0 
	sipush 16384
	putfield .field_60_60   // get_name_1:  .field_60_60   // get_name_2:  .field_60_60   // get_Name:    .field_60_60   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 60
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_139:"iconsize"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	ifnull Label363
	aload_0 
	aload_3 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield .field_60_60   // get_name_1:  .field_60_60   // get_name_2:  .field_60_60   // get_Name:    .field_60_60   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 60
	goto Label363
	astore_4 
Label363:
	aload_0 
	iconst_0 
	putfield .field_61_61   // get_name_1:  .field_61_61   // get_name_2:  .field_61_61   // get_Name:    .field_61_61   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 61
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_140:"nolimit"
	invokevirtual java.lang.String getQuotedProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	ifnull Label375
	aload_0 
	iconst_1 
	putfield .field_61_61   // get_name_1:  .field_61_61   // get_name_2:  .field_61_61   // get_Name:    .field_61_61   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 61
Label375:
	aload_0 
	iconst_1 
	putfield .field_62_62   // get_name_1:  .field_62_62   // get_name_2:  .field_62_62   // get_Name:    .field_62_62   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 62
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_141:"noresources"
	invokevirtual java.lang.String getQuotedProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	ifnull Label387
	aload_0 
	iconst_0 
	putfield .field_62_62   // get_name_1:  .field_62_62   // get_name_2:  .field_62_62   // get_Name:    .field_62_62   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 62
Label387:
	return 
	}


static public net.rim.tools.compiler.Compiler compile( java.lang.Object, net.rim.tools.compiler.util.CompilerProperties ); // address: 0
	{
	enter 
	aconst_null 
	astore_4 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
	new_lib net.rim.tools.compiler.util.ExecutionTimer//module:net_rim_loader-2.class#16 module:net_rim_loader-2.class#16 module:net_rim_loader-2.class#16
	dup 
	ldc literal_142:"total"
	aload_5 
	invokespecial_lib .routine_12310 // pc=3
	astore_6 
	aload_0 
	checkcast Host
	astore_7 
	aload_7 
	invokeinterface interfacemethodref_5 // pc=1 guess=6
	putstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	new Compiler
	dup 
	aload_7 
	aload_1 
	invokespecial net.rim.tools.compiler.Compiler.<init> // pc=3
	astore_4 
	aload_4 
	aload_5 
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	new JadSupport
	dup 
	aload_1 
	invokespecial net.rim.tools.compiler.JadSupport.<init> // pc=2
	astore 8
	aload_4 
	aload 8
	invokespecial net.rim.tools.compiler.Compiler.setJad // pc=2
	aload 8
	aload_4 
	aload_4 
	getfield .field_50_50   // get_name_1:  .field_50_50   // get_name_2:  .field_50_50   // get_Name:    .field_50_50   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 50
	invokevirtual java.lang.String getResourceClassName( net.rim.tools.compiler.JadSupport, net.rim.tools.compiler.Compiler, java.lang.String ) // pc=3
	astore 9
	aconst_null 
	astore 8
	aload 9
	ifnull Label51
	aload_1 
	ldc literal_143:"properties"
	aload 9
	invokevirtual java.lang.Object setProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, java.lang.String ) // pc=3
	pop 
Label51:
	aload_4 
	invokespecial net.rim.tools.compiler.Compiler.compile // pc=1
	aload_6 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	getstatic _verbosity // Compiler
	ifle Label60
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	ldc literal_144:"No errors."
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label60:
	aload_1 
	ldc literal_145:"timing"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnull Label70
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	ldc literal_146:" Timing:"
	invokevirtual print( java.io.PrintStream, java.lang.String ) // pc=2
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	aload_5 
	invokevirtual println( java.io.PrintStream, java.lang.Object ) // pc=2
Label70:
	aload_4 
	areturn 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	synch_static Compiler
	clinit_wait 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putstatic _parmTypes // Compiler
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private java.lang.String validateModuleName( net.rim.tools.compiler.Compiler, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	stringlength 
	istore_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	iload_2 
	iconst_1 
	iadd 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_3 
	aload_1 
	iconst_0 
	stringaload 
	istore_4 
	iload_4 
	invokestatic_lib module:net_rim_loader-2.class#3.routine_489(  ) // class#3
	ifne Label22
	aload_3 
	bipush 95
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label22:
	iconst_0 
	istore_5 
Label24:
	iload_5 
	iload_2 
	if_icmpge Label60
	aload_1 
	iload_5 
	stringaload 
	istore_4 
	iload_4 
	bipush 36
	if_icmpeq Label42
	iload_4 
	invokestatic_lib module:net_rim_loader-2.class#3.routine_546(  ) // class#3
	ifeq Label42
	aload_3 
	iload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label58
Label42:
	aload_3 
	bipush 36
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iload_4 
	bipush 16
	if_icmpge Label53
	aload_3 
	bipush 48
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label53:
	aload_3 
	iload_4 
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label58:
	iinc 5 1
	goto Label24
Label60:
	aload_3 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	bipush 124
	if_icmple Label67
	aload_3 
	bipush 124
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
Label67:
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private setJad( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.JadSupport ); // address: 0
	{
	putfield_return .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	}


private int optToMask( net.rim.tools.compiler.Compiler, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_1 
	ldc literal_16:"nop"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label7
	bipush 8
	ireturn 
Label7:
	aload_1 
	ldc literal_17:"arrayinit"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label13
	bipush 4
	ireturn 
Label13:
	aload_1 
	ldc literal_18:"strarrayinit"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label19
	sipush 8192
	ireturn 
Label19:
	aload_1 
	ldc literal_19:"deadcode"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label25
	iconst_1 
	ireturn 
Label25:
	aload_1 
	ldc literal_20:"checkcast"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label31
	bipush 2
	ireturn 
Label31:
	aload_1 
	ldc literal_21:"trivial"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label37
	bipush 16
	ireturn 
Label37:
	aload_1 
	ldc literal_22:"jump"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	bipush 32
	ireturn 
Label43:
	aload_1 
	ldc literal_23:"accessor"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label49
	bipush 64
	ireturn 
Label49:
	aload_1 
	ldc literal_24:"mutator"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label55
	sipush 128
	ireturn 
Label55:
	aload_1 
	ldc literal_25:"pushpop"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label61
	sipush 256
	ireturn 
Label61:
	aload_1 
	ldc literal_26:"useless_case"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label67
	sipush 512
	ireturn 
Label67:
	aload_1 
	ldc literal_27:"inner_accessor"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label73
	sipush 2048
	ireturn 
Label73:
	aload_1 
	ldc literal_28:"bool_ret"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label79
	sipush 4096
	ireturn 
Label79:
	aload_1 
	ldc literal_29:"device_only"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label85
	sipush 15103
	ireturn 
Label85:
	iconst_0 
	ireturn 
	}


private parseOptimization( net.rim.tools.compiler.Compiler, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_30:"1"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label13
	aload_0 
	iload_2 
	ifeq Label10
	sipush 11007
	goto Label11
Label10:
	iconst_0 
Label11:
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	return 
Label13:
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.Compiler.optToMask // pc=2
	istore_3 
	iload_2 
	ifeq Label25
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_3 
	ior 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	return 
Label25:
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_3 
	bipush -1
	ixor 
	iand 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	return 
	}


private parseOptimizations( net.rim.tools.compiler.Compiler, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_3 
	aload_3 
	checkcastbranch_lib 
	astore_4 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_5 
Label13:
	iload_5 
	iflt Label33
	aload_4 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_6 
	aload_0 
	aload_6 
	iload_2 
	invokespecial net.rim.tools.compiler.Compiler.parseOptimization // pc=3
	iinc 5 -1
	goto Label13
Label26:
	aload_3 
	checkcastbranch_lib 
	astore_4 
	aload_0 
	aload_4 
	iload_2 
	invokespecial net.rim.tools.compiler.Compiler.parseOptimization // pc=3
Label33:
	return 
	}


private readFinalStatics( net.rim.tools.compiler.Compiler, java.lang.String, java.io.InputStream ); // address: 0
	{
	enter 
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	ifnonnull Label8
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
Label8:
	aload_2 
	ifnull Label39
	new_lib java.io.DataInputStream//java.io.DataInputStream java.io.DataInputStream java.io.DataInputStream
	dup 
	aload_2 
	invokespecial_lib java.io.DataInputStream.<init> // pc=2
	astore_3 
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	astore_4 
Label17:
	aload_4 
	aload_3 
	invokevirtual java.lang.String readUTF( java.io.DataInputStream ) // pc=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label17
	astore_4 
	aload_3 
	invokevirtual close( java.io.DataInputStream ) // pc=1
	goto Label39
	astore_5 
	aload_3 
	invokevirtual close( java.io.DataInputStream ) // pc=1
	aload_5 
	athrow 
	astore_3 
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_1 
	aload_3 
	invokevirtual java.lang.String getMessage( java.io.IOException ) // pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label39:
	return 
	}


private processProperties( net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	ldc literal_31:"/jar2cod.def"
	astore_1 
	aload_0 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	aload_1 
	invokevirtual java.io.InputStream getResourceAsStream( java.lang.Class, java.lang.String ) // pc=2
	astore_2 
	aload_2 
	ifnull Label16
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_1 
	aload_2 
	invokevirtual readDefFile( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, java.io.InputStream ) // pc=3
	aload_2 
	invokevirtual close( java.io.InputStream ) // pc=1
Label16:
	aload_0 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_32:"exports"
	iconst_1 
	invokevirtual java.util.Vector parseVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, boolean ) // pc=3
	putfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_33:"statics"
	iconst_1 
	invokevirtual java.util.Vector parseVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, boolean ) // pc=3
	putfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_0 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_34:"fields"
	iconst_0 
	invokevirtual java.util.Vector parseVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, boolean ) // pc=3
	putfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_0 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_35:"strings"
	iconst_0 
	invokevirtual java.util.Vector parseVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, boolean ) // pc=3
	putfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_0 
	ldc literal_36:"net.rim.vm.UnGroupable"
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	iipush 67110912
	invokenonvirtual_lib .routine_1278 // pc=2
	aload_0 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_37:"rootclassvirtualmethods"
	iconst_1 
	invokevirtual java.util.Vector parseVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, boolean ) // pc=3
	putfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	aload_0 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_38:"rootclassmethods"
	iconst_1 
	invokevirtual java.util.Vector parseVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, boolean ) // pc=3
	putfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload_0 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_39:"rootclassvtable"
	iconst_1 
	invokevirtual java.util.Vector parseVector( net.rim.tools.compiler.util.CompilerProperties, java.lang.String, boolean ) // pc=3
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	aload_0 
	aload_0 
	ldc literal_40:"java.lang.Object"
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	putfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	aload_0_getfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
	aload_0 
	aload_0 
	ldc literal_41:"java.lang.Class"
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	putfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	aload_0_getfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
	aload_0 
	aload_0 
	ldc literal_42:"java.lang.String"
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	putfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	aload_0 
	aload_0 
	ldc literal_43:"java.lang.StringBuffer"
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	putfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	aload_0 
	aload_0 
	ldc literal_44:"java.lang.Throwable"
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	putfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifeq Label106
	aload_0 
	ldc literal_45:"javax.microedition.midlet.MIDletMain"
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
Label106:
	return 
	}


private resolve( net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	bipush -1
	istore_2 
	iconst_0 
	istore_3 
Label7:
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iload_1 
	bipush 100
	imul 
	iload_4 
	iload_5 
	iadd 
	iconst_1 
	iadd 
	idiv 
	istore_6 
	iload_6 
	iload_2 
	if_icmple Label31
	aload_0_getfield .field_64_64   // get_name_1:  .field_64_64   // get_name_2:  .field_64_64   // get_Name:    .field_64_64   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 64
	bipush -1
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	iload_6 
	istore_2 
Label31:
	iinc 1 1
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	iload_4 
	if_icmpge Label49
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0 
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore_7 
	aload_7 
	aload_0 
	invokenonvirtual_lib .routine_3552 // pc=2
	goto Label7
Label49:
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	iload_5 
	if_icmpge Label66
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	astore_7 
	aload_7 
	aload_0 
	invokenonvirtual_lib .routine_16993 // pc=2
	goto Label7
Label66:
	iload_3 
	ifeq Label69
	goto_w Label272
Label69:
	aload_0_getfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	iipush 61440
	if_icmpeq Label73
	goto_w Label168
Label73:
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	astore_7 
	iconst_0 
	istore 8
	iconst_0 
	istore 9
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 10
	iconst_0 
	istore 11
Label84:
	iload 11
	iload 10
	if_icmpge Label106
	aload_7 
	iload 11
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore 12
	aload 12
	iipush 131072
	invokenonvirtual_lib .routine_3396 // pc=2
	ifne Label104
	aload 12
	invokenonvirtual_lib .routine_3385 // pc=1
	ifeq Label104
	iload 8
	aload 12
	invokenonvirtual_lib .routine_6393 // pc=1
	iadd 
	istore 8
Label104:
	iinc 11 1
	goto Label84
Label106:
	aload_0_getfield .field_46_46   // get_name_1:  .field_46_46   // get_name_2:  .field_46_46   // get_Name:    .field_46_46   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 46
	astore_7 
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 10
	iconst_0 
	istore 11
Label113:
	iload 11
	iload 10
	if_icmpge Label135
	aload_7 
	iload 11
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ResourceFile
	astore 12
	aload 12
	invokevirtual_short .virtual_10 // idx=10 pc=1
	istore 13
	iload 8
	iload 13
	iadd 
	istore 8
	iload 13
	iload 9
	if_icmple Label133
	iload 13
	istore 9
Label133:
	iinc 11 1
	goto Label113
Label135:
	iload 8
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	if_icmplt Label168
	iload 9
	aload_0_getfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	if_icmple Label168
	iload 8
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	iadd 
	iconst_1 
	isub 
	bipush 5
	imul 
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	bipush 4
	imul 
	idiv 
	istore 11
	aload_0_getfield .field_50_50   // get_name_1:  .field_50_50   // get_name_2:  .field_50_50   // get_Name:    .field_50_50   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 50
	stringlength 
	bipush 3
	iadd 
	iload 11
	imul 
	istore 12
	aload_0_getfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	iipush 61440
	if_icmpne Label168
	aload_0 
	aload_0_getfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	iload 12
	isub 
	putfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
Label168:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifeq Label213
	aload_0_getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
	aload_0 
	ldc literal_45:"javax.microedition.midlet.MIDletMain"
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore_7 
	aload_7 
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
	getstatic _parmTypes // Compiler
	dup 
	astore 8
	monitorenter 
	getstatic _parmTypes // Compiler
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	getstatic _parmTypes // Compiler
	aload_0_getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	invokenonvirtual_lib .routine_25425 // pc=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_7 
	aload_0 
	ldc literal_46:"main"
	aconst_null 
	getstatic _parmTypes // Compiler
	iconst_1 
	iconst_0 
	invokenonvirtual_lib .routine_2816 // pc=7
	pop 
	getstatic _parmTypes // Compiler
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload 8
	monitorexit 
	goto Label213
	astore 14
	aload 8
	monitorexit 
	aload 14
	athrow 
Label213:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	ifeq Label227
	aload_0_getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
	aload_0 
	ldc literal_47:"net.rim.blackberry.web.widget.jil.JILWidgetApplication"
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore_7 
	aload_7 
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
Label227:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	ifeq Label239
	new GenerateWidget
	dup 
	aload_0 
	aload_0_getfield .field_50_50   // get_name_1:  .field_50_50   // get_name_2:  .field_50_50   // get_Name:    .field_50_50   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 50
	invokespecial net.rim.tools.compiler.GenerateWidget.<init> // pc=3
	astore_7 
	aload_0 
	aload_7 
	invokevirtual module:net_rim_loader-2.class#4 generateWidgetClass( net.rim.tools.compiler.GenerateWidget ) // pc=1
	putfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
Label239:
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_0 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_0 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	invokevirtual fixupProperties( net.rim.tools.compiler.JadSupport, net.rim.tools.compiler.Compiler, boolean, boolean, boolean, java.util.Vector ) // pc=6
	aload_0 
	aconst_null 
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual generateManifest( net.rim.tools.compiler.JadSupport, boolean ) // pc=2
	aload_0 
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	invokevirtual module:net_rim_loader-2.class#4 generateResourceClass( net.rim.tools.compiler.JadSupport ) // pc=1
	putfield .field_52_52   // get_name_1:  .field_52_52   // get_name_2:  .field_52_52   // get_Name:    .field_52_52   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 52
	iconst_1 
	istore_3 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifeq Label268
	aload_0 
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	invokevirtual byte[] getPolicy( net.rim.tools.compiler.JadSupport ) // pc=1
	putfield .field_65_65   // get_name_1:  .field_65_65   // get_name_2:  .field_65_65   // get_Name:    .field_65_65   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 65
	aload_0 
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	invokevirtual byte[] getSignerCertEncoding( net.rim.tools.compiler.JadSupport ) // pc=1
	putfield .field_66_66   // get_name_1:  .field_66_66   // get_name_2:  .field_66_66   // get_Name:    .field_66_66   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 66
Label268:
	aload_0 
	aconst_null 
	putfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	goto_w Label7
Label272:
	return 
	}


private module:net_rim_loader-2.class#53 findInputTypeModule( net.rim.tools.compiler.Compiler, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label8:
	iload_4 
	iload_3 
	if_icmpge Label25
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.TypeModule//module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_29638 // pc=1
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label23
	aload_2 
	areturn 
Label23:
	iinc 4 1
	goto Label8
Label25:
	aconst_null 
	areturn 
	}


private module:net_rim_loader-2.class#53 makeOutputTypeModule( net.rim.tools.compiler.Compiler, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aload_0_getfield .field_50_50   // get_name_1:  .field_50_50   // get_name_2:  .field_50_50   // get_Name:    .field_50_50   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 50
	iload_1 
	aconst_null 
	invokestatic_lib module:net_rim_loader-2.class#19.routine_13397(  ) // class#19
	astore_3 
	new_lib net.rim.tools.compiler.types.TypeModule//module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53
	dup 
	aload_3 
	aload_0_getfield .field_51_51   // get_name_1:  .field_51_51   // get_name_2:  .field_51_51   // get_Name:    .field_51_51   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 51
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	new_lib net.rim.tools.compiler.codfile.Codfile//module:net_rim_loader-1.class#32 module:net_rim_loader-1.class#32 module:net_rim_loader-1.class#32
	dup 
	iload_2 
	invokespecial_lib .routine_21788 // pc=2
	invokespecial_lib .routine_30480 // pc=5
	astore_4 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_4 
	areturn 
	}


private boolean willFit( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#53, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual_lib .routine_29789 // pc=1
	sipush 254
	if_icmple Label7
	iconst_0 
	ireturn 
Label7:
	aload_2 
	invokenonvirtual_lib .routine_6393 // pc=1
	istore_3 
	aload_2 
	invokenonvirtual_lib .routine_6422 // pc=1
	istore_4 
	aload_2 
	invokenonvirtual_lib .routine_6433 // pc=1
	istore_5 
	aload_2 
	invokenonvirtual_lib .routine_6444 // pc=1
	istore_6 
	aload_1 
	invokenonvirtual_lib .routine_30311 // pc=1
	iload_3 
	iadd 
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	if_icmple Label27
	iconst_0 
	ireturn 
Label27:
	aload_1 
	invokenonvirtual_lib .routine_30340 // pc=1
	iload_4 
	iadd 
	aload_0_getfield .field_54_54   // get_name_1:  .field_54_54   // get_name_2:  .field_54_54   // get_Name:    .field_54_54   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 54
	if_icmple Label35
	iconst_0 
	ireturn 
Label35:
	aload_1 
	invokenonvirtual_lib .routine_30369 // pc=1
	iload_5 
	iadd 
	aload_0_getfield .field_56_56   // get_name_1:  .field_56_56   // get_name_2:  .field_56_56   // get_Name:    .field_56_56   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 56
	if_icmple Label43
	iconst_0 
	ireturn 
Label43:
	aload_1 
	invokenonvirtual_lib .routine_30398 // pc=1
	iload_6 
	iadd 
	aload_0_getfield .field_57_57   // get_name_1:  .field_57_57   // get_name_2:  .field_57_57   // get_Name:    .field_57_57   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 57
	if_icmple Label51
	iconst_0 
	ireturn 
Label51:
	iconst_1 
	ireturn 
	}


private module:net_rim_loader-2.class#53[] optimize( net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	aload_0 
	aconst_null 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	astore_1 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_2 
Label11:
	iload_2 
	iload_3 
	if_icmpge Label34
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore_4 
	aload_4 
	iipush 131072
	invokenonvirtual_lib .routine_3396 // pc=2
	ifne Label32
	aload_4 
	invokenonvirtual_lib .routine_3385 // pc=1
	ifeq Label32
	aload_0 
	aload_4 
	invokevirtual useClassType( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4 ) // pc=2
	aload_4 
	aload_0 
	invokenonvirtual_lib .routine_5179 // pc=2
Label32:
	iinc 2 1
	goto Label11
Label34:
	aload_0 
	aconst_null 
	dup_x1 
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	astore_1 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	astore_1 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_2 
Label46:
	iload_2 
	iload_3 
	if_icmpge Label59
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	astore_4 
	aload_4 
	aload_0 
	invokenonvirtual_lib .routine_17120 // pc=2
	iinc 2 1
	goto Label46
Label59:
	aload_0 
	aconst_null 
	dup_x1 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	astore_1 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_4 
	iconst_0 
	istore_5 
	aload_0 
	iload_5 
	invokespecial net.rim.tools.compiler.Compiler.makeOutputTypeModule // pc=2
	astore_6 
	aload_4 
	aload_6 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_6 
	invokenonvirtual_lib .routine_29638 // pc=1
	stringlength 
	istore_7 
	aload_6 
	iload_7 
	invokenonvirtual_lib .routine_30293 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	invokenonvirtual_lib .routine_20058 // pc=2
	aload_0_getfield .field_52_52   // get_name_1:  .field_52_52   // get_name_2:  .field_52_52   // get_Name:    .field_52_52   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 52
	ifnull Label95
	aload_6 
	aload_0_getfield .field_52_52   // get_name_1:  .field_52_52   // get_name_2:  .field_52_52   // get_Name:    .field_52_52   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 52
	invokenonvirtual_lib .routine_29822 // pc=2
	aload_0 
	aconst_null 
	putfield .field_52_52   // get_name_1:  .field_52_52   // get_name_2:  .field_52_52   // get_Name:    .field_52_52   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 52
Label95:
	aload_0_getfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	ifnull Label103
	aload_6 
	aload_0_getfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	invokenonvirtual_lib .routine_29822 // pc=2
	aload_0 
	aconst_null 
	putfield .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
Label103:
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	astore_1 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore 8
	iconst_0 
	istore_2 
Label112:
	iload_2 
	iload_3 
	if_icmpge Label127
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore 9
	iload 8
	aload 9
	invokenonvirtual_lib .routine_6393 // pc=1
	iadd 
	istore 8
	iinc 2 1
	goto Label112
Label127:
	iconst_1 
	istore 9
	iload 8
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	if_icmplt Label153
	iload 8
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	iadd 
	iconst_1 
	isub 
	bipush 5
	imul 
	aload_0_getfield .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	bipush 4
	imul 
	idiv 
	istore 9
	iload_7 
	bipush 3
	iadd 
	iload 9
	imul 
	istore_7 
	aload_6 
	iload_7 
	invokenonvirtual_lib .routine_30293 // pc=2
Label153:
	iconst_0 
	istore_2 
Label155:
	iload_2 
	iload_3 
	if_icmplt Label159
	goto_w Label247
Label159:
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore 10
	aload 10
	invokenonvirtual_lib .routine_20069 // pc=1
	ifnull Label168
	goto_w Label245
Label168:
	aload_0 
	aload_6 
	aload 10
	invokespecial net.rim.tools.compiler.Compiler.willFit // pc=3
	ifeq Label177
	aload_6 
	aload 10
	invokenonvirtual_lib .routine_29822 // pc=2
	goto_w Label245
Label177:
	aconst_null 
	astore 11
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore 12
	iconst_0 
	istore 13
Label186:
	iload 13
	iload 12
	if_icmpge Label207
	aload_4 
	iload 13
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.TypeModule//module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53
	astore 11
	aload_0 
	aload 11
	aload 10
	invokespecial net.rim.tools.compiler.Compiler.willFit // pc=3
	ifeq Label203
	aload 11
	aload 10
	invokenonvirtual_lib .routine_29822 // pc=2
	goto Label207
Label203:
	aconst_null 
	astore 11
	iinc 13 1
	goto Label186
Label207:
	aload 11
	ifnonnull Label245
	aload_0 
	iinc 5 1
	iload_5 
	invokespecial net.rim.tools.compiler.Compiler.makeOutputTypeModule // pc=2
	astore_6 
	aload_4 
	aload_6 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_6 
	iload_7 
	invokenonvirtual_lib .routine_30293 // pc=2
	iload_5 
	iload 9
	if_icmple Label242
	aload_6 
	invokenonvirtual_lib .routine_29638 // pc=1
	stringlength 
	istore 13
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore 14
Label232:
	iload 14
	iflt Label242
	aload_4 
	iload 14
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.TypeModule//module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53
	iload 13
	invokenonvirtual_lib .routine_30293 // pc=2
	iinc 14 -1
	goto Label232
Label242:
	aload_6 
	aload 10
	invokenonvirtual_lib .routine_29822 // pc=2
Label245:
	iinc 2 1
	goto_w Label155
Label247:
	aload_0 
	aconst_null 
	dup_x1 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	astore_1 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iload_3 
	newarray_object_lib net.rim.tools.compiler.types.TypeModule//module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53
	astore 10
	iconst_0 
	istore_2 
Label260:
	iload_2 
	iload_3 
	if_icmpge Label280
	aload_4 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.TypeModule//module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53
	astore_6 
	aload_6 
	iload_2 
	iload_3 
	invokenonvirtual_lib .routine_29612 // pc=3
	aload 10
	iload_2 
	aload_6 
	aastore 
	aload_6 
	invokenonvirtual_lib .routine_29916 // pc=1
	iinc 2 1
	goto Label260
Label280:
	iconst_0 
	istore_2 
Label282:
	iload_2 
	iload_3 
	if_icmpge Label305
	aload 10
	iload_2 
	aaload 
	invokenonvirtual_lib .routine_29660 // pc=1
	astore 11
	iconst_0 
	istore 12
Label292:
	iload 12
	iload_3 
	if_icmpge Label303
	aload 11
	aload 10
	iload 12
	aaload 
	invokenonvirtual_lib .routine_29638 // pc=1
	invokenonvirtual_lib .routine_27961 // pc=2
	iinc 12 1
	goto Label292
Label303:
	iinc 2 1
	goto Label282
Label305:
	aload 10
	areturn 
	}


private populate( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#53[] ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.exec.CodDigest//module:net_rim_loader-2.class#6 module:net_rim_loader-2.class#6 module:net_rim_loader-2.class#6
	dup 
	invokespecial_lib .routine_9605 // pc=1
	putfield .field_63_63   // get_name_1:  .field_63_63   // get_name_2:  .field_63_63   // get_Name:    .field_63_63   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 63
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iload_2 
	newarray 1
	astore_3 
	aload_1 
	arraylength 
	istore_4 
	iconst_0 
	istore_5 
Label17:
	iload_5 
	iload_4 
	if_icmplt Label21
	goto_w Label242
Label21:
	iconst_0 
	istore_6 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifeq Label27
	bipush 2
	istore_6 
Label27:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifeq Label33
	iload_6 
	bipush 64
	ior 
	istore_6 
Label33:
	aload_1 
	iload_5 
	aaload 
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_29660 // pc=1
	astore 8
	aconst_null 
	astore 9
	aconst_null 
	astore 10
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label51
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore 9
Label51:
	aload 9
	checkcastbranch_lib 
	astore 10
	aload 10
	invokevirtual_short .virtual_5 // idx=5 pc=1
	astore 11
	iload_5 
	ifne Label75
	aload 11
	invokenonvirtual_lib .routine_19303 // pc=1
	aload_7 
	invokenonvirtual_lib .routine_6464 // pc=2
	astore 12
	aload 11
	aload_7 
	invokenonvirtual_lib .routine_17187 // pc=2
	astore 13
	aload 8
	aload 12
	aload 11
	invokenonvirtual_lib .routine_19270 // pc=1
	aload 13
	invokenonvirtual_lib .routine_28187 // pc=4
	goto Label82
Label75:
	aconst_null 
	astore 9
	goto Label82
Label78:
	aload 9
	ifnull Label82
	aconst_null 
	astore 9
Label82:
	aload 9
	ifnonnull Label100
	aload 8
	aload 8
	invokenonvirtual_lib .routine_28336 // pc=1
	aconst_null 
	aload 8
	invokenonvirtual_lib .routine_28017 // pc=1
	invokenonvirtual_lib .routine_29420 // pc=1
	invokenonvirtual_lib .routine_28187 // pc=4
	iload_6 
	iconst_1 
	ior 
	istore_6 
	iload_6 
	bipush -3
	iand 
	istore_6 
Label100:
	aconst_null 
	astore 9
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	if_icmple Label110
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	iconst_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore 9
Label110:
	aload 9
	checkcastbranch_lib 
	astore 10
	aload 10
	invokevirtual_short .virtual_5 // idx=5 pc=1
	astore 11
	aload 11
	iipush 131072
	invokenonvirtual_lib .routine_19625 // pc=2
	ifne Label141
	iload_5 
	ifne Label138
	aload 11
	invokenonvirtual_lib .routine_19303 // pc=1
	aload_7 
	invokenonvirtual_lib .routine_6464 // pc=2
	astore 12
	aload 11
	aload_7 
	invokenonvirtual_lib .routine_17187 // pc=2
	astore 13
	aload 8
	aload 12
	aload 11
	invokenonvirtual_lib .routine_19270 // pc=1
	aload 13
	invokenonvirtual_lib .routine_28264 // pc=4
	goto Label148
Label138:
	aconst_null 
	astore 9
	goto Label148
Label141:
	aconst_null 
	astore 9
	goto Label148
Label144:
	aload 9
	ifnull Label148
	aconst_null 
	astore 9
Label148:
	aload 9
	ifnonnull Label158
	aload 8
	aload 8
	invokenonvirtual_lib .routine_28336 // pc=1
	aconst_null 
	aload 8
	invokenonvirtual_lib .routine_28017 // pc=1
	invokenonvirtual_lib .routine_29420 // pc=1
	invokenonvirtual_lib .routine_28264 // pc=4
Label158:
	iconst_0 
	istore 11
Label160:
	iload 11
	iload_2 
	if_icmplt Label164
	goto_w Label236
Label164:
	aload 8
	invokenonvirtual_lib .routine_28006 // pc=1
	astore 12
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	iload 11
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore 9
	aload 9
	ifnonnull Label174
	goto_w Label234
Label174:
	aload 9
	checkcastbranch_lib 
	astore 10
	aload 10
	invokevirtual_short .virtual_3 // idx=3 pc=1
	astore 13
	aload 13
	aload 13
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore 13
	iload_5 
	ifeq Label194
	aload 13
	ldc literal_48:"_security"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label234
Label194:
	aload 12
	aload 10
	invokevirtual_short .virtual_4 // idx=4 pc=1
	bipush 2
	iconst_0 
	invokenonvirtual_lib .routine_26802 // pc=4
	astore 14
	aload 8
	new_lib net.rim.tools.compiler.codfile.ExportedData//module:net_rim_loader-1.class#60 module:net_rim_loader-1.class#60 module:net_rim_loader-1.class#60
	dup 
	aload 8
	aload 14
	aload 13
	invokespecial_lib .routine_29933 // pc=4
	invokenonvirtual_lib .routine_28163 // pc=2
	goto Label234
Label210:
	aload 9
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 13
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifeq Label230
	aload_3 
	iload 11
	baload 
	ifne Label230
	aload_0 
	iconst_0 
	aconst_null 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_49:"No definition found for exported string: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 13
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateWarning( net.rim.tools.compiler.Compiler, boolean, java.lang.String, java.lang.String ) // pc=4
Label230:
	aload_3 
	iload 11
	iconst_1 
	bastore 
Label234:
	iinc 11 1
	goto_w Label160
Label236:
	aload_7 
	aload_0 
	iload_6 
	invokenonvirtual_lib .routine_29990 // pc=3
	iinc 5 1
	goto_w Label17
Label242:
	aload_0 
	aconst_null 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aconst_null 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aconst_null 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aconst_null 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aconst_null 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aconst_null 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aconst_null 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aconst_null 
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	aload_0 
	aconst_null 
	putfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	aload_0 
	aconst_null 
	putfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	aload_0 
	aconst_null 
	putfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	aload_0 
	aconst_null 
	putfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	aload_0 
	aconst_null 
	putfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0 
	aconst_null 
	putfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_0 
	aconst_null 
	putfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_0 
	aconst_null 
	putfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_0 
	aconst_null 
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	return 
	}


private processPragma( net.rim.tools.compiler.Compiler, java.lang.String, module:net_rim_loader-2.class#4, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_3 
	ldc literal_50:"RIM_pragma_exclusive"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label24
	aload_2 
	iipush 524288
	invokenonvirtual_lib .routine_1301 // pc=2
	aload_2 
	invokenonvirtual_lib .routine_1567 // pc=1
	istore_5 
	iconst_0 
	istore_6 
Label13:
	iload_6 
	iload_5 
	if_icmpge Label23
	aload_2 
	iload_6 
	invokenonvirtual_lib .routine_1578 // pc=2
	iipush 524288
	invokenonvirtual_lib .routine_19593 // pc=2
	iinc 6 1
	goto Label13
Label23:
	return 
Label24:
	aload_3 
	ldc literal_51:"RIM_pragma_inclusive"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label47
	aload_2 
	iipush 524288
	invokenonvirtual_lib .routine_1278 // pc=2
	aload_2 
	invokenonvirtual_lib .routine_1567 // pc=1
	istore_5 
	iconst_0 
	istore_6 
Label36:
	iload_6 
	iload_5 
	if_icmpge Label46
	aload_2 
	iload_6 
	invokenonvirtual_lib .routine_1578 // pc=2
	iipush 524288
	invokenonvirtual_lib .routine_19570 // pc=2
	iinc 6 1
	goto Label36
Label46:
	return 
Label47:
	return 
	}


private module:net_rim_loader-1.class#27 parseClassfile( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String, java.io.InputStream, int, module:net_rim_loader-2.class#53, boolean ); // address: 0
	{
	enter 
	aload_2 
	astore_7 
	aload_1 
	ifnull Label18
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 40
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 41
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_7 
Label18:
	aload_3 
	iload_4 
	aload_7 
	invokestatic_lib module:net_rim_loader-2.class#45.routine_23985(  ) // class#45
	astore 8
	aconst_null 
	astore 9
	new_lib net.rim.tools.compiler.classfile.Classfile//module:net_rim_loader-1.class#27 module:net_rim_loader-1.class#27 module:net_rim_loader-1.class#27
	dup 
	aload 8
	iload_6 
	invokespecial_lib .routine_14022 // pc=3
	astore 9
	iload_6 
	ifne Label42
	aload 9
	getstatic_lib module:net_rim_loader-1.class#5.static_19 // class#5
	invokenonvirtual_lib .routine_13967 // pc=2
	ifeq Label42
	aload 9
	getstatic_lib module:net_rim_loader-1.class#5.static_19 // class#5
	invokenonvirtual_lib .routine_13989 // pc=2
	invokevirtual java.lang.String getSourceFileName( net.rim.tools.compiler.classfile.Attribute ) // pc=1
	astore_7 
Label42:
	aload 9
	invokenonvirtual_lib .routine_13673 // pc=1
	astore 10
	aload 10
	ifnonnull Label59
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_52:"No class name found in classfile: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label59:
	aload 9
	invokenonvirtual_lib .routine_13653 // pc=1
	invokestatic_lib module:net_rim_loader-2.class#28.routine_18529(  ) // class#28
	istore 11
	aload_0 
	aconst_null 
	putfield .field_48_48   // get_name_1:  .field_48_48   // get_name_2:  .field_48_48   // get_Name:    .field_48_48   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 48
	iload_6 
	ifeq Label69
	goto_w Label119
Label69:
	aload_2 
	getstatic_lib module:net_rim_loader-2.class#19.static_51 // class#19
	invokestatic_lib module:net_rim_loader-2.class#19.routine_13322(  ) // class#19
	bipush 47
	bipush 46
	invokenonvirtual_lib java.lang.String.replace // pc=3
	bipush 92
	bipush 46
	invokenonvirtual_lib java.lang.String.replace // pc=3
	astore 12
	aload 12
	aload 10
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label103
	aload_0 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_53:"Class name: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_54:" does not match file name: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	iload 11
	iipush 134217728
	ior 
	istore 11
	aload 12
	astore 10
Label103:
	aload_0 
	aload 10
	invokestatic_lib module:net_rim_loader-2.class#4.routine_9010(  ) // class#4
	putfield .field_48_48   // get_name_1:  .field_48_48   // get_name_2:  .field_48_48   // get_Name:    .field_48_48   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 48
	getstatic _verbosity // Compiler
	iconst_1 
	if_icmplt Label119
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_55:"Parsing classfile: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label119:
	aload_0 
	aload 10
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore 12
	aload 12
	invokenonvirtual_lib .routine_3385 // pc=1
	ifeq Label134
	new_lib net.rim.tools.compiler.util.DuplicateException//module:net_rim_loader-2.class#15 module:net_rim_loader-2.class#15 module:net_rim_loader-2.class#15
	dup 
	aload_7 
	aload 10
	aload 12
	invokenonvirtual_lib .routine_1165 // pc=1
	invokespecial_lib .routine_12147 // pc=4
	athrow 
Label134:
	aload 12
	invokenonvirtual_lib .routine_3370 // pc=1
	aload_0 
	iload 11
	invokevirtual int augmentClassModifiers( net.rim.tools.compiler.Compiler, int ) // pc=2
	istore 11
	aload 12
	iload 11
	invokenonvirtual_lib .routine_1278 // pc=2
	aload 9
	invokenonvirtual_lib .routine_13743 // pc=1
	astore 13
	aload 13
	ifnull Label155
	aload_0 
	aload 13
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore 14
	aload 12
	aload 14
	invokenonvirtual_lib .routine_1322 // pc=2
Label155:
	aload 9
	invokenonvirtual_lib .routine_13815 // pc=1
	istore 14
	aload 12
	iload 14
	invokenonvirtual_lib .routine_1527 // pc=2
	iconst_0 
	istore 15
Label163:
	iload 15
	iload 14
	if_icmpge Label176
	aload 12
	iload 15
	aload_0 
	aload 9
	iload 15
	invokenonvirtual_lib .routine_13840 // pc=2
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	invokenonvirtual_lib .routine_1551 // pc=3
	iinc 15 1
	goto Label163
Label176:
	aload 9
	invokenonvirtual_lib .routine_13897 // pc=1
	istore 14
	aload 12
	iload 14
	invokenonvirtual_lib .routine_1593 // pc=2
	iconst_0 
	istore 15
Label184:
	iload 15
	iload 14
	if_icmplt Label188
	goto_w Label453
Label188:
	aload 9
	iload 15
	invokenonvirtual_lib .routine_13917 // pc=2
	astore 18
	aload 18
	invokevirtual_short .virtual_4 // idx=4 pc=1
	astore 19
	aload 18
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokestatic_lib module:net_rim_loader-2.class#28.routine_18529(  ) // class#28
	istore 20
	aload 18
	getstatic_lib module:net_rim_loader-1.class#5.static_22 // class#5
	invokevirtual_short .virtual_6 // idx=6 pc=2
	ifeq Label207
	iload 20
	iipush 33554432
	ior 
	istore 20
Label207:
	aload_0 
	aload 12
	iload 20
	invokevirtual int augmentFieldModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore 20
	iload 20
	sipush 8256
	iand 
	sipush 8256
	if_icmpne Label229
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_56:"Invalid modifier combination for field: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label229:
	aload 12
	sipush 2048
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label277
	sipush 12288
	istore 21
	iconst_0 
	istore 22
	iload 20
	iload 21
	iand 
	iload 22
	if_icmpeq Label254
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_57:"Invalid modifier combination for interface field: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label254:
	sipush 962
	istore 21
	sipush 194
	istore 22
	iload 20
	iload 21
	iand 
	iload 22
	if_icmpeq Label277
	aload_0 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_58:"Invalid modifiers for interface field: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	iload 20
	iipush 134217728
	ior 
	istore 20
Label277:
	aload 18
	invokevirtual_short .virtual_5 // idx=5 pc=1
	astore 21
	aload_0 
	aload 21
	invokestatic_lib net.rim.tools.compiler.types.Type.routine_26683(  ) // Type
	astore 22
	aload 21
	invokevirtual_short .virtual_5 // idx=5 pc=1
	ifeq Label304
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_59:"Invalid type descriptor '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_60:"' for field: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label304:
	aconst_null 
	astore 23
	iload_6 
	ifeq Label309
	goto_w Label443
Label309:
	aload 18
	ldc literal_61:"ConstantValue"
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore 24
	aload 24
	ifnonnull Label316
	goto_w Label443
Label316:
	iload 20
	bipush 2
	iand 
	ifne Label321
	goto_w Label427
Label321:
	aload 22
	instanceof_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	ifne Label325
	goto_w Label369
Label325:
	aload 22
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	istore 25
	iload 25
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		

Label330:
	new_lib net.rim.tools.compiler.types.Constant//module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11
	dup 
	aload 24
	iload 25
	bipush 11
	if_icmpne Label338
	iconst_1 
	goto Label339
Label338:
	iconst_0 
Label339:
	invokevirtual int getConstantValue( net.rim.tools.compiler.classfile.Attribute, boolean ) // pc=2
	i2l 
	invokespecial_lib .routine_11808 // pc=3
	astore 23
	goto_w Label443
Label344:
	new_lib net.rim.tools.compiler.types.Constant//module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11
	dup 
	aload 24
	iload 25
	bipush 12
	if_icmpne Label352
	iconst_1 
	goto Label353
Label352:
	iconst_0 
Label353:
	invokevirtual long getConstantValueLong( net.rim.tools.compiler.classfile.Attribute, boolean ) // pc=2
	invokespecial_lib .routine_11808 // pc=3
	astore 23
	goto_w Label443
Label357:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_62:"Invalid type for static constant field: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label369:
	aload 22
	checkcastbranch_lib 
	astore 25
	aload 25
	aload_0 
	invokevirtual module:net_rim_loader-2.class#4 getStringClass( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label401
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_62:"Invalid type for static constant field: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label389:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_62:"Invalid type for static constant field: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label401:
	aload 24
	invokevirtual java.lang.String getConstantString( net.rim.tools.compiler.classfile.Attribute ) // pc=1
	astore 25
	iload 20
	sipush 512
	iand 
	bipush 64
	ior 
	sipush 576
	if_icmpne Label421
	aload 19
	ldc literal_63:"RIM_pragma"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label421
	aload_0 
	aload_7 
	aload 12
	aload 19
	aload 25
	invokespecial net.rim.tools.compiler.Compiler.processPragma // pc=5
Label421:
	new_lib net.rim.tools.compiler.types.Constant//module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11
	dup 
	aload 25
	invokespecial_lib .routine_11830 // pc=2
	astore 23
	goto Label443
Label427:
	iload 20
	bipush 64
	iand 
	bipush 64
	if_icmpne Label443
	aload_0 
	iconst_1 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_64:"Constant value final member data is not static: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateWarning( net.rim.tools.compiler.Compiler, boolean, java.lang.String, java.lang.String ) // pc=4
Label443:
	aload 12
	aload_0 
	aload 19
	aload 22
	iload 20
	aload 23
	invokenonvirtual_lib .routine_1647 // pc=6
	pop 
	iinc 15 1
	goto_w Label184
Label453:
	aload 9
	invokenonvirtual_lib .routine_13932 // pc=1
	istore 14
	aload 12
	iload 14
	invokenonvirtual_lib .routine_2348 // pc=2
	iconst_0 
	istore 15
Label461:
	iload 15
	iload 14
	if_icmplt Label465
	goto_w Label1097
Label465:
	aload 9
	iload 15
	invokenonvirtual_lib .routine_13952 // pc=2
	astore 18
	aload 18
	invokevirtual_short .virtual_3 // idx=3 pc=1
	astore 19
	aload 18
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokestatic_lib module:net_rim_loader-2.class#28.routine_18529(  ) // class#28
	istore 20
	aload 18
	ldc literal_65:"Synthetic"
	invokevirtual_short .virtual_6 // idx=6 pc=2
	ifeq Label484
	iload 20
	iipush 33554432
	ior 
	istore 20
Label484:
	aload 19
	ldc literal_66:"<init>"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label505
	iload 20
	bipush 16
	ior 
	istore 20
	iipush 32832
	istore 21
	iload 20
	iload 21
	iand 
	ifne Label499
	goto_w Label555
Label499:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	ldc literal_67:"Invalid modifier combination for constructor."
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label505:
	aload 19
	ldc literal_68:"<clinit>"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label518
	aload 18
	invokevirtual_short .virtual_5 // idx=5 pc=1
	invokevirtual_short .virtual_3 // idx=3 pc=1
	ldc literal_69:"()V"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label555
	iipush 1048578
	istore 20
	goto Label555
Label518:
	aload 19
	invokestatic_lib module:net_rim_loader-2.class#44.routine_23277(  ) // class#44
	ifne Label533
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_70:"Invalid method name: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label533:
	iload 20
	bipush 32
	iand 
	ifeq Label555
	iipush 49152
	istore 21
	iload 20
	iload 21
	iand 
	ifeq Label555
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_71:"Invalid modifier combination for method: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label555:
	aload_0 
	aload 12
	iload 20
	invokevirtual int augmentMethodModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore 20
	aconst_null 
	astore 21
	getstatic _parmTypes // Compiler
	dup 
	astore 22
	monitorenter 
	getstatic _parmTypes // Compiler
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload 18
	invokevirtual_short .virtual_5 // idx=5 pc=1
	astore 23
	aload_0 
	aload 23
	getstatic _parmTypes // Compiler
	invokestatic_lib net.rim.tools.compiler.types.Type.routine_26898(  ) // Type
	aload_0 
	aload 23
	invokestatic_lib net.rim.tools.compiler.types.Type.routine_26683(  ) // Type
	astore 24
	aload 23
	invokevirtual_short .virtual_5 // idx=5 pc=1
	ifeq Label600
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_59:"Invalid type descriptor '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 23
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_72:"' for method: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 19
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label600:
	getstatic _parmTypes // Compiler
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 17
	new_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	dup 
	aload 12
	aload 19
	aload 24
	iload 17
	iload 20
	invokespecial_lib .routine_18325 // pc=6
	astore 21
	iconst_0 
	istore 16
Label614:
	iload 16
	iload 17
	if_icmpge Label627
	aload 21
	iload 16
	aconst_null 
	getstatic _parmTypes // Compiler
	iload 16
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.Type//net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type
	invokenonvirtual_lib .routine_15983 // pc=4
	iinc 16 1
	goto Label614
Label627:
	getstatic _parmTypes // Compiler
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload 22
	monitorexit 
	goto Label638
	astore 26
	aload 22
	monitorexit 
	aload 26
	athrow 
Label638:
	iload_6 
	ifeq Label641
	goto_w Label1091
Label641:
	aload 18
	getstatic_lib module:net_rim_loader-1.class#5.static_14 // class#5
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore 22
	aload 22
	ifnull Label663
	aload 22
	invokevirtual int getNumExceptions( net.rim.tools.compiler.classfile.Attribute ) // pc=1
	istore 17
	iconst_0 
	istore 16
Label652:
	iload 16
	iload 17
	if_icmpge Label663
	aload_0 
	aload 22
	iload 16
	invokevirtual java.lang.String getExceptionClassName( net.rim.tools.compiler.classfile.Attribute, int ) // pc=2
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore 23
	iinc 16 1
	goto Label652
Label663:
	aload 18
	getstatic_lib module:net_rim_loader-1.class#5.static_12 // class#5
	invokevirtual_short .virtual_6 // idx=6 pc=2
	ifne Label668
	goto_w Label1062
Label668:
	iconst_0 
	istore 23
	aload 21
	iconst_1 
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label690
	aload_0 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_73:"Native method has code attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload 21
	iipush 134217728
	invokenonvirtual_lib .routine_19570 // pc=2
	iconst_1 
	istore 23
Label690:
	aload 21
	bipush 32
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label710
	aload_0 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_74:"Abstract method has code attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload 21
	iipush 134217728
	invokenonvirtual_lib .routine_19570 // pc=2
	iconst_1 
	istore 23
Label710:
	aload 18
	getstatic_lib module:net_rim_loader-1.class#5.static_12 // class#5
	invokevirtual_short .virtual_7 // idx=7 pc=2
	checkcast_lib net.rim.tools.compiler.classfile.AttributeCode//module:net_rim_loader-1.class#1 module:net_rim_loader-1.class#1 module:net_rim_loader-1.class#1
	astore 24
	iconst_0 
	istore 25
	aload 24
	invokenonvirtual_lib .routine_684 // pc=1
	astore 26
	aload 26
	ifnull Label741
	aload 26
	arraylength 
	istore 25
	iload 25
	iipush 65536
	if_icmplt Label741
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_75:"Code attribute too large: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label741:
	aload 24
	invokenonvirtual_lib .routine_695 // pc=1
	istore 27
	iload 27
	sipush 8000
	if_icmple Label749
	sipush 8000
	istore 27
Label749:
	aload 24
	invokenonvirtual_lib .routine_706 // pc=1
	istore 28
	iload 28
	sipush 8000
	if_icmple Label757
	sipush 8000
	istore 28
Label757:
	new InstructionCode
	dup 
	aload 21
	iload 27
	iload 28
	aload 26
	aload 9
	invokenonvirtual_lib .routine_13804 // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionCode.<init> // pc=6
	astore 29
	aload 29
	iload 23
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setBadCode // pc=2
	aload 24
	invokenonvirtual_lib .routine_717 // pc=1
	istore 17
	iload 17
	ifgt Label776
	goto_w Label855
Label776:
	aload 24
	invokenonvirtual_lib .routine_737 // pc=1
	astore 30
	iconst_0 
	istore 16
Label781:
	iload 16
	iload 17
	if_icmplt Label785
	goto_w Label852
Label785:
	aload 30
	iload 16
	aaload 
	astore 31
	aload 31
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore 32
	aload 31
	invokevirtual_short .virtual_4 // idx=4 pc=1
	istore 33
	iload 33
	iload 32
	if_icmple Label801
	iload 33
	iload 25
	if_icmple Label814
Label801:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_76:"invalid exception handler range in: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label814:
	aload 31
	invokevirtual_short .virtual_5 // idx=5 pc=1
	istore 34
	iload 34
	iload 25
	if_icmplt Label833
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_77:"invalid exception handler offset in: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label833:
	aconst_null 
	astore 35
	aload 31
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore 36
	aload 36
	ifnonnull Label843
	aconst_null 
	astore 35
	goto Label847
Label843:
	aload_0 
	aload 36
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore 35
Label847:
	aload 31
	aload 35
	invokevirtual_short .virtual_7 // idx=7 pc=2
	iinc 16 1
	goto_w Label781
Label852:
	aload 29
	aload 30
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setHandlers // pc=2
Label855:
	aload 24
	getstatic_lib module:net_rim_loader-1.class#5.static_20 // class#5
	invokenonvirtual_lib .routine_748 // pc=2
	ifne Label860
	goto_w Label946
Label860:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifne Label863
	goto_w Label946
Label863:
	aload 24
	getstatic_lib module:net_rim_loader-1.class#5.static_20 // class#5
	invokenonvirtual_lib .routine_770 // pc=2
	checkcast_lib net.rim.tools.compiler.classfile.AttributeStackMap//module:net_rim_loader-1.class#8 module:net_rim_loader-1.class#8 module:net_rim_loader-1.class#8
	astore 30
	aload 30
	invokenonvirtual_lib .routine_1639 // pc=1
	astore 31
	aload 31
	ifnonnull Label875
	iconst_0 
	goto Label877
Label875:
	aload 31
	arraylength 
Label877:
	istore 17
	iload 17
	ifgt Label881
	goto_w Label946
Label881:
	iconst_0 
	istore 16
Label883:
	iload 16
	iload 17
	if_icmplt Label887
	goto_w Label943
Label887:
	aload 31
	iload 16
	aaload 
	astore 32
	aload_0 
	aload 12
	aload 32
	aload 26
	invokestatic_lib net.rim.tools.compiler.types.Type.routine_27359(  ) // Type
	aload 32
	invokevirtual_short .virtual_8 // idx=8 pc=1
	iload 28
	if_icmple Label918
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_78:"Invalid locals map in method: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_79:" at offset: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 32
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label918:
	aload 32
	invokevirtual_short .virtual_11 // idx=11 pc=1
	iload 27
	if_icmple Label941
	aload_0 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_80:"stack map too big: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_79:" at offset: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 32
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload 21
	iipush 134217728
	invokenonvirtual_lib .routine_19570 // pc=2
Label941:
	iinc 16 1
	goto_w Label883
Label943:
	aload 29
	aload 31
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setStackMaps // pc=2
Label946:
	aload 24
	getstatic_lib module:net_rim_loader-1.class#5.static_21 // class#5
	invokenonvirtual_lib .routine_748 // pc=2
	ifne Label951
	goto_w Label1058
Label951:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifne Label954
	goto_w Label1058
Label954:
	aload 24
	getstatic_lib module:net_rim_loader-1.class#5.static_21 // class#5
	invokenonvirtual_lib .routine_770 // pc=2
	checkcast_lib net.rim.tools.compiler.classfile.AttributeStackMapTable//module:net_rim_loader-1.class#11 module:net_rim_loader-1.class#11 module:net_rim_loader-1.class#11
	astore 30
	aload 21
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_16565 // pc=2
	astore 31
	aconst_null 
	astore 32
	aload 30
	invokenonvirtual_lib .routine_2326 // pc=1
	astore 33
	aload 33
	ifnonnull Label972
	iconst_0 
	goto Label974
Label972:
	aload 33
	arraylength 
Label974:
	istore 17
	iload 17
	ifgt Label978
	goto_w Label1058
Label978:
	iload 17
	newarray_object_lib net.rim.tools.compiler.classfile.AttributeStackMapEntry//module:net_rim_loader-1.class#9 module:net_rim_loader-1.class#9 module:net_rim_loader-1.class#9
	astore 34
	iconst_0 
	istore 16
Label983:
	iload 16
	iload 17
	if_icmplt Label987
	goto_w Label1055
Label987:
	aload 33
	iload 16
	aaload 
	astore 35
	aload_0 
	aload 12
	aload 31
	aload 32
	aload 35
	aload 26
	invokestatic_lib net.rim.tools.compiler.types.Type.routine_27425(  ) // Type
	aload 35
	invokevirtual_short .virtual_7 // idx=7 pc=1
	astore 31
	aload 35
	invokevirtual_short .virtual_10 // idx=10 pc=1
	astore 32
	aload 34
	iload 16
	aload 35
	aastore 
	aload 35
	invokevirtual_short .virtual_8 // idx=8 pc=1
	iload 28
	if_icmple Label1030
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_81:"Oversize locals map in method: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_79:" at offset: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 35
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label1030:
	aload 35
	invokevirtual_short .virtual_11 // idx=11 pc=1
	iload 27
	if_icmple Label1053
	aload_0 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_82:"stack map too large: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_79:" at offset: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 35
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload 21
	iipush 134217728
	invokenonvirtual_lib .routine_19570 // pc=2
Label1053:
	iinc 16 1
	goto_w Label983
Label1055:
	aload 29
	aload 34
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setStackMaps // pc=2
Label1058:
	aload 21
	aload 29
	invokenonvirtual_lib .routine_16325 // pc=2
	goto Label1091
Label1062:
	aload 21
	invokenonvirtual_lib .routine_16065 // pc=1
	istore 23
	aload 21
	new InstructionCode
	dup 
	aload 21
	iconst_0 
	iload 23
	aconst_null 
	aconst_null 
	invokespecial net.rim.tools.compiler.analysis.InstructionCode.<init> // pc=6
	invokenonvirtual_lib .routine_16325 // pc=2
	aload 21
	bipush 33
	invokenonvirtual_lib .routine_19625 // pc=2
	ifne Label1091
	aload_0 
	iconst_0 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_83:"Method has no code attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateWarning( net.rim.tools.compiler.Compiler, boolean, java.lang.String, java.lang.String ) // pc=4
Label1091:
	aload 12
	aload_0 
	aload 21
	invokenonvirtual_lib .routine_2377 // pc=3
	iinc 15 1
	goto_w Label461
Label1097:
	iload_6 
	ifne Label1103
	aload 12
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
Label1103:
	aload_0 
	aconst_null 
	putfield .field_48_48   // get_name_1:  .field_48_48   // get_name_2:  .field_48_48   // get_Name:    .field_48_48   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 48
	goto Label1143
	astore 10
	getstatic _verbosity // Compiler
	bipush 2
	if_icmplt Label1113
	aload 10
	invokevirtual printStackTrace( java.lang.Throwable ) // pc=1
Label1113:
	aload 10
	checkcastbranch_lib 
	astore 11
	goto Label1141
Label1117:
	aload 10
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore 12
	aload 12
	ifnonnull Label1129
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_2 
	ldc literal_84:"Invalid class file"
	invokespecial_lib .routine_9821 // pc=3
	astore 11
	goto Label1141
Label1129:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_85:"Invalid class file: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 12
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	astore 11
Label1141:
	aload 11
	athrow 
Label1143:
	aload 9
	areturn 
	}


private parseJar( net.rim.tools.compiler.Compiler, java.lang.String, net.rim.tools.jar.JarInputStream ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifeq Label25
	aload_2 
	invokevirtual module:net_rim_loader-2.class#25 getManifest( net.rim.tools.jar.JarInputStream ) // pc=1
	astore_4 
	aload_4 
	ifnull Label25
	getstatic _verbosity // Compiler
	iconst_1 
	if_icmplt Label16
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	ldc literal_86:"Parsing manifest"
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label16:
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_0 
	aload_1 
	aload_4 
	invokevirtual parseManifest( net.rim.tools.compiler.JadSupport, net.rim.tools.compiler.Compiler, java.lang.String, module:net_rim_loader-2.class#25 ) // pc=4
	iconst_1 
	istore_3 
	aconst_null 
	astore_4 
Label25:
	aconst_null 
	astore_4 
Label27:
	aload_2 
	invokevirtual module:net_rim_loader-2.class#22 getNextJarEntry( net.rim.tools.jar.JarInputStream ) // pc=1
	dup 
	astore_4 
	ifnonnull Label33
	goto_w Label171
Label33:
	aload_4 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	ifeq Label37
	goto_w Label168
Label37:
	aload_4 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	astore_5 
	aload_5 
	stringlength 
	istore_6 
	aload_4 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	istore_7 
	aload_5 
	getstatic_lib module:net_rim_loader-2.class#19.static_51 // class#19
	invokestatic_lib module:net_rim_loader-2.class#19.routine_13233(  ) // class#19
	bipush -1
	if_icmpeq Label64
	aload_0 
	aload_1 
	aload_5 
	aload_2 
	iload_7 
	aconst_null 
	iconst_0 
	invokespecial net.rim.tools.compiler.Compiler.parseClassfile // pc=7
	pop 
	aload_0_getfield .field_64_64   // get_name_1:  .field_64_64   // get_name_2:  .field_64_64   // get_Name:    .field_64_64   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 64
	bipush -1
	invokeinterface interfacemethodref_2 // pc=2 guess=1
	goto_w Label168
Label64:
	iload_6 
	bipush 20
	if_icmpne Label105
	aload_5 
	iconst_1 
	iconst_0 
	ldc literal_87:"META-INF/MANIFEST.MF"
	iconst_0 
	iload_6 
	invokenonvirtual_lib java.lang.String.regionMatches // pc=6
	ifeq Label105
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifne Label78
	goto_w Label168
Label78:
	getstatic _verbosity // Compiler
	iconst_1 
	if_icmplt Label90
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_88:"Parsing manifest: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label90:
	new_lib net.rim.tools.jar.Manifest//module:net_rim_loader-2.class#25 module:net_rim_loader-2.class#25 module:net_rim_loader-2.class#25
	dup 
	aload_2 
	invokespecial_lib .routine_15875 // pc=2
	astore 8
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_0 
	aload_1 
	aload 8
	invokevirtual parseManifest( net.rim.tools.compiler.JadSupport, net.rim.tools.compiler.Compiler, java.lang.String, module:net_rim_loader-2.class#25 ) // pc=4
	iconst_1 
	istore_3 
	aconst_null 
	astore 8
	goto_w Label168
Label105:
	getstatic _verbosity // Compiler
	iconst_1 
	if_icmplt Label117
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_89:"Reading resource: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label117:
	aconst_null 
	astore 8
	iload_7 
	iipush 4194304
	if_icmple Label138
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_90:": too large: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_91:" bytes"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label138:
	aload_5 
	getstatic_lib module:net_rim_loader-2.class#19.static_52 // class#19
	invokestatic_lib module:net_rim_loader-2.class#19.routine_13281(  ) // class#19
	bipush -1
	if_icmpeq Label153
	new ImageFile
	dup 
	aload_5 
	aload_2 
	iload_7 
	invokespecial net.rim.tools.compiler.ImageFile.<init> // pc=4
	astore 9
	aload 9
	astore 8
	goto Label160
Label153:
	new ResourceFile
	dup 
	aload_5 
	aload_2 
	iload_7 
	invokespecial net.rim.tools.compiler.ResourceFile.<init> // pc=4
	astore 8
Label160:
	aload_0_getfield .field_46_46   // get_name_1:  .field_46_46   // get_name_2:  .field_46_46   // get_Name:    .field_46_46   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 46
	aload 8
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	bipush -1
	if_icmpne Label168
	aload_0_getfield .field_46_46   // get_name_1:  .field_46_46   // get_name_2:  .field_46_46   // get_Name:    .field_46_46   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 46
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label168:
	aload_2 
	invokevirtual closeEntry( net.rim.tools.jar.JarInputStream ) // pc=1
	goto_w Label27
Label171:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifeq Label188
	iload_3 
	ifne Label188
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	sipush 907
	aconst_null 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_92:"Missing manifest: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9786 // pc=4
	athrow 
Label188:
	return 
	}


private write( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#53[] ); // address: 0
	{
	enter 
	aload_1 
	arraylength 
	istore_5 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_6 
	iconst_0 
	istore_2 
Label10:
	iload_2 
	iload_5 
	if_icmpge Label26
	aload_1 
	iload_2 
	aaload 
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_29649 // pc=1
	aload_7 
	invokenonvirtual_lib .routine_29638 // pc=1
	aload_6 
	invokenonvirtual_lib .routine_21489 // pc=3
	pop 
	iinc 2 1
	goto Label10
Label26:
	aload_6 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label42
	aload_0_getfield .field_61_61   // get_name_1:  .field_61_61   // get_name_2:  .field_61_61   // get_Name:    .field_61_61   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 61
	ifeq Label36
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
	goto Label42
Label36:
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label42:
	iload_5 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_7 
	iconst_0 
	istore_2 
Label47:
	iload_2 
	iload_5 
	if_icmpge Label82
	aload_0_getfield .field_49_49   // get_name_1:  .field_49_49   // get_name_2:  .field_49_49   // get_Name:    .field_49_49   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 49
	iload_2 
	getstatic_lib module:net_rim_loader-2.class#19.static_45 // class#19
	invokestatic_lib module:net_rim_loader-2.class#19.routine_13397(  ) // class#19
	astore 8
	aload_7 
	iload_2 
	aload_0_getfield .field_64_64   // get_name_1:  .field_64_64   // get_name_2:  .field_64_64   // get_Name:    .field_64_64   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 64
	aload 8
	invokeinterface interfacemethodref_3 // pc=2 guess=2
	aastore 
	aload_0_getfield .field_64_64   // get_name_1:  .field_64_64   // get_name_2:  .field_64_64   // get_Name:    .field_64_64   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 64
	bipush -1
	invokeinterface interfacemethodref_2 // pc=2 guess=3
	aload_1 
	iload_2 
	aaload 
	invokenonvirtual_lib .routine_29649 // pc=1
	aload_7 
	iload_2 
	aaload 
	invokenonvirtual_lib .routine_21452 // pc=2
	aload_7 
	iload_2 
	aaload 
	invokevirtual close( java.io.OutputStream ) // pc=1
	aload_7 
	iload_2 
	aconst_null 
	aastore 
	iinc 2 1
	goto Label47
Label82:
	iconst_0 
	istore_2 
Label84:
	iload_2 
	iload_5 
	if_icmpge Label97
	aload_7 
	iload_2 
	aaload 
	astore 8
	aload 8
	ifnull Label95
	aload 8
	invokevirtual close( java.io.OutputStream ) // pc=1
Label95:
	iinc 2 1
	goto Label84
Label97:
	aconst_null 
	astore_7 
	return 
	astore 9
	iconst_0 
	istore_2 
Label103:
	iload_2 
	iload_5 
	if_icmpge Label116
	aload_7 
	iload_2 
	aaload 
	astore 10
	aload 10
	ifnull Label114
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
Label114:
	iinc 2 1
	goto Label103
Label116:
	aconst_null 
	astore_7 
	aload 9
	athrow 
	}


private parseJads( net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	iconst_1 
	istore_1 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_93:"rapc_rapcFiles"
	invokevirtual java.lang.String getQuotedProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_2 
	aload_2 
	ifnull Label16
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_0 
	aload_2 
	iload_1 
	invokevirtual parseJad( net.rim.tools.compiler.JadSupport, net.rim.tools.compiler.Compiler, java.lang.String, boolean ) // pc=4
	iconst_0 
	istore_1 
Label16:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_94:"jad"
	invokevirtual java.lang.String getQuotedProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	ifnull Label29
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_0 
	aload_3 
	iload_1 
	invokevirtual parseJad( net.rim.tools.compiler.JadSupport, net.rim.tools.compiler.Compiler, java.lang.String, boolean ) // pc=4
	iconst_0 
	istore_1 
Label29:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_95:"jadContent"
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_array 1 2
	astore_4 
	aload_4 
	ifnull Label43
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_4 
	invokestatic_lib module:net_rim_loader-2.class#3.routine_632(  ) // class#3
	iload_1 
	invokevirtual parseJad( net.rim.tools.compiler.JadSupport, java.lang.String, boolean ) // pc=3
	iconst_0 
	istore_1 
Label43:
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_96:"jadString"
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_5 
	aload_5 
	ifnull Label56
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_5 
	iload_1 
	invokevirtual parseJad( net.rim.tools.compiler.JadSupport, java.lang.String, boolean ) // pc=3
	iconst_0 
	istore_1 
Label56:
	aload_0_getfield .field_47_47   // get_name_1:  .field_47_47   // get_name_2:  .field_47_47   // get_Name:    .field_47_47   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 47
	invokevirtual int size( java.util.Vector ) // pc=1
	ifeq Label63
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_0_getfield .field_47_47   // get_name_1:  .field_47_47   // get_name_2:  .field_47_47   // get_Name:    .field_47_47   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 47
	iload_1 
	invokevirtual parseJad( net.rim.tools.compiler.JadSupport, java.util.Vector, boolean ) // pc=3
Label63:
	aload_0 
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	ldc literal_97:"MIDlet-Version"
	invokevirtual routine
	putfield .field_51_51   // get_name_1:  .field_51_51   // get_name_2:  .field_51_51   // get_Name:    .field_51_51   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 51
	return 
	}


private compile( net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.util.ExecutionTimer//module:net_rim_loader-2.class#16 module:net_rim_loader-2.class#16 module:net_rim_loader-2.class#16
	dup 
	ldc literal_98:"parse"
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokespecial_lib .routine_12310 // pc=3
	astore_3 
	aload_0 
	invokespecial net.rim.tools.compiler.Compiler.processProperties // pc=1
	iconst_0 
	istore_4 
	aload_0_getfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	ifnonnull Label14
	goto_w Label99
Label14:
	aload_0_getfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_1 
Label19:
	iload_1 
	iload_2 
	if_icmplt Label23
	goto_w Label96
Label23:
	aconst_null 
	astore_5 
	aconst_null 
	astore_6 
	aload_0_getfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_5 
	aload_0_getfield .field_64_64   // get_name_1:  .field_64_64   // get_name_2:  .field_64_64   // get_Name:    .field_64_64   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 64
	aload_5 
	invokeinterface interfacemethodref_4 // pc=2 guess=4
	astore_6 
	aconst_null 
	astore_7 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifeq Label50
	iload_1 
	ifne Label50
	new_lib net.rim.tools.compiler.io.DigestInputStream//net.rim.tools.compiler.io.DigestInputStream net.rim.tools.compiler.io.DigestInputStream net.rim.tools.compiler.io.DigestInputStream
	dup 
	invokestatic_lib net.rim.device.api.crypto.Digest getMIDletSignatureDigest(  ) // MIDletSecurity
	aload_6 
	invokespecial_lib .routine_12057 // pc=3
	astore_7 
	aload_7 
	astore_6 
Label50:
	new_lib net.rim.tools.jar.JarInputStream//net.rim.tools.jar.JarInputStream net.rim.tools.jar.JarInputStream net.rim.tools.jar.JarInputStream
	dup 
	aload_6 
	iconst_0 
	invokespecial_lib .routine_15359 // pc=3
	astore 8
	aconst_null 
	astore_6 
	aload_0 
	aload_5 
	aload 8
	invokespecial net.rim.tools.compiler.Compiler.parseJar // pc=3
	aload 8
	invokevirtual close( net.rim.tools.jar.JarInputStream ) // pc=1
	aconst_null 
	astore 8
	iload_4 
	ifne Label72
	iconst_1 
	istore_4 
	aload_0 
	invokespecial net.rim.tools.compiler.Compiler.parseJads // pc=1
Label72:
	aload_7 
	ifnull Label94
	aload_7 
	invokevirtual int getLength( net.rim.tools.compiler.io.DigestInputStream ) // pc=1
	istore 9
	iload 9
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	invokevirtual int getJarSize( net.rim.tools.compiler.JadSupport ) // pc=1
	if_icmpeq Label88
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	sipush 904
	aload_5 
	ldc literal_99:"jar size does not match MIDlet-Jar-Size attribute"
	invokespecial_lib .routine_9786 // pc=4
	athrow 
Label88:
	aload_0_getfield .field_44_44   // get_name_1:  .field_44_44   // get_name_2:  .field_44_44   // get_Name:    .field_44_44   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 44
	aload_7 
	invokevirtual net.rim.device.api.crypto.Digest getDigest( net.rim.tools.compiler.io.DigestInputStream ) // pc=1
	invokevirtual verifySignature( net.rim.tools.compiler.JadSupport, net.rim.device.api.crypto.Digest ) // pc=2
	aconst_null 
	astore_7 
Label94:
	iinc 1 1
	goto_w Label19
Label96:
	aload_0 
	aconst_null 
	putfield .field_45_45   // get_name_1:  .field_45_45   // get_name_2:  .field_45_45   // get_Name:    .field_45_45   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 45
Label99:
	iload_4 
	ifne Label103
	aload_0 
	invokespecial net.rim.tools.compiler.Compiler.parseJads // pc=1
Label103:
	aload_3 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	new_lib net.rim.tools.compiler.util.ExecutionTimer//module:net_rim_loader-2.class#16 module:net_rim_loader-2.class#16 module:net_rim_loader-2.class#16
	dup 
	ldc literal_100:"analysis"
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokespecial_lib .routine_12310 // pc=3
	astore_5 
	aload_0_getfield .field_64_64   // get_name_1:  .field_64_64   // get_name_2:  .field_64_64   // get_Name:    .field_64_64   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 64
	iconst_0 
	invokeinterface interfacemethodref_2 // pc=2 guess=5
	getstatic _verbosity // Compiler
	iconst_1 
	if_icmplt Label120
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	ldc literal_101:"Resolving"
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label120:
	aload_0 
	invokespecial net.rim.tools.compiler.Compiler.resolve // pc=1
	getstatic _verbosity // Compiler
	iconst_1 
	if_icmplt Label128
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	ldc literal_102:"Optimizing"
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label128:
	aload_0 
	invokespecial net.rim.tools.compiler.Compiler.optimize // pc=1
	astore_6 
	aload_0_getfield .field_64_64   // get_name_1:  .field_64_64   // get_name_2:  .field_64_64   // get_Name:    .field_64_64   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 64
	iconst_1 
	invokeinterface interfacemethodref_2 // pc=2 guess=5
	getstatic _verbosity // Compiler
	iconst_1 
	if_icmplt Label140
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	ldc literal_103:"Populating"
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label140:
	aload_0 
	aload_6 
	invokespecial net.rim.tools.compiler.Compiler.populate // pc=2
	aload_5 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	new_lib net.rim.tools.compiler.util.ExecutionTimer//module:net_rim_loader-2.class#16 module:net_rim_loader-2.class#16 module:net_rim_loader-2.class#16
	dup 
	ldc literal_104:"write"
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokespecial_lib .routine_12310 // pc=3
	astore_7 
	aload_0 
	aload_6 
	invokespecial net.rim.tools.compiler.Compiler.write // pc=2
	aload_0_getfield .field_64_64   // get_name_1:  .field_64_64   // get_name_2:  .field_64_64   // get_Name:    .field_64_64   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 64
	bipush 2
	invokeinterface interfacemethodref_2 // pc=2 guess=5
	aload_7 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	return 
	}


private handleResources( net.rim.tools.compiler.Compiler ); // address: 0
	{
	noenter_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean isPreverified( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	}


public final generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifeq Label9
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_1 
	aload_2 
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label9:
	aload_0 
	iconst_0 
	aload_1 
	aload_2 
	invokevirtual generateWarning( net.rim.tools.compiler.Compiler, boolean, java.lang.String, java.lang.String ) // pc=4
	return 
	}


public final generateWarning( net.rim.tools.compiler.Compiler, boolean, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	ldc literal_6:"!: "
	astore_4 
	aload_2 
	ifnull Label15
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_7:": "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual print( java.io.PrintStream, java.lang.String ) // pc=2
Label15:
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_8:"Warning"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
	return 
	}


public boolean doOptIns( net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	ldc literal_9:"noopt"
	invokevirtual java.lang.String getProperty( net.rim.tools.compiler.util.CompilerProperties, java.lang.String ) // pc=2
	ifnonnull Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final clearOptimization( net.rim.tools.compiler.Compiler, int ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_1 
	bipush -1
	ixor 
	iand 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	return 
	}


public boolean isNoWx( net.rim.tools.compiler.Compiler, java.lang.String ); // address: 0
	{
	enter_narrow 
	iconst_0 
	ireturn 
	}


public final boolean isOptimizePackage( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	}


public final boolean isMakingMIDlet( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	}


public module:net_rim_loader-2.class#4 getWidgetClass( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_53_53   // get_name_1:  .field_53_53   // get_name_2:  .field_53_53   // get_Name:    .field_53_53   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 53
	}


public final boolean getTraceback( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	}


public final boolean isNoName( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	}


public final int getOptimization( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	}


public final referenceClass( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	astore_2 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	istore_4 
Label8:
	iload_4 
	iload_3 
	if_icmpge Label25
	aload_1 
	aload_2 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	invokenonvirtual_lib .routine_7629 // pc=2
	ifge Label23
	aload_2 
	aload_1 
	iload_4 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	return 
Label23:
	iinc 4 1
	goto Label8
Label25:
	aload_2 
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final useClassType( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	astore_2 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label8:
	iload_4 
	iload_3 
	if_icmpge Label25
	aload_1 
	aload_2 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	invokenonvirtual_lib .routine_7629 // pc=2
	ifge Label23
	aload_2 
	aload_1 
	iload_4 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	return 
Label23:
	iinc 4 1
	goto Label8
Label25:
	aload_2 
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final useMethod( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#26 ); // address: 0
	{
	enter 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	astore_2 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	istore_4 
Label8:
	iload_4 
	iload_3 
	if_icmpge Label27
	aload_1 
	invokenonvirtual_lib .routine_19303 // pc=1
	aload_2 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	invokenonvirtual_lib .routine_19303 // pc=1
	invokenonvirtual_lib .routine_7629 // pc=2
	ifge Label25
	aload_2 
	aload_1 
	iload_4 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	return 
Label25:
	iinc 4 1
	goto Label8
Label27:
	aload_2 
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final addPotentialMIDlet( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifne Label4
	return 
Label4:
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	ifnonnull Label11
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
Label11:
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final net.rim.tools.compiler.types.Type getNullType( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final net.rim.tools.compiler.types.Type getVoidType( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final net.rim.tools.compiler.types.Type getBooleanType( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final net.rim.tools.compiler.types.Type getByteType( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final net.rim.tools.compiler.types.Type getCharType( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final net.rim.tools.compiler.types.Type getShortType( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public final net.rim.tools.compiler.types.Type getIntType( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final net.rim.tools.compiler.types.Type getLongType( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public final net.rim.tools.compiler.types.Type getFloatType( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public final net.rim.tools.compiler.types.Type getDoubleType( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final module:net_rim_loader-2.class#4 getObjectClass( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	}


public final module:net_rim_loader-2.class#4 getClassClass( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	}


public final module:net_rim_loader-2.class#4 getStringClass( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	}


public final module:net_rim_loader-2.class#4 getStringBufferClass( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	}


public final module:net_rim_loader-2.class#4 getBaseExceptionClass( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	}


public final int augmentFieldModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	iipush 131072
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label9
	iload_2 
	iipush 131072
	ior 
	istore_2 
Label9:
	aload_1 
	iipush 524288
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label17
	iload_2 
	iipush 524288
	ior 
	istore_2 
Label17:
	iload_2 
	bipush 2
	iand 
	ifne Label25
	iload_2 
	bipush 4
	ior 
	istore_2 
Label25:
	iload_2 
	ireturn 
	}


public final int augmentMethodModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	iipush 131072
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label9
	iload_2 
	iipush 131072
	ior 
	istore_2 
Label9:
	aload_1 
	iipush 524288
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label17
	iload_2 
	iipush 524288
	ior 
	istore_2 
Label17:
	iload_2 
	bipush 16
	iand 
	ifne Label29
	aload_1 
	bipush 64
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label29
	iload_2 
	bipush 64
	ior 
	istore_2 
Label29:
	iload_2 
	bipush 8
	ior 
	istore_2 
	iload_2 
	ireturn 
	}


public final int augmentClassModifiers( net.rim.tools.compiler.Compiler, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifeq Label7
	iload_1 
	iipush 524288
	ior 
	istore_1 
Label7:
	iload_1 
	ireturn 
	}


public final boolean checkStaticMethodForExport( net.rim.tools.compiler.Compiler, java.lang.String, module:net_rim_loader-2.class#26 ); // address: 0
	{
	enter 
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_1 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_3 
	iload_3 
	bipush -1
	if_icmpne Label10
	iconst_0 
	ireturn 
Label10:
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_4 
	aload_4 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifne Label19
	iconst_0 
	ireturn 
Label19:
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	new_lib net.rim.tools.compiler.util.Exported//module:net_rim_loader-2.class#17 module:net_rim_loader-2.class#17 module:net_rim_loader-2.class#17
	dup 
	aload_1 
	aload_2 
	invokespecial_lib .routine_12449 // pc=3
	iload_3 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	iconst_1 
	ireturn 
	}


public final boolean checkStaticDataForExport( net.rim.tools.compiler.Compiler, java.lang.String, module:net_rim_loader-2.class#4, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_1 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_4 
	iload_4 
	bipush -1
	if_icmpne Label10
	iconst_0 
	ireturn 
Label10:
	aload_0_getfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_5 
	aload_5 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifne Label19
	iconst_0 
	ireturn 
Label19:
	aload_0_getfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	new_lib net.rim.tools.compiler.util.Exported//module:net_rim_loader-2.class#17 module:net_rim_loader-2.class#17 module:net_rim_loader-2.class#17
	dup 
	aload_1 
	aload_2 
	iload_3 
	invokespecial_lib .routine_12479 // pc=4
	iload_4 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	iconst_1 
	ireturn 
	}


public final boolean checkFieldForExport( net.rim.tools.compiler.Compiler, java.lang.String, module:net_rim_loader-2.class#4, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_1 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_4 
	iload_4 
	bipush -1
	if_icmpne Label10
	iconst_0 
	ireturn 
Label10:
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_5 
	aload_5 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifne Label19
	iconst_0 
	ireturn 
Label19:
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	new_lib net.rim.tools.compiler.util.Exported//module:net_rim_loader-2.class#17 module:net_rim_loader-2.class#17 module:net_rim_loader-2.class#17
	dup 
	aload_1 
	aload_2 
	iload_3 
	invokespecial_lib .routine_12479 // pc=4
	iload_4 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	iconst_1 
	ireturn 
	}


public final boolean checkBinaryForExport( net.rim.tools.compiler.Compiler, java.lang.String, byte[] ); // address: 0
	{
	enter 
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_1 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_3 
	iload_3 
	bipush -1
	if_icmpne Label10
	iconst_0 
	ireturn 
Label10:
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_4 
	aload_4 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifne Label19
	iconst_0 
	ireturn 
Label19:
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	new_lib net.rim.tools.compiler.util.Exported//module:net_rim_loader-2.class#17 module:net_rim_loader-2.class#17 module:net_rim_loader-2.class#17
	dup 
	aload_1 
	aload_2 
	invokespecial_lib .routine_12424 // pc=3
	iload_3 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	iconst_1 
	ireturn 
	}


public java.util.Vector getObjectClassVTable( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	}


public module:net_rim_loader-2.class#6 getDigest( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_63_63   // get_name_1:  .field_63_63   // get_name_2:  .field_63_63   // get_Name:    .field_63_63   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 63
	}


public net.rim.tools.compiler.Host getHost( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_64_64   // get_name_1:  .field_64_64   // get_name_2:  .field_64_64   // get_Name:    .field_64_64   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 64
	}


public java.util.Vector getObjectClassVirtualMethods( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	}


public java.util.Vector getObjectClassMethods( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	}


public prepopulateObjectVTableMethods( net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	ldc literal_10:"hashCode"
	astore_1 
	ldc literal_11:"equals"
	astore_2 
	ldc literal_12:"toString"
	astore_3 
	aload_0_getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	astore_4 
	aload_0_getfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	astore_5 
	aload_5 
	iipush 131072
	invokenonvirtual_lib .routine_1278 // pc=2
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_6 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_7 
	iconst_0 
	istore 8
Label23:
	iload 8
	iload_7 
	if_icmplt Label27
	goto_w Label116
Label27:
	aconst_null 
	astore 9
	aload_6 
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_4 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 10
	aload_1 
	aload 10
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label44
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore 9
	goto Label73
Label44:
	aload_2 
	aload 10
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label54
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore 9
	aload_6 
	aload_5 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label73
Label54:
	aload_3 
	aload 10
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label61
	aload_0_getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	astore 9
	goto Label73
Label61:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aconst_null 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_13:"unrecognized method in java.lang.object: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label73:
	sipush 128
	istore 11
	aload_0 
	aload_5 
	iload 11
	invokevirtual int augmentMethodModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore 11
	aload_6 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 12
	new_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	dup 
	aload_5 
	aload 10
	aload 9
	iload 12
	iload 11
	invokespecial_lib .routine_18325 // pc=6
	astore 13
	iconst_0 
	istore 14
Label94:
	iload 14
	iload 12
	if_icmpge Label107
	aload 13
	iload 14
	aconst_null 
	aload_6 
	iload 14
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.Type//net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type
	invokenonvirtual_lib .routine_15983 // pc=4
	iinc 14 1
	goto Label94
Label107:
	aload 13
	iconst_1 
	invokenonvirtual_lib .routine_15905 // pc=2
	aload_5 
	aload_0 
	aload 13
	invokenonvirtual_lib .routine_2377 // pc=3
	iinc 8 1
	goto_w Label23
Label116:
	return 
	}


public module:net_rim_loader-2.class#18 findStatic( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, net.rim.tools.compiler.types.Type, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	ifnonnull Label14
	ldc literal_14:"/static.def"
	astore_4 
	aload_0 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	aload_4 
	invokevirtual java.io.InputStream getResourceAsStream( java.lang.Class, java.lang.String ) // pc=2
	astore_5 
	aload_0 
	aload_4 
	aload_5 
	invokespecial net.rim.tools.compiler.Compiler.readFinalStatics // pc=3
Label14:
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	astore_4 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 80
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_1 
	invokenonvirtual_lib .routine_1154 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_4 
	aload_5 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_6 
	iload_6 
	bipush -1
	if_icmpne Label35
	aconst_null 
	areturn 
Label35:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 67
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_1 
	invokenonvirtual_lib .routine_25353 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_7 
	iinc 6 1
Label49:
	iload_6 
	iload_7 
	if_icmpge Label73
	aload_4 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload 8
	iconst_0 
	stringaload 
	istore 9
	iload 9
	bipush 80
	if_icmpne Label66
	aconst_null 
	areturn 
Label66:
	aload 8
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label71
	goto Label73
Label71:
	iinc 6 1
	goto Label49
Label73:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 70
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_2 
	invokevirtual java.lang.String encodeType( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 61
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	iinc 6 1
Label90:
	iload_6 
	iload_7 
	if_icmplt Label94
	goto_w Label155
Label94:
	aload_4 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload 8
	iconst_0 
	stringaload 
	istore 9
	iload 9
	bipush 80
	if_icmpeq Label109
	iload 9
	bipush 67
	if_icmpne Label111
Label109:
	aconst_null 
	areturn 
Label111:
	aload 8
	aload_5 
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label153
	aload 8
	aload_5 
	stringlength 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore 10
	aconst_null 
	astore 11
	aload_2 
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 7
	if_icmpne Label132
	new_lib net.rim.tools.compiler.types.Constant//module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11
	dup 
	aload 10
	invokespecial_lib .routine_11830 // pc=2
	astore 11
	goto Label138
Label132:
	new_lib net.rim.tools.compiler.types.Constant//module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11
	dup 
	aload 10
	invokestatic_lib long parseLong( java.lang.String ) // Long
	invokespecial_lib .routine_11808 // pc=3
	astore 11
Label138:
	aload_0 
	aload_1 
	iipush 33554626
	invokevirtual int augmentFieldModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore 12
	new_lib net.rim.tools.compiler.types.Field//module:net_rim_loader-2.class#18 module:net_rim_loader-2.class#18 module:net_rim_loader-2.class#18
	dup 
	aload_3 
	aload_2 
	aload_1 
	iload 12
	bipush -1
	aload 11
	invokespecial_lib .routine_13096 // pc=7
	areturn 
Label153:
	iinc 6 1
	goto_w Label90
Label155:
	aconst_null 
	areturn 
	}


public module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_1 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_3 
	aconst_null 
	astore_4 
	aload_1 
	astore_5 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore_2 
	aload_2 
	ifnull Label20
	aload_2 
	areturn 
Label20:
	aconst_null 
	astore_6 
	iload_3 
	bipush -1
	if_icmpne Label50
	aload_0_getfield .field_48_48   // get_name_1:  .field_48_48   // get_name_2:  .field_48_48   // get_Name:    .field_48_48   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 48
	ifnull Label50
	aload_0_getfield .field_48_48   // get_name_1:  .field_48_48   // get_name_2:  .field_48_48   // get_Name:    .field_48_48   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 48
	stringlength 
	ifle Label50
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0_getfield .field_48_48   // get_name_1:  .field_48_48   // get_name_2:  .field_48_48   // get_Name:    .field_48_48   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 48
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_15:"."
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_6 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_6 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore_2 
	aload_2 
	ifnull Label50
	aload_2 
	areturn 
Label50:
	iload_3 
	bipush -1
	if_icmpeq Label65
	aload_1 
	iconst_0 
	iload_3 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	astore_4 
	aload_1 
	iload_3 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_5 
Label65:
	new_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	dup 
	aload_5 
	aload_4 
	invokespecial_lib .routine_8950 // pc=3
	astore_2 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_1 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_6 
	ifnull Label83
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_6 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label83:
	aload_2 
	areturn 
	}


public module:net_rim_loader-2.class#26 mirandize( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, module:net_rim_loader-2.class#26 ); // address: 0
	{
	enter 
	aload_2 
	invokenonvirtual_lib .routine_19614 // pc=1
	iipush 251527167
	iand 
	istore_3 
	aload_2 
	invokenonvirtual_lib .routine_16076 // pc=1
	istore_4 
	new_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	dup 
	aload_1 
	aload_2 
	invokenonvirtual_lib .routine_19270 // pc=1
	aload_2 
	invokenonvirtual_lib .routine_16161 // pc=1
	iload_4 
	iload_3 
	invokespecial_lib .routine_18325 // pc=6
	astore_5 
	iconst_0 
	istore_6 
Label22:
	iload_6 
	iload_4 
	if_icmpge Label38
	aload_2 
	iload_6 
	invokenonvirtual_lib .routine_16096 // pc=2
	astore_7 
	aload_5 
	iload_6 
	aload_7 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.NameAndType ) // pc=1
	aload_7 
	invokevirtual net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	invokenonvirtual_lib .routine_15983 // pc=4
	iinc 6 1
	goto Label22
Label38:
	aload_5 
	new InstructionCode
	dup 
	aload_5 
	iconst_0 
	aload_5 
	invokenonvirtual_lib .routine_16065 // pc=1
	aconst_null 
	aconst_null 
	invokespecial net.rim.tools.compiler.analysis.InstructionCode.<init> // pc=6
	invokenonvirtual_lib .routine_16325 // pc=2
	aload_5 
	areturn 
	}


public module:net_rim_loader-2.class#53 findInputTypeModule( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.Compiler.findInputTypeModule // pc=2
	astore_4 
	aload_4 
	ifnonnull Label18
	new_lib net.rim.tools.compiler.types.TypeModule//module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53 module:net_rim_loader-2.class#53
	dup 
	aload_1 
	aload_2 
	iload_3 
	aconst_null 
	invokespecial_lib .routine_30480 // pc=5
	astore_4 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label18:
	aload_4 
	areturn 
	}


public int getMaxResourceSize( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	}


public int getSliceSize( net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_59_59   // get_name_1:  .field_59_59   // get_name_2:  .field_59_59   // get_Name:    .field_59_59   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 59
	sipush 8192
	if_icmpne Label6
	aload_0_getfield .field_58_58   // get_name_1:  .field_58_58   // get_name_2:  .field_58_58   // get_Name:    .field_58_58   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 58
	ireturn 
Label6:
	aload_0_getfield .field_59_59   // get_name_1:  .field_59_59   // get_name_2:  .field_59_59   // get_Name:    .field_59_59   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 59
	ireturn 
	}


public int getMaxIconSize( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_60_60   // get_name_1:  .field_60_60   // get_name_2:  .field_60_60   // get_Name:    .field_60_60   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 60
	}


public int getDataFull( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_55_55   // get_name_1:  .field_55_55   // get_name_2:  .field_55_55   // get_Name:    .field_55_55   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 55
	}


public boolean isNoLimit( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_61_61   // get_name_1:  .field_61_61   // get_name_2:  .field_61_61   // get_Name:    .field_61_61   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 61
	}


public boolean includeResources( net.rim.tools.compiler.Compiler ); // address: 0
	{
	ireturn_field .field_62_62   // get_name_1:  .field_62_62   // get_name_2:  .field_62_62   // get_Name:    .field_62_62   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 62
	}


public boolean getRequiresSigning( net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_65_65   // get_name_1:  .field_65_65   // get_name_2:  .field_65_65   // get_Name:    .field_65_65   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 65
	ifnull Label5
	iconst_1 
	ireturn 
Label5:
	iconst_0 
	ireturn 
	}


public byte[] getSignerCertEncoding( net.rim.tools.compiler.Compiler ); // address: 0
	{
	areturn_field .field_66_66   // get_name_1:  .field_66_66   // get_name_2:  .field_66_66   // get_Name:    .field_66_66   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 66
	}


public performSigning( net.rim.tools.compiler.Compiler, java.util.Vector ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iload_2 
	iconst_1 
	isub 
	istore_3 
Label8:
	iload_3 
	iflt Label45
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_array 1 2
	astore_4 
	aload_4 
	aload_0_getfield .field_65_65   // get_name_1:  .field_65_65   // get_name_2:  .field_65_65   // get_Name:    .field_65_65   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 65
	invokestatic_lib byte[] genMIDletTrailer( byte[], byte[] ) // MIDletSecurity
	astore_5 
	bipush 2
	iconst_0 
	aload_0_getfield .field_65_65   // get_name_1:  .field_65_65   // get_name_2:  .field_65_65   // get_Name:    .field_65_65   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 65
	invokestatic_lib byte[] makeTrailer( int, int, byte[] ) // CodeModuleManager
	astore_6 
	bipush 2
	multianewarray  // dim=1 nest=2 type=2
	dup 
	iconst_0 
	aload_6 
	aastore 
	dup 
	iconst_1 
	aload_5 
	aastore 
	astore_7 
	aload_4 
	aload_7 
	invokestatic_lib byte[] appendTrailers( byte[], byte[][] ) // CodeModuleManager
	astore_4 
	aload_1 
	aload_4 
	iload_3 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	iinc 3 -1
	goto Label8
Label45:
	return 
	}

}
