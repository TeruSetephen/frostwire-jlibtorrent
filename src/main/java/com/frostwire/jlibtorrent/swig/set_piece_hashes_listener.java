/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class set_piece_hashes_listener {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected set_piece_hashes_listener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(set_piece_hashes_listener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_set_piece_hashes_listener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void progress(SWIGTYPE_p_libtorrent__piece_index_t i) {
    libtorrent_jni.set_piece_hashes_listener_progress(swigCPtr, this, SWIGTYPE_p_libtorrent__piece_index_t.getCPtr(i));
  }

  public set_piece_hashes_listener() {
    this(libtorrent_jni.new_set_piece_hashes_listener(), true);
  }

}
