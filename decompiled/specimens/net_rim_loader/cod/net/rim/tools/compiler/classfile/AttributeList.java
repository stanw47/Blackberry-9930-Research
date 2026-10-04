// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader-1.cod
// Module version  : 7.1.0.1066
// Class ID        : 5
// ########################################################


package net.rim.tools.compiler.classfile;


abstract public final class AttributeList extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public static String /*java.lang.String*/  NAME_CODE ; // ofs = 15840 addr = 12)
	public static String /*java.lang.String*/  NAME_DEPRECATED ; // ofs = 15846 addr = 13)
	public static String /*java.lang.String*/  NAME_EXCEPTIONS ; // ofs = 15852 addr = 14)
	public static String /*java.lang.String*/  NAME_INNERCLASSES ; // ofs = 15858 addr = 15)
	public static String /*java.lang.String*/  NAME_LINENUMBERTABLE ; // ofs = 15864 addr = 16)
	public static String /*java.lang.String*/  NAME_LOCALVARIABLETABLE ; // ofs = 15870 addr = 17)
	public static String /*java.lang.String*/  NAME_SIGNATURE ; // ofs = 15876 addr = 18)
	public static String /*java.lang.String*/  NAME_SOURCEFILE ; // ofs = 15882 addr = 19)
	public static String /*java.lang.String*/  NAME_STACKMAP ; // ofs = 15888 addr = 20)
	public static String /*java.lang.String*/  NAME_STACKMAPTABLE ; // ofs = 15894 addr = 21)
	public static String /*java.lang.String*/  NAME_SYNTHETIC ; // ofs = 15900 addr = 22)

	// @@@@@@@@@@@@@ Fields 
	private java.util.Hashtable /*java.util.Hashtable*/  _table ; // ofs = 15836 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.classfile.AttributeList, module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_1 
	invokenonvirtual_lib .routine_23570 // pc=1
	istore_5 
	iload_5 
	ifle Label49
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	iload_5 
	bipush 2
	imul 
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	istore_6 
Label18:
	iload_6 
	iload_5 
	if_icmpge Label49
	aload_1 
	aload_2 
	iload_3 
	iload_4 
	invokestatic net.rim.tools.compiler.classfile.Attribute read( module:net_rim_loader-2.class#45, net.rim.tools.compiler.classfile.ConstantPool, int, boolean ) // Attribute
	astore_7 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_7 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.classfile.Attribute ) // pc=1
	aload_7 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	ifnull Label47
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_308:"duplicate "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.classfile.Attribute ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_309:" attribute"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label47:
	iinc 6 1
	goto Label18
Label49:
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static AttributeList
	clinit_wait 
	ldc literal_310:"Code"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_CODE // AttributeList
	ldc literal_311:"Deprecated"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_DEPRECATED // AttributeList
	ldc literal_312:"Exceptions"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_EXCEPTIONS // AttributeList
	ldc literal_313:"InnerClasses"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_INNERCLASSES // AttributeList
	ldc literal_314:"LineNumberTable"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_LINENUMBERTABLE // AttributeList
	ldc literal_315:"LocalVariableTable"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_LOCALVARIABLETABLE // AttributeList
	ldc literal_316:"Signature"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_SIGNATURE // AttributeList
	ldc literal_317:"SourceFile"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_SOURCEFILE // AttributeList
	ldc literal_318:"StackMap"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_STACKMAP // AttributeList
	ldc literal_319:"StackMapTable"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_STACKMAPTABLE // AttributeList
	ldc literal_320:"Synthetic"
	invokestatic_lib module:net_rim_loader-2.class#3.routine_615(  ) // class#3
	putstatic NAME_SYNTHETIC // AttributeList
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.tools.compiler.classfile.Attribute getAttribute( net.rim.tools.compiler.classfile.AttributeList, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label5
	aconst_null 
	goto Label8
Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
Label8:
	checkcast Attribute
	areturn 
	}

}
