/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkPem {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkPem(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkPem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkPem(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkPem() {
    this(chilkatJNI.new_CkPem(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkPem_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkPem_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkPem_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkBaseProgress progress) {
    chilkatJNI.CkPem_put_EventCallbackObject(swigCPtr, this, CkBaseProgress.getCPtr(progress), progress);
  }

  public boolean get_AppendMode() {
    return chilkatJNI.CkPem_get_AppendMode(swigCPtr, this);
  }

  public void put_AppendMode(boolean newVal) {
    chilkatJNI.CkPem_put_AppendMode(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkPem_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkPem_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkPem_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkPem_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkPem_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkPem_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkPem_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkPem_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkPem_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkPem_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkPem_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkPem_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkPem_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_NumCerts() {
    return chilkatJNI.CkPem_get_NumCerts(swigCPtr, this);
  }

  public int get_NumCrls() {
    return chilkatJNI.CkPem_get_NumCrls(swigCPtr, this);
  }

  public int get_NumCsrs() {
    return chilkatJNI.CkPem_get_NumCsrs(swigCPtr, this);
  }

  public int get_NumPrivateKeys() {
    return chilkatJNI.CkPem_get_NumPrivateKeys(swigCPtr, this);
  }

  public int get_NumPublicKeys() {
    return chilkatJNI.CkPem_get_NumPublicKeys(swigCPtr, this);
  }

  public void get_PrivateKeyFormat(CkString str) {
    chilkatJNI.CkPem_get_PrivateKeyFormat(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String privateKeyFormat() {
    return chilkatJNI.CkPem_privateKeyFormat(swigCPtr, this);
  }

  public void put_PrivateKeyFormat(String newVal) {
    chilkatJNI.CkPem_put_PrivateKeyFormat(swigCPtr, this, newVal);
  }

  public void get_PublicKeyFormat(CkString str) {
    chilkatJNI.CkPem_get_PublicKeyFormat(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String publicKeyFormat() {
    return chilkatJNI.CkPem_publicKeyFormat(swigCPtr, this);
  }

  public void put_PublicKeyFormat(String newVal) {
    chilkatJNI.CkPem_put_PublicKeyFormat(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkPem_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkPem_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkPem_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkPem_version(swigCPtr, this);
  }

  public boolean AddCert(CkCert cert, boolean includeChain) {
    return chilkatJNI.CkPem_AddCert(swigCPtr, this, CkCert.getCPtr(cert), cert, includeChain);
  }

  public boolean AddItem(String itemType, String encoding, String itemData) {
    return chilkatJNI.CkPem_AddItem(swigCPtr, this, itemType, encoding, itemData);
  }

  public boolean AddPrivateKey(CkPrivateKey privateKey) {
    return chilkatJNI.CkPem_AddPrivateKey(swigCPtr, this, CkPrivateKey.getCPtr(privateKey), privateKey);
  }

  public boolean AddPrivateKey2(CkPrivateKey privKey, CkCertChain certChain) {
    return chilkatJNI.CkPem_AddPrivateKey2(swigCPtr, this, CkPrivateKey.getCPtr(privKey), privKey, CkCertChain.getCPtr(certChain), certChain);
  }

  public boolean AddPublicKey(CkPublicKey pubkey) {
    return chilkatJNI.CkPem_AddPublicKey(swigCPtr, this, CkPublicKey.getCPtr(pubkey), pubkey);
  }

  public boolean Clear() {
    return chilkatJNI.CkPem_Clear(swigCPtr, this);
  }

  public CkCert GetCert(int index) {
    long cPtr = chilkatJNI.CkPem_GetCert(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public boolean GetEncodedItem(String itemType, String itemSubType, String encoding, int index, CkString outStr) {
    return chilkatJNI.CkPem_GetEncodedItem(swigCPtr, this, itemType, itemSubType, encoding, index, CkString.getCPtr(outStr), outStr);
  }

  public String getEncodedItem(String itemType, String itemSubType, String encoding, int index) {
    return chilkatJNI.CkPem_getEncodedItem(swigCPtr, this, itemType, itemSubType, encoding, index);
  }

  public String encodedItem(String itemType, String itemSubType, String encoding, int index) {
    return chilkatJNI.CkPem_encodedItem(swigCPtr, this, itemType, itemSubType, encoding, index);
  }

  public CkPrivateKey GetPrivateKey(int index) {
    long cPtr = chilkatJNI.CkPem_GetPrivateKey(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkPrivateKey(cPtr, true);
  }

  public CkPublicKey GetPublicKey(int index) {
    long cPtr = chilkatJNI.CkPem_GetPublicKey(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkPublicKey(cPtr, true);
  }

  public boolean LoadP7b(CkByteData p7bData) {
    return chilkatJNI.CkPem_LoadP7b(swigCPtr, this, CkByteData.getCPtr(p7bData), p7bData);
  }

  public CkTask LoadP7bAsync(CkByteData p7bData) {
    long cPtr = chilkatJNI.CkPem_LoadP7bAsync(swigCPtr, this, CkByteData.getCPtr(p7bData), p7bData);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean LoadP7bFile(String path) {
    return chilkatJNI.CkPem_LoadP7bFile(swigCPtr, this, path);
  }

  public CkTask LoadP7bFileAsync(String path) {
    long cPtr = chilkatJNI.CkPem_LoadP7bFileAsync(swigCPtr, this, path);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean LoadPem(String pemContent, String password) {
    return chilkatJNI.CkPem_LoadPem(swigCPtr, this, pemContent, password);
  }

  public CkTask LoadPemAsync(String pemContent, String password) {
    long cPtr = chilkatJNI.CkPem_LoadPemAsync(swigCPtr, this, pemContent, password);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean LoadPemFile(String path, String password) {
    return chilkatJNI.CkPem_LoadPemFile(swigCPtr, this, path, password);
  }

  public CkTask LoadPemFileAsync(String path, String password) {
    long cPtr = chilkatJNI.CkPem_LoadPemFileAsync(swigCPtr, this, path, password);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean LoadTaskCaller(CkTask task) {
    return chilkatJNI.CkPem_LoadTaskCaller(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public boolean RemoveCert(int index) {
    return chilkatJNI.CkPem_RemoveCert(swigCPtr, this, index);
  }

  public boolean RemovePrivateKey(int index) {
    return chilkatJNI.CkPem_RemovePrivateKey(swigCPtr, this, index);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkPem_SaveLastError(swigCPtr, this, path);
  }

  public CkJavaKeyStore ToJks(String alias, String password) {
    long cPtr = chilkatJNI.CkPem_ToJks(swigCPtr, this, alias, password);
    return (cPtr == 0) ? null : new CkJavaKeyStore(cPtr, true);
  }

  public boolean ToPem(CkString outStr) {
    return chilkatJNI.CkPem_ToPem(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toPem() {
    return chilkatJNI.CkPem_toPem(swigCPtr, this);
  }

  public boolean ToPemEx(boolean extendedAttrs, boolean noKeys, boolean noCerts, boolean noCaCerts, String encryptAlg, String password, CkString outStr) {
    return chilkatJNI.CkPem_ToPemEx(swigCPtr, this, extendedAttrs, noKeys, noCerts, noCaCerts, encryptAlg, password, CkString.getCPtr(outStr), outStr);
  }

  public String toPemEx(boolean extendedAttrs, boolean noKeys, boolean noCerts, boolean noCaCerts, String encryptAlg, String password) {
    return chilkatJNI.CkPem_toPemEx(swigCPtr, this, extendedAttrs, noKeys, noCerts, noCaCerts, encryptAlg, password);
  }

  public CkPfx ToPfx() {
    long cPtr = chilkatJNI.CkPem_ToPfx(swigCPtr, this);
    return (cPtr == 0) ? null : new CkPfx(cPtr, true);
  }

}
