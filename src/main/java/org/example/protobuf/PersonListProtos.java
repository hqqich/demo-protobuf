// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc/Person.proto

package org.example.protobuf;

public final class PersonListProtos {
  private PersonListProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_Person_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_Person_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_PersonList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_PersonList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023protoc/Person.proto\022\013org.example\"\230\002\n\006P" +
      "erson\022\021\n\004name\030\001 \001(\tH\000\210\001\001\022\017\n\002id\030\002 \001(\005H\001\210\001" +
      "\001\022\022\n\005email\030\003 \001(\tH\002\210\001\001\022/\n\006phones\030\004 \003(\0132\037." +
      "org.example.Person.PhoneNumber\032h\n\013PhoneN" +
      "umber\022\023\n\006number\030\001 \001(\tH\000\210\001\001\0220\n\004type\030\002 \001(\016" +
      "2\035.org.example.Person.PhoneTypeH\001\210\001\001B\t\n\007" +
      "_numberB\007\n\005_type\"!\n\tPhoneType\022\n\n\006MOBILE\020" +
      "\000\022\010\n\004HOME\020\001B\007\n\005_nameB\005\n\003_idB\010\n\006_email\"1\n" +
      "\nPersonList\022#\n\006person\030\001 \003(\0132\023.org.exampl" +
      "e.PersonB*\n\024org.example.protobufB\020Person" +
      "ListProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_example_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", "Name", "Id", "Email", });
    internal_static_org_example_Person_PhoneNumber_descriptor =
      internal_static_org_example_Person_descriptor.getNestedTypes().get(0);
    internal_static_org_example_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", "Number", "Type", });
    internal_static_org_example_PersonList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_example_PersonList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_PersonList_descriptor,
        new java.lang.String[] { "Person", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
