// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 4
// ########################################################


package net.rim.tools.compiler.types;


abstract public final class ClassType extends net.rim.tools.compiler.types.ReferenceType

{
	// @@@@@@@@@@@@@ Static fields 
	private static StringBuffer /*java.lang.StringBuffer*/  _stringBuffer ; // ofs = 9896 addr = 12)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.types.ClassType /*net.rim.tools.compiler.types.ClassType*/  _baseClassType ; // ofs = 9804 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*net.rim.tools.compiler.types.ClassType[]*/  _baseInterfaces ; // ofs = 9808 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _interfaces ; // ofs = 9812 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _vtable ; // ofs = 9816 addr = 0)
	private boolean[] /*boolean[]*/  _isOverride ; // ofs = 9820 addr = 0)
	private net.rim.tools.compiler.types.Field /*net.rim.tools.compiler.types.Field[]*/  _fields ; // ofs = 9824 addr = 0)
	private int /*int*/  _numFields ; // ofs = 9828 addr = 0)
	private net.rim.tools.compiler.types.Method /*net.rim.tools.compiler.types.Method[]*/  _methods ; // ofs = 9832 addr = 0)
	private int /*int*/  _numMethods ; // ofs = 9836 addr = 0)
	private int /*int*/  _baseSize ; // ofs = 9840 addr = 0)
	private int /*int*/  _numInstance ; // ofs = 9844 addr = 0)
	private int /*int*/  _numStatic ; // ofs = 9848 addr = 0)
	private int /*int*/  _maxTypeListSize ; // ofs = 9852 addr = 0)
	private int /*int*/  _codeWeight ; // ofs = 9856 addr = 0)
	private int /*int*/  _dataWeight ; // ofs = 9860 addr = 0)
	private int /*int*/  _vtableWeight ; // ofs = 9864 addr = 0)
	private int /*int*/  _fieldWeight ; // ofs = 9868 addr = 0)
	private String /*java.lang.String*/  _packageName ; // ofs = 9872 addr = 0)
	private String /*java.lang.String*/  _fullName ; // ofs = 9876 addr = 0)
	private int /*int*/  _modifiers ; // ofs = 9880 addr = 0)
	private boolean /*boolean*/  _defined ; // ofs = 9884 addr = 0)
	private boolean /*boolean*/  _extended ; // ofs = 9888 addr = 0)
	private int /*int*/  _secureIndex ; // ofs = 9892 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.ClassType, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.types.ReferenceType.<init> // pc=2
	aload_0 
	aload_2 
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	ifnonnull Label13
	iconst_0 
	goto Label15
Label13:
	aload_1 
	stringlength 
Label15:
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	ifnonnull Label23
	iconst_0 
	goto Label25
Label23:
	aload_2 
	stringlength 
Label25:
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	bipush 2
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0 
	sipush 255
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	return 
	}


static public final java.lang.String extractPackageName( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpeq Label13
	aload_0 
	iconst_0 
	iload_1 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	areturn 
Label13:
	aconst_null 
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit ReferenceType
	synch_static ClassType
	clinit_wait 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	putstatic _stringBuffer // ClassType
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean isInnerClassName( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 36
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label10
	iconst_0 
	ireturn 
Label10:
	iconst_1 
	ireturn 
	}


private final boolean isNestedInnerClassName( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 36
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label10
	iconst_0 
	ireturn 
Label10:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 36
	iload_1 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label22
	iconst_0 
	ireturn 
Label22:
	iconst_1 
	ireturn 
	}


private final boolean isAnonymousInnerClassName( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 36
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label10
	iconst_0 
	ireturn 
Label10:
	iinc 1 1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	stringlength 
	istore_2 
	iload_1 
	iload_2 
	if_icmplt Label19
	iconst_0 
	ireturn 
Label19:
	iload_1 
	iload_2 
	if_icmpge Label31
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifne Label29
	iconst_0 
	ireturn 
Label29:
	iinc 1 1
	goto Label19
Label31:
	iconst_1 
	ireturn 
	}


private final addInterface( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label8
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label8:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.implementsInterface // pc=2
	ifne Label22
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_1 
	iipush 67108864
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label22
	aload_0 
	iipush 67108864
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
Label22:
	return 
	}


private final addInterfaceArray( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.ClassType[] ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label18
	aload_1 
	arraylength 
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_2 
	if_icmpge Label18
	aload_0 
	aload_1 
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.types.ClassType.addInterface // pc=2
	iinc 3 1
	goto Label8
Label18:
	return 
	}


private final addInterfaceVector( net.rim.tools.compiler.types.ClassType, java.util.Vector ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label21
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_2 
	if_icmpge Label21
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ClassType
	astore_4 
	aload_0 
	aload_4 
	invokespecial net.rim.tools.compiler.types.ClassType.addInterface // pc=2
	iinc 3 1
	goto Label8
Label21:
	return 
	}


private final net.rim.tools.compiler.types.Method findDuplicate( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	astore_2 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	istore_3 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_4 
	iconst_0 
	istore_5 
Label11:
	iload_5 
	iload_4 
	if_icmpge Label49
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_5 
	aaload 
	astore_6 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label24
	goto Label47
Label24:
	aload_6 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	iload_3 
	if_icmpeq Label29
	goto Label47
Label29:
	iconst_0 
	istore_7 
Label31:
	iload_7 
	iload_3 
	if_icmpge Label45
	aload_6 
	iload_7 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	aload_1 
	iload_7 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label43
	goto Label47
Label43:
	iinc 7 1
	goto Label31
Label45:
	aload_6 
	areturn 
Label47:
	iinc 5 1
	goto Label11
Label49:
	aconst_null 
	areturn 
	}


private final net.rim.tools.compiler.types.Method lookupMethod( net.rim.tools.compiler.types.ClassType, java.lang.String, net.rim.tools.compiler.types.Type, java.util.Vector ); // address: 0
	{
	enter 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_4 
	iconst_0 
	istore_5 
Label5:
	iload_5 
	iload_4 
	if_icmpge Label22
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_5 
	aaload 
	astore_6 
	aload_6 
	aload_1 
	aload_2 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.Method.matches // pc=4
	ifeq Label20
	aload_6 
	areturn 
Label20:
	iinc 5 1
	goto Label5
Label22:
	aconst_null 
	areturn 
	}


private final net.rim.tools.compiler.types.Method recursiveLookupMethod( net.rim.tools.compiler.types.ClassType, java.lang.String, net.rim.tools.compiler.types.Type, java.util.Vector, boolean, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial net.rim.tools.compiler.types.ClassType.lookupMethod // pc=4
	astore_6 
	iload_5 
	ifeq Label15
	aload_0 
	iipush 133120
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label15
	aload_6 
	areturn 
Label15:
	aload_6 
	ifnonnull Label50
	iload_4 
	ifne Label50
	aload_0 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label50
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label50
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	istore_7 
	iconst_0 
	istore 8
Label30:
	iload 8
	iload_7 
	if_icmpge Label50
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload 8
	aaload 
	astore 9
	aload 9
	aload_1 
	aload_2 
	aload_3 
	iload_4 
	iload_5 
	invokespecial net.rim.tools.compiler.types.ClassType.recursiveLookupMethod // pc=6
	astore_6 
	aload_6 
	ifnull Label48
	goto Label50
Label48:
	iinc 8 1
	goto Label30
Label50:
	aload_6 
	ifnonnull Label62
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label62
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	aload_2 
	aload_3 
	iload_4 
	iload_5 
	invokespecial net.rim.tools.compiler.types.ClassType.recursiveLookupMethod // pc=6
	astore_6 
Label62:
	aload_6 
	areturn 
	}


private final boolean findClassDefinition( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual module:net_rim_loader.class#7 getHost( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	astore_3 
	aload_2 
	aload_3 
	invokeinterface interfacemethodref_10 // pc=2 guess=0
	astore_4 
	aload_4 
	ifnonnull Label14
	goto_w Label184
Label14:
	aload_2 
	aload_4 
	invokeinterface interfacemethodref_11 // pc=2 guess=1
	astore_5 
	aload_2 
	aload_4 
	invokeinterface interfacemethodref_12 // pc=2 guess=2
	astore_6 
	aload_1 
	aload_5 
	aload_6 
	iconst_0 
	invokevirtual net.rim.tools.compiler.types.TypeModule findInputTypeModule( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String, int ) // pc=4
	astore_7 
	aload_0 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setTypeModule // pc=2
	aload_2 
	aload_4 
	invokeinterface interfacemethodref_13 // pc=2 guess=3
	invokestatic int translateCodfileClassAttributes( int ) // Modifier
	istore 8
	aload_1 
	iload 8
	iipush 131072
	ior 
	invokevirtual int augmentClassModifiers( net.rim.tools.compiler.Compiler, int ) // pc=2
	istore 8
	aload_0 
	iload 8
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
	aload_1 
	invokevirtual net.rim.tools.compiler.types.ClassType getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	astore 9
	aload_0 
	aload 9
	if_acmpne Label52
	goto_w Label180
Label52:
	aload_2 
	checkcastbranch_lib 
	astore 10
	aload 10
	aload_4 
	invokeinterface interfacemethodref_14 // pc=2 guess=4
	astore 11
	aload 11
	ifnull Label90
	aload 11
	stringlength 
	ifle Label90
	aload 10
	aload_4 
	invokeinterface interfacemethodref_15 // pc=2 guess=5
	astore 12
	aload 12
	ifnull Label84
	aload 12
	stringlength 
	ifle Label84
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 12
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 46
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 11
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 11
Label84:
	aload_0 
	aload_1 
	aload 11
	invokevirtual net.rim.tools.compiler.types.ClassType findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setBaseClass // pc=2
	goto Label93
Label90:
	aload_0 
	aload 9
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setBaseClass // pc=2
Label93:
	aconst_null 
	astore 12
	iconst_0 
	istore 13
	aload 10
	aload_4 
	iload 13
	invokeinterface interfacemethodref_16 // pc=3 guess=6
	astore 11
Label102:
	aload 11
	ifnull Label144
	aload 11
	stringlength 
	ifle Label144
	aload 10
	aload_4 
	iload 13
	invokeinterface interfacemethodref_17 // pc=3 guess=7
	astore 14
	aload 14
	ifnull Label128
	aload 14
	stringlength 
	ifle Label128
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 14
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 46
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 11
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 11
Label128:
	aload 12
	ifnonnull Label134
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore 12
Label134:
	aload 12
	aload 11
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 13 1
	aload 10
	aload_4 
	iload 13
	invokeinterface interfacemethodref_16 // pc=3 guess=6
	astore 11
	goto Label102
Label144:
	aload 12
	ifnonnull Label148
	iconst_0 
	goto Label150
Label148:
	aload 12
	invokevirtual int size( java.util.Vector ) // pc=1
Label150:
	istore 14
	iload 14
	ifle Label174
	aload_0 
	iload 14
	invokenonvirtual net.rim.tools.compiler.types.ClassType.allocateBaseInterfaces // pc=2
	iconst_0 
	istore 15
Label158:
	iload 15
	iload 14
	if_icmpge Label174
	aload 12
	iload 15
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 11
	aload_0 
	iload 15
	aload_1 
	aload 11
	invokevirtual net.rim.tools.compiler.types.ClassType findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setBaseInterface // pc=3
	iinc 15 1
	goto Label158
Label174:
	aconst_null 
	astore 12
	goto Label180
Label177:
	aload_0 
	aload 9
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setBaseClass // pc=2
Label180:
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setDefined // pc=1
	iconst_1 
	ireturn 
Label184:
	iconst_0 
	ireturn 
	}


private final java.util.Vector cloneVTable( net.rim.tools.compiler.types.ClassType, java.util.Vector ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
	aload_1 
	ifnull Label8
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
Label8:
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	iload_3 
	invokespecial_lib java.util.Vector.<init> // pc=2
	astore_2 
	aload_2 
	iload_3 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
Label16:
	iinc 3 -1
	iload_3 
	iflt Label26
	aload_2 
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	iload_3 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	goto Label16
Label26:
	aload_2 
	areturn 
	}


private final propagateOverride( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
Label3:
	aload_2 
	ifnull Label24
	aload_2 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore_3 
	aload_3 
	ifnonnull Label11
	return 
Label11:
	iload_1 
	aload_3 
	arraylength 
	if_icmplt Label16
	return 
Label16:
	aload_3 
	iload_1 
	iconst_1 
	bastore 
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	goto Label3
Label24:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setTypeModule( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.types.ReferenceType.setTypeModule // pc=2
	aload_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.addDataWeight // pc=2
	aload_1 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.addCodeWeight // pc=2
	aload_1 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.addVtableWeight // pc=2
	aload_1 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.addFieldWeight // pc=2
	return 
	}


public final java.lang.String getPackageName( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	areturn_field .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	}


public final java.lang.String getFullName( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	ifnonnull Label24
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	ifnull Label8
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	stringlength 
	ifne Label12
Label8:
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	goto Label24
Label12:
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 46
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
Label24:
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	areturn 
	}


public final int getTypeId( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	ireturn_bipush 7
	}


public final int getBaseSize( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	ireturn_field .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	}


public final boolean inVtable( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	iflt Label9
	iload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label9
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


public final addModifiers( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iload_1 
	ior 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	return 
	}


public final clearModifiers( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iload_1 
	bipush -1
	ixor 
	iand 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	return 
	}


public final setBaseClass( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	putfield_return .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final net.rim.tools.compiler.types.ClassType getBaseClassType( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	areturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final net.rim.tools.compiler.types.ClassType findCommonClassType( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter 
	aload_0 
	astore_2 
	aload_2 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label10
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	areturn 
Label10:
	aload_1 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label17
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	areturn 
Label17:
	aload_2 
	astore_3 
Label19:
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label32
	aload_1 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDerivedFrom // pc=2
	ifeq Label28
	aload_3 
	areturn 
Label28:
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_3 
	goto Label19
Label32:
	aload_3 
	areturn 
	}


public final boolean isDerivedFrom( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter 
	sipush 1024
	istore_2 
	aload_0 
	astore_3 
Label5:
	aload_3 
	ifnull Label19
	iinc 2 -1
	iload_2 
	ifle Label19
	aload_3 
	aload_1 
	if_acmpne Label15
	iconst_1 
	ireturn 
Label15:
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_3 
	goto Label5
Label19:
	iconst_0 
	ireturn 
	}


public final boolean implementsInterface( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label24
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_2 
	if_icmpge Label24
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ClassType
	astore_4 
	aload_1 
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label22
	iconst_1 
	ireturn 
Label22:
	iinc 3 1
	goto Label8
Label24:
	iconst_0 
	ireturn 
	}


public final allocateBaseInterfaces( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label9
	iload_1 
	ifle Label9
	aload_0 
	iload_1 
	newarray_object ClassType
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label9:
	return 
	}


public final setBaseInterface( net.rim.tools.compiler.types.ClassType, int, net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	aload_2 
	aastore 
	return 
	}


public final int getNumFields( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	ireturn_field .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	}


public final net.rim.tools.compiler.types.Field getField( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_1 
	aaload 
	areturn 
	}


public final allocateFields( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifle Label19
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label10
	aload_0 
	iload_1 
	newarray_object Field
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	return 
Label10:
	iload_1 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	arraylength 
	if_icmplt Label19
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_1 
	invokestatic net.rim.tools.compiler.types.Field[] resize( net.rim.tools.compiler.types.Field[], int ) // MyArrays
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
Label19:
	return 
	}


public final net.rim.tools.compiler.types.Field addData( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.Compiler, java.lang.String, net.rim.tools.compiler.types.Type, int, net.rim.tools.compiler.types.Constant ); // address: 0
	{
	enter 
	aload_2 
	invokestatic boolean validateIdentifier( java.lang.String ) // StringHelper
	ifne Label17
	new CompileException
	dup 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_466:"Invalid member name: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=3
	athrow 
Label17:
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	iconst_0 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.findField // pc=6
	ifnull Label33
	new DuplicateException
	dup 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	aload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial net.rim.tools.compiler.util.DuplicateException.<init> // pc=4
	athrow 
Label33:
	aconst_null 
	astore_6 
	bipush -1
	istore_7 
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label43
	iconst_1 
	goto Label44
Label43:
	iconst_0 
Label44:
	istore 8
	iload 8
	ifne Label48
	goto_w Label137
Label48:
	getstatic _stringBuffer // ClassType
	dup 
	astore 9
	monitorenter 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	astore 10
	getstatic _stringBuffer // ClassType
	iconst_0 
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
	getstatic _stringBuffer // ClassType
	aload 10
	stringlength 
	iconst_1 
	iadd 
	aload_2 
	stringlength 
	iadd 
	invokevirtual ensureCapacity( java.lang.StringBuffer, int ) // pc=2
	getstatic _stringBuffer // ClassType
	aload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	getstatic _stringBuffer // ClassType
	bipush 46
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	getstatic _stringBuffer // ClassType
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	getstatic _stringBuffer // ClassType
	invokevirtual_short .toString // idx=2 pc=1
	astore_6 
	aload 9
	monitorexit 
	goto Label90
	astore 11
	aload 9
	monitorexit 
	aload 11
	athrow 
Label90:
	iload_4 
	bipush 2
	iand 
	ifne Label113
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	istore_7 
	aload_0 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_3 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iadd 
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_1 
	aload_6 
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual boolean checkFieldForExport( net.rim.tools.compiler.Compiler, java.lang.String, net.rim.tools.compiler.types.ClassType, int ) // pc=4
	ifeq Label137
	iload_4 
	iipush 2097152
	ior 
	istore_4 
	goto Label137
Label113:
	iload_4 
	bipush 64
	iand 
	ifeq Label123
	iload_4 
	iipush 134217728
	iand 
	ifne Label123
	aload_5 
	ifnonnull Label127
Label123:
	aload_0 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.allocateStatic // pc=2
	istore_7 
Label127:
	aload_1 
	aload_6 
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual boolean checkStaticDataForExport( net.rim.tools.compiler.Compiler, java.lang.String, net.rim.tools.compiler.types.ClassType, int ) // pc=4
	ifeq Label137
	iload_4 
	iipush 2097152
	ior 
	istore_4 
Label137:
	new Field
	dup 
	aload_2 
	aload_3 
	aload_0 
	iload_4 
	iload_7 
	aload_5 
	invokespecial net.rim.tools.compiler.types.Field.<init> // pc=7
	astore 9
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	iadd 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.allocateFields // pc=2
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload 9
	aastore 
	aload 9
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label186
	aload 9
	iipush 136314880
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label183
	aload 9
	iipush 524288
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label186
	aload 9
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getModifiers // pc=1
	sipush 896
	iand 
	sipush 512
	if_icmpne Label183
	aload_0 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label186
Label183:
	aload 9
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.types.Field.referenced // pc=2
Label186:
	aload 9
	areturn 
	}


public final net.rim.tools.compiler.types.Field findField( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.Compiler, java.lang.String, net.rim.tools.compiler.types.Type, boolean, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	istore_7 
	iconst_0 
	istore 8
Label5:
	iload 8
	iload_7 
	if_icmpge Label28
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload 8
	aaload 
	astore_6 
	aload_6 
	ifnull Label26
	aload_6 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label26
	aload_6 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getType // pc=1
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label26
	aload_6 
	areturn 
Label26:
	iinc 8 1
	goto Label5
Label28:
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label103
	iload_4 
	ifeq Label58
	aload_1 
	aload_0 
	aload_3 
	aload_2 
	invokevirtual net.rim.tools.compiler.types.Field findStatic( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.Type, java.lang.String ) // pc=4
	astore_6 
	aload_6 
	ifnull Label58
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	iadd 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.allocateFields // pc=2
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_6 
	aastore 
	aload_6 
	areturn 
Label58:
	aload_0 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label103
	sipush 128
	iload_4 
	ifeq Label67
	bipush 2
	goto Label68
Label67:
	bipush 4
Label68:
	ior 
	istore 8
	aload_1 
	aload_0 
	iload 8
	invokevirtual int augmentFieldModifiers( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, int ) // pc=3
	istore 8
	bipush -1
	istore 9
	new Field
	dup 
	aload_2 
	aload_3 
	aload_0 
	iload 8
	iload 9
	aconst_null 
	invokespecial net.rim.tools.compiler.types.Field.<init> // pc=7
	astore_6 
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	iadd 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.allocateFields // pc=2
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_6 
	aastore 
	aload_6 
	areturn 
Label103:
	iload_5 
	ifeq Label154
	aconst_null 
	astore_6 
	iload_4 
	ifeq Label136
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label136
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	istore_7 
	iconst_0 
	istore 8
Label116:
	iload 8
	iload_7 
	if_icmpge Label136
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload 8
	aaload 
	astore 9
	aload 9
	aload_1 
	aload_2 
	aload_3 
	iload_4 
	iload_5 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.findField // pc=6
	astore_6 
	aload_6 
	ifnull Label134
	goto Label136
Label134:
	iinc 8 1
	goto Label116
Label136:
	aload_6 
	ifnonnull Label152
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label152
	aload_0 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label152
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	aload_2 
	aload_3 
	iload_4 
	iload_5 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.findField // pc=6
	astore_6 
Label152:
	aload_6 
	areturn 
Label154:
	aconst_null 
	areturn 
	}


public final allocateMethods( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnonnull Label9
	iload_1 
	ifle Label9
	aload_0 
	iload_1 
	newarray_object Method
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
Label9:
	return 
	}


public final addMethod( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.types.ClassType.findDuplicate // pc=2
	astore_3 
	aload_3 
	ifnull Label43
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getType // pc=1
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getType // pc=1
	if_acmpne Label25
	aload_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_467:"Duplicate definition found for method: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	goto Label37
Label25:
	aload_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_468:"Duplicate method only differs by return type: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
Label37:
	aload_2 
	iipush 134217728
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.addModifiers // pc=2
	aload_3 
	iipush 134217728
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.addModifiers // pc=2
Label43:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnonnull Label49
	aload_0 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.allocateMethods // pc=2
	goto Label60
Label49:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	arraylength 
	if_icmpne Label60
	aload_0 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_1 
	iadd 
	invokestatic net.rim.tools.compiler.types.Method[] resize( net.rim.tools.compiler.types.Method[], int ) // MyArrays
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
Label60:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_2 
	aastore 
	aload_2 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label92
	aload_2 
	sipush 544
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.isAnd // pc=2
	ifeq Label92
	aload_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_469:"Method is both private and abstract: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload_2 
	iipush 134217728
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.addModifiers // pc=2
Label92:
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	astore_4 
	aload_0 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label134
	aload_2 
	bipush 18
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label134
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_470:"MIDletMain"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label113
	aload_4 
	ldc literal_471:"main"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label113
	iconst_1 
	goto Label114
Label113:
	iconst_0 
Label114:
	istore_5 
	aload_1 
	invokevirtual boolean isMakingMIDlet( net.rim.tools.compiler.Compiler ) // pc=1
	ifne Label124
	iload_5 
	ifne Label122
	iconst_1 
	goto Label123
Label122:
	iconst_0 
Label123:
	istore_5 
Label124:
	iload_5 
	ifeq Label134
	aload_1 
	aload_4 
	aload_2 
	invokevirtual boolean checkStaticMethodForExport( net.rim.tools.compiler.Compiler, java.lang.String, net.rim.tools.compiler.types.Method ) // pc=3
	ifeq Label134
	aload_2 
	iipush 2097152
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.addModifiers // pc=2
Label134:
	aload_2 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label156
	aload_2 
	iipush 137887744
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label153
	aload_2 
	bipush 16
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label156
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	ifeq Label153
	aload_2 
	iipush 33554432
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label156
Label153:
	aload_2 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.setReachable // pc=2
Label156:
	return 
	}


public final net.rim.tools.compiler.types.Method lookupSpecialMethod( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_3 
	iconst_0 
	istore_2 
Label5:
	iload_2 
	iload_3 
	if_icmpge Label20
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_2 
	aaload 
	astore_4 
	aload_4 
	iload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.isSpecial // pc=2
	ifeq Label18
	aload_4 
	areturn 
Label18:
	iinc 2 1
	goto Label5
Label20:
	aconst_null 
	areturn 
	}


public final net.rim.tools.compiler.types.Method findMethod( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.Compiler, java.lang.String, net.rim.tools.compiler.types.Type, java.util.Vector, boolean, boolean ); // address: 0
	{
	enter 
	iconst_1 
	istore_7 
	aconst_null 
	astore 8
	iload_6 
	ifeq Label16
	aload_0 
	aload_2 
	aload_3 
	aload_4 
	iload_5 
	iload_7 
	invokespecial net.rim.tools.compiler.types.ClassType.recursiveLookupMethod // pc=6
	astore 8
	goto Label22
Label16:
	aload_0 
	aload_2 
	aload_3 
	aload_4 
	invokespecial net.rim.tools.compiler.types.ClassType.lookupMethod // pc=4
	astore 8
Label22:
	iload_7 
	ifne Label25
	goto_w Label231
Label25:
	aload 8
	ifnull Label28
	goto_w Label231
Label28:
	aload_0 
	astore 9
	iload_5 
	ifeq Label33
	goto_w Label108
Label33:
	aload 9
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label38
	goto_w Label108
Label38:
	aload_1 
	invokevirtual java.util.Vector getObjectClassVirtualMethods( net.rim.tools.compiler.Compiler ) // pc=1
	astore 10
	aload 10
	aload_2 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore 11
	iload 11
	bipush -1
	if_icmpne Label55
	aload_1 
	invokevirtual java.util.Vector getObjectClassMethods( net.rim.tools.compiler.Compiler ) // pc=1
	astore 10
	aload 10
	aload_2 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore 11
Label55:
	iload 11
	bipush -1
	if_icmpne Label108
	sipush 160
	istore 12
	aload_1 
	aload 9
	iload 12
	invokevirtual int augmentMethodModifiers( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, int ) // pc=3
	istore 12
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 13
	new Method
	dup 
	aload 9
	aload_2 
	aload_3 
	iload 13
	iload 12
	invokespecial net.rim.tools.compiler.types.Method.<init> // pc=6
	astore 8
	iconst_0 
	istore 14
Label79:
	iload 14
	iload 13
	if_icmpge Label92
	aload 8
	iload 14
	aconst_null 
	aload_4 
	iload 14
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast Type
	invokenonvirtual net.rim.tools.compiler.types.Method.addParameter // pc=4
	iinc 14 1
	goto Label79
Label92:
	aload 8
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.markInVtable // pc=2
	aload 9
	aload_1 
	aload 8
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addMethod // pc=3
	goto Label106
	astore 12
	aload_1 
	invokevirtual boolean getTraceback( net.rim.tools.compiler.Compiler ) // pc=1
	ifeq Label106
	aload 12
	invokevirtual printStackTrace( java.lang.Exception ) // pc=1
Label106:
	aload 8
	areturn 
Label108:
	aload 9
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label119
	aload 9
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label119
	aload 9
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore 9
	goto Label108
Label119:
	aload 9
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label124
	goto_w Label231
Label124:
	iconst_1 
	istore 10
	aload 9
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label157
	aload 9
	aload_1 
	invokevirtual net.rim.tools.compiler.types.ClassType getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	if_acmpne Label157
	aload_1 
	invokevirtual java.util.Vector getObjectClassVirtualMethods( net.rim.tools.compiler.Compiler ) // pc=1
	astore 11
	aload 11
	aload_2 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore 12
	iload 12
	bipush -1
	if_icmpne Label157
	iconst_0 
	istore 10
	aload_1 
	invokevirtual java.util.Vector getObjectClassMethods( net.rim.tools.compiler.Compiler ) // pc=1
	astore 11
	aload 11
	aload_2 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore 12
	iload 12
	bipush -1
	if_icmpne Label157
	aconst_null 
	areturn 
Label157:
	sipush 128
	iload_5 
	ifeq Label162
	bipush 2
	goto Label163
Label162:
	iconst_0 
Label163:
	ior 
	istore 11
	iload 11
	aload_2 
	ldc literal_472:"<init>"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label172
	bipush 16
	goto Label173
Label172:
	iconst_0 
Label173:
	ior 
	istore 11
	iload 11
	aload_2 
	ldc literal_473:"<clinit>"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	iipush 1048576
	goto Label183
Label182:
	iconst_0 
Label183:
	ior 
	istore 11
	aload_1 
	aload 9
	iload 11
	invokevirtual int augmentMethodModifiers( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, int ) // pc=3
	istore 11
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 12
	new Method
	dup 
	aload 9
	aload_2 
	aload_3 
	iload 12
	iload 11
	invokespecial net.rim.tools.compiler.types.Method.<init> // pc=6
	astore 8
	iconst_0 
	istore 13
Label204:
	iload 13
	iload 12
	if_icmpge Label217
	aload 8
	iload 13
	aconst_null 
	aload_4 
	iload 13
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast Type
	invokenonvirtual net.rim.tools.compiler.types.Method.addParameter // pc=4
	iinc 13 1
	goto Label204
Label217:
	aload 8
	iload 10
	invokenonvirtual net.rim.tools.compiler.types.Method.markInVtable // pc=2
	aload 9
	aload_1 
	aload 8
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addMethod // pc=3
	goto Label231
	astore 11
	aload_1 
	invokevirtual boolean getTraceback( net.rim.tools.compiler.Compiler ) // pc=1
	ifeq Label231
	aload 11
	invokevirtual printStackTrace( java.lang.Exception ) // pc=1
Label231:
	aload 8
	areturn 
	}


public final setReachable( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.Compiler, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label11
	aload_0 
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
	aload_1 
	aload_0 
	invokevirtual referenceClass( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType ) // pc=2
Label11:
	return 
	}


public final setDefined( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	return 
	}


public final boolean isDefined( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	ireturn_field .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	}


public final boolean is( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iand 
	ifeq Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final boolean isAnd( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iand 
	iload_1 
	if_icmpne Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


public final int allocateStatic( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	istore_2 
	aload_0 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_1 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iadd 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iload_2 
	ireturn 
	}


public final setMaxTypeListSize( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	if_icmple Label7
	aload_0 
	iload_1 
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
Label7:
	return 
	}


public final resolve( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	iconst_0 
	istore_3 
	aload_0 
	iipush 536870912
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label13
	aload_0 
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label14
Label13:
	return 
Label14:
	aload_0 
	iipush 536870912
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDefined // pc=1
	ifne Label31
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.types.ClassType.findClassDefinition // pc=2
	ifne Label31
	aload_1 
	iconst_0 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	ldc literal_474:"No definition found"
	invokevirtual generateWarning( net.rim.tools.compiler.Compiler, boolean, java.lang.String, java.lang.String ) // pc=4
	return 
Label31:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic boolean validateIdentifier( java.lang.String ) // StringHelper
	ifne Label47
	new CompileException
	dup 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_475:"Invalid class name: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=3
	athrow 
Label47:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label50
	goto_w Label134
Label50:
	aload_0 
	aload_1 
	invokevirtual net.rim.tools.compiler.types.ClassType getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	if_acmpeq Label55
	goto_w Label134
Label55:
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label60
	goto_w Label134
Label60:
	iconst_1 
	istore_3 
	aload_0 
	iipush 1073741824
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifne Label69
	aload_1 
	invokevirtual prepopulateObjectVTableMethods( net.rim.tools.compiler.Compiler ) // pc=1
Label69:
	aload_0 
	iconst_0 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	invokevirtual java.util.Vector getObjectClassVTable( net.rim.tools.compiler.Compiler ) // pc=1
	astore_7 
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	invokespecial_lib java.util.Vector.<init> // pc=2
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_0 
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray 1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_0 
	istore_5 
Label93:
	iload_5 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	arraylength 
	if_icmpge Label103
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_5 
	iconst_1 
	bastore 
	iinc 5 1
	goto Label93
Label103:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_6 
	iconst_0 
	istore_5 
Label107:
	iload_5 
	iload_6 
	if_icmplt Label111
	goto_w Label214
Label111:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_5 
	aaload 
	astore_4 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.types.Method.getRoutineName // pc=1
	astore 8
	aload_7 
	aload 8
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore 9
	iload 9
	bipush -1
	if_icmpeq Label132
	aload_4 
	iload 9
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setOffset // pc=2
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_4 
	iload 9
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
Label132:
	iinc 5 1
	goto Label107
Label134:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label137
	goto_w Label209
Label137:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label145
	iconst_1 
	goto Label146
Label145:
	iconst_0 
Label146:
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setReachable // pc=3
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.resolve // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDefined // pc=1
	ifne Label168
	aload_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_476:"Base class has undefined type: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload_0 
	iipush 134217728
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
Label168:
	aload_0 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label203
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokespecial net.rim.tools.compiler.types.ClassType.addInterfaceVector // pc=2
	aload_0 
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokespecial net.rim.tools.compiler.types.ClassType.cloneVTable // pc=2
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label214
	aload_1 
	invokevirtual boolean isMakingMIDlet( net.rim.tools.compiler.Compiler ) // pc=1
	ifeq Label214
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	ldc literal_477:"javax.microedition.midlet.MIDlet"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label214
	iconst_1 
	istore_2 
	aload_1 
	aload_0 
	invokevirtual addPotentialMIDlet( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType ) // pc=2
	goto Label214
Label203:
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	goto Label214
Label209:
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label214:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label220
	aload_0 
	iconst_0 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	goto Label227
Label220:
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iadd 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
Label227:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label230
	goto_w Label330
Label230:
	iconst_0 
	istore_7 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	istore_6 
	iconst_0 
	istore_5 
Label237:
	iload_5 
	iload_6 
	if_icmplt Label241
	goto_w Label293
Label241:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_5 
	aaload 
	astore 8
	aload 8
	aload_1 
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label253
	iconst_1 
	goto Label254
Label253:
	iconst_0 
Label254:
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setReachable // pc=3
	aload 8
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.resolve // pc=2
	aload_0 
	aload 8
	invokespecial net.rim.tools.compiler.types.ClassType.addInterface // pc=2
	aload 8
	iipush 4194304
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label268
	aload_0 
	iipush 4194304
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
Label268:
	aload 8
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDefined // pc=1
	ifne Label291
	aload_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_478:"Implements undefined interface: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload_0 
	iipush 134217728
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_5 
	aconst_null 
	aastore 
	iinc 7 1
Label291:
	iinc 5 1
	goto_w Label237
Label293:
	iload_7 
	ifle Label330
	iload_7 
	iload_6 
	if_icmplt Label302
	aload_0 
	aconst_null 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	goto Label330
Label302:
	iload_6 
	iload_7 
	isub 
	newarray_object ClassType
	astore 8
	iconst_0 
	istore 9
	iconst_0 
	istore_5 
Label311:
	iload_5 
	iload_6 
	if_icmpge Label327
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_5 
	aaload 
	astore 10
	aload 10
	ifnull Label325
	aload 8
	iload 9
	iinc 9 1
	aload 10
	aastore 
Label325:
	iinc 5 1
	goto Label311
Label327:
	aload_0 
	aload 8
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label330:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label349
	iconst_0 
	istore_5 
Label334:
	iload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label349
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ClassType
	astore_7 
	aload_0 
	aload_7 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokespecial net.rim.tools.compiler.types.ClassType.addInterfaceArray // pc=2
	iinc 5 1
	goto Label334
Label349:
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label354
	goto_w Label433
Label354:
	iconst_0 
	istore_7 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label366
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual net.rim.tools.compiler.types.ClassType getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	if_acmpeq Label366
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iipush 65536
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label393
Label366:
	iconst_1 
	istore_7 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label393
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_6 
	iconst_0 
	istore_5 
Label375:
	iload_5 
	iload_6 
	if_icmpge Label393
	iload_7 
	ifeq Label393
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ClassType
	astore 8
	aload 8
	iipush 65536
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label391
	iconst_0 
	istore_7 
Label391:
	iinc 5 1
	goto Label375
Label393:
	iload_7 
	ifeq Label399
	aload_0 
	iipush 65536
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
	goto Label420
Label399:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_6 
	iconst_0 
	istore_5 
Label403:
	iload_5 
	iload_6 
	if_icmpge Label420
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_5 
	aaload 
	astore_4 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.types.Method.isVirtual // pc=1
	ifeq Label418
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_5 
	aaload 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.setReachable // pc=2
Label418:
	iinc 5 1
	goto Label403
Label420:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label430
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual net.rim.tools.compiler.types.ClassType getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	if_acmpeq Label430
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iipush 8388608
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label433
Label430:
	aload_0 
	iipush 8388608
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
Label433:
	iload_3 
	ifeq Label436
	goto_w Label747
Label436:
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label461
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_6 
	iconst_0 
	istore_5 
Label444:
	iload_5 
	iload_6 
	if_icmplt Label448
	goto_w Label624
Label448:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_5 
	aaload 
	astore_4 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.types.Method.isInVtable // pc=1
	ifeq Label459
	aload_4 
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual net.rim.tools.compiler.types.Method.addToTable // pc=3
Label459:
	iinc 5 1
	goto Label444
Label461:
	iconst_0 
	istore_7 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_6 
	iconst_0 
	istore_5 
Label467:
	iload_5 
	iload_6 
	if_icmpge Label505
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_5 
	aaload 
	astore_4 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.types.Method.isVirtual // pc=1
	ifeq Label482
	aload_4 
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual net.rim.tools.compiler.types.Method.addToTable // pc=3
	goto Label503
Label482:
	aload_4 
	bipush 16
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label503
	aload_4 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	ifne Label503
	iconst_1 
	istore_7 
	iload_2 
	ifeq Label503
	aload_4 
	sipush 128
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label503
	aload_1 
	iconst_0 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	ldc literal_479:"Default MIDlet constructor should be public."
	invokevirtual generateWarning( net.rim.tools.compiler.Compiler, boolean, java.lang.String, java.lang.String ) // pc=4
Label503:
	iinc 5 1
	goto Label467
Label505:
	iload_7 
	ifne Label525
	iconst_0 
	istore_5 
Label509:
	iload_5 
	iload_6 
	if_icmpge Label525
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_5 
	aaload 
	astore_4 
	aload_4 
	bipush 16
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label523
	aload_4 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.setReachable // pc=2
Label523:
	iinc 5 1
	goto Label509
Label525:
	aload_0 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label548
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_6 
	iconst_0 
	istore_5 
Label534:
	iload_5 
	iload_6 
	if_icmplt Label538
	goto_w Label624
Label538:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast Method
	astore_4 
	aload_4 
	bipush -1
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setOffset // pc=2
	iinc 5 1
	goto Label534
Label548:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label551
	goto_w Label624
Label551:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_6 
	iconst_0 
	istore_5 
Label556:
	iload_5 
	iload_6 
	if_icmplt Label560
	goto_w Label624
Label560:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ClassType
	astore 8
	aload 8
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore 9
	iconst_0 
	istore 10
Label570:
	iload 10
	iload 9
	if_icmpge Label622
	aload 8
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload 10
	aaload 
	astore_4 
	aload_4 
	iipush 1048576
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label620
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual net.rim.tools.compiler.types.Method.findInTable // pc=2
	istore 11
	aconst_null 
	astore 12
	iload 11
	bipush -1
	if_icmpeq Label597
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload 11
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast Method
	astore 12
	goto Label614
Label597:
	aload_0 
	bipush 32
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label614
	aload_1 
	aload_0 
	aload_4 
	invokevirtual net.rim.tools.compiler.types.Method mirandize( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.Method ) // pc=3
	astore 12
	aload_0 
	aload_1 
	aload 12
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addMethod // pc=3
	aload 12
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual net.rim.tools.compiler.types.Method.addToTable // pc=3
Label614:
	aload 12
	ifnull Label620
	aload 12
	aload_1 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.types.Method.setImplements // pc=3
Label620:
	iinc 10 1
	goto Label570
Label622:
	iinc 5 1
	goto_w Label556
Label624:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	istore_6 
	iconst_0 
	istore_5 
Label628:
	iload_5 
	iload_6 
	if_icmpge Label657
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_5 
	aaload 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getType // pc=1
	astore_7 
	aload_7 
	checkcastbranch 
	astore 8
	aload 8
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getMostBaseType // pc=1
	astore_7 
Label642:
	aload_7 
	checkcastbranch 
	astore 8
	aload 8
	aload_1 
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label653
	iconst_1 
	goto Label654
Label653:
	iconst_0 
Label654:
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setReachable // pc=3
Label655:
	iinc 5 1
	goto Label628
Label657:
	aload_0 
	aload_1 
	invokevirtual net.rim.tools.compiler.types.ClassType getStringClass( net.rim.tools.compiler.Compiler ) // pc=1
	if_acmpne Label701
	aload_1 
	invokevirtual net.rim.tools.compiler.types.Type getIntType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_7 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	iconst_1 
	invokespecial_lib java.util.Vector.<init> // pc=2
	astore 8
	aload_0 
	ldc literal_480:"length"
	aload_7 
	aload 8
	invokespecial net.rim.tools.compiler.types.ClassType.lookupMethod // pc=4
	astore_4 
	aload_4 
	ifnull Label680
	aload_4 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.setSpecial // pc=2
Label680:
	aload 8
	aload_7 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	ldc literal_481:"charAt"
	aload_1 
	invokevirtual net.rim.tools.compiler.types.Type getCharType( net.rim.tools.compiler.Compiler ) // pc=1
	aload 8
	invokespecial net.rim.tools.compiler.types.ClassType.lookupMethod // pc=4
	astore_4 
	aload_4 
	ifnull Label695
	aload_4 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.types.Method.setSpecial // pc=2
Label695:
	aload_0 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray 1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	return 
Label701:
	aload_0 
	aload_1 
	invokevirtual net.rim.tools.compiler.types.ClassType getStringBufferClass( net.rim.tools.compiler.Compiler ) // pc=1
	if_acmpne Label747
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	iconst_1 
	invokespecial_lib java.util.Vector.<init> // pc=2
	astore_7 
	aload_0 
	ldc literal_472:"<init>"
	aconst_null 
	aload_7 
	invokespecial net.rim.tools.compiler.types.ClassType.lookupMethod // pc=4
	astore_4 
	aload_4 
	ifnull Label721
	aload_4 
	bipush 3
	invokenonvirtual net.rim.tools.compiler.types.Method.setSpecial // pc=2
Label721:
	aload_7 
	aload_1 
	invokevirtual net.rim.tools.compiler.types.ClassType getStringClass( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	ldc literal_472:"<init>"
	aconst_null 
	aload_7 
	invokespecial net.rim.tools.compiler.types.ClassType.lookupMethod // pc=4
	astore_4 
	aload_4 
	ifnull Label736
	aload_4 
	bipush 4
	invokenonvirtual net.rim.tools.compiler.types.Method.setSpecial // pc=2
Label736:
	aload_0 
	ldc literal_482:"append"
	aload_0 
	aload_7 
	invokespecial net.rim.tools.compiler.types.ClassType.lookupMethod // pc=4
	astore_4 
	aload_4 
	ifnull Label747
	aload_4 
	bipush 5
	invokenonvirtual net.rim.tools.compiler.types.Method.setSpecial // pc=2
Label747:
	return 
	}


public final boolean[] getOverride( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	areturn_field .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	}


public final optimize( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	iconst_1 
	istore_6 
	aload_0 
	iipush 1073741824
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label11
	aload_0 
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label12
Label11:
	return 
Label12:
	aload_0 
	iipush 1073741824
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label22
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDefined // pc=1
	ifne Label23
Label22:
	return 
Label23:
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	bipush 40
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_5 
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iload_5 
	bipush 2
	imul 
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iconst_0 
	istore_4 
Label39:
	iload_4 
	iload_5 
	if_icmpge Label55
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_4 
	aaload 
	astore_3 
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	stringlength 
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iinc 4 1
	goto Label39
Label55:
	aload_0 
	iipush 6291457
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label64
	aload_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	invokevirtual boolean isNoWx( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	ifeq Label66
Label64:
	iconst_0 
	istore_6 
Label66:
	iconst_0 
	istore_7 
	iconst_0 
	istore 8
	aload_1 
	invokevirtual net.rim.tools.compiler.types.ClassType getStringClass( net.rim.tools.compiler.Compiler ) // pc=1
	astore 9
	aload_0 
	bipush 3
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	istore_5 
	iconst_0 
	istore_4 
Label80:
	iload_4 
	iload_5 
	if_icmplt Label84
	goto_w Label308
Label84:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_4 
	aaload 
	astore 10
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getType // pc=1
	astore 11
	aload 11
	checkcastbranch 
	astore 12
	aload 12
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getMostBaseType // pc=1
	astore 11
Label97:
	aload 11
	checkcastbranch 
	astore 12
	aload 12
	aload_1 
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label108
	iconst_1 
	goto Label109
Label108:
	iconst_0 
Label109:
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setReachable // pc=3
	aload 12
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDefined // pc=1
	ifne Label133
	aload_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_483:"Field '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_484:"' has undefined type: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 12
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload_0 
	iipush 134217728
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
Label133:
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getType // pc=1
	astore 11
	aload 10
	bipush 2
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	istore 12
	iload 12
	ifeq Label158
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.hasOffset // pc=1
	ifeq Label171
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	bipush 7
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	stringlength 
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	goto Label171
Label158:
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	bipush 5
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 11
	instanceof ReferenceType
	ifeq Label171
	aload_0 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iconst_1 
	iadd 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
Label171:
	iload_6 
	ifne Label174
	goto_w Label288
Label174:
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getModifiers // pc=1
	sipush 896
	iand 
	sipush 512
	if_icmpeq Label181
	goto_w Label288
Label181:
	aload 10
	bipush 64
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label189
	aload 11
	aload 9
	if_acmpne Label189
	goto_w Label288
Label189:
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.Field.hasValue // pc=1
	ifeq Label193
	goto_w Label288
Label193:
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.Field.isRequired // pc=1
	ifeq Label197
	goto_w Label288
Label197:
	aload 10
	iipush 285212672
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label230
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.Field.setEliminate // pc=1
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.hasOffset // pc=1
	ifne Label207
	goto_w Label306
Label207:
	aload 10
	bipush -1
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setOffset // pc=2
	aload 11
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	istore 13
	iload 12
	ifeq Label220
	iload_7 
	iload 13
	iadd 
	istore_7 
	goto_w Label306
Label220:
	iload 8
	iload 13
	iadd 
	istore 8
	aload_0 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iload 13
	isub 
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	goto_w Label306
Label230:
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	astore 13
	aload 10
	iipush 33554432
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label238
	goto_w Label288
Label238:
	iload 12
	ifne Label288
	aload 10
	iipush 16777216
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label288
	aload 10
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label288
	aload 13
	ldc literal_485:"this$"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifne Label257
	aload 13
	ldc literal_486:"$this$"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpeq Label288
Label257:
	aload_0 
	invokespecial net.rim.tools.compiler.types.ClassType.isAnonymousInnerClassName // pc=1
	ifne Label288
	aload_0 
	invokespecial net.rim.tools.compiler.types.ClassType.isNestedInnerClassName // pc=1
	ifne Label288
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label268
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokespecial net.rim.tools.compiler.types.ClassType.isInnerClassName // pc=1
	ifne Label288
Label268:
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.Field.setEliminate // pc=1
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.hasOffset // pc=1
	ifeq Label288
	aload 10
	bipush -1
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setOffset // pc=2
	aload 11
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	istore 14
	iload 8
	iload 14
	iadd 
	istore 8
	aload_0 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iload 14
	isub 
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
Label288:
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.hasOffset // pc=1
	ifeq Label306
	iload 12
	ifeq Label300
	aload 10
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getOffset // pc=1
	iload_7 
	isub 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setOffset // pc=2
	goto Label306
Label300:
	aload 10
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getOffset // pc=1
	iload 8
	isub 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setOffset // pc=2
Label306:
	iinc 4 1
	goto_w Label80
Label308:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label318
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	bipush 2
	imul 
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label318:
	aload_1 
	invokevirtual boolean isNoLimit( net.rim.tools.compiler.Compiler ) // pc=1
	ifne Label343
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iipush 64512
	if_icmple Label343
	new CompileException
	dup 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_487:"Data contribution too large: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_488:" (maximum: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iipush 64512
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	bipush 41
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=3
	athrow 
Label343:
	aload_0 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label348
	return 
Label348:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label372
	aload_0 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFieldWeight // pc=1
	iadd 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.optimize // pc=2
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iadd 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokespecial net.rim.tools.compiler.types.ClassType.cloneVTable // pc=2
	astore_2 
	goto Label376
Label372:
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
Label376:
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	ifne Label409
	aload_0 
	bipush 96
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label409
	aload_0 
	iipush 524288
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label409
	aload_0 
	bipush 64
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_5 
	iconst_0 
	istore_4 
Label393:
	iload_4 
	iload_5 
	if_icmpge Label409
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_4 
	aaload 
	astore_3 
	aload_3 
	bipush 48
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label407
	aload_3 
	bipush 64
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.addModifiers // pc=2
Label407:
	iinc 4 1
	goto Label393
Label409:
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 10
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_5 
	iconst_0 
	istore_4 
Label416:
	iload_4 
	iload_5 
	if_icmpge Label441
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_4 
	aaload 
	astore_3 
	aload_3 
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label436
	aload_3 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.virtualRequired // pc=2
	ifeq Label436
	aload_3 
	aload_1 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.Method.addToTable // pc=3
	goto Label439
Label436:
	aload_3 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.types.Method.markInVtable // pc=2
Label439:
	iinc 4 1
	goto Label416
Label441:
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	aload_0 
	bipush 10
	iload_5 
	bipush 4
	imul 
	iadd 
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0 
	aload_2 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iload_5 
	ifgt Label460
	goto_w Label544
Label460:
	aload_0 
	iipush 524288
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label494
	aload_0 
	iload_5 
	newarray 1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_5 
	iconst_0 
	istore_4 
Label472:
	iload_4 
	iload_5 
	if_icmplt Label476
	goto_w Label544
Label476:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_4 
	aaload 
	astore_3 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.Method.isInVtable // pc=1
	ifeq Label492
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getOffset // pc=1
	istore 11
	iload 11
	bipush -1
	if_icmpeq Label492
	aload_0 
	iload 11
	invokespecial net.rim.tools.compiler.types.ClassType.propagateOverride // pc=2
Label492:
	iinc 4 1
	goto Label472
Label494:
	aload_0 
	bipush 64
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isAnd // pc=2
	ifeq Label544
	aload_0 
	iload_5 
	newarray 1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore 11
Label504:
	aload 11
	ifnull Label544
	aload 11
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label544
	aload 11
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore 12
	aload 12
	ifnonnull Label544
	aload 11
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label519
	return 
Label519:
	aload 11
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iload_5 
	newarray 1
	astore 12
	iconst_0 
	istore_4 
Label528:
	iload_4 
	iload_5 
	if_icmpge Label537
	aload 12
	iload_4 
	iconst_1 
	bastore 
	iinc 4 1
	goto Label528
Label537:
	aload 11
	aload 12
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 11
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore 11
	goto Label504
Label544:
	return 
	}


public final addDataWeight( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iload_1 
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	return 
	}


public final int getDataWeight( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	ireturn_field .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	}


public final addCodeWeight( net.rim.tools.compiler.types.ClassType, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	iload_1 
	iadd 
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	return 
	}


public final int getCodeWeight( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	ireturn_field .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	}


public final int getVtableWeight( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	ireturn_field .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	}


public final int getFieldWeight( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	ireturn_field .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	}


public final net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.TypeModule ); // address: 0
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
	ifnonnull Label59
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDefined // pc=1
	ifne Label30
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_27745 // pc=1
	aload_4 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual net.rim.tools.compiler.codfile.ClassDef makeClassDef( net.rim.tools.compiler.codfile.Module, module:net_rim_loader-1.class#57, java.lang.String, java.lang.String ) // pc=4
	astore_3 
	aload_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.addUndefinedClass // pc=2
	goto Label55
Label30:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.makeClassDef // pc=4
	astore_3 
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label55
	aload_3 
	checkcastbranch_lib 
	astore_4 
	aload_4 
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getClassDef // pc=2
	checkcast_lib net.rim.tools.compiler.codfile.ClassDefLocal//module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24
	invokenonvirtual_lib .routine_10337 // pc=2
	goto Label55
Label50:
	aload_3 
	checkcast_lib net.rim.tools.compiler.codfile.ClassDefLocal//module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokestatic int toCodfileClassAttribute( int ) // Modifier
	invokenonvirtual_lib .routine_12452 // pc=2
Label55:
	aload_0 
	aload_3 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.setClassDef // pc=3
Label59:
	aload_3 
	areturn 
	}


final net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.TypeModule ); // address: 0
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
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getClassDef // pc=2
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


final net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.TypeModule ); // address: 0
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
	aload_0 
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
	invokenonvirtual net.rim.tools.compiler.types.ClassType.makeTypeItem // pc=2
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


public final populate( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label15
	aload_0 
	aconst_null 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aconst_null 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
Label15:
	aload_0 
	iipush -2147483648
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label20
	return 
Label20:
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDefined // pc=1
	ifne Label24
	return 
Label24:
	aload_0 
	iipush -2147483648
	invokenonvirtual net.rim.tools.compiler.types.ClassType.addModifiers // pc=2
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getClassDef // pc=2
	checkcast_lib net.rim.tools.compiler.codfile.ClassDefLocal//module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24 module:net_rim_loader-1.class#24
	astore_4 
	aload_1 
	invokevirtual net.rim.tools.compiler.exec.CodDigest getDigest( net.rim.tools.compiler.Compiler ) // pc=1
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_5 
	aload_0 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifne Label49
	aload_0 
	iipush 67108864
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label49
	aload_4 
	sipush 256
	invokenonvirtual_lib .routine_12452 // pc=2
Label49:
	aload_4 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	invokenonvirtual_lib .routine_12379 // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	astore_6 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label64
	aload_4 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getClassDef // pc=2
	aload_6 
	invokenonvirtual_lib .routine_12289 // pc=3
	goto Label70
Label64:
	aload_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getNullClassDef // pc=2
	aload_6 
	invokenonvirtual_lib .routine_12289 // pc=3
Label70:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label100
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	istore_3 
	iload_3 
	ifle Label97
	aload_4 
	iload_3 
	invokenonvirtual_lib .routine_12315 // pc=2
	iconst_0 
	istore_2 
Label82:
	iload_2 
	iload_3 
	if_icmpge Label97
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_2 
	aaload 
	astore_7 
	aload_4 
	aload_7 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getClassDef // pc=2
	aload_6 
	invokenonvirtual_lib .routine_12344 // pc=3
	iinc 2 1
	goto Label82
Label97:
	aload_0 
	aconst_null 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label100:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.allocateStaticData // pc=2
	istore_7 
	iconst_0 
	istore 8
	iconst_0 
	istore 9
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	istore_3 
	iload_3 
	ifle Label149
	iconst_0 
	istore_2 
Label114:
	iload_2 
	iload_3 
	if_icmpge Label149
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_2 
	aaload 
	astore 10
	aload 10
	bipush 2
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	istore 11
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.Field.isEliminate // pc=1
	ifeq Label129
	goto Label147
Label129:
	iload 11
	ifeq Label142
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.hasOffset // pc=1
	ifeq Label143
	aload 10
	iload_7 
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getOffset // pc=1
	iadd 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setOffset // pc=2
	iinc 8 1
	goto Label143
Label142:
	iinc 9 1
Label143:
	aload 10
	aload_1 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.types.Field.populate // pc=3
Label147:
	iinc 2 1
	goto Label114
Label149:
	aload_4 
	iload_7 
	invokenonvirtual_lib .routine_12368 // pc=2
	aload_4 
	iload 8
	iconst_1 
	invokenonvirtual_lib .routine_9631 // pc=3
	aload_4 
	iload 9
	iconst_0 
	invokenonvirtual_lib .routine_9631 // pc=3
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	istore_3 
	iconst_0 
	istore_2 
Label164:
	iload_2 
	iload_3 
	if_icmpge Label196
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_2 
	aaload 
	astore 10
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.Field.isEliminate // pc=1
	ifeq Label175
	goto Label194
Label175:
	aload 10
	bipush 2
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	istore 11
	iload 11
	ifeq Label184
	aload 10
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.hasOffset // pc=1
	ifeq Label194
Label184:
	aload 10
	aload_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.types.Field.getMember // pc=3
	checkcast_lib net.rim.tools.compiler.codfile.FieldDef//module:net_rim_loader-1.class#61 module:net_rim_loader-1.class#61 module:net_rim_loader-1.class#61
	astore 12
	aload_4 
	aload 12
	iload 11
	invokenonvirtual_lib .routine_9673 // pc=3
Label194:
	iinc 2 1
	goto Label164
Label196:
	aload_0 
	aconst_null 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_0 
	istore 10
	iconst_0 
	istore 11
	iconst_0 
	istore 12
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_3 
	iconst_0 
	istore_2 
Label209:
	iload_2 
	iload_3 
	if_icmpge Label241
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_2 
	aaload 
	astore 13
	aload 13
	aload_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_5 
	invokenonvirtual net.rim.tools.compiler.types.Method.populate // pc=4
	ifeq Label235
	aload 13
	bipush 18
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label228
	iinc 10 1
	goto Label239
Label228:
	aload 13
	invokenonvirtual net.rim.tools.compiler.types.Method.isInVtable // pc=1
	ifeq Label233
	iinc 11 1
	goto Label239
Label233:
	iinc 12 1
	goto Label239
Label235:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_2 
	aconst_null 
	aastore 
Label239:
	iinc 2 1
	goto Label209
Label241:
	aload_4 
	iload 11
	invokenonvirtual_lib .routine_12690 // pc=2
	aload_4 
	iload 12
	invokenonvirtual_lib .routine_12769 // pc=2
	aload_4 
	iload 10
	invokenonvirtual_lib .routine_12848 // pc=2
	iconst_0 
	istore 13
	iconst_0 
	istore 14
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	istore_3 
	iconst_0 
	istore_2 
Label258:
	iload_2 
	iload_3 
	if_icmplt Label262
	goto_w Label342
Label262:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_2 
	aaload 
	astore 15
	aload 15
	ifnonnull Label269
	goto_w Label340
Label269:
	aload 15
	aload_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.types.Method.getMember // pc=3
	checkcast Routine
	astore 16
	aload 15
	iipush 1048576
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label295
	iload 13
	ifne Label287
	iconst_1 
	istore 13
	aload_4 
	aload 16
	invokenonvirtual_lib .routine_12390 // pc=2
	goto Label291
Label287:
	aload_4 
	aload_4 
	invokenonvirtual_lib .routine_9615 // pc=1
	invokenonvirtual_lib .routine_12390 // pc=2
Label291:
	aload_4 
	aload 16
	invokenonvirtual_lib .routine_12877 // pc=2
	goto Label340
Label295:
	aload 15
	bipush 16
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label318
	aload 15
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	ifne Label314
	iload 14
	ifne Label310
	iconst_1 
	istore 14
	aload_4 
	aload 16
	invokenonvirtual_lib .routine_12401 // pc=2
	goto Label314
Label310:
	aload_4 
	aload_4 
	invokenonvirtual_lib .routine_9615 // pc=1
	invokenonvirtual_lib .routine_12401 // pc=2
Label314:
	aload_4 
	aload 16
	invokenonvirtual_lib .routine_12877 // pc=2
	goto Label340
Label318:
	aload 15
	bipush 18
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label326
	aload_4 
	aload 16
	invokenonvirtual_lib .routine_12877 // pc=2
	goto Label340
Label326:
	aload 15
	invokenonvirtual net.rim.tools.compiler.types.Method.isInVtable // pc=1
	ifeq Label337
	aload 16
	aload 15
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getAbsoluteOffset // pc=1
	invokevirtual routine
	aload_4 
	aload 16
	invokenonvirtual_lib .routine_12719 // pc=2
	goto Label340
Label337:
	aload_4 
	aload 16
	invokenonvirtual_lib .routine_12798 // pc=2
Label340:
	iinc 2 1
	goto_w Label258
Label342:
	aload_0 
	aconst_null 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload 13
	ifne Label354
	aload_4 
	aload_4 
	invokenonvirtual_lib .routine_9615 // pc=1
	invokenonvirtual_lib .routine_12390 // pc=2
Label354:
	iload 14
	ifne Label360
	aload_4 
	aload_4 
	invokenonvirtual_lib .routine_9615 // pc=1
	invokenonvirtual_lib .routine_12401 // pc=2
Label360:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.setMaxTypeListSize // pc=2
	return 
	}


public final int codfileOrder( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib java.lang.String.compareTo // pc=2
	istore_2 
	iload_2 
	ifne Label29
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	ifnonnull Label17
	aload_1 
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	ifnull Label29
	bipush -1
	istore_2 
	iload_2 
	ireturn 
Label17:
	aload_1 
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	ifnonnull Label24
	iconst_1 
	istore_2 
	iload_2 
	ireturn 
Label24:
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_1 
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokenonvirtual_lib java.lang.String.compareTo // pc=2
	istore_2 
Label29:
	iload_2 
	ireturn 
	}


public final int compareTo( net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_2 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	ifnonnull Label14
	aload_1 
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	ifnonnull Label11
	iconst_0 
	istore_2 
	goto Label25
Label11:
	bipush -1
	istore_2 
	goto Label25
Label14:
	aload_1 
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	ifnonnull Label20
	iconst_1 
	istore_2 
	goto Label25
Label20:
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_1 
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokenonvirtual_lib java.lang.String.compareTo // pc=2
	istore_2 
Label25:
	iload_2 
	ifne Label32
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib java.lang.String.compareTo // pc=2
	ireturn 
Label32:
	iload_2 
	ireturn 
	}


public final boolean equals( net.rim.tools.compiler.types.ClassType, java.lang.Object ); // address: 0
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
	aload_0 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.compareTo // pc=2
	ifne Label15
	iconst_1 
	ireturn 
Label15:
	iconst_0 
	ireturn 
Label17:
	iconst_0 
	ireturn 
	}


public final int hashCode( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_ // idx=0 pc=1
	istore_1 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	ifnull Label13
	iload_1 
	bipush 31
	imul 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	istore_1 
Label13:
	iload_1 
	ireturn 
	}


public final boolean isInner( net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_1 
	iload_1 
	ireturn 
	}

}
