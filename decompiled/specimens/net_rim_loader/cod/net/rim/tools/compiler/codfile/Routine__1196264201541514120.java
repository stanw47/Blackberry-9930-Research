// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 37
// ########################################################


package net.rim.tools.compiler.codfile;


public class Routine extends net.rim.tools.compiler.codfile.Member

{

	// @@@@@@@@@@@@@ Fields 
	protected int /*int*/  _parmLocalCount ; // ofs = 12178 addr = 0)
	protected net.rim.tools.compiler.codfile.TypeList /*net.rim.tools.compiler.codfile.TypeList*/  _protoTypeList ; // ofs = 12182 addr = 0)
	private net.rim.tools.compiler.codfile.FixupTableEntry /*module:net_rim_loader-1.class#65*/  _fixups ; // ofs = 12186 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _specialFixups ; // ofs = 12190 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _vFixupList ; // ofs = 12194 addr = 0)
	private net.rim.tools.compiler.codfile.FixupTableEntry /*module:net_rim_loader-1.class#65*/  _staticFixups ; // ofs = 12198 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _specificFixups ; // ofs = 12202 addr = 0)
	private net.rim.tools.compiler.codfile.RoutineRef /*net.rim.tools.compiler.codfile.RoutineRef*/  _fixupRef ; // ofs = 12206 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.Routine ); // address: 0
	{
	jumpspecial_lib .routine_37224(  )
	}


public <init>( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#66, net.rim.tools.compiler.codfile.TypeList, net.rim.tools.compiler.codfile.TypeList ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial_lib .routine_37242 // pc=4
	aload_0 
	aload_4 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.getLocalCount // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


public <init>( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.codfile.ClassDef, int ); // address: 0
	{
	jumpspecial_lib .routine_37271(  )
	}

	// @@@@@@@@@@@@@ Virtual routines 

final makeSymbolic( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57, boolean, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label19
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_28006 // pc=1
	aload_3 
	invokenonvirtual_lib .routine_26740 // pc=2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_28017 // pc=1
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeLists.getTypeList // pc=4
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label19:
	aload_1 
	invokenonvirtual_lib .routine_29035 // pc=1
	ifne Label24
	iload_2 
	ifeq Label32
Label24:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_28017 // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeLists.getTypeList // pc=4
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label32:
	return 
	}


public makeSymbolic( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57, boolean ); // address: 0
	{
	noenter_return 
	}


protected net.rim.tools.compiler.codfile.MemberRef getFixupRef( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57 ); // address: 0
	{
	enter 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnonnull Label15
	aload_0 
	new RoutineRef
	dup 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual module:net_rim_loader-1.class#26 getClassRef( net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#57 ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokespecial net.rim.tools.compiler.codfile.RoutineRef.<init> // pc=6
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
Label15:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	areturn 
	}


protected net.rim.tools.compiler.codfile.MemberRef getFixupRef( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_acmpne Label9
	aload_0 
	aload_1 
	invokevirtual net.rim.tools.compiler.codfile.MemberRef getFixupRef( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57 ) // pc=2
	astore_4 
	goto_w Label79
Label9:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	astore_5 
	iload_3 
	ifeq Label68
	aload_5 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.length // pc=1
	istore_6 
	iload_6 
	ifle Label68
	aload_5 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.getTypeItem // pc=2
	astore_7 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeItem.getId // pc=1
	bipush 7
	if_icmpne Label68
	aload_7 
	new TypeItem
	dup 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label68
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	iload_6 
	invokespecial_lib java.util.Vector.<init> // pc=2
	astore 8
	aload 8
	new TypeItem
	dup 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.TypeItem.<init> // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iconst_1 
	istore 9
Label46:
	iload 9
	iload_6 
	if_icmpge Label56
	aload 8
	aload_5 
	iload 9
	invokenonvirtual net.rim.tools.compiler.codfile.TypeList.getTypeItem // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 9 1
	goto Label46
Label56:
	new TypeList
	dup 
	aload 8
	invokespecial net.rim.tools.compiler.codfile.TypeList.<init> // pc=2
	astore_5 
	aload_1 
	invokenonvirtual_lib .routine_28017 // pc=1
	aload_5 
	aload_1 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeLists.getTypeList // pc=4
	astore_5 
Label68:
	new RoutineRef
	dup 
	aload_2 
	aload_2 
	aload_1 
	invokevirtual module:net_rim_loader-1.class#26 getClassRef( net.rim.tools.compiler.codfile.ClassDef, module:net_rim_loader-1.class#57 ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_5 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokespecial net.rim.tools.compiler.codfile.RoutineRef.<init> // pc=6
	astore_4 
Label79:
	aload_4 
	areturn 
	}


protected module:net_rim_loader-1.class#65 addFixupList( net.rim.tools.compiler.codfile.Routine, java.util.Vector, module:net_rim_loader-1.class#57, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	aconst_null 
	astore_6 
	iconst_0 
	istore_7 
Label8:
	iload_7 
	iload_5 
	if_icmpge Label29
	aload_1 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.codfile.FixupTableEntry//module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65
	astore 8
	aload 8
	invokenonvirtual_lib .routine_31259 // pc=1
	checkcast_lib net.rim.tools.compiler.codfile.MemberRef//net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef
	astore 9
	aload 9
	invokevirtual net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.codfile.MemberRef ) // pc=1
	aload_3 
	if_acmpne Label27
	aload 8
	astore_6 
	goto Label29
Label27:
	iinc 7 1
	goto Label8
Label29:
	aload_6 
	ifnonnull Label52
	aload_0 
	aload_2 
	iconst_0 
	invokevirtual makeSymbolic( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57, boolean ) // pc=3
	new_lib net.rim.tools.compiler.codfile.FixupTableEntry//module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65
	dup 
	bipush 2
	invokespecial_lib .routine_31542 // pc=2
	astore_6 
	aload_0 
	aload_2 
	aload_3 
	iload_4 
	invokevirtual net.rim.tools.compiler.codfile.MemberRef getFixupRef( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57, net.rim.tools.compiler.codfile.ClassDef, boolean ) // pc=4
	astore_7 
	aload_6 
	aload_7 
	invokenonvirtual_lib .routine_31270 // pc=2
	aload_1 
	aload_6 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label52:
	aload_6 
	areturn 
	}


protected addVirtualFixup( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	astore_3 
	aload_3 
	ifnull Label25
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnonnull Label13
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
Label13:
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_3 
	checkcast_lib net.rim.tools.compiler.codfile.DataSection//module:net_rim_loader-1.class#57 module:net_rim_loader-1.class#57 module:net_rim_loader-1.class#57
	aload_2 
	iconst_0 
	invokevirtual module:net_rim_loader-1.class#65 addFixupList( net.rim.tools.compiler.codfile.Routine, java.util.Vector, module:net_rim_loader-1.class#57, net.rim.tools.compiler.codfile.ClassDef, boolean ) // pc=5
	astore_4 
	aload_4 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	invokenonvirtual_lib .routine_31297 // pc=2
Label25:
	return 
	}


protected int addStaticFixup( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	astore_3 
	bipush -1
	istore_4 
	aconst_null 
	astore_5 
	aload_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_acmpne Label47
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	astore_5 
	aload_3 
	ifnull Label41
	aload_5 
	ifnonnull Label37
	aload_3 
	checkcast_lib net.rim.tools.compiler.codfile.DataSection//module:net_rim_loader-1.class#57 module:net_rim_loader-1.class#57 module:net_rim_loader-1.class#57
	astore_6 
	aload_0 
	aload_6 
	iconst_0 
	invokevirtual makeSymbolic( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57, boolean ) // pc=3
	aload_0 
	new_lib net.rim.tools.compiler.codfile.FixupTableEntry//module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65
	dup 
	bipush 2
	invokespecial_lib .routine_31542 // pc=2
	dup_x1 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	astore_5 
	aload_5 
	aload_0 
	aload_6 
	invokevirtual net.rim.tools.compiler.codfile.MemberRef getFixupRef( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57 ) // pc=2
	invokenonvirtual_lib .routine_31270 // pc=2
Label37:
	aload_5 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	invokenonvirtual_lib .routine_31297 // pc=2
Label41:
	aload_5 
	ifnull Label68
	aload_5 
	invokenonvirtual_lib .routine_22976 // pc=1
	istore_4 
	goto Label68
Label47:
	aload_3 
	ifnull Label68
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnonnull Label56
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label56:
	aload_0 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_3 
	checkcast_lib net.rim.tools.compiler.codfile.DataSection//module:net_rim_loader-1.class#57 module:net_rim_loader-1.class#57 module:net_rim_loader-1.class#57
	aload_2 
	iconst_0 
	invokevirtual module:net_rim_loader-1.class#65 addFixupList( net.rim.tools.compiler.codfile.Routine, java.util.Vector, module:net_rim_loader-1.class#57, net.rim.tools.compiler.codfile.ClassDef, boolean ) // pc=5
	astore_5 
	aload_5 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	invokenonvirtual_lib .routine_31297 // pc=2
Label68:
	iload_4 
	ireturn 
	}


protected int addFixup( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	astore_3 
	bipush -1
	istore_4 
	aconst_null 
	astore_5 
	aload_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_acmpne Label47
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore_5 
	aload_3 
	ifnull Label41
	aload_5 
	ifnonnull Label37
	aload_3 
	checkcast_lib net.rim.tools.compiler.codfile.DataSection//module:net_rim_loader-1.class#57 module:net_rim_loader-1.class#57 module:net_rim_loader-1.class#57
	astore_6 
	aload_0 
	aload_6 
	iconst_0 
	invokevirtual makeSymbolic( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57, boolean ) // pc=3
	aload_0 
	new_lib net.rim.tools.compiler.codfile.FixupTableEntry//module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65
	dup 
	bipush 2
	invokespecial_lib .routine_31542 // pc=2
	dup_x1 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore_5 
	aload_5 
	aload_0 
	aload_6 
	invokevirtual net.rim.tools.compiler.codfile.MemberRef getFixupRef( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57 ) // pc=2
	invokenonvirtual_lib .routine_31270 // pc=2
Label37:
	aload_5 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	invokenonvirtual_lib .routine_31297 // pc=2
Label41:
	aload_5 
	ifnull Label68
	aload_5 
	invokenonvirtual_lib .routine_22976 // pc=1
	istore_4 
	goto Label68
Label47:
	aload_3 
	ifnull Label68
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label56
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
Label56:
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_3 
	checkcast_lib net.rim.tools.compiler.codfile.DataSection//module:net_rim_loader-1.class#57 module:net_rim_loader-1.class#57 module:net_rim_loader-1.class#57
	aload_2 
	iconst_1 
	invokevirtual module:net_rim_loader-1.class#65 addFixupList( net.rim.tools.compiler.codfile.Routine, java.util.Vector, module:net_rim_loader-1.class#57, net.rim.tools.compiler.codfile.ClassDef, boolean ) // pc=5
	astore_5 
	aload_5 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	invokenonvirtual_lib .routine_31297 // pc=2
Label68:
	iload_4 
	ireturn 
	}


public writeMemberAddress( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	istore_4 
	iload_3 
	ifeq Label7
	bipush -1
	istore_4 
Label7:
	iload_4 
	bipush -1
	if_icmpne Label14
	aload_0 
	aload_1 
	aload_2 
	invokevirtual addVirtualFixup( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ) // pc=3
Label14:
	aload_1 
	iload_4 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public writeOffset( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.io.StructuredOutputStream, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib .routine_22798 // pc=2
	return 
	}


public int getVTableOffset( net.rim.tools.compiler.codfile.Routine, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	istore_2 
	iload_1 
	ifeq Label7
	bipush -1
	istore_2 
Label7:
	iload_2 
	ireturn 
	}


public writeFixups( net.rim.tools.compiler.codfile.Routine, module:net_rim_loader-1.class#57 ); // address: 0
	{
	enter 
	iconst_1 
	istore_2 
	iconst_0 
	istore_2 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label10
	aload_1 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokenonvirtual_lib .routine_28521 // pc=2
Label10:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label32
	iconst_0 
	istore_2 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label19:
	iload_4 
	iload_3 
	if_icmpge Label32
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.codfile.FixupTableEntry//module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65
	astore_5 
	aload_1 
	aload_5 
	invokenonvirtual_lib .routine_28521 // pc=2
	iinc 4 1
	goto Label19
Label32:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label52
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label39:
	iload_4 
	iload_3 
	if_icmpge Label52
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.codfile.FixupTableEntry//module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65
	astore_5 
	aload_1 
	aload_5 
	invokenonvirtual_lib .routine_28801 // pc=2
	iinc 4 1
	goto Label39
Label52:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnull Label58
	aload_1 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_2 
	invokenonvirtual_lib .routine_28664 // pc=3
Label58:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label81
	iconst_0 
	istore_2 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label67:
	iload_4 
	iload_3 
	if_icmpge Label81
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.codfile.FixupTableEntry//module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65 module:net_rim_loader-1.class#65
	astore_5 
	aload_1 
	aload_5 
	iload_2 
	invokenonvirtual_lib .routine_28664 // pc=3
	iinc 4 1
	goto Label67
Label81:
	return 
	}


public net.rim.tools.compiler.codfile.TypeList getProtoTypeList( net.rim.tools.compiler.codfile.Routine ); // address: 0
	{
	areturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public int getLocalCount( net.rim.tools.compiler.codfile.Routine ); // address: 0
	{
	ireturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}

}
