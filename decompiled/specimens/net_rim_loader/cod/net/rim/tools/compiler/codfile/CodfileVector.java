// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 39
// ########################################################


package net.rim.tools.compiler.codfile;


public class CodfileVector extends java.util.Vector
implements net.rim.tools.compiler.vm.Constants

{

	// @@@@@@@@@@@@@ Fields 
	protected int /*int*/  _align ; // ofs = 19024 addr = 0)
	protected boolean /*boolean*/  _sizePrefix ; // ofs = 19028 addr = 0)
	protected boolean /*boolean*/  _sizePrefixNegative ; // ofs = 19032 addr = 0)
	protected int /*int*/  _offset ; // ofs = 19036 addr = 0)
	protected int /*int*/  _extent ; // ofs = 19040 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.codfile.CodfileVector, int, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.util.Vector.<init> // pc=1
	aload_0 
	iload_1 
	putfield _align   // get_name_1:  _align   // get_name_2:  _align   // get_Name:    _align   // getName->1:  _align   // getName->2:  _align   // getName->N:  _align   // ofs = 19024 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield _sizePrefix   // get_name_1:  _sizePrefix   // get_name_2:  _sizePrefix   // get_Name:    _sizePrefix   // getName->1:  _sizePrefix   // getName->2:  _sizePrefix   // getName->N:  _sizePrefix   // ofs = 19028 ord = 1 addr = 0
	return 
	}


public <init>( net.rim.tools.compiler.codfile.CodfileVector, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	iload_1 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	return 
	}


public <init>( net.rim.tools.compiler.codfile.CodfileVector, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	return 
	}


public <init>( net.rim.tools.compiler.codfile.CodfileVector ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.<init> // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private int writePrefix( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield _align   // get_name_1:  _align   // get_name_2:  _align   // get_Name:    _align   // getName->1:  _align   // getName->2:  _align   // getName->N:  _align   // ofs = 19024 ord = 0 addr = 0
	invokevirtual int writeSlack( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	pop 
	aload_0 
	aload_1 
	invokevirtual setOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	aload_0 
	invokevirtual routine
	istore_3 
	aload_0_getfield _sizePrefix   // get_name_1:  _sizePrefix   // get_name_2:  _sizePrefix   // get_Name:    _sizePrefix   // getName->1:  _sizePrefix   // getName->2:  _sizePrefix   // getName->N:  _sizePrefix   // ofs = 19028 ord = 1 addr = 0
	ifeq Label23
	iload_3 
	istore_4 
	aload_0_getfield _sizePrefixNegative   // get_name_1:  _sizePrefixNegative   // get_name_2:  _sizePrefixNegative   // get_Name:    _sizePrefixNegative   // getName->1:  _sizePrefixNegative   // getName->2:  _sizePrefixNegative   // getName->N:  _sizePrefixNegative   // ofs = 19032 ord = 2 addr = 0
	ifeq Label20
	iload_3 
	ineg 
	istore_4 
Label20:
	aload_1 
	iload_4 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
Label23:
	iload_3 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public negatePrefix( net.rim.tools.compiler.codfile.CodfileVector ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield _sizePrefixNegative   // get_name_1:  _sizePrefixNegative   // get_name_2:  _sizePrefixNegative   // get_Name:    _sizePrefixNegative   // getName->1:  _sizePrefixNegative   // getName->2:  _sizePrefixNegative   // getName->N:  _sizePrefixNegative   // ofs = 19032 ord = 2 addr = 0
	return 
	}


public writeOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield _offset   // get_name_1:  _offset   // get_name_2:  _offset   // get_Name:    _offset   // getName->1:  _offset   // getName->2:  _offset   // getName->N:  _offset   // ofs = 19036 ord = 3 addr = 0
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	return 
	}


public write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.writePrefix // pc=3
	istore_3 
	iconst_0 
	istore_4 
Label8:
	iload_4 
	iload_3 
	if_icmpge Label21
	aload_0 
	iload_4 
	invokevirtual routine
	checkcast CodfileItem
	astore_5 
	aload_5 
	aload_1 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileItem, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	iinc 4 1
	goto Label8
Label21:
	aload_0 
	aload_1 
	invokevirtual setExtent( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ) // pc=2
	return 
	}


public write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_0 
	invokevirtual write( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream, boolean ) // pc=3
	return 
	}


public writeOffsets( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.codfile.CodfileVector.writePrefix // pc=3
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_2 
	if_icmpge Label24
	aload_0 
	iload_3 
	invokevirtual routine
	checkcast CodfileItem
	astore_4 
	aload_4 
	invokevirtual int getOffset( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	istore_5 
	aload_1 
	iload_5 
	invokevirtual writeShort( net.rim.tools.compiler.io.StructuredOutputStream, int ) // pc=2
	iinc 3 1
	goto Label8
Label24:
	return 
	}


public setOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	putfield _offset   // get_name_1:  _offset   // get_name_2:  _offset   // get_Name:    _offset   // getName->1:  _offset   // getName->2:  _offset   // getName->N:  _offset   // ofs = 19036 ord = 3 addr = 0
	return 
	}


public setExtent( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.io.StructuredOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.io.StructuredOutputStream ) // pc=1
	aload_0_getfield _offset   // get_name_1:  _offset   // get_name_2:  _offset   // get_Name:    _offset   // getName->1:  _offset   // getName->2:  _offset   // getName->N:  _offset   // ofs = 19036 ord = 3 addr = 0
	isub 
	putfield _extent   // get_name_1:  _extent   // get_name_2:  _extent   // get_Name:    _extent   // getName->1:  _extent   // getName->2:  _extent   // getName->N:  _extent   // ofs = 19040 ord = 4 addr = 0
	return 
	}


public int getExtent( net.rim.tools.compiler.codfile.CodfileVector ); // address: 0
	{
	ireturn_field _extent   // get_name_1:  _extent   // get_name_2:  _extent   // get_Name:    _extent   // getName->1:  _extent   // getName->2:  _extent   // getName->N:  _extent   // ofs = 19040 ord = 4 addr = 0
	}


public int addElementOrdered( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual routine
	istore_2 
	iload_2 
	iconst_1 
	isub 
	istore_3 
	iconst_0 
	istore_4 
Label10:
	iload_4 
	iload_3 
	if_icmpgt Label38
	iload_4 
	iload_3 
	iadd 
	bipush 2
	idiv 
	istore_5 
	aload_0 
	iload_5 
	invokevirtual routine
	checkcast CodfileItem
	astore_6 
	aload_1 
	aload_6 
	invokevirtual int compareTo( net.rim.tools.compiler.codfile.CodfileItem, java.lang.Object ) // pc=2
	ifge Label33
	iload_5 
	iconst_1 
	isub 
	istore_3 
	goto Label10
Label33:
	iload_5 
	iconst_1 
	iadd 
	istore_4 
	goto Label10
Label38:
	aload_0 
	aload_1 
	iload_4 
	invokevirtual routine
	iload_4 
	ireturn 
	}


public addItemOffset( net.rim.tools.compiler.codfile.CodfileVector, net.rim.tools.compiler.codfile.CodfileItem ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	istore_2 
	iload_2 
	ifgt Label11
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	ldc literal_352:"item has no offset"
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=2
	athrow 
Label11:
	aload_0 
	invokevirtual routine
	istore_3 
	iload_3 
	iconst_1 
	isub 
	istore_4 
	iconst_0 
	istore_5 
	iload_3 
	ifle Label35
	aload_0 
	iload_4 
	invokevirtual routine
	checkcast CodfileItem
	astore_6 
	iload_2 
	aload_6 
	invokevirtual int getOffset( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	if_icmple Label35
	aload_0 
	aload_1 
	invokevirtual routine
	return 
Label35:
	iload_5 
	iload_4 
	if_icmpgt Label63
	iload_5 
	iload_4 
	iadd 
	bipush 2
	idiv 
	istore_6 
	aload_0 
	iload_6 
	invokevirtual routine
	checkcast CodfileItem
	astore_7 
	iload_2 
	aload_7 
	invokevirtual int getOffset( net.rim.tools.compiler.codfile.CodfileItem ) // pc=1
	if_icmpge Label58
	iload_6 
	iconst_1 
	isub 
	istore_4 
	goto Label35
Label58:
	iload_6 
	iconst_1 
	iadd 
	istore_5 
	goto Label35
Label63:
	aload_0 
	aload_1 
	iload_5 
	invokevirtual routine
	return 
	}

}
