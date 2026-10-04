// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 24
// ########################################################


package net.rim.tools.compiler.codfile;


abstract public final class ClassDefLocal extends net.rim.tools.compiler.codfile.ClassDef

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.codfile.ClassDef /*net.rim.tools.compiler.codfile.ClassDef*/  _superClass ; // ofs = 17618 addr = 0)
	private int /*int*/  _staticStart ; // ofs = 17622 addr = 0)
	private net.rim.tools.compiler.codfile.Routine /*net.rim.tools.compiler.codfile.Routine*/  _clinit ; // ofs = 17626 addr = 0)
	private net.rim.tools.compiler.codfile.Routine /*net.rim.tools.compiler.codfile.Routine*/  _init ; // ofs = 17630 addr = 0)
	private int /*int*/  _createSize ; // ofs = 17634 addr = 0)
	private int /*int*/  _secureIndex ; // ofs = 17638 addr = 0)
	private int /*int*/  _virtualRoutinesOffset ; // ofs = 17642 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileArray /*net.rim.tools.compiler.codfile.CodfileArray*/  _virtualRoutines ; // ofs = 17646 addr = 0)
	private int /*int*/  _nonVirtualRoutinesOffset ; // ofs = 17650 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileArray /*net.rim.tools.compiler.codfile.CodfileArray*/  _nonVirtualRoutines ; // ofs = 17654 addr = 0)
	private int /*int*/  _staticRoutinesOffset ; // ofs = 17658 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileArray /*net.rim.tools.compiler.codfile.CodfileArray*/  _staticRoutines ; // ofs = 17662 addr = 0)
	private int /*int*/  _startCodeOffset ; // ofs = 17666 addr = 0)
	private int /*int*/  _endCodeOffset ; // ofs = 17670 addr = 0)
	private int /*int*/  _attributes ; // ofs = 17674 addr = 0)
	private int /*int*/  _interfacesOffset ; // ofs = 17678 addr = 0)
	private net.rim.tools.compiler.codfile.CodfileArray /*net.rim.tools.compiler.codfile.CodfileArray*/  _interfaces ; // ofs = 17682 addr = 0)
	private int /*int*/  _fieldDefsOffset ; // ofs = 17686 addr = 0)
	private int /*int*/  _staticFieldDefsOffset ; // ofs = 17690 addr = 0)
	private int /*int*/  _fieldDefsOffset2 ; // ofs = 17694 addr = 0)
	private int /*int*/  _staticFieldDefsOffset2 ; // ofs = 17698 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.DataSection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial net.rim.tools.compiler.codfile.ClassDef.<init> // pc=4
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.ClassDefLocal.init // pc=1
	return 
	}


public <init>( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.DataSection, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iload_2 
	invokespecial net.rim.tools.compiler.codfile.ClassDef.<init> // pc=3
	aload_0 
	invokespecial net.rim.tools.compiler.codfile.ClassDefLocal.init // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final init( net.rim.tools.compiler.codfile.ClassDefLocal ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush -1
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0 
	iipush 65535
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0 
	iconst_0 
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_1 
	bipush 2
	invokevirtual int writeSlack( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	pop 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setOffset // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.writeOffset // pc=2
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	invokevirtual writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_1 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokevirtual int getOffset( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	bipush -1
	if_icmpne Label28
	aload_1 
	iconst_0 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto Label31
Label28:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_1 
	invokevirtual writeLocalOffset( net.rim.tools.compiler.codfile.CodfileItem, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
Label31:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokevirtual int getOffset( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	bipush -1
	if_icmpne Label39
	aload_1 
	iconst_0 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	goto Label42
Label39:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_1 
	invokevirtual writeLocalOffset( net.rim.tools.compiler.codfile.CodfileItem, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
Label42:
	aload_1 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefLocal.writeAttributes // pc=2
	aload_1 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	isub 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	isub 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	isub 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	isub 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	isub 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	isub 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	isub 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_1 
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	isub 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	ifnull Label109
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.writeOffsets // pc=2
Label109:
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	ifnull Label118
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.writeOffsets // pc=2
Label118:
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	ifnull Label127
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.writeOffsets // pc=2
Label127:
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	putfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label136
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.write // pc=2
Label136:
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	putfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label145
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.write // pc=2
Label145:
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	putfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	ifnull Label154
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.writeAbsoluteOrdinals // pc=2
Label154:
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	putfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label178
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label165:
	iload_3 
	iload_2 
	if_icmpge Label178
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.elementAt // pc=2
	checkcast FieldDefLocal
	astore_4 
	aload_4 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.FieldDefLocal.writeAttributes // pc=2
	iinc 3 1
	goto Label165
Label178:
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	putfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label202
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label189:
	iload_3 
	iload_2 
	if_icmpge Label202
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_3 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.elementAt // pc=2
	checkcast FieldDefLocal
	astore_4 
	aload_4 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.FieldDefLocal.writeAttributes // pc=2
	iinc 3 1
	goto Label189
Label202:
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileItem.setExtent // pc=2
	return 
	}


public final writeAttributes( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	istore_2 
	aload_1 
	iload_2 
	iipush 65535
	iand 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeOrdinal( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefLocal.writeRelativeOrdinal // pc=2
	return 
	}


public final writeRelativeOrdinal( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final writeAbsoluteClassDef( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDef.writeModuleOrdinal // pc=2
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual writeByte( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public final setSuperClass( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_2 
	invokevirtual makeSymbolic( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	aload_0 
	aload_1 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	return 
	}


public final allocateInterfaces( net.rim.tools.compiler.codfile.ClassDefLocal, int ); // address: 0
	{
	enter 
	iload_1 
	ifle Label11
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	ifnonnull Label11
	aload_0 
	new CodfileArray
	dup 
	iload_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=2
	putfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
Label11:
	return 
	}


public final addInterface( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_2 
	invokevirtual makeSymbolic( net.rim.tools.compiler.codfile.ClassDef, net.rim.tools.compiler.codfile.DataSection ) // pc=2
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.addElement // pc=2
	return 
	}


public final setStaticStart( net.rim.tools.compiler.codfile.ClassDefLocal, int ); // address: 0
	{
	putfield_return .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	}


public final setSecureIndex( net.rim.tools.compiler.codfile.ClassDefLocal, int ); // address: 0
	{
	putfield_return .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	}


public final setClinit( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.Routine ); // address: 0
	{
	putfield_return .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	}


public final setInit( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.Routine ); // address: 0
	{
	putfield_return .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	}


public final ratchetStartCodeOffset( net.rim.tools.compiler.codfile.ClassDefLocal, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	if_icmpge Label7
	aload_0 
	iload_1 
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
Label7:
	return 
	}


public final ratchetEndCodeOffset( net.rim.tools.compiler.codfile.ClassDefLocal, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	if_icmple Label7
	aload_0 
	iload_1 
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
Label7:
	return 
	}


public final setAttributes( net.rim.tools.compiler.codfile.ClassDefLocal, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	iload_1 
	ior 
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	return 
	}


public final net.rim.tools.compiler.codfile.FieldDef createFieldDef( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	enter 
	new FieldDefLocal
	dup 
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	invokespecial net.rim.tools.compiler.codfile.FieldDefLocal.<init> // pc=5
	areturn 
	}


public final net.rim.tools.compiler.codfile.FieldDef makeFieldDef( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.DataSection, java.lang.String, boolean, module:net_rim_loader-2.class#51, boolean ); // address: 0
	{
	enter 
	iload_3 
	ifeq Label5
	aconst_null 
	goto Label6
Label5:
	aload_2 
Label6:
	astore_6 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getDataBytes // pc=1
	astore_7 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getTypeLists // pc=1
	aload_4 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_29492 // pc=4
	astore_4 
	aload_0 
	aload_7 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	aload_4 
	iload_5 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefLocal.createFieldDef // pc=4
	astore 8
	aload 8
	areturn 
	}


public final net.rim.tools.compiler.codfile.Routine createRoutine( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.Identifier, module:net_rim_loader-2.class#51, module:net_rim_loader-2.class#51 ); // address: 0
	{
	enter 
	new_lib net.rim.tools.compiler.codfile.RoutineLocal//module:net_rim_loader-2.class#40 module:net_rim_loader-2.class#40 module:net_rim_loader-2.class#40
	dup 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial_lib .routine_22731 // pc=5
	areturn 
	}


public final net.rim.tools.compiler.codfile.Routine makeRoutine( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.DataSection, java.lang.String, boolean, module:net_rim_loader-2.class#51, module:net_rim_loader-2.class#51 ); // address: 0
	{
	enter 
	iload_3 
	ifeq Label5
	aconst_null 
	goto Label6
Label5:
	aload_2 
Label6:
	astore_6 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getDataBytes // pc=1
	astore_7 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.DataSection.getTypeLists // pc=1
	astore 8
	aload 8
	aload_4 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_29492 // pc=4
	astore_4 
	aload 8
	aload_5 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_29492 // pc=4
	astore_5 
	aload_0 
	aload_7 
	aload_6 
	invokenonvirtual net.rim.tools.compiler.codfile.DataBytes.getIdentifier // pc=2
	aload_4 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.codfile.ClassDefLocal.createRoutine // pc=4
	checkcast_lib net.rim.tools.compiler.codfile.RoutineLocal//module:net_rim_loader-2.class#40 module:net_rim_loader-2.class#40 module:net_rim_loader-2.class#40
	astore 9
	aload 9
	areturn 
	}


public final int getLibOff( net.rim.tools.compiler.codfile.ClassDefLocal ); // address: 0
	{
	ireturn_bipush 0
	}


public final allocateVirtualRoutines( net.rim.tools.compiler.codfile.ClassDefLocal, int ); // address: 0
	{
	enter 
	iload_1 
	ifle Label11
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	ifnonnull Label11
	aload_0 
	new CodfileArray
	dup 
	iload_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=2
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
Label11:
	return 
	}


public final addVirtualRoutine( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.Routine ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	invokevirtual setOrdinal( net.rim.tools.compiler.codfile.CodfileItem, int ) // pc=2
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.addElement // pc=2
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	bipush -1
	if_icmpeq Label15
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual addRoutine( net.rim.tools.compiler.codfile.Module, net.rim.tools.compiler.codfile.Routine ) // pc=2
Label15:
	return 
	}


public final allocateNonVirtualRoutines( net.rim.tools.compiler.codfile.ClassDefLocal, int ); // address: 0
	{
	enter 
	iload_1 
	ifle Label11
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	ifnonnull Label11
	aload_0 
	new CodfileArray
	dup 
	iload_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=2
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
Label11:
	return 
	}


public final addNonVirtualRoutine( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.Routine ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	invokevirtual setOrdinal( net.rim.tools.compiler.codfile.CodfileItem, int ) // pc=2
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.addElement // pc=2
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	bipush -1
	if_icmpeq Label15
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual addRoutine( net.rim.tools.compiler.codfile.Module, net.rim.tools.compiler.codfile.Routine ) // pc=2
Label15:
	return 
	}


public final allocateStaticRoutines( net.rim.tools.compiler.codfile.ClassDefLocal, int ); // address: 0
	{
	enter 
	iload_1 
	ifle Label11
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	ifnonnull Label11
	aload_0 
	new CodfileArray
	dup 
	iload_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileArray.<init> // pc=2
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
Label11:
	return 
	}


public final addStaticRoutine( net.rim.tools.compiler.codfile.ClassDefLocal, net.rim.tools.compiler.codfile.Routine ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	invokevirtual setOrdinal( net.rim.tools.compiler.codfile.CodfileItem, int ) // pc=2
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_1 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.addElement // pc=2
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	bipush -1
	if_icmpeq Label15
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokevirtual addRoutine( net.rim.tools.compiler.codfile.Module, net.rim.tools.compiler.codfile.Routine ) // pc=2
Label15:
	return 
	}


public final harvestRoutines( net.rim.tools.compiler.codfile.ClassDefLocal, java.util.Vector ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	ifnull Label22
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label10:
	iload_4 
	iload_3 
	if_icmpge Label22
	iconst_1 
	istore_2 
	aload_1 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iload_4 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.elementAt // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 4 1
	goto Label10
Label22:
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	ifnull Label41
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label29:
	iload_4 
	iload_3 
	if_icmpge Label41
	iconst_1 
	istore_2 
	aload_1 
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	iload_4 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.elementAt // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 4 1
	goto Label29
Label41:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	ifnull Label60
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.size // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label48:
	iload_4 
	iload_3 
	if_icmpge Label60
	iconst_1 
	istore_2 
	aload_1 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	iload_4 
	invokenonvirtual net.rim.tools.compiler.codfile.CodfileArray.elementAt // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 4 1
	goto Label48
Label60:
	iload_2 
	ifne Label65
	aload_1 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label65:
	return 
	}

}
