// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/socks/config.proto

package com.v2ray.core.proxy.socks;

/**
 * Protobuf type {@code v2ray.core.proxy.socks.ServerConfig}
 */
public  final class ServerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.proxy.socks.ServerConfig)
    ServerConfigOrBuilder {
  // Use ServerConfig.newBuilder() to construct.
  private ServerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerConfig() {
    authType_ = 0;
    udpEnabled_ = false;
    timeout_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ServerConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            authType_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              accounts_ = com.google.protobuf.MapField.newMapField(
                  AccountsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            accounts__ = input.readMessage(
                AccountsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            accounts_.getMutableMap().put(
                accounts__.getKey(), accounts__.getValue());
            break;
          }
          case 26: {
            com.v2ray.core.common.net.IPOrDomain.Builder subBuilder = null;
            if (address_ != null) {
              subBuilder = address_.toBuilder();
            }
            address_ = input.readMessage(com.v2ray.core.common.net.IPOrDomain.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(address_);
              address_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            udpEnabled_ = input.readBool();
            break;
          }
          case 40: {

            timeout_ = input.readUInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ServerConfig_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetAccounts();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ServerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.proxy.socks.ServerConfig.class, com.v2ray.core.proxy.socks.ServerConfig.Builder.class);
  }

  private int bitField0_;
  public static final int AUTH_TYPE_FIELD_NUMBER = 1;
  private int authType_;
  /**
   * <code>optional .v2ray.core.proxy.socks.AuthType auth_type = 1;</code>
   */
  public int getAuthTypeValue() {
    return authType_;
  }
  /**
   * <code>optional .v2ray.core.proxy.socks.AuthType auth_type = 1;</code>
   */
  public com.v2ray.core.proxy.socks.AuthType getAuthType() {
    com.v2ray.core.proxy.socks.AuthType result = com.v2ray.core.proxy.socks.AuthType.valueOf(authType_);
    return result == null ? com.v2ray.core.proxy.socks.AuthType.UNRECOGNIZED : result;
  }

  public static final int ACCOUNTS_FIELD_NUMBER = 2;
  private static final class AccountsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ServerConfig_AccountsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> accounts_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetAccounts() {
    if (accounts_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AccountsDefaultEntryHolder.defaultEntry);
    }
    return accounts_;
  }

  public int getAccountsCount() {
    return internalGetAccounts().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */

  public boolean containsAccounts(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetAccounts().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAccountsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getAccounts() {
    return getAccountsMap();
  }
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getAccountsMap() {
    return internalGetAccounts().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */

  public java.lang.String getAccountsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetAccounts().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; accounts = 2;</code>
   */

  public java.lang.String getAccountsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetAccounts().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int ADDRESS_FIELD_NUMBER = 3;
  private com.v2ray.core.common.net.IPOrDomain address_;
  /**
   * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
   */
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
   */
  public com.v2ray.core.common.net.IPOrDomain getAddress() {
    return address_ == null ? com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
  }
  /**
   * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
   */
  public com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int UDP_ENABLED_FIELD_NUMBER = 4;
  private boolean udpEnabled_;
  /**
   * <code>optional bool udp_enabled = 4;</code>
   */
  public boolean getUdpEnabled() {
    return udpEnabled_;
  }

  public static final int TIMEOUT_FIELD_NUMBER = 5;
  private int timeout_;
  /**
   * <code>optional uint32 timeout = 5;</code>
   */
  public int getTimeout() {
    return timeout_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (authType_ != com.v2ray.core.proxy.socks.AuthType.NO_AUTH.getNumber()) {
      output.writeEnum(1, authType_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAccounts(),
        AccountsDefaultEntryHolder.defaultEntry,
        2);
    if (address_ != null) {
      output.writeMessage(3, getAddress());
    }
    if (udpEnabled_ != false) {
      output.writeBool(4, udpEnabled_);
    }
    if (timeout_ != 0) {
      output.writeUInt32(5, timeout_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authType_ != com.v2ray.core.proxy.socks.AuthType.NO_AUTH.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, authType_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetAccounts().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      accounts__ = AccountsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, accounts__);
    }
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAddress());
    }
    if (udpEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, udpEnabled_);
    }
    if (timeout_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, timeout_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.proxy.socks.ServerConfig)) {
      return super.equals(obj);
    }
    com.v2ray.core.proxy.socks.ServerConfig other = (com.v2ray.core.proxy.socks.ServerConfig) obj;

    boolean result = true;
    result = result && authType_ == other.authType_;
    result = result && internalGetAccounts().equals(
        other.internalGetAccounts());
    result = result && (hasAddress() == other.hasAddress());
    if (hasAddress()) {
      result = result && getAddress()
          .equals(other.getAddress());
    }
    result = result && (getUdpEnabled()
        == other.getUdpEnabled());
    result = result && (getTimeout()
        == other.getTimeout());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + AUTH_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + authType_;
    if (!internalGetAccounts().getMap().isEmpty()) {
      hash = (37 * hash) + ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAccounts().hashCode();
    }
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    hash = (37 * hash) + UDP_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUdpEnabled());
    hash = (37 * hash) + TIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + getTimeout();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.proxy.socks.ServerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.socks.ServerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.socks.ServerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.socks.ServerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.socks.ServerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.socks.ServerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.socks.ServerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.socks.ServerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.socks.ServerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.socks.ServerConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.proxy.socks.ServerConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code v2ray.core.proxy.socks.ServerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.proxy.socks.ServerConfig)
      com.v2ray.core.proxy.socks.ServerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ServerConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetAccounts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableAccounts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ServerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.proxy.socks.ServerConfig.class, com.v2ray.core.proxy.socks.ServerConfig.Builder.class);
    }

    // Construct using com.v2ray.core.proxy.socks.ServerConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      authType_ = 0;

      internalGetMutableAccounts().clear();
      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      udpEnabled_ = false;

      timeout_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.proxy.socks.Config.internal_static_v2ray_core_proxy_socks_ServerConfig_descriptor;
    }

    public com.v2ray.core.proxy.socks.ServerConfig getDefaultInstanceForType() {
      return com.v2ray.core.proxy.socks.ServerConfig.getDefaultInstance();
    }

    public com.v2ray.core.proxy.socks.ServerConfig build() {
      com.v2ray.core.proxy.socks.ServerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.proxy.socks.ServerConfig buildPartial() {
      com.v2ray.core.proxy.socks.ServerConfig result = new com.v2ray.core.proxy.socks.ServerConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.authType_ = authType_;
      result.accounts_ = internalGetAccounts();
      result.accounts_.makeImmutable();
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      result.udpEnabled_ = udpEnabled_;
      result.timeout_ = timeout_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.proxy.socks.ServerConfig) {
        return mergeFrom((com.v2ray.core.proxy.socks.ServerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.proxy.socks.ServerConfig other) {
      if (other == com.v2ray.core.proxy.socks.ServerConfig.getDefaultInstance()) return this;
      if (other.authType_ != 0) {
        setAuthTypeValue(other.getAuthTypeValue());
      }
      internalGetMutableAccounts().mergeFrom(
          other.internalGetAccounts());
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (other.getUdpEnabled() != false) {
        setUdpEnabled(other.getUdpEnabled());
      }
      if (other.getTimeout() != 0) {
        setTimeout(other.getTimeout());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.v2ray.core.proxy.socks.ServerConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.proxy.socks.ServerConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int authType_ = 0;
    /**
     * <code>optional .v2ray.core.proxy.socks.AuthType auth_type = 1;</code>
     */
    public int getAuthTypeValue() {
      return authType_;
    }
    /**
     * <code>optional .v2ray.core.proxy.socks.AuthType auth_type = 1;</code>
     */
    public Builder setAuthTypeValue(int value) {
      authType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .v2ray.core.proxy.socks.AuthType auth_type = 1;</code>
     */
    public com.v2ray.core.proxy.socks.AuthType getAuthType() {
      com.v2ray.core.proxy.socks.AuthType result = com.v2ray.core.proxy.socks.AuthType.valueOf(authType_);
      return result == null ? com.v2ray.core.proxy.socks.AuthType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .v2ray.core.proxy.socks.AuthType auth_type = 1;</code>
     */
    public Builder setAuthType(com.v2ray.core.proxy.socks.AuthType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      authType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .v2ray.core.proxy.socks.AuthType auth_type = 1;</code>
     */
    public Builder clearAuthType() {
      
      authType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> accounts_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetAccounts() {
      if (accounts_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AccountsDefaultEntryHolder.defaultEntry);
      }
      return accounts_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableAccounts() {
      onChanged();;
      if (accounts_ == null) {
        accounts_ = com.google.protobuf.MapField.newMapField(
            AccountsDefaultEntryHolder.defaultEntry);
      }
      if (!accounts_.isMutable()) {
        accounts_ = accounts_.copy();
      }
      return accounts_;
    }

    public int getAccountsCount() {
      return internalGetAccounts().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */

    public boolean containsAccounts(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetAccounts().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAccountsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAccounts() {
      return getAccountsMap();
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getAccountsMap() {
      return internalGetAccounts().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */

    public java.lang.String getAccountsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAccounts().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */

    public java.lang.String getAccountsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAccounts().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAccounts() {
      getMutableAccounts().clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */

    public Builder removeAccounts(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableAccounts().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableAccounts() {
      return internalGetMutableAccounts().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */
    public Builder putAccounts(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      getMutableAccounts().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; accounts = 2;</code>
     */

    public Builder putAllAccounts(
        java.util.Map<java.lang.String, java.lang.String> values) {
      getMutableAccounts().putAll(values);
      return this;
    }

    private com.v2ray.core.common.net.IPOrDomain address_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder> addressBuilder_;
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
     */
    public com.v2ray.core.common.net.IPOrDomain getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
     */
    public Builder setAddress(com.v2ray.core.common.net.IPOrDomain value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
     */
    public Builder setAddress(
        com.v2ray.core.common.net.IPOrDomain.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
     */
    public Builder mergeAddress(com.v2ray.core.common.net.IPOrDomain value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            com.v2ray.core.common.net.IPOrDomain.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
     */
    public com.v2ray.core.common.net.IPOrDomain.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
     */
    public com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
      }
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private boolean udpEnabled_ ;
    /**
     * <code>optional bool udp_enabled = 4;</code>
     */
    public boolean getUdpEnabled() {
      return udpEnabled_;
    }
    /**
     * <code>optional bool udp_enabled = 4;</code>
     */
    public Builder setUdpEnabled(boolean value) {
      
      udpEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool udp_enabled = 4;</code>
     */
    public Builder clearUdpEnabled() {
      
      udpEnabled_ = false;
      onChanged();
      return this;
    }

    private int timeout_ ;
    /**
     * <code>optional uint32 timeout = 5;</code>
     */
    public int getTimeout() {
      return timeout_;
    }
    /**
     * <code>optional uint32 timeout = 5;</code>
     */
    public Builder setTimeout(int value) {
      
      timeout_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 timeout = 5;</code>
     */
    public Builder clearTimeout() {
      
      timeout_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.proxy.socks.ServerConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.proxy.socks.ServerConfig)
  private static final com.v2ray.core.proxy.socks.ServerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.proxy.socks.ServerConfig();
  }

  public static com.v2ray.core.proxy.socks.ServerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerConfig>
      PARSER = new com.google.protobuf.AbstractParser<ServerConfig>() {
    public ServerConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerConfig> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.proxy.socks.ServerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

