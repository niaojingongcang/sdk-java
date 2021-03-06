// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/websocket/config.proto

package com.v2ray.core.transport.internet.websocket;

/**
 * Protobuf type {@code v2ray.core.transport.internet.websocket.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.websocket.Config)
    ConfigOrBuilder {
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    path_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Config(
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
          case 10: {
            com.v2ray.core.transport.internet.websocket.ConnectionReuse.Builder subBuilder = null;
            if (connectionReuse_ != null) {
              subBuilder = connectionReuse_.toBuilder();
            }
            connectionReuse_ = input.readMessage(com.v2ray.core.transport.internet.websocket.ConnectionReuse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(connectionReuse_);
              connectionReuse_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
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
    return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.internet.websocket.Config.class, com.v2ray.core.transport.internet.websocket.Config.Builder.class);
  }

  public static final int CONNECTION_REUSE_FIELD_NUMBER = 1;
  private com.v2ray.core.transport.internet.websocket.ConnectionReuse connectionReuse_;
  /**
   * <pre>
   * Whether or not to reuse WebSocket connections.
   * </pre>
   *
   * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
   */
  public boolean hasConnectionReuse() {
    return connectionReuse_ != null;
  }
  /**
   * <pre>
   * Whether or not to reuse WebSocket connections.
   * </pre>
   *
   * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
   */
  public com.v2ray.core.transport.internet.websocket.ConnectionReuse getConnectionReuse() {
    return connectionReuse_ == null ? com.v2ray.core.transport.internet.websocket.ConnectionReuse.getDefaultInstance() : connectionReuse_;
  }
  /**
   * <pre>
   * Whether or not to reuse WebSocket connections.
   * </pre>
   *
   * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
   */
  public com.v2ray.core.transport.internet.websocket.ConnectionReuseOrBuilder getConnectionReuseOrBuilder() {
    return getConnectionReuse();
  }

  public static final int PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object path_;
  /**
   * <pre>
   * URL path to the WebSocket service. Empty value means root(/).
   * </pre>
   *
   * <code>optional string path = 2;</code>
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL path to the WebSocket service. Empty value means root(/).
   * </pre>
   *
   * <code>optional string path = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (connectionReuse_ != null) {
      output.writeMessage(1, getConnectionReuse());
    }
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (connectionReuse_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConnectionReuse());
    }
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
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
    if (!(obj instanceof com.v2ray.core.transport.internet.websocket.Config)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.internet.websocket.Config other = (com.v2ray.core.transport.internet.websocket.Config) obj;

    boolean result = true;
    result = result && (hasConnectionReuse() == other.hasConnectionReuse());
    if (hasConnectionReuse()) {
      result = result && getConnectionReuse()
          .equals(other.getConnectionReuse());
    }
    result = result && getPath()
        .equals(other.getPath());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasConnectionReuse()) {
      hash = (37 * hash) + CONNECTION_REUSE_FIELD_NUMBER;
      hash = (53 * hash) + getConnectionReuse().hashCode();
    }
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.transport.internet.websocket.Config prototype) {
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
   * Protobuf type {@code v2ray.core.transport.internet.websocket.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.websocket.Config)
      com.v2ray.core.transport.internet.websocket.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.internet.websocket.Config.class, com.v2ray.core.transport.internet.websocket.Config.Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.websocket.Config.newBuilder()
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
      if (connectionReuseBuilder_ == null) {
        connectionReuse_ = null;
      } else {
        connectionReuse_ = null;
        connectionReuseBuilder_ = null;
      }
      path_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_descriptor;
    }

    public com.v2ray.core.transport.internet.websocket.Config getDefaultInstanceForType() {
      return com.v2ray.core.transport.internet.websocket.Config.getDefaultInstance();
    }

    public com.v2ray.core.transport.internet.websocket.Config build() {
      com.v2ray.core.transport.internet.websocket.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.transport.internet.websocket.Config buildPartial() {
      com.v2ray.core.transport.internet.websocket.Config result = new com.v2ray.core.transport.internet.websocket.Config(this);
      if (connectionReuseBuilder_ == null) {
        result.connectionReuse_ = connectionReuse_;
      } else {
        result.connectionReuse_ = connectionReuseBuilder_.build();
      }
      result.path_ = path_;
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
      if (other instanceof com.v2ray.core.transport.internet.websocket.Config) {
        return mergeFrom((com.v2ray.core.transport.internet.websocket.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.internet.websocket.Config other) {
      if (other == com.v2ray.core.transport.internet.websocket.Config.getDefaultInstance()) return this;
      if (other.hasConnectionReuse()) {
        mergeConnectionReuse(other.getConnectionReuse());
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
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
      com.v2ray.core.transport.internet.websocket.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.transport.internet.websocket.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.v2ray.core.transport.internet.websocket.ConnectionReuse connectionReuse_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.transport.internet.websocket.ConnectionReuse, com.v2ray.core.transport.internet.websocket.ConnectionReuse.Builder, com.v2ray.core.transport.internet.websocket.ConnectionReuseOrBuilder> connectionReuseBuilder_;
    /**
     * <pre>
     * Whether or not to reuse WebSocket connections.
     * </pre>
     *
     * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
     */
    public boolean hasConnectionReuse() {
      return connectionReuseBuilder_ != null || connectionReuse_ != null;
    }
    /**
     * <pre>
     * Whether or not to reuse WebSocket connections.
     * </pre>
     *
     * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
     */
    public com.v2ray.core.transport.internet.websocket.ConnectionReuse getConnectionReuse() {
      if (connectionReuseBuilder_ == null) {
        return connectionReuse_ == null ? com.v2ray.core.transport.internet.websocket.ConnectionReuse.getDefaultInstance() : connectionReuse_;
      } else {
        return connectionReuseBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Whether or not to reuse WebSocket connections.
     * </pre>
     *
     * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
     */
    public Builder setConnectionReuse(com.v2ray.core.transport.internet.websocket.ConnectionReuse value) {
      if (connectionReuseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        connectionReuse_ = value;
        onChanged();
      } else {
        connectionReuseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Whether or not to reuse WebSocket connections.
     * </pre>
     *
     * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
     */
    public Builder setConnectionReuse(
        com.v2ray.core.transport.internet.websocket.ConnectionReuse.Builder builderForValue) {
      if (connectionReuseBuilder_ == null) {
        connectionReuse_ = builderForValue.build();
        onChanged();
      } else {
        connectionReuseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Whether or not to reuse WebSocket connections.
     * </pre>
     *
     * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
     */
    public Builder mergeConnectionReuse(com.v2ray.core.transport.internet.websocket.ConnectionReuse value) {
      if (connectionReuseBuilder_ == null) {
        if (connectionReuse_ != null) {
          connectionReuse_ =
            com.v2ray.core.transport.internet.websocket.ConnectionReuse.newBuilder(connectionReuse_).mergeFrom(value).buildPartial();
        } else {
          connectionReuse_ = value;
        }
        onChanged();
      } else {
        connectionReuseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Whether or not to reuse WebSocket connections.
     * </pre>
     *
     * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
     */
    public Builder clearConnectionReuse() {
      if (connectionReuseBuilder_ == null) {
        connectionReuse_ = null;
        onChanged();
      } else {
        connectionReuse_ = null;
        connectionReuseBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Whether or not to reuse WebSocket connections.
     * </pre>
     *
     * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
     */
    public com.v2ray.core.transport.internet.websocket.ConnectionReuse.Builder getConnectionReuseBuilder() {
      
      onChanged();
      return getConnectionReuseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Whether or not to reuse WebSocket connections.
     * </pre>
     *
     * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
     */
    public com.v2ray.core.transport.internet.websocket.ConnectionReuseOrBuilder getConnectionReuseOrBuilder() {
      if (connectionReuseBuilder_ != null) {
        return connectionReuseBuilder_.getMessageOrBuilder();
      } else {
        return connectionReuse_ == null ?
            com.v2ray.core.transport.internet.websocket.ConnectionReuse.getDefaultInstance() : connectionReuse_;
      }
    }
    /**
     * <pre>
     * Whether or not to reuse WebSocket connections.
     * </pre>
     *
     * <code>optional .v2ray.core.transport.internet.websocket.ConnectionReuse connection_reuse = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.transport.internet.websocket.ConnectionReuse, com.v2ray.core.transport.internet.websocket.ConnectionReuse.Builder, com.v2ray.core.transport.internet.websocket.ConnectionReuseOrBuilder> 
        getConnectionReuseFieldBuilder() {
      if (connectionReuseBuilder_ == null) {
        connectionReuseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.transport.internet.websocket.ConnectionReuse, com.v2ray.core.transport.internet.websocket.ConnectionReuse.Builder, com.v2ray.core.transport.internet.websocket.ConnectionReuseOrBuilder>(
                getConnectionReuse(),
                getParentForChildren(),
                isClean());
        connectionReuse_ = null;
      }
      return connectionReuseBuilder_;
    }

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>optional string path = 2;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>optional string path = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>optional string path = 2;</code>
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>optional string path = 2;</code>
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>optional string path = 2;</code>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.websocket.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.websocket.Config)
  private static final com.v2ray.core.transport.internet.websocket.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.internet.websocket.Config();
  }

  public static com.v2ray.core.transport.internet.websocket.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.transport.internet.websocket.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

