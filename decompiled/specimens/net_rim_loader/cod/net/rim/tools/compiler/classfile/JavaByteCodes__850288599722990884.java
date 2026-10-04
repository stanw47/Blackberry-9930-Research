// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 78
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class JavaByteCodes extends Object
implements net.rim.tools.compiler.vm.Constants

{
	// @@@@@@@@@@@@@ Static fields 
	private final static int[] /*int[]*/  operandLength ; // ofs = 22118 addr = 173)
	private final static int[] /*int[]*/  opcodeType ; // ofs = 22124 addr = 174)

	// @@@@@@@@@@@@@ Fields 
	private byte[] /*byte[]*/  _code ; // ofs = 22070 addr = 0)
	private int /*int*/  _index ; // ofs = 22074 addr = 0)
	private int /*int*/  _opcode ; // ofs = 22078 addr = 0)
	private net.rim.tools.compiler.analysis.InstructionResolver /*net.rim.tools.compiler.analysis.InstructionResolver*/  _wlk ; // ofs = 22082 addr = 0)
	private net.rim.tools.compiler.classfile.ConstantPool /*net.rim.tools.compiler.classfile.ConstantPool*/  _constantPool ; // ofs = 22086 addr = 0)
	private int[] /*int[]*/  _op0 ; // ofs = 22090 addr = 0)
	private int[] /*int[]*/  _op1 ; // ofs = 22094 addr = 0)
	private int[] /*int[]*/  _op2 ; // ofs = 22098 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeNotFoundException /*net.rim.tools.compiler.classfile.ByteCodeNotFoundException*/  _bnfe ; // ofs = 22102 addr = 0)
	private net.rim.tools.compiler.classfile.ConstantPoolArrayData /*net.rim.tools.compiler.classfile.ConstantPoolArrayData*/  _arrayValues ; // ofs = 22106 addr = 0)
	private String /*java.lang.String[]*/  _arrayStringValues ; // ofs = 22110 addr = 0)
	private int /*int*/  _saved_ip ; // ofs = 22114 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	newarray 5
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	iconst_1 
	newarray 5
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	bipush 2
	newarray 5
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	new ByteCodeNotFoundException
	dup 
	invokespecial net.rim.tools.compiler.classfile.ByteCodeNotFoundException.<init> // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


static public final int align( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	bipush 3
	iadd 
	istore_1 
	iload_1 
	bipush -4
	iand 
	istore_1 
	iload_1 
	iload_0 
	isub 
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static JavaByteCodes
	clinit_wait 
	arrayinit [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 3, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	putstatic operandLength // JavaByteCodes
	arrayinit [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 5, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, -1, -1, -1, -1, -2, -1, -1, -1, 4, 0, 0, 0, 2, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, -2, -1, -1, -1, 4, 0, 0, 0, -1, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, -2, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0]
	putstatic opcodeType // JavaByteCodes
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int signedConst( net.rim.tools.compiler.classfile.JavaByteCodes, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	iload_1 
	tableswitch  :
		
		
		
		
		

Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_0 
	iadd 
	baload 
	istore_2 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	ireturn 
Label18:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_0 
	iadd 
	baload 
	bipush 8
	ishl 
	istore_2 
	iload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	iadd 
	baload 
	sipush 255
	iand 
	ior 
	istore_2 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	ireturn 
Label43:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_0 
	iadd 
	baload 
	bipush 24
	ishl 
	istore_2 
	iload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	iadd 
	baload 
	sipush 255
	iand 
	bipush 16
	ishl 
	ior 
	istore_2 
	iload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 2
	iadd 
	baload 
	sipush 255
	iand 
	bipush 8
	ishl 
	ior 
	istore_2 
	iload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 3
	iadd 
	baload 
	sipush 255
	iand 
	ior 
	istore_2 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label90:
	iload_2 
	ireturn 
	}


private final int unsignedConst( net.rim.tools.compiler.classfile.JavaByteCodes, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	tableswitch  :
		
		
		

Label3:
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	sipush 255
	iand 
	ireturn 
Label9:
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	iipush 65535
	iand 
	ireturn 
Label15:
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	ireturn 
	}


private final int nextOpcode( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0 
	iconst_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ireturn 
	}


private final int signedImmedOp( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	getstatic operandLength // JavaByteCodes
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iaload 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	ireturn 
	}


private final int unsignedImmedOp( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	getstatic operandLength // JavaByteCodes
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iaload 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	ireturn 
	}


private final classify( net.rim.tools.compiler.classfile.JavaByteCodes, int, int, net.rim.tools.compiler.classfile.ConstantPoolEntry ); // address: 0
	{
	enter 
	iload_2 
Label3:
	aload_3 
	checkcastbranch 
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=4
	return 
Label12:
	aload_3 
	checkcastbranch 
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=4
	return 
Label21:
	aload_3 
	checkcastbranch 
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iload_2 
	aload_4 
	iconst_0 
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=6
	return 
Label32:
	invokestatic invalid(  ) // ConstantPoolEntry
	return 
Label34:
	aload_3 
	checkcastbranch 
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=4
	return 
Label43:
	invokestatic invalid(  ) // ConstantPoolEntry
	return 
Label45:
	aload_3 
	checkcastbranch 
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=4
	return 
Label54:
	invokestatic invalid(  ) // ConstantPoolEntry
	return 
Label56:
	aload_3 
	checkcastbranch 
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iload_2 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=4
	return 
Label65:
	invokestatic invalid(  ) // ConstantPoolEntry
	return 
Label67:
	aload_3 
	checkcastbranch 
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iload_2 
	aload_4 
	iconst_0 
	iload_2 
	sipush 187
	if_icmpne Label80
	iconst_1 
	goto Label81
Label80:
	iconst_0 
Label81:
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=6
	return 
Label83:
	invokestatic invalid(  ) // ConstantPoolEntry
Label84:
	return 
	}


private final classify( net.rim.tools.compiler.classfile.JavaByteCodes, int, int, int[] ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_1 
	iload_2 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=4
	return 
	}


private final saveIP( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	return 
	}


private final backout( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	athrow 
	}


private final int translateTypeEnum( net.rim.tools.compiler.classfile.JavaByteCodes, int ); // address: 0
	{
	enter 
	iload_1 
	tableswitch  :
		
		
		
		
		
		
		
		
		

Label3:
	iconst_1 
	ireturn 
Label5:
	bipush 3
	ireturn 
Label7:
	bipush 11
	ireturn 
Label9:
	bipush 12
	ireturn 
Label11:
	bipush 2
	ireturn 
Label13:
	bipush 4
	ireturn 
Label15:
	bipush 5
	ireturn 
Label17:
	bipush 6
	ireturn 
Label19:
	getstatic_lib module:net_rim_loader-2.class#13.static_32 // class#13
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_455:"Warning!: Bad type for newarray opcode: 0x"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
	bipush 10
	ireturn 
	}


private final int newArray( net.rim.tools.compiler.classfile.JavaByteCodes, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.saveIP // pc=1
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.nextOpcode // pc=1
	istore_2 
	iload_2 
	sipush 188
	if_icmpne Label14
	aload_0 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedImmedOp // pc=1
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.translateTypeEnum // pc=2
	ireturn 
Label14:
	iload_2 
	sipush 189
	if_icmpne Label37
	iload_1 
	ifeq Label37
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedImmedOp // pc=1
	istore_3 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_4 
	aload_4 
	checkcastbranch 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolClass.getName // pc=1
	astore_5 
	aload_5 
	ldc literal_456:"java.lang.String"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label37
	bipush 14
	ireturn 
	astore_3 
Label37:
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.backout // pc=1
	iconst_0 
	ireturn 
	}


private final int intConst( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.saveIP // pc=1
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.nextOpcode // pc=1
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

Label6:
	bipush -1
	ireturn 
Label8:
	iconst_0 
	ireturn 
Label10:
	iconst_1 
	ireturn 
Label12:
	bipush 2
	ireturn 
Label14:
	bipush 3
	ireturn 
Label16:
	bipush 4
	ireturn 
Label18:
	bipush 5
	ireturn 
Label20:
	aload_0 
	iconst_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	ireturn 
Label24:
	aload_0 
	bipush 2
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	ireturn 
Label28:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedImmedOp // pc=1
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_1 
	aload_1 
	checkcastbranch 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolInteger.getValue // pc=1
	ireturn 
	astore_1 
Label38:
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.backout // pc=1
	iconst_0 
	ireturn 
	}


private final int stringConst( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.saveIP // pc=1
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.nextOpcode // pc=1
	tableswitch  :
		
		
		

Label6:
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedImmedOp // pc=1
	istore_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_2 
	aload_2 
	instanceof ConstantPoolString
	ifeq Label19
	iload_1 
	ireturn 
	astore_1 
Label19:
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.backout // pc=1
	iconst_0 
	ireturn 
	}


private final long longConst( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.saveIP // pc=1
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.nextOpcode // pc=1
Label6:
	iconst_0 
	i2l 
	lreturn 
Label9:
	iconst_1 
	i2l 
	lreturn 
Label12:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedImmedOp // pc=1
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_1 
	aload_1 
	checkcastbranch 
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolLong.getValue // pc=1
	lreturn 
Label21:
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.backout // pc=1
	iconst_0 
	i2l 
	lreturn 
	}


private final dup( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.saveIP // pc=1
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.nextOpcode // pc=1
	bipush 89
	if_icmpeq Label9
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.backout // pc=1
Label9:
	return 
	}


private final dup2( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.saveIP // pc=1
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.nextOpcode // pc=1
	bipush 92
	if_icmpeq Label9
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.backout // pc=1
Label9:
	return 
	}


private final arrayStore( net.rim.tools.compiler.classfile.JavaByteCodes, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.saveIP // pc=1
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.nextOpcode // pc=1
	tableswitch  :
		
		
		
		
		
		
		
		
		

Label6:
	iload_1 
	iconst_1 
	if_icmpne Label10
	return 
Label10:
	iload_1 
	bipush 2
	if_icmpne Label34
	return 
Label14:
	iload_1 
	bipush 3
	if_icmpne Label34
	return 
Label18:
	iload_1 
	bipush 4
	if_icmpne Label34
	return 
Label22:
	iload_1 
	bipush 5
	if_icmpne Label34
	return 
Label26:
	iload_1 
	bipush 6
	if_icmpne Label34
	return 
Label30:
	iload_1 
	bipush 14
	if_icmpne Label34
	return 
Label34:
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.backout // pc=1
	return 
	}


private final net.rim.tools.compiler.classfile.ConstantPoolFieldRef anyStore( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.saveIP // pc=1
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.nextOpcode // pc=1
Label6:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedImmedOp // pc=1
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore_1 
	aload_1 
	checkcastbranch 
	areturn 
Label14:
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.backout // pc=1
	aconst_null 
	areturn 
	}


private final int arrayInit( net.rim.tools.compiler.classfile.JavaByteCodes, boolean ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.intConst // pc=1
	istore_2 
	goto Label10
	astore_3 
	bipush 10
	ireturn 
Label10:
	iload_2 
	iconst_1 
	if_icmpge Label15
	bipush 10
	ireturn 
Label15:
	iconst_1 
	istore_4 
	aload_0 
	iload_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.newArray // pc=2
	istore_3 
	iload_3 
	bipush 6
	if_icmpne Label30
	bipush 2
	istore_4 
	goto Label30
	astore_5 
	bipush 10
	ireturn 
Label30:
	aconst_null 
	astore_5 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.getMaxStack // pc=1
	istore_7 
	iload_2 
	newarray 6
	astore 10
	iload_2 
	newarray 1
	astore_6 
	iload_7 
	newarray 6
	astore 8
	iload_7 
	newarray 1
	astore 9
	goto Label51
	astore 11
	bipush 10
	ireturn 
Label51:
	iconst_0 
	istore 11
	iconst_0 
	istore 12
	aload 9
	iload 12
	iconst_1 
	bastore 
	iinc 12 1
Label60:
	iload 11
	iload_2 
	if_icmpne Label64
	goto_w Label255
Label64:
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.dup // pc=1
	aload 9
	iload 12
	aload 9
	iload 12
	iconst_1 
	isub 
	baload 
	bastore 
	aload 8
	iload 12
	aload 8
	iload 12
	iconst_1 
	isub 
	laload 
	lastore 
	iinc 12 1
	goto Label60
	astore 13
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.dup2 // pc=1
	aload 9
	iload 12
	aload 9
	iload 12
	bipush 2
	isub 
	baload 
	bastore 
	aload 8
	iload 12
	aload 8
	iload 12
	bipush 2
	isub 
	laload 
	lastore 
	iinc 12 1
	aload 9
	iload 12
	aload 9
	iload 12
	bipush 2
	isub 
	baload 
	bastore 
	aload 8
	iload 12
	aload 8
	iload 12
	bipush 2
	isub 
	laload 
	lastore 
	iinc 12 1
	goto Label60
	astore 13
	aload 8
	iload 12
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.intConst // pc=1
	i2l 
	lastore 
	aload 9
	iload 12
	iconst_0 
	bastore 
	iinc 12 1
	goto_w Label60
	astore 13
	aload 8
	iload 12
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.stringConst // pc=1
	i2l 
	lastore 
	aload 9
	iload 12
	iconst_1 
	bastore 
	iinc 12 1
	goto_w Label60
	astore 13
	aload 8
	iload 12
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.longConst // pc=1
	lastore 
	aload 9
	iload 12
	iconst_0 
	bastore 
	iinc 12 1
	aload 9
	iload 12
	iconst_0 
	bastore 
	iinc 12 1
	goto_w Label60
	astore 13
	aload_0 
	iload_3 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.arrayStore // pc=2
	iload 12
	iconst_1 
	iload_4 
	iadd 
	isub 
	istore 13
	iload 12
	iload_4 
	isub 
	istore 14
	iload 12
	bipush 2
	iload_4 
	iadd 
	isub 
	istore 15
	aload 9
	iload 15
	baload 
	ifne Label191
	bipush 10
	ireturn 
Label191:
	aload 9
	iload 13
	baload 
	ifeq Label197
	bipush 10
	ireturn 
Label197:
	iload_3 
	bipush 14
	if_icmpne Label206
	aload 9
	iload 14
	baload 
	ifne Label212
	bipush 10
	ireturn 
Label206:
	aload 9
	iload 14
	baload 
	ifeq Label212
	bipush 10
	ireturn 
Label212:
	aload 8
	iload 13
	laload 
	l2i 
	istore 16
	aload 10
	iload 16
	aload 8
	iload 14
	laload 
	lastore 
	aload_6 
	iload 16
	baload 
	ifne Label228
	iinc 11 1
Label228:
	aload_6 
	iload 16
	iconst_1 
	bastore 
	iload 15
	istore 12
	goto Label238
	astore 13
	bipush 10
	ireturn 
Label238:
	iload 11
	iload_2 
	if_icmpeq Label242
	goto_w Label60
Label242:
	iload 12
	iconst_1 
	if_icmpeq Label246
	goto_w Label60
Label246:
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.anyStore // pc=1
	astore_5 
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	goto Label255
	astore 13
	goto_w Label60
Label255:
	iload 12
	iconst_1 
	if_icmpeq Label260
	bipush 10
	ireturn 
Label260:
	iload_3 
	bipush 14
	if_icmpne Label286
	aload_0 
	iload_2 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_2 
	iconst_1 
	isub 
	istore 13
Label271:
	iload 13
	iflt Label294
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload 13
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload 10
	iload 13
	laload 
	l2i 
	invokevirtual_short .virtual_4 // idx=4 pc=2
	checkcast ConstantPoolString
	invokenonvirtual net.rim.tools.compiler.classfile.ConstantPoolString.getString // pc=1
	aastore 
	iinc 13 -1
	goto Label271
Label286:
	aload_0 
	new ConstantPoolArrayData
	dup 
	iload_3 
	aload 10
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.ConstantPoolArrayData.<init> // pc=4
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label294:
	iload_3 
	ireturn 
	astore 13
	bipush 10
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final walk( net.rim.tools.compiler.classfile.JavaByteCodes, int, byte[], net.rim.tools.compiler.classfile.ConstantPool, net.rim.tools.compiler.analysis.InstructionResolver ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	astore_5 
	iload_1 
	bipush 4
	iand 
	ifeq Label9
	iconst_1 
	goto Label10
Label9:
	iconst_0 
Label10:
	istore_6 
	iload_1 
	sipush 8192
	iand 
	ifeq Label17
	iconst_1 
	goto Label18
Label17:
	iconst_0 
Label18:
	istore_7 
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_4 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label31:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	if_icmplt Label36
	goto_w Label423
Label36:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	istore 8
	iload_6 
	ifeq Label62
	aload_0 
	iload_7 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.arrayInit // pc=2
	dup 
	istore 9
	bipush 10
	if_icmpeq Label62
	iload 9
	bipush 14
	if_icmpne Label56
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload 8
	sipush 205
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=4
	goto Label31
Label56:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload 8
	sipush 204
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=4
	goto Label31
Label62:
	aload_0 
	iload 8
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aconst_null 
	astore 10
	getstatic opcodeType // JavaByteCodes
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.nextOpcode // pc=1
	iaload 
	tableswitch  :
		
		
		
		
		
		
		
		
		

Label72:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label74:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	astore_5 
	aload_5 
	iconst_0 
	aload_0 
	iconst_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	iastore 
	aload_5 
	iconst_1 
	aload_0 
	iconst_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	iastore 
	aload_0 
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.classify // pc=4
	goto_w Label31
Label94:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	bipush 2
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore 10
	aload 10
	checkcastbranch 
	astore 11
	aload_0 
	iconst_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	istore 12
	aload_0 
	iconst_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	ifeq Label116
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	ldc literal_452:"Fourth byte of invokeinterface operands must be zero."
	invokespecial_lib .routine_9845 // pc=2
	athrow 
Label116:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload 11
	iload 12
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=5
	goto_w Label31
Label123:
	invokestatic invalid(  ) // ConstantPoolEntry
	goto_w Label31
Label125:
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic int align( int ) // JavaByteCodes
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	bipush 4
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	iload 8
	iadd 
	istore 11
	aload_0 
	bipush 4
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	istore 12
	iload 12
	istore 13
	iload 13
	iflt Label148
	iload 13
	sipush 4096
	if_icmple Label150
Label148:
	iconst_0 
	istore 13
Label150:
	bipush 2
	iload 13
	imul 
	bipush 2
	iadd 
	newarray 5
	astore_5 
	iconst_0 
	istore 14
	aload_5 
	iload 14
	iinc 14 1
	iload 11
	iastore 
	aload_5 
	iload 14
	iinc 14 1
	iload 12
	iastore 
Label169:
	iinc 13 -1
	iload 13
	iflt Label189
	aload_5 
	iload 14
	iinc 14 1
	aload_0 
	bipush 4
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	iastore 
	aload_5 
	iload 14
	iinc 14 1
	aload_0 
	bipush 4
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	iload 8
	iadd 
	iastore 
	goto Label169
Label189:
	aload_0 
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.classify // pc=4
	goto_w Label31
Label195:
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic int align( int ) // JavaByteCodes
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	bipush 4
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	iload 8
	iadd 
	istore 11
	aload_0 
	bipush 4
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	istore 12
	aload_0 
	bipush 4
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	istore 13
	iload 13
	iload 12
	isub 
	iconst_1 
	iadd 
	istore 14
	iload 13
	iload 12
	if_icmplt Label229
	iload 14
	iflt Label229
	iload 14
	sipush 8192
	if_icmple Label231
Label229:
	iconst_1 
	istore 14
Label231:
	bipush 3
	iload 14
	iadd 
	newarray 5
	astore_5 
	iconst_0 
	istore 15
	aload_5 
	iload 15
	iinc 15 1
	iload 11
	iastore 
	aload_5 
	iload 15
	iinc 15 1
	iload 12
	iastore 
	aload_5 
	iload 15
	iinc 15 1
	iload 13
	iastore 
Label253:
	iinc 14 -1
	iload 14
	iflt Label266
	aload_5 
	iload 15
	iinc 15 1
	aload_0 
	bipush 4
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedConst // pc=2
	iload 8
	iadd 
	iastore 
	goto Label253
Label266:
	aload_0 
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.classify // pc=4
	goto_w Label31
Label272:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	bipush 2
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	invokevirtual_short .virtual_4 // idx=4 pc=2
	astore 10
	aload 10
	checkcastbranch 
	astore 11
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload 11
	aload_0 
	iconst_1 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	iconst_0 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionResolver.walkByteCode // pc=6
	goto_w Label31
Label291:
	invokestatic invalid(  ) // ConstantPoolEntry
	goto_w Label31
Label293:
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.nextOpcode // pc=1
Label296:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	astore_5 
	aload_5 
	iconst_0 
	aload_0 
	bipush 2
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	iastore 
	aload_5 
	iconst_1 
	aload_0 
	bipush 2
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	iastore 
	goto Label332
Label311:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_5 
	aload_5 
	iconst_0 
	aload_0 
	bipush 2
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedConst // pc=2
	iastore 
	goto Label332
Label320:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_453:"Bad opcode suffix of wide opcode: 0x"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9845 // pc=2
	athrow 
Label332:
	aload_0 
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.classify // pc=4
	goto_w Label31
Label338:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	astore_5 
	aload_0 
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.classify // pc=4
	goto_w Label31
Label346:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_5 
	aload_5 
	iconst_0 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedImmedOp // pc=1
	iload 8
	iadd 
	iastore 
	aload_0 
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.classify // pc=4
	goto_w Label31
Label361:
	aload_0 
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedImmedOp // pc=1
	invokevirtual_short .virtual_4 // idx=4 pc=2
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.classify // pc=4
	goto_w Label31
Label370:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_5 
	aload_5 
	iconst_0 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedImmedOp // pc=1
	iastore 
	aload_0 
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.classify // pc=4
	goto_w Label31
Label383:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_5 
	aload_5 
	iconst_0 
	aload_0 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.unsignedImmedOp // pc=1
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.translateTypeEnum // pc=2
	iastore 
	aload_0 
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.classify // pc=4
	goto_w Label31
Label398:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_5 
	aload_5 
	iconst_0 
	aload_0 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.signedImmedOp // pc=1
	iastore 
	aload_0 
	iload 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokespecial net.rim.tools.compiler.classfile.JavaByteCodes.classify // pc=4
	goto_w Label31
Label411:
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_454:"Bad opcode: 0x"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9845 // pc=2
	athrow 
Label423:
	aload_0 
	aconst_null 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aconst_null 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public final fini( net.rim.tools.compiler.classfile.JavaByteCodes ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aconst_null 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}

}
