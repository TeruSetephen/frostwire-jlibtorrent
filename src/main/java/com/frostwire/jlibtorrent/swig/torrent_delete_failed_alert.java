/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class torrent_delete_failed_alert extends torrent_alert {
  private transient long swigCPtr;

  protected torrent_delete_failed_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.torrent_delete_failed_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(torrent_delete_failed_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_torrent_delete_failed_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.torrent_delete_failed_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.torrent_delete_failed_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.torrent_delete_failed_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.torrent_delete_failed_alert_message(swigCPtr, this);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.torrent_delete_failed_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public sha1_hash getInfo_hash() {
    long cPtr = libtorrent_jni.torrent_delete_failed_alert_info_hash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public final static int priority = libtorrent_jni.torrent_delete_failed_alert_priority_get();
  public final static int alert_type = libtorrent_jni.torrent_delete_failed_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.torrent_delete_failed_alert_static_category_get();
}
