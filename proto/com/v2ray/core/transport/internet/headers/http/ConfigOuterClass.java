// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/headers/http/config.proto

package com.v2ray.core.transport.internet.headers.http;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_headers_http_Header_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_headers_http_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_headers_http_Version_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_headers_http_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_headers_http_Method_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_headers_http_Method_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_headers_http_RequestConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_headers_http_RequestConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_headers_http_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_headers_http_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_headers_http_ResponseConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_headers_http_ResponseConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_transport_internet_headers_http_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_transport_internet_headers_http_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;v2ray.com/core/transport/internet/head" +
      "ers/http/config.proto\022*v2ray.core.transp" +
      "ort.internet.headers.http\"%\n\006Header\022\014\n\004n" +
      "ame\030\001 \001(\t\022\r\n\005value\030\002 \003(\t\"\030\n\007Version\022\r\n\005v" +
      "alue\030\001 \001(\t\"\027\n\006Method\022\r\n\005value\030\001 \001(\t\"\352\001\n\r" +
      "RequestConfig\022D\n\007version\030\001 \001(\01323.v2ray.c" +
      "ore.transport.internet.headers.http.Vers" +
      "ion\022B\n\006method\030\002 \001(\01322.v2ray.core.transpo" +
      "rt.internet.headers.http.Method\022\013\n\003uri\030\003" +
      " \003(\t\022B\n\006header\030\004 \003(\01322.v2ray.core.transp",
      "ort.internet.headers.http.Header\"&\n\006Stat" +
      "us\022\014\n\004code\030\001 \001(\t\022\016\n\006reason\030\002 \001(\t\"\336\001\n\016Res" +
      "ponseConfig\022D\n\007version\030\001 \001(\01323.v2ray.cor" +
      "e.transport.internet.headers.http.Versio" +
      "n\022B\n\006status\030\002 \001(\01322.v2ray.core.transport" +
      ".internet.headers.http.Status\022B\n\006header\030" +
      "\003 \003(\01322.v2ray.core.transport.internet.he" +
      "aders.http.Header\"\242\001\n\006Config\022J\n\007request\030" +
      "\001 \001(\01329.v2ray.core.transport.internet.he" +
      "aders.http.RequestConfig\022L\n\010response\030\002 \001",
      "(\0132:.v2ray.core.transport.internet.heade" +
      "rs.http.ResponseConfigBe\n.com.v2ray.core" +
      ".transport.internet.headers.httpP\001Z\004http" +
      "\252\002*V2Ray.Core.Transport.Internet.Headers" +
      ".Httpb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_v2ray_core_transport_internet_headers_http_Header_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_transport_internet_headers_http_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_headers_http_Header_descriptor,
        new java.lang.String[] { "Name", "Value", });
    internal_static_v2ray_core_transport_internet_headers_http_Version_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_transport_internet_headers_http_Version_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_headers_http_Version_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_v2ray_core_transport_internet_headers_http_Method_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v2ray_core_transport_internet_headers_http_Method_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_headers_http_Method_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_v2ray_core_transport_internet_headers_http_RequestConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_v2ray_core_transport_internet_headers_http_RequestConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_headers_http_RequestConfig_descriptor,
        new java.lang.String[] { "Version", "Method", "Uri", "Header", });
    internal_static_v2ray_core_transport_internet_headers_http_Status_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_v2ray_core_transport_internet_headers_http_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_headers_http_Status_descriptor,
        new java.lang.String[] { "Code", "Reason", });
    internal_static_v2ray_core_transport_internet_headers_http_ResponseConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_v2ray_core_transport_internet_headers_http_ResponseConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_headers_http_ResponseConfig_descriptor,
        new java.lang.String[] { "Version", "Status", "Header", });
    internal_static_v2ray_core_transport_internet_headers_http_Config_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_v2ray_core_transport_internet_headers_http_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_transport_internet_headers_http_Config_descriptor,
        new java.lang.String[] { "Request", "Response", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
