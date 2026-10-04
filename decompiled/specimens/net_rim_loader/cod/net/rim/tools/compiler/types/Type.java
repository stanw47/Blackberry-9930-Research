// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-2.cod
// Module version  : 7.1.0.1066
// Class ID        : 49
// ########################################################


package net.rim.tools.compiler.types;


public class Type extends Object
implements net.rim.tools.compiler.vm.Constants

{
	// @@@@@@@@@@@@@ Static fields 
	private static java.util.Vector /*java.util.Vector*/  _items ; // ofs = 13128 addr = 123)

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.types.Type, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


static public final net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnonnull Label8
	aload_0 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getDataSection // pc=1
	invokenonvirtual_lib .routine_28017 // pc=1
	invokenonvirtual net.rim.tools.compiler.codfile.TypeLists.getEmptyTypeList // pc=1
	areturn 
Label8:
	aload_1 
	aload_0 
	invokevirtual net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.TypeModule ) // pc=2
	areturn 
	}


static public final net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.NameAndType[] ); // address: 0
	{
	enter 
	aconst_null 
	astore_5 
	getstatic _items // Type
	dup 
	astore_6 
	monitorenter 
	getstatic _items // Type
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_1 
	ifnull Label17
	getstatic _items // Type
	aload_1 
	aload_0 
	invokevirtual net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.TypeModule ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label17:
	aload_2 
	ifnull Label61
	aload_2 
	arraylength 
	istore_4 
	iconst_0 
	istore_3 
Label24:
	iload_3 
	iload_4 
	if_icmpge Label61
	aload_2 
	iload_3 
	aaload 
	invokevirtual net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	astore_7 
	aload_7 
	aload_0 
	invokevirtual net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.TypeModule ) // pc=2
	astore 8
	getstatic _items // Type
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_7 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label59
	iload_3 
	iload_4 
	iconst_1 
	isub 
	if_icmpge Label59
	aload_2 
	iload_3 
	iconst_1 
	iadd 
	aaload 
	invokevirtual net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	astore_7 
	aload_7 
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 10
	if_icmpne Label59
	iinc 3 1
Label59:
	iinc 3 1
	goto Label24
Label61:
	getstatic _items // Type
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	iload_4 
	iconst_1 
	isub 
	istore_3 
Label68:
	iload_3 
	iflt Label85
	getstatic _items // Type
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast TypeItem
	astore_7 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.codfile.TypeItem.getId // pc=1
	bipush 10
	if_icmpeq Label80
	goto Label85
Label80:
	getstatic _items // Type
	iload_3 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	iinc 3 -1
	goto Label68
Label85:
	new TypeList
	dup 
	getstatic _items // Type
	invokespecial net.rim.tools.compiler.codfile.TypeList.<init> // pc=2
	astore_5 
	getstatic _items // Type
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_6 
	monitorexit 
	goto Label101
	astore 9
	aload_6 
	monitorexit 
	aload 9
	athrow 
Label101:
	aload_5 
	areturn 
	}


static public final net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.TypeModule, net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type[], int, boolean ); // address: 0
	{
	enter 
	aconst_null 
	astore_5 
	getstatic _items // Type
	dup 
	astore_6 
	monitorenter 
	getstatic _items // Type
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_1 
	ifnull Label17
	getstatic _items // Type
	aload_1 
	aload_0 
	invokevirtual net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.TypeModule ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label17:
	iconst_0 
	istore_7 
Label19:
	iload_7 
	iload_3 
	if_icmpge Label54
	aload_2 
	iload_7 
	aaload 
	astore 8
	aload 8
	aload_0 
	invokevirtual net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.TypeModule ) // pc=2
	astore 9
	getstatic _items // Type
	aload 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload 8
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label52
	iload_7 
	iload_3 
	iconst_1 
	isub 
	if_icmpge Label52
	aload_2 
	iload_7 
	iconst_1 
	iadd 
	aaload 
	astore 8
	aload 8
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 10
	if_icmpne Label52
	iinc 7 1
Label52:
	iinc 7 1
	goto Label19
Label54:
	iload_4 
	ifeq Label80
	getstatic _items // Type
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_7 
	iload_7 
	iconst_1 
	isub 
	istore 8
Label63:
	iload 8
	iflt Label80
	getstatic _items // Type
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast TypeItem
	astore 9
	aload 9
	invokenonvirtual net.rim.tools.compiler.codfile.TypeItem.getId // pc=1
	bipush 10
	if_icmpeq Label75
	goto Label80
Label75:
	getstatic _items // Type
	iload 8
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	iinc 8 -1
	goto Label63
Label80:
	new TypeList
	dup 
	getstatic _items // Type
	invokespecial net.rim.tools.compiler.codfile.TypeList.<init> // pc=2
	astore_5 
	getstatic _items // Type
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_6 
	monitorexit 
	goto Label96
	astore 10
	aload_6 
	monitorexit 
	aload 10
	athrow 
Label96:
	aload_5 
	areturn 
	}


static public final net.rim.tools.compiler.types.Type translateType( net.rim.tools.compiler.Compiler, module:net_rim_loader-1.class#81 ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	iconst_0 
	istore_3 
Label5:
	aload_1 
	bipush 91
	invokevirtual_short .virtual_4 // idx=4 pc=2
	ifeq Label11
	iinc 3 1
	goto Label5
Label11:
	aload_1 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	istore_4 
	iload_4 
Label16:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getByteType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label70
Label20:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getCharType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label70
Label24:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getDoubleType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label70
Label28:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getFloatType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label70
Label32:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getIntType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label70
Label36:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getLongType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label70
Label40:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getShortType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label70
Label44:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getBooleanType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	goto Label70
Label48:
	aload_0 
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=1
	invokevirtual net.rim.tools.compiler.types.ClassType findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore_2 
	goto Label70
Label54:
	new CompileException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_549:"bad TypeDescriptor parse: '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	ldc literal_550:"' in "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=2
	athrow 
Label70:
	aload_2 
	ifnull Label79
Label72:
	iload_3 
	ifle Label79
	aload_2 
	invokevirtual net.rim.tools.compiler.types.ArrayType getArrayType( net.rim.tools.compiler.types.Type ) // pc=1
	astore_2 
	iinc 3 -1
	goto Label72
Label79:
	aload_2 
	areturn 
	}


static public final translateTypes( net.rim.tools.compiler.Compiler, module:net_rim_loader-1.class#81, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_1 
	bipush 40
	invokevirtual_short .virtual_4 // idx=4 pc=2
	ifeq Label15
Label5:
	aload_1 
	bipush 41
	invokevirtual_short .virtual_4 // idx=4 pc=2
	ifne Label15
	aload_2 
	aload_0 
	aload_1 
	invokestatic net.rim.tools.compiler.types.Type translateType( net.rim.tools.compiler.Compiler, module:net_rim_loader-1.class#81 ) // Type
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label5
Label15:
	return 
	}


static private final net.rim.tools.compiler.types.Type translateStackMapType( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, module:net_rim_loader-1.class#12, byte[], net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aconst_null 
	astore_5 
	aconst_null 
	astore_6 
	aload_2 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	tableswitch  :
		
		
		
		
		
		
		
		
		
		

Label8:
	aload_4 
	astore_5 
	goto_w Label121
Label11:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getFloatType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_5 
	goto_w Label121
Label15:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getIntType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_5 
	goto_w Label121
Label19:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getDoubleType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_5 
	goto_w Label121
Label23:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getLongType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_5 
	goto_w Label121
Label27:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getNullType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_5 
	goto_w Label121
Label31:
	aload_1 
	aload_0 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setReachable // pc=3
	new ClassUninitializedType
	dup 
	aload_1 
	iconst_0 
	invokespecial net.rim.tools.compiler.types.ClassUninitializedType.<init> // pc=3
	astore_5 
	goto_w Label121
Label42:
	aload_2 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	astore_6 
	aload_6 
	iconst_0 
	stringaload 
	bipush 91
	if_icmpne Label58
	aload_0 
	new_lib net.rim.tools.compiler.classfile.TypeDescriptor//module:net_rim_loader-1.class#81 module:net_rim_loader-1.class#81 module:net_rim_loader-1.class#81
	dup 
	aload_6 
	invokespecial_lib .routine_53166 // pc=2
	invokestatic net.rim.tools.compiler.types.Type translateType( net.rim.tools.compiler.Compiler, module:net_rim_loader-1.class#81 ) // Type
	astore_5 
	goto Label121
Label58:
	aload_0 
	aload_6 
	bipush 47
	bipush 46
	invokenonvirtual_lib java.lang.String.replace // pc=3
	invokevirtual net.rim.tools.compiler.types.ClassType findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore_1 
	aload_1 
	aload_0 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setReachable // pc=3
	aload_1 
	astore_5 
	goto Label121
Label72:
	aload_2 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	istore_7 
	aload_3 
	iload_7 
	iconst_1 
	iadd 
	baload 
	bipush 8
	ishl 
	aload_3 
	iload_7 
	bipush 2
	iadd 
	baload 
	sipush 255
	iand 
	ior 
	istore 8
	aload_2 
	iload 8
	invokevirtual_short .virtual_6 // idx=6 pc=2
	astore 9
	aload 9
	invokenonvirtual_lib .routine_25310 // pc=1
	astore_6 
	goto Label106
	astore 9
	new CompileException
	dup 
	aload 9
	invokevirtual java.lang.String getMessage( java.io.IOException ) // pc=1
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=2
	athrow 
Label106:
	aload_0 
	aload_6 
	invokevirtual net.rim.tools.compiler.types.ClassType findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore_1 
	aload_1 
	aload_0 
	iconst_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.setReachable // pc=3
	new ClassUninitializedType
	dup 
	aload_1 
	iload_7 
	iconst_1 
	invokespecial net.rim.tools.compiler.types.ClassUninitializedType.<init> // pc=4
	astore_5 
Label121:
	aload_5 
	areturn 
	}


static private net.rim.tools.compiler.types.Type[] translateStackMapTypes( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, module:net_rim_loader-1.class#12[], byte[], net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aconst_null 
	astore_5 
	aload_2 
	ifnonnull Label7
	iconst_0 
	goto Label9
Label7:
	aload_2 
	arraylength 
Label9:
	istore_6 
	iload_6 
	ifle Label69
	iload_6 
	istore_7 
	iconst_0 
	istore 8
Label16:
	iload 8
	iload_6 
	if_icmpge Label33
	aload_2 
	iload 8
	aaload 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	istore 9
	iload 9
	bipush 4
	if_icmpeq Label30
	iload 9
	bipush 3
	if_icmpne Label31
Label30:
	iinc 7 1
Label31:
	iinc 8 1
	goto Label16
Label33:
	iload_7 
	newarray_object Type
	astore_5 
	iconst_0 
	istore 8
	iconst_0 
	istore 9
Label40:
	iload 9
	iload_6 
	if_icmpge Label69
	aload_0 
	aload_1 
	aload_2 
	iload 9
	aaload 
	aload_3 
	aload_4 
	invokestatic net.rim.tools.compiler.types.Type translateStackMapType( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, module:net_rim_loader-1.class#12, byte[], net.rim.tools.compiler.types.Type ) // Type
	astore 10
	aload_5 
	iload 8
	iinc 8 1
	aload 10
	aastore 
	aload 10
	ifnull Label67
	aload 10
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label67
	aload_5 
	iload 8
	iinc 8 1
	aload_4 
	aastore 
Label67:
	iinc 9 1
	goto Label40
Label69:
	aload_5 
	areturn 
	}


static public final translateStackMapEntry( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, module:net_rim_loader-1.class#9, byte[] ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getVoidType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_4 
	aload_2 
	aload_0 
	aload_1 
	aload_2 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	aload_3 
	aload_4 
	invokestatic net.rim.tools.compiler.types.Type[] translateStackMapTypes( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, module:net_rim_loader-1.class#12[], byte[], net.rim.tools.compiler.types.Type ) // Type
	invokevirtual_short .virtual_6 // idx=6 pc=2
	aload_2 
	aload_0 
	aload_1 
	aload_2 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	aload_3 
	aload_4 
	invokestatic net.rim.tools.compiler.types.Type[] translateStackMapTypes( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, module:net_rim_loader-1.class#12[], byte[], net.rim.tools.compiler.types.Type ) // Type
	invokevirtual_short .virtual_9 // idx=9 pc=2
	return 
	}


static public final translateStackMapFrame( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, net.rim.tools.compiler.types.Type[], net.rim.tools.compiler.types.Type[], module:net_rim_loader-1.class#10, byte[] ); // address: 0
	{
	enter 
	aload_4 
	invokevirtual_short .virtual_12 // idx=12 pc=1
	istore_6 
	iload_6 
	tableswitch  :
		
		
		
		
		
		
		
		
		

Label6:
	aload_4 
	aload_2 
	invokestatic net.rim.tools.compiler.types.Type[] clone( net.rim.tools.compiler.types.Type[] ) // MyArrays
	invokevirtual_short .virtual_6 // idx=6 pc=2
	aload_4 
	aconst_null 
	invokevirtual_short .virtual_9 // idx=9 pc=2
	return 
Label14:
	aload_4 
	aload_2 
	invokestatic net.rim.tools.compiler.types.Type[] clone( net.rim.tools.compiler.types.Type[] ) // MyArrays
	invokevirtual_short .virtual_6 // idx=6 pc=2
	aload_4 
	aload_0 
	aload_1 
	aload_4 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	aload_5 
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getVoidType( net.rim.tools.compiler.Compiler ) // pc=1
	invokestatic net.rim.tools.compiler.types.Type[] translateStackMapTypes( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, module:net_rim_loader-1.class#12[], byte[], net.rim.tools.compiler.types.Type ) // Type
	invokevirtual_short .virtual_9 // idx=9 pc=2
	return 
Label29:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getVoidType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_7 
	aload_4 
	invokevirtual_short .virtual_13 // idx=13 pc=1
	istore 8
	aload_2 
	arraylength 
	istore 9
	iload 9
	iload 8
	isub 
	istore 10
	iconst_1 
	istore 11
Label44:
	iload 11
	iload 8
	if_icmpgt Label71
	aload_2 
	iload 9
	iload 11
	isub 
	aaload 
	aload_7 
	if_acmpne Label69
	iload 9
	iload 11
	isub 
	ifle Label69
	aload_2 
	iload 9
	iload 11
	isub 
	iconst_1 
	isub 
	aaload 
	invokevirtual boolean isTwoWord( net.rim.tools.compiler.types.Type ) // pc=1
	ifeq Label69
	iinc 9 -1
	iinc 10 -1
Label69:
	iinc 11 1
	goto Label44
Label71:
	iload 10
	newarray_object Type
	astore 11
	aload_2 
	iconst_0 
	aload 11
	iconst_0 
	iload 10
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_4 
	aload 11
	invokevirtual_short .virtual_6 // idx=6 pc=2
	aload_4 
	aconst_null 
	invokevirtual_short .virtual_9 // idx=9 pc=2
	return 
Label87:
	aload_0 
	aload_1 
	aload_4 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	aload_5 
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getVoidType( net.rim.tools.compiler.Compiler ) // pc=1
	invokestatic net.rim.tools.compiler.types.Type[] translateStackMapTypes( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, module:net_rim_loader-1.class#12[], byte[], net.rim.tools.compiler.types.Type ) // Type
	astore_7 
	aload_2 
	ifnonnull Label100
	iconst_0 
	goto Label102
Label100:
	aload_2 
	arraylength 
Label102:
	istore 8
	iload 8
	aload_7 
	arraylength 
	iadd 
	newarray_object Type
	astore 9
	iload 8
	ifle Label117
	aload_2 
	iconst_0 
	aload 9
	iconst_0 
	iload 8
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
Label117:
	aload_7 
	iconst_0 
	aload 9
	iload 8
	aload_7 
	arraylength 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_4 
	aload 9
	invokevirtual_short .virtual_6 // idx=6 pc=2
	aload_4 
	aconst_null 
	invokevirtual_short .virtual_9 // idx=9 pc=2
	return 
Label131:
	aload_0 
	invokevirtual net.rim.tools.compiler.types.Type getVoidType( net.rim.tools.compiler.Compiler ) // pc=1
	astore_7 
	aload_4 
	aload_0 
	aload_1 
	aload_4 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	aload_5 
	aload_7 
	invokestatic net.rim.tools.compiler.types.Type[] translateStackMapTypes( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, module:net_rim_loader-1.class#12[], byte[], net.rim.tools.compiler.types.Type ) // Type
	invokevirtual_short .virtual_6 // idx=6 pc=2
	aload_4 
	aload_0 
	aload_1 
	aload_4 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	aload_5 
	aload_7 
	invokestatic net.rim.tools.compiler.types.Type[] translateStackMapTypes( net.rim.tools.compiler.Compiler, net.rim.tools.compiler.types.ClassType, module:net_rim_loader-1.class#12[], byte[], net.rim.tools.compiler.types.Type ) // Type
	invokevirtual_short .virtual_9 // idx=9 pc=2
	return 
Label153:
	new CompileException
	dup 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getFullName // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_551:"Bad AttributeStackMapFrame type: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=3
	athrow 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	synch_static Type
	clinit_wait 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putstatic _items // Type
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String getName( net.rim.tools.compiler.types.Type ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public java.lang.String getFullName( net.rim.tools.compiler.types.Type ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final int getLocalCount( net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getSize( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 3
	iadd 
	bipush 4
	idiv 
	ireturn 
	}


public final boolean isTwoWord( net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getSize( net.rim.tools.compiler.types.Type ) // pc=1
	bipush 8
	if_icmpne Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public net.rim.tools.compiler.types.ArrayType getArrayType( net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label10
	aload_0 
	new ArrayType
	dup 
	aload_0 
	iconst_1 
	invokespecial net.rim.tools.compiler.types.ArrayType.<init> // pc=3
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label10:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	areturn 
	}


abstract public int getSize( net.rim.tools.compiler.types.Type ); // address: 0
	{
	halt 
	}


abstract public int getTypeId( net.rim.tools.compiler.types.Type ); // address: 0
	{
	halt 
	}


public boolean equals( net.rim.tools.compiler.types.Type, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	if_acmpne Label6
	iconst_1 
	ireturn 
Label6:
	aload_1 
	checkcastbranch 
	astore_2 
	aload_0 
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.types.Type ) // pc=1
	aload_2 
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}


public int hashCode( net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual_short .virtual_ // idx=0 pc=1
	ireturn 
	}


public final boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_1 
	aload_0 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label7
	iconst_1 
	ireturn 
Label7:
	aload_1 
	instanceof BaseType
	ifeq Label31
	aload_0 
	instanceof BaseType
	ifne Label14
	goto_w Label103
Label14:
	aload_1 
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	istore_2 
	aload_0 
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	istore_3 
	iload_2 
	iload_3 
	if_icmpne Label25
	iconst_1 
	ireturn 
Label25:
	iload_2 
	tableswitch  :
		
		
		
		
		
		

Label27:
	iload_3 
	tableswitch  :
		
		
		
		
		
		

Label29:
	iconst_1 
	ireturn 
Label31:
	aload_1 
	checkcastbranch 
	astore_2 
	aload_2 
	sipush 2048
	invokenonvirtual net.rim.tools.compiler.types.ClassType.is // pc=2
	ifeq Label41
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getBaseClassType // pc=1
	astore_2 
Label41:
	aload_0 
	checkcastbranch 
	astore_3 
	aload_3 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDerivedFrom // pc=2
	ireturn 
Label48:
	aload_0 
	instanceof ArrayType
	ifeq Label59
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.isDefined // pc=1
	ifeq Label103
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getBaseClassType // pc=1
	ifnonnull Label103
	iconst_1 
	ireturn 
Label59:
	aload_0 
	instanceof NullType
	ifeq Label103
	iconst_1 
	ireturn 
Label64:
	aload_1 
	checkcastbranch 
	astore_2 
	aload_0 
	checkcastbranch 
	astore_3 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getNesting // pc=1
	istore_4 
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getNesting // pc=1
	istore_5 
	iload_4 
	iload_5 
	if_icmplt Label103
	aload_2 
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getMostBaseType // pc=1
	astore_6 
	iload_4 
	iload_5 
	if_icmple Label93
	aload_6 
	checkcastbranch 
	astore_7 
	aload_7 
	invokenonvirtual net.rim.tools.compiler.types.ClassType.getBaseClassType // pc=1
	ifnonnull Label103
	iconst_1 
	ireturn 
Label93:
	aload_3 
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getMostBaseType // pc=1
	aload_6 
	invokevirtual boolean verifies( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.Type ) // pc=2
	ireturn 
Label98:
	aload_0 
	instanceof NullType
	ifeq Label103
	iconst_1 
	ireturn 
Label103:
	iconst_0 
	ireturn 
	}


abstract net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	halt 
	}


final net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.Type, int, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label7
	aload_0 
	iload_2 
	newarray_object TypeList
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label7:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	aaload 
	areturn 
	}


final setTypeList( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.codfile.TypeList, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	aload_1 
	aastore 
	return 
	}


net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.TypeModule ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getOrdinal // pc=1
	istore_2 
	aload_0 
	iload_2 
	aload_1 
	invokenonvirtual net.rim.tools.compiler.types.TypeModule.getCount // pc=1
	invokevirtual net.rim.tools.compiler.codfile.TypeList getTypeList( net.rim.tools.compiler.types.Type, int, int ) // pc=3
	astore_3 
	aload_3 
	ifnonnull Label23
	new TypeList
	dup 
	aload_0 
	aload_1 
	invokevirtual net.rim.tools.compiler.codfile.TypeItem makeTypeItem( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.types.TypeModule ) // pc=2
	invokespecial net.rim.tools.compiler.codfile.TypeList.<init> // pc=2
	astore_3 
	aload_0 
	aload_3 
	iload_2 
	invokevirtual setTypeList( net.rim.tools.compiler.types.Type, net.rim.tools.compiler.codfile.TypeList, int ) // pc=3
Label23:
	aload_3 
	areturn 
	}


public final java.lang.String encodeType( net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_0 
	astore_1 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_2 
Label7:
	aload_1 
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	istore_3 
	iload_3 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		

Label12:
	aload_2 
	bipush 90
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto_w Label92
Label17:
	aload_2 
	bipush 66
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto_w Label92
Label22:
	aload_2 
	bipush 67
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto_w Label92
Label27:
	aload_2 
	bipush 83
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto_w Label92
Label32:
	aload_2 
	bipush 73
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label92
Label37:
	aload_2 
	bipush 74
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label92
Label42:
	aload_2 
	bipush 70
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label92
Label47:
	aload_2 
	bipush 68
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label92
Label52:
	aload_2 
	bipush 86
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label92
Label57:
	aload_2 
	bipush 91
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	checkcast ArrayType
	invokenonvirtual net.rim.tools.compiler.types.ArrayType.getBaseType // pc=1
	astore_1 
	goto_w Label7
Label66:
	aload_2 
	bipush 76
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_2 
	aload_1 
	invokevirtual java.lang.String getFullName( net.rim.tools.compiler.types.Type ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label92
Label80:
	new CompileException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_548:"unexpected type id: 0x"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_3 
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial net.rim.tools.compiler.util.CompileException.<init> // pc=2
	athrow 
Label92:
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
