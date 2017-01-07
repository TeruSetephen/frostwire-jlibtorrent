/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class string_long_map {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected string_long_map(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(string_long_map obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_string_long_map(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public string_long_map() {
    this(libtorrent_jni.new_string_long_map__SWIG_0(), true);
  }

  public string_long_map(string_long_map arg0) {
    this(libtorrent_jni.new_string_long_map__SWIG_1(string_long_map.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return libtorrent_jni.string_long_map_size(swigCPtr, this);
  }

  public boolean empty() {
    return libtorrent_jni.string_long_map_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.string_long_map_clear(swigCPtr, this);
  }

  public int get(String key) {
    return libtorrent_jni.string_long_map_get(swigCPtr, this, key);
  }

  public void set(String key, int x) {
    libtorrent_jni.string_long_map_set(swigCPtr, this, key, x);
  }

  public void erase(String key) {
    libtorrent_jni.string_long_map_erase(swigCPtr, this, key);
  }

  public boolean has_key(String key) {
    return libtorrent_jni.string_long_map_has_key(swigCPtr, this, key);
  }

  public string_vector keys() {
    return new string_vector(libtorrent_jni.string_long_map_keys(swigCPtr, this), true);
  }

}
