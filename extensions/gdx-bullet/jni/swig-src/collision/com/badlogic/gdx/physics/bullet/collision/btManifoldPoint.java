/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btManifoldPoint extends BulletBase {
	private long swigCPtr;
	
	protected btManifoldPoint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btManifoldPoint, normally you should not need this constructor it's intended for low-level usage. */ 
	public btManifoldPoint(long cPtr, boolean cMemoryOwn) {
		this("btManifoldPoint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btManifoldPoint obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btManifoldPoint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	/** Temporary instance, use by native methods that return a btManifoldPoint instance */
	protected final static btManifoldPoint temp = new btManifoldPoint(0, false);
	public static btManifoldPoint internalTemp(long cPtr, boolean own) {
		temp.reset(cPtr, own);
		return temp;
	}
	/** Pool of btManifoldPoint instances, used by director interface to provide the arguments. */
	protected static final com.badlogic.gdx.utils.Pool<btManifoldPoint> pool = new com.badlogic.gdx.utils.Pool<btManifoldPoint>() {
		@Override
		protected btManifoldPoint newObject() {
			return new btManifoldPoint(0, false);
		}
	};
	/** Reuses a previous freed instance or creates a new instance and set it to reflect the specified native object */
	public static btManifoldPoint obtain(long cPtr, boolean own) {
		final btManifoldPoint result = pool.obtain();
		result.reset(cPtr, own);
		return result;
	}
	/** delete the native object if required and allow the instance to be reused by the obtain method */
	public static void free(final btManifoldPoint inst) {
		inst.dispose();
		pool.free(inst);
	}

  public btManifoldPoint() {
    this(CollisionJNI.new_btManifoldPoint__SWIG_0(), true);
  }

  public btManifoldPoint(Vector3 pointA, Vector3 pointB, Vector3 normal, float distance) {
    this(CollisionJNI.new_btManifoldPoint__SWIG_1(pointA, pointB, normal, distance), true);
  }

  public void setLocalPointA(btVector3 value) {
    CollisionJNI.btManifoldPoint_localPointA_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getLocalPointA() {
    long cPtr = CollisionJNI.btManifoldPoint_localPointA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setLocalPointB(btVector3 value) {
    CollisionJNI.btManifoldPoint_localPointB_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getLocalPointB() {
    long cPtr = CollisionJNI.btManifoldPoint_localPointB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setPositionWorldOnB(btVector3 value) {
    CollisionJNI.btManifoldPoint_positionWorldOnB_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getPositionWorldOnB() {
    long cPtr = CollisionJNI.btManifoldPoint_positionWorldOnB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setPositionWorldOnA(btVector3 value) {
    CollisionJNI.btManifoldPoint_positionWorldOnA_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getPositionWorldOnA() {
    long cPtr = CollisionJNI.btManifoldPoint_positionWorldOnA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setNormalWorldOnB(btVector3 value) {
    CollisionJNI.btManifoldPoint_normalWorldOnB_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getNormalWorldOnB() {
    long cPtr = CollisionJNI.btManifoldPoint_normalWorldOnB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setDistance1(float value) {
    CollisionJNI.btManifoldPoint_distance1_set(swigCPtr, this, value);
  }

  public float getDistance1() {
    return CollisionJNI.btManifoldPoint_distance1_get(swigCPtr, this);
  }

  public void setCombinedFriction(float value) {
    CollisionJNI.btManifoldPoint_combinedFriction_set(swigCPtr, this, value);
  }

  public float getCombinedFriction() {
    return CollisionJNI.btManifoldPoint_combinedFriction_get(swigCPtr, this);
  }

  public void setCombinedRollingFriction(float value) {
    CollisionJNI.btManifoldPoint_combinedRollingFriction_set(swigCPtr, this, value);
  }

  public float getCombinedRollingFriction() {
    return CollisionJNI.btManifoldPoint_combinedRollingFriction_get(swigCPtr, this);
  }

  public void setCombinedRestitution(float value) {
    CollisionJNI.btManifoldPoint_combinedRestitution_set(swigCPtr, this, value);
  }

  public float getCombinedRestitution() {
    return CollisionJNI.btManifoldPoint_combinedRestitution_get(swigCPtr, this);
  }

  public void setPartId0(int value) {
    CollisionJNI.btManifoldPoint_partId0_set(swigCPtr, this, value);
  }

  public int getPartId0() {
    return CollisionJNI.btManifoldPoint_partId0_get(swigCPtr, this);
  }

  public void setPartId1(int value) {
    CollisionJNI.btManifoldPoint_partId1_set(swigCPtr, this, value);
  }

  public int getPartId1() {
    return CollisionJNI.btManifoldPoint_partId1_get(swigCPtr, this);
  }

  public void setIndex0(int value) {
    CollisionJNI.btManifoldPoint_index0_set(swigCPtr, this, value);
  }

  public int getIndex0() {
    return CollisionJNI.btManifoldPoint_index0_get(swigCPtr, this);
  }

  public void setIndex1(int value) {
    CollisionJNI.btManifoldPoint_index1_set(swigCPtr, this, value);
  }

  public int getIndex1() {
    return CollisionJNI.btManifoldPoint_index1_get(swigCPtr, this);
  }

  public void setUserPersistentData(long value) {
    CollisionJNI.btManifoldPoint_userPersistentData_set(swigCPtr, this, value);
  }

  public long getUserPersistentData() {
    return CollisionJNI.btManifoldPoint_userPersistentData_get(swigCPtr, this);
  }

  public void setLateralFrictionInitialized(boolean value) {
    CollisionJNI.btManifoldPoint_lateralFrictionInitialized_set(swigCPtr, this, value);
  }

  public boolean getLateralFrictionInitialized() {
    return CollisionJNI.btManifoldPoint_lateralFrictionInitialized_get(swigCPtr, this);
  }

  public void setAppliedImpulse(float value) {
    CollisionJNI.btManifoldPoint_appliedImpulse_set(swigCPtr, this, value);
  }

  public float getAppliedImpulse() {
    return CollisionJNI.btManifoldPoint_appliedImpulse_get(swigCPtr, this);
  }

  public void setAppliedImpulseLateral1(float value) {
    CollisionJNI.btManifoldPoint_appliedImpulseLateral1_set(swigCPtr, this, value);
  }

  public float getAppliedImpulseLateral1() {
    return CollisionJNI.btManifoldPoint_appliedImpulseLateral1_get(swigCPtr, this);
  }

  public void setAppliedImpulseLateral2(float value) {
    CollisionJNI.btManifoldPoint_appliedImpulseLateral2_set(swigCPtr, this, value);
  }

  public float getAppliedImpulseLateral2() {
    return CollisionJNI.btManifoldPoint_appliedImpulseLateral2_get(swigCPtr, this);
  }

  public void setContactMotion1(float value) {
    CollisionJNI.btManifoldPoint_contactMotion1_set(swigCPtr, this, value);
  }

  public float getContactMotion1() {
    return CollisionJNI.btManifoldPoint_contactMotion1_get(swigCPtr, this);
  }

  public void setContactMotion2(float value) {
    CollisionJNI.btManifoldPoint_contactMotion2_set(swigCPtr, this, value);
  }

  public float getContactMotion2() {
    return CollisionJNI.btManifoldPoint_contactMotion2_get(swigCPtr, this);
  }

  public void setContactCFM1(float value) {
    CollisionJNI.btManifoldPoint_contactCFM1_set(swigCPtr, this, value);
  }

  public float getContactCFM1() {
    return CollisionJNI.btManifoldPoint_contactCFM1_get(swigCPtr, this);
  }

  public void setContactCFM2(float value) {
    CollisionJNI.btManifoldPoint_contactCFM2_set(swigCPtr, this, value);
  }

  public float getContactCFM2() {
    return CollisionJNI.btManifoldPoint_contactCFM2_get(swigCPtr, this);
  }

  public void setLifeTime(int value) {
    CollisionJNI.btManifoldPoint_lifeTime_set(swigCPtr, this, value);
  }

  public int getLifeTime() {
    return CollisionJNI.btManifoldPoint_lifeTime_get(swigCPtr, this);
  }

  public void setLateralFrictionDir1(btVector3 value) {
    CollisionJNI.btManifoldPoint_lateralFrictionDir1_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getLateralFrictionDir1() {
    long cPtr = CollisionJNI.btManifoldPoint_lateralFrictionDir1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setLateralFrictionDir2(btVector3 value) {
    CollisionJNI.btManifoldPoint_lateralFrictionDir2_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getLateralFrictionDir2() {
    long cPtr = CollisionJNI.btManifoldPoint_lateralFrictionDir2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public float getDistance() {
    return CollisionJNI.btManifoldPoint_getDistance(swigCPtr, this);
  }

  public void setDistance(float dist) {
    CollisionJNI.btManifoldPoint_setDistance(swigCPtr, this, dist);
  }

  public int getUserValue() {
    return CollisionJNI.btManifoldPoint_getUserValue(swigCPtr, this);
  }

  public void setUserValue(int value) {
    CollisionJNI.btManifoldPoint_setUserValue(swigCPtr, this, value);
  }

}
