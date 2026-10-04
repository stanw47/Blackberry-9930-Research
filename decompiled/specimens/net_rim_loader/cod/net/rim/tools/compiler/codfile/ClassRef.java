// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 26
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class ClassRef extends net.rim.tools.compiler.codfile.CodfileItem

{

	// @@@@@@@@@@@@@ Fields 
	protected net.rim.tools.compiler.codfile.Module /*net.rim.tools.compiler.codfile.Module*/  _module ; // ofs = 17838 addr = 0)
	protected net.rim.tools.compiler.codfile.Identifier /*net.rim.tools.compiler.codfile.Identifier*/  _packageName ; // ofs = 17842 addr = 0)
	protected net.rim.tools.compiler.codfile.Identifier /*net.rim.tools.compiler.codfile.Identifier*/  _className ; // ofs = 17846 addr = 0)
	protected net.rim.tools.compiler.codfile.ClassDef /*net.rim.tools.compiler.codfile.ClassDef*/  _classDef ; // ofs = 17850 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.ClassRef, net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=2
	aload_0 
	bipush -1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload_2 
	invokevirtual net.rim.tools.compiler.codfile.Module getModule( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	invokevirtual net.rim.tools.compiler.codfile.Identifier getPackageName( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_2 
	invokevirtual net.rim.tools.compiler.codfile.Identifier getClassName( net.rim.tools.compiler.codfile.ClassDef ) // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.ClassRef, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int getOrdinal( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_1 
	iconst_0 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	instanceof ClassDefDomestic
	ifeq Label25
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual routine
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto Label28
Label25:
	aload_1 
	iconst_0 
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label28:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}


public final int getModuleNum( net.rim.tools.compiler.codfile.ClassRef ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int getOrdinal( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	ireturn 
	}


public final net.rim.tools.compiler.codfile.ClassDef getClassDef( net.rim.tools.compiler.codfile.ClassRef ); // address: 0
	{
	areturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


public final int compareTo( net.rim.tools.compiler.codfile.ClassRef, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcast ClassRef
	astore_2 
	aload_0 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassRef.getModuleNum // pc=1
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassRef.getModuleNum // pc=1
	isub 
	ireturn 
	}

}
