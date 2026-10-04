// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 69
// ########################################################


package net.rim.tools.compiler.analysis;


abstract public final class InstructionStackEntry extends Object
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _numTypes ; // ofs = 21294 addr = 0)
	private net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type[]*/  _types ; // ofs = 21298 addr = 0)
	private net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type*/  _voidType ; // ofs = 21302 addr = 0)
	private int /*int*/  _offset ; // ofs = 21306 addr = 0)
	private String /*java.lang.String*/  _methodName ; // ofs = 21310 addr = 0)
	private boolean /*boolean*/  _everSeen ; // ofs = 21314 addr = 0)
	private boolean /*boolean*/  _everMerged ; // ofs = 21318 addr = 0)
	private boolean /*boolean*/  _changed ; // ofs = 21322 addr = 0)
	private boolean /*boolean*/  _seeded ; // ofs = 21326 addr = 0)
	private int /*int*/  _hiLocals ; // ofs = 21330 addr = 0)
	private int /*int*/  _maxLocals ; // ofs = 21334 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.analysis.InstructionStackEntry, java.lang.String, int, int, int, net.rim.tools.compiler.types.Type[], net.rim.tools.compiler.types.Type[], net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_7 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iconst_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	bipush -1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	iload_3 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	iload_2 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iload_3 
	iload_4 
	iadd 
	bipush 2
	iadd 
	newarray_object_lib net.rim.tools.compiler.types.Type//net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_5 
	ifnonnull Label33
	iconst_0 
	goto Label35
Label33:
	aload_5 
	arraylength 
Label35:
	istore 9
	iconst_0 
	istore 8
Label38:
	iload 8
	iload 9
	if_icmpge Label66
	aload_5 
	iload 8
	aaload 
	astore 10
	aload 10
	checkcastbranch_lib 
	astore 11
	aload 11
	sipush 2048
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label55
	aload 11
	invokenonvirtual_lib .routine_1333 // pc=1
	astore 10
Label55:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 10
	aastore 
	iinc 8 1
	goto Label38
Label66:
	iload 8
	iinc 8 1
	iload_3 
	if_icmpge Label80
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_7 
	aastore 
	goto Label66
Label80:
	aload_6 
	ifnonnull Label84
	iconst_0 
	goto Label86
Label84:
	aload_6 
	arraylength 
Label86:
	istore 9
	iconst_0 
	istore 8
Label89:
	iload 8
	iload 9
	if_icmpge Label117
	aload_6 
	iload 8
	aaload 
	astore 10
	aload 10
	checkcastbranch_lib 
	astore 11
	aload 11
	sipush 2048
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label106
	aload 11
	invokenonvirtual_lib .routine_1333 // pc=1
	astore 10
Label106:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 10
	aastore 
	iinc 8 1
	goto Label89
Label117:
	return 
	}


public <init>( net.rim.tools.compiler.analysis.InstructionStackEntry, net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iconst_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	bipush -1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib module:net_rim_loader-2.class#29.routine_19250(  ) // class#29
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final verifyLongType( net.rim.tools.compiler.analysis.InstructionStackEntry, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	iconst_1 
	iadd 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	if_icmplt Label8
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label8:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	iconst_1 
	iadd 
	aaload 
	astore_2 
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label20
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label20:
	return 
	}


private final verifyError( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.util.VerificationException//module:net_rim_loader-2.class#55 module:net_rim_loader-2.class#55 module:net_rim_loader-2.class#55
	dup 
	aconst_null 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial_lib .routine_30653 // pc=4
	athrow 
	}


private final verifyError( net.rim.tools.compiler.analysis.InstructionStackEntry, java.lang.String ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.util.VerificationException//module:net_rim_loader-2.class#55 module:net_rim_loader-2.class#55 module:net_rim_loader-2.class#55
	dup 
	aconst_null 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokespecial_lib .routine_30680 // pc=5
	athrow 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getNumTypes( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final net.rim.tools.compiler.types.Type[] getTypes( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final setOffset( net.rim.tools.compiler.analysis.InstructionStackEntry, int ); // address: 0
	{
	putfield_return .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final resetState( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	iconst_0 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iconst_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


public final boolean hasEverMerged( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	ireturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final setChanged( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


public final clearChanged( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


public final boolean isChanged( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	ireturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public final setSeeded( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


public final boolean isSeeded( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	ireturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public final int getHiLocals( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	ireturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final setType( net.rim.tools.compiler.analysis.InstructionStackEntry, net.rim.tools.compiler.types.Type, int ); // address: 0
	{
	enter 
	aload_1 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	sipush 2048
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label11
	aload_3 
	invokenonvirtual_lib .routine_1333 // pc=1
	astore_1 
Label11:
	iload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	if_icmplt Label16
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label16:
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aaload 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label23
	goto_w Label98
Label23:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifeq Label46
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_418:"setType at index:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_419:" cannot change "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aaload 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_420:" to "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=2
Label46:
	iload_2 
	ifle Label61
	iload_2 
	iconst_1 
	isub 
	istore_3 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_3 
	aaload 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label61
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aastore 
Label61:
	aload_1 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label85
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	iinc 2 1
	aload_1 
	aastore 
	iload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	if_icmplt Label74
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label74:
	iload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	arraylength 
	if_icmplt Label80
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label80:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aastore 
	goto Label95
Label85:
	iload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	arraylength 
	if_icmplt Label91
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label91:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aload_1 
	aastore 
Label95:
	aload_0 
	iconst_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label98:
	return 
	}


public final setLocalType( net.rim.tools.compiler.analysis.InstructionStackEntry, net.rim.tools.compiler.types.Type, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	aload_1 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label9
	iinc 2 1
Label9:
	iload_2 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	if_icmplt Label14
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label14:
	iload_2 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	if_icmple Label20
	aload_0 
	iload_2 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label20:
	return 
	}


public final addType( net.rim.tools.compiler.analysis.InstructionStackEntry, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label31
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	iadd 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	arraylength 
	if_icmple Label12
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label12:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aastore 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aastore 
	return 
Label31:
	aload_1 
	checkcastbranch_lib 
	astore_2 
	aload_2 
	sipush 2048
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label41
	aload_2 
	invokenonvirtual_lib .routine_1333 // pc=1
	astore_1 
Label41:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	arraylength 
	if_icmple Label47
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label47:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aastore 
	return 
	}


public final subtractType( net.rim.tools.compiler.analysis.InstructionStackEntry, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	isub 
	istore_2 
	iload_2 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	if_icmpge Label10
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label10:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aaload 
	astore_3 
	aload_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label20
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label20:
	aload_0 
	iload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public final clearOperands( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public final net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.analysis.InstructionStackEntry, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	if_icmplt Label6
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label6:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	aaload 
	astore_2 
	aload_2 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label16
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyLongType // pc=2
Label16:
	aload_2 
	areturn 
	}


public final net.rim.tools.compiler.types.Type getTypeFromEnd( net.rim.tools.compiler.analysis.InstructionStackEntry, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	isub 
	istore_2 
	iload_2 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	if_icmpge Label10
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label10:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aaload 
	astore_3 
	aload_3 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label20
	aload_0 
	iload_2 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyLongType // pc=2
Label20:
	aload_3 
	areturn 
	}


public final net.rim.tools.compiler.types.Type consumeTypeFromEnd( net.rim.tools.compiler.analysis.InstructionStackEntry, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_2 
	iload_1 
	bipush 2
	if_icmpne Label13
	aload_2 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifne Label13
	aload_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=1
Label13:
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	isub 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	areturn 
	}


public final initialized( net.rim.tools.compiler.analysis.InstructionStackEntry, module:net_rim_loader-2.class#5 ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual_lib .routine_9090 // pc=1
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	istore_3 
	iconst_0 
	istore_4 
Label8:
	iload_4 
	iload_3 
	if_icmpge Label28
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	aaload 
	astore_5 
	aload_1 
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label26
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	aload_2 
	aastore 
	aload_0 
	iconst_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label26:
	iinc 4 1
	goto Label8
Label28:
	return 
	}


public final merge( net.rim.tools.compiler.analysis.InstructionStackEntry, net.rim.tools.compiler.analysis.InstructionStackEntry, boolean, net.rim.tools.compiler.Compiler ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getNumTypes // pc=1
	istore_4 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getNumTypes // pc=1
	istore_5 
	iload_2 
	ifeq Label10
	iinc 5 -1
Label10:
	iload_4 
	iload_5 
	if_icmpeq Label16
	aload_0 
	ldc literal_421:"inconsistent stack depth in control flow merge"
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=2
Label16:
	aload_3 
	invokevirtual net.rim.tools.compiler.types.Type getNullType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_6 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_7 
	aload_3 
	invokevirtual module:net_rim_loader-2.class#4 getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	astore 8
	iconst_0 
	istore 9
Label26:
	iload 9
	iload_4 
	if_icmplt Label30
	goto_w Label282
Label30:
	aload_0 
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getType // pc=2
	astore 10
	aload_1 
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getType // pc=2
	astore 11
	aload 10
	aload 11
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	goto_w Label280
Label43:
	aload 10
	instanceof_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	ifeq Label54
	aload 11
	instanceof_lib net.rim.tools.compiler.types.BaseType//module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2 module:net_rim_loader-2.class#2
	ifeq Label54
	aload 10
	aload 11
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifeq Label54
	goto_w Label280
Label54:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label59
	aload_0 
	iconst_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label59:
	aload 10
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label64
	goto_w Label280
Label64:
	aload 11
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label73
	aload_0 
	aload_7 
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto_w Label280
Label73:
	aload 10
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifeq Label79
	aload 11
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifne Label84
Label79:
	aload_0 
	aload_7 
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto_w Label280
Label84:
	aload 10
	instanceof_lib net.rim.tools.compiler.types.ClassUninitializedType//module:net_rim_loader-2.class#5 module:net_rim_loader-2.class#5 module:net_rim_loader-2.class#5
	ifne Label90
	aload 11
	instanceof_lib net.rim.tools.compiler.types.ClassUninitializedType//module:net_rim_loader-2.class#5 module:net_rim_loader-2.class#5 module:net_rim_loader-2.class#5
	ifeq Label93
Label90:
	aload_0 
	ldc literal_422:"incompatible types in control flow merge"
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=2
Label93:
	aload 10
	aload 8
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label98
	goto_w Label280
Label98:
	aload 11
	aload 8
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label107
	aload_0 
	aload 11
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto_w Label280
Label107:
	aload 11
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label112
	goto_w Label280
Label112:
	aload 10
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label121
	aload_0 
	aload 11
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto_w Label280
Label121:
	aconst_null 
	astore 12
	aconst_null 
	astore 13
	aload 10
	checkcastbranch_lib 
	astore 12
Label128:
	aload 11
	checkcastbranch_lib 
	astore 13
Label131:
	aload 12
	ifnonnull Label134
	goto_w Label240
Label134:
	aload 13
	ifnonnull Label137
	goto_w Label240
Label137:
	aload 12
	invokenonvirtual_lib .routine_130 // pc=1
	istore 14
	aload 13
	invokenonvirtual_lib .routine_130 // pc=1
	istore 15
	iload 14
	iload 15
	if_icmpeq Label168
	iload 14
	iload 15
	if_icmple Label151
	iload 15
	istore 14
Label151:
	aload 8
	astore 16
	iconst_0 
	istore 17
Label155:
	iload 17
	iload 14
	if_icmpge Label163
	aload 16
	invokevirtual module:net_rim_loader-2.class#0 getArrayType( net.rim.tools.compiler.types.Type ) // pc=1
	astore 16
	iinc 17 1
	goto Label155
Label163:
	aload_0 
	aload 16
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto_w Label280
Label168:
	aload 12
	invokenonvirtual_lib .routine_156 // pc=1
	astore 16
	aload 13
	invokenonvirtual_lib .routine_156 // pc=1
	astore 17
	aload 16
	aload 17
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label179
	goto_w Label280
Label179:
	aload 16
	instanceof_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	ifeq Label185
	aload 17
	instanceof_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	ifne Label190
Label185:
	aload_0 
	aload 8
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto_w Label280
Label190:
	aload 16
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore 18
	aload 17
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	astore 19
	aload 18
	sipush 2048
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label205
	aload 19
	aload 18
	invokenonvirtual_lib .routine_1475 // pc=2
	ifeq Label205
	goto_w Label280
Label205:
	aload 18
	aload 19
	invokenonvirtual_lib .routine_1353 // pc=2
	astore 20
	aload 20
	aload 18
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label214
	goto_w Label280
Label214:
	aload 20
	aload 19
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label223
	aload_0 
	aload 11
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto_w Label280
Label223:
	aload 20
	astore 21
	iconst_0 
	istore 22
Label227:
	iload 22
	iload 14
	if_icmpge Label235
	aload 21
	invokevirtual module:net_rim_loader-2.class#0 getArrayType( net.rim.tools.compiler.types.Type ) // pc=1
	astore 21
	iinc 22 1
	goto Label227
Label235:
	aload_0 
	aload 21
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto Label280
Label240:
	aload 12
	ifnonnull Label244
	aload 13
	ifnull Label249
Label244:
	aload_0 
	aload 8
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto Label280
Label249:
	aload 10
	checkcastbranch_lib 
	astore 14
	aload 11
	checkcastbranch_lib 
	astore 15
	aload 14
	aload 15
	invokenonvirtual_lib .routine_1353 // pc=2
	astore 16
	aload 16
	aload 14
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label264
	goto Label280
Label264:
	aload_0 
	aload 16
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto Label280
Label269:
	iload 9
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	if_icmpge Label277
	aload_0 
	aload_7 
	iload 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setType // pc=3
	goto Label280
Label277:
	aload_0 
	ldc literal_423:"incompatible operand types in control flow merge"
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.verifyError // pc=2
Label280:
	iinc 9 1
	goto_w Label26
Label282:
	aload_0 
	iconst_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


public final fixupUninitializedOffsets( net.rim.tools.compiler.analysis.InstructionStackEntry, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	istore_3 
	iconst_0 
	istore_4 
Label5:
	iload_4 
	iload_3 
	if_icmpge Label21
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	aaload 
	astore_5 
	aload_5 
	checkcastbranch_lib 
	astore_6 
	aload_6 
	iload_1 
	iload_2 
	invokenonvirtual_lib .routine_9112 // pc=3
Label19:
	iinc 4 1
	goto Label5
Label21:
	return 
	}


public final verifyUninitializedOffsets( net.rim.tools.compiler.analysis.InstructionStackEntry ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	istore_1 
	iconst_0 
	istore_2 
Label5:
	iload_2 
	iload_1 
	if_icmpge Label25
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aaload 
	astore_3 
	aload_3 
	checkcastbranch_lib 
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_9140 // pc=1
	ifeq Label23
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	ldc literal_424:"bad offset for NewObject StackMap entry"
	invokespecial_lib .routine_9845 // pc=2
	athrow 
Label23:
	iinc 2 1
	goto Label5
Label25:
	return 
	}

}
