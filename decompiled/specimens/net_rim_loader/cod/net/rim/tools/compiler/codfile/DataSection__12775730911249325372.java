// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 57
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class DataSection extends net.rim.tools.compiler.codfile.CodfileItem

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.Codfile /*net.rim.tools.compiler.codfile.Codfile*/  _codfile ; // ofs = 20190 addr = 0)
	private int /*int*/  _attributes ; // ofs = 20194 addr = 0)
	private int /*int*/  _version ; // ofs = 20198 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _modules ; // ofs = 20202 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _siblings ; // ofs = 20206 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _aliases ; // ofs = 20210 addr = 0)
	private int /*int*/  _icallIndex ; // ofs = 20214 addr = 0)
	private int /*int*/  _staticSize ; // ofs = 20218 addr = 0)
	private net.rim.tools.compiler.codfile.Module /*net.rim.tools.compiler.codfile.Module*/  _nullModule ; // ofs = 20222 addr = 0)
	private net.rim.tools.compiler.codfile.ClassDef /*net.rim.tools.compiler.codfile.ClassDef*/  _nullClassDef ; // ofs = 20226 addr = 0)
	private net.rim.tools.compiler.codfile.ClassRef /*net.rim.tools.compiler.codfile.ClassRef*/  _nullClassRef ; // ofs = 20230 addr = 0)
	private net.rim.tools.compiler.codfile.Routine /*net.rim.tools.compiler.codfile.Routine*/  _nullRoutine ; // ofs = 20234 addr = 0)
	private net.rim.tools.compiler.codfile.InterfaceMethodRef /*net.rim.tools.compiler.codfile.InterfaceMethodRef*/  _nullInterfaceMethodRef ; // ofs = 20238 addr = 0)
	private net.rim.tools.compiler.codfile.EntryPoint /*net.rim.tools.compiler.codfile.EntryPoint*/  _entryPoint ; // ofs = 20242 addr = 0)
	private net.rim.tools.compiler.codfile.EntryPoint /*net.rim.tools.compiler.codfile.EntryPoint*/  _alternateEntryPoint ; // ofs = 20246 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _exports ; // ofs = 20250 addr = 0)
	private net.rim.tools.compiler.codfile.DataBytes /*net.rim.tools.compiler.codfile.DataBytes*/  _dataBytes ; // ofs = 20254 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _initializedStaticData ; // ofs = 20258 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _initializedStaticDataString ; // ofs = 20262 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _classDefs ; // ofs = 20266 addr = 0)
	private int /*int*/  _classDefsOffset2 ; // ofs = 20270 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _classRefs ; // ofs = 20274 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _interfaceMethodRefs ; // ofs = 20278 addr = 0)
	private net.rim.tools.compiler.codfile.TypeLists /*module:net_rim_loader-2.class#52*/  _typeLists ; // ofs = 20282 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _methodFixupTable ; // ofs = 20286 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _staticMethodFixupTable ; // ofs = 20290 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _vcallMethodFixupTable ; // ofs = 20294 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _classDefCodeFixupTable ; // ofs = 20298 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _fieldFixupTable ; // ofs = 20302 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _fieldLocalFixupTable ; // ofs = 20306 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _staticFieldFixupTable ; // ofs = 20310 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileVector /*net.rim.tools.compiler.codfile.CodfileVector*/  _moduleCodeFixupTable ; // ofs = 20314 addr = 0)
	private boolean /*boolean*/  _implied_staticMethod_fixups ; // ofs = 20318 addr = 0)
	private boolean /*boolean*/  _implied_staticfield_fixups ; // ofs = 20322 addr = 0)
	private boolean /*boolean*/  _implied_method_fixups ; // ofs = 20326 addr = 0)
	private boolean /*boolean*/  _implied_clsref_fixups ; // ofs = 20330 addr = 0)
	private boolean /*boolean*/  _fixups_have_rettype ; // ofs = 20334 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.Codfile ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new CodfileVector
	dup 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	new CodfileVector
	dup 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=2
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	new CodfileVector
	dup 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=1
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0 
	new DataBytes
	dup 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.DataBytes.<init> // pc=2
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=2
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0 
	new_lib net.rim.tools.compiler.codfile.TypeLists//module:net_rim_loader-2.class#52 module:net_rim_loader-2.class#52 module:net_rim_loader-2.class#52
	dup 
	invokespecial_lib .routine_29558 // pc=1
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=2
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	new CodfileVector
	dup 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=1
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0 
	new CodfileVector
	dup 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=1
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	putfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	putfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	putfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	putfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	putfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_0 
	iconst_0 
	putfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	aload_0 
	iconst_1 
	putfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload_0 
	iconst_1 
	putfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	aload_0 
	iconst_1 
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	aload_0 
	iconst_1 
	putfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	aload_0 
	new CodfileVector
	dup 
	bipush 2
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	putfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getNullIdentifier // pc=1
	astore_2 
	aload_0 
	new ClassDefNull
	dup 
	aload_0 
	aload_2 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.ClassDefNull.<init> // pc=4
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	new_lib net.rim.tools.compiler.codfile.ModuleNull//module:net_rim_loader.class#28 module:net_rim_loader.class#28 module:net_rim_loader.class#28
	dup 
	aload_0 
	invokespecial_lib .routine_38205 // pc=2
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual setModule( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Module ) // pc=2
	aload_0 
	new ClassRef
	dup 
	aload_0 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokespecial net.rim.tools.compiler.codfile.ClassRef.<init> // pc=3
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	new_lib net.rim.tools.compiler.codfile.RoutineNull//module:net_rim_loader-2.class#41 module:net_rim_loader-2.class#41 module:net_rim_loader-2.class#41
	dup 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	invokespecial_lib .routine_22929 // pc=3
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	new InterfaceMethodRef
	dup 
	aload_0 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokespecial net.rim.tools.compiler.codfile.InterfaceMethodRef.<init> // pc=3
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	bipush 6
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 6
	if_icmplt Label193
	aload_0 
	iconst_1 
	putfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	aload_0 
	iconst_0 
	putfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload_0 
	iconst_0 
	putfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	aload_0 
	iconst_0 
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	aload_0 
	iconst_0 
	putfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
Label193:
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final setRoutineFixupFormat( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.CodfileVector ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual routine
	istore_2 
	iconst_0 
	istore_3 
Label6:
	iload_3 
	iload_2 
	if_icmpge Label23
	aload_1 
	iload_3 
	invokevirtual routine
	checkcast FixupTableEntry
	astore_4 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.getRef // pc=1
	checkcast_lib net.rim.tools.compiler.codfile.RoutineRef//net.rim.tools.compiler.codfile.RoutineRef net.rim.tools.compiler.codfile.RoutineRef net.rim.tools.compiler.codfile.RoutineRef
	astore_5 
	aload_5 
	aload_0 
	invokevirtual setWriteRet( net.rim.tools.compiler.codfile.RoutineRef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	iinc 3 1
	goto Label6
Label23:
	return 
	}


private final mergeFixups( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileVector ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual routine
	istore_3 
	iconst_0 
	istore_4 
Label6:
	iload_4 
	iload_3 
	if_icmpge Label20
	aload_1 
	iload_4 
	invokevirtual routine
	checkcast FixupTableEntry
	astore_5 
	aload_2 
	aload_5 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	iinc 4 1
	goto Label6
Label20:
	aload_1 
	iconst_0 
	invokevirtual routine
	return 
	}


private final setMemberFixupOrdinals( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.CodfileVector ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual routine
	istore_2 
	iconst_0 
	istore_3 
Label6:
	iload_3 
	iload_2 
	if_icmpge Label19
	aload_1 
	iload_3 
	invokevirtual routine
	checkcast FixupTableEntry
	astore_4 
	aload_4 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOrdinal // pc=2
	iinc 3 1
	goto Label6
Label19:
	return 
	}


private final boolean findDupeSignatures( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.MemberRef, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual routine
	istore_4 
	aload_2 
	invokevirtual net.rim.tools.compiler.codfile.Identifier getName( net.rim.tools.compiler.codfile.MemberRef ) // pc=1
	ldc literal_359:"<init>"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label11
	iconst_0 
	ireturn 
Label11:
	iconst_0 
	istore_5 
Label13:
	iload_5 
	iload_4 
	if_icmpge Label34
	aload_1 
	iload_5 
	invokevirtual routine
	checkcast FixupTableEntry
	astore_6 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.getRef // pc=1
	checkcast_lib net.rim.tools.compiler.codfile.MemberRef//net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef
	astore_7 
	aload_2 
	aload_7 
	iload_3 
	invokevirtual boolean compareSignatures( net.rim.tools.compiler.codfile.MemberRef, net.rim.tools.compiler.codfile.MemberRef, boolean ) // pc=3
	ifeq Label32
	iconst_1 
	ireturn 
Label32:
	iinc 5 1
	goto Label13
Label34:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final assignClassRefOrdinals( net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokevirtual routine
	istore_1 
	iconst_0 
	istore_2 
Label6:
	iload_2 
	iload_1 
	if_icmpge Label19
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iload_2 
	invokevirtual routine
	checkcast ClassRef
	astore_3 
	aload_3 
	iload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOrdinal // pc=2
	iinc 2 1
	goto Label6
Label19:
	return 
	}


public final harvestRoutines( net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual routine
	checkcast_lib net.rim.tools.compiler.codfile.ModuleLocal//module:net_rim_loader.class#27 module:net_rim_loader.class#27 module:net_rim_loader.class#27
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_38115 // pc=1
	return 
	}


public final writeAttributes( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final write( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.writeAttributes // pc=2
	aload_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual routine
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokevirtual routine
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_1 
	invokevirtual writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.EntryPoint.write // pc=2
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.EntryPoint.write // pc=2
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_1 
	invokevirtual writeOffsets( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual routine
	istore_2 
	iconst_0 
	istore_3 
Label89:
	iload_3 
	iload_2 
	if_icmpge Label102
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_3 
	invokevirtual routine
	checkcast_lib net.rim.tools.compiler.codfile.Module//net.rim.tools.compiler.codfile.Module net.rim.tools.compiler.codfile.Module net.rim.tools.compiler.codfile.Module
	astore_4 
	aload_4 
	aload_1 
	invokevirtual writeVersion( net.rim.tools.compiler.codfile.Module, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	iinc 3 1
	goto Label89
Label102:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual writeOffsets( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	invokevirtual writeOffsets( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.write // pc=2
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	ifnull Label125
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_1 
	iconst_0 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
Label125:
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_1 
	invokenonvirtual_lib .routine_29388 // pc=2
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	ifnull Label174
	iconst_0 
	istore_3 
Label145:
	iload_3 
	iload_2 
	if_icmpge Label155
	aload_0 
	iload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getModule // pc=2
	aload_0 
	invokevirtual writeFixups( net.rim.tools.compiler.codfile.Module, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	iinc 3 1
	goto Label145
Label155:
	aload_0_getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	ifeq Label163
	aload_0_getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	ifeq Label163
	aload_0 
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	invokespecial net.rim.tools.compiler.codfile.DataSection.mergeFixups // pc=3
Label163:
	aload_0_getfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	ifeq Label174
	aload_0 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	invokespecial net.rim.tools.compiler.codfile.DataSection.setRoutineFixupFormat // pc=2
	aload_0 
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokespecial net.rim.tools.compiler.codfile.DataSection.setRoutineFixupFormat // pc=2
	aload_0 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	invokespecial net.rim.tools.compiler.codfile.DataSection.setRoutineFixupFormat // pc=2
Label174:
	aload_0_getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	ifeq Label179
	aload_0 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	invokespecial net.rim.tools.compiler.codfile.DataSection.setMemberFixupOrdinals // pc=2
Label179:
	aload_0_getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	ifeq Label184
	aload_0 
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokespecial net.rim.tools.compiler.codfile.DataSection.setMemberFixupOrdinals // pc=2
Label184:
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	ifeq Label189
	aload_0 
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	invokespecial net.rim.tools.compiler.codfile.DataSection.setMemberFixupOrdinals // pc=2
Label189:
	aload_0_getfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	ifeq Label194
	aload_0 
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	invokespecial net.rim.tools.compiler.codfile.DataSection.setMemberFixupOrdinals // pc=2
Label194:
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_1 
	iconst_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	aload_1 
	bipush 4
	invokevirtual int writeSlack( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	pop 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}


public final setAttributes( net.rim.tools.compiler.codfile.DataSection, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	ior 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


public final boolean getImpliedClsrefFixups( net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	ireturn_field .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	}


public final net.rim.tools.compiler.codfile.Module getNullModule( net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	areturn_field .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	}


public final net.rim.tools.compiler.codfile.Module getModule( net.rim.tools.compiler.codfile.DataSection, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	sipush 255
	if_icmpne Label6
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	areturn 
Label6:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_1 
	invokevirtual routine
	checkcast_lib net.rim.tools.compiler.codfile.Module//net.rim.tools.compiler.codfile.Module net.rim.tools.compiler.codfile.Module net.rim.tools.compiler.codfile.Module
	areturn 
	}


public final net.rim.tools.compiler.codfile.Module getModule( net.rim.tools.compiler.codfile.DataSection, java.lang.String, java.lang.String, int, boolean ); // address: 0
	{
	enter 
	aload_1 
	stringlength 
	sipush 128
	if_icmplt Label10
	aload_1 
	iconst_0 
	bipush 127
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_1 
Label10:
	aload_2 
	ifnull Label21
	aload_2 
	stringlength 
	sipush 128
	if_icmplt Label21
	aload_2 
	iconst_0 
	bipush 127
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_2 
Label21:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual routine
	istore_5 
	iload_5 
	sipush 255
	if_icmpne Label38
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_363:"invalid module index used: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.lang.IndexOutOfBoundsException.<init> // pc=2
	athrow 
Label38:
	aconst_null 
	astore_6 
	iload_5 
	ifne Label53
	new_lib net.rim.tools.compiler.codfile.ModuleLocal//module:net_rim_loader.class#27 module:net_rim_loader.class#27 module:net_rim_loader.class#27
	dup 
	aload_0 
	aload_1 
	aload_2 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual net.rim.tools.compiler.codfile.Codfile.getRoutines // pc=1
	invokespecial_lib .routine_38175 // pc=6
	astore_6 
	goto Label70
Label53:
	iload_4 
	ifeq Label63
	new ModuleDomestic
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial net.rim.tools.compiler.codfile.ModuleDomestic.<init> // pc=4
	astore_6 
	goto Label70
Label63:
	new_lib net.rim.tools.compiler.codfile.ModuleForeign//module:net_rim_loader.class#26 module:net_rim_loader.class#26 module:net_rim_loader.class#26
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial_lib .routine_38033 // pc=4
	astore_6 
Label70:
	aload_6 
	iload_5 
	invokevirtual setOrdinal( net.rim.tools.compiler.codfile.CodfileItem, int ) // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_6 
	invokevirtual routine
	aload_6 
	areturn 
	}


public final addSibling( net.rim.tools.compiler.codfile.DataSection, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	stringlength 
	sipush 128
	if_icmplt Label10
	aload_1 
	iconst_0 
	bipush 127
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_1 
Label10:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	iconst_0 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getLiteral // pc=4
	astore_2 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_2 
	invokevirtual routine
	return 
	}


public final net.rim.tools.compiler.codfile.DataBytes getDataBytes( net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	areturn_field .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	}


public final module:net_rim_loader-2.class#52 getTypeLists( net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	areturn_field .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	}


public final addInitializedStaticData( net.rim.tools.compiler.codfile.DataSection, int, long, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	new InitializedStaticData
	dup 
	iload_1 
	lload 2
	l2i 
	invokespecial net.rim.tools.compiler.codfile.InitializedStaticData.<init> // pc=3
	invokevirtual routine
	iload_4 
	iconst_1 
	if_icmple Label24
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	new InitializedStaticData
	dup 
	iload_1 
	iconst_1 
	iadd 
	lload 2
	bipush 32
	lshr 
	l2i 
	invokespecial net.rim.tools.compiler.codfile.InitializedStaticData.<init> // pc=3
	invokevirtual routine
Label24:
	return 
	}


public final addInitializedStaticDataString( net.rim.tools.compiler.codfile.DataSection, int, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	astore_4 
	aload_4 
	ifnonnull Label20
	new CodfileVector
	dup 
	bipush 2
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=2
	astore_4 
	aload_4 
	new InitializedStaticData
	dup 
	bipush -1
	bipush -1
	invokespecial net.rim.tools.compiler.codfile.InitializedStaticData.<init> // pc=3
	invokevirtual routine
	aload_0 
	aload_4 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
Label20:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	iload_3 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getLiteral // pc=4
	astore_5 
	aload_4 
	new InitializedStaticData
	dup 
	iload_1 
	aload_5 
	invokespecial net.rim.tools.compiler.codfile.InitializedStaticData.<init> // pc=3
	invokevirtual routine
	return 
	}


public final addExport( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.ExportedData ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_1 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	return 
	}


public final setEntryRoutine( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.ClassDef, java.lang.String, module:net_rim_loader-2.class#51 ); // address: 0
	{
	enter 
	aconst_null 
	astore_4 
	aload_2 
	ifnonnull Label9
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getNullIdentifier // pc=1
	astore_4 
	goto Label13
Label9:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	astore_4 
Label13:
	aload_3 
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	invokenonvirtual_lib .routine_29420 // pc=1
	if_acmpeq Label23
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_3 
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_29492 // pc=4
	astore_3 
Label23:
	aload_0 
	new EntryPoint
	dup 
	aload_1 
	aload_0 
	invokevirtual net.rim.tools.compiler.codfile.ClassRef getClassRef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	aload_4 
	aload_3 
	invokespecial net.rim.tools.compiler.codfile.EntryPoint.<init> // pc=4
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	return 
	}


public final setAlternateEntryRoutine( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.ClassDef, java.lang.String, module:net_rim_loader-2.class#51 ); // address: 0
	{
	enter 
	aconst_null 
	astore_4 
	aload_2 
	ifnonnull Label9
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getNullIdentifier // pc=1
	astore_4 
	goto Label13
Label9:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	astore_4 
Label13:
	aload_3 
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	invokenonvirtual_lib .routine_29420 // pc=1
	if_acmpeq Label23
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_3 
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_29492 // pc=4
	astore_3 
Label23:
	aload_0 
	new EntryPoint
	dup 
	aload_1 
	aload_0 
	invokevirtual net.rim.tools.compiler.codfile.ClassRef getClassRef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	aload_4 
	aload_3 
	invokespecial net.rim.tools.compiler.codfile.EntryPoint.<init> // pc=4
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	return 
	}


public final net.rim.tools.compiler.codfile.ClassDef getNullClassDef( net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	areturn_field .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	}


public final net.rim.tools.compiler.codfile.ClassRef getNullClassRef( net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	areturn_field .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	}


public final net.rim.tools.compiler.codfile.ClassRef makeClassRef( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	if_acmpne Label6
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	areturn 
Label6:
	aconst_null 
	astore_2 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokevirtual routine
	istore_3 
	iconst_0 
	istore_4 
Label13:
	iload_4 
	iload_3 
	if_icmpge Label29
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iload_4 
	invokevirtual routine
	checkcast ClassRef
	astore_2 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassRef.getClassDef // pc=1
	aload_1 
	if_acmpne Label27
	aload_2 
	areturn 
Label27:
	iinc 4 1
	goto Label13
Label29:
	new ClassRef
	dup 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.ClassRef.<init> // pc=3
	astore_2 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_2 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	aload_2 
	areturn 
	}


public final net.rim.tools.compiler.codfile.InterfaceMethodRef getNullInterfaceMethodRef( net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	areturn_field .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	}


public final net.rim.tools.compiler.codfile.InterfaceMethodRef makeInterfaceMethodRef( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.Member ); // address: 0
	{
	enter 
	new InterfaceMethodRef
	dup 
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.InterfaceMethodRef.<init> // pc=3
	astore_2 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_2 
	invokevirtual routine
	aload_2 
	areturn 
	}


public final setIcallIndex( net.rim.tools.compiler.codfile.DataSection, int ); // address: 0
	{
	putfield_return .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	}


public final setStaticSize( net.rim.tools.compiler.codfile.DataSection, int ); // address: 0
	{
	putfield_return .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	}


public final addMethodFixup( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.FixupTableEntry ); // address: 0
	{
	enter 
	aload_0_getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	ifeq Label43
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.getRef // pc=1
	checkcast_lib net.rim.tools.compiler.codfile.MemberRef//net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef
	astore_3 
	aload_0 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_3 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.DataSection.findDupeSignatures // pc=4
	ifne Label15
	iconst_1 
	goto Label16
Label15:
	iconst_0 
Label16:
	istore_2 
	iload_2 
	ifne Label43
	aload_0 
	iconst_0 
	putfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	invokevirtual routine
	istore_4 
	iconst_0 
	istore_5 
Label27:
	iload_5 
	iload_4 
	if_icmpge Label43
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	iload_5 
	invokevirtual routine
	checkcast FixupTableEntry
	astore_6 
	aload_6 
	bipush -1
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOrdinal // pc=2
	aload_6 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setImplied // pc=2
	iinc 5 1
	goto Label27
Label43:
	aload_1 
	aload_0_getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setImplied // pc=2
	aload_0_getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	ifne Label60
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 6
	if_icmpge Label60
	aload_1 
	bipush -1
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOrdinal // pc=2
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	invokevirtual negatePrefix( net.rim.tools.compiler.codfile.CodfileVector ) // pc=1
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_1 
	invokevirtual routine
	return 
Label60:
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_1 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	return 
	}


public final addStaticMethodFixup( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.FixupTableEntry, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	ifeq Label45
	iload_2 
	ifeq Label19
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.getRef // pc=1
	checkcast_lib net.rim.tools.compiler.codfile.MemberRef//net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef
	astore_3 
	aload_0 
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_3 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.DataSection.findDupeSignatures // pc=4
	ifne Label17
	iconst_1 
	goto Label18
Label17:
	iconst_0 
Label18:
	istore_2 
Label19:
	iload_2 
	ifne Label45
	aload_0 
	iconst_0 
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokevirtual routine
	istore_3 
	iconst_0 
	istore_4 
Label29:
	iload_4 
	iload_3 
	if_icmpge Label45
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	iload_4 
	invokevirtual routine
	checkcast FixupTableEntry
	astore_5 
	aload_5 
	bipush -1
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOrdinal // pc=2
	aload_5 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setImplied // pc=2
	iinc 4 1
	goto Label29
Label45:
	aload_1 
	aload_0_getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setImplied // pc=2
	aload_0_getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	ifne Label62
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 6
	if_icmpge Label62
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokevirtual negatePrefix( net.rim.tools.compiler.codfile.CodfileVector ) // pc=1
	aload_1 
	bipush -1
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOrdinal // pc=2
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_1 
	invokevirtual routine
	return 
Label62:
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_1 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	return 
	}


public final addVcallMethodFixup( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.FixupTableEntry ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_1 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	return 
	}


public final addClassDefCodeFixup( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.FixupTableEntry ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	ifne Label8
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_1 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	return 
Label8:
	aload_1 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setImplied // pc=2
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_1 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	return 
	}


public final addFieldFixup( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.FixupTableEntry ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_1 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	return 
	}


public final addFieldLocalFixup( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.FixupTableEntry ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_1 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	return 
	}


public final addStaticFieldFixup( net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.FixupTableEntry, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	ifeq Label42
	iload_2 
	ifeq Label19
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.getRef // pc=1
	checkcast_lib net.rim.tools.compiler.codfile.MemberRef//net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef net.rim.tools.compiler.codfile.MemberRef
	astore_3 
	aload_0 
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_3 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.DataSection.findDupeSignatures // pc=4
	ifne Label17
	iconst_1 
	goto Label18
Label17:
	iconst_0 
Label18:
	istore_2 
Label19:
	iload_2 
	ifne Label42
	aload_0 
	iconst_0 
	putfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	invokevirtual routine
	istore_3 
	iconst_0 
	istore_4 
Label29:
	iload_4 
	iload_3 
	if_icmpge Label42
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	iload_4 
	invokevirtual routine
	checkcast FixupTableEntry
	astore_5 
	aload_5 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setImplied // pc=2
	iinc 4 1
	goto Label29
Label42:
	aload_1 
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	invokenonvirtual net.rim.tools.compiler.codfile.FixupTableEntry.setImplied // pc=2
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	ifne Label59
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 6
	if_icmpge Label59
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	invokevirtual negatePrefix( net.rim.tools.compiler.codfile.CodfileVector ) // pc=1
	aload_1 
	bipush -1
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOrdinal // pc=2
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_1 
	invokevirtual routine
	return 
Label59:
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_1 
	invokevirtual int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ) // pc=2
	pop 
	return 
	}


public final boolean fixupsHaveRetType( net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	ireturn_field .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	}

}
