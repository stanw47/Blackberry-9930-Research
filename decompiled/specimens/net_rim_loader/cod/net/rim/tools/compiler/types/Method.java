// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 26
// ########################################################


package net.rim.tools.compiler.types;


abstract public final class Method extends net.rim.tools.compiler.types.NameAndType

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.types.NameAndType /*net.rim.tools.compiler.types.NameAndType[]*/  _parameters ; // ofs = 11440 addr = 0)
	private int /*int*/  _parmLocalCount ; // ofs = 11444 addr = 0)
	private net.rim.tools.compiler.analysis.InstructionCode /*module:net_rim_loader.class#13*/  _body ; // ofs = 11448 addr = 0)
	private net.rim.tools.compiler.types.Method /*net.rim.tools.compiler.types.Method*/  _overrides ; // ofs = 11452 addr = 0)
	private net.rim.tools.compiler.types.Method /*net.rim.tools.compiler.types.Method[]*/  _overriddenBy ; // ofs = 11456 addr = 0)
	private int /*int*/  _icallIndex ; // ofs = 11460 addr = 0)
	private net.rim.tools.compiler.types.Method /*net.rim.tools.compiler.types.Method*/  _lastInvokeInterfaceMethod ; // ofs = 11464 addr = 0)
	private boolean /*boolean*/  _takesThisParm ; // ofs = 11468 addr = 0)
	private boolean /*boolean*/  _implementsInterfaceMethod ; // ofs = 11472 addr = 0)
	private boolean /*boolean*/  _inVtable ; // ofs = 11476 addr = 0)
	private net.rim.tools.compiler.codfile.TypeList /*net.rim.tools.compiler.codfile.TypeList[]*/  _protoTypeLists ; // ofs = 11480 addr = 0)
	private net.rim.tools.compiler.codfile.InterfaceMethodRef /*module:net_rim_loader-1.class#77[]*/  _interfaceMethodRefs ; // ofs = 11484 addr = 0)
	private int /*int*/  _special ; // ofs = 11488 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.types.ClassType, java.lang.String, net.rim.tools.compiler.types.Type, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	aload_1 
	iload_5 
	bipush 8
	ior 
	bipush -1
	invokespecial net.rim.tools.compiler.types.NameAndType.<init> // pc=6
	iload_4 
	ifle Label16
	aload_0 
	iload_4 
	newarray_object NameAndType
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label16:
	iload_5 
	bipush 2
	iand 
	ifeq Label24
	iload_5 
	bipush 16
	iand 
	ifeq Label30
Label24:
	aload_0 
	iconst_1 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	iconst_1 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label30:
	return 
	}


static public final java.lang.String getMethodSignatureString( java.lang.String, net.rim.tools.compiler.types.Type, java.util.Vector ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_3 
	aload_1 
	ifnull Label14
	aload_3 
	aload_1 
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label14:
	aload_3 
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 40
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_2 
	ifnull Label46
	iconst_0 
	istore_4 
Label24:
	iload_4 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label46
	iload_4 
	ifle Label34
	aload_3 
	ldc literal_536:", "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label34:
	aload_2 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast Type
	astore_5 
	aload_3 
	aload_5 
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iinc 4 1
	goto Label24
Label46:
	aload_3 
	bipush 41
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final addOverride( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label12
	aload_0 
	iload_2 
	iconst_1 
	iadd 
	newarray_object Method
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	goto Label22
Label12:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	arraylength 
	istore_2 
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_2 
	iconst_1 
	iadd 
	invokestatic net.rim.tools.compiler.types.Method[] resize( net.rim.tools.compiler.types.Method[], int ) // MyArrays
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
Label22:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_2 
	aload_1 
	aastore 
	return 
	}


private final boolean canAccess( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter 
	aload_2 
	sipush 128
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label7
	iconst_1 
	ireturn 
Label7:
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getClassType // pc=1
	astore_3 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getClassType // pc=1
	astore_4 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getPackageName // pc=1
	astore_5 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getPackageName // pc=1
	astore_6 
	aload_5 
	ifnonnull Label25
	aload_6 
	ifnonnull Label25
	iconst_1 
	ireturn 
Label25:
	aload_5 
	ifnull Label35
	aload_6 
	ifnull Label35
	aload_5 
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label35
	iconst_1 
	ireturn 
Label35:
	aload_2 
	sipush 256
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label41
	iconst_1 
	ireturn 
Label41:
	aload_1 
	iconst_0 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_534:"Method "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_535:" does not override "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateWarning( net.rim.tools.compiler.Compiler, boolean, java.lang.String, java.lang.String ) // pc=4
	iconst_0 
	ireturn 
	}


private final resolveType( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_2 
	checkcastbranch 
	astore_3 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getMostBaseType // pc=1
	astore_2 
Label7:
	aload_2 
	checkcastbranch 
	astore_3 
	aload_3 
	aload_1 
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label18
	iconst_1 
	goto Label19
Label18:
	iconst_0 
Label19:
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setReachable // pc=3
Label20:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final markInVtable( net.rim.tools.compiler.types.Method, boolean ); // address: 0
	{
	putfield_return .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	}


public final boolean isInVtable( net.rim.tools.compiler.types.Method ); // address: 0
	{
	ireturn_field .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	}


public final boolean isVirtualCall( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.types.ClassType ); // address: 0
	{
	enter 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	istore_2 
	iload_2 
	ifeq Label20
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush -1
	if_icmpeq Label20
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getOverride // pc=1
	ifnull Label20
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getOverride // pc=1
	astore_3 
	aload_3 
	ifnull Label20
	aload_3 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	baload 
	istore_2 
Label20:
	iload_2 
	ireturn 
	}


public final addParameter( net.rim.tools.compiler.types.Method, int, java.lang.String, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	new NameAndType
	dup 
	aload_2 
	aload_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	sipush 1024
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokespecial net.rim.tools.compiler.types.NameAndType.<init> // pc=6
	astore_4 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	aload_4 
	aastore 
	aload_0 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_3 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iadd 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	sipush 255
	if_icmple Label35
	new CompileException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_533:"Too many parameters in method "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.Method.getRoutineName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=2
	athrow 
Label35:
	return 
	}


public final int getParmLocalCount( net.rim.tools.compiler.types.Method ); // address: 0
	{
	ireturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public final int getNumParms( net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	ireturn 
	}


public final net.rim.tools.compiler.types.NameAndType getParm( net.rim.tools.compiler.types.Method, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	aaload 
	areturn 
	}


public final net.rim.tools.compiler.types.Type getParmType( net.rim.tools.compiler.types.Method, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParm // pc=2
	invokevirtual net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	areturn 
	}


public final boolean takesThisParm( net.rim.tools.compiler.types.Method ); // address: 0
	{
	ireturn_field .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	}


public final boolean hasReturnValue( net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label5
	iconst_1 
	ireturn 
Label5:
	iconst_0 
	ireturn 
	}


public final net.rim.tools.compiler.types.Type getReturnType( net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.Method.hasReturnValue // pc=1
	ifeq Label6
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	areturn 
Label6:
	aconst_null 
	areturn 
	}


public final int getMaxLocals( net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual_lib .routine_19649 // pc=1
	ireturn 
	}


public final int getMaxStack( net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual_lib .routine_19603 // pc=1
	ireturn 
	}


public final boolean isSamePrototype( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	istore_2 
	iload_2 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	if_icmpeq Label10
	iconst_0 
	ireturn 
Label10:
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.types.NameAndType.equals // pc=2
	ifne Label16
	iconst_0 
	ireturn 
Label16:
	iconst_0 
	istore_3 
Label18:
	iload_3 
	iload_2 
	if_icmpge Label37
	aload_0 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	astore_4 
	aload_1 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	astore_5 
	aload_4 
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label35
	iconst_0 
	ireturn 
Label35:
	iinc 3 1
	goto Label18
Label37:
	iconst_1 
	ireturn 
	}


public final boolean isVirtual( net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter_narrow 
	aload_0 
	iipush 1049106
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final setBody( net.rim.tools.compiler.types.Method, module:net_rim_loader.class#13 ); // address: 0
	{
	putfield_return .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final module:net_rim_loader.class#13 getBody( net.rim.tools.compiler.types.Method ); // address: 0
	{
	areturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final setOverride( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_2 
	if_acmpne Label5
	return 
Label5:
	aload_0 
	aload_2 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_2 
	aload_0 
	invokespecial net.rim.tools.compiler.types.Method.addOverride // pc=2
	aload_2 
	iipush 268566528
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label18
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.setReachable // pc=2
Label18:
	return 
	}


public final setImplements( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_2 
	aload_0 
	invokespecial net.rim.tools.compiler.types.Method.addOverride // pc=2
	aload_2 
	iipush 270663680
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label14
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.setReachable // pc=2
Label14:
	return 
	}


public final setReachable( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	aload_0 
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label6
	return 
Label6:
	aload_0 
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.addModifiers // pc=2
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label20
	aload_1 
	aload_0 
	invokevirtual useMethod( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.Method ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setReachable // pc=3
Label20:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label39
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	arraylength 
	istore_2 
	iconst_0 
	istore_3 
Label27:
	iload_3 
	iload_2 
	if_icmpge Label39
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_3 
	aaload 
	astore_4 
	aload_4 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.setReachable // pc=2
	iinc 3 1
	goto Label27
Label39:
	return 
	}


public final java.lang.String getRoutineName( net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	astore_1 
	aload_1 
	areturn 
	}


public final net.rim.tools.compiler.types.Type[] makePrototypeMap( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	istore_2 
	iload_2 
	istore_3 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifeq Label9
	iinc 3 1
Label9:
	iconst_0 
	istore_4 
Label11:
	iload_4 
	iload_2 
	if_icmpge Label24
	aload_0 
	iload_4 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	astore_5 
	aload_5 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label22
	iinc 3 1
Label22:
	iinc 4 1
	goto Label11
Label24:
	iconst_0 
	istore_4 
	iload_3 
	newarray_object Type
	astore_5 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifeq Label50
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getClassType // pc=1
	astore_6 
	aload_0 
	bipush 16
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label45
	new ClassUninitializedType
	dup 
	aload_6 
	checkcast ClassType
	iconst_0 
	invokespecial net.rim.tools.compiler.types.ClassUninitializedType.<init> // pc=3
	astore_6 
Label45:
	aload_5 
	iload_4 
	iinc 4 1
	aload_6 
	aastore 
Label50:
	iconst_0 
	istore_6 
Label52:
	iload_6 
	iload_2 
	if_icmpge Label74
	aload_0 
	iload_6 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	astore_7 
	aload_5 
	iload_4 
	iinc 4 1
	aload_7 
	aastore 
	aload_7 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label72
	aload_5 
	iload_4 
	iinc 4 1
	aload_1 
	aastore 
Label72:
	iinc 6 1
	goto Label52
Label74:
	aload_5 
	areturn 
	}


public final boolean virtualRequired( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.Method.isVirtual // pc=1
	ifne Label6
	iconst_0 
	ireturn 
Label6:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifeq Label10
	iconst_1 
	ireturn 
Label10:
	aload_0 
	bipush 32
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label16
	iconst_1 
	ireturn 
Label16:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getBaseClassType // pc=1
	ifnonnull Label29
	aload_0 
	bipush 64
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label29
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label29
	iconst_0 
	ireturn 
Label29:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iipush 65536
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label43
	aload_0 
	iipush 524288
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label43
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label43
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label43
	iconst_0 
	ireturn 
Label43:
	iconst_1 
	ireturn 
	}


public final addToTable( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.markInVtable // pc=2
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iload_3 
	iconst_1 
	isub 
	istore_4 
Label11:
	iload_4 
	iflt Label41
	aload_2 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast Method
	astore_5 
	aload_0 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.types.Method.isSamePrototype // pc=2
	ifeq Label39
	aload_0 
	aload_1 
	aload_5 
	invokespecial net.rim.tools.compiler.types.Method.canAccess // pc=3
	ifeq Label39
	aload_0 
	aload_1 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.types.Method.setOverride // pc=3
	aload_0 
	iload_4 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setOffset // pc=2
	aload_2 
	aload_0 
	iload_4 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	return 
Label39:
	iinc 4 -1
	goto Label11
Label41:
	aload_0 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setOffset // pc=2
	aload_2 
	aload_0 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final int findInTable( net.rim.tools.compiler.types.Method, java.util.Vector ); // address: 0
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
	iflt Label23
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast Method
	astore_4 
	aload_0 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.types.Method.isSamePrototype // pc=2
	ifeq Label21
	iload_3 
	ireturn 
Label21:
	iinc 3 -1
	goto Label8
Label23:
	bipush -1
	ireturn 
	}


public final int getAbsoluteOffset( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter_narrow 
	bipush -1
	istore_2 
	iload_2 
	ireturn 
	}


public final resolve( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	aload_0 
	iipush 536870912
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label9
	aload_0 
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label10
Label9:
	return 
Label10:
	aload_0 
	iipush 536870912
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.addModifiers // pc=2
	aload_0 
	bipush 16
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label20
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.resolve // pc=2
Label20:
	aload_0 
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial net.rim.tools.compiler.types.Method.resolveType // pc=3
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label44
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	istore_2 
	iconst_0 
	istore_3 
Label31:
	iload_3 
	iload_2 
	if_icmpge Label44
	aload_0 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	astore_4 
	aload_0 
	aload_1 
	aload_4 
	invokespecial net.rim.tools.compiler.types.Method.resolveType // pc=3
	iinc 3 1
	goto Label31
Label44:
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label53
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label53
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	invokenonvirtual_lib .routine_19702 // pc=2
Label53:
	return 
	}


public final optimize( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter_narrow 
	aload_0 
	iipush 1073741824
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label9
	aload_0 
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label10
Label9:
	return 
Label10:
	aload_0 
	iipush 1073741824
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.addModifiers // pc=2
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label18
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	invokenonvirtual_lib .routine_20289 // pc=2
Label18:
	return 
	}


public final net.rim.tools.compiler.codfile.TypeList getProtoTypeList( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	ifnonnull Label10
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getCount // pc=1
	istore_2 
	aload_0 
	iload_2 
	newarray_object TypeList
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label10:
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getOrdinal // pc=1
	istore_2 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iload_2 
	aaload 
	ifnonnull Label30
	aconst_null 
	astore_3 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifeq Label23
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_3 
Label23:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iload_2 
	aload_1 
	aload_3 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokestatic net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.NameAndType[] ) // Type
	aastore 
Label30:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iload_2 
	aaload 
	areturn 
	}


final boolean suppressMemberName( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual boolean isNoName( net.rim.tools.compiler.Compiler ) // pc=1
	ifne Label6
	iconst_0 
	ireturn 
Label6:
	aload_0 
	iipush 137363473
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label12
	iconst_0 
	ireturn 
Label12:
	aload_0 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label20
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifeq Label20
	iconst_0 
	ireturn 
Label20:
	aload_0 
	sipush 512
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label31
	aload_0 
	sipush 384
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label33
	aload_1 
	invokevirtual boolean isOptimizePackage( net.rim.tools.compiler.Compiler ) // pc=1
	ifeq Label33
Label31:
	iconst_1 
	ireturn 
Label33:
	iconst_0 
	ireturn 
	}


public final module:net_rim_loader.class#23 getMember( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.TypeModule ); // address: 0
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
	goto_w Label83
Label13:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.Method.suppressMemberName // pc=2
	istore_5 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	astore_6 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getClassDef // pc=2
	astore_7 
	aload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.Type ) // Type
	astore 8
	aload_0 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.Method.getProtoTypeList // pc=2
	astore 9
	aload_7 
	aload_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_5 
	aload 8
	aload 9
	invokevirtual net.rim.tools.compiler.codfile.Routine makeRoutine( net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#57, java.lang.String, boolean, net.rim.tools.compiler.codfile.TypeList, net.rim.tools.compiler.codfile.TypeList ) // pc=6
	astore 10
	aload_0 
	iipush 131072
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label70
	aload 10
	checkcastbranch 
	astore 11
	aload 11
	aload_0 
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.types.ReferenceType.getTypeModule // pc=1
	invokenonvirtual net.rim.tools.compiler.types.Method.getMember // pc=3
	checkcast RoutineLocal
	invokenonvirtual net.rim.tools.compiler.codfile.RoutineDomestic.setSibling // pc=2
	goto Label78
Label56:
	aload 10
	checkcastbranch 
	astore 11
	aload 11
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic int toCodfileRoutineAttribute( int ) // Modifier
	invokenonvirtual net.rim.tools.compiler.codfile.RoutineLocal.setAttributes // pc=2
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.isUndefined // pc=1
	ifeq Label78
	aload_7 
	aload 10
	invokevirtual undefinedRoutine( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Routine ) // pc=2
	goto Label78
Label70:
	aload_1 
	invokevirtual net.rim.tools.compiler.types.ClassType getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual net.rim.tools.compiler.types.ClassType.inVtable // pc=2
	ifeq Label78
	aload 10
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual routine
Label78:
	aload_0 
	aload 10
	iload_3 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.setMember // pc=3
	astore_4 
Label83:
	aload_4 
	areturn 
	}


public final module:net_rim_loader-1.class#77 getInterfaceMethodRef( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifnonnull Label10
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getCount // pc=1
	istore_3 
	aload_0 
	iload_3 
	newarray_object_lib net.rim.tools.compiler.codfile.InterfaceMethodRef//module:net_rim_loader-1.class#77 module:net_rim_loader-1.class#77 module:net_rim_loader-1.class#77
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
Label10:
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getOrdinal // pc=1
	istore_3 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iload_3 
	aaload 
	ifnonnull Label48
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	astore_4 
	aconst_null 
	astore_5 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDefined // pc=1
	ifeq Label41
	aload_0 
	aload_1 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.Method.getMember // pc=3
	checkcast Routine
	astore_6 
	aload_6 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	iconst_1 
	invokevirtual makeSymbolic( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57, boolean ) // pc=3
	aload_4 
	aload_6 
	invokenonvirtual_lib .routine_28461 // pc=2
	astore_5 
	goto Label44
Label41:
	aload_4 
	invokenonvirtual_lib .routine_28445 // pc=1
	astore_5 
Label44:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iload_3 
	aload_5 
	aastore 
Label48:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iload_3 
	aaload 
	areturn 
	}


public final int getIcallIndex( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_2 
	if_acmpeq Label11
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getIcallIndex // pc=1
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	aload_2 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
Label11:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ireturn 
	}


public final boolean populate( net.rim.tools.compiler.types.Method, net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.exec.CodDigest$ClassDigest ); // address: 0
	{
	enter 
	aload_0 
	iipush -2147352576
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifeq Label7
	iconst_0 
	ireturn 
Label7:
	aload_0 
	iipush 268435456
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.is // pc=2
	ifne Label13
	iconst_0 
	ireturn 
Label13:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label17
	iconst_0 
	ireturn 
Label17:
	aload_0 
	iipush -2147483648
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.addModifiers // pc=2
	aload_0 
	aload_1 
	aload_3 
	invokespecial net.rim.tools.compiler.types.NameAndType.populate // pc=3
	aload_0 
	aload_1 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.Method.getMember // pc=3
	pop 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	aload_2 
	invokenonvirtual_lib .routine_21430 // pc=3
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	ireturn 
	}


public final boolean matches( net.rim.tools.compiler.types.Method, java.lang.String, net.rim.tools.compiler.types.Type, java.util.Vector ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label7
	iconst_0 
	ireturn 
Label7:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	if_acmpeq Label12
	iconst_0 
	ireturn 
Label12:
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	istore_4 
	iload_4 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpeq Label21
	iconst_0 
	ireturn 
Label21:
	iconst_0 
	istore_5 
Label23:
	iload_5 
	iload_4 
	if_icmpge Label42
	aload_0 
	iload_5 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	astore_6 
	aload_3 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast Type
	astore_7 
	aload_6 
	aload_7 
	if_acmpeq Label40
	iconst_0 
	ireturn 
Label40:
	iinc 5 1
	goto Label23
Label42:
	iconst_1 
	ireturn 
	}


public final boolean equals( net.rim.tools.compiler.types.Method, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcastbranch 
	astore_2 
	aload_0 
	aload_2 
	if_acmpne Label9
	iconst_1 
	ireturn 
Label9:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getName // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label16
	iconst_0 
	ireturn 
Label16:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.NameAndType.getType // pc=1
	if_acmpeq Label22
	iconst_0 
	ireturn 
Label22:
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	istore_3 
	iload_3 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	if_icmpeq Label31
	iconst_0 
	ireturn 
Label31:
	iconst_0 
	istore_4 
Label33:
	iload_4 
	iload_3 
	if_icmpge Label51
	aload_0 
	iload_4 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	astore_5 
	aload_2 
	iload_4 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	astore_6 
	aload_5 
	aload_6 
	if_acmpeq Label49
	iconst_0 
	ireturn 
Label49:
	iinc 4 1
	goto Label33
Label51:
	iconst_1 
	ireturn 
Label53:
	iconst_0 
	ireturn 
	}


public final int hashCode( net.rim.tools.compiler.types.Method ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_ // idx=0 pc=1
	bipush 31
	imul 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	istore_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.Method.getNumParms // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label14:
	iload_3 
	iload_2 
	if_icmpge Label28
	iload_1 
	bipush 31
	imul 
	aload_0 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.types.Method.getParmType // pc=2
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	istore_1 
	iinc 3 1
	goto Label14
Label28:
	iload_1 
	ireturn 
	}


public final setSpecial( net.rim.tools.compiler.types.Method, int ); // address: 0
	{
	putfield_return .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	}


public final boolean isSpecial( net.rim.tools.compiler.types.Method, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	iload_1 
	if_icmpne Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}


public final int getSpecial( net.rim.tools.compiler.types.Method ); // address: 0
	{
	ireturn_field .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	}

}
