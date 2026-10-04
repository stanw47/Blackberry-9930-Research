// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 60
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class ExportedData extends net.rim.tools.compiler.codfile.CodfileItem

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.Identifier /*net.rim.tools.compiler.codfile.Identifier*/  _name ; // ofs = 20548 addr = 0)
	private int /*int*/  _length ; // ofs = 20552 addr = 0)
	private net.rim.tools.compiler.codfile.Bytes /*net.rim.tools.compiler.codfile.Bytes*/  _bytes ; // ofs = 20556 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.ExportedData, net.rim.tools.compiler.codfile.DataSection, net.rim.tools.compiler.codfile.Bytes, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileItem.<init> // pc=1
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getDataBytes // pc=1
	astore_4 
	aload_0 
	aload_4 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileData.length // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.ExportedData, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}


public final int compareTo( net.rim.tools.compiler.codfile.ExportedData, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcast ExportedData
	astore_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileData.compareTo // pc=2
	ireturn 
	}

}
