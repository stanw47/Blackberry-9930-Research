// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 68
// ########################################################


package net.rim.tools.compiler.analysis;


abstract public final class InstructionResolver extends Object
implements net.rim.tools.compiler.vm.Constants, net.rim.tools.compiler.classfile.ByteCodeBlockTypes

{
	// @@@@@@@@@@@@@ Static fields 
	private final static int[] /*int[]*/  _opcodeMapping ; // ofs = 21170 addr = 151)
	private final static int[] /*int[]*/  _ifMapping ; // ofs = 21176 addr = 152)

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _newOrdinal ; // ofs = 21134 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _parmTypes ; // ofs = 21138 addr = 0)
	private boolean[] /*boolean[]*/  _boundaries ; // ofs = 21142 addr = 0)
	private boolean /*boolean*/  _foundLDC ; // ofs = 21146 addr = 0)
	private boolean /*boolean*/  _rewriteMethods ; // ofs = 21150 addr = 0)
	private net.rim.tools.compiler.Compiler /*net.rim.tools.compiler.Compiler*/  _compiler ; // ofs = 21154 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _classType ; // ofs = 21158 addr = 0)
	private net.rim.tools.compiler.types.Method /*module:net_rim_loader-2.class#26*/  _method ; // ofs = 21162 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeInstructions /*net.rim.tools.compiler.classfile.ByteCodeInstructions*/  _block ; // ofs = 21166 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.tools.compiler.analysis.InstructionResolver ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


static public final boolean isUnicode( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	stringlength 
	istore_1 
	iconst_0 
	istore_2 
Label6:
	iload_2 
	iload_1 
	if_icmpge Label21
	aload_0 
	iload_2 
	stringaload 
	istore_3 
	iload_3 
	iipush 65280
	iand 
	ifeq Label19
	iconst_1 
	ireturn 
Label19:
	iinc 2 1
	goto Label6
Label21:
	iconst_0 
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static InstructionResolver
	clinit_wait 
	arrayinit [-52, 0, 0, 0, 34, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -81, 0, 0, 0, -79, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -80, 0, 0, 0, -84, 0, 0, 0, -82, 0, 0, 0, -83, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -75, 0, 0, 0, -73, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -74, 0, 0, 0, -78, 0, 0, 0, -77, 0, 0, 0, -76, 0, 0, 0, -51, 0, 0, 0, -50, 0, 0, 0, -49, 0, 0, 0, -47, 0, 0, 0, -46, 0, 0, 0, -48, 0, 0, 0, -45, 0, 0, 0, -44, 0, 0, 0, -43, 0, 0, 0, 122, 0, 0, 0, 123, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 124, 0, 0, 0, 125, 0, 0, 0, 2, 1, 0, 0, 3, 1, 0, 0, 126, 0, 0, 0, 127, 0, 0, 0, 4, 1, 0, 0, 5, 1, 0, 0, -128, 0, 0, 0, -127, 0, 0, 0, 6, 1, 0, 0, 7, 1, 0, 0, -126, 0, 0, 0, -125, 0, 0, 0, 8, 1, 0, 0, 9, 1, 0, 0, 118, 0, 0, 0, 119, 0, 0, 0, 10, 1, 0, 0, 11, 1, 0, 0, -118, 0, 0, 0, -117, 0, 0, 0, -116, 0, 0, 0, -115, 0, 0, 0, -114, 0, 0, 0, -113, 0, 0, 0, -124, 0, 0, 0, -123, 0, 0, 0, -122, 0, 0, 0, -121, 0, 0, 0, -120, 0, 0, 0, -119, 0, 0, 0, -1, -1, -1, -1, 116, 0, 0, 0, 12, 1, 0, 0, 13, 1, 0, 0, 117, 0, 0, 0, 14, 1, 0, 0, 15, 1, 0, 0, 16, 1, 0, 0, 17, 1, 0, 0, 18, 1, 0, 0, 19, 1, 0, 0, 20, 1, 0, 0, 21, 1, 0, 0, 113, 0, 0, 0, 115, 0, 0, 0, 114, 0, 0, 0, -112, 0, 0, 0, 22, 1, 0, 0, 23, 1, 0, 0, 24, 1, 0, 0, 25, 1, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 24, 0, 0, 0, 30, 0, 0, 0, 24, 0, 0, 0, 30, 0, 0, 0, 27, 0, 0, 0, -1, -1, -1, -1, 109, 0, 0, 0, 105, 0, 0, 0, 99, 0, 0, 0, 95, 0, 0, 0, 1, 0, 0, 0, 5, 0, 0, 0, 7, 0, 0, 0, 2, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -89, 0, 0, 0, -68, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -54, 0, 0, 0, -53, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1]
	putstatic _opcodeMapping // InstructionResolver
	arrayinit [-109, 0, 0, 0, -106, 0, 0, 0, -100, 0, 0, 0, -102, 0, 0, 0, -104, 0, 0, 0, -98, 0, 0, 0, -111, 0, 0, 0, -108, 0, 0, 0, -101, 0, 0, 0, -103, 0, 0, 0, -105, 0, 0, 0, -99, 0, 0, 0, -110, 0, 0, 0, -107, 0, 0, 0, -1, -1, -1, -1]
	putstatic _ifMapping // InstructionResolver
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final net.rim.tools.compiler.analysis.InstructionTarget getBranchTarget( net.rim.tools.compiler.analysis.InstructionResolver, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	iconst_1 
	invokevirtual_short .virtual_26 // idx=26 pc=3
	areturn 
	}


private final net.rim.tools.compiler.types.Type findType( net.rim.tools.compiler.analysis.InstructionResolver, java.lang.String ); // address: 0
	{
	enter 
	new TypeDescriptor
	dup 
	aload_1 
	invokespecial net.rim.tools.compiler.classfile.TypeDescriptor.<init> // pc=2
	astore_2 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_2 
	invokestatic_lib net.rim.tools.compiler.types.Type.routine_26683(  ) // Type
	astore_3 
	aload_2 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	ifeq Label27
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_370:"Invalid type descriptor: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label27:
	aload_3 
	astore_4 
	aload_4 
	checkcastbranch_lib 
	astore_5 
	aload_5 
	invokenonvirtual_lib .routine_156 // pc=1
	astore_4 
Label35:
	aload_4 
	checkcastbranch_lib 
	astore_5 
	aload_5 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	invokenonvirtual_lib .routine_3331 // pc=3
	aload_5 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_3552 // pc=2
	aload_5 
	invokenonvirtual_lib .routine_3385 // pc=1
	ifne Label66
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_371:"Reference to undefined class: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokenonvirtual_lib .routine_1165 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iipush 134217728
	invokenonvirtual_lib .routine_1278 // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iipush 134217728
	invokenonvirtual_lib .routine_19570 // pc=2
Label66:
	aload_5 
	iipush 131072
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label76
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 8
	aload_1 
	stringlength 
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
Label76:
	aload_3 
	areturn 
	}


private final module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.analysis.InstructionResolver, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore_2 
	aload_2 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	invokenonvirtual_lib .routine_3331 // pc=3
	aload_2 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_3552 // pc=2
	aload_2 
	invokenonvirtual_lib .routine_3385 // pc=1
	ifne Label33
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_371:"Reference to undefined class: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokenonvirtual_lib .routine_1165 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iipush 134217728
	invokenonvirtual_lib .routine_1278 // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iipush 134217728
	invokenonvirtual_lib .routine_19570 // pc=2
Label33:
	aload_2 
	iipush 131072
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label43
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 8
	aload_1 
	stringlength 
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
Label43:
	aload_2 
	areturn 
	}


private final module:net_rim_loader-2.class#26 findMethod( net.rim.tools.compiler.analysis.InstructionResolver, module:net_rim_loader-2.class#4, java.lang.String, net.rim.tools.compiler.types.Type, java.util.Vector, boolean ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_2 
	aload_3 
	aload_4 
	iload_5 
	iconst_0 
	invokenonvirtual_lib .routine_2816 // pc=7
	astore_6 
	aload_6 
	ifnonnull Label35
	aload_2 
	aload_3 
	aload_4 
	invokestatic_lib module:net_rim_loader-2.class#26.routine_18388(  ) // class#26
	astore_7 
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_372:"Class: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokenonvirtual_lib .routine_1165 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_373:" has no member: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label35:
	aload_6 
	areturn 
	}


private final net.rim.tools.compiler.types.Type resolveClass( net.rim.tools.compiler.analysis.InstructionResolver, net.rim.tools.compiler.classfile.ConstantPoolClass, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolClass.getName // pc=1
	astore_3 
	aconst_null 
	astore_4 
	iload_2 
	ifne Label18
	aload_3 
	iconst_0 
	stringaload 
	bipush 91
	if_icmpne Label18
	aload_0 
	aload_3 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findType // pc=2
	astore_4 
	goto Label22
Label18:
	aload_0 
	aload_3 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findClassType // pc=2
	astore_4 
Label22:
	aload_1 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolClass.setType // pc=2
	aload_4 
	areturn 
	}


private final module:net_rim_loader-2.class#18 resolveField( net.rim.tools.compiler.analysis.InstructionResolver, net.rim.tools.compiler.classfile.ConstantPoolFieldRef, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getClassType // pc=1
	astore_3 
	aload_3 
	ifnonnull Label13
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getConstantPoolClass // pc=1
	iconst_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.resolveClass // pc=3
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore_3 
Label13:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getType // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findType // pc=2
	astore_4 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getName // pc=1
	astore_5 
	aload_3 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_5 
	aload_4 
	iload_2 
	iconst_1 
	invokenonvirtual_lib .routine_2077 // pc=6
	astore_6 
	aload_6 
	ifnull Label32
	goto_w Label101
Label32:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iipush 134217728
	invokenonvirtual_lib .routine_19570 // pc=2
	iipush 134217856
	istore_7 
	iload_7 
	iload_2 
	ifeq Label42
	bipush 2
	goto Label43
Label42:
	bipush 4
Label43:
	ior 
	istore_7 
	bipush -1
	istore 8
	aload_5 
	ldc literal_374:"RIM_pragma"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label69
	iload_7 
	bipush 64
	ior 
	istore_7 
	new_lib net.rim.tools.compiler.types.Field//module:net_rim_loader-2.class#18 module:net_rim_loader-2.class#18 module:net_rim_loader-2.class#18
	dup 
	aload_5 
	aload_4 
	aload_3 
	iload_7 
	iload 8
	new_lib net.rim.tools.compiler.types.Constant//module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11 module:net_rim_loader-2.class#11
	dup 
	ldc_nullstr 
	invokespecial_lib .routine_11830 // pc=2
	invokespecial_lib .routine_13096 // pc=7
	astore_6 
	goto_w Label121
Label69:
	new_lib net.rim.tools.compiler.types.Field//module:net_rim_loader-2.class#18 module:net_rim_loader-2.class#18 module:net_rim_loader-2.class#18
	dup 
	aload_5 
	aload_4 
	aload_3 
	iload_7 
	iload 8
	aconst_null 
	invokespecial_lib .routine_13096 // pc=7
	astore_6 
	aload_6 
	invokenonvirtual_lib .routine_19555 // pc=1
	aload_3 
	invokenonvirtual_lib .routine_3385 // pc=1
	ifeq Label121
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_3 
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_375:"No definition found for member: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	goto Label121
Label101:
	iload_2 
	ifne Label121
	aload_6 
	invokenonvirtual_lib .routine_19522 // pc=1
	sipush 512
	if_icmplt Label121
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_3 
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_376:"Field offset too large for: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label121:
	aload_6 
	iipush 131072
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label131
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 6
	aload_5 
	stringlength 
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
Label131:
	aload_1 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolFieldRef.setField // pc=2
	aload_6 
	areturn 
	}


private final module:net_rim_loader-2.class#26 resolveMethod( net.rim.tools.compiler.analysis.InstructionResolver, module:net_rim_loader-2.class#4, java.lang.String, java.lang.String, boolean, boolean ); // address: 0
	{
	enter 
	aconst_null 
	astore_6 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	dup 
	astore_7 
	monitorenter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	new TypeDescriptor
	dup 
	aload_3 
	invokespecial net.rim.tools.compiler.classfile.TypeDescriptor.<init> // pc=2
	astore 8
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload 8
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib net.rim.tools.compiler.types.Type.routine_26898(  ) // Type
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload 8
	invokestatic_lib net.rim.tools.compiler.types.Type.routine_26683(  ) // Type
	astore 9
	aload 8
	invokevirtual_short .virtual_5 // idx=5 pc=1
	ifeq Label44
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_377:"Invalid type descriptor '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_378:"' for method: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label44:
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_2 
	aload 9
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_5 
	iconst_1 
	invokenonvirtual_lib .routine_2816 // pc=7
	astore_6 
	aload_6 
	ifnull Label56
	goto_w Label113
Label56:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iipush 134217728
	invokenonvirtual_lib .routine_19570 // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 10
	iipush 134217856
	istore 11
	iload_5 
	ifeq Label70
	iload 11
	bipush 2
	ior 
	istore 11
Label70:
	new_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	dup 
	aload_1 
	aload_2 
	aload 9
	iload 10
	iload 11
	invokespecial_lib .routine_18325 // pc=6
	astore_6 
	aload_6 
	invokenonvirtual_lib .routine_19555 // pc=1
	iconst_0 
	istore 12
Label83:
	iload 12
	iload 10
	if_icmpge Label96
	aload_6 
	iload 12
	aconst_null 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload 12
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.Type//net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type
	invokenonvirtual_lib .routine_15983 // pc=4
	iinc 12 1
	goto Label83
Label96:
	aload_1 
	invokenonvirtual_lib .routine_3385 // pc=1
	ifne Label100
	goto_w Label154
Label100:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_379:"No definition found for method: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	goto Label154
Label113:
	aload_6 
	invokenonvirtual_lib .routine_19303 // pc=1
	astore 10
	iload_4 
	ifeq Label144
	aload 10
	sipush 2048
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label144
	aload_1 
	bipush 32
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label144
	aload 10
	aload_1 
	if_acmpeq Label144
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	aload_6 
	invokevirtual module:net_rim_loader-2.class#26 mirandize( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, module:net_rim_loader-2.class#26 ) // pc=3
	astore 11
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload 11
	invokenonvirtual_lib .routine_2377 // pc=3
	aload 11
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_6 
	invokenonvirtual_lib .routine_16392 // pc=3
	aload 11
	astore_6 
Label144:
	aload_6 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_16440 // pc=2
	aload_6 
	iipush 131072
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label154
	aload_6 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_16993 // pc=2
Label154:
	aload_7 
	monitorexit 
	goto Label162
	astore 13
	aload_7 
	monitorexit 
	aload 13
	athrow 
Label162:
	aload_6 
	iipush 131072
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label172
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 6
	aload_2 
	stringlength 
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
Label172:
	aload_6 
	areturn 
	}


private final module:net_rim_loader-2.class#26 resolveMethod( net.rim.tools.compiler.analysis.InstructionResolver, net.rim.tools.compiler.classfile.ConstantPoolMethodRef, boolean, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getClassType // pc=1
	astore_4 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getType // pc=1
	astore_5 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getName // pc=1
	astore_6 
	aload_4 
	ifnonnull Label56
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getConstantPoolClass // pc=1
	astore_7 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolClass.getName // pc=1
	astore 8
	aload_0 
	aload_7 
	iconst_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.resolveClass // pc=3
	astore 9
	aload 9
	checkcastbranch_lib 
	astore_4 
	goto Label43
Label27:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label43
	aload 9
	instanceof_lib net.rim.tools.compiler.types.ArrayType//module:net_rim_loader-2.class#0 module:net_rim_loader-2.class#0 module:net_rim_loader-2.class#0
	ifeq Label43
	ldc literal_380:"clone"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	aload_0 
	ldc literal_381:"net.rim.device.api.util.Arrays"
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findClassType // pc=2
	astore_4 
	aload_7 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolClass.setType // pc=2
Label43:
	aload_4 
	ifnonnull Label56
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_371:"Reference to undefined class: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
Label56:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label59
	goto_w Label251
Label59:
	aload_4 
	ifnonnull Label62
	goto_w Label251
Label62:
	aload_4 
	invokenonvirtual_lib .routine_1154 // pc=1
	astore_7 
	aload_7 
	ifnonnull Label69
	iconst_0 
	goto Label71
Label69:
	aload_7 
	stringlength 
Label72:
	ldc literal_382:"java.lang"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label77
	goto_w Label251
Label77:
	iload_3 
	ifne Label80
	goto_w Label196
Label80:
	ldc literal_383:"valueOf"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label85
	goto_w Label196
Label85:
	iconst_0 
	istore 8
	aload_4 
	invokenonvirtual_lib .routine_25353 // pc=1
	astore 9
	aload 9
	stringlength 
	tableswitch  :
		
		
		
		
		
		
		

Label93:
	ldc literal_384:"Byte"
	aload 9
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label104
	ldc literal_385:"(B)Ljava/lang/Byte;"
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label104
	iconst_1 
	istore 8
	goto_w Label182
Label104:
	ldc literal_386:"Long"
	aload 9
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label109
	goto_w Label182
Label109:
	ldc literal_387:"(L)Ljava/lang/Long;"
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label114
	goto_w Label182
Label114:
	iconst_1 
	istore 8
	goto_w Label182
Label117:
	ldc literal_388:"Float"
	aload 9
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label128
	ldc literal_389:"(F)Ljava/lang/Float;"
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label128
	iconst_1 
	istore 8
	goto Label182
Label128:
	ldc literal_390:"Short"
	aload 9
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	ldc literal_391:"(S)Ljava/lang/Short;"
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	iconst_1 
	istore 8
	goto Label182
Label139:
	ldc literal_392:"Double"
	aload 9
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	ldc literal_393:"(D)Ljava/lang/Double;"
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	iconst_1 
	istore 8
	goto Label182
Label150:
	ldc literal_394:"Boolean"
	aload 9
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label161
	ldc literal_395:"(Z)Ljava/lang/Boolean;"
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label161
	iconst_1 
	istore 8
	goto Label182
Label161:
	ldc literal_396:"Integer"
	aload 9
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	ldc literal_397:"(I)Ljava/lang/Integer;"
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	iconst_1 
	istore 8
	goto Label182
Label172:
	ldc literal_398:"Character"
	aload 9
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	ldc literal_399:"(C)Ljava/lang/Character;"
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	iconst_1 
	istore 8
Label182:
	iload 8
	ifne Label185
	goto_w Label251
Label185:
	aload_0 
	ldc literal_400:"net.rim.device.api.util.NumberUtilities"
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findClassType // pc=2
	astore_4 
	aload_1 
	new ConstantPoolClass
	dup 
	aload_4 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolClass.<init> // pc=2
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.setConstantPoolClass // pc=2
	goto Label251
Label196:
	iload_2 
	ifeq Label251
	ldc literal_401:"desiredAssertionStatus"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label251
	aload_4 
	invokenonvirtual_lib .routine_25353 // pc=1
	astore 8
	ldc literal_402:"Class"
	aload 8
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label251
	ldc literal_403:"()Z"
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label251
	aload_0 
	ldc literal_404:"net.rim.device.api.system.DeviceInfo"
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findClassType // pc=2
	astore_4 
	aload_1 
	new ConstantPoolClass
	dup 
	aload_4 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolClass.<init> // pc=2
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.setConstantPoolClass // pc=2
	iconst_0 
	istore_2 
	iconst_1 
	istore_3 
	ldc literal_405:"(Ljava.lang.Class;)Z"
	astore_5 
	goto Label251
Label230:
	ldc literal_406:"net.rim.device.api.util"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label251
	iload_2 
	ifeq Label251
	ldc literal_407:"Arrays"
	aload_4 
	invokenonvirtual_lib .routine_25353 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label251
	ldc literal_380:"clone"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label251
	iconst_0 
	istore_2 
	iconst_1 
	istore_3 
	ldc literal_408:"(Ljava.lang.Object;)Ljava.lang.Object;"
	astore_5 
Label251:
	aload_0 
	aload_4 
	aload_6 
	aload_5 
	iload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.resolveMethod // pc=6
	astore_7 
	aload_1 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolMethodRef.setMethod // pc=2
	aload_7 
	areturn 
	}


private final module:net_rim_loader-2.class#26 resolveMethod( net.rim.tools.compiler.analysis.InstructionResolver, net.rim.tools.compiler.classfile.ConstantPoolInterfaceMethodRef ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getClassType // pc=1
	astore_2 
	aload_2 
	ifnonnull Label13
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getConstantPoolClass // pc=1
	iconst_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.resolveClass // pc=3
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore_2 
Label13:
	aload_0 
	aload_2 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getName // pc=1
	aload_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getType // pc=1
	iconst_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.resolveMethod // pc=6
	astore_3 
	aload_1 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolInterfaceMethodRef.setMethod // pc=2
	aload_3 
	areturn 
	}


private final int longOff( net.rim.tools.compiler.analysis.InstructionResolver, module:net_rim_loader-2.class#18 ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokenonvirtual_lib .routine_19474 // pc=1
	bipush 8
	if_icmpne Label7
	bipush 2
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


private final int libOff( net.rim.tools.compiler.analysis.InstructionResolver, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter_narrow 
	aload_1 
	iipush 131072
	invokenonvirtual_lib .routine_3396 // pc=2
	ifne Label8
	aload_1 
	invokenonvirtual_lib .routine_3385 // pc=1
	ifne Label10
Label8:
	iconst_1 
	ireturn 
Label10:
	iconst_0 
	ireturn 
	}


private final int libOff( net.rim.tools.compiler.analysis.InstructionResolver, module:net_rim_loader-2.class#4, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	ifne Label12
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	ifne Label12
	aload_1 
	aload_2 
	if_acmpeq Label14
Label12:
	iconst_1 
	ireturn 
Label14:
	iconst_0 
	ireturn 
	}


private final int libOff( net.rim.tools.compiler.analysis.InstructionResolver, module:net_rim_loader-2.class#26 ); // address: 0
	{
	enter_narrow 
	aload_1 
	iipush 131072
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


private final int libOff( net.rim.tools.compiler.analysis.InstructionResolver, module:net_rim_loader-2.class#26, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	ifne Label11
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_19303 // pc=1
	aload_2 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=3
	ifeq Label13
Label11:
	iconst_1 
	ireturn 
Label13:
	iconst_0 
	ireturn 
	}


private final int wideOff( net.rim.tools.compiler.analysis.InstructionResolver, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	sipush 255
	if_icmple Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}


private final setBlock( net.rim.tools.compiler.analysis.InstructionResolver, int ); // address: 0
	{
	noenter_return 
	}


private final module:net_rim_loader-2.class#18 generateClassClassMember( net.rim.tools.compiler.analysis.InstructionResolver, net.rim.tools.compiler.types.ReferenceType ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.types.Type ) // pc=1
	astore_2 
	aconst_null 
	astore_3 
	aload_1 
	checkcastbranch_lib 
	astore_4 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_409:"array$"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_5 
	aload_4 
	invokenonvirtual_lib .routine_130 // pc=1
	istore_6 
	iconst_1 
	istore_7 
Label19:
	iload_7 
	iload_6 
	if_icmpge Label28
	aload_5 
	ldc literal_410:"$"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iinc 7 1
	goto Label19
Label28:
	aload_5 
	aload_4 
	invokenonvirtual_lib .routine_156 // pc=1
	invokevirtual java.lang.String encodeType( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 59
	bipush 36
	invokenonvirtual_lib java.lang.String.replace // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	bipush 46
	bipush 36
	invokenonvirtual_lib java.lang.String.replace // pc=3
	astore_3 
	goto Label55
Label44:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_411:"class$"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	bipush 46
	bipush 36
	invokenonvirtual_lib java.lang.String.replace // pc=3
	astore_3 
Label55:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual module:net_rim_loader-2.class#4 getClassClass( net.rim.tools.compiler.Compiler ) // pc=1
	astore_4 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_3 
	aload_4 
	iconst_1 
	iconst_0 
	invokenonvirtual_lib .routine_2077 // pc=6
	astore_5 
	aload_5 
	ifnonnull Label95
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iipush 33554434
	invokevirtual int augmentFieldModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore_6 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_3 
	aload_4 
	iload_6 
	aconst_null 
	invokenonvirtual_lib .routine_1647 // pc=6
	astore_5 
	aload_5 
	iconst_1 
	invokenonvirtual_lib .routine_12578 // pc=2
	aload_5 
	iconst_0 
	invokenonvirtual_lib .routine_12578 // pc=2
	aload_5 
	invokenonvirtual_lib .routine_12638 // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	stringlength 
	bipush 4
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
Label95:
	aload_5 
	areturn 
	}


private final module:net_rim_loader-2.class#26 generateClassClassMethod( net.rim.tools.compiler.analysis.InstructionResolver ); // address: 0
	{
	enter 
	ldc literal_411:"class$"
	astore_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual module:net_rim_loader-2.class#4 getClassClass( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual module:net_rim_loader-2.class#4 getStringClass( net.rim.tools.compiler.Compiler ) // pc=1
	astore_3 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	iconst_1 
	invokespecial_lib java.util.Vector.<init> // pc=2
	astore_4 
	aload_4 
	aload_3 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	aload_2 
	aload_4 
	iconst_1 
	iconst_0 
	invokenonvirtual_lib .routine_2816 // pc=7
	astore_5 
	aload_5 
	ifnull Label29
	goto_w Label216
Label29:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iipush 33554434
	invokevirtual int augmentMethodModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore_6 
	new_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	aload_2 
	iconst_1 
	iload_6 
	invokespecial_lib .routine_18325 // pc=6
	astore_5 
	aload_5 
	iconst_0 
	ldc literal_412:"name"
	aload_3 
	invokenonvirtual_lib .routine_15983 // pc=4
	aload_5 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_16440 // pc=2
	new_lib net.rim.tools.compiler.analysis.InstructionCode//module:net_rim_loader.class#13 module:net_rim_loader.class#13 module:net_rim_loader.class#13
	dup 
	aload_5 
	bipush 3
	bipush 2
	aconst_null 
	aconst_null 
	invokespecial_lib .routine_22566 // pc=6
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_19577 // pc=1
	iconst_0 
	istore 8
	new ByteCodeInstructions
	dup 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeInstructions.<init> // pc=1
	astore 9
	aload 9
	astore 10
	aload 10
	iload 8
	iinc 8 1
	bipush 14
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_4 
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_4 
	aload_3 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	aload_2 
	ldc literal_413:"forName"
	aload_2 
	aload_4 
	iconst_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findMethod // pc=6
	astore 11
	aload 10
	iload 8
	iinc 8 1
	bipush 63
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload 10
	iload 8
	iinc 8 1
	bipush 7
	aload_0 
	aload 11
	aload_2 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=3
	iadd 
	aload_2 
	aload 11
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	aload 10
	iload 8
	iinc 8 1
	bipush 27
	invokevirtual_short .virtual_9 // idx=9 pc=3
	iload 8
	istore 12
	aload_0 
	ldc literal_414:"java.lang.NoClassDefFoundError"
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findClassType // pc=2
	astore 13
	aload 10
	iload 8
	iinc 8 1
	sipush 184
	aload_0 
	aload 13
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 13
	invokevirtual_short .virtual_17 // idx=17 pc=4
	aload 10
	iload 8
	iinc 8 1
	sipush 209
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload 10
	iload 8
	iinc 8 1
	sipush 213
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0 
	ldc literal_415:"java.lang.Throwable"
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findClassType // pc=2
	astore 14
	aload_4 
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_0 
	aload 14
	ldc literal_416:"getMessage"
	aload_3 
	aload_4 
	iconst_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findMethod // pc=6
	astore 15
	aload 10
	iload 8
	iinc 8 1
	iconst_1 
	aload 14
	aload 15
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	aload_4 
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_4 
	aload_3 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	aload 13
	ldc literal_359:"<init>"
	aconst_null 
	aload_4 
	iconst_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findMethod // pc=6
	astore 16
	aload 10
	iload 8
	iinc 8 1
	bipush 5
	aload_0 
	aload 16
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 13
	aload 16
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	aload 10
	iload 8
	iinc 8 1
	sipush 188
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_7 
	aload 9
	invokenonvirtual_lib .routine_19682 // pc=2
	aload_0 
	ldc literal_417:"java.lang.ClassNotFoundException"
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.findClassType // pc=2
	astore 17
	aload 9
	iconst_1 
	invokevirtual_short .virtual_29 // idx=29 pc=2
	aload 9
	iconst_0 
	iconst_0 
	iload 12
	iload 12
	aload 17
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addExceptionRange // pc=6
	aload_5 
	aload_7 
	invokenonvirtual_lib .routine_16325 // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_5 
	invokenonvirtual_lib .routine_2377 // pc=3
Label216:
	aload_5 
	areturn 
	}


private final generateForName( net.rim.tools.compiler.analysis.InstructionResolver, int, int, net.rim.tools.compiler.types.ReferenceType ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_3 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.generateClassClassMember // pc=2
	astore_4 
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.generateClassClassMethod // pc=1
	astore_5 
	iload_1 
	bipush 2
	iadd 
	istore_7 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_7 
	iconst_1 
	bastore 
	aload_0 
	iload_7 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.getBranchTarget // pc=2
	astore_6 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 109
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 160
	invokevirtual_short .virtual_8 // idx=8 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_6 
	invokevirtual_short .virtual_23 // idx=23 pc=2
	iload_1 
	iconst_1 
	iadd 
	istore 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload 8
	iconst_1 
	bastore 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload 8
	bipush 40
	aload_3 
	invokevirtual java.lang.String encodeType( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual_short .virtual_16 // idx=16 pc=4
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload 8
	bipush 7
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload 8
	bipush 105
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_7 
	bipush 109
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	return 
	}


private final boolean checkClinitFinal( net.rim.tools.compiler.analysis.InstructionResolver, module:net_rim_loader-2.class#18 ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual_lib .routine_19303 // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	if_acmpeq Label7
	iconst_0 
	ireturn 
Label7:
	aload_1 
	bipush 64
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label14
	aload_1 
	invokenonvirtual_lib .routine_12504 // pc=1
	ifne Label16
Label14:
	iconst_0 
	ireturn 
Label16:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_4 // idx=4 pc=1
	ifne Label21
	iconst_0 
	ireturn 
Label21:
	aload_1 
	invokenonvirtual_lib .routine_19292 // pc=1
	astore_2 
	aload_2 
	instanceof_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	ifeq Label86
	iconst_0 
	i2l 
	lstore 3
	aload_1 
	invokenonvirtual_lib .routine_19474 // pc=1
	istore_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_6 // idx=6 pc=1
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		

Label36:
	iload_5 
	bipush 8
	if_icmpne Label41
	iconst_0 
	ireturn 
Label41:
	iconst_0 
	i2l 
	lstore 3
	goto Label77
Label45:
	iload_5 
	bipush 8
	if_icmpne Label50
	iconst_0 
	ireturn 
Label50:
	iconst_1 
	i2l 
	lstore 3
	goto Label77
Label54:
	iload_5 
	bipush 8
	if_icmpne Label59
	iconst_0 
	ireturn 
Label59:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_7 // idx=7 pc=1
	i2l 
	lstore 3
	goto Label77
Label64:
	iload_5 
	bipush 8
	if_icmpeq Label69
	iconst_0 
	ireturn 
Label69:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_5 // idx=5 pc=1
	checkcast_lib net.rim.tools.compiler.analysis.InstructionLong//module:net_rim_loader.class#16 module:net_rim_loader.class#16 module:net_rim_loader.class#16
	invokenonvirtual_lib .routine_23815 // pc=1
	lstore 3
	goto Label77
Label75:
	iconst_0 
	ireturn 
Label77:
	lload 3
	aload_1 
	invokenonvirtual_lib .routine_12522 // pc=1
	lcmp 
	ifne Label84
	iconst_1 
	ireturn 
Label84:
	iconst_0 
	ireturn 
Label86:
	aload_2 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual module:net_rim_loader-2.class#4 getStringClass( net.rim.tools.compiler.Compiler ) // pc=1
	if_acmpne Label105
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_6 // idx=6 pc=1
Label93:
	aload_1 
	invokenonvirtual_lib .routine_12537 // pc=1
	astore_3 
	aload_3 
	ifnull Label105
	aload_3 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_5 // idx=5 pc=1
	checkcast InstructionString
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionString.getString // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ireturn 
Label105:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

final init( net.rim.tools.compiler.analysis.InstructionResolver, net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, module:net_rim_loader-2.class#26, net.rim.tools.compiler.classfile.ByteCodeInstructions, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_2 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_3 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iinc 5 1
	aload_0 
	iload_5 
	newarray 1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_5 
	iconst_1 
	isub 
	iconst_1 
	bastore 
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_4 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


final fini( net.rim.tools.compiler.analysis.InstructionResolver ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
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
	return 
	}


public final int getMaxStack( net.rim.tools.compiler.analysis.InstructionResolver ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual_lib .routine_16201 // pc=1
	ireturn 
	}


public final boolean[] getBoundaries( net.rim.tools.compiler.analysis.InstructionResolver ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final boolean foundLDC( net.rim.tools.compiler.analysis.InstructionResolver ); // address: 0
	{
	ireturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final walkByteCode( net.rim.tools.compiler.analysis.InstructionResolver, int, int, net.rim.tools.compiler.classfile.ConstantPoolLong ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iconst_1 
	bastore 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.setBlock // pc=2
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolLong.getValue // pc=1
	lstore 4
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolLong.isDouble // pc=1
	ifeq Label18
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label18:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 39
	lload 4
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionLong // pc=5
	return 
	}


public final walkByteCode( net.rim.tools.compiler.analysis.InstructionResolver, int, int, net.rim.tools.compiler.classfile.ConstantPoolInteger ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iconst_1 
	bastore 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.setBlock // pc=2
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolInteger.getValue // pc=1
	istore_4 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolInteger.isFloat // pc=1
	ifeq Label18
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label18:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 38
	iload_4 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
	}


public final walkByteCode( net.rim.tools.compiler.analysis.InstructionResolver, int, int, net.rim.tools.compiler.classfile.ConstantPoolString ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iconst_1 
	bastore 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.setBlock // pc=2
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolString.getString // pc=1
	astore_4 
	aload_4 
	invokestatic boolean isUnicode( java.lang.String ) // InstructionResolver
	ifeq Label28
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 42
	aload_4 
	invokevirtual_short .virtual_16 // idx=16 pc=4
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	stringlength 
	bipush 2
	imul 
	bipush 4
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
	return 
Label28:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 40
	aload_4 
	invokevirtual_short .virtual_16 // idx=16 pc=4
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	stringlength 
	bipush 4
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
	return 
	}


public final walkByteCode( net.rim.tools.compiler.analysis.InstructionResolver, int, int, java.lang.String[] ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iconst_1 
	bastore 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.setBlock // pc=2
	iconst_0 
	istore_4 
	aload_3 
	arraylength 
	iconst_1 
	isub 
	istore_5 
Label15:
	iload_5 
	iflt Label40
	aload_3 
	iload_5 
	aaload 
	astore_6 
	iinc 4 4
	aload_6 
	invokestatic boolean isUnicode( java.lang.String ) // InstructionResolver
	ifeq Label33
	iload_4 
	bipush 2
	aload_6 
	stringlength 
	imul 
	iadd 
	istore_4 
	goto Label38
Label33:
	iload_4 
	aload_6 
	stringlength 
	iadd 
	istore_4 
Label38:
	iinc 5 -1
	goto Label15
Label40:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 216
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 282
	aload_3 
	invokevirtual_short .virtual_15 // idx=15 pc=4
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_4 
	invokenonvirtual_lib .routine_6375 // pc=2
	return 
	}


public final walkByteCode( net.rim.tools.compiler.analysis.InstructionResolver, int, int, net.rim.tools.compiler.classfile.ConstantPoolClass, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iconst_1 
	bastore 
	iload_5 
	ifeq Label38
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	iadd 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual boolean isPreverified( net.rim.tools.compiler.Compiler ) // pc=1
	ifeq Label38
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_24 // idx=24 pc=1
	istore_6 
	iconst_0 
	istore_7 
Label20:
	iload_7 
	iload_6 
	if_icmpge Label38
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_7 
	invokevirtual_short .virtual_25 // idx=25 pc=2
	astore 8
	aload 8
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionTarget.getStackEntry // pc=1
	astore 9
	aload 9
	ifnull Label36
	aload 9
	iload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.fixupUninitializedOffsets // pc=3
Label36:
	iinc 7 1
	goto Label20
Label38:
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolClass.getType // pc=1
	astore_6 
	aload_6 
	ifnonnull Label48
	aload_0 
	aload_3 
	iload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.resolveClass // pc=3
	astore_6 
Label48:
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.setBlock // pc=2
	bipush 3
	istore_7 
	aconst_null 
	astore 8
	aconst_null 
	astore 9
	iload_2 
Label59:
	aload_6 
	checkcastbranch_lib 
	astore 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 168
	aload_0 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 8
	invokenonvirtual_lib .routine_25425 // pc=1
	invokevirtual_short .virtual_17 // idx=17 pc=4
	return 
Label73:
	aload_6 
	instanceof_lib net.rim.tools.compiler.types.ArrayType//module:net_rim_loader-2.class#0 module:net_rim_loader-2.class#0 module:net_rim_loader-2.class#0
	ifne Label77
	goto_w Label282
Label77:
	aload_6 
	invokevirtual module:net_rim_loader-2.class#0 getArrayType( net.rim.tools.compiler.types.Type ) // pc=1
	astore 9
	aload 9
	invokenonvirtual_lib .routine_156 // pc=1
	astore_6 
	aload_6 
	instanceof_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	ifeq Label93
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 166
	aload 9
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionType // pc=5
	return 
Label93:
	aload_6 
	checkcastbranch_lib 
	astore 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 170
	aload_0 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 9
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionType // pc=5
	return 
Label107:
	aload_6 
	checkcastbranch_lib 
	astore 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 193
	aload_0 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 8
	invokevirtual_short .virtual_17 // idx=17 pc=4
	return 
Label120:
	aload_6 
	checkcastbranch_lib 
	astore 9
	aload 9
	invokenonvirtual_lib .routine_156 // pc=1
	astore_6 
	aload_6 
	instanceof_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	ifeq Label135
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 190
	aload 9
	invokevirtual_short .virtual_17 // idx=17 pc=4
	return 
Label135:
	aload_6 
	checkcastbranch_lib 
	astore 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 200
	aload_0 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 9
	invokevirtual_short .virtual_17 // idx=17 pc=4
	return 
Label148:
	aload_6 
	checkcastbranch_lib 
	astore 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 191
	aload_0 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 8
	invokevirtual_short .virtual_17 // idx=17 pc=4
	return 
Label161:
	aload_6 
	checkcastbranch_lib 
	astore 9
	aload 9
	invokenonvirtual_lib .routine_156 // pc=1
	astore_6 
	aload_6 
	instanceof_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	ifeq Label176
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 189
	aload 9
	invokevirtual_short .virtual_17 // idx=17 pc=4
	return 
Label176:
	aload_6 
	checkcastbranch_lib 
	astore 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 198
	aload_0 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 9
	invokevirtual_short .virtual_17 // idx=17 pc=4
	return 
Label189:
	aload_6 
	checkcast_lib net.rim.tools.compiler.types.ArrayType//module:net_rim_loader-2.class#0 module:net_rim_loader-2.class#0 module:net_rim_loader-2.class#0
	astore 9
	aload 9
	invokenonvirtual_lib .routine_156 // pc=1
	astore_6 
	aload_6 
	instanceof_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	ifeq Label205
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 166
	aload 9
	iload_4 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionType // pc=5
	return 
Label205:
	aload_6 
	checkcastbranch_lib 
	astore 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 170
	aload_0 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 9
	iload_4 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionType // pc=5
	return 
Label219:
	aload_6 
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 184
	aload_0 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 8
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionType // pc=5
	return 
Label233:
	iinc 7 -1
Label234:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual boolean isMakingMIDlet( net.rim.tools.compiler.Compiler ) // pc=1
	ifeq Label250
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_367:"Invalid opcode at offset: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label250:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label255
	aload_6 
	instanceof_lib net.rim.tools.compiler.types.ArrayType//module:net_rim_loader-2.class#0 module:net_rim_loader-2.class#0 module:net_rim_loader-2.class#0
	ifeq Label264
Label255:
	aload_6 
	checkcast_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	astore 10
	aload_0 
	iload_1 
	iload_7 
	aload 10
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.generateForName // pc=4
	return 
Label264:
	aload_6 
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 216
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	iconst_1 
	iadd 
	sipush 290
	aload_0 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload 8
	invokevirtual_short .virtual_17 // idx=17 pc=4
Label282:
	return 
	}


public final walkByteCode( net.rim.tools.compiler.analysis.InstructionResolver, int, int, net.rim.tools.compiler.classfile.ConstantPoolFieldRef ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iconst_1 
	bastore 
	iload_2 
	sipush 178
	if_icmpeq Label11
	iload_2 
	sipush 179
	if_icmpne Label13
Label11:
	iconst_1 
	goto Label14
Label13:
	iconst_0 
Label14:
	istore_4 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolFieldRef.getField // pc=1
	astore_5 
	aload_5 
	ifnonnull Label25
	aload_0 
	aload_3 
	iload_4 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.resolveField // pc=3
	astore_5 
Label25:
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getClassType // pc=1
	astore_6 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.setBlock // pc=2
	aload_5 
	iipush 134217728
	invokenonvirtual_lib .routine_19625 // pc=2
	istore_7 
	aload_5 
	sipush 512
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label45
	aload_6 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	if_acmpeq Label45
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	sipush 2048
	invokevirtual clearOptimization( net.rim.tools.compiler.Compiler, int ) // pc=2
Label45:
	iload_4 
	ifeq Label89
	aload_5 
	invokenonvirtual_lib .routine_19303 // pc=1
	astore 8
	aload 8
	aload_6 
	if_acmpeq Label89
	aload 8
	sipush 2048
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label89
	iconst_0 
	istore 9
	aload 8
	sipush 128
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label66
	iconst_1 
	istore 9
	goto Label85
Label66:
	aload 8
	invokenonvirtual_lib .routine_1154 // pc=1
	astore 10
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1154 // pc=1
	astore 11
	aload 10
	ifnonnull Label81
	aload 11
	ifnonnull Label78
	iconst_1 
	goto Label79
Label78:
	iconst_0 
Label79:
	istore 9
	goto Label85
Label81:
	aload 10
	aload 11
	invokevirtual_short .equals // idx=1 pc=2
	istore 9
Label85:
	iload 9
	ifeq Label89
	aload 8
	astore_6 
Label89:
	iload_2 
	tableswitch  :
		
		
		
		
		

Label91:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	getstatic _opcodeMapping // InstructionResolver
	iload_2 
	iaload 
	aload_0 
	aload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.longOff // pc=2
	iadd 
	aload_6 
	aload_5 
	iload_7 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	aload_5 
	iload_2 
	sipush 180
	if_icmpne Label110
	iconst_1 
	goto Label111
Label110:
	iconst_0 
Label111:
	invokenonvirtual_lib .routine_12578 // pc=2
	return 
Label113:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iipush 1048576
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label135
	aload_0 
	aload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.checkClinitFinal // pc=2
	ifeq Label135
	aload_5 
	invokenonvirtual_lib .routine_19474 // pc=1
	bipush 8
	if_icmpne Label130
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 206
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label130:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 205
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label135:
	aload_5 
	invokenonvirtual_lib .routine_12504 // pc=1
	ifne Label139
	goto_w Label196
Label139:
	aload_5 
	iipush 33554626
	invokenonvirtual_lib .routine_19645 // pc=2
	ifeq Label196
	aload_5 
	invokenonvirtual_lib .routine_19292 // pc=1
	astore 8
	aload 8
	instanceof_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	ifeq Label181
	aload 8
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	istore 9
	iload 9
	bipush 11
	if_icmpeq Label158
	iload 9
	bipush 12
	if_icmpne Label162
Label158:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label162:
	aload_5 
	invokenonvirtual_lib .routine_19474 // pc=1
	bipush 8
	if_icmpne Label173
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 39
	aload_5 
	invokenonvirtual_lib .routine_12522 // pc=1
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionLong // pc=5
	return 
Label173:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 38
	aload_5 
	invokenonvirtual_lib .routine_12522 // pc=1
	l2i 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label181:
	aload_5 
	invokenonvirtual_lib .routine_12537 // pc=1
	astore 9
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 40
	aload 9
	invokevirtual_short .virtual_16 // idx=16 pc=4
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 9
	stringlength 
	bipush 4
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
	return 
Label196:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	getstatic _opcodeMapping // InstructionResolver
	iload_2 
	iaload 
	aload_0 
	aload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.longOff // pc=2
	iadd 
	aload_0 
	aload_6 
	aload_5 
	invokenonvirtual_lib .routine_19303 // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=3
	iadd 
	aload_6 
	aload_5 
	iload_7 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	aload_5 
	iload_2 
	sipush 178
	if_icmpne Label221
	iconst_1 
	goto Label222
Label221:
	iconst_0 
Label222:
	invokenonvirtual_lib .routine_12578 // pc=2
	aload_5 
	invokenonvirtual_lib .routine_12638 // pc=1
	return 
Label226:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_367:"Invalid opcode at offset: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
	}


public final walkByteCode( net.rim.tools.compiler.analysis.InstructionResolver, int, int, net.rim.tools.compiler.classfile.ConstantPoolMethodRef ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iconst_1 
	bastore 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolMethodRef.getMethod // pc=1
	astore_4 
	aload_4 
	ifnonnull Label26
	aload_0 
	aload_3 
	iload_2 
	sipush 182
	if_icmpne Label17
	iconst_1 
	goto Label18
Label17:
	iconst_0 
Label18:
	iload_2 
	sipush 184
	if_icmpne Label23
	iconst_1 
	goto Label24
Label23:
	iconst_0 
Label24:
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.resolveMethod // pc=4
	astore_4 
Label26:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label37
	aload_4 
	bipush 2
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label37
	iload_2 
	sipush 182
	if_icmpne Label37
	sipush 184
	istore_2 
Label37:
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getClassType // pc=1
	astore_5 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.setBlock // pc=2
	aload_4 
	iipush 134217728
	invokenonvirtual_lib .routine_19625 // pc=2
	istore_6 
	aload_4 
	sipush 512
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label57
	aload_5 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	if_acmpeq Label57
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	sipush 2048
	invokevirtual clearOptimization( net.rim.tools.compiler.Compiler, int ) // pc=2
Label57:
	iload_2 
	tableswitch  :
		
		
		
		

Label59:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	getstatic _opcodeMapping // InstructionResolver
	iload_2 
	iaload 
	aload_5 
	aload_4 
	iload_6 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	return 
Label69:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	getstatic _opcodeMapping // InstructionResolver
	iload_2 
	iaload 
	aload_0 
	aload_4 
	aload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=3
	iadd 
	aload_5 
	aload_4 
	iload_6 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	return 
Label84:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	getstatic _opcodeMapping // InstructionResolver
	iload_2 
	iaload 
	aload_0 
	aload_4 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.libOff // pc=2
	iadd 
	aload_5 
	aload_4 
	iload_6 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	return 
Label98:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_367:"Invalid opcode at offset: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
	}


public final walkByteCode( net.rim.tools.compiler.analysis.InstructionResolver, int, int, net.rim.tools.compiler.classfile.ConstantPoolInterfaceMethodRef, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iconst_1 
	bastore 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolInterfaceMethodRef.getMethod // pc=1
	astore_5 
	aload_5 
	ifnonnull Label14
	aload_0 
	aload_3 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.resolveMethod // pc=2
	astore_5 
Label14:
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getClassType // pc=1
	astore_6 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.setBlock // pc=2
	aload_5 
	iipush 134217728
	invokenonvirtual_lib .routine_19625 // pc=2
	istore_7 
	aload_5 
	iipush 131072
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label38
	aload_5 
	invokenonvirtual_lib .routine_19303 // pc=1
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual module:net_rim_loader-2.class#4 getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	if_acmpne Label38
	sipush 182
	istore_2 
	aload_5 
	invokenonvirtual_lib .routine_19303 // pc=1
	astore_6 
Label38:
	iload_2 
Label40:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	getstatic _opcodeMapping // InstructionResolver
	iload_2 
	iaload 
	aload_6 
	aload_5 
	iload_7 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=6
	return 
Label50:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	getstatic _opcodeMapping // InstructionResolver
	iload_2 
	iaload 
	aload_6 
	aload_5 
	iload_4 
	iload_7 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionNameAndType // pc=7
	return 
Label61:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_367:"Invalid opcode at offset: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
	}


public final walkByteCode( net.rim.tools.compiler.analysis.InstructionResolver, int, int, int[] ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iconst_1 
	bastore 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.setBlock // pc=2
	iconst_0 
	istore_5 
	bipush -1
	istore_6 
	iload_2 
	getstatic _opcodeMapping // InstructionResolver
	arraylength 
	if_icmpge Label20
	getstatic _opcodeMapping // InstructionResolver
	iload_2 
	iaload 
	istore_6 
Label20:
	iload_6 
	bipush -1
	if_icmpeq Label45
	iload_6 
	sipush 255
	if_icmple Label30
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 216
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label30:
	iload_2 
	sipush 175
	if_icmpeq Label36
	iload_2 
	sipush 174
	if_icmpne Label40
Label36:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label40:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	iload_6 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label45:
	iload_2 
Label47:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 36
	iload_2 
	bipush 3
	isub 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label55:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 36
	aload_3 
	iconst_0 
	iaload 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label63:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 37
	aload_3 
	iconst_0 
	iaload 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label71:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 38
	aload_3 
	iconst_0 
	iaload 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label79:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 39
	iload_2 
	bipush 9
	isub 
	i2l 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionLong // pc=5
	return 
Label88:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 35
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label97:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 216
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 288
	iload_2 
	iadd 
	bipush 12
	isub 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label110:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 216
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 285
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label119:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 216
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 286
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label128:
	aload_3 
	iconst_0 
	iaload 
	istore_5 
	iload_5 
	bipush 7
	if_icmpgt Label142
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 63
	iload_5 
	iadd 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label142:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 51
	aload_0 
	iload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.wideOff // pc=2
	iadd 
	iload_5 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label152:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 63
	iload_2 
	iadd 
	bipush 42
	isub 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label161:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label165:
	aload_3 
	iconst_0 
	iaload 
	istore_5 
	iload_5 
	bipush 7
	if_icmpgt Label179
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 55
	iload_5 
	iadd 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label179:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 49
	aload_0 
	iload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.wideOff // pc=2
	iadd 
	iload_5 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label189:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 55
	iload_2 
	iadd 
	bipush 34
	isub 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label202:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 55
	iload_2 
	iadd 
	bipush 26
	isub 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label211:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label215:
	aload_3 
	iconst_0 
	iaload 
	istore_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 53
	aload_0 
	iload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.wideOff // pc=2
	iadd 
	iload_5 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label229:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 53
	iload_2 
	bipush 38
	isub 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label241:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 53
	iload_2 
	bipush 30
	isub 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label249:
	aload_3 
	iconst_0 
	iaload 
	istore_5 
	iload_5 
	bipush 7
	if_icmpgt Label263
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 85
	iload_5 
	iadd 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label263:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 73
	aload_0 
	iload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.wideOff // pc=2
	iadd 
	iload_5 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label273:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 85
	iload_2 
	iadd 
	bipush 75
	isub 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label282:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label286:
	aload_3 
	iconst_0 
	iaload 
	istore_5 
	iload_5 
	bipush 7
	if_icmpgt Label300
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 77
	iload_5 
	iadd 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label300:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 71
	aload_0 
	iload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.wideOff // pc=2
	iadd 
	iload_5 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label310:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 77
	iload_2 
	iadd 
	bipush 67
	isub 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label323:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 77
	iload_2 
	iadd 
	bipush 59
	isub 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label332:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label336:
	aload_3 
	iconst_0 
	iaload 
	istore_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 75
	aload_0 
	iload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.wideOff // pc=2
	iadd 
	iload_5 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label350:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 75
	iload_2 
	bipush 71
	isub 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label362:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 177
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label371:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 183
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label380:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 175
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label389:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 215
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 181
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label398:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 75
	iload_2 
	bipush 63
	isub 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label406:
	aload_0 
	aload_3 
	iconst_0 
	iaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.getBranchTarget // pc=2
	astore_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 161
	invokevirtual_short .virtual_8 // idx=8 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_4 
	invokevirtual_short .virtual_23 // idx=23 pc=2
	return 
Label420:
	aload_0 
	aload_3 
	iconst_0 
	iaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.getBranchTarget // pc=2
	astore_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	getstatic _ifMapping // InstructionResolver
	iload_2 
	sipush 153
	isub 
	iaload 
	invokevirtual_short .virtual_8 // idx=8 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_4 
	invokevirtual_short .virtual_23 // idx=23 pc=2
	return 
Label438:
	aload_0 
	aload_3 
	iconst_0 
	iaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.getBranchTarget // pc=2
	astore_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 159
	iload_2 
	iadd 
	sipush 198
	isub 
	invokevirtual_short .virtual_8 // idx=8 pc=3
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_4 
	invokevirtual_short .virtual_23 // idx=23 pc=2
	return 
Label456:
	aload_3 
	iconst_1 
	iaload 
	istore_7 
	iload_7 
	newarray 5
	astore 8
	iconst_1 
	istore 9
	iconst_0 
	istore 10
Label467:
	iload 10
	iload_7 
	if_icmpge Label490
	aload_3 
	iload 10
	bipush 2
	imul 
	bipush 2
	iadd 
	iaload 
	istore_5 
	iload_5 
	iload_5 
	i2s 
	if_icmpeq Label484
	iconst_0 
	istore 9
Label484:
	aload 8
	iload 10
	iload_5 
	iastore 
	iinc 10 1
	goto Label467
Label490:
	iload_7 
	iflt Label495
	iload_7 
	sipush 4096
	if_icmple Label497
Label495:
	iconst_1 
	goto Label498
Label497:
	iconst_0 
Label498:
	istore 10
	iload 10
	ifeq Label514
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_368:"Malformed lookupswitch opcode found in: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateWarning( net.rim.tools.compiler.Compiler, boolean, java.lang.String, java.lang.String ) // pc=4
Label514:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	iload 9
	ifeq Label520
	sipush 163
	goto Label521
Label520:
	sipush 164
Label521:
	aload 8
	iload 10
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionInts // pc=5
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aload_3 
	iconst_0 
	iaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.getBranchTarget // pc=2
	invokevirtual_short .virtual_23 // idx=23 pc=2
	bipush 3
	istore 11
Label533:
	iload 11
	aload_3 
	arraylength 
	if_icmplt Label538
	goto_w Label712
Label538:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aload_3 
	iload 11
	iaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.getBranchTarget // pc=2
	invokevirtual_short .virtual_23 // idx=23 pc=2
	iinc 11 2
	goto Label533
Label547:
	aload_3 
	arraylength 
	bipush 3
	isub 
	istore_7 
	iload_7 
	newarray 5
	astore 8
	iconst_1 
	istore 9
	aload_3 
	iconst_1 
	iaload 
	istore_5 
	iconst_0 
	istore 10
Label563:
	iload 10
	iload_7 
	if_icmpge Label579
	iload_5 
	iload_5 
	i2s 
	if_icmpeq Label572
	iconst_0 
	istore 9
Label572:
	aload 8
	iload 10
	iload_5 
	iinc 5 1
	iastore 
	iinc 10 1
	goto Label563
Label579:
	aload_3 
	iconst_1 
	iaload 
	istore 10
	aload_3 
	bipush 2
	iaload 
	istore 11
	iload 10
	iload 11
	if_icmpgt Label594
	iload 11
	iload 10
	isub 
	ifge Label596
Label594:
	iconst_1 
	goto Label597
Label596:
	iconst_0 
Label597:
	istore 12
	iload 12
	ifeq Label613
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_369:"Malformed tableswitch opcode found in: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual_lib .routine_19270 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateWarning( net.rim.tools.compiler.Compiler, boolean, java.lang.String, java.lang.String ) // pc=4
Label613:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	iload 9
	ifeq Label619
	sipush 163
	goto Label620
Label619:
	sipush 164
Label620:
	aload 8
	iload 12
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionInts // pc=5
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aload_3 
	iconst_0 
	iaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.getBranchTarget // pc=2
	invokevirtual_short .virtual_23 // idx=23 pc=2
	bipush 3
	istore 13
Label632:
	iload 13
	aload_3 
	arraylength 
	if_icmplt Label637
	goto_w Label712
Label637:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aload_3 
	iload 13
	iaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.getBranchTarget // pc=2
	invokevirtual_short .virtual_23 // idx=23 pc=2
	iinc 13 1
	goto Label632
Label646:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iipush 1048576
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label655
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 32
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label655:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 31
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label660:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	sipush 165
	aload_3 
	iconst_0 
	iaload 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	return 
Label668:
	aload_3 
	iconst_1 
	iaload 
	istore_5 
	aload_3 
	iconst_0 
	iaload 
	istore_7 
	iload_5 
	sipush 128
	if_icmpge Label692
	iload_5 
	bipush -128
	if_icmplt Label692
	iload_7 
	sipush 255
	if_icmpgt Label692
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 120
	iload_7 
	iload_5 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionLong // pc=5
	return 
Label692:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 121
	iload_7 
	iload_5 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionLong // pc=5
	return 
Label699:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_367:"Invalid opcode at offset: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label712:
	return 
	}


public final walkByteCode( net.rim.tools.compiler.analysis.InstructionResolver, int, int, net.rim.tools.compiler.classfile.ConstantPoolArrayData ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iconst_1 
	bastore 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolArrayData.getBytes // pc=1
	astore_4 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolArrayData.getFieldRef // pc=1
	astore_5 
	aload_5 
	ifnull Label29
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_5 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getClassName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 46
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_5 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolField.getName // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_4 
	invokevirtual boolean checkBinaryForExport( net.rim.tools.compiler.Compiler, java.lang.String, byte[] ) // pc=3
	pop 
Label29:
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionResolver.setBlock // pc=2
	aload_3 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolArrayData.getArrayType // pc=1
	istore_6 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	bipush 45
	iload_6 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.classfile.ByteCodeInstructions.addInstructionBytes // pc=5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	arraylength 
	bipush 4
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
	return 
	}

}
