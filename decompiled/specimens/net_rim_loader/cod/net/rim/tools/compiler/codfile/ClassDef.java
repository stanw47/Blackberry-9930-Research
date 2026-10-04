// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 21
// ########################################################


package net.rim.tools.compiler.codfile;


public class ClassDef extends net.rim.tools.compiler.codfile.CodfileItem

{

	// @@@@@@@@@@@@@ Fields 
	protected boolean /*boolean*/  _siblingFormat ; // ofs = 17268 addr = 0)
	protected boolean /*boolean*/  _implied_clsref_fixups ; // ofs = 17272 addr = 0)
	protected net.rim.tools.compiler.codfile.Module /*net.rim.tools.compiler.codfile.Module*/  _module ; // ofs = 17276 addr = 0)
	protected net.rim.tools.compiler.codfile.Identifier /*net.rim.tools.compiler.codfile.Identifier*/  _packageName ; // ofs = 17280 addr = 0)
	protected net.rim.tools.compiler.codfile.Identifier /*net.rim.tools.compiler.codfile.Identifier*/  _className ; // ofs = 17284 addr = 0)
	protected net.rim.tools.compiler.codfile.CodfileArray /*net.rim.tools.compiler.codfile.CodfileArray*/  _fieldDefs ; // ofs = 17288 addr = 0)
	protected net.rim.tools.compiler.codfile.CodfileArray /*net.rim.tools.compiler.codfile.CodfileArray*/  _staticFieldDefs ; // ofs = 17292 addr = 0)
	protected net.rim.tools.compiler.codfile.CodfileArray /*net.rim.tools.compiler.codfile.CodfileArray*/  _undefMethods ; // ofs = 17296 addr = 0)
	protected net.rim.tools.compiler.codfile.CodfileArray /*net.rim.tools.compiler.codfile.CodfileArray*/  _undefFieldDefs ; // ofs = 17300 addr = 0)
	protected net.rim.tools.compiler.codfile.ClassRef /*net.rim.tools.compiler.codfile.ClassRef*/  _classRef ; // ofs = 17304 addr = 0)
	protected net.rim.tools.compiler.codfile.Routine /*net.rim.tools.compiler.codfile.Routine*/  _nullRoutine ; // ofs = 17308 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=1
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.ClassDef.init // pc=2
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getDataBytes // pc=1
	astore_4 
	aload_0 
	aload_4 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload_4 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


public <init>( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_2 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=2
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.codfile.ClassDef.init // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private init( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.tools.compiler.codfile.RoutineNull//module:net_rim_loader-2.class#41 module:net_rim_loader-2.class#41 module:net_rim_loader-2.class#41
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_22929 // pc=3
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getImpliedClsrefFixups // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public makeSymbolic( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	noenter_return 
	}


protected net.rim.tools.compiler.codfile.CodfileOffset getFixupRef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


public writeModuleOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual writeOrdinal( net.rim.tools.compiler.codfile.CodfileItem, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	return 
	}


abstract public writeOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	halt 
	}


abstract public writeRelativeOrdinal( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	halt 
	}


abstract public writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	halt 
	}


public writeFixups( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	invokevirtual int getNumFieldDefs( net.rim.tools.compiler.codfile.ClassDef, boolean ) // pc=2
	istore_2 
	iconst_0 
	istore_3 
Label7:
	iload_3 
	iload_2 
	if_icmpge Label20
	aload_0 
	iload_3 
	iconst_0 
	invokevirtual net.rim.tools.compiler.codfile.FieldDef getFieldDef( net.rim.tools.compiler.codfile.ClassDef, int, boolean ) // pc=3
	astore_4 
	aload_4 
	aload_1 
	invokevirtual writeFixups( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	iinc 3 1
	goto Label7
Label20:
	aload_0 
	iconst_1 
	invokevirtual int getNumFieldDefs( net.rim.tools.compiler.codfile.ClassDef, boolean ) // pc=2
	istore_2 
	iconst_0 
	istore_3 
Label26:
	iload_3 
	iload_2 
	if_icmpge Label39
	aload_0 
	iload_3 
	iconst_1 
	invokevirtual net.rim.tools.compiler.codfile.FieldDef getFieldDef( net.rim.tools.compiler.codfile.ClassDef, int, boolean ) // pc=3
	astore_4 
	aload_4 
	aload_1 
	invokevirtual writeFixups( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	iinc 3 1
	goto Label26
Label39:
	aload_0 
	invokevirtual int getNumUndefRoutines( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label44:
	iload_3 
	iload_2 
	if_icmpge Label56
	aload_0 
	iload_3 
	invokevirtual net.rim.tools.compiler.codfile.Routine getUndefRoutine( net.rim.tools.compiler.codfile.ClassDef, int ) // pc=2
	astore_4 
	aload_4 
	aload_1 
	invokevirtual writeFixups( net.rim.tools.compiler.codfile.Routine, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	iinc 3 1
	goto Label44
Label56:
	aload_0 
	invokevirtual int getNumUndefFieldDefs( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label61:
	iload_3 
	iload_2 
	if_icmpge Label73
	aload_0 
	iload_3 
	invokevirtual net.rim.tools.compiler.codfile.FieldDef getUndefFieldDef( net.rim.tools.compiler.codfile.ClassDef, int ) // pc=2
	astore_4 
	aload_4 
	aload_1 
	invokevirtual writeFixups( net.rim.tools.compiler.codfile.FieldDef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	iinc 3 1
	goto Label61
Label73:
	return 
	}


public setModule( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Module ); // address: 0
	{
	putfield_return .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public net.rim.tools.compiler.codfile.Module getModule( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	areturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public setPackageName( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Identifier ); // address: 0
	{
	putfield_return .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public net.rim.tools.compiler.codfile.Identifier getPackageName( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	areturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public java.lang.String getPackageNameString( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual net.rim.tools.compiler.codfile.Identifier.getString // pc=1
	areturn 
	}


public setClassName( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Identifier ); // address: 0
	{
	putfield_return .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public net.rim.tools.compiler.codfile.Identifier getClassName( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	areturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public java.lang.String getClassNameString( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokenonvirtual net.rim.tools.compiler.codfile.Identifier.getString // pc=1
	areturn 
	}


public int getLibOff( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	ireturn_bipush 1
	}


public net.rim.tools.compiler.codfile.ClassRef getClassRef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnonnull Label8
	aload_0 
	aload_1 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.makeClassRef // pc=2
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
Label8:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	areturn 
	}


abstract public net.rim.tools.compiler.codfile.Routine createRoutine( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, module:net_rim_loader-2.class#51 ); // address: 0
	{
	halt 
	}


abstract public net.rim.tools.compiler.codfile.Routine makeRoutine( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection, java.lang.String, boolean, module:net_rim_loader-2.class#51, module:net_rim_loader-2.class#51 ); // address: 0
	{
	halt 
	}


public net.rim.tools.compiler.codfile.Routine getNullRoutine( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	areturn_field .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	}


public allocateFieldDefs( net.rim.tools.compiler.codfile.ClassDef, int, boolean ); // address: 0
	{
	enter 
	iload_2 
	ifeq Label10
	aload_0 
	new CodfileArray
	dup 
	iload_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=2
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	return 
Label10:
	aload_0 
	new CodfileArray
	dup 
	iload_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=2
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}


public addFieldDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.FieldDef, boolean ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	iload_2 
	ifeq Label14
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label11
	aload_0 
	iconst_1 
	iload_2 
	invokevirtual allocateFieldDefs( net.rim.tools.compiler.codfile.ClassDef, int, boolean ) // pc=3
Label11:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore_3 
	goto Label22
Label14:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label20
	aload_0 
	iconst_1 
	iload_2 
	invokevirtual allocateFieldDefs( net.rim.tools.compiler.codfile.ClassDef, int, boolean ) // pc=3
Label20:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	astore_3 
Label22:
	aload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	istore_4 
	aload_1 
	iload_4 
	invokevirtual routine
	aload_3 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.addElement // pc=2
	return 
	}


public int getNumFieldDefs( net.rim.tools.compiler.codfile.ClassDef, boolean ); // address: 0
	{
	enter_narrow 
	aconst_null 
	astore_2 
	iload_1 
	ifeq Label8
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore_2 
	goto Label10
Label8:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	astore_2 
Label10:
	aload_2 
	ifnull Label15
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}


public net.rim.tools.compiler.codfile.FieldDef getFieldDef( net.rim.tools.compiler.codfile.ClassDef, int, boolean ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	iload_2 
	ifeq Label8
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore_3 
	goto Label10
Label8:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	astore_3 
Label10:
	aload_3 
	iload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.elementAt // pc=2
	checkcast FieldDef
	areturn 
	}


public int getNumUndefRoutines( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label6
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}


public undefinedRoutine( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Routine ); // address: 0
	{
	enter 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label9
	aload_0 
	new CodfileArray
	dup 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=2
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
Label9:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	istore_2 
	aload_1 
	iload_2 
	invokevirtual setOrdinal( net.rim.tools.compiler.codfile.CodfileItem, int ) // pc=2
	aload_1 
	invokevirtual setUndefined( net.rim.tools.compiler.codfile.Member ) // pc=1
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.addElement // pc=2
	return 
	}


public net.rim.tools.compiler.codfile.Routine getUndefRoutine( net.rim.tools.compiler.codfile.ClassDef, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label8
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.elementAt // pc=2
	checkcast_lib net.rim.tools.compiler.codfile.Routine//net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine net.rim.tools.compiler.codfile.Routine
	areturn 
Label8:
	aconst_null 
	areturn 
	}


public int getNumUndefFieldDefs( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label6
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}


public undefinedFieldDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.FieldDef ); // address: 0
	{
	enter 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnonnull Label9
	aload_0 
	new CodfileArray
	dup 
	iconst_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=2
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
Label9:
	aload_1 
	invokevirtual routine
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.addElement // pc=2
	return 
	}


public net.rim.tools.compiler.codfile.FieldDef getUndefFieldDef( net.rim.tools.compiler.codfile.ClassDef, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label8
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.elementAt // pc=2
	checkcast FieldDef
	areturn 
Label8:
	aconst_null 
	areturn 
	}


abstract public net.rim.tools.compiler.codfile.FieldDef createFieldDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	halt 
	}


abstract public net.rim.tools.compiler.codfile.FieldDef makeFieldDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection, java.lang.String, boolean, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	halt 
	}


public java.lang.String getFullName( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokenonvirtual net.rim.tools.compiler.codfile.Identifier.getString // pc=1
	astore_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileData.length // pc=1
	istore_2 
	iload_2 
	ifle Label37
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual net.rim.tools.compiler.codfile.Identifier.getString // pc=1
	astore_3 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	iload_2 
	iconst_1 
	iadd 
	aload_1 
	stringlength 
	iadd 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_4 
	aload_4 
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	ldc literal_331:"."
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label37:
	aload_1 
	areturn 
	}


public boolean equals( net.rim.tools.compiler.codfile.ClassDef, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcastbranch 
	astore_2 
	aload_0 
	aload_2 
	if_acmpne Label9
	iconst_1 
	ireturn 
Label9:
	aload_0 
	invokevirtual java.lang.String getClassNameString( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	aload_2 
	invokevirtual java.lang.String getClassNameString( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label23
	aload_0 
	invokevirtual java.lang.String getPackageNameString( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	aload_2 
	invokevirtual java.lang.String getPackageNameString( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label23
	iconst_1 
	ireturn 
Label23:
	iconst_0 
	ireturn 
Label25:
	iconst_0 
	ireturn 
	}


public int hashCode( net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_ // idx=0 pc=1
	bipush 31
	imul 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	ireturn 
	}

}
