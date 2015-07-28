/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class bt_peer_connection extends peer_connection {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected bt_peer_connection(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.bt_peer_connection_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(bt_peer_connection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        libtorrent_jni.delete_bt_peer_connection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void start() {
    libtorrent_jni.bt_peer_connection_start(swigCPtr, this);
  }

  public boolean supports_encryption() {
    return libtorrent_jni.bt_peer_connection_supports_encryption(swigCPtr, this);
  }

  public boolean rc4_encrypted() {
    return libtorrent_jni.bt_peer_connection_rc4_encrypted(swigCPtr, this);
  }

  public int type() {
    return libtorrent_jni.bt_peer_connection_type(swigCPtr, this);
  }

  public void on_sent(error_code error, long bytes_transferred) {
    libtorrent_jni.bt_peer_connection_on_sent(swigCPtr, this, error_code.getCPtr(error), error, bytes_transferred);
  }

  public void on_receive(error_code error, long bytes_transferred) {
    libtorrent_jni.bt_peer_connection_on_receive(swigCPtr, this, error_code.getCPtr(error), error, bytes_transferred);
  }

  public void on_receive_impl(long bytes_transferred) {
    libtorrent_jni.bt_peer_connection_on_receive_impl(swigCPtr, this, bytes_transferred);
  }

  public void get_specific_peer_info(peer_info p) {
    libtorrent_jni.bt_peer_connection_get_specific_peer_info(swigCPtr, this, peer_info.getCPtr(p), p);
  }

  public boolean in_handshake() {
    return libtorrent_jni.bt_peer_connection_in_handshake(swigCPtr, this);
  }

  public boolean packet_finished() {
    return libtorrent_jni.bt_peer_connection_packet_finished(swigCPtr, this);
  }

  public boolean supports_holepunch() {
    return libtorrent_jni.bt_peer_connection_supports_holepunch(swigCPtr, this);
  }

  public boolean support_extensions() {
    return libtorrent_jni.bt_peer_connection_support_extensions(swigCPtr, this);
  }

  public void on_keepalive() {
    libtorrent_jni.bt_peer_connection_on_keepalive(swigCPtr, this);
  }

  public void on_choke(int received) {
    libtorrent_jni.bt_peer_connection_on_choke(swigCPtr, this, received);
  }

  public void on_unchoke(int received) {
    libtorrent_jni.bt_peer_connection_on_unchoke(swigCPtr, this, received);
  }

  public void on_interested(int received) {
    libtorrent_jni.bt_peer_connection_on_interested(swigCPtr, this, received);
  }

  public void on_not_interested(int received) {
    libtorrent_jni.bt_peer_connection_on_not_interested(swigCPtr, this, received);
  }

  public void on_have(int received) {
    libtorrent_jni.bt_peer_connection_on_have(swigCPtr, this, received);
  }

  public void on_bitfield(int received) {
    libtorrent_jni.bt_peer_connection_on_bitfield(swigCPtr, this, received);
  }

  public void on_request(int received) {
    libtorrent_jni.bt_peer_connection_on_request(swigCPtr, this, received);
  }

  public void on_piece(int received) {
    libtorrent_jni.bt_peer_connection_on_piece(swigCPtr, this, received);
  }

  public void on_cancel(int received) {
    libtorrent_jni.bt_peer_connection_on_cancel(swigCPtr, this, received);
  }

  public void on_dht_port(int received) {
    libtorrent_jni.bt_peer_connection_on_dht_port(swigCPtr, this, received);
  }

  public void on_suggest_piece(int received) {
    libtorrent_jni.bt_peer_connection_on_suggest_piece(swigCPtr, this, received);
  }

  public void on_have_all(int received) {
    libtorrent_jni.bt_peer_connection_on_have_all(swigCPtr, this, received);
  }

  public void on_have_none(int received) {
    libtorrent_jni.bt_peer_connection_on_have_none(swigCPtr, this, received);
  }

  public void on_reject_request(int received) {
    libtorrent_jni.bt_peer_connection_on_reject_request(swigCPtr, this, received);
  }

  public void on_allowed_fast(int received) {
    libtorrent_jni.bt_peer_connection_on_allowed_fast(swigCPtr, this, received);
  }

  public void on_holepunch() {
    libtorrent_jni.bt_peer_connection_on_holepunch(swigCPtr, this);
  }

  public void on_extended(int received) {
    libtorrent_jni.bt_peer_connection_on_extended(swigCPtr, this, received);
  }

  public void on_extended_handshake() {
    libtorrent_jni.bt_peer_connection_on_extended_handshake(swigCPtr, this);
  }

  public void write_choke() {
    libtorrent_jni.bt_peer_connection_write_choke(swigCPtr, this);
  }

  public void write_unchoke() {
    libtorrent_jni.bt_peer_connection_write_unchoke(swigCPtr, this);
  }

  public void write_interested() {
    libtorrent_jni.bt_peer_connection_write_interested(swigCPtr, this);
  }

  public void write_not_interested() {
    libtorrent_jni.bt_peer_connection_write_not_interested(swigCPtr, this);
  }

  public void write_request(peer_request r) {
    libtorrent_jni.bt_peer_connection_write_request(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public void write_cancel(peer_request r) {
    libtorrent_jni.bt_peer_connection_write_cancel(swigCPtr, this, peer_request.getCPtr(r), r);
  }

  public void write_bitfield() {
    libtorrent_jni.bt_peer_connection_write_bitfield(swigCPtr, this);
  }

  public void write_have(int index) {
    libtorrent_jni.bt_peer_connection_write_have(swigCPtr, this, index);
  }

  public void write_dont_have(int index) {
    libtorrent_jni.bt_peer_connection_write_dont_have(swigCPtr, this, index);
  }

  public void write_keepalive() {
    libtorrent_jni.bt_peer_connection_write_keepalive(swigCPtr, this);
  }

  public void write_handshake(boolean plain_handshake) {
    libtorrent_jni.bt_peer_connection_write_handshake__SWIG_0(swigCPtr, this, plain_handshake);
  }

  public void write_handshake() {
    libtorrent_jni.bt_peer_connection_write_handshake__SWIG_1(swigCPtr, this);
  }

  public void write_extensions() {
    libtorrent_jni.bt_peer_connection_write_extensions(swigCPtr, this);
  }

  public void write_upload_only() {
    libtorrent_jni.bt_peer_connection_write_upload_only(swigCPtr, this);
  }

  public void write_share_mode() {
    libtorrent_jni.bt_peer_connection_write_share_mode(swigCPtr, this);
  }

  public void write_holepunch_msg(int type, tcp_endpoint ep, int error) {
    libtorrent_jni.bt_peer_connection_write_holepunch_msg(swigCPtr, this, type, tcp_endpoint.getCPtr(ep), ep, error);
  }

  public void write_dht_port(int listen_port) {
    libtorrent_jni.bt_peer_connection_write_dht_port(swigCPtr, this, listen_port);
  }

  public void write_have_all() {
    libtorrent_jni.bt_peer_connection_write_have_all(swigCPtr, this);
  }

  public void write_have_none() {
    libtorrent_jni.bt_peer_connection_write_have_none(swigCPtr, this);
  }

  public void write_reject_request(peer_request arg0) {
    libtorrent_jni.bt_peer_connection_write_reject_request(swigCPtr, this, peer_request.getCPtr(arg0), arg0);
  }

  public void write_allow_fast(int piece) {
    libtorrent_jni.bt_peer_connection_write_allow_fast(swigCPtr, this, piece);
  }

  public void write_suggest(int piece) {
    libtorrent_jni.bt_peer_connection_write_suggest(swigCPtr, this, piece);
  }

  public void on_connected() {
    libtorrent_jni.bt_peer_connection_on_connected(swigCPtr, this);
  }

  public void on_metadata() {
    libtorrent_jni.bt_peer_connection_on_metadata(swigCPtr, this);
  }

  public final static int upload_only_msg = libtorrent_jni.bt_peer_connection_upload_only_msg_get();
  public final static int holepunch_msg = libtorrent_jni.bt_peer_connection_holepunch_msg_get();
  public final static int dont_have_msg = libtorrent_jni.bt_peer_connection_dont_have_msg_get();
  public final static int share_mode_msg = libtorrent_jni.bt_peer_connection_share_mode_msg_get();

  public enum message_type {
    msg_choke(libtorrent_jni.bt_peer_connection_msg_choke_get()),
    msg_unchoke,
    msg_interested,
    msg_not_interested,
    msg_have,
    msg_bitfield,
    msg_request,
    msg_piece,
    msg_cancel,
    msg_dht_port,
    msg_suggest_piece(libtorrent_jni.bt_peer_connection_msg_suggest_piece_get()),
    msg_have_all,
    msg_have_none,
    msg_reject_request,
    msg_allowed_fast,
    msg_extended(libtorrent_jni.bt_peer_connection_msg_extended_get()),
    num_supported_messages;

    public final int swigValue() {
      return swigValue;
    }

    public static message_type swigToEnum(int swigValue) {
      message_type[] swigValues = message_type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (message_type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + message_type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private message_type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private message_type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private message_type(message_type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum hp_message_t {
    hp_rendezvous(libtorrent_jni.bt_peer_connection_hp_rendezvous_get()),
    hp_connect(libtorrent_jni.bt_peer_connection_hp_connect_get()),
    hp_failed(libtorrent_jni.bt_peer_connection_hp_failed_get()),
    hp_no_such_peer(libtorrent_jni.bt_peer_connection_hp_no_such_peer_get()),
    hp_not_connected(libtorrent_jni.bt_peer_connection_hp_not_connected_get()),
    hp_no_support(libtorrent_jni.bt_peer_connection_hp_no_support_get()),
    hp_no_self(libtorrent_jni.bt_peer_connection_hp_no_self_get());

    public final int swigValue() {
      return swigValue;
    }

    public static hp_message_t swigToEnum(int swigValue) {
      hp_message_t[] swigValues = hp_message_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (hp_message_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + hp_message_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private hp_message_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private hp_message_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private hp_message_t(hp_message_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}