// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_bb_models.cod
// Module version  : 7.1.0.1066
// Class ID        : 2
// ########################################################


package net.rim.device.apps.internal.commonmodels.body;


class BodyModelFactory extends net.rim.device.apps.api.framework.registration.RIMModelFactory

{


	// @@@@@@@@@@@@@ Static routines 

<init>( net.rim.device.apps.internal.commonmodels.body.BodyModelFactory ); // address: 0
	{
	jumpspecial_lib <init>( net.rim.device.apps.api.framework.registration.RIMModelFactory )
	}


static int getSyncFieldId( java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_0 
	checkcastbranch_lib 
	astore_1 
	aload_1 
	bipush 11
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label10
	bipush 64
	ireturn 
Label10:
	aload_1 
	bipush 35
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label16
	bipush 2
	ireturn 
Label16:
	aload_1 
	bipush 28
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label22
	bipush 3
	ireturn 
Label22:
	aload_1 
	bipush 20
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label28
	bipush 8
	ireturn 
Label28:
	bipush -1
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public java.lang.Object createInstance( net.rim.device.apps.internal.commonmodels.body.BodyModelFactory, java.lang.Object ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aconst_null 
	astore_3 
	aload_1 
	bipush 19
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label48
	aload_1 
	invokestatic int getSyncFieldId( java.lang.Object ) // BodyModelFactory
	istore_4 
	bipush -1
	istore_5 
	iload_4 
	bipush 2
	if_icmpne Label19
	iipush 65534
	istore_5 
Label19:
	iload_4 
	bipush -1
	if_icmpeq Label82
	aload_1 
	sipush 255
	i2l 
	invokestatic_lib java.lang.Object get( java.lang.Object, long ) // ContextObject
	checkcast_lib net.rim.device.apps.api.framework.model.SyncBuffer//net.rim.device.apps.api.framework.model.SyncBuffer net.rim.device.apps.api.framework.model.SyncBuffer net.rim.device.apps.api.framework.model.SyncBuffer
	iload_4 
	iconst_1 
	invokevirtual java.lang.String getString( net.rim.device.apps.api.framework.model.SyncBuffer, int, boolean ) // pc=3
	astore_3 
	aload_3 
	ifnull Label82
	iload_5 
	bipush -1
	if_icmpeq Label82
	aload_3 
	stringlength 
	iload_5 
	if_icmple Label82
	aload_3 
	iconst_0 
	iload_5 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
	goto Label82
	astore_4 
	goto Label82
Label48:
	aload_1 
	bipush 11
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label77
	aload_1 
	bipush 43
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label77
	aload_1 
	bipush 54
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label77
	aload_1 
	sipush 249
	i2l 
	invokestatic_lib java.lang.Object get( java.lang.Object, long ) // ContextObject
	ifnull Label77
	aload_1 
	sipush 249
	i2l 
	invokestatic_lib java.lang.Object get( java.lang.Object, long ) // ContextObject
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_4 
	aload_4 
	iconst_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	goto Label82
Label77:
	new BodyModelImpl
	dup 
	aload_1 
	invokespecial net.rim.device.apps.internal.commonmodels.body.BodyModelImpl.<init> // pc=2
	astore_2 
Label82:
	aload_3 
	ifnull Label94
	aload_3 
	stringlength 
	ifle Label94
	new BodyModelImpl
	dup 
	aload_3 
	invokespecial net.rim.device.apps.internal.commonmodels.body.BodyModelImpl.<init> // pc=2
	astore_2 
	aload_2 
	areturn 
Label94:
	aload_3 
	ifnonnull Label105
	aload_1 
	bipush 20
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label105
	new BodyModelImpl
	dup 
	aconst_null 
	invokespecial net.rim.device.apps.internal.commonmodels.body.BodyModelImpl.<init> // pc=2
	astore_2 
Label105:
	aload_2 
	areturn 
	}


public int getMaximumCount( net.rim.device.apps.internal.commonmodels.body.BodyModelFactory, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokestatic int getSyncFieldId( java.lang.Object ) // BodyModelFactory
Label4:
	iconst_1 
	ireturn 
Label6:
	iipush 2147483647
	ireturn 
	}


public boolean recognize( net.rim.device.apps.internal.commonmodels.body.BodyModelFactory, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	instanceof BodyModelImpl
	ifeq Label6
	iconst_1 
	ireturn 
Label6:
	aload_1 
	bipush 19
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label29
	aload_1 
	invokestatic int getSyncFieldId( java.lang.Object ) // BodyModelFactory
	istore_2 
	iload_2 
	bipush -1
	if_icmpeq Label62
	iload_2 
	aload_1 
	sipush 255
	i2l 
	invokestatic_lib java.lang.Object get( java.lang.Object, long ) // ContextObject
	checkcast_lib net.rim.device.apps.api.framework.model.SyncBuffer//net.rim.device.apps.api.framework.model.SyncBuffer net.rim.device.apps.api.framework.model.SyncBuffer net.rim.device.apps.api.framework.model.SyncBuffer
	iconst_1 
	invokevirtual int getFieldType( net.rim.device.apps.api.framework.model.SyncBuffer, boolean ) // pc=2
	if_icmpne Label27
	iconst_1 
	ireturn 
Label27:
	iconst_0 
	ireturn 
Label29:
	aload_1 
	bipush 11
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label62
	aload_1 
	bipush 43
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label62
	aload_1 
	bipush 54
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label62
	aload_1 
	sipush 249
	i2l 
	invokestatic_lib java.lang.Object get( java.lang.Object, long ) // ContextObject
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_2 
	aload_2 
	ifnull Label60
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label60
	aload_2 
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	ldc literal_9:"Notes"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label60
	iconst_1 
	ireturn 
Label60:
	iconst_0 
	ireturn 
Label62:
	iconst_0 
	ireturn 
	}


public net.rim.device.apps.api.framework.verb.Verb[] getVerbs( net.rim.device.apps.internal.commonmodels.body.BodyModelFactory, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	bipush 11
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label19
	iconst_1 
	newarray_object_lib net.rim.device.apps.api.framework.verb.Verb//net.rim.device.apps.api.framework.verb.Verb net.rim.device.apps.api.framework.verb.Verb net.rim.device.apps.api.framework.verb.Verb
	dup 
	iconst_0 
	new_lib net.rim.device.apps.api.framework.verb.RIMModelFactoryCreateVerb//net.rim.device.apps.api.framework.verb.RIMModelFactoryCreateVerb net.rim.device.apps.api.framework.verb.RIMModelFactoryCreateVerb net.rim.device.apps.api.framework.verb.RIMModelFactoryCreateVerb
	dup 
	aload_0 
	iipush 16865280
	lipush -8414468493733347764
	ldc literal_10:"net.rim.device.apps.internal.resource.Common"
	sipush 1790
	invokespecial_lib net.rim.device.apps.api.framework.verb.RIMModelFactoryCreateVerb.<init> // pc=7
	aastore 
	areturn 
Label19:
	aconst_null 
	areturn 
	}

}
