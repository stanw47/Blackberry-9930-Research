// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_loader.cod
// Module version  : 7.1.0.1066
// Class ID        : 2
// ########################################################


package net.rim.tools.compiler;


public class GenerateResources extends Object
implements net.rim.tools.compiler.vm.Constants

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  INIT_NAME ; // ofs = 41078 addr = 8)
	private static String /*java.lang.String*/  CLINIT_NAME ; // ofs = 41084 addr = 9)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.tools.compiler.Compiler /*net.rim.tools.compiler.Compiler*/  _compiler ; // ofs = 40970 addr = 0)
	private net.rim.tools.compiler.JadSupport /*net.rim.tools.compiler.JadSupport*/  _jad ; // ofs = 40974 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _resourceBinaries ; // ofs = 40978 addr = 0)
	private boolean /*boolean*/  _makingMIDlet ; // ofs = 40982 addr = 0)
	private boolean /*boolean*/  _includeResources ; // ofs = 40986 addr = 0)
	private String /*java.lang.String*/  _className ; // ofs = 40990 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _resourceClassType ; // ofs = 40994 addr = 0)
	private net.rim.tools.compiler.types.NameAndType /*net.rim.tools.compiler.types.NameAndType*/  _resourceField ; // ofs = 40998 addr = 0)
	private net.rim.tools.compiler.types.NameAndType /*net.rim.tools.compiler.types.NameAndType*/  _propertyField ; // ofs = 41002 addr = 0)
	private net.rim.tools.compiler.types.NameAndType /*net.rim.tools.compiler.types.NameAndType*/  _appIconField ; // ofs = 41006 addr = 0)
	private byte[] /*byte[]*/  _appIconData ; // ofs = 41010 addr = 0)
	private net.rim.tools.compiler.types.NameAndType /*net.rim.tools.compiler.types.NameAndType*/  _appExtIconField ; // ofs = 41014 addr = 0)
	private byte[] /*byte[]*/  _appExtIconData ; // ofs = 41018 addr = 0)
	private net.rim.tools.compiler.types.NameAndType /*net.rim.tools.compiler.types.NameAndType*/  _localVar ; // ofs = 41022 addr = 0)
	private net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type*/  _intType ; // ofs = 41026 addr = 0)
	private net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type*/  _byteType ; // ofs = 41030 addr = 0)
	private net.rim.tools.compiler.types.Type /*net.rim.tools.compiler.types.Type*/  _byteArrayType ; // ofs = 41034 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _parmVector ; // ofs = 41038 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _stringClassType ; // ofs = 41042 addr = 0)
	private net.rim.tools.compiler.types.Method /*module:net_rim_loader-2.class#26*/  _stringEquals ; // ofs = 41046 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _integerClassType ; // ofs = 41050 addr = 0)
	private net.rim.tools.compiler.types.Method /*module:net_rim_loader-2.class#26*/  _integerInit ; // ofs = 41054 addr = 0)
	private net.rim.tools.compiler.types.ClassType /*module:net_rim_loader-2.class#4*/  _hashtableClassType ; // ofs = 41058 addr = 0)
	private net.rim.tools.compiler.types.Method /*module:net_rim_loader-2.class#26*/  _hashtableInit ; // ofs = 41062 addr = 0)
	private net.rim.tools.compiler.types.Method /*module:net_rim_loader-2.class#26*/  _hashtablePut ; // ofs = 41066 addr = 0)
	private int /*int*/  _ip ; // ofs = 41070 addr = 0)
	private net.rim.tools.compiler.classfile.ByteCodeInstructions /*module:net_rim_loader-1.class#18*/  _block ; // ofs = 41074 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.tools.compiler.GenerateResources, net.rim.tools.compiler.Compiler, java.lang.String, net.rim.tools.compiler.JadSupport, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_1 
	invokevirtual boolean isMakingMIDlet( net.rim.tools.compiler.Compiler ) // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual boolean includeResources( net.rim.tools.compiler.Compiler ) // pc=1
	ifne Label15
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifeq Label30
Label15:
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_176:"com.rim.resources."
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_177:"RIMResources"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	goto Label41
Label30:
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_176:"com.rim.resources."
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_178:"RIMData"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label41:
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_4 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	synch_static GenerateResources
	clinit_wait 
	ldc literal_66:"<init>"
	putstatic INIT_NAME // GenerateResources
	ldc literal_68:"<clinit>"
	putstatic CLINIT_NAME // GenerateResources
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private int longOff( net.rim.tools.compiler.GenerateResources, net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getSize( net.rim.tools.compiler.types.NameAndType ) // pc=1
	bipush 8
	if_icmpne Label7
	bipush 2
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


private int libOff( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#26 ); // address: 0
	{
	enter_narrow 
	aload_1 
	iipush 131072
	invokenonvirtual_lib .routine_19625 // pc=2
	ifeq Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


private int libOff( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter_narrow 
	aload_1 
	iipush 131072
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


private module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.GenerateResources, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore_2 
	aload_2 
	ifnonnull Label19
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_156:"Unable to find type: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label19:
	aload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
	aload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_3552 // pc=2
	aload_2 
	areturn 
	}


private module:net_rim_loader-2.class#26 findMethod( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4, java.lang.String, net.rim.tools.compiler.types.Type, java.util.Vector ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	aload_3 
	aload_4 
	iconst_0 
	iconst_0 
	invokenonvirtual_lib .routine_2816 // pc=7
	astore_5 
	aload_5 
	ifnonnull Label34
	aload_2 
	aload_3 
	aload_4 
	invokestatic_lib module:net_rim_loader-2.class#26.routine_18388(  ) // class#26
	astore_6 
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_157:"Class: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokenonvirtual_lib .routine_1165 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_158:" has no member: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label34:
	aload_5 
	areturn 
	}


private module:net_rim_loader-2.class#4 getStringClassType( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	enter 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifnonnull Label36
	aload_0 
	aload_0 
	ldc literal_42:"java.lang.String"
	invokespecial net.rim.tools.compiler.GenerateResources.findClassType // pc=2
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual module:net_rim_loader-2.class#4 getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	aload_0 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ldc literal_11:"equals"
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual net.rim.tools.compiler.types.Type getBooleanType( net.rim.tools.compiler.Compiler ) // pc=1
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokespecial net.rim.tools.compiler.GenerateResources.findMethod // pc=5
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_1 
	monitorexit 
	goto Label36
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
Label36:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	areturn 
	}


private module:net_rim_loader-2.class#4 getIntegerClassType( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	ifnonnull Label34
	aload_0 
	aload_0 
	ldc literal_159:"java.lang.Integer"
	invokespecial net.rim.tools.compiler.GenerateResources.findClassType // pc=2
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getstatic INIT_NAME // GenerateResources
	aconst_null 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokespecial net.rim.tools.compiler.GenerateResources.findMethod // pc=5
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_1 
	monitorexit 
	goto Label34
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
Label34:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	areturn 
	}


private module:net_rim_loader-2.class#4 getHashtableClassType( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	enter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	ifnonnull Label57
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.getStringClassType // pc=1
	pop 
	aload_0 
	aload_0 
	ldc literal_160:"java.util.Hashtable"
	invokespecial net.rim.tools.compiler.GenerateResources.findClassType // pc=2
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	aload_0 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	getstatic INIT_NAME // GenerateResources
	aconst_null 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokespecial net.rim.tools.compiler.GenerateResources.findMethod // pc=5
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual module:net_rim_loader-2.class#4 getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	astore_2 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_2 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_2 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	aload_0 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	ldc literal_161:"put"
	aload_2 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokespecial net.rim.tools.compiler.GenerateResources.findMethod // pc=5
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_1 
	monitorexit 
	goto Label57
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
Label57:
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	areturn 
	}


private module:net_rim_loader-2.class#26 createInit( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	sipush 144
	invokevirtual int augmentMethodModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore_1 
	new_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getstatic INIT_NAME // GenerateResources
	aconst_null 
	iconst_0 
	iload_1 
	invokespecial_lib .routine_18325 // pc=6
	astore_2 
	new InstructionCode
	dup 
	aload_2 
	bipush 4
	iconst_1 
	aconst_null 
	aconst_null 
	invokespecial net.rim.tools.compiler.analysis.InstructionCode.<init> // pc=6
	astore_3 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setSynthetic // pc=1
	new_lib net.rim.tools.compiler.classfile.ByteCodeInstructions//module:net_rim_loader-1.class#18 module:net_rim_loader-1.class#18 module:net_rim_loader-1.class#18
	dup 
	bipush 7
	invokespecial_lib .routine_9086 // pc=2
	astore_4 
	aload_0 
	aload_4 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	iconst_0 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1333 // pc=1
	astore_5 
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.getHashtableClassType // pc=1
	pop 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	dup 
	astore_7 
	monitorenter 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label61
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label61:
	aload_0 
	aload_5 
	getstatic INIT_NAME // GenerateResources
	aconst_null 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokespecial net.rim.tools.compiler.GenerateResources.findMethod // pc=5
	astore_6 
	aload_7 
	monitorexit 
	goto Label76
	astore 8
	aload_7 
	monitorexit 
	aload 8
	athrow 
Label76:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 14
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 63
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label153
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 109
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokespecial net.rim.tools.compiler.GenerateResources.longOff // pc=2
	iadd 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual_lib .routine_7737 // pc=5
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 109
	aload_0 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokespecial net.rim.tools.compiler.GenerateResources.longOff // pc=2
	iadd 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokenonvirtual_lib .routine_7737 // pc=5
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label144
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 109
	aload_0 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokespecial net.rim.tools.compiler.GenerateResources.longOff // pc=2
	iadd 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual_lib .routine_7737 // pc=5
	goto Label153
Label144:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 34
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label153:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 5
	aload_0 
	aload_6 
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_5 
	aload_6 
	invokenonvirtual_lib .routine_7737 // pc=5
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 31
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0 
	aconst_null 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_3 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setBlocks // pc=2
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_16325 // pc=2
	aload_2 
	areturn 
	}


private createHashtableInit( net.rim.tools.compiler.GenerateResources, net.rim.tools.compiler.types.NameAndType, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.getHashtableClassType // pc=1
	pop 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 184
	aload_0 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokevirtual_short .virtual_17 // idx=17 pc=4
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 207
	invokevirtual_short .virtual_9 // idx=9 pc=3
	bipush 4
	iload_2 
	imul 
	bipush 3
	idiv 
	iconst_1 
	iadd 
	istore_2 
	bipush 37
	istore_3 
	iload_2 
	bipush 127
	if_icmpgt Label43
	bipush 36
	istore_3 
	goto Label48
Label43:
	iload_2 
	sipush 32767
	if_icmple Label48
	sipush 32767
	istore_2 
Label48:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iload_3 
	iload_2 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 5
	aload_0 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokenonvirtual_lib .routine_7737 // pc=5
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 105
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.GenerateResources.longOff // pc=2
	iadd 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual_lib .routine_7737 // pc=5
	return 
	}


private module:net_rim_loader-2.class#26 createClinit( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iipush 1048578
	invokevirtual int augmentMethodModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore_1 
	new_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getstatic CLINIT_NAME // GenerateResources
	aconst_null 
	iconst_0 
	iload_1 
	invokespecial_lib .routine_18325 // pc=6
	astore_2 
	new InstructionCode
	dup 
	aload_2 
	bipush 3
	iconst_0 
	aconst_null 
	aconst_null 
	invokespecial net.rim.tools.compiler.analysis.InstructionCode.<init> // pc=6
	astore_3 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setSynthetic // pc=1
	new_lib net.rim.tools.compiler.classfile.ByteCodeInstructions//module:net_rim_loader-1.class#18 module:net_rim_loader-1.class#18 module:net_rim_loader-1.class#18
	dup 
	invokespecial_lib .routine_9069 // pc=1
	astore_4 
	aload_0 
	aload_4 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1333 // pc=1
	astore_5 
	aload_0 
	iconst_0 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 14
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 186
	aload_0 
	aload_5 
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_5 
	invokevirtual_short .virtual_17 // idx=17 pc=4
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 19
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual_short .virtual_17 // idx=17 pc=4
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 20
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_6 
	iload_6 
	ifgt Label88
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifeq Label95
Label88:
	iinc 6 1
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 2
	iload_6 
	imul 
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableInit // pc=3
Label95:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifeq Label106
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual routine
	istore_6 
	aload_0 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	iload_6 
	imul 
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableInit // pc=3
Label106:
	aload_3 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setBlocks // pc=2
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_16325 // pc=2
	aload_2 
	areturn 
	}


private completeClinit( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	enter 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 32
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0 
	aconst_null 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	return 
	}


private module:net_rim_loader-2.class#4 createPopulateClass( net.rim.tools.compiler.GenerateResources, int ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_162:"Populator"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_3385 // pc=1
	ifeq Label27
	new_lib net.rim.tools.compiler.util.DuplicateException//module:net_rim_loader-2.class#15 module:net_rim_loader-2.class#15 module:net_rim_loader-2.class#15
	dup 
	aconst_null 
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_1165 // pc=1
	invokespecial_lib .routine_12147 // pc=4
	athrow 
Label27:
	aload_3 
	invokenonvirtual_lib .routine_3370 // pc=1
	aload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 64
	invokevirtual int augmentClassModifiers( net.rim.tools.compiler.Compiler, int ) // pc=2
	invokenonvirtual_lib .routine_1278 // pc=2
	aload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual module:net_rim_loader-2.class#4 getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	invokenonvirtual_lib .routine_1322 // pc=2
	aload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
	aload_3 
	areturn 
	}


private module:net_rim_loader-2.class#26 createPopulateMethod( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	bipush 2
	invokevirtual int augmentMethodModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore_2 
	new_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	dup 
	aload_1 
	ldc literal_163:"populate"
	aconst_null 
	iconst_1 
	iload_2 
	invokespecial_lib .routine_18325 // pc=6
	astore_3 
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.getHashtableClassType // pc=1
	pop 
	aload_3 
	iconst_0 
	ldc literal_164:"localZero"
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokenonvirtual_lib .routine_15983 // pc=4
	aload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_16440 // pc=2
	new InstructionCode
	dup 
	aload_3 
	bipush 4
	iconst_1 
	aconst_null 
	aconst_null 
	invokespecial net.rim.tools.compiler.analysis.InstructionCode.<init> // pc=6
	astore_4 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setSynthetic // pc=1
	new_lib net.rim.tools.compiler.classfile.ByteCodeInstructions//module:net_rim_loader-1.class#18 module:net_rim_loader-1.class#18 module:net_rim_loader-1.class#18
	dup 
	invokespecial_lib .routine_9069 // pc=1
	astore_5 
	aload_0 
	aload_5 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	iconst_0 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 14
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_4 
	aload_5 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setBlocks // pc=2
	aload_3 
	aload_4 
	invokenonvirtual_lib .routine_16325 // pc=2
	aload_3 
	areturn 
	}


private createPopulateInvoke( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#26, net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	enter 
	aload_2 
	sipush 1024
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifeq Label18
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 63
	aload_2 
	invokevirtual int getOffset( net.rim.tools.compiler.types.NameAndType ) // pc=1
	iadd 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	goto Label33
Label18:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 109
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.GenerateResources.longOff // pc=2
	iadd 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	invokenonvirtual_lib .routine_7737 // pc=5
Label33:
	aload_1 
	invokenonvirtual_lib .routine_19303 // pc=1
	astore_3 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 7
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_3 
	aload_1 
	invokenonvirtual_lib .routine_7737 // pc=5
	return 
	}


private createHashtableStore( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4, net.rim.tools.compiler.types.NameAndType, java.lang.String, net.rim.tools.compiler.types.NameAndType ); // address: 0
	{
	enter 
	aload_1 
	aload_3 
	stringlength 
	bipush 4
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.getHashtableClassType // pc=1
	pop 
	aload_2 
	sipush 1024
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifeq Label27
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 63
	aload_2 
	invokevirtual int getOffset( net.rim.tools.compiler.types.NameAndType ) // pc=1
	iadd 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	goto Label42
Label27:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 109
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.GenerateResources.longOff // pc=2
	iadd 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	invokenonvirtual_lib .routine_7737 // pc=5
Label42:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 40
	aload_3 
	invokestatic_lib module:net_rim_loader-2.class#19.routine_13138(  ) // class#19
	invokevirtual_short .virtual_16 // idx=16 pc=4
	aload_4 
	sipush 1024
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifeq Label70
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 63
	aload_4 
	invokevirtual int getOffset( net.rim.tools.compiler.types.NameAndType ) // pc=1
	iadd 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	goto Label85
Label70:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 109
	aload_0 
	aload_4 
	invokespecial net.rim.tools.compiler.GenerateResources.longOff // pc=2
	iadd 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	invokenonvirtual_lib .routine_7737 // pc=5
Label85:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iconst_1 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokenonvirtual_lib .routine_7737 // pc=5
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 205
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
	}


private net.rim.tools.compiler.types.NameAndType getLocalVar( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4, net.rim.tools.compiler.analysis.InstructionCode, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnull Label7
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokevirtual module:net_rim_loader-2.class#4 getClassType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	aload_1 
	if_acmpeq Label19
Label7:
	aload_0 
	new_lib net.rim.tools.compiler.types.NameAndType//net.rim.tools.compiler.types.NameAndType net.rim.tools.compiler.types.NameAndType net.rim.tools.compiler.types.NameAndType
	dup 
	ldc literal_165:"_local"
	aload_3 
	aload_1 
	sipush 1024
	aload_2 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.addLocal // pc=1
	invokespecial_lib .routine_19771 // pc=6
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	goto Label22
Label19:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	invokevirtual setType( net.rim.tools.compiler.types.NameAndType, net.rim.tools.compiler.types.Type ) // pc=2
Label22:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	areturn 
	}


private net.rim.tools.compiler.types.NameAndType createArrayField( net.rim.tools.compiler.GenerateResources, java.lang.String, net.rim.tools.compiler.types.Type ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	sipush 130
	invokevirtual int augmentFieldModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore_3 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_2 
	iload_3 
	aconst_null 
	invokenonvirtual_lib .routine_1647 // pc=6
	areturn 
	}


private net.rim.tools.compiler.types.NameAndType createHashtableField( net.rim.tools.compiler.GenerateResources, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	sipush 130
	invokevirtual int augmentFieldModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore_2 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.getHashtableClassType // pc=1
	iload_2 
	aconst_null 
	invokenonvirtual_lib .routine_1647 // pc=6
	astore_3 
	aload_3 
	areturn 
	}


private initInteger( net.rim.tools.compiler.GenerateResources, net.rim.tools.compiler.types.NameAndType, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.getIntegerClassType // pc=1
	pop 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 184
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokevirtual_short .virtual_17 // idx=17 pc=4
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 207
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 36
	iload_2 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 5
	aload_0 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokenonvirtual_lib .routine_7737 // pc=5
	aload_1 
	sipush 1024
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifeq Label69
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 85
	aload_1 
	invokevirtual int getOffset( net.rim.tools.compiler.types.NameAndType ) // pc=1
	iadd 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label69:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 105
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.GenerateResources.longOff // pc=2
	iadd 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual_lib .routine_7737 // pc=5
	return 
	}


private initArray( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4, net.rim.tools.compiler.types.NameAndType, byte[] ); // address: 0
	{
	enter 
	aload_1 
	aload_3 
	arraylength 
	bipush 4
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 46
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_2 
	invokevirtual java.lang.String getName( net.rim.tools.compiler.types.NameAndType ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_3 
	invokevirtual boolean checkBinaryForExport( net.rim.tools.compiler.Compiler, java.lang.String, byte[] ) // pc=3
	pop 
	aload_2 
	invokevirtual net.rim.tools.compiler.types.Type getType( net.rim.tools.compiler.types.NameAndType ) // pc=1
	checkcast_lib net.rim.tools.compiler.types.ArrayType//module:net_rim_loader-2.class#0 module:net_rim_loader-2.class#0 module:net_rim_loader-2.class#0
	invokenonvirtual_lib .routine_156 // pc=1
	invokevirtual int getTypeId( net.rim.tools.compiler.types.Type ) // pc=1
	istore_4 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 45
	iload_4 
	aload_3 
	invokenonvirtual_lib .routine_7369 // pc=5
	aload_2 
	sipush 1024
	invokevirtual boolean is( net.rim.tools.compiler.types.NameAndType, int ) // pc=2
	ifeq Label56
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 85
	aload_2 
	invokevirtual int getOffset( net.rim.tools.compiler.types.NameAndType ) // pc=1
	iadd 
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
Label56:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 105
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.GenerateResources.longOff // pc=2
	iadd 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	invokenonvirtual_lib .routine_7737 // pc=5
	return 
	}


private initByteArrayValue( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4, net.rim.tools.compiler.types.NameAndType, int ); // address: 0
	{
	enter 
	iconst_1 
	newarray 2
	astore_4 
	aload_4 
	iconst_0 
	iload_3 
	i2b 
	bastore 
	aload_0 
	aload_1 
	aload_2 
	aload_4 
	invokespecial net.rim.tools.compiler.GenerateResources.initArray // pc=4
	return 
	}


private generateByteArray( net.rim.tools.compiler.GenerateResources, java.io.DataOutputStream, byte[] ); // address: 0
	{
	enter_narrow 
	aload_2 
	ifnonnull Label7
	aload_1 
	iconst_0 
	invokevirtual writeShort( java.io.DataOutputStream, int ) // pc=2
	return 
Label7:
	aload_1 
	aload_2 
	arraylength 
	invokevirtual writeShort( java.io.DataOutputStream, int ) // pc=2
	aload_1 
	aload_2 
	invokevirtual write( java.io.DataOutputStream, byte[] ) // pc=2
	return 
	}


private createAppIconFields( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getNumApplets( net.rim.tools.compiler.JadSupport ) // pc=1
	istore_1 
	aconst_null 
	astore_2 
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	new GenerateResources$MemoryDataOutputStream
	dup 
	invokespecial net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream.<init> // pc=1
	astore_3 
	new GenerateResources$MemoryDataOutputStream
	dup 
	invokespecial net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream.<init> // pc=1
	astore_4 
	iconst_0 
	istore_5 
Label20:
	iload_5 
	iload_1 
	if_icmplt Label24
	goto_w Label111
Label24:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_5 
	invokevirtual net.rim.tools.compiler.Applet getApplet( net.rim.tools.compiler.JadSupport, int ) // pc=2
	astore_2 
	iconst_0 
	istore_6 
	iconst_0 
	istore_7 
	aload_2 
	invokevirtual_short .virtual_12 // idx=12 pc=1
	istore 10
	aload_3 
	invokevirtual int getPosition( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	istore 8
	aload_4 
	invokevirtual int getPosition( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	istore 9
	aload_3 
	iload_6 
	invokevirtual routine
	aload_4 
	iload_7 
	invokevirtual routine
	iconst_0 
	istore 11
	iconst_0 
	istore 12
Label51:
	iload 12
	iload 10
	if_icmpge Label101
	aload_2 
	iload 12
	invokevirtual_short .virtual_13 // idx=13 pc=2
	astore 13
	aload 13
	ifnull Label99
	aload 13
	invokevirtual_short .virtual_9 // idx=9 pc=1
	astore 14
	aload 14
	ifnull Label99
	aload_0 
	aload 13
	invokespecial net.rim.tools.compiler.GenerateResources.hasMetaData // pc=2
	ifeq Label84
	aload_4 
	invokevirtual int getPosition( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	istore 15
	aload_0 
	aload_4 
	aload 13
	invokespecial net.rim.tools.compiler.GenerateResources.generateIconMetaArray // pc=3
	iload_7 
	aload_4 
	invokevirtual int getPosition( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	iload 15
	isub 
	iadd 
	istore_7 
	goto Label99
Label84:
	aload 13
	iload 11
	iinc 11 1
	invokevirtual_short .virtual_15 // idx=15 pc=2
	aload_0 
	aload_3 
	aload 14
	invokespecial net.rim.tools.compiler.GenerateResources.generateByteArray // pc=3
	iload_6 
	bipush 2
	aload 14
	arraylength 
	iadd 
	iadd 
	istore_6 
Label99:
	iinc 12 1
	goto Label51
Label101:
	aload_3 
	iload 8
	iload_6 
	invokevirtual replaceShort( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream, int, int ) // pc=3
	aload_4 
	iload 9
	iload_7 
	invokevirtual replaceShort( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream, int, int ) // pc=3
	iinc 5 1
	goto_w Label20
Label111:
	aload_3 
	invokevirtual int getPosition( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	ifne Label121
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aconst_null 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	goto Label131
Label121:
	aload_0 
	aload_0 
	ldc literal_166:"_appIcons"
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.createArrayField // pc=3
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload_3 
	invokevirtual byte[] toByteArray( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
Label131:
	aload_4 
	invokevirtual int getPosition( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	ifne Label141
	aload_0 
	aconst_null 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aconst_null 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	goto Label160
Label141:
	aload_0 
	aload_0 
	ldc literal_167:"_appExtIcons"
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.createArrayField // pc=3
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aload_4 
	invokevirtual byte[] toByteArray( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	return 
	astore_1 
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokevirtual java.lang.String toString( java.io.IOException ) // pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label160:
	return 
	}


private boolean hasMetaData( net.rim.tools.compiler.GenerateResources, net.rim.tools.compiler.ImageFile ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual_short .virtual_14 // idx=14 pc=1
	ireturn 
	}


private generateIconMetaArray( net.rim.tools.compiler.GenerateResources, net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream, net.rim.tools.compiler.ImageFile ); // address: 0
	{
	enter 
	iconst_1 
	istore_3 
	bipush 2
	istore_4 
	aload_2 
	invokevirtual_short .virtual_14 // idx=14 pc=1
	ifeq Label10
	bipush 2
	goto Label11
Label10:
	iconst_1 
Label11:
	istore_5 
	aload_1 
	invokevirtual int getPosition( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	istore_6 
	aload_1 
	iconst_0 
	invokevirtual routine
	aload_1 
	invokevirtual int getPosition( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	istore_7 
	aload_1 
	iload_3 
	invokevirtual routine
	aload_1 
	iload_4 
	invokevirtual routine
	aload_1 
	iload_5 
	invokevirtual routine
	aload_1 
	invokevirtual int getPosition( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream ) // pc=1
	iload_7 
	isub 
	istore 8
	aload_1 
	iload_6 
	iload 8
	invokevirtual replaceShort( net.rim.tools.compiler.GenerateResources$MemoryDataOutputStream, int, int ) // pc=3
	aload_2 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	astore 9
	aload_0 
	aload_1 
	aload 9
	invokespecial net.rim.tools.compiler.GenerateResources.generateByteArray // pc=3
	return 
	}


private createAppletData( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getNumApplets( net.rim.tools.compiler.JadSupport ) // pc=1
	istore_2 
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	aconst_null 
	astore_5 
	aconst_null 
	astore_6 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=1
	astore_5 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_5 
	invokespecial_lib java.io.DataOutputStream.<init> // pc=2
	astore_6 
	iconst_1 
	istore_7 
	iconst_0 
	istore 8
Label25:
	iload 8
	iload_2 
	if_icmpge Label48
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload 8
	invokevirtual net.rim.tools.compiler.Applet getApplet( net.rim.tools.compiler.JadSupport, int ) // pc=2
	astore_3 
	aload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	astore 9
	aload 9
	ifnonnull Label41
	aload_6 
	iconst_0 
	invokevirtual writeShort( java.io.DataOutputStream, int ) // pc=2
	goto Label46
Label41:
	aload_6 
	aload 9
	invokevirtual writeUTF( java.io.DataOutputStream, java.lang.String ) // pc=2
	iconst_0 
	istore_7 
Label46:
	iinc 8 1
	goto Label25
Label48:
	aload_6 
	invokevirtual close( java.io.DataOutputStream ) // pc=1
	iload_7 
	ifne Label63
	aload_0 
	ldc literal_168:"_appNames"
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.createArrayField // pc=3
	astore_4 
	aload_0 
	aload_1 
	aload_4 
	aload_5 
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	invokespecial net.rim.tools.compiler.GenerateResources.initArray // pc=4
Label63:
	aload_6 
	invokevirtual close( java.io.DataOutputStream ) // pc=1
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label72
	aload_0 
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokespecial net.rim.tools.compiler.GenerateResources.initArray // pc=4
Label72:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label79
	aload_0 
	aload_1 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokespecial net.rim.tools.compiler.GenerateResources.initArray // pc=4
Label79:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=1
	astore_5 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_5 
	invokespecial_lib java.io.DataOutputStream.<init> // pc=2
	astore_6 
	iconst_1 
	istore_7 
	iconst_0 
	istore 8
Label92:
	iload 8
	iload_2 
	if_icmpge Label115
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload 8
	invokevirtual net.rim.tools.compiler.Applet getApplet( net.rim.tools.compiler.JadSupport, int ) // pc=2
	astore_3 
	aload_3 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore 9
	aload 9
	ifnonnull Label108
	aload_6 
	iconst_0 
	invokevirtual writeShort( java.io.DataOutputStream, int ) // pc=2
	goto Label113
Label108:
	aload_6 
	aload 9
	invokevirtual writeUTF( java.io.DataOutputStream, java.lang.String ) // pc=2
	iconst_0 
	istore_7 
Label113:
	iinc 8 1
	goto Label92
Label115:
	aload_6 
	invokevirtual close( java.io.DataOutputStream ) // pc=1
	iload_7 
	ifne Label130
	aload_0 
	ldc literal_169:"_appArgs"
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.createArrayField // pc=3
	astore_4 
	aload_0 
	aload_1 
	aload_4 
	aload_5 
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	invokespecial net.rim.tools.compiler.GenerateResources.initArray // pc=4
Label130:
	return 
	}


private net.rim.tools.compiler.types.NameAndType createAppInteger( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4, net.rim.tools.compiler.analysis.InstructionCode, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokespecial net.rim.tools.compiler.GenerateResources.getLocalVar // pc=4
	astore_4 
	aload_0 
	aload_4 
	iload_3 
	invokespecial net.rim.tools.compiler.GenerateResources.initInteger // pc=3
	aload_4 
	areturn 
	}


private net.rim.tools.compiler.types.NameAndType createAppDataItem( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4, net.rim.tools.compiler.analysis.InstructionCode, java.lang.String, java.lang.Object ); // address: 0
	{
	enter 
	aload_3 
	ifnonnull Label10
	aload_0 
	aload_1 
	aload_2 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.getLocalVar // pc=4
	astore_5 
	goto Label15
Label10:
	aload_0 
	aload_3 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.createArrayField // pc=3
	astore_5 
Label15:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=1
	astore_6 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_6 
	invokespecial_lib java.io.DataOutputStream.<init> // pc=2
	astore_7 
	aload_4 
	checkcastbranch_array 
	checkcast_array 1 2
	astore 8
	aload_7 
	aload 8
	invokevirtual write( java.io.DataOutputStream, byte[] ) // pc=2
	goto Label38
Label32:
	aload_4 
	ifnull Label38
	aload_7 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual writeUTF( java.io.DataOutputStream, java.lang.String ) // pc=2
Label38:
	aload_7 
	invokevirtual close( java.io.DataOutputStream ) // pc=1
	aload_0 
	aload_1 
	aload_5 
	aload_6 
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	invokespecial net.rim.tools.compiler.GenerateResources.initArray // pc=4
	aload_5 
	areturn 
	}


private createAppValue( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4, net.rim.tools.compiler.analysis.InstructionCode, java.lang.String, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=1
	astore_7 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_7 
	invokespecial_lib java.io.DataOutputStream.<init> // pc=2
	astore 8
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getNumApplets( net.rim.tools.compiler.JadSupport ) // pc=1
	istore 9
	iconst_1 
	istore 10
	iconst_0 
	istore 11
Label17:
	iload 11
	iload 9
	if_icmplt Label21
	goto_w Label104
Label21:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload 11
	iconst_1 
	iadd 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 12
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload 12
	invokevirtual routine
	astore 13
	iload_5 
	tableswitch  :
		
		
		
		
		
		
		

Label38:
	aload 13
	ifnonnull Label44
	aload 8
	iconst_0 
	invokevirtual writeByte( java.io.DataOutputStream, int ) // pc=2
	goto_w Label102
Label44:
	aload 8
	aload 13
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokevirtual writeByte( java.io.DataOutputStream, int ) // pc=2
	iconst_0 
	istore 10
	goto Label102
Label51:
	aload 13
	ifnonnull Label57
	aload 8
	iconst_0 
	invokevirtual writeShort( java.io.DataOutputStream, int ) // pc=2
	goto Label102
Label57:
	aload 8
	aload 13
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokevirtual writeShort( java.io.DataOutputStream, int ) // pc=2
	iconst_0 
	istore 10
	goto Label102
Label64:
	aload 13
	ifnonnull Label70
	aload 8
	iconst_0 
	invokevirtual writeInt( java.io.DataOutputStream, int ) // pc=2
	goto Label102
Label70:
	aload 8
	aload 13
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokevirtual writeInt( java.io.DataOutputStream, int ) // pc=2
	iconst_0 
	istore 10
	goto Label102
Label77:
	aload 13
	ifnonnull Label84
	aload 8
	iconst_0 
	i2l 
	invokevirtual writeLong( java.io.DataOutputStream, long ) // pc=3
	goto Label102
Label84:
	aload 8
	aload 13
	invokestatic_lib long parseLong( java.lang.String ) // Long
	invokevirtual writeLong( java.io.DataOutputStream, long ) // pc=3
	iconst_0 
	istore 10
	goto Label102
Label91:
	aload 13
	ifnonnull Label97
	aload 8
	iconst_0 
	invokevirtual writeShort( java.io.DataOutputStream, int ) // pc=2
	goto Label102
Label97:
	aload 8
	aload 13
	invokevirtual writeUTF( java.io.DataOutputStream, java.lang.String ) // pc=2
	iconst_0 
	istore 10
Label102:
	iinc 11 1
	goto_w Label17
Label104:
	aload 8
	invokevirtual close( java.io.DataOutputStream ) // pc=1
	iload 10
	ifne Label128
	aload_3 
	ifnonnull Label117
	aload_0 
	aload_1 
	aload_2 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.getLocalVar // pc=4
	astore_6 
	goto Label122
Label117:
	aload_0 
	aload_3 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.createArrayField // pc=3
	astore_6 
Label122:
	aload_0 
	aload_1 
	aload_6 
	aload_7 
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	invokespecial net.rim.tools.compiler.GenerateResources.initArray // pc=4
Label128:
	return 
	}


private module:net_rim_loader-2.class#26 findInstantiateMidletInit( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4 ); // address: 0
	{
	enter 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic INIT_NAME // GenerateResources
	aconst_null 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_0 
	iconst_0 
	invokenonvirtual_lib .routine_2816 // pc=7
	aload_2 
	monitorexit 
	areturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


private instantiateMIDletIf( net.rim.tools.compiler.GenerateResources, java.lang.String, java.lang.Object ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	stringlength 
	bipush 4
	iadd 
	invokenonvirtual_lib .routine_6375 // pc=2
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.getStringClassType // pc=1
	pop 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 64
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 40
	aload_1 
	invokevirtual_short .virtual_16 // idx=16 pc=4
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iconst_1 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokenonvirtual_lib .routine_7737 // pc=5
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 147
	invokevirtual_short .virtual_8 // idx=8 pc=3
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_2 
	checkcast_lib net.rim.tools.compiler.analysis.InstructionTarget//module:net_rim_loader-1.class#73 module:net_rim_loader-1.class#73 module:net_rim_loader-1.class#73
	invokevirtual_short .virtual_23 // idx=23 pc=2
	return 
	}


private instantiateMIDletNew( net.rim.tools.compiler.GenerateResources, module:net_rim_loader-2.class#4, module:net_rim_loader-2.class#26 ); // address: 0
	{
	enter 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 184
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_1 
	invokevirtual_short .virtual_17 // idx=17 pc=4
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 207
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 5
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_1 
	aload_2 
	invokenonvirtual_lib .routine_7737 // pc=5
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 27
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
	}


private instantiateMIDletThrow( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_170:"java.lang.IllegalArgumentException"
	invokespecial net.rim.tools.compiler.GenerateResources.findClassType // pc=2
	astore_1 
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.getStringClassType // pc=1
	pop 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	aload_1 
	getstatic INIT_NAME // GenerateResources
	aconst_null 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokespecial net.rim.tools.compiler.GenerateResources.findMethod // pc=5
	astore_2 
	aload_3 
	monitorexit 
	goto Label33
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
Label33:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 184
	aload_0 
	aload_1 
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_1 
	invokevirtual_short .virtual_17 // idx=17 pc=4
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 207
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 64
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 5
	aload_0 
	aload_2 
	invokespecial net.rim.tools.compiler.GenerateResources.libOff // pc=2
	iadd 
	aload_1 
	aload_2 
	invokenonvirtual_lib .routine_7737 // pc=5
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	sipush 188
	invokevirtual_short .virtual_9 // idx=9 pc=3
	return 
	}


private module:net_rim_loader-2.class#26 createInstantiateMIDlet( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	sipush 128
	invokevirtual int augmentMethodModifiers( net.rim.tools.compiler.Compiler, module:net_rim_loader-2.class#4, int ) // pc=3
	istore_1 
	new_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ldc literal_171:"instantiateMIDlet"
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual module:net_rim_loader-2.class#4 getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	iconst_1 
	iload_1 
	invokespecial_lib .routine_18325 // pc=6
	astore_2 
	aload_2 
	iconst_0 
	ldc literal_172:"name"
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.getStringClassType // pc=1
	invokenonvirtual_lib .routine_15983 // pc=4
	new InstructionCode
	dup 
	aload_2 
	bipush 3
	bipush 2
	aconst_null 
	aconst_null 
	invokespecial net.rim.tools.compiler.analysis.InstructionCode.<init> // pc=6
	astore_3 
	aload_3 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setSynthetic // pc=1
	aload_0 
	iconst_0 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	new_lib net.rim.tools.compiler.classfile.ByteCodeInstructions//module:net_rim_loader-1.class#18 module:net_rim_loader-1.class#18 module:net_rim_loader-1.class#18
	dup 
	invokespecial_lib .routine_9069 // pc=1
	astore_4 
	aload_0 
	aload_4 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 14
	invokevirtual_short .virtual_9 // idx=9 pc=3
	aload_0 
	ldc literal_173:"javax.microedition.midlet.MIDlet"
	invokespecial net.rim.tools.compiler.GenerateResources.findClassType // pc=2
	astore_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getNumApplets( net.rim.tools.compiler.JadSupport ) // pc=1
	istore_6 
	iconst_0 
	istore_7 
Label61:
	iload_7 
	iload_6 
	if_icmpge Label118
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_7 
	invokevirtual net.rim.tools.compiler.Applet getApplet( net.rim.tools.compiler.JadSupport, int ) // pc=2
	astore 8
	aload 8
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore 9
	aload 9
	ifnull Label116
	aload 9
	stringlength 
	ifle Label116
	aload_0 
	aload 9
	invokespecial net.rim.tools.compiler.GenerateResources.findClassType // pc=2
	astore 10
	aload 10
	sipush 128
	invokenonvirtual_lib .routine_3396 // pc=2
	ifeq Label116
	aload 10
	aload_5 
	invokenonvirtual_lib .routine_1427 // pc=2
	ifeq Label116
	aload_0 
	aload 10
	invokespecial net.rim.tools.compiler.GenerateResources.findInstantiateMidletInit // pc=2
	astore 11
	aload 11
	ifnull Label116
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 10
	iadd 
	istore 12
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	iload 12
	iconst_0 
	invokevirtual_short .virtual_26 // idx=26 pc=3
	astore 13
	aload_0 
	aload 9
	aload 13
	invokespecial net.rim.tools.compiler.GenerateResources.instantiateMIDletIf // pc=3
	aload_0 
	aload 10
	aload 11
	invokespecial net.rim.tools.compiler.GenerateResources.instantiateMIDletNew // pc=3
	aload_0 
	iload 12
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
Label116:
	iinc 7 1
	goto Label61
Label118:
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.instantiateMIDletThrow // pc=1
	aload_0 
	aconst_null 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_3 
	aload_4 
	invokenonvirtual net.rim.tools.compiler.analysis.InstructionCode.setBlocks // pc=2
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_16325 // pc=2
	aload_2 
	areturn 
	}


private sliceResourceBinaries( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getMaxResourceSize( net.rim.tools.compiler.Compiler ) // pc=1
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getSliceSize( net.rim.tools.compiler.Compiler ) // pc=1
	istore_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	iload_4 
	iconst_1 
	isub 
	istore_5 
Label16:
	iload_5 
	ifge Label19
	goto_w Label119
Label19:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ResourceFile
	astore_6 
	aload_6 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	ifeq Label28
	goto_w Label117
Label28:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifne Label41
	aload_6 
	checkcastbranch 
	astore_7 
	aload_7 
	invokevirtual_short .virtual_12 // idx=12 pc=1
	ifeq Label41
	aload_7 
	invokevirtual_short .virtual_16 // idx=16 pc=1
	bipush -1
	if_icmpeq Label41
	goto_w Label117
Label41:
	aload_6 
	invokevirtual_short .virtual_9 // idx=9 pc=1
	astore_7 
	aload_7 
	arraylength 
	istore 8
	iload_1 
	iload 8
	iadd 
	istore_1 
	iload 8
	iload_2 
	if_icmpgt Label55
	goto_w Label117
Label55:
	aload_6 
	invokevirtual_short .virtual_5 // idx=5 pc=1
	astore 9
	iconst_0 
	istore 10
	iload_3 
	istore 11
Label62:
	iload 10
	iload 8
	if_icmpge Label117
	iload 11
	newarray 2
	astore 12
	aload_7 
	iload 10
	aload 12
	iconst_0 
	iload 11
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_155:"__"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 9
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 64
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	iload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 13
	iload 10
	ifne Label95
	aload_6 
	aload 12
	invokevirtual_short .virtual_8 // idx=8 pc=2
	aload_6 
	aload 13
	invokevirtual_short .virtual_3 // idx=3 pc=2
	goto Label103
Label95:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	new ResourceFile
	dup 
	aload 13
	aload 12
	iconst_1 
	invokespecial net.rim.tools.compiler.ResourceFile.<init> // pc=4
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label103:
	iload 10
	iload 11
	iadd 
	istore 10
	iload 10
	iload 11
	iadd 
	iload 8
	if_icmple Label62
	iload 8
	iload 10
	isub 
	istore 11
	goto Label62
Label117:
	iinc 5 -1
	goto_w Label16
Label119:
	bipush 127
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getDataFull( net.rim.tools.compiler.Compiler ) // pc=1
	imul 
	istore_5 
	iload_1 
	iload_5 
	if_icmplt Label146
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual boolean isNoLimit( net.rim.tools.compiler.Compiler ) // pc=1
	ifne Label146
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_174:"too much resource data, max allowed: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_175:", found: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label146:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public java.lang.String getClassName( net.rim.tools.compiler.GenerateResources ); // address: 0
	{
	areturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public module:net_rim_loader-2.class#4 generateResourceClass( net.rim.tools.compiler.GenerateResources, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual net.rim.tools.compiler.types.Type getIntType( net.rim.tools.compiler.Compiler ) // pc=1
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual net.rim.tools.compiler.types.Type getByteType( net.rim.tools.compiler.Compiler ) // pc=1
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokevirtual module:net_rim_loader-2.class#0 getArrayType( net.rim.tools.compiler.types.Type ) // pc=1
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual module:net_rim_loader-2.class#4 findClassType( net.rim.tools.compiler.Compiler, java.lang.String ) // pc=2
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_3385 // pc=1
	ifeq Label34
	new_lib net.rim.tools.compiler.util.DuplicateException//module:net_rim_loader-2.class#15 module:net_rim_loader-2.class#15 module:net_rim_loader-2.class#15
	dup 
	aconst_null 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_1165 // pc=1
	invokespecial_lib .routine_12147 // pc=4
	athrow 
Label34:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_3370 // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	sipush 192
	invokevirtual int augmentClassModifiers( net.rim.tools.compiler.Compiler, int ) // pc=2
	invokenonvirtual_lib .routine_1278 // pc=2
	aconst_null 
	astore_3 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label50
	aload_0 
	ldc literal_147:"net.rim.device.resources.Resource"
	invokespecial net.rim.tools.compiler.GenerateResources.findClassType // pc=2
	astore_3 
	goto Label53
Label50:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual module:net_rim_loader-2.class#4 getObjectClass( net.rim.tools.compiler.Compiler ) // pc=1
	astore_3 
Label53:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_3 
	invokenonvirtual_lib .routine_1322 // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_3331 // pc=3
	aload_0 
	aload_0 
	ldc literal_148:"_resources"
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableField // pc=2
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload_0 
	ldc literal_149:"_properties"
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableField // pc=2
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getNumApplets( net.rim.tools.compiler.JadSupport ) // pc=1
	ifle Label89
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.createAppIconFields // pc=1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifeq Label86
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 3
	invokenonvirtual_lib .routine_2348 // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.createInstantiateMIDlet // pc=1
	invokenonvirtual_lib .routine_2377 // pc=3
	goto Label89
Label86:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	bipush 2
	invokenonvirtual_lib .routine_2348 // pc=2
Label89:
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.sliceResourceBinaries // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.createInit // pc=1
	invokenonvirtual_lib .routine_2377 // pc=3
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.createClinit // pc=1
	astore_4 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	invokenonvirtual_lib .routine_2377 // pc=3
	aload_4 
	invokenonvirtual_lib .routine_16336 // pc=1
	astore_5 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	astore_6 
	aload_0 
	ldc literal_150:"_appCount"
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.createArrayField // pc=3
	astore_7 
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_7 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getNumApplets( net.rim.tools.compiler.JadSupport ) // pc=1
	invokespecial net.rim.tools.compiler.GenerateResources.initByteArrayValue // pc=4
	aload_1 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	astore 8
	aload_1 
	ldc literal_151:"UTF-8"
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	astore 8
	goto Label128
	astore 9
Label128:
	aload_0 
	ldc literal_152:"_resourceExtensions"
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.createArrayField // pc=3
	astore 9
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 9
	aload 8
	invokespecial net.rim.tools.compiler.GenerateResources.initArray // pc=4
	aload_2 
	ifnull Label162
	aload_2 
	stringlength 
	ifle Label162
	aload_2 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	astore 10
	aload_2 
	ldc literal_151:"UTF-8"
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	astore 10
	goto Label152
	astore 11
Label152:
	aload_0 
	ldc literal_153:"_languageResources"
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial net.rim.tools.compiler.GenerateResources.createArrayField // pc=3
	astore 11
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 11
	aload 10
	invokespecial net.rim.tools.compiler.GenerateResources.initArray // pc=4
Label162:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getNumApplets( net.rim.tools.compiler.JadSupport ) // pc=1
	ifle Label195
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokespecial net.rim.tools.compiler.GenerateResources.createAppletData // pc=2
	getstatic ordinalPrefixIds // ResourceIds
	arraylength 
	istore 11
	iconst_0 
	istore 10
Label173:
	iload 10
	iload 11
	if_icmpge Label195
	getstatic ordinalPrefixIds // ResourceIds
	iload 10
	aaload 
	astore 12
	aload 12
	ifnull Label193
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	aload 12
	getstatic ordinalPrefix // ResourceIds
	iload 10
	aaload 
	getstatic ordinalTypes // ResourceIds
	iload 10
	iaload 
	invokespecial net.rim.tools.compiler.GenerateResources.createAppValue // pc=6
Label193:
	iinc 10 1
	goto Label173
Label195:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual routine
	astore 12
Label198:
	aload 12
	invokeinterface interfacemethodref_6 // pc=1 guess=7
	ifeq Label254
	aload 12
	invokeinterface interfacemethodref_7 // pc=1 guess=8
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 13
	aload 13
	invokestatic java.lang.String getId( java.lang.String ) // ResourceIds
	astore 14
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifeq Label226
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	aload 14
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload 13
	invokevirtual routine
	invokespecial net.rim.tools.compiler.GenerateResources.createAppDataItem // pc=5
	astore 15
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload 13
	aload 15
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableStore // pc=5
	goto Label198
Label226:
	aload 14
	ifnull Label198
	aload 14
	getstatic midletPrefix // ResourceIds
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifne Label198
	aload 14
	getstatic manifestVersionIds // ResourceIds
	iconst_0 
	aaload 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label198
	aload 14
	getstatic jadRequiredIds // ResourceIds
	iconst_0 
	aaload 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label198
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	aload 14
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload 13
	invokevirtual routine
	invokespecial net.rim.tools.compiler.GenerateResources.createAppDataItem // pc=5
	pop 
	goto_w Label198
Label254:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifeq Label274
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual net.rim.tools.compiler.ResourceFile getManifest( net.rim.tools.compiler.JadSupport ) // pc=1
	astore 13
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	ldc literal_154:"_manifest"
	aload 13
	invokevirtual_short .virtual_9 // idx=9 pc=1
	invokespecial net.rim.tools.compiler.GenerateResources.createAppDataItem // pc=5
	astore 14
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload 13
	invokevirtual_short .virtual_5 // idx=5 pc=1
	aload 14
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableStore // pc=5
Label274:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getDataFull( net.rim.tools.compiler.Compiler ) // pc=1
	sipush 4096
	isub 
	istore 13
	iconst_0 
	istore 14
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 11
	iload 11
	ifgt Label287
	goto_w Label524
Label287:
	aload_0 
	aconst_null 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore 15
	aconst_null 
	astore 16
	aconst_null 
	astore 17
	aconst_null 
	astore 18
	aconst_null 
	astore 19
	iconst_0 
	istore 10
Label304:
	iload 10
	iload 11
	if_icmplt Label308
	goto_w Label494
Label308:
	aload 17
	ifnonnull Label336
	aload_0 
	aconst_null 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	aload 15
	invokevirtual int size( java.util.Vector ) // pc=1
	invokespecial net.rim.tools.compiler.GenerateResources.createPopulateClass // pc=2
	astore 16
	aload_0 
	aload 16
	invokespecial net.rim.tools.compiler.GenerateResources.createPopulateMethod // pc=2
	astore 17
	aload 16
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 17
	invokenonvirtual_lib .routine_2377 // pc=3
	aload 15
	aload 17
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload 17
	invokenonvirtual_lib .routine_16336 // pc=1
	astore 18
	aload 17
	iconst_0 
	invokenonvirtual_lib .routine_16096 // pc=2
	astore 19
Label336:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload 10
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ResourceFile
	astore 20
	aload 20
	invokevirtual_short .virtual_6 // idx=6 pc=1
	ifeq Label345
	goto_w Label458
Label345:
	aconst_null 
	astore 21
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifne Label366
	aload 20
	checkcastbranch 
	astore 22
	aload 22
	invokevirtual_short .virtual_12 // idx=12 pc=1
	ifeq Label366
	aload 22
	invokevirtual_short .virtual_16 // idx=16 pc=1
	bipush -1
	if_icmpeq Label366
	aload_0 
	aload 16
	aload 18
	aload 22
	invokevirtual_short .virtual_16 // idx=16 pc=1
	invokespecial net.rim.tools.compiler.GenerateResources.createAppInteger // pc=4
	astore 21
Label366:
	aload 21
	ifnonnull Label376
	aload_0 
	aload 16
	aload 18
	aconst_null 
	aload 20
	invokevirtual_short .virtual_9 // idx=9 pc=1
	invokespecial net.rim.tools.compiler.GenerateResources.createAppDataItem // pc=5
	astore 21
Label376:
	aload 20
	invokevirtual_short .virtual_5 // idx=5 pc=1
	astore 22
	aload_0 
	aload 16
	aload 19
	aload 22
	aload 21
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableStore // pc=5
	aload 22
	invokestatic_lib module:net_rim_loader-2.class#19.routine_13195(  ) // class#19
	astore 23
	iload 14
	ifeq Label396
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifne Label396
	aload 22
	aload 23
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label409
Label396:
	aload 20
	invokevirtual_short .virtual_4 // idx=4 pc=1
	astore 24
	aload 24
	ifnonnull Label402
	goto_w Label458
Label402:
	aload_0 
	aload 16
	aload 19
	aload 24
	aload 21
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableStore // pc=5
	goto Label458
Label409:
	aload 20
	invokevirtual_short .virtual_7 // idx=7 pc=1
	ifeq Label420
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_155:"__"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 23
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 23
Label420:
	aload_0 
	aload 16
	aload 19
	aload 23
	aload 21
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableStore // pc=5
	aload 20
	invokevirtual_short .virtual_4 // idx=4 pc=1
	astore 24
	aload 24
	ifnull Label458
	aload_0 
	aload 16
	aload 19
	aload 24
	aload 21
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableStore // pc=5
	aload 24
	invokestatic_lib module:net_rim_loader-2.class#19.routine_13195(  ) // class#19
	astore 23
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_155:"__"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 23
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 23
	aload 23
	aload 24
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label458
	aload_0 
	aload 16
	aload 19
	aload 23
	aload 21
	invokespecial net.rim.tools.compiler.GenerateResources.createHashtableStore // pc=5
Label458:
	iload 10
	iload 11
	iconst_1 
	isub 
	if_icmpeq Label476
	aload 16
	invokenonvirtual_lib .routine_6393 // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload 10
	iconst_1 
	iadd 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ResourceFile
	invokevirtual_short .virtual_9 // idx=9 pc=1
	arraylength 
	iadd 
	iload 13
	if_icmple Label492
Label476:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	ifnull Label487
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 31
	invokevirtual_short .virtual_9 // idx=9 pc=3
Label487:
	aconst_null 
	astore 17
	aload_0 
	aconst_null 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
Label492:
	iinc 10 1
	goto_w Label304
Label494:
	aload_0 
	aload_6 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload 15
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 11
	iconst_0 
	istore 10
Label502:
	iload 10
	iload 11
	if_icmpge Label524
	aload 15
	iload 10
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.tools.compiler.types.Method//module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26 module:net_rim_loader-2.class#26
	astore 17
	aload_0 
	aload 17
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokespecial net.rim.tools.compiler.GenerateResources.createPopulateInvoke // pc=3
	iinc 10 1
	goto Label502
	astore 10
	new_lib net.rim.tools.compiler.util.CompileException//module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9 module:net_rim_loader-2.class#9
	dup 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload 10
	invokevirtual java.lang.String toString( java.io.IOException ) // pc=1
	invokespecial_lib .routine_9821 // pc=3
	athrow 
Label524:
	aload_0 
	invokespecial net.rim.tools.compiler.GenerateResources.completeClinit // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_3552 // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	areturn 
	}

}
