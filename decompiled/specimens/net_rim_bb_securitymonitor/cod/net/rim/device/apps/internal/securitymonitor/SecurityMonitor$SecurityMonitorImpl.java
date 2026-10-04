// #######################################################
// Decompiled by   : coddec 
// Module          : net_rim_bb_securitymonitor.cod
// Module version  : 7.1.0.1066
// Class ID        : 3
// ########################################################


package net.rim.device.apps.internal.securitymonitor;


abstract final class SecurityMonitor$SecurityMonitorImpl extends Object
implements net.rim.device.api.system.SystemListener, net.rim.device.api.system.GlobalEventListener, net.rim.device.api.itpolicy.ITPolicyChangedListener, net.rim.device.api.system.RealtimeClockListener, net.rim.device.apps.internal.itadmin.DelayedWipeManager

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.internal.system.Security /*net.rim.device.internal.system.Security*/  _security ; // ofs = 2332 addr = 0)
	private String /*java.lang.String*/  _randomString ; // ofs = 2336 addr = 0)
	private String /*java.lang.String*/  LOCK_WIPE ; // ofs = 2340 addr = 0)
	private String /*java.lang.String*/  IT_POLICY_WIPE ; // ofs = 2344 addr = 0)
	private String /*java.lang.String*/  DELAYED_WIPE ; // ofs = 2348 addr = 0)
	private boolean /*boolean*/  _lowBatteryWipe ; // ofs = 2352 addr = 0)
	private long /*long*/  _itPolicyWipeDelay ; // ofs = 2356 addr = 0)
	private long /*long*/  _lockWipeDelay ; // ofs = 2360 addr = 0)
	private int /*int*/  _lockCounter ; // ofs = 2364 addr = 0)
	private int /*int*/  _unlockCounter ; // ofs = 2368 addr = 0)
	private long /*long*/  _itPolicyTimestamp ; // ofs = 2372 addr = 0)
	private net.rim.device.api.system.ApplicationDescriptor /*net.rim.device.api.system.ApplicationDescriptor*/  _itPolicyWipeApplicationDescriptor ; // ofs = 2376 addr = 0)
	private net.rim.device.api.system.ApplicationDescriptor /*net.rim.device.api.system.ApplicationDescriptor*/  _lockWipeApplicationDescriptor ; // ofs = 2380 addr = 0)
	private net.rim.device.api.system.ApplicationDescriptor /*net.rim.device.api.system.ApplicationDescriptor*/  _delayedWipeApplicationDescriptor ; // ofs = 2384 addr = 0)
	private long /*long*/  _nextTick ; // ofs = 2388 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  _persistentObject ; // ofs = 2392 addr = 0)
	private net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl$Data /*net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl$Data*/  _data ; // ofs = 2396 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	invokestatic_lib net.rim.device.internal.system.Security getInstance(  ) // Security
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	bipush 32
	invokestatic_lib byte[] getBytes( int ) // RandomSource
	invokespecial_lib java.lang.String.<init> // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	ldc literal_7:"lock"
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	ldc literal_8:"itpolicy"
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	ldc literal_9:"delayed"
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib net.rim.device.api.system.ApplicationDescriptor currentApplicationDescriptor(  ) // ApplicationDescriptor
	astore_1 
	aload_0 
	new_lib net.rim.device.internal.system.Security//net.rim.device.internal.system.Security net.rim.device.internal.system.Security net.rim.device.internal.system.Security
	dup 
	aload_1 
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aastore 
	dup 
	iconst_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aastore 
	invokespecial_lib net.rim.device.api.system.ApplicationDescriptor.<init> // pc=3
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	new_lib net.rim.device.internal.system.Security//net.rim.device.internal.system.Security net.rim.device.internal.system.Security net.rim.device.internal.system.Security
	dup 
	aload_1 
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aastore 
	dup 
	iconst_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aastore 
	invokespecial_lib net.rim.device.api.system.ApplicationDescriptor.<init> // pc=3
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	new_lib net.rim.device.internal.system.Security//net.rim.device.internal.system.Security net.rim.device.internal.system.Security net.rim.device.internal.system.Security
	dup 
	aload_1 
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aastore 
	dup 
	iconst_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aastore 
	invokespecial_lib net.rim.device.api.system.ApplicationDescriptor.<init> // pc=3
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 3
	invokevirtual setPowerOnBehavior( net.rim.device.api.system.ApplicationDescriptor, int ) // pc=2
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	bipush 3
	invokevirtual setPowerOnBehavior( net.rim.device.api.system.ApplicationDescriptor, int ) // pc=2
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 3
	invokevirtual setPowerOnBehavior( net.rim.device.api.system.ApplicationDescriptor, int ) // pc=2
	aload_0 
	lipush 4540117967283091590
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // RIMPersistentStore
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	astore_2 
	aload_2 
	instanceof SecurityMonitor$SecurityMonitorImpl$Data
	ifeq Label96
	aload_0 
	aload_2 
	checkcast SecurityMonitor$SecurityMonitorImpl$Data
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	goto Label113
Label96:
	aload_2 
	ifnonnull Label111
	aload_0 
	new SecurityMonitor$SecurityMonitorImpl$Data
	dup 
	aconst_null 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl$Data.<init> // pc=2
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	bipush 51
	invokevirtual setContents( net.rim.device.api.system.PersistentObject, java.lang.Object, int ) // pc=3
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	goto Label113
Label111:
	iipush 1466201188
	invokestatic_lib deviceUnderAttack( int ) // Security
Label113:
	aload_0 
	invokenonvirtual net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.clockUpdated // pc=1
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.loadITPolicySettings // pc=1
	invokestatic_lib boolean isPasswordEnabled(  ) // Security
	istore_3 
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_0 
	i2l 
	lcmp 
	ifgt Label135
	iload_3 
	ifeq Label131
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	goto Label135
Label131:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iconst_0 
	i2l 
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label135:
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getLockCounter( net.rim.device.internal.system.Security ) // pc=1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getUnlockCounter( net.rim.device.internal.system.Security ) // pc=1
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	invokestatic_lib long getProcessedTimeStamp(  ) // ITPolicyInternal
	lputfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartWipeTimers // pc=1
	iload_3 
	ifne Label170
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_0 
	i2l 
	lcmp 
	ifle Label170
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	i2l 
	lcmp 
	ifle Label170
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifeq Label170
	iipush 1281652595
	invokestatic_lib logLockEvent( int ) // LockEventLogger
	invokestatic_lib net.rim.device.api.system.ApplicationManager getApplicationManager(  ) // ApplicationManager
	iconst_1 
	invokevirtual lockSystem( net.rim.device.api.system.ApplicationManager, boolean ) // pc=2
Label170:
	invokestatic_lib net.rim.device.internal.proxy.Proxy getInstance(  ) // Proxy
	astore_4 
	aload_4 
	aload_0 
	invokevirtual addSystemListener( net.rim.device.internal.proxy.Proxy, net.rim.device.api.system.SystemListener ) // pc=2
	aload_4 
	aload_0 
	invokevirtual addGlobalEventListener( net.rim.device.internal.proxy.Proxy, net.rim.device.api.system.GlobalEventListener ) // pc=2
	aload_4 
	aload_0 
	invokestatic_lib addListener( net.rim.device.api.system.Application, net.rim.device.api.itpolicy.ITPolicyListener ) // ITPolicy
	aload_4 
	aload_0 
	invokevirtual addRealtimeClockListener( net.rim.device.internal.proxy.Proxy, net.rim.device.api.system.RealtimeClockListener ) // pc=2
	return 
	}


<init>( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, net.rim.device.apps.internal.securitymonitor.SecurityMonitor$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.<init> // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final checkTimers( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label7
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label8
Label7:
	return 
Label8:
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label15
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.checkLockWipeTimer // pc=1
	return 
Label15:
	aload_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label22
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.checkITPolicyWipeTimer // pc=1
	return 
Label22:
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label28
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.checkDelayedWipeTimer // pc=1
Label28:
	return 
	}


private final loadITPolicySettings( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	aload_0 
	bipush 24
	bipush 69
	iconst_0 
	invokestatic_lib boolean getBoolean( int, int, boolean ) // ITPolicy
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	bipush 24
	bipush 70
	bipush -1
	invokestatic_lib int getInteger( int, int, int ) // ITPolicy
	i2l 
	iipush 3600000
	i2l 
	lmul 
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	lstore 1
	aload_0 
	bipush 24
	bipush 71
	bipush -1
	invokestatic_lib int getInteger( int, int, int ) // ITPolicy
	i2l 
	iipush 3600000
	i2l 
	lmul 
	lputfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	i2l 
	lcmp 
	ifne Label40
	aload_0 
	iipush 300000
	i2l 
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label40:
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_0 
	i2l 
	lcmp 
	ifne Label50
	aload_0 
	iipush 300000
	i2l 
	lputfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label50:
	lload 1
	iconst_0 
	i2l 
	lcmp 
	ifgt Label63
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_0 
	i2l 
	lcmp 
	ifle Label63
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.setLockWipeStartTime // pc=1
Label63:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_0 
	i2l 
	lcmp 
	ifgt Label82
	aload_0 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	i2l 
	lcmp 
	ifgt Label82
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	i2l 
	lcmp 
	ifle Label84
Label82:
	iconst_1 
	goto Label85
Label84:
	iconst_0 
Label85:
	invokevirtual setAutoOnRequired( net.rim.device.internal.system.Security, boolean ) // pc=2
	return 
	}


private final restartTimer( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, net.rim.device.api.system.ApplicationDescriptor, long, long, int ); // address: 0
	{
	enter 
	lload 2
	iconst_0 
	i2l 
	lcmp 
	ifle Label29
	lload 4
	iconst_0 
	i2l 
	lcmp 
	ifgt Label19
	invokestatic_lib net.rim.device.api.system.ApplicationManager getApplicationManager(  ) // ApplicationManager
	aload_1 
	bipush -1
	i2l 
	iconst_1 
	invokevirtual boolean scheduleApplication( net.rim.device.api.system.ApplicationManager, net.rim.device.api.system.ApplicationDescriptor, long, boolean ) // pc=5
	pop 
	return 
Label19:
	invokestatic_lib net.rim.device.api.system.ApplicationManager getApplicationManager(  ) // ApplicationManager
	aload_1 
	lload 2
	lload 4
	ladd 
	iconst_1 
	invokevirtual boolean scheduleApplication( net.rim.device.api.system.ApplicationManager, net.rim.device.api.system.ApplicationDescriptor, long, boolean ) // pc=5
	ifne Label29
	iload_6 
	invokestatic_lib deviceUnderAttack( int ) // Security
Label29:
	return 
	}


private final restartLockWipeTimer( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iipush 1466726260
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartTimer // pc=7
	return 
	}


private final restartITPolicyWipeTimer( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iipush 1466529652
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartTimer // pc=7
	return 
	}


private final restartDelayedWipeTimer( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iipush 1466201972
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartTimer // pc=7
	return 
	}


private final restartWipeTimers( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartLockWipeTimer // pc=1
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartITPolicyWipeTimer // pc=1
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartDelayedWipeTimer // pc=1
	return 
	}


private final checkLockWipeTimer( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_0 
	i2l 
	lcmp 
	ifle Label32
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	i2l 
	lcmp 
	ifle Label32
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ladd 
	invokestatic_lib long currentTimeMillis(  ) // System
	iipush 60000
	i2l 
	ladd 
	lcmp 
	ifge Label32
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getUnlockCounter( net.rim.device.internal.system.Security ) // pc=1
	if_icmpne Label32
	invokestatic_lib boolean isPasswordEnabled(  ) // Security
	ifeq Label32
	iipush 1466196332
	invokestatic_lib deviceUnderAttack( int ) // Security
Label32:
	return 
	}


private final checkITPolicyWipeTimer( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	aload_0 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	i2l 
	lcmp 
	ifle Label31
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	i2l 
	lcmp 
	ifle Label31
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ladd 
	invokestatic_lib long currentTimeMillis(  ) // System
	iipush 60000
	i2l 
	ladd 
	lcmp 
	ifge Label31
	aload_0 
	lgetfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokestatic_lib long getProcessedTimeStamp(  ) // ITPolicyInternal
	lcmp 
	ifne Label31
	iipush 1466196338
	invokestatic_lib deviceUnderAttack( int ) // Security
Label31:
	return 
	}


private final checkDelayedWipeTimer( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	i2l 
	lcmp 
	ifle Label36
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_0 
	i2l 
	lcmp 
	ifle Label36
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ladd 
	invokestatic_lib long currentTimeMillis(  ) // System
	iipush 60000
	i2l 
	ladd 
	lcmp 
	ifge Label36
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifeq Label31
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getUnlockCounter( net.rim.device.internal.system.Security ) // pc=1
	if_icmpne Label36
Label31:
	aload_0 
	iconst_1 
	iconst_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.sendAcknowledgement // pc=3
	return 
Label36:
	return 
	}


private final cleanOrphanTransactionIds( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label9
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label9
	aload_3 
	ifnonnull Label10
Label9:
	return 
Label10:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	aload_3 
	invokestatic_lib long parseLong( java.lang.String ) // Long
	invokespecial_lib java.lang.Long.<init> // pc=3
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_4 
	iload_4 
	bipush -1
	if_icmpeq Label28
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_4 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
Label28:
	return 
	}


private final sendAcknowledgement( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, boolean, byte ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label5
	iconst_1 
	goto Label6
Label5:
	iconst_0 
Label6:
	istore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label23
	lipush -5931567696721035212
	iload_3 
	iload_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aconst_null 
	invokestatic_lib boolean postGlobalEvent( long, int, int, java.lang.Object, java.lang.Object ) // RIMGlobalMessagePoster
	pop 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aconst_null 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
Label23:
	return 
	}


private final setLockWipeStartTime( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_0 
	i2l 
	lcmp 
	ifle Label12
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
Label12:
	return 
	}


private final setITPolicyWipeStartTime( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	}


private final setDelayedWipeStartTime( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, long, boolean, long, net.rim.device.api.util.DataBuffer ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lload 1
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iload_3 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lload 4
	lputfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_6 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	}


private final resetDelayedWipeStartTime( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iconst_0 
	i2l 
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iconst_0 
	i2l 
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iconst_1 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	bipush -1
	i2l 
	lputfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	}


private final dateTimeChanged( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 1
	lload 1
	aload_0 
	lgetfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	lsub 
	lstore 3
	aload_0 
	lload 3
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.adjustWipeStartTimes // pc=3
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartWipeTimers // pc=1
	return 
	}


private final adjustWipeStartTimes( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, long ); // address: 0
	{
	enter 
	iipush 1465139522
	lload 1
	invokestatic_lib logWipeEvent( int, long ) // WipeEventLogger
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	dup 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_0 
	i2l 
	lcmp 
	ifle Label15
	lload 1
	goto Label17
Label15:
	iconst_0 
	i2l 
Label17:
	ladd 
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	dup 
	lgetfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	i2l 
	lcmp 
	ifle Label30
	lload 1
	goto Label32
Label30:
	iconst_0 
	i2l 
Label32:
	ladd 
	lputfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	dup 
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	lload 1
	ladd 
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final policyChanged( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, java.lang.String, boolean ); // address: 0
	{
	enter 
	invokestatic_lib long getProcessedTimeStamp(  ) // ITPolicyInternal
	lstore 3
	aload_0 
	lgetfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	lload 3
	lcmp 
	ifeq Label19
	aload_0 
	lload 3
	lputfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.loadITPolicySettings // pc=1
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.setITPolicyWipeStartTime // pc=1
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartITPolicyWipeTimer // pc=1
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartLockWipeTimer // pc=1
Label19:
	return 
	}


public final eventOccurred( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, long, int, int, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	lload 1
	lipush 8877632280522743328
	lcmp 
	ifne Label8
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.dateTimeChanged // pc=1
	return 
Label8:
	lload 1
	lipush -7131874474196788121
	lcmp 
	ifne Label43
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getLockCounter( net.rim.device.internal.system.Security ) // pc=1
	istore_7 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_7 
	if_icmpeq Label30
	aload_0 
	iload_7 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getUnlockCounter( net.rim.device.internal.system.Security ) // pc=1
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.setLockWipeStartTime // pc=1
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartLockWipeTimer // pc=1
	return 
Label30:
	iload_7 
	iconst_1 
	if_icmpne Label62
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_0 
	i2l 
	lcmp 
	ifgt Label62
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
Label43:
	lload 1
	lipush 6345609069135580235
	lcmp 
	ifne Label62
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifeq Label62
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	i2l 
	lcmp 
	ifle Label62
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.resetDelayedWipeStartTime // pc=1
	aload_0 
	iconst_0 
	bipush 82
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.sendAcknowledgement // pc=3
Label62:
	return 
	}


public final boolean startDelayedWipe( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, long, boolean, long, net.rim.device.api.util.DataBuffer ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	lload 4
	invokespecial_lib java.lang.Long.<init> // pc=3
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_7 
	iload_7 
	bipush -1
	if_icmpeq Label27
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_6 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	iconst_0 
	bipush 80
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.sendAcknowledgement // pc=3
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_7 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	iconst_1 
	ireturn 
Label27:
	aload_0 
	lload 1
	iload_3 
	lload 4
	aload_6 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.setDelayedWipeStartTime // pc=7
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_0 
	i2l 
	lcmp 
	ifgt Label52
	aload_0 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	i2l 
	lcmp 
	ifgt Label52
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	i2l 
	lcmp 
	ifle Label54
Label52:
	iconst_1 
	goto Label55
Label54:
	iconst_0 
Label55:
	invokevirtual setAutoOnRequired( net.rim.device.internal.system.Security, boolean ) // pc=2
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.restartDelayedWipeTimer // pc=1
	iconst_1 
	ireturn 
	}


public final boolean cancelDelayedWipe( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, long ); // address: 0
	{
	enter 
	lload 1
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	lgetfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	lcmp 
	ifne Label14
	aload_0 
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.resetDelayedWipeStartTime // pc=1
	aload_0 
	iconst_0 
	bipush 81
	invokespecial net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl.sendAcknowledgement // pc=3
	iconst_1 
	ireturn 
Label14:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	lload 1
	invokespecial_lib java.lang.Long.<init> // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	new_lib net.rim.device.internal.system.Security//net.rim.device.internal.system.Security net.rim.device.internal.system.Security net.rim.device.internal.system.Security
	dup 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 3
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	ldc literal_6:"cancel"
	aastore 
	dup 
	iconst_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aastore 
	dup 
	bipush 2
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	lload 1
	invokespecial_lib java.lang.Long.<init> // pc=3
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	invokespecial_lib net.rim.device.api.system.ApplicationDescriptor.<init> // pc=3
	astore_3 
	aload_3 
	bipush 3
	invokevirtual setPowerOnBehavior( net.rim.device.api.system.ApplicationDescriptor, int ) // pc=2
	invokestatic_lib net.rim.device.api.system.ApplicationManager getApplicationManager(  ) // ApplicationManager
	aload_3 
	invokestatic_lib long currentTimeMillis(  ) // System
	iipush 604800000
	i2l 
	ladd 
	iconst_1 
	invokevirtual boolean scheduleApplication( net.rim.device.api.system.ApplicationManager, net.rim.device.api.system.ApplicationDescriptor, long, boolean ) // pc=5
	pop 
	iconst_0 
	ireturn 
	}


public final powerOff( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	noenter_return 
	}


public final powerUp( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getLockCounter( net.rim.device.internal.system.Security ) // pc=1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getUnlockCounter( net.rim.device.internal.system.Security ) // pc=1
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	invokestatic_lib long getProcessedTimeStamp(  ) // ITPolicyInternal
	lputfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	return 
	}


public final batteryLow( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	noenter_return 
	}


public final batteryGood( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	noenter_return 
	}


public final batteryStatusChange( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	sipush 16384
	iand 
	ifeq Label11
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifeq Label11
	iconst_0 
	invokestatic_lib enable( boolean ) // Backlight
	iipush 1466065268
	invokestatic_lib deviceUnderAttack( int ) // Security
Label11:
	return 
	}


public final clockUpdated( net.rim.device.apps.internal.securitymonitor.SecurityMonitor$SecurityMonitorImpl ); // address: 0
	{
	enter 
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	iipush 60000
	i2l 
	ladd 
	lputfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	return 
	}

}
