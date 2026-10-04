// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_bb_models.cod
// Module version  : 7.1.0.1066
// Class ID        : 3
// ########################################################


package net.rim.device.apps.internal.commonmodels.body;


public class BodyModelImpl extends Object
implements net.rim.device.apps.api.framework.model.PersistableRIMModel, net.rim.device.apps.internal.commonmodels.body.BodyModel, net.rim.device.apps.api.framework.model.FieldProvider, net.rim.device.apps.api.framework.model.ColumnPaintProvider, net.rim.device.apps.api.framework.model.PaintProvider, net.rim.device.apps.api.framework.model.ConversionProvider, net.rim.device.apps.api.framework.model.MatchProvider, net.rim.device.apps.api.framework.model.CloneProvider, net.rim.device.apps.api.framework.model.EncryptableProvider, net.rim.device.apps.api.framework.model.SyncFieldIDProvider

{
	// @@@@@@@@@@@@@ Static fields 
	private static net.rim.vm.WeakReference /*net.rim.vm.WeakReference*/  _textAppenderWeakReference ; // ofs = 8600 addr = 8)

	// @@@@@@@@@@@@@ Fields 
	private Object /*java.lang.Object*/  _textEncoding ; // ofs = 8596 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aconst_null 
	astore_2 
	aload_1 
	checkcastbranch_lib 
	astore_2 
	goto Label27
Label9:
	aload_1 
	ifnull Label27
	aload_1 
	invokestatic_lib net.rim.device.apps.api.framework.model.ContextObject verifyNonNull( java.lang.Object ) // ContextObject
	astore_3 
	aload_3 
	lipush -8478555129720928586
	invokevirtual java.lang.Object get( net.rim.device.apps.api.framework.model.ContextObject, long ) // pc=3
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_2 
	aload_2 
	ifnonnull Label27
	aload_3 
	sipush 253
	i2l 
	invokevirtual java.lang.Object get( net.rim.device.apps.api.framework.model.ContextObject, long ) // pc=3
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_2 
Label27:
	aload_0 
	aload_2 
	invokevirtual setText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.String ) // pc=2
	return 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	synch_static BodyModelImpl
	clinit_wait 
	new_lib net.rim.vm.WeakReference//net.rim.vm.WeakReference net.rim.vm.WeakReference net.rim.vm.WeakReference
	dup 
	aconst_null 
	invokespecial_lib net.rim.vm.WeakReference.<init> // pc=2
	putstatic _textAppenderWeakReference // BodyModelImpl
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private java.lang.String getText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, int ); // address: 0
	{
	enter 
	iload_1 
	iipush 2147483647
	if_icmpeq Label6
	iconst_1 
	goto Label7
Label6:
	iconst_0 
Label7:
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_2 
	invokestatic_lib java.lang.Object decode( java.lang.Object, boolean ) // PersistentContent
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	iload_2 
	ifne Label17
	aload_3 
	areturn 
Label17:
	aload_3 
	stringlength 
	iload_1 
	invokestatic_lib int min( int, int ) // Math
	istore_4 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	aload_3 
	iconst_0 
	iload_4 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_5 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	astore_2 
	ldc literal_14:"<Content Protection is enabled>"
	areturn 
	}


private net.rim.device.api.ui.component.AutoTextEditField createEditField( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.String, java.lang.String, int, boolean ); // address: 0
	{
	enter 
	iload_4 
	ifeq Label11
	new_lib net.rim.device.api.ui.component.ActiveAutoTextEditField//net.rim.device.api.ui.component.ActiveAutoTextEditField net.rim.device.api.ui.component.ActiveAutoTextEditField net.rim.device.api.ui.component.ActiveAutoTextEditField
	dup 
	aload_1 
	aload_2 
	iload_3 
	lipush 4503599627374592
	invokespecial_lib net.rim.device.api.ui.component.ActiveAutoTextEditField.<init> // pc=6
	areturn 
Label11:
	new_lib net.rim.device.api.ui.component.AutoTextEditField//net.rim.device.api.ui.component.AutoTextEditField net.rim.device.api.ui.component.AutoTextEditField net.rim.device.api.ui.component.AutoTextEditField
	dup 
	aload_1 
	aload_2 
	iload_3 
	lipush 4503599627374592
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.<init> // pc=6
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public int paint( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, net.rim.device.api.ui.Graphics, int, int, int, int, java.lang.Object ); // address: 0
	{
	enter 
	iconst_0 
	ireturn 
	}


protected appendText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_1 
	iconst_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib java.lang.Object encodeAndAppend( java.lang.String, boolean, boolean, java.lang.Object ) // PersistentContent
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public int match( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib net.rim.device.apps.api.search.SearchCriterion//net.rim.device.apps.api.search.SearchCriterion net.rim.device.apps.api.search.SearchCriterion net.rim.device.apps.api.search.SearchCriterion
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
Label7:
	bipush -1
	ireturn 
Label9:
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ) // pc=1
	astore_3 
	aload_3 
	ifnull Label22
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	checkcast_lib net.rim.device.api.util.StringMatch//net.rim.device.api.util.StringMatch net.rim.device.api.util.StringMatch net.rim.device.api.util.StringMatch
	aload_3 
	invokevirtual int indexOf( net.rim.device.api.util.StringMatch, java.lang.String ) // pc=2
	iflt Label22
	iconst_1 
	ireturn 
Label22:
	iconst_0 
	ireturn 
	}


public java.lang.String getTextPrefix( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 100
	invokespecial net.rim.device.apps.internal.commonmodels.body.BodyModelImpl.getText // pc=2
	invokestatic_lib java.lang.String removeLineBreaksInString( java.lang.String ) // StringUtilities
	areturn 
	}


public java.lang.String getText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	iipush 2147483647
	invokespecial net.rim.device.apps.internal.commonmodels.body.BodyModelImpl.getText // pc=2
	areturn 
	}


public boolean convert( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ) // pc=1
	astore_3 
	aload_2 
	instanceof_lib net.rim.device.apps.api.messaging.OutgoingMessage//net.rim.device.apps.api.messaging.OutgoingMessage net.rim.device.apps.api.messaging.OutgoingMessage net.rim.device.apps.api.messaging.OutgoingMessage
	ifeq Label18
	aload_3 
	ifnull Label18
	aload_2 
	checkcast_lib net.rim.device.apps.api.messaging.OutgoingMessage//net.rim.device.apps.api.messaging.OutgoingMessage net.rim.device.apps.api.messaging.OutgoingMessage net.rim.device.apps.api.messaging.OutgoingMessage
	astore_4 
	aload_4 
	aload_3 
	aload_1 
	invokeinterface interfacemethodref_4 // pc=3 guess=2
	iconst_1 
	ireturn 
Label18:
	aload_1 
	checkcastbranch_lib 
	astore_4 
	aload_4 
	bipush 11
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label72
	aload_4 
	bipush 43
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label72
	aload_4 
	bipush 54
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label72
	aload_2 
	checkcastbranch_lib 
	astore_5 
	aload_3 
	ifnull Label70
	aload_5 
	ldc literal_11:"?Notes:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_3 
	stringlength 
	istore_6 
	iconst_0 
	istore_7 
Label47:
	iload_7 
	iload_6 
	if_icmpge Label70
	aload_3 
	iload_7 
	stringaload 
	istore 8
	iload 8
	bipush 10
	if_icmpne Label64
	aload_5 
	bipush 13
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	bipush 9
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label68
Label64:
	aload_5 
	iload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label68:
	iinc 7 1
	goto Label47
Label70:
	iconst_1 
	ireturn 
Label72:
	aload_4 
	bipush 19
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifne Label77
	goto_w Label151
Label77:
	aload_2 
	checkcast_lib net.rim.device.apps.api.framework.model.SyncBuffer//net.rim.device.apps.api.framework.model.SyncBuffer net.rim.device.apps.api.framework.model.SyncBuffer net.rim.device.apps.api.framework.model.SyncBuffer
	astore_5 
	bipush -1
	istore_6 
	aload_3 
	ifnonnull Label86
	ldc_nullstr 
	astore_3 
Label86:
	aload_4 
	bipush 28
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label93
	bipush 3
	istore_6 
	goto Label142
Label93:
	aload_4 
	bipush 11
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label100
	bipush 64
	istore_6 
	goto Label142
Label100:
	aload_4 
	bipush 35
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label116
	bipush 2
	istore_6 
	aload_3 
	stringlength 
	iipush 65534
	if_icmple Label142
	aload_3 
	iconst_0 
	iipush 65534
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
	goto Label142
Label116:
	aload_4 
	bipush 43
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifne Label124
	aload_4 
	bipush 94
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label136
Label124:
	bipush 12
	istore_6 
	aload_3 
	stringlength 
	sipush 16384
	if_icmple Label142
	aload_3 
	iconst_0 
	sipush 16384
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
	goto Label142
Label136:
	aload_4 
	bipush 20
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label142
	bipush 8
	istore_6 
Label142:
	iload_6 
	bipush -1
	if_icmpeq Label175
	aload_5 
	iload_6 
	aload_3 
	invokevirtual addField( net.rim.device.apps.api.framework.model.SyncBuffer, int, java.lang.String ) // pc=3
	iconst_1 
	ireturn 
Label151:
	aload_4 
	bipush 24
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label175
	aload_2 
	instanceof_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	ifeq Label175
	aload_3 
	ifnull Label175
	aload_3 
	stringlength 
	ifle Label175
	aload_2 
	checkcast_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	astore_5 
	aload_5 
	iconst_0 
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
	aload_5 
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iconst_1 
	ireturn 
Label175:
	iconst_0 
	ireturn 
	}


public java.lang.Object clone( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.Object ); // address: 0
	{
	enter_narrow 
	new BodyModelImpl
	dup 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ) // pc=1
	invokespecial net.rim.device.apps.internal.commonmodels.body.BodyModelImpl.<init> // pc=2
	areturn 
	}


public boolean isTextOpaque( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ); // address: 0
	{
	ireturn_bipush 0
	}


public setText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label5
	ldc_nullstr 
	astore_1 
Label5:
	aload_1 
	stringlength 
	sipush 2048
	if_icmple Label28
	aload_0 
	aload_1 
	iconst_0 
	sipush 2048
	invokenonvirtual_lib java.lang.String.substring // pc=3
	iconst_1 
	iconst_1 
	invokestatic_lib java.lang.Object encode( java.lang.String, boolean, boolean ) // PersistentContent
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_1 
	sipush 2048
	invokenonvirtual_lib java.lang.String.substring // pc=2
	iconst_1 
	iconst_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib java.lang.Object encodeAndAppend( java.lang.String, boolean, boolean, java.lang.Object ) // PersistentContent
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
Label28:
	aload_0 
	aload_1 
	iconst_1 
	iconst_1 
	invokestatic_lib java.lang.Object encode( java.lang.String, boolean, boolean ) // PersistentContent
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public paint( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, net.rim.device.apps.api.framework.model.ColumnPainter, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	bipush 4
	invokevirtual boolean isColumnEmpty( net.rim.device.apps.api.framework.model.ColumnPainter, int ) // pc=2
	ifeq Label11
	aload_1 
	bipush 4
	aload_0 
	invokevirtual java.lang.String getTextPrefix( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ) // pc=1
	iconst_0 
	invokevirtual drawText( net.rim.device.apps.api.framework.model.ColumnPainter, int, java.lang.String, boolean ) // pc=4
Label11:
	return 
	}


public net.rim.device.api.ui.Field getField( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ) // pc=1
	astore_3 
	aload_1 
	bipush 28
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	istore_5 
	aload_1 
	iconst_0 
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	istore_6 
	aload_1 
	bipush 8
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	istore_7 
	aload_1 
	bipush 43
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifne Label24
	aload_1 
	bipush 94
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label26
Label24:
	iconst_1 
	goto Label27
Label26:
	iconst_0 
Label27:
	istore 8
	aload_1 
	bipush 20
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	istore 9
	aload_1 
	sipush 168
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	istore 10
	iload_5 
	ifne Label40
	iload 9
	ifeq Label48
Label40:
	iload_6 
	ifeq Label48
	iload 8
	ifne Label48
	sipush 2004
	invokestatic_lib java.lang.String getString( int ) // CommonResources
	astore_2 
	goto Label50
Label48:
	ldc_nullstr 
	astore_2 
Label50:
	iload_6 
	ifne Label58
	new_lib net.rim.device.api.ui.component.NumericChoiceField//net.rim.device.api.ui.component.NumericChoiceField net.rim.device.api.ui.component.NumericChoiceField net.rim.device.api.ui.component.NumericChoiceField
	dup 
	aload_3 
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.<init> // pc=2
	astore_4 
	goto_w Label157
Label58:
	iipush 1000000
	istore 11
	iload_7 
	ifeq Label65
	iipush 65534
	istore 11
	goto Label74
Label65:
	iload 10
	ifeq Label70
	iipush 65534
	istore 11
	goto Label74
Label70:
	iload 8
	ifeq Label74
	sipush 16384
	istore 11
Label74:
	aload_3 
	stringlength 
	iload 11
	if_icmple Label87
	aload_3 
	iconst_0 
	iload 11
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
	sipush 9127
	invokestatic_lib java.lang.String getString( int ) // CommonResources
	sipush 1500
	invokestatic_lib show( java.lang.String, int ) // PopupStatus
Label87:
	aload_1 
	bipush 120
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifne Label93
	iconst_1 
	goto Label94
Label93:
	iconst_0 
Label94:
	istore 12
	iload_5 
	ifne Label99
	iload_7 
	ifeq Label101
Label99:
	iconst_1 
	goto Label102
Label101:
	iconst_0 
Label102:
	istore 13
	sipush 2000
	istore 14
	iload 13
	ifeq Label143
	aload_3 
	stringlength 
	iload 14
	if_icmple Label143
	aload_0 
	aload_2 
	ldc_nullstr 
	iload 11
	iload 12
	invokespecial net.rim.device.apps.internal.commonmodels.body.BodyModelImpl.createEditField // pc=5
	astore_4 
	getstatic _textAppenderWeakReference // BodyModelImpl
	invokevirtual java.lang.Object get( net.rim.vm.WeakReference ) // pc=1
	ifnull Label126
	getstatic _textAppenderWeakReference // BodyModelImpl
	invokevirtual java.lang.Object get( net.rim.vm.WeakReference ) // pc=1
	checkcast TextAppender
	iconst_1 
	invokevirtual finish( net.rim.device.apps.internal.commonmodels.body.TextAppender, boolean ) // pc=2
Label126:
	iipush 2147483647
	istore 15
	new TextAppender
	dup 
	aload_4 
	aload_3 
	iload 14
	iload 15
	invokespecial net.rim.device.apps.internal.commonmodels.body.TextAppender.<init> // pc=5
	astore 16
	invokestatic_lib net.rim.device.api.system.Application getApplication(  ) // Application
	aload 16
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	getstatic _textAppenderWeakReference // BodyModelImpl
	aload 16
	invokevirtual set( net.rim.vm.WeakReference, java.lang.Object ) // pc=2
	goto Label150
Label143:
	aload_0 
	aload_2 
	aload_3 
	iload 11
	iload 12
	invokespecial net.rim.device.apps.internal.commonmodels.body.BodyModelImpl.createEditField // pc=5
	astore_4 
Label150:
	iload 12
	ifeq Label157
	iload 8
	ifeq Label157
	aload_4 
	iconst_1 
	invokevirtual setExpandToFill( net.rim.device.api.ui.component.TextField, boolean ) // pc=2
Label157:
	iload 8
	ifeq Label164
	aload_4 
	ldc literal_12:"email-message-body"
	invokestatic_lib net.rim.device.api.ui.theme.Tag create( java.lang.String ) // Tag
	invokevirtual setTag( net.rim.device.api.ui.component.TextField, net.rim.device.api.ui.theme.Tag ) // pc=2
	goto Label168
Label164:
	aload_4 
	ldc literal_13:"message-body"
	invokestatic_lib net.rim.device.api.ui.theme.Tag create( java.lang.String ) // Tag
	invokevirtual setTag( net.rim.device.api.ui.component.TextField, net.rim.device.api.ui.theme.Tag ) // pc=2
Label168:
	aload_4 
	iload_6 
	invokevirtual setEditable( net.rim.device.api.ui.component.TextField, boolean ) // pc=2
	aload_4 
	aload_0 
	invokevirtual setCookie( net.rim.device.api.ui.component.TextField, java.lang.Object ) // pc=2
	aload_1 
	bipush 77
	i2l 
	invokestatic_lib java.lang.Object get( java.lang.Object, long ) // ContextObject
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 11
	aload 11
	ifnull Label206
	aload_4 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.component.TextField ) // pc=1
	astore 12
	aload 12
	invokevirtual int getStyle( net.rim.device.api.ui.Font ) // pc=1
	bipush -3
	iand 
	sipush -15361
	iand 
	istore 13
	iload 13
	aload 11
	invokevirtual int getStyle( net.rim.device.api.ui.Font ) // pc=1
	sipush 15360
	iand 
	ior 
	istore 13
	aload 12
	iload 13
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	astore 12
	aload_4 
	aload 12
	invokevirtual setFont( net.rim.device.api.ui.component.TextField, net.rim.device.api.ui.Font ) // pc=2
Label206:
	aload_4 
	areturn 
	}


public boolean grabDataFromField( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, net.rim.device.api.ui.Field, java.lang.Object ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	aload_1 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	istore_4 
	getstatic _textAppenderWeakReference // BodyModelImpl
	invokevirtual java.lang.Object get( net.rim.vm.WeakReference ) // pc=1
	ifnull Label17
	getstatic _textAppenderWeakReference // BodyModelImpl
	invokevirtual java.lang.Object get( net.rim.vm.WeakReference ) // pc=1
	checkcast TextAppender
	iconst_1 
	invokevirtual finish( net.rim.device.apps.internal.commonmodels.body.TextAppender, boolean ) // pc=2
	getstatic _textAppenderWeakReference // BodyModelImpl
	aconst_null 
	invokevirtual set( net.rim.vm.WeakReference, java.lang.Object ) // pc=2
Label17:
	aload_1 
	instanceof_lib net.rim.device.api.ui.component.AutoTextEditField//net.rim.device.api.ui.component.AutoTextEditField net.rim.device.api.ui.component.AutoTextEditField net.rim.device.api.ui.component.AutoTextEditField
	ifeq Label51
	iload_4 
	ifeq Label51
	aload_1 
	checkcast_lib net.rim.device.api.ui.component.AutoTextEditField//net.rim.device.api.ui.component.AutoTextEditField net.rim.device.api.ui.component.AutoTextEditField net.rim.device.api.ui.component.AutoTextEditField
	astore_5 
	aload_5 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.AutoTextEditField ) // pc=1
	astore_3 
	aload_0 
	aload_3 
	invokevirtual setText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.String ) // pc=2
	aload_2 
	instanceof_lib net.rim.device.apps.api.framework.model.ContextObject//net.rim.device.apps.api.framework.model.ContextObject net.rim.device.apps.api.framework.model.ContextObject net.rim.device.apps.api.framework.model.ContextObject
	ifeq Label65
	aload_5 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.component.AutoTextEditField ) // pc=1
	invokevirtual int getStyle( net.rim.device.api.ui.Font ) // pc=1
	sipush 15360
	iand 
	istore_6 
	iload_6 
	ifeq Label65
	aload_2 
	checkcast_lib net.rim.device.apps.api.framework.model.ContextObject//net.rim.device.apps.api.framework.model.ContextObject net.rim.device.apps.api.framework.model.ContextObject net.rim.device.apps.api.framework.model.ContextObject
	bipush 77
	i2l 
	aload_5 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.component.AutoTextEditField ) // pc=1
	invokestatic_lib java.lang.Object put( java.lang.Object, long, java.lang.Object ) // ContextObject
	pop 
	goto Label65
Label51:
	aload_1 
	instanceof_lib net.rim.device.api.ui.component.ActiveAutoTextEditField//net.rim.device.api.ui.component.ActiveAutoTextEditField net.rim.device.api.ui.component.ActiveAutoTextEditField net.rim.device.api.ui.component.ActiveAutoTextEditField
	ifeq Label65
	iload_4 
	ifne Label65
	aload_1 
	checkcast_lib net.rim.device.api.ui.component.ActiveAutoTextEditField//net.rim.device.api.ui.component.ActiveAutoTextEditField net.rim.device.api.ui.component.ActiveAutoTextEditField net.rim.device.api.ui.component.ActiveAutoTextEditField
	astore_5 
	aload_5 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.RichTextField ) // pc=1
	astore_3 
	aload_0 
	aload_3 
	invokevirtual setText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.String ) // pc=2
Label65:
	aload_3 
	ifnull Label72
	aload_3 
	stringlength 
	ifle Label72
	iconst_1 
	ireturn 
Label72:
	iconst_0 
	ireturn 
	}


public boolean validate( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, net.rim.device.api.ui.Field, java.lang.Object ); // address: 0
	{
	enter_narrow 
	iconst_1 
	ireturn 
	}


public int getOrder( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcastbranch_lib 
	astore_2 
	aload_2 
	bipush 11
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label16
	aload_2 
	iconst_0 
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label14
	sipush 6100
	ireturn 
Label14:
	sipush 7100
	ireturn 
Label16:
	aload_2 
	bipush 24
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label22
	sipush 17100
	ireturn 
Label22:
	aload_2 
	bipush 28
	invokevirtual boolean getFlag( net.rim.device.apps.api.framework.model.ContextObject, int ) // pc=2
	ifeq Label28
	sipush 13500
	ireturn 
Label28:
	sipush 5500
	ireturn 
	}


public setTextEncoding( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.Object ); // address: 0
	{
	putfield_return .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public int getSyncFieldId( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	bipush 11
	invokestatic_lib boolean getFlag( java.lang.Object, int ) // ContextObject
	ifeq Label7
	bipush 64
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public java.lang.Object getTextEncoding( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public boolean checkCrypt( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, boolean, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	iload_2 
	invokestatic_lib boolean checkEncoding( java.lang.Object, boolean, boolean ) // PersistentContent
	ireturn 
	}


public java.lang.Object reCrypt( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, boolean, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	iload_2 
	invokestatic_lib java.lang.Object reEncode( java.lang.Object, boolean, boolean ) // PersistentContent
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aconst_null 
	areturn 
	}


public boolean equals( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl, java.lang.Object ); // address: 0
	{
	enter 
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
	invokevirtual java.lang.String getText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ) // pc=1
	astore_3 
	aload_2 
	invokevirtual java.lang.String getText( net.rim.device.apps.internal.commonmodels.body.BodyModelImpl ) // pc=1
	astore_4 
	aload_3 
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ireturn 
Label19:
	iconst_0 
	ireturn 
	}

}
