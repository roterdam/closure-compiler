// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.javascript.jscomp;

public  final class Instrumentation extends
    com.google.protobuf.GeneratedMessage {
  // Use Instrumentation.newBuilder() to construct.
  private Instrumentation(Builder builder) {
    super(builder);
  }
  private Instrumentation(boolean noInit) {}
  
  private static final Instrumentation defaultInstance;
  public static Instrumentation getDefaultInstance() {
    return defaultInstance;
  }
  
  public Instrumentation getDefaultInstanceForType() {
    return defaultInstance;
  }
  
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.javascript.jscomp.InstrumentationTemplate.internal_static_jscomp_Instrumentation_descriptor;
  }
  
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.javascript.jscomp.InstrumentationTemplate.internal_static_jscomp_Instrumentation_fieldAccessorTable;
  }
  
  // optional string report_defined = 1;
  public static final int REPORT_DEFINED_FIELD_NUMBER = 1;
  private boolean hasReportDefined;
  private java.lang.String reportDefined_;
  public boolean hasReportDefined() {
    return hasReportDefined;
  }
  public java.lang.String getReportDefined() {
    return reportDefined_;
  }
  
  // optional string report_call = 2;
  public static final int REPORT_CALL_FIELD_NUMBER = 2;
  private boolean hasReportCall;
  private java.lang.String reportCall_;
  public boolean hasReportCall() {
    return hasReportCall;
  }
  public java.lang.String getReportCall() {
    return reportCall_;
  }
  
  // optional string report_exit = 6;
  public static final int REPORT_EXIT_FIELD_NUMBER = 6;
  private boolean hasReportExit;
  private java.lang.String reportExit_;
  public boolean hasReportExit() {
    return hasReportExit;
  }
  public java.lang.String getReportExit() {
    return reportExit_;
  }
  
  // repeated string declaration_to_remove = 3;
  public static final int DECLARATION_TO_REMOVE_FIELD_NUMBER = 3;
  private java.util.List<java.lang.String> declarationToRemove_;
  public java.util.List<java.lang.String>
      getDeclarationToRemoveList() {
    return declarationToRemove_;
  }
  public int getDeclarationToRemoveCount() {
    return declarationToRemove_.size();
  }
  public java.lang.String getDeclarationToRemove(int index) {
    return declarationToRemove_.get(index);
  }
  
  // repeated string init = 4;
  public static final int INIT_FIELD_NUMBER = 4;
  private java.util.List<java.lang.String> init_;
  public java.util.List<java.lang.String>
      getInitList() {
    return init_;
  }
  public int getInitCount() {
    return init_.size();
  }
  public java.lang.String getInit(int index) {
    return init_.get(index);
  }
  
  // optional string app_name_setter = 5;
  public static final int APP_NAME_SETTER_FIELD_NUMBER = 5;
  private boolean hasAppNameSetter;
  private java.lang.String appNameSetter_;
  public boolean hasAppNameSetter() {
    return hasAppNameSetter;
  }
  public java.lang.String getAppNameSetter() {
    return appNameSetter_;
  }
  
  private void initFields() {
    reportDefined_ = "";
    reportCall_ = "";
    reportExit_ = "";
    declarationToRemove_ = java.util.Collections.emptyList();
    init_ = java.util.Collections.emptyList();
    appNameSetter_ = "";
  }
  public final boolean isInitialized() {
    return true;
  }
  
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (hasReportDefined()) {
      output.writeString(1, getReportDefined());
    }
    if (hasReportCall()) {
      output.writeString(2, getReportCall());
    }
    for (java.lang.String element : getDeclarationToRemoveList()) {
      output.writeString(3, element);
    }
    for (java.lang.String element : getInitList()) {
      output.writeString(4, element);
    }
    if (hasAppNameSetter()) {
      output.writeString(5, getAppNameSetter());
    }
    if (hasReportExit()) {
      output.writeString(6, getReportExit());
    }
    getUnknownFields().writeTo(output);
  }
  
  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;
  
    size = 0;
    if (hasReportDefined()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getReportDefined());
    }
    if (hasReportCall()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getReportCall());
    }
    {
      int dataSize = 0;
      for (java.lang.String element : getDeclarationToRemoveList()) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(element);
      }
      size += dataSize;
      size += 1 * getDeclarationToRemoveList().size();
    }
    {
      int dataSize = 0;
      for (java.lang.String element : getInitList()) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(element);
      }
      size += dataSize;
      size += 1 * getInitList().size();
    }
    if (hasAppNameSetter()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(5, getAppNameSetter());
    }
    if (hasReportExit()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(6, getReportExit());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }
  
  @java.lang.Override
  protected Object writeReplace() throws java.io.ObjectStreamException {
    return super.writeReplace();
  }
  
  public static com.google.javascript.jscomp.Instrumentation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static com.google.javascript.jscomp.Instrumentation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static com.google.javascript.jscomp.Instrumentation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static com.google.javascript.jscomp.Instrumentation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static com.google.javascript.jscomp.Instrumentation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static com.google.javascript.jscomp.Instrumentation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  public static com.google.javascript.jscomp.Instrumentation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    Builder builder = newBuilder();
    if (builder.mergeDelimitedFrom(input)) {
      return builder.buildParsed();
    } else {
      return null;
    }
  }
  public static com.google.javascript.jscomp.Instrumentation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    Builder builder = newBuilder();
    if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
      return builder.buildParsed();
    } else {
      return null;
    }
  }
  public static com.google.javascript.jscomp.Instrumentation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static com.google.javascript.jscomp.Instrumentation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  
  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.javascript.jscomp.Instrumentation prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }
  
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.javascript.jscomp.InstrumentationTemplate.internal_static_jscomp_Instrumentation_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.javascript.jscomp.InstrumentationTemplate.internal_static_jscomp_Instrumentation_fieldAccessorTable;
    }
    
    // Construct using com.google.javascript.jscomp.Instrumentation.newBuilder()
    private Builder() {
    }
    
    private static Builder create() {
      return new Builder();
    }
    
    public Builder clear() {
      super.clear();
      reportDefined_ = "";
      hasReportDefined = false;
      reportCall_ = "";
      hasReportCall = false;
      reportExit_ = "";
      hasReportExit = false;
      declarationToRemove_ = java.util.Collections.emptyList();
      isDeclarationToRemoveMutable = false;
      init_ = java.util.Collections.emptyList();
      isInitMutable = false;
      appNameSetter_ = "";
      hasAppNameSetter = false;
      return this;
    }
    
    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }
    
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.javascript.jscomp.Instrumentation.getDescriptor();
    }
    
    public com.google.javascript.jscomp.Instrumentation getDefaultInstanceForType() {
      return com.google.javascript.jscomp.Instrumentation.getDefaultInstance();
    }
    
    public com.google.javascript.jscomp.Instrumentation build() {
      com.google.javascript.jscomp.Instrumentation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }
    
    private com.google.javascript.jscomp.Instrumentation buildParsed()
        throws com.google.protobuf.InvalidProtocolBufferException {
      com.google.javascript.jscomp.Instrumentation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(
          result).asInvalidProtocolBufferException();
      }
      return result;
    }
    
    public com.google.javascript.jscomp.Instrumentation buildPartial() {
      com.google.javascript.jscomp.Instrumentation result = new com.google.javascript.jscomp.Instrumentation(this);
      result.hasReportDefined = hasReportDefined;
      result.reportDefined_ = reportDefined_;
      result.hasReportCall = hasReportCall;
      result.reportCall_ = reportCall_;
      result.hasReportExit = hasReportExit;
      result.reportExit_ = reportExit_;
      if (isDeclarationToRemoveMutable) {
        declarationToRemove_ = java.util.Collections.unmodifiableList(declarationToRemove_);
        isDeclarationToRemoveMutable = false;
      }
      result.declarationToRemove_ = declarationToRemove_;
      if (isInitMutable) {
        init_ = java.util.Collections.unmodifiableList(init_);
        isInitMutable = false;
      }
      result.init_ = init_;
      result.hasAppNameSetter = hasAppNameSetter;
      result.appNameSetter_ = appNameSetter_;
      return result;
    }
    
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.javascript.jscomp.Instrumentation) {
        return mergeFrom((com.google.javascript.jscomp.Instrumentation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }
    
    public Builder mergeFrom(com.google.javascript.jscomp.Instrumentation other) {
      if (other == com.google.javascript.jscomp.Instrumentation.getDefaultInstance()) return this;
      if (other.hasReportDefined()) {
        setReportDefined(other.getReportDefined());
      }
      if (other.hasReportCall()) {
        setReportCall(other.getReportCall());
      }
      if (other.hasReportExit()) {
        setReportExit(other.getReportExit());
      }
      if (!other.declarationToRemove_.isEmpty()) {
        if (declarationToRemove_.isEmpty()) {
          declarationToRemove_ = other.declarationToRemove_;
          isDeclarationToRemoveMutable = false;
        } else {
          ensureDeclarationToRemoveIsMutable();
          declarationToRemove_.addAll(other.declarationToRemove_);
        }
      }
      if (!other.init_.isEmpty()) {
        if (init_.isEmpty()) {
          init_ = other.init_;
          isInitMutable = false;
        } else {
          ensureInitIsMutable();
          init_.addAll(other.init_);
        }
      }
      if (other.hasAppNameSetter()) {
        setAppNameSetter(other.getAppNameSetter());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }
    
    public final boolean isInitialized() {
      return true;
    }
    
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder(
          this.getUnknownFields());
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            this.setUnknownFields(unknownFields.build());
            return this;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              this.setUnknownFields(unknownFields.build());
              return this;
            }
            break;
          }
          case 10: {
            setReportDefined(input.readString());
            break;
          }
          case 18: {
            setReportCall(input.readString());
            break;
          }
          case 26: {
            addDeclarationToRemove(input.readString());
            break;
          }
          case 34: {
            addInit(input.readString());
            break;
          }
          case 42: {
            setAppNameSetter(input.readString());
            break;
          }
          case 50: {
            setReportExit(input.readString());
            break;
          }
        }
      }
    }
    
    
    // optional string report_defined = 1;
    private boolean hasReportDefined;
    private java.lang.String reportDefined_ = "";
    public boolean hasReportDefined() {
      return hasReportDefined;
    }
    public java.lang.String getReportDefined() {
      return reportDefined_;
    }
    public Builder setReportDefined(java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  hasReportDefined = true;
      reportDefined_ = value;
      return this;
    }
    public Builder clearReportDefined() {
      hasReportDefined = false;
      reportDefined_ = getDefaultInstance().getReportDefined();
      return this;
    }
    
    // optional string report_call = 2;
    private boolean hasReportCall;
    private java.lang.String reportCall_ = "";
    public boolean hasReportCall() {
      return hasReportCall;
    }
    public java.lang.String getReportCall() {
      return reportCall_;
    }
    public Builder setReportCall(java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  hasReportCall = true;
      reportCall_ = value;
      return this;
    }
    public Builder clearReportCall() {
      hasReportCall = false;
      reportCall_ = getDefaultInstance().getReportCall();
      return this;
    }
    
    // optional string report_exit = 6;
    private boolean hasReportExit;
    private java.lang.String reportExit_ = "";
    public boolean hasReportExit() {
      return hasReportExit;
    }
    public java.lang.String getReportExit() {
      return reportExit_;
    }
    public Builder setReportExit(java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  hasReportExit = true;
      reportExit_ = value;
      return this;
    }
    public Builder clearReportExit() {
      hasReportExit = false;
      reportExit_ = getDefaultInstance().getReportExit();
      return this;
    }
    
    // repeated string declaration_to_remove = 3;
    private java.util.List<java.lang.String> declarationToRemove_ =
      java.util.Collections.emptyList();
    private boolean isDeclarationToRemoveMutable;
    private void ensureDeclarationToRemoveIsMutable() {
      if (!isDeclarationToRemoveMutable) {
        declarationToRemove_ = new java.util.ArrayList<java.lang.String>(declarationToRemove_);
        isDeclarationToRemoveMutable = true;
       }
    }
    public java.util.List<java.lang.String>
        getDeclarationToRemoveList() {
      return java.util.Collections.unmodifiableList(declarationToRemove_);
    }
    public int getDeclarationToRemoveCount() {
      return declarationToRemove_.size();
    }
    public java.lang.String getDeclarationToRemove(int index) {
      return declarationToRemove_.get(index);
    }
    public Builder setDeclarationToRemove(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDeclarationToRemoveIsMutable();
      declarationToRemove_.set(index, value);
      return this;
    }
    public Builder addDeclarationToRemove(java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDeclarationToRemoveIsMutable();
      declarationToRemove_.add(value);
      return this;
    }
    public Builder addAllDeclarationToRemove(
        java.lang.Iterable<? extends java.lang.String> values) {
      ensureDeclarationToRemoveIsMutable();
      super.addAll(values, declarationToRemove_);
      return this;
    }
    public Builder clearDeclarationToRemove() {
      declarationToRemove_ = java.util.Collections.emptyList();
      isDeclarationToRemoveMutable = false;
      return this;
    }
    
    // repeated string init = 4;
    private java.util.List<java.lang.String> init_ =
      java.util.Collections.emptyList();
    private boolean isInitMutable;
    private void ensureInitIsMutable() {
      if (!isInitMutable) {
        init_ = new java.util.ArrayList<java.lang.String>(init_);
        isInitMutable = true;
       }
    }
    public java.util.List<java.lang.String>
        getInitList() {
      return java.util.Collections.unmodifiableList(init_);
    }
    public int getInitCount() {
      return init_.size();
    }
    public java.lang.String getInit(int index) {
      return init_.get(index);
    }
    public Builder setInit(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureInitIsMutable();
      init_.set(index, value);
      return this;
    }
    public Builder addInit(java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureInitIsMutable();
      init_.add(value);
      return this;
    }
    public Builder addAllInit(
        java.lang.Iterable<? extends java.lang.String> values) {
      ensureInitIsMutable();
      super.addAll(values, init_);
      return this;
    }
    public Builder clearInit() {
      init_ = java.util.Collections.emptyList();
      isInitMutable = false;
      return this;
    }
    
    // optional string app_name_setter = 5;
    private boolean hasAppNameSetter;
    private java.lang.String appNameSetter_ = "";
    public boolean hasAppNameSetter() {
      return hasAppNameSetter;
    }
    public java.lang.String getAppNameSetter() {
      return appNameSetter_;
    }
    public Builder setAppNameSetter(java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  hasAppNameSetter = true;
      appNameSetter_ = value;
      return this;
    }
    public Builder clearAppNameSetter() {
      hasAppNameSetter = false;
      appNameSetter_ = getDefaultInstance().getAppNameSetter();
      return this;
    }
    
    // @@protoc_insertion_point(builder_scope:jscomp.Instrumentation)
  }
  
  static {
    defaultInstance = new Instrumentation(true);
    com.google.javascript.jscomp.InstrumentationTemplate.internalForceInit();
    defaultInstance.initFields();
  }
  
  // @@protoc_insertion_point(class_scope:jscomp.Instrumentation)
}

