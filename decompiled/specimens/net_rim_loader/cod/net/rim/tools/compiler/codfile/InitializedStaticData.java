// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 67
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class InitializedStaticData extends net.rim.tools.compiler.codfile.CodfileItem

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _value ; // ofs = 21008 addr = 0)
	private net.rim.tools.compiler.codfile.Literal /*module:net_rim_loader.class#22*/  _literal ; // ofs = 21012 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.InitializedStaticData, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=1
	aload_0 
	iload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public <init>( net.rim.tools.compiler.codfile.InitializedStaticData, int, module:net_rim_loader.class#22 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=1
	aload_0 
	iload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.InitializedStaticData, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeAddress // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnull Label13
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.getOffset // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label13:
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual writeInt( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}

}
