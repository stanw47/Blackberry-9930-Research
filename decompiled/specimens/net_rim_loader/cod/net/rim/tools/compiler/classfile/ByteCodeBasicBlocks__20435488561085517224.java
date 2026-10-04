// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 13
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class ByteCodeBasicBlocks extends Object
implements net.rim.tools.compiler.classfile.ByteCodeBlockTypes

{

	// @@@@@@@@@@@@@ Fields 
	private java.util.Vector /*java.util.Vector*/  _blocks ; // ofs = 16438 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _exceptionHandlers ; // ofs = 16442 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _badBlocks ; // ofs = 16446 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeBasicBlocks.<init> // pc=2
	return 
	}


public <init>( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new ByteCodeBlock
	dup 
	iconst_0 
	iload_1 
	aconst_null 
	aconst_null 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeBlock.<init> // pc=5
	astore_2 
	aload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual_short .virtual_3 // idx=3 pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	new ByteCodeBlock
	dup 
	iload_1 
	iconst_1 
	aconst_null 
	aconst_null 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeBlock.<init> // pc=5
	astore_3 
	aload_3 
	bipush 9
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual_short .virtual_3 // idx=3 pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final updateBlockIndices( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_2 
	iload_1 
	istore_3 
Label6:
	iload_3 
	iload_2 
	if_icmpge Label19
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ByteCodeBlock
	astore_4 
	aload_4 
	iload_3 
	invokevirtual_short .virtual_3 // idx=3 pc=2
	iinc 3 1
	goto Label6
Label19:
	return 
	}


private final int setOffsets( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, boolean ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	iconst_0 
	istore_3 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	iconst_1 
	isub 
	istore_4 
	iconst_0 
	istore_5 
Label12:
	iload_5 
	iload_4 
	if_icmpge Label26
	aload_0 
	iload_5 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_2 
	aload_2 
	iload_3 
	iload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=3
	istore_3 
	iinc 5 1
	goto Label12
Label26:
	aload_0 
	iload_4 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_2 
	aload_2 
	iload_3 
	invokevirtual_short .virtual_5 // idx=5 pc=2
	aload_2 
	iconst_1 
	invokevirtual_short .virtual_8 // idx=8 pc=2
	iload_3 
	ireturn 
	}


private final fixupBranches( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, net.rim.tools.compiler.classfile.ByteCodeBlock, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_3 
	iconst_0 
	istore_4 
Label6:
	iload_4 
	iload_3 
	if_icmpge Label36
	aload_0 
	iload_4 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_5 
	aload_5 
	invokevirtual_short .virtual_40 // idx=40 pc=1
	istore_6 
	iconst_0 
	istore_7 
Label18:
	iload_7 
	iload_6 
	if_icmpge Label34
	aload_5 
	iload_7 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	astore 8
	aload 8
	aload_1 
	if_acmpne Label32
	aload_5 
	aload_2 
	iload_7 
	invokevirtual_short .virtual_37 // idx=37 pc=3
Label32:
	iinc 7 1
	goto Label18
Label34:
	iinc 4 1
	goto Label6
Label36:
	aload_0 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	istore_3 
	iconst_0 
	istore_4 
Label41:
	iload_4 
	iload_3 
	if_icmpge Label71
	aload_0 
	iload_4 
	invokevirtual_short .virtual_10 // idx=10 pc=2
	astore_5 
	aload_5 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	aload_1 
	if_acmpne Label55
	aload_5 
	aload_2 
	invokevirtual_short .virtual_3 // idx=3 pc=2
Label55:
	aload_5 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	aload_1 
	if_acmpne Label62
	aload_5 
	aload_2 
	invokevirtual_short .virtual_4 // idx=4 pc=2
Label62:
	aload_5 
	invokevirtual_short .virtual_8 // idx=8 pc=1
	aload_1 
	if_acmpne Label69
	aload_5 
	aload_2 
	invokevirtual_short .virtual_5 // idx=5 pc=2
Label69:
	iinc 4 1
	goto Label41
Label71:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final insertBlock( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, net.rim.tools.compiler.classfile.ByteCodeBlock, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	iload_2 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	aload_0 
	iload_2 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeBasicBlocks.updateBlockIndices // pc=2
	return 
	}


public final addBlock( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	istore_2 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_3 
	iconst_0 
	istore_4 
Label9:
	iload_4 
	iload_3 
	if_icmpge Label25
	aload_0 
	iload_4 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iload_2 
	if_icmple Label23
	aload_0 
	aload_1 
	iload_4 
	invokevirtual_short .virtual_3 // idx=3 pc=3
	return 
Label23:
	iinc 4 1
	goto Label9
Label25:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_325:"byte code offset: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_326:" out of range: 0-"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	iload_3 
	iconst_1 
	isub 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9845 // pc=2
	athrow 
	}


public final removeBlock( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeBasicBlocks.updateBlockIndices // pc=2
	return 
	}


public final int getNumBlocks( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock getBlock( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ByteCodeBlock
	areturn 
	}


public final addExceptionHandler( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int, int, int, int, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter 
	aload_0 
	iload_2 
	invokevirtual_short .virtual_12 // idx=12 pc=2
	astore_6 
	aload_6 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iload_2 
	if_icmpeq Label30
	aload_6 
	bipush 8
	invokevirtual_short .virtual_12 // idx=12 pc=2
	ifeq Label21
	aload_0 
	aload_6 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	iconst_1 
	iadd 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_6 
	goto Label30
Label21:
	aload_6 
	iload_2 
	iconst_1 
	iconst_0 
	invokevirtual_short .virtual_51 // idx=51 pc=4
	astore_6 
	aload_0 
	aload_6 
	invokevirtual_short .virtual_4 // idx=4 pc=2
Label30:
	aload_0 
	iload_3 
	iconst_1 
	invokevirtual_short .virtual_13 // idx=13 pc=3
	astore_7 
	aload_0 
	iload_4 
	iconst_0 
	invokevirtual_short .virtual_13 // idx=13 pc=3
	astore 8
	aload_7 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	istore 9
	aload_6 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	istore 10
Label46:
	iload 10
	iload 9
	if_icmpge Label56
	aload_0 
	iload 10
	invokevirtual_short .virtual_7 // idx=7 pc=2
	aload 8
	invokevirtual_short .virtual_42 // idx=42 pc=2
	iinc 10 1
	goto Label46
Label56:
	new ByteCodeExceptionHandler
	dup 
	aload_6 
	aload_7 
	aload 8
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeExceptionHandler.<init> // pc=5
	astore 10
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label71
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label71:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload 10
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


public final int getNumExceptionHandlers( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}


public final net.rim.tools.compiler.classfile.ByteCodeExceptionHandler getExceptionHandler( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ByteCodeExceptionHandler
	areturn 
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock addBadBlock( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label8
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label8:
	new ByteCodeBlock
	dup 
	iload_1 
	iconst_0 
	aconst_null 
	aconst_null 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeBlock.<init> // pc=5
	astore_2 
	aload_2 
	bipush 10
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_2 
	areturn 
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock findBlock( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	iconst_0 
	istore_3 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	iconst_1 
	isub 
	istore_4 
Label10:
	iload_3 
	iload_4 
	iadd 
	bipush 2
	idiv 
	istore_5 
	aload_0 
	iload_5 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_2 
	iload_1 
	aload_2 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	if_icmpge Label31
	aconst_null 
	astore_2 
	iload_5 
	iconst_1 
	isub 
	istore_4 
	goto Label42
Label31:
	aload_2 
	iload_1 
	invokevirtual_short .virtual_10 // idx=10 pc=2
	ifeq Label36
	goto Label45
Label36:
	aconst_null 
	astore_2 
	iload_5 
	iconst_1 
	iadd 
	istore_3 
Label42:
	iload_3 
	iload_4 
	if_icmple Label10
Label45:
	aload_2 
	ifnonnull Label68
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_325:"byte code offset: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_326:" out of range: 0-"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	iconst_1 
	isub 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9845 // pc=2
	athrow 
Label68:
	aload_2 
	areturn 
	}


public final net.rim.tools.compiler.classfile.ByteCodeBlock findSplitBlock( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokevirtual_short .virtual_12 // idx=12 pc=2
	astore_3 
	aload_3 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	iload_1 
	if_icmpne Label11
	aload_3 
	areturn 
Label11:
	aload_3 
	iload_1 
	iload_2 
	iconst_0 
	invokevirtual_short .virtual_51 // idx=51 pc=4
	astore_3 
	aload_0 
	aload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	aload_3 
	areturn 
	}


public final addStackEntry( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int, net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iconst_1 
	invokevirtual_short .virtual_13 // idx=13 pc=3
	astore_3 
	aload_3 
	aload_2 
	invokevirtual_short .virtual_29 // idx=29 pc=2
	return 
	}


public final boolean walkBlocks( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, net.rim.tools.compiler.analysis.InstructionWalker ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_3 
	iconst_0 
	istore_4 
Label8:
	iload_4 
	iload_3 
	if_icmpge Label27
	aload_0 
	iload_4 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_5 
	aload_5 
	aload_1 
	invokevirtual_short .virtual_53 // idx=53 pc=2
	ifne Label21
	iload_2 
	ifeq Label23
Label21:
	iconst_1 
	goto Label24
Label23:
	iconst_0 
Label24:
	istore_2 
	iinc 4 1
	goto Label8
Label27:
	iload_2 
	ireturn 
	}


public final markLabels( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_3 
	iconst_0 
	istore_2 
Label6:
	iload_2 
	iload_3 
	if_icmpge Label17
	aload_0 
	iload_2 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_4 
	aload_4 
	invokevirtual_short .virtual_25 // idx=25 pc=1
	iinc 2 1
	goto Label6
Label17:
	aload_0 
	iconst_0 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	invokevirtual_short .virtual_16 // idx=16 pc=1
Label21:
	iconst_0 
	istore_5 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_3 
	iconst_0 
	istore_2 
Label28:
	iload_2 
	iload_3 
	if_icmpge Label99
	aload_0 
	iload_2 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_4 
	iload_1 
	ifne Label41
	aload_4 
	invokevirtual_short .virtual_26 // idx=26 pc=1
	ifne Label41
	goto Label97
Label41:
	aload_4 
	invokevirtual_short .virtual_28 // idx=28 pc=1
	astore_6 
	aload_6 
	ifnonnull Label60
	iload_2 
	iconst_1 
	iadd 
	istore_7 
	aload_4 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	ifne Label60
	iload_7 
	iload_3 
	if_icmpge Label60
	aload_0 
	iload_7 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_6 
Label60:
	aload_6 
	ifnull Label69
	aload_6 
	invokevirtual_short .virtual_26 // idx=26 pc=1
	ifne Label67
	iconst_1 
	istore_5 
Label67:
	aload_6 
	invokevirtual_short .virtual_16 // idx=16 pc=1
Label69:
	aload_4 
	invokevirtual_short .virtual_40 // idx=40 pc=1
	istore_7 
	iconst_0 
	istore 8
Label74:
	iload 8
	iload_7 
	if_icmpge Label97
	aload_4 
	iload 8
	invokevirtual_short .virtual_41 // idx=41 pc=2
	astore_6 
	aload_6 
	invokevirtual_short .virtual_26 // idx=26 pc=1
	ifne Label86
	iconst_1 
	istore_5 
Label86:
	aload_6 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	iload_2 
	if_icmpgt Label93
	aload_6 
	invokevirtual_short .virtual_22 // idx=22 pc=1
	goto Label95
Label93:
	aload_6 
	invokevirtual_short .virtual_20 // idx=20 pc=1
Label95:
	iinc 8 1
	goto Label74
Label97:
	iinc 2 1
	goto Label28
Label99:
	aload_0 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	istore_3 
	iconst_0 
	istore_2 
Label104:
	iload_2 
	iload_3 
	if_icmpge Label165
	aload_0 
	iload_2 
	invokevirtual_short .virtual_10 // idx=10 pc=2
	astore_6 
	aload_6 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_7 
	aload_7 
	invokevirtual_short .virtual_24 // idx=24 pc=1
	aload_6 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	astore 8
	aload 8
	invokevirtual_short .virtual_24 // idx=24 pc=1
	aload_7 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	istore 9
	aload 8
	invokevirtual_short .virtual_4 // idx=4 pc=1
	istore 10
	iconst_0 
	istore 11
	iload 9
	istore 12
Label131:
	iload 12
	iload 10
	if_icmpgt Label144
	aload_0 
	iload 12
	invokevirtual_short .virtual_7 // idx=7 pc=2
	invokevirtual_short .virtual_26 // idx=26 pc=1
	ifeq Label142
	iconst_1 
	istore 11
	goto Label144
Label142:
	iinc 12 1
	goto Label131
Label144:
	iload 11
	ifeq Label163
	aload_6 
	invokevirtual_short .virtual_8 // idx=8 pc=1
	astore 12
	aload 12
	invokevirtual_short .virtual_26 // idx=26 pc=1
	ifne Label154
	iconst_1 
	istore_5 
Label154:
	aload 12
	invokevirtual_short .virtual_4 // idx=4 pc=1
	iload 9
	if_icmpgt Label161
	aload 12
	invokevirtual_short .virtual_22 // idx=22 pc=1
	goto Label163
Label161:
	aload 12
	invokevirtual_short .virtual_20 // idx=20 pc=1
Label163:
	iinc 2 1
	goto Label104
Label165:
	iload_5 
	ifeq Label168
	goto_w Label21
Label168:
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_3 
Label171:
	iinc 3 -1
	iload_3 
	iflt Label206
	aload_0 
	iload_3 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_4 
	aload_4 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	ifle Label171
	aload_4 
	bipush 9
	invokevirtual_short .virtual_12 // idx=12 pc=2
	ifne Label171
	aload_4 
	bipush 4
	invokevirtual_short .virtual_12 // idx=12 pc=2
	ifne Label206
	aload_4 
	bipush 6
	invokevirtual_short .virtual_12 // idx=12 pc=2
	ifne Label206
	aload_4 
	bipush 11
	invokevirtual_short .virtual_12 // idx=12 pc=2
	ifne Label206
	aload_4 
	bipush 3
	invokevirtual_short .virtual_12 // idx=12 pc=2
	ifne Label206
	aload_4 
	invokevirtual_short .virtual_26 // idx=26 pc=1
	ifne Label206
	aload_4 
	invokevirtual_short .virtual_20 // idx=20 pc=1
Label206:
	return 
	}


final boolean peepholeDeadBlocks( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_1 
	iconst_0 
	istore_2 
Label6:
	iconst_0 
	istore_3 
	aload_0 
	iconst_0 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	iconst_0 
	istore_4 
Label13:
	iload_4 
	iload_1 
	iconst_1 
	isub 
	if_icmpge Label47
	aload_0 
	iload_4 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_5 
	aload_5 
	invokevirtual_short .virtual_26 // idx=26 pc=1
	ifne Label45
	aload_5 
	invokevirtual_short .virtual_28 // idx=28 pc=1
	ifnonnull Label31
	aload_5 
	invokevirtual_short .virtual_40 // idx=40 pc=1
	ifeq Label37
Label31:
	aload_5 
	invokevirtual_short .virtual_50 // idx=50 pc=1
	pop 
	iconst_1 
	istore_3 
	goto Label45
Label37:
	aload_5 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	ifeq Label45
	aload_5 
	invokevirtual_short .virtual_50 // idx=50 pc=1
	pop 
	iconst_1 
	istore_3 
Label45:
	iinc 4 1
	goto Label13
Label47:
	iload_2 
	iload_3 
	ior 
	istore_2 
	iload_3 
	ifne Label6
	iload_2 
	ireturn 
	}


final purgeDeadBlocks( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks ); // address: 0
	{
	enter 
Label1:
	iconst_0 
	istore_2 
	aload_0 
	iconst_0 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	iconst_1 
	isub 
	istore_1 
Label11:
	iload_1 
	iflt Label79
	aload_0 
	iload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_3 
	aload_3 
	invokevirtual_short .virtual_28 // idx=28 pc=1
	astore_4 
	aload_4 
	ifnull Label52
	aload_4 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	ifne Label34
	aload_3 
	aload_0 
	aload_4 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokevirtual_short .virtual_12 // idx=12 pc=2
	invokevirtual_short .virtual_27 // idx=27 pc=2
	iconst_1 
	istore_2 
	goto Label52
Label34:
	aload_4 
	invokevirtual_short .virtual_18 // idx=18 pc=1
	ifeq Label52
	aload_4 
	bipush 6
	invokevirtual_short .virtual_12 // idx=12 pc=2
	ifne Label52
	aload_4 
	invokevirtual_short .virtual_30 // idx=30 pc=1
	ifnonnull Label52
	aload_3 
	invokevirtual_short .virtual_40 // idx=40 pc=1
	ifne Label52
	aload_3 
	aload_4 
	invokevirtual_short .virtual_52 // idx=52 pc=2
	iconst_1 
	istore_2 
Label52:
	aload_3 
	invokevirtual_short .virtual_40 // idx=40 pc=1
	iconst_1 
	isub 
	istore_5 
Label57:
	iload_5 
	iflt Label77
	aload_3 
	iload_5 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	astore_4 
	aload_4 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	ifne Label75
	aload_3 
	aload_0 
	aload_4 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokevirtual_short .virtual_12 // idx=12 pc=2
	iload_5 
	invokevirtual_short .virtual_37 // idx=37 pc=3
	iconst_1 
	istore_2 
Label75:
	iinc 5 -1
	goto Label57
Label77:
	iinc 1 -1
	goto Label11
Label79:
	aload_0 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	iconst_1 
	isub 
	istore_1 
Label84:
	iload_1 
	iflt Label128
	aload_0 
	iload_1 
	invokevirtual_short .virtual_10 // idx=10 pc=2
	astore_3 
	aload_3 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_4 
	aload_4 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	ifne Label102
	aload_3 
	aload_0 
	aload_4 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokevirtual_short .virtual_12 // idx=12 pc=2
	invokevirtual_short .virtual_3 // idx=3 pc=2
Label102:
	aload_3 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	astore_5 
	aload_5 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	ifne Label114
	aload_3 
	aload_0 
	aload_5 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokevirtual_short .virtual_12 // idx=12 pc=2
	invokevirtual_short .virtual_4 // idx=4 pc=2
Label114:
	aload_3 
	invokevirtual_short .virtual_8 // idx=8 pc=1
	astore_6 
	aload_6 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	ifne Label126
	aload_3 
	aload_0 
	aload_6 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokevirtual_short .virtual_12 // idx=12 pc=2
	invokevirtual_short .virtual_5 // idx=5 pc=2
Label126:
	iinc 1 -1
	goto Label84
Label128:
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	bipush 2
	isub 
	istore_1 
Label133:
	iload_1 
	iflt Label147
	aload_0 
	iload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_3 
	aload_3 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	ifne Label145
	aload_0 
	iload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=2
Label145:
	iinc 1 -1
	goto Label133
Label147:
	iload_2 
	ifeq Label150
	goto_w Label1
Label150:
	return 
	}


public final int purgeEmptyBlocks( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual_short .virtual_17 // idx=17 pc=1
	pop 
	aload_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeBasicBlocks.setOffsets // pc=2
	istore_1 
	aload_0 
	invokevirtual_short .virtual_18 // idx=18 pc=1
	aload_0 
	iconst_0 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	iload_1 
	ireturn 
	}


public final int computeStackImpact( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_2 
	iconst_0 
	istore_3 
Label6:
	iload_3 
	iload_2 
	if_icmpge Label15
	aload_0 
	iload_3 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	invokevirtual_short .virtual_14 // idx=14 pc=1
	iinc 3 1
	goto Label6
Label15:
	aload_0 
	iconst_0 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_1 
	aload_1 
	iconst_0 
	invokevirtual_short .virtual_45 // idx=45 pc=2
	aload_1 
	invokevirtual_short .virtual_13 // idx=13 pc=1
	aload_0 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	istore_2 
	iconst_0 
	istore_3 
Label29:
	iload_3 
	iload_2 
	if_icmpge Label44
	aload_0 
	iload_3 
	invokevirtual_short .virtual_10 // idx=10 pc=2
	invokevirtual_short .virtual_8 // idx=8 pc=1
	astore_1 
	aload_1 
	iconst_1 
	invokevirtual_short .virtual_45 // idx=45 pc=2
	aload_1 
	invokevirtual_short .virtual_13 // idx=13 pc=1
	iinc 3 1
	goto Label29
Label44:
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	iconst_1 
	isub 
	istore_2 
Label49:
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
Label53:
	iload_4 
	iload_2 
	if_icmpge Label119
	aload_0 
	iload_4 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_1 
	aload_1 
	invokevirtual_short .virtual_15 // idx=15 pc=1
	ifeq Label117
	aload_1 
	invokevirtual_short .virtual_14 // idx=14 pc=1
	aload_1 
	invokevirtual_short .virtual_54 // idx=54 pc=1
	istore_5 
	aload_1 
	invokevirtual_short .virtual_28 // idx=28 pc=1
	astore_6 
	aload_6 
	ifnull Label84
	aload_6 
	invokevirtual_short .virtual_46 // idx=46 pc=1
	iload_5 
	if_icmpge Label84
	aload_6 
	iload_5 
	invokevirtual_short .virtual_45 // idx=45 pc=2
	aload_6 
	invokevirtual_short .virtual_13 // idx=13 pc=1
	iconst_1 
	istore_3 
Label84:
	aload_1 
	bipush 8
	invokevirtual_short .virtual_12 // idx=12 pc=2
	ifeq Label89
	iinc 5 -1
Label89:
	aload_1 
	invokevirtual_short .virtual_40 // idx=40 pc=1
	istore_7 
	iconst_0 
	istore 8
Label94:
	iload 8
	iload_7 
	if_icmpge Label117
	aload_1 
	iload 8
	invokevirtual_short .virtual_41 // idx=41 pc=2
	astore_6 
	aload_6 
	aload_1 
	if_acmpeq Label115
	aload_6 
	invokevirtual_short .virtual_46 // idx=46 pc=1
	iload_5 
	if_icmpge Label115
	aload_6 
	iload_5 
	invokevirtual_short .virtual_45 // idx=45 pc=2
	aload_6 
	invokevirtual_short .virtual_13 // idx=13 pc=1
	iconst_1 
	istore_3 
Label115:
	iinc 8 1
	goto Label94
Label117:
	iinc 4 1
	goto Label53
Label119:
	iload_3 
	ifne Label49
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
Label125:
	iload_5 
	iload_2 
	if_icmpge Label140
	aload_0 
	iload_5 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	invokevirtual_short .virtual_47 // idx=47 pc=1
	istore_6 
	iload_6 
	iload_4 
	if_icmple Label138
	iload_6 
	istore_4 
Label138:
	iinc 5 1
	goto Label125
Label140:
	iload_4 
	ireturn 
	}


public final int computeMaxCodeSize( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeBasicBlocks.setOffsets // pc=2
	ireturn 
	}


public final resolveBadLabel( net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#26, boolean[], boolean ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_5 
	iconst_0 
	istore_6 
Label6:
	iload_6 
	iload_5 
	if_icmplt Label10
	goto_w Label143
Label10:
	aload_0 
	iload_6 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_7 
	aload_7 
	invokevirtual_short .virtual_30 // idx=30 pc=1
	astore 8
	aload_7 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	istore 9
	aload_3 
	ifnull Label83
	aload_3 
	iload 9
	baload 
	ifeq Label35
	aload_7 
	bipush 9
	invokevirtual_short .virtual_12 // idx=12 pc=2
	ifeq Label83
	aload 8
	ifnonnull Label35
	aload_7 
	invokevirtual_short .virtual_26 // idx=26 pc=1
	ifeq Label83
Label35:
	aconst_null 
	astore 10
	iload 9
	ifle Label65
	iload 9
	aload_3 
	arraylength 
	iconst_1 
	isub 
	if_icmpge Label65
	aload_3 
	iload 9
	iconst_1 
	isub 
	baload 
	ifne Label57
	aload_3 
	iload 9
	iconst_1 
	iadd 
	baload 
	ifeq Label65
Label57:
	aload_3 
	arraylength 
	istore 9
	aload_0 
	iload 9
	invokevirtual_short .virtual_11 // idx=11 pc=2
	astore 10
	goto Label72
Label65:
	aload_0 
	iload 9
	invokevirtual_short .virtual_11 // idx=11 pc=2
	astore 10
	aload 10
	aload_7 
	invokevirtual_short .virtual_27 // idx=27 pc=2
Label72:
	aload_7 
	aconst_null 
	invokevirtual_short .virtual_29 // idx=29 pc=2
	aload 10
	aload 8
	invokevirtual_short .virtual_29 // idx=29 pc=2
	aload_0 
	aload_7 
	aload 10
	invokespecial net.rim.tools.compiler.classfile.ByteCodeBasicBlocks.fixupBranches // pc=3
	goto_w Label141
Label83:
	aload 8
	ifnull Label88
	aload 8
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.verifyUninitializedOffsets // pc=1
	goto_w Label141
Label88:
	aload_7 
	invokevirtual_short .virtual_17 // idx=17 pc=1
	ifeq Label92
	goto_w Label141
Label92:
	aload_7 
	bipush 9
	invokevirtual_short .virtual_12 // idx=12 pc=2
	ifne Label141
	iload_4 
	ifne Label141
	aload_1 
	invokevirtual boolean isPreverified( net.rim.tools.compiler.Compiler ) // pc=1
	ifeq Label141
	aload_2 
	invokenonvirtual_lib .routine_19303 // pc=1
	astore 10
	aload_7 
	invokevirtual_short .virtual_26 // idx=26 pc=1
	ifeq Label126
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload 10
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_327:"Missing stack map in: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokenonvirtual_lib .routine_16530 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_328:" at label: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_7 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label126:
	aload_1 
	aload 10
	invokenonvirtual_lib .routine_1165 // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_329:"Bad StackMap format in: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokenonvirtual_lib .routine_16530 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual generateVerifyWarning( net.rim.tools.compiler.Compiler, java.lang.String, java.lang.String ) // pc=3
	aload_2 
	iipush 134217728
	invokenonvirtual_lib .routine_19570 // pc=2
Label141:
	iinc 6 1
	goto_w Label6
Label143:
	return 
	}

}
