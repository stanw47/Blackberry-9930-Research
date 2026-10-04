// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 59
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class ExceptionHandler extends net.rim.tools.compiler.codfile.CodfileItemRelative

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.CodfileLabel /*net.rim.tools.compiler.codfile.CodfileLabel*/  _start ; // ofs = 20482 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileLabel /*net.rim.tools.compiler.codfile.CodfileLabel*/  _end ; // ofs = 20486 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileLabel /*net.rim.tools.compiler.codfile.CodfileLabel*/  _handler ; // ofs = 20490 addr = 0)
	private net.rim.tools.compiler.codfile.ClassDef /*net.rim.tools.compiler.codfile.ClassDef*/  _classDef ; // ofs = 20494 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.ExceptionHandler, net.rim.tools.compiler.codfile.CodfileLabel, net.rim.tools.compiler.codfile.CodfileLabel, net.rim.tools.compiler.codfile.CodfileLabel, net.rim.tools.compiler.codfile.ClassDef ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItemRelative.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_3 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_4 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


static public final int getSize(  ); // address: 0
	{
	enter_narrow 
	bipush 6
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final writeRelative( net.rim.tools.compiler.codfile.ExceptionHandler, net.rim.tools.compiler.io.StructuredOutputStream, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_5 // idx=5 pc=1
	iload_2 
	iadd 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual_short .virtual_5 // idx=5 pc=1
	iload_2 
	iadd 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual_short .virtual_5 // idx=5 pc=1
	iload_2 
	iadd 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}

}
