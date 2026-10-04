// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 70
// ########################################################


package net.rim.tools.compiler.analysis;


abstract public final class InstructionStacker extends net.rim.tools.compiler.analysis.InstructionWalker
implements net.rim.tools.compiler.classfile.ByteCodeBlockTypes

{

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  _changed ; // ofs = 21452 addr = 0)
	private boolean /*boolean*/  _isreal ; // ofs = 21456 addr = 0)
	private net.rim.tools.compiler.Compiler /*net.rim.tools.compiler.Compiler*/  _compiler ; // ofs = 21460 addr = 0)
	private net.rim.tools.compiler.types.Method /*module:net_rim_loader-2.class#26*/  _method ; // ofs = 21464 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeBasicBlocks /*net.rim.tools.compiler.classfile.ByteCodeBasicBlocks*/  _blocks ; // ofs = 21468 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeBlock /*net.rim.tools.compiler.classfile.ByteCodeBlock*/  _block ; // ofs = 21472 addr = 0)
	private net.rim.tools.compiler.analysis.InstructionStackEntry /*net.rim.tools.compiler.analysis.InstructionStackEntry*/  _entry ; // ofs = 21476 addr = 0)
	private int /*int*/  _index ; // ofs = 21480 addr = 0)
	private net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type[]*/  _intTypes ; // ofs = 21484 addr = 0)
	private net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type[]*/  _fltTypes ; // ofs = 21488 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.tools.compiler.analysis.InstructionStacker ); // address: 0
	{
	jumpspecial <init>( net.rim.tools.compiler.analysis.InstructionWalker )
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final verifyError( net.rim.tools.compiler.analysis.InstructionStacker, java.lang.String ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.util.VerificationException//module:net_rim_loader-2.class#55 module:net_rim_loader-2.class#55 module:net_rim_loader-2.class#55
	dup 
	aconst_null 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16530 // pc=1
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokespecial_lib .routine_30680 // pc=5
	athrow 
	}


private final verifyError( net.rim.tools.compiler.analysis.InstructionStacker, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.util.VerificationException//module:net_rim_loader-2.class#55 module:net_rim_loader-2.class#55 module:net_rim_loader-2.class#55
	dup 
	aconst_null 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16530 // pc=1
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_434:"found "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_435:" where "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_436:" is required"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_30680 // pc=5
	athrow 
	}


private final verifyError( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.types.Type, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.Type ) // pc=1
	aload_2 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	return 
	}


private final verifyError( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.Type ) // pc=1
	aload_2 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.Type ) // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	return 
	}


private final verifyStkTypeError( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_2 
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 5
	if_icmpne Label8
	ldc literal_437:"integer type"
	astore_3 
	goto Label18
Label8:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_438:" type"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
Label18:
	new_lib net.rim.tools.compiler.util.VerificationException//module:net_rim_loader-2.class#55 module:net_rim_loader-2.class#55 module:net_rim_loader-2.class#55
	dup 
	aconst_null 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16530 // pc=1
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_434:"found "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_435:" where "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_436:" is required"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_30680 // pc=5
	athrow 
	}


private final mergeBlockEntry( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.analysis.InstructionStackEntry, net.rim.tools.compiler.classfile.ByteCodeBlock, boolean ); // address: 0
	{
	enter 
	aload_2 
	invokevirtual_short .virtual_30 // idx=30 pc=1
	astore_4 
	aload_4 
	ifnonnull Label27
	new InstructionStackEntry
	dup 
	aload_1 
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.<init> // pc=2
	astore_4 
	aload_4 
	aload_2 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setOffset // pc=2
	iload_3 
	ifeq Label20
	aload_4 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
Label20:
	aload_2 
	aload_4 
	invokevirtual_short .virtual_29 // idx=29 pc=2
	aload_0 
	iconst_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
Label27:
	aload_4 
	aload_1 
	iload_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.merge // pc=4
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.isChanged // pc=1
	ifeq Label38
	aload_0 
	iconst_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label38:
	return 
	}


private final verifyArrayType( net.rim.tools.compiler.analysis.InstructionStacker, int, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
	ldc_nullstr 
	astore_4 
	iload_1 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		

Label7:
	aload_2 
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	istore_3 
	ldc literal_427:"reference type"
	astore_4 
	goto_w Label81
Label13:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getByteType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label23
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getBooleanType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label25
Label23:
	iconst_1 
	goto Label26
Label25:
	iconst_0 
Label26:
	istore_3 
	ldc literal_439:"byte or boolean type"
	astore_4 
	goto Label81
Label30:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getCharType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	istore_3 
	ldc literal_440:"char type"
	astore_4 
	goto Label81
Label38:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label48
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getFloatType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	istore_3 
	ldc literal_441:"float type"
	astore_4 
	goto Label81
Label48:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getIntType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	istore_3 
	ldc literal_437:"integer type"
	astore_4 
	goto Label81
Label56:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label66
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getDoubleType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	istore_3 
	ldc literal_442:"double type"
	astore_4 
	goto Label81
Label66:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getLongType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	istore_3 
	ldc literal_443:"long type"
	astore_4 
	goto Label81
Label74:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getShortType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	istore_3 
	ldc literal_444:"short type"
	astore_4 
Label81:
	iload_3 
	ifne Label87
	aload_0 
	aload_2 
	aload_4 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label87:
	return 
	}


private final walkArrayLoad( net.rim.tools.compiler.analysis.InstructionStacker, int, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_4 
	aload_4 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label19
	aload_0 
	aload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label19:
	aload_4 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_6 
	aload_6 
	checkcastbranch_lib 
	invokenonvirtual_lib .routine_141 // pc=1
	astore_6 
	aload_0 
	iload_1 
	aload_6 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyArrayType // pc=3
	goto Label52
Label32:
	aload_6 
	instanceof_lib net.rim.tools.compiler.types.NullType//module:net_rim_loader-2.class#31 module:net_rim_loader-2.class#31 module:net_rim_loader-2.class#31
	ifeq Label48
	iload_3 
	ifne Label52
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label43
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_2 
	aaload 
	goto Label46
Label43:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_2 
	aaload 
Label46:
	astore_6 
	goto Label52
Label48:
	aload_0 
	aload_6 
	ldc literal_426:"array type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label52:
	aload_4 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	return 
	}


private final walkArrayStore( net.rim.tools.compiler.analysis.InstructionStacker, int, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_4 
	aload_4 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_4 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_6 
	aload_6 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label23
	aload_0 
	aload_6 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label23:
	aload_4 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_7 
	aload_7 
	checkcastbranch_lib 
	invokenonvirtual_lib .routine_141 // pc=1
	astore_7 
	aload_0 
	iload_1 
	aload_7 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyArrayType // pc=3
	goto Label59
Label36:
	aload_7 
	instanceof_lib net.rim.tools.compiler.types.NullType//module:net_rim_loader-2.class#31 module:net_rim_loader-2.class#31 module:net_rim_loader-2.class#31
	ifeq Label55
	iload_3 
	ifeq Label44
	aload_5 
	astore_7 
	goto Label59
Label44:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label50
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_2 
	aaload 
	goto Label53
Label50:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_2 
	aaload 
Label53:
	astore_7 
	goto Label59
Label55:
	aload_0 
	aload_7 
	ldc literal_426:"array type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label59:
	aload_5 
	aload_7 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label73
	aload_5 
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifeq Label69
	aload_7 
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifne Label73
Label69:
	aload_0 
	aload_5 
	aload_7 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label73:
	return 
	}


private final walkNewArray( net.rim.tools.compiler.analysis.InstructionStacker, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	iload_1 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		

Label5:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getBooleanType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label36
Label9:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getCharType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label36
Label13:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getByteType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label36
Label17:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getShortType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label36
Label21:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getIntType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label36
Label25:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getLongType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label36
Label29:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getFloatType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label36
Label33:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getDoubleType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
Label36:
	aload_2 
	ifnonnull Label48
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_445:"type code: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	ldc literal_446:"type enumeration"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label48:
	aload_2 
	invokevirtual module:net_rim_loader-2.class#0 getArrayType( net.rim.tools.compiler.types.Type ) // pc=1
	astore_2 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	return 
	}


private final walkJumpMethod( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.analysis.Instruction, module:net_rim_loader-2.class#26 ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16132 // pc=1
	ifeq Label7
	aload_2 
	invokenonvirtual_lib .routine_16132 // pc=1
	ifne Label10
Label7:
	aload_0 
	ldc literal_447:"incorrect parameters provided for method invocation."
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=2
Label10:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_19303 // pc=1
	aload_2 
	invokenonvirtual_lib .routine_19303 // pc=1
	invokenonvirtual_lib .routine_25534 // pc=2
	ifne Label19
	aload_0 
	ldc literal_448:"inconsistent parameters provided for method invocation."
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=2
Label19:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16076 // pc=1
	istore_3 
	iload_3 
	aload_2 
	invokenonvirtual_lib .routine_16076 // pc=1
	if_icmpeq Label29
	aload_0 
	ldc literal_449:"incorrect number of parameters provided for method invocation."
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=2
Label29:
	iload_3 
	iconst_1 
	isub 
	istore_4 
Label33:
	iload_4 
	iflt Label53
	aload_2 
	iload_4 
	invokenonvirtual_lib .routine_16111 // pc=2
	astore_5 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_4 
	invokenonvirtual_lib .routine_16111 // pc=2
	astore_6 
	aload_6 
	aload_5 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label51
	aload_0 
	aload_6 
	aload_5 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label51:
	iinc 4 -1
	goto Label33
Label53:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16161 // pc=1
	astore_4 
	aload_2 
	invokenonvirtual_lib .routine_16143 // pc=1
	ifeq Label78
	aload_2 
	invokenonvirtual_lib .routine_16161 // pc=1
	astore_5 
	aload_4 
	ifnonnull Label69
	aload_0 
	aload_5 
	ldc literal_450:"void"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	return 
Label69:
	aload_5 
	aload_4 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label85
	aload_0 
	aload_5 
	aload_4 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	return 
Label78:
	aload_4 
	ifnull Label85
	aload_0 
	ldc literal_450:"void"
	aload_4 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.Type ) // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label85:
	return 
	}


private final walkInvokeMethod( net.rim.tools.compiler.analysis.InstructionStacker, module:net_rim_loader.class#17, module:net_rim_loader-2.class#26 ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_3 
	aload_1 
	invokenonvirtual_lib .routine_18979 // pc=1
	istore_4 
	aload_2 
	invokenonvirtual_lib .routine_16076 // pc=1
	istore_5 
	iload_5 
	iconst_1 
	isub 
	istore_6 
Label13:
	iload_6 
	iflt Label39
	aload_2 
	iload_6 
	invokenonvirtual_lib .routine_16111 // pc=2
	astore_7 
	iconst_1 
	istore 8
	aload_7 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label25
	iinc 8 1
Label25:
	aload_3 
	iload 8
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore 9
	aload 9
	aload_7 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label37
	aload_0 
	aload 9
	aload_7 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label37:
	iinc 6 -1
	goto Label13
Label39:
	aload_2 
	invokenonvirtual_lib .routine_16132 // pc=1
	ifne Label43
	goto_w Label122
Label43:
	aload_3 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_6 
	iload_4 
	bipush 2
	if_icmpne Label51
	goto_w Label132
Label51:
	iload_4 
	bipush 5
	if_icmpeq Label57
	iload_4 
	bipush 6
	if_icmpne Label82
Label57:
	aload_2 
	bipush 16
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label82
	aload_6 
	checkcastbranch_lib 
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_9090 // pc=1
	astore_6 
	aload_3 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.initialized // pc=2
Label70:
	aload_2 
	invokenonvirtual_lib .routine_19303 // pc=1
	astore_7 
	aload_6 
	aload_7 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label132
	aload_0 
	aload_6 
	aload_7 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto Label132
Label82:
	iload_4 
	iconst_1 
	if_icmpne Label108
	aload_6 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getNullType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label92
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
Label92:
	aload_6 
	checkcastbranch_lib 
	astore_7 
	aload_0 
	iconst_0 
	aload_1 
	invokenonvirtual_lib .routine_24042 // pc=1
	aload_2 
	aload_7 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.checkAccess // pc=5
	ifne Label108
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
	aload_1 
	iconst_1 
	invokenonvirtual_lib .routine_23983 // pc=2
Label108:
	aload_2 
	invokenonvirtual_lib .routine_19303 // pc=1
	astore_7 
	aload_6 
	aload_7 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label132
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
	aload_0 
	aload_6 
	aload_7 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto Label132
Label122:
	aload_0 
	iconst_0 
	aload_1 
	invokenonvirtual_lib .routine_24042 // pc=1
	aload_2 
	aconst_null 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.checkAccess // pc=5
	ifne Label132
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
Label132:
	aload_2 
	invokenonvirtual_lib .routine_16143 // pc=1
	ifeq Label141
	aload_2 
	invokenonvirtual_lib .routine_16161 // pc=1
	astore_6 
	aload_3 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
Label141:
	return 
	}


private final boolean checkAccess( net.rim.tools.compiler.analysis.InstructionStacker, boolean, module:net_rim_loader-2.class#4, net.rim.tools.compiler.types.NameAndType, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter 
	aload_3 
	sipush 128
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifeq Label7
	iconst_1 
	ireturn 
Label7:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_19303 // pc=1
	astore_5 
	aload_3 
	invokevirtual module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	astore_6 
	aload_3 
	sipush 512
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifeq Label32
	aload_5 
	aload_6 
	if_acmpne Label22
	iconst_1 
	ireturn 
Label22:
	aload_5 
	invokenonvirtual_lib .routine_7762 // pc=1
	ifeq Label30
	aload_6 
	invokenonvirtual_lib .routine_7762 // pc=1
	ifeq Label30
	iconst_1 
	ireturn 
Label30:
	iconst_0 
	ireturn 
Label32:
	iload_1 
	ifeq Label45
	aload_3 
	bipush 64
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifeq Label45
	aload_5 
	aload_6 
	if_acmpne Label43
	iconst_1 
	ireturn 
Label43:
	iconst_0 
	ireturn 
Label45:
	aload_6 
	invokenonvirtual_lib .routine_1154 // pc=1
	astore_7 
	aload_5 
	invokenonvirtual_lib .routine_1154 // pc=1
	astore 8
	aload_7 
	ifnull Label55
	aload 8
	ifnonnull Label57
Label55:
	iconst_1 
	ireturn 
Label57:
	aload_7 
	aload 8
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label63
	iconst_1 
	ireturn 
Label63:
	aload_3 
	sipush 256
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifne Label69
	iconst_0 
	ireturn 
Label69:
	aload_4 
	ifnull Label77
	aload_4 
	aload_5 
	invokenonvirtual_lib .routine_1427 // pc=2
	ifne Label77
	iconst_0 
	ireturn 
Label77:
	aload_5 
	aload_6 
	invokenonvirtual_lib .routine_1427 // pc=2
	ifne Label83
	iconst_0 
	ireturn 
Label83:
	iconst_1 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

final init( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#26, net.rim.tools.compiler.classfile.ByteCodeBasicBlocks, int ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_2 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_3 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aconst_null 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label25
	aload_0 
	bipush 3
	newarray_object_lib net.rim.tools.compiler.types.Type//net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label25:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getIntType( net.rim.tools.compiler.Compiler ) // pc=1
	aastore 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getLongType( net.rim.tools.compiler.Compiler ) // pc=1
	aastore 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label41
	aload_0 
	bipush 3
	newarray_object_lib net.rim.tools.compiler.types.Type//net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type net.rim.tools.compiler.types.Type
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label41:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getFloatType( net.rim.tools.compiler.Compiler ) // pc=1
	aastore 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	bipush 2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getDoubleType( net.rim.tools.compiler.Compiler ) // pc=1
	aastore 
	return 
	}


public final clearChanged( net.rim.tools.compiler.analysis.InstructionStacker ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public final boolean isChanged( net.rim.tools.compiler.analysis.InstructionStacker ); // address: 0
	{
	ireturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final resetState( net.rim.tools.compiler.analysis.InstructionStacker ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_1 
	iconst_0 
	istore_2 
Label6:
	iload_2 
	iload_1 
	if_icmpge Label22
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_2 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_3 
	aload_3 
	invokevirtual_short .virtual_30 // idx=30 pc=1
	astore_4 
	aload_4 
	ifnull Label20
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.resetState // pc=1
Label20:
	iinc 2 1
	goto Label6
Label22:
	return 
	}


public final walkBlockStart( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.classfile.ByteCodeBlock ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label39
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual_short .virtual_30 // idx=30 pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label26
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.isChanged // pc=1
	ifne Label19
	aload_0 
	aconst_null 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
Label19:
	aload_0 
	new InstructionStackEntry
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.<init> // pc=2
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
Label26:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual boolean isPreverified( net.rim.tools.compiler.Compiler ) // pc=1
	ifeq Label39
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual_short .virtual_19 // idx=19 pc=1
	ifeq Label39
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iipush 33554432
	invokenonvirtual_lib .routine_19625 // pc=2
	ifne Label39
	aload_0 
	ldc literal_425:"missing stack map at label"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=2
Label39:
	return 
	}


public final walkItemStart( net.rim.tools.compiler.analysis.InstructionStacker, int, net.rim.tools.compiler.analysis.Instruction ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label53
	aconst_null 
	astore_3 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_9 // idx=9 pc=1
	istore_5 
	iconst_0 
	istore_4 
Label13:
	iload_4 
	iload_5 
	if_icmpge Label53
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_4 
	invokevirtual_short .virtual_10 // idx=10 pc=2
	astore_6 
	aload_6 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual_short .virtual_10 // idx=10 pc=2
	ifne Label25
	goto Label51
Label25:
	aload_3 
	ifnonnull Label32
	new InstructionStackEntry
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokespecial net.rim.tools.compiler.analysis.InstructionStackEntry.<init> // pc=2
	astore_3 
Label32:
	aload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.clearOperands // pc=1
	aload_6 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	astore_7 
	aload_7 
	ifnonnull Label42
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual module:net_rim_loader-2.class#4 getBaseExceptionClass( net.rim.tools.compiler.Compiler ) // pc=1
	astore_7 
Label42:
	aload_3 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_0 
	aload_3 
	aload_6 
	invokevirtual_short .virtual_8 // idx=8 pc=1
	iconst_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.mergeBlockEntry // pc=4
Label51:
	iinc 4 1
	goto Label13
Label53:
	return 
	}


public final walkItemEnd( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.classfile.ByteCodeBlock, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label52
	iload_2 
	ifeq Label52
	aload_1 
	invokevirtual_short .virtual_30 // idx=30 pc=1
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.clearChanged // pc=1
	aload_1 
	invokevirtual_short .virtual_28 // idx=28 pc=1
	astore_5 
	aload_5 
	ifnull Label18
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	iconst_0 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.mergeBlockEntry // pc=4
Label18:
	aload_1 
	invokevirtual_short .virtual_40 // idx=40 pc=1
	istore_4 
	iconst_0 
	istore_3 
Label23:
	iload_3 
	iload_4 
	if_icmpge Label39
	aload_1 
	iload_3 
	invokevirtual_short .virtual_41 // idx=41 pc=2
	astore_5 
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	aload_1 
	bipush 8
	invokevirtual_short .virtual_12 // idx=12 pc=2
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.mergeBlockEntry // pc=4
	iinc 3 1
	goto Label23
Label39:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getHiLocals // pc=1
	istore_6 
	iload_6 
	aload_1 
	invokevirtual_short .virtual_49 // idx=49 pc=1
	if_icmple Label49
	aload_1 
	iload_6 
	invokevirtual_short .virtual_48 // idx=48 pc=2
Label49:
	aload_0 
	aconst_null 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label52:
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.analysis.Instruction ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aload_2 
	ifnonnull Label6
	goto_w Label1097
Label6:
	iconst_1 
	istore_3 
	aload_1 
	invokevirtual int getOpcode( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	istore_7 
	aload_1 
	invokevirtual int getOp( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	istore 8
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label18
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	goto Label19
Label18:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label19:
	astore 9
	iload_7 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

Label22:
	iinc 3 1
Label23:
	aload_0 
	iload_7 
	iload_3 
	iload_7 
	sipush 176
	if_icmpne Label31
	iconst_1 
	goto Label32
Label31:
	iconst_0 
Label32:
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.walkArrayLoad // pc=4
	goto_w Label1097
Label34:
	iinc 3 1
Label35:
	aload_0 
	iload_7 
	iload_3 
	iload_7 
	sipush 182
	if_icmpne Label43
	iconst_1 
	goto Label44
Label43:
	iconst_0 
Label44:
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.walkArrayStore // pc=4
	goto_w Label1097
Label46:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifne Label57
	aload_0 
	aload_4 
	ldc literal_426:"array type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label57:
	aload_2 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label63:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getNullType( net.rim.tools.compiler.Compiler ) // pc=1
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label68:
	iload_7 
	bipush 63
	isub 
	istore 8
Label72:
	aload_2 
	iload 8
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getType // pc=2
	astore_4 
	aload_4 
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifne Label83
	aload_0 
	aload_4 
	ldc literal_427:"reference type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label83:
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label87:
	iload_7 
	bipush 55
	isub 
	istore 8
Label91:
	iload_7 
	bipush 53
	if_icmpeq Label97
	iload_7 
	bipush 54
	if_icmpne Label98
Label97:
	iinc 3 1
Label98:
	aload_2 
	iload 8
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getType // pc=2
	astore_4 
	aload_4 
	aload 9
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label114
	aload_0 
	aload_4 
	aload 9
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label114:
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label118:
	iload_7 
	bipush 85
	isub 
	istore 8
Label122:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifne Label133
	aload_0 
	aload_4 
	ldc literal_427:"reference type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label133:
	aload_2 
	aload_4 
	iload 8
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setLocalType // pc=3
	goto_w Label1097
Label138:
	iload_7 
	bipush 77
	isub 
	istore 8
Label142:
	iload_7 
	bipush 75
	if_icmpeq Label148
	iload_7 
	bipush 76
	if_icmpne Label149
Label148:
	iinc 3 1
Label149:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload 9
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label165
	aload_0 
	aload_4 
	aload 9
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label165:
	aload_2 
	aload_4 
	iload 8
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.setLocalType // pc=3
	goto_w Label1097
Label170:
	iinc 3 1
Label171:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label187
	aload_0 
	aload_4 
	aload 9
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label187:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label203
	aload_0 
	aload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label203:
	aload_2 
	aload 9
	iload_3 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label209:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifeq Label217
	goto_w Label1097
Label217:
	aload_0 
	aload_5 
	ldc literal_427:"reference type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label1097
Label222:
	iinc 3 1
Label223:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifeq Label234
	goto_w Label1097
Label234:
	aload_0 
	aload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
	goto_w Label1097
Label241:
	iinc 3 1
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload 9
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label258
	aload_0 
	aload_4 
	aload 9
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label258:
	bipush 2
	istore_3 
Label260:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	aload 9
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label276
	aload_0 
	aload_5 
	aload 9
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label276:
	aload_2 
	aload 9
	bipush 3
	iload_3 
	isub 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label284:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label300
	aload_0 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label300:
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label316
	aload_0 
	aload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label316:
	aload_2 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label322:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual module:net_rim_loader-2.class#4 getBaseExceptionClass( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifeq Label332
	goto_w Label1097
Label332:
	aload_0 
	aload_4 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_428:"class derived from "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual module:net_rim_loader-2.class#4 getBaseExceptionClass( net.rim.tools.compiler.Compiler ) // pc=1
	invokenonvirtual_lib .routine_25353 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label1097
Label345:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label361
	aload_0 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label361:
	aload_0 
	iload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.walkNewArray // pc=2
	goto_w Label1097
Label365:
	aload_2 
	aload 9
	iload_3 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
Label370:
	iload_7 
	bipush 30
	if_icmpne Label374
	iinc 3 1
Label374:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16143 // pc=1
	ifne Label385
	aload_0 
	aload_4 
	ldc literal_429:"void type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label385:
	aload_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16161 // pc=1
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifeq Label391
	goto_w Label1097
Label391:
	aload_0 
	aload_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16161 // pc=1
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.Type ) // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label1097
Label398:
	aload_2 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.clearOperands // pc=1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16143 // pc=1
	ifne Label404
	goto_w Label1097
Label404:
	aload_0 
	ldc literal_429:"void type"
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16161 // pc=1
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.Type ) // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label1097
Label411:
	iinc 3 1
Label412:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	goto_w Label1097
Label416:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label428
	aload_0 
	aload_4 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label428:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label440
	aload_0 
	aload_5 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label440:
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label447:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_4 
	aload_4 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label459
	aload_0 
	aload_4 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label459:
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label463:
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_5 
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 2
	if_icmpne Label475
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label475:
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpne Label498
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_4 
	aload_4 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label491
	aload_0 
	aload_4 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label491:
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label498:
	aload_0 
	aload_5 
	ldc literal_431:"non-void type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label1097
Label503:
	aload_2 
	bipush 3
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_6 
	aload_6 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label515
	aload_0 
	aload_6 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label515:
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_5 
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpne Label554
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label535
	aload_0 
	aload_4 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label535:
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label554:
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 2
	if_icmpne Label574
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label574:
	aload_0 
	aload_5 
	ldc literal_431:"non-void type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label1097
Label579:
	aload_2 
	bipush 4
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore 10
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_5 
	aload 10
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label592
	goto_w Label673
Label592:
	aload_2 
	bipush 3
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_6 
	aload_6 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label604
	aload_0 
	aload_6 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label604:
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpne Label645
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_4 
	aload_4 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label620
	aload_0 
	aload_4 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label620:
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload 10
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label645:
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 2
	if_icmpne Label668
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload 10
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label668:
	aload_0 
	aload_5 
	ldc literal_431:"non-void type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label1097
Label673:
	aload 10
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 2
	if_icmpeq Label678
	goto_w Label741
Label678:
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpne Label716
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_4 
	aload_4 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label694
	aload_0 
	aload_4 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label694:
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload 10
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label716:
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 2
	if_icmpne Label736
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload 10
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label736:
	aload_0 
	aload_5 
	ldc literal_431:"non-void type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label1097
Label741:
	aload_0 
	aload 10
	ldc literal_431:"non-void type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label1097
Label746:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label758
	aload_0 
	aload_4 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label758:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label770
	aload_0 
	aload_5 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label770:
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label780:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label792
	aload_0 
	aload_4 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label792:
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_6 
	aload_6 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpne Label828
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	iconst_1 
	if_icmpeq Label812
	aload_0 
	aload_5 
	ldc literal_430:"4 byte type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label812:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label828:
	aload_6 
	invokevirtual int getLocalCount( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 2
	if_icmpne Label845
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.subtractType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label845:
	aload_0 
	aload_6 
	ldc literal_431:"non-void type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label1097
Label850:
	aload_0 
	iconst_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
Label854:
	iinc 3 1
Label855:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label871
	aload_0 
	aload_4 
	aload 9
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label871:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label887
	aload_0 
	aload_5 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label887:
	aload_2 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label893:
	iinc 3 1
Label894:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getTypeFromEnd // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifeq Label905
	goto_w Label1097
Label905:
	aload_0 
	aload_5 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
	goto_w Label1097
Label912:
	iinc 3 1
Label913:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label929
	aload_0 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label929:
	aload_2 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label935:
	iinc 3 1
Label936:
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label952
	aload_0 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label952:
	aload_2 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label958:
	iinc 3 1
Label959:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label975
	aload_0 
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label975:
	aload_2 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label981:
	iinc 3 1
Label982:
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	bipush 2
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label998
	aload_0 
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	bipush 2
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label998:
	aload_2 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label1004:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label1020
	aload_0 
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label1020:
	aload_2 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	bipush 2
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label1097
Label1026:
	aload_2 
	bipush 2
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	bipush 2
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label1042
	aload_0 
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	bipush 2
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label1042:
	aload_2 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto Label1097
Label1048:
	iinc 3 1
Label1049:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label1065
	aload_0 
	aload_4 
	aload 9
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label1065:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label1081
	aload_0 
	aload_5 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label1081:
	aload_2 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto Label1097
Label1087:
	iinc 3 1
Label1088:
	aload_2 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	aaload 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto Label1097
Label1094:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionWalker.unexpectedInstruction // pc=2
Label1097:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.analysis.InstructionBranch ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aload_2 
	ifnonnull Label6
	goto_w Label72
Label6:
	iconst_1 
	istore_3 
	aload_1 
	invokevirtual int getOpcode( net.rim.tools.compiler.analysis.Instruction ) // pc=1
	istore_6 
	iload_6 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

Label13:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifne Label24
	aload_0 
	aload_4 
	ldc literal_427:"reference type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label24:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifne Label72
	aload_0 
	aload_5 
	ldc literal_427:"reference type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	return 
Label36:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label52
	aload_0 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label52:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label72
	aload_0 
	aload_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
	return 
Label69:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionWalker.unexpectedInstruction // pc=2
Label72:
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionStacker, module:net_rim_loader.class#15 ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aload_2 
	ifnull Label30
	aload_1 
	invokenonvirtual_lib .routine_18979 // pc=1
	istore_3 
	iload_3 
Label10:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label30
	aload_0 
	aload_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
	goto Label30
Label27:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionWalker.unexpectedInstruction // pc=2
Label30:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionStacker, module:net_rim_loader.class#12 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label16
	aload_1 
	invokenonvirtual_lib .routine_18979 // pc=1
	istore_2 
	iload_2 
Label8:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_18996 // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.walkNewArray // pc=2
	goto Label16
Label13:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionWalker.unexpectedInstruction // pc=2
Label16:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionStacker, module:net_rim_loader.class#16 ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aload_2 
	ifnull Label27
	aload_1 
	invokenonvirtual_lib .routine_18979 // pc=1
	istore_3 
	iload_3 
Label10:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label16
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	bipush 2
	aaload 
	goto Label19
Label16:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	aaload 
Label19:
	astore_4 
	aload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto Label27
Label24:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionWalker.unexpectedInstruction // pc=2
Label27:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionStacker, module:net_rim_loader.class#17 ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aload_2 
	ifnonnull Label6
	goto_w Label297
Label6:
	iconst_1 
	istore_3 
	aload_1 
	invokenonvirtual_lib .routine_18979 // pc=1
	istore_5 
	aload_1 
	invokenonvirtual_lib .routine_24053 // pc=1
	astore_6 
	aload_6 
	invokevirtual net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	astore_7 
	iload_5 
Label19:
	iinc 3 1
Label20:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_7 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label32
	aload_0 
	aload_4 
	aload_7 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label32:
	aload_0 
	iconst_1 
	aload_1 
	invokenonvirtual_lib .routine_24042 // pc=1
	aload_6 
	aconst_null 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.checkAccess // pc=5
	ifeq Label41
	goto_w Label297
Label41:
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
	goto_w Label297
Label44:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16143 // pc=1
	ifne Label51
	aload_0 
	aload_7 
	ldc literal_429:"void type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label51:
	aload_7 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16161 // pc=1
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifeq Label57
	goto_w Label297
Label57:
	aload_0 
	aload_7 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_16161 // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
	goto_w Label297
Label63:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_6 
	invokevirtual module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label79
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
	aload_0 
	aload_4 
	aload_6 
	invokevirtual module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label79:
	aload_4 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getNullType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label86
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
Label86:
	aload_4 
	checkcastbranch_lib 
	astore 8
	aload_0 
	iconst_0 
	aload_1 
	invokenonvirtual_lib .routine_24042 // pc=1
	aload_6 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.checkAccess // pc=5
	ifne Label99
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
Label99:
	aload_2 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label297
Label103:
	aload_0 
	iconst_0 
	aload_1 
	invokenonvirtual_lib .routine_24042 // pc=1
	aload_6 
	aconst_null 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.checkAccess // pc=5
	ifne Label113
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
Label113:
	aload_2 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label297
Label117:
	aload_2 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getType // pc=2
	astore_4 
	aload_4 
	aload_6 
	invokevirtual module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label133
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
	aload_0 
	aload_4 
	aload_6 
	invokevirtual module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label133:
	aload_4 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getNullType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label140
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
Label140:
	aload_2 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto_w Label297
Label144:
	iinc 3 1
Label145:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_4 
	aload_7 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label157
	aload_0 
	aload_4 
	aload_7 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label157:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_4 
	aload_6 
	invokevirtual module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	astore 8
	aload_4 
	aload 8
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label202
	iconst_0 
	istore 9
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush 16
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label194
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_19303 // pc=1
	astore 10
	aload_4 
	checkcastbranch_lib 
	astore 11
	aload 11
	invokenonvirtual_lib .routine_9101 // pc=1
	ifne Label194
	aload 11
	invokenonvirtual_lib .routine_9090 // pc=1
	aload 10
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label194
	aload 10
	aload 8
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label194
	iconst_1 
	istore 9
Label194:
	iload 9
	ifne Label202
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
	aload_0 
	aload_4 
	aload 8
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label202:
	aload_4 
	checkcastbranch_lib 
	astore 9
	aload_0 
	iconst_1 
	aload_1 
	invokenonvirtual_lib .routine_24042 // pc=1
	aload_6 
	aload 9
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.checkAccess // pc=5
	ifne Label215
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
Label215:
	aload_4 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual net.rim.tools.compiler.types.Type getNullType( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label221
	goto_w Label297
Label221:
	aload_1 
	invokenonvirtual_lib .routine_24005 // pc=1
	goto_w Label297
Label224:
	aload_2 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getType // pc=2
	astore_4 
	aload_4 
	aload_7 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label236
	aload_0 
	aload_4 
	aload_7 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label236:
	aload_2 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.getType // pc=2
	astore_4 
	aload_4 
	aload_6 
	invokevirtual module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label250
	aload_0 
	aload_4 
	aload_6 
	invokevirtual module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label250:
	aload_2 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.clearOperands // pc=1
	goto Label297
Label253:
	aload_0 
	aload_1 
	aload_6 
	checkcast_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.walkJumpMethod // pc=3
	goto Label297
Label259:
	aload_0 
	aload_1 
	aload_6 
	checkcast_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.walkInvokeMethod // pc=3
	goto Label297
Label265:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionWalker.unexpectedInstruction // pc=2
	goto Label297
	astore 8
	aload_6 
	instanceof_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	ifeq Label285
	aload 8
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_432:"invoking "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	checkcast_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	invokenonvirtual_lib .routine_16530 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib .routine_30532 // pc=2
	goto Label295
Label285:
	aload 8
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_433:"accessing "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.NameAndType ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib .routine_30532 // pc=2
Label295:
	aload 8
	athrow 
Label297:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.analysis.InstructionString ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aload_2 
	ifnull Label18
	aload_1 
	invokenonvirtual_lib .routine_18979 // pc=1
	istore_3 
	iload_3 
Label10:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual module:net_rim_loader-2.class#4 getStringClass( net.rim.tools.compiler.Compiler ) // pc=1
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto Label18
Label15:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionWalker.unexpectedInstruction // pc=2
Label18:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.analysis.InstructionStringArray ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aload_2 
	ifnull Label19
	aload_1 
	invokenonvirtual_lib .routine_18979 // pc=1
	istore_3 
	iload_3 
Label10:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual module:net_rim_loader-2.class#4 getStringClass( net.rim.tools.compiler.Compiler ) // pc=1
	invokenonvirtual_lib .routine_25425 // pc=1
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto Label19
Label16:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionWalker.unexpectedInstruction // pc=2
Label19:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final walkInstruction( net.rim.tools.compiler.analysis.InstructionStacker, net.rim.tools.compiler.analysis.InstructionType ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aload_2 
	ifnonnull Label6
	goto_w Label82
Label6:
	aload_1 
	invokenonvirtual_lib .routine_18979 // pc=1
	istore_4 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionType.getType // pc=1
	astore_5 
	aload_1 
	invokenonvirtual_lib .routine_18996 // pc=1
	istore_6 
	iload_4 
Label17:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	astore_5 
Label21:
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_3 
	aload_3 
	instanceof_lib net.rim.tools.compiler.types.ReferenceType//net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType net.rim.tools.compiler.types.ReferenceType
	ifne Label32
	aload_0 
	aload_3 
	ldc literal_427:"reference type"
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyError // pc=3
Label32:
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto Label82
Label36:
	aload_2 
	new_lib net.rim.tools.compiler.types.ClassUninitializedType//module:net_rim_loader-2.class#5 module:net_rim_loader-2.class#5 module:net_rim_loader-2.class#5
	dup 
	aload_5 
	checkcast_lib net.rim.tools.compiler.types.ClassType//module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4 module:net_rim_loader-2.class#4
	aload_1 
	invokenonvirtual_lib .routine_18996 // pc=1
	invokespecial_lib .routine_9416 // pc=3
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto Label82
Label46:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual module:net_rim_loader-2.class#4 getClassClass( net.rim.tools.compiler.Compiler ) // pc=1
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto Label82
Label51:
	iconst_1 
	istore_6 
Label53:
	iload_6 
	istore_7 
Label55:
	iload_7 
	ifle Label75
	aload_2 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.consumeTypeFromEnd // pc=2
	astore_3 
	aload_3 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ifne Label73
	aload_0 
	aload_3 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aaload 
	invokespecial net.rim.tools.compiler.analysis.InstructionStacker.verifyStkTypeError // pc=3
Label73:
	iinc 7 -1
	goto Label55
Label75:
	aload_2 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionStackEntry.addType // pc=2
	goto Label82
Label79:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionWalker.unexpectedInstruction // pc=2
Label82:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

}
