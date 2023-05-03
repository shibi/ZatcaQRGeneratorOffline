/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkZip {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkZip(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkZip obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkZip(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkZip() {
    this(chilkatJNI.new_CkZip(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkZip_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkZip_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkZip_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkZipProgress progress) {
    chilkatJNI.CkZip_put_EventCallbackObject(swigCPtr, this, CkZipProgress.getCPtr(progress), progress);
  }

  public boolean get_AbortCurrent() {
    return chilkatJNI.CkZip_get_AbortCurrent(swigCPtr, this);
  }

  public void put_AbortCurrent(boolean newVal) {
    chilkatJNI.CkZip_put_AbortCurrent(swigCPtr, this, newVal);
  }

  public void get_AppendFromDir(CkString str) {
    chilkatJNI.CkZip_get_AppendFromDir(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String appendFromDir() {
    return chilkatJNI.CkZip_appendFromDir(swigCPtr, this);
  }

  public void put_AppendFromDir(String newVal) {
    chilkatJNI.CkZip_put_AppendFromDir(swigCPtr, this, newVal);
  }

  public boolean get_CaseSensitive() {
    return chilkatJNI.CkZip_get_CaseSensitive(swigCPtr, this);
  }

  public void put_CaseSensitive(boolean newVal) {
    chilkatJNI.CkZip_put_CaseSensitive(swigCPtr, this, newVal);
  }

  public boolean get_ClearArchiveAttribute() {
    return chilkatJNI.CkZip_get_ClearArchiveAttribute(swigCPtr, this);
  }

  public void put_ClearArchiveAttribute(boolean newVal) {
    chilkatJNI.CkZip_put_ClearArchiveAttribute(swigCPtr, this, newVal);
  }

  public boolean get_ClearReadOnlyAttr() {
    return chilkatJNI.CkZip_get_ClearReadOnlyAttr(swigCPtr, this);
  }

  public void put_ClearReadOnlyAttr(boolean newVal) {
    chilkatJNI.CkZip_put_ClearReadOnlyAttr(swigCPtr, this, newVal);
  }

  public void get_Comment(CkString str) {
    chilkatJNI.CkZip_get_Comment(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String comment() {
    return chilkatJNI.CkZip_comment(swigCPtr, this);
  }

  public void put_Comment(String newVal) {
    chilkatJNI.CkZip_put_Comment(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkZip_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkZip_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkZip_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_DecryptPassword(CkString str) {
    chilkatJNI.CkZip_get_DecryptPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String decryptPassword() {
    return chilkatJNI.CkZip_decryptPassword(swigCPtr, this);
  }

  public void put_DecryptPassword(String newVal) {
    chilkatJNI.CkZip_put_DecryptPassword(swigCPtr, this, newVal);
  }

  public boolean get_DiscardPaths() {
    return chilkatJNI.CkZip_get_DiscardPaths(swigCPtr, this);
  }

  public void put_DiscardPaths(boolean newVal) {
    chilkatJNI.CkZip_put_DiscardPaths(swigCPtr, this, newVal);
  }

  public int get_Encryption() {
    return chilkatJNI.CkZip_get_Encryption(swigCPtr, this);
  }

  public void put_Encryption(int newVal) {
    chilkatJNI.CkZip_put_Encryption(swigCPtr, this, newVal);
  }

  public int get_EncryptKeyLength() {
    return chilkatJNI.CkZip_get_EncryptKeyLength(swigCPtr, this);
  }

  public void put_EncryptKeyLength(int newVal) {
    chilkatJNI.CkZip_put_EncryptKeyLength(swigCPtr, this, newVal);
  }

  public void get_EncryptPassword(CkString str) {
    chilkatJNI.CkZip_get_EncryptPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String encryptPassword() {
    return chilkatJNI.CkZip_encryptPassword(swigCPtr, this);
  }

  public void put_EncryptPassword(String newVal) {
    chilkatJNI.CkZip_put_EncryptPassword(swigCPtr, this, newVal);
  }

  public int get_FileCount() {
    return chilkatJNI.CkZip_get_FileCount(swigCPtr, this);
  }

  public void get_FileName(CkString str) {
    chilkatJNI.CkZip_get_FileName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String fileName() {
    return chilkatJNI.CkZip_fileName(swigCPtr, this);
  }

  public void put_FileName(String newVal) {
    chilkatJNI.CkZip_put_FileName(swigCPtr, this, newVal);
  }

  public boolean get_HasZipFormatErrors() {
    return chilkatJNI.CkZip_get_HasZipFormatErrors(swigCPtr, this);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkZip_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkZip_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public boolean get_IgnoreAccessDenied() {
    return chilkatJNI.CkZip_get_IgnoreAccessDenied(swigCPtr, this);
  }

  public void put_IgnoreAccessDenied(boolean newVal) {
    chilkatJNI.CkZip_put_IgnoreAccessDenied(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkZip_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkZip_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkZip_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkZip_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkZip_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkZip_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkZip_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkZip_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_NumEntries() {
    return chilkatJNI.CkZip_get_NumEntries(swigCPtr, this);
  }

  public int get_OemCodePage() {
    return chilkatJNI.CkZip_get_OemCodePage(swigCPtr, this);
  }

  public void put_OemCodePage(int newVal) {
    chilkatJNI.CkZip_put_OemCodePage(swigCPtr, this, newVal);
  }

  public boolean get_OverwriteExisting() {
    return chilkatJNI.CkZip_get_OverwriteExisting(swigCPtr, this);
  }

  public void put_OverwriteExisting(boolean newVal) {
    chilkatJNI.CkZip_put_OverwriteExisting(swigCPtr, this, newVal);
  }

  public boolean get_PasswordProtect() {
    return chilkatJNI.CkZip_get_PasswordProtect(swigCPtr, this);
  }

  public void put_PasswordProtect(boolean newVal) {
    chilkatJNI.CkZip_put_PasswordProtect(swigCPtr, this, newVal);
  }

  public void get_PathPrefix(CkString str) {
    chilkatJNI.CkZip_get_PathPrefix(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String pathPrefix() {
    return chilkatJNI.CkZip_pathPrefix(swigCPtr, this);
  }

  public void put_PathPrefix(String newVal) {
    chilkatJNI.CkZip_put_PathPrefix(swigCPtr, this, newVal);
  }

  public int get_PercentDoneScale() {
    return chilkatJNI.CkZip_get_PercentDoneScale(swigCPtr, this);
  }

  public void put_PercentDoneScale(int newVal) {
    chilkatJNI.CkZip_put_PercentDoneScale(swigCPtr, this, newVal);
  }

  public void get_PwdProtCharset(CkString str) {
    chilkatJNI.CkZip_get_PwdProtCharset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String pwdProtCharset() {
    return chilkatJNI.CkZip_pwdProtCharset(swigCPtr, this);
  }

  public void put_PwdProtCharset(String newVal) {
    chilkatJNI.CkZip_put_PwdProtCharset(swigCPtr, this, newVal);
  }

  public void get_TempDir(CkString str) {
    chilkatJNI.CkZip_get_TempDir(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String tempDir() {
    return chilkatJNI.CkZip_tempDir(swigCPtr, this);
  }

  public void put_TempDir(String newVal) {
    chilkatJNI.CkZip_put_TempDir(swigCPtr, this, newVal);
  }

  public boolean get_TextFlag() {
    return chilkatJNI.CkZip_get_TextFlag(swigCPtr, this);
  }

  public void put_TextFlag(boolean newVal) {
    chilkatJNI.CkZip_put_TextFlag(swigCPtr, this, newVal);
  }

  public void get_UncommonOptions(CkString str) {
    chilkatJNI.CkZip_get_UncommonOptions(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String uncommonOptions() {
    return chilkatJNI.CkZip_uncommonOptions(swigCPtr, this);
  }

  public void put_UncommonOptions(String newVal) {
    chilkatJNI.CkZip_put_UncommonOptions(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkZip_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkZip_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkZip_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkZip_version(swigCPtr, this);
  }

  public boolean get_Zipx() {
    return chilkatJNI.CkZip_get_Zipx(swigCPtr, this);
  }

  public void put_Zipx(boolean newVal) {
    chilkatJNI.CkZip_put_Zipx(swigCPtr, this, newVal);
  }

  public void get_ZipxDefaultAlg(CkString str) {
    chilkatJNI.CkZip_get_ZipxDefaultAlg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String zipxDefaultAlg() {
    return chilkatJNI.CkZip_zipxDefaultAlg(swigCPtr, this);
  }

  public void put_ZipxDefaultAlg(String newVal) {
    chilkatJNI.CkZip_put_ZipxDefaultAlg(swigCPtr, this, newVal);
  }

  public void AddNoCompressExtension(String fileExtension) {
    chilkatJNI.CkZip_AddNoCompressExtension(swigCPtr, this, fileExtension);
  }

  public CkZipEntry AppendBase64(String fileName, String encodedCompressedData) {
    long cPtr = chilkatJNI.CkZip_AppendBase64(swigCPtr, this, fileName, encodedCompressedData);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public CkZipEntry AppendBd(String pathInZip, CkBinData byteData) {
    long cPtr = chilkatJNI.CkZip_AppendBd(swigCPtr, this, pathInZip, CkBinData.getCPtr(byteData), byteData);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public CkZipEntry AppendCompressed(String filename, CkByteData inData) {
    long cPtr = chilkatJNI.CkZip_AppendCompressed(swigCPtr, this, filename, CkByteData.getCPtr(inData), inData);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public CkZipEntry AppendData(String fileName, CkByteData inData) {
    long cPtr = chilkatJNI.CkZip_AppendData(swigCPtr, this, fileName, CkByteData.getCPtr(inData), inData);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public CkZipEntry AppendDataEncoded(String filename, String encoding, String data) {
    long cPtr = chilkatJNI.CkZip_AppendDataEncoded(swigCPtr, this, filename, encoding, data);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public boolean AppendFiles(String filePattern, boolean recurse) {
    return chilkatJNI.CkZip_AppendFiles(swigCPtr, this, filePattern, recurse);
  }

  public CkTask AppendFilesAsync(String filePattern, boolean recurse) {
    long cPtr = chilkatJNI.CkZip_AppendFilesAsync(swigCPtr, this, filePattern, recurse);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean AppendFilesEx(String filePattern, boolean recurse, boolean saveExtraPath, boolean archiveOnly, boolean includeHidden, boolean includeSystem) {
    return chilkatJNI.CkZip_AppendFilesEx(swigCPtr, this, filePattern, recurse, saveExtraPath, archiveOnly, includeHidden, includeSystem);
  }

  public CkTask AppendFilesExAsync(String filePattern, boolean recurse, boolean saveExtraPath, boolean archiveOnly, boolean includeHidden, boolean includeSystem) {
    long cPtr = chilkatJNI.CkZip_AppendFilesExAsync(swigCPtr, this, filePattern, recurse, saveExtraPath, archiveOnly, includeHidden, includeSystem);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public CkZipEntry AppendHex(String fileName, String encodedCompressedData) {
    long cPtr = chilkatJNI.CkZip_AppendHex(swigCPtr, this, fileName, encodedCompressedData);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public boolean AppendMultiple(CkStringArray fileSpecs, boolean recurse) {
    return chilkatJNI.CkZip_AppendMultiple(swigCPtr, this, CkStringArray.getCPtr(fileSpecs), fileSpecs, recurse);
  }

  public CkTask AppendMultipleAsync(CkStringArray fileSpecs, boolean recurse) {
    long cPtr = chilkatJNI.CkZip_AppendMultipleAsync(swigCPtr, this, CkStringArray.getCPtr(fileSpecs), fileSpecs, recurse);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public CkZipEntry AppendNew(String fileName) {
    long cPtr = chilkatJNI.CkZip_AppendNew(swigCPtr, this, fileName);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public CkZipEntry AppendNewDir(String dirName) {
    long cPtr = chilkatJNI.CkZip_AppendNewDir(swigCPtr, this, dirName);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public boolean AppendOneFileOrDir(String fileOrDirPath, boolean saveExtraPath) {
    return chilkatJNI.CkZip_AppendOneFileOrDir(swigCPtr, this, fileOrDirPath, saveExtraPath);
  }

  public CkTask AppendOneFileOrDirAsync(String fileOrDirPath, boolean saveExtraPath) {
    long cPtr = chilkatJNI.CkZip_AppendOneFileOrDirAsync(swigCPtr, this, fileOrDirPath, saveExtraPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public CkZipEntry AppendString(String internalZipFilepath, String textData) {
    long cPtr = chilkatJNI.CkZip_AppendString(swigCPtr, this, internalZipFilepath, textData);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public CkZipEntry AppendString2(String internalZipFilepath, String textData, String charset) {
    long cPtr = chilkatJNI.CkZip_AppendString2(swigCPtr, this, internalZipFilepath, textData, charset);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public boolean AppendZip(String zipFileName) {
    return chilkatJNI.CkZip_AppendZip(swigCPtr, this, zipFileName);
  }

  public void CloseZip() {
    chilkatJNI.CkZip_CloseZip(swigCPtr, this);
  }

  public boolean DeleteEntry(CkZipEntry entry) {
    return chilkatJNI.CkZip_DeleteEntry(swigCPtr, this, CkZipEntry.getCPtr(entry), entry);
  }

  public void ExcludeDir(String dirName) {
    chilkatJNI.CkZip_ExcludeDir(swigCPtr, this, dirName);
  }

  public boolean Extract(String dirPath) {
    return chilkatJNI.CkZip_Extract(swigCPtr, this, dirPath);
  }

  public CkTask ExtractAsync(String dirPath) {
    long cPtr = chilkatJNI.CkZip_ExtractAsync(swigCPtr, this, dirPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean ExtractInto(String dirPath) {
    return chilkatJNI.CkZip_ExtractInto(swigCPtr, this, dirPath);
  }

  public boolean ExtractMatching(String dirPath, String pattern) {
    return chilkatJNI.CkZip_ExtractMatching(swigCPtr, this, dirPath, pattern);
  }

  public boolean ExtractNewer(String dirPath) {
    return chilkatJNI.CkZip_ExtractNewer(swigCPtr, this, dirPath);
  }

  public boolean ExtractOne(CkZipEntry entry, String dirPath) {
    return chilkatJNI.CkZip_ExtractOne(swigCPtr, this, CkZipEntry.getCPtr(entry), entry, dirPath);
  }

  public CkZipEntry FirstEntry() {
    long cPtr = chilkatJNI.CkZip_FirstEntry(swigCPtr, this);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public CkZipEntry FirstMatchingEntry(String pattern) {
    long cPtr = chilkatJNI.CkZip_FirstMatchingEntry(swigCPtr, this, pattern);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public boolean GetDirectoryAsXML(CkString outXml) {
    return chilkatJNI.CkZip_GetDirectoryAsXML(swigCPtr, this, CkString.getCPtr(outXml), outXml);
  }

  public String getDirectoryAsXML() {
    return chilkatJNI.CkZip_getDirectoryAsXML(swigCPtr, this);
  }

  public String directoryAsXML() {
    return chilkatJNI.CkZip_directoryAsXML(swigCPtr, this);
  }

  public CkZipEntry GetEntryByID(int entryID) {
    long cPtr = chilkatJNI.CkZip_GetEntryByID(swigCPtr, this, entryID);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public CkZipEntry GetEntryByIndex(int index) {
    long cPtr = chilkatJNI.CkZip_GetEntryByIndex(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public CkZipEntry GetEntryByName(String entryName) {
    long cPtr = chilkatJNI.CkZip_GetEntryByName(swigCPtr, this, entryName);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public CkStringArray GetExclusions() {
    long cPtr = chilkatJNI.CkZip_GetExclusions(swigCPtr, this);
    return (cPtr == 0) ? null : new CkStringArray(cPtr, true);
  }

  public CkZipEntry InsertNew(String fileName, int beforeIndex) {
    long cPtr = chilkatJNI.CkZip_InsertNew(swigCPtr, this, fileName, beforeIndex);
    return (cPtr == 0) ? null : new CkZipEntry(cPtr, true);
  }

  public boolean IsNoCompressExtension(String fileExtension) {
    return chilkatJNI.CkZip_IsNoCompressExtension(swigCPtr, this, fileExtension);
  }

  public boolean IsPasswordProtected(String zipFilename) {
    return chilkatJNI.CkZip_IsPasswordProtected(swigCPtr, this, zipFilename);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkZip_IsUnlocked(swigCPtr, this);
  }

  public boolean LoadTaskCaller(CkTask task) {
    return chilkatJNI.CkZip_LoadTaskCaller(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public boolean NewZip(String zipFilePath) {
    return chilkatJNI.CkZip_NewZip(swigCPtr, this, zipFilePath);
  }

  public boolean OpenBd(CkBinData binData) {
    return chilkatJNI.CkZip_OpenBd(swigCPtr, this, CkBinData.getCPtr(binData), binData);
  }

  public boolean OpenFromByteData(CkByteData byteData) {
    return chilkatJNI.CkZip_OpenFromByteData(swigCPtr, this, CkByteData.getCPtr(byteData), byteData);
  }

  public boolean OpenFromMemory(CkByteData inData) {
    return chilkatJNI.CkZip_OpenFromMemory(swigCPtr, this, CkByteData.getCPtr(inData), inData);
  }

  public boolean OpenZip(String zipPath) {
    return chilkatJNI.CkZip_OpenZip(swigCPtr, this, zipPath);
  }

  public CkTask OpenZipAsync(String zipPath) {
    long cPtr = chilkatJNI.CkZip_OpenZipAsync(swigCPtr, this, zipPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean QuickAppend(String ZipFileName) {
    return chilkatJNI.CkZip_QuickAppend(swigCPtr, this, ZipFileName);
  }

  public CkTask QuickAppendAsync(String ZipFileName) {
    long cPtr = chilkatJNI.CkZip_QuickAppendAsync(swigCPtr, this, ZipFileName);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public void RemoveNoCompressExtension(String fileExtension) {
    chilkatJNI.CkZip_RemoveNoCompressExtension(swigCPtr, this, fileExtension);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkZip_SaveLastError(swigCPtr, this, path);
  }

  public void SetCompressionLevel(int level) {
    chilkatJNI.CkZip_SetCompressionLevel(swigCPtr, this, level);
  }

  public void SetExclusions(CkStringArray excludePatterns) {
    chilkatJNI.CkZip_SetExclusions(swigCPtr, this, CkStringArray.getCPtr(excludePatterns), excludePatterns);
  }

  public void SetPassword(String password) {
    chilkatJNI.CkZip_SetPassword(swigCPtr, this, password);
  }

  public boolean UnlockComponent(String regCode) {
    return chilkatJNI.CkZip_UnlockComponent(swigCPtr, this, regCode);
  }

  public int Unzip(String dirPath) {
    return chilkatJNI.CkZip_Unzip(swigCPtr, this, dirPath);
  }

  public CkTask UnzipAsync(String dirPath) {
    long cPtr = chilkatJNI.CkZip_UnzipAsync(swigCPtr, this, dirPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public int UnzipInto(String dirPath) {
    return chilkatJNI.CkZip_UnzipInto(swigCPtr, this, dirPath);
  }

  public CkTask UnzipIntoAsync(String dirPath) {
    long cPtr = chilkatJNI.CkZip_UnzipIntoAsync(swigCPtr, this, dirPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public int UnzipMatching(String dirPath, String pattern, boolean verbose) {
    return chilkatJNI.CkZip_UnzipMatching(swigCPtr, this, dirPath, pattern, verbose);
  }

  public CkTask UnzipMatchingAsync(String dirPath, String pattern, boolean verbose) {
    long cPtr = chilkatJNI.CkZip_UnzipMatchingAsync(swigCPtr, this, dirPath, pattern, verbose);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public int UnzipMatchingInto(String dirPath, String pattern, boolean verbose) {
    return chilkatJNI.CkZip_UnzipMatchingInto(swigCPtr, this, dirPath, pattern, verbose);
  }

  public CkTask UnzipMatchingIntoAsync(String dirPath, String pattern, boolean verbose) {
    long cPtr = chilkatJNI.CkZip_UnzipMatchingIntoAsync(swigCPtr, this, dirPath, pattern, verbose);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public int UnzipNewer(String dirPath) {
    return chilkatJNI.CkZip_UnzipNewer(swigCPtr, this, dirPath);
  }

  public CkTask UnzipNewerAsync(String dirPath) {
    long cPtr = chilkatJNI.CkZip_UnzipNewerAsync(swigCPtr, this, dirPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean VerifyPassword() {
    return chilkatJNI.CkZip_VerifyPassword(swigCPtr, this);
  }

  public boolean WriteBd(CkBinData binData) {
    return chilkatJNI.CkZip_WriteBd(swigCPtr, this, CkBinData.getCPtr(binData), binData);
  }

  public CkTask WriteBdAsync(CkBinData binData) {
    long cPtr = chilkatJNI.CkZip_WriteBdAsync(swigCPtr, this, CkBinData.getCPtr(binData), binData);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteToMemory(CkByteData outData) {
    return chilkatJNI.CkZip_WriteToMemory(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

  public CkTask WriteToMemoryAsync() {
    long cPtr = chilkatJNI.CkZip_WriteToMemoryAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteZip() {
    return chilkatJNI.CkZip_WriteZip(swigCPtr, this);
  }

  public CkTask WriteZipAsync() {
    long cPtr = chilkatJNI.CkZip_WriteZipAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteZipAndClose() {
    return chilkatJNI.CkZip_WriteZipAndClose(swigCPtr, this);
  }

  public CkTask WriteZipAndCloseAsync() {
    long cPtr = chilkatJNI.CkZip_WriteZipAndCloseAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

}
