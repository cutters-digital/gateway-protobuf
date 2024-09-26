// DO NOT EDIT.
// swift-format-ignore-file
// swiftlint:disable all
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: proto/onboarding/onboarding_api.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

public struct Onboarding_ListMessagesRequest: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Onboarding_ListMessagesResponse: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var messages: [Onboarding_AppMessage] = []

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// AppMessage contains information about general important extra onboarding-like-messages to the user.
public struct Onboarding_AppMessage: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// The id for the app-message. The id and version should be stored locally on the app.
  public var id: String = String()

  /// The version of this app-message. If greater than what has been shown previously, the content should be displayed to the user.
  public var version: UInt32 = 0

  public var content: Onboarding_AppMessageContent {
    get {return _content ?? Onboarding_AppMessageContent()}
    set {_content = newValue}
  }
  /// Returns true if `content` has been explicitly set.
  public var hasContent: Bool {return self._content != nil}
  /// Clears the value of `content`. Subsequent reads from it will return its default value.
  public mutating func clearContent() {self._content = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _content: Onboarding_AppMessageContent? = nil
}

/// AppMessageContent contains information about general important extra onboarding-like-messages to the user.
public struct Onboarding_AppMessageContent: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var title: String = String()

  /// Future: Buttons?
  public var bulletContent: [Onboarding_BulletContent] = []

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// BulletContent contains the information about one bullet-point for app-messages.
public struct Onboarding_BulletContent: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// imageUrl is a url to a image of the product. It may be localized.
  public var imageURL: String = String()

  public var title: String = String()

  public var description_p: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "onboarding"

extension Onboarding_ListMessagesRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ListMessagesRequest"
  public static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    // Load everything into unknown fields
    while try decoder.nextFieldNumber() != nil {}
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Onboarding_ListMessagesRequest, rhs: Onboarding_ListMessagesRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Onboarding_ListMessagesResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ListMessagesResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "messages"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.messages) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.messages.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.messages, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Onboarding_ListMessagesResponse, rhs: Onboarding_ListMessagesResponse) -> Bool {
    if lhs.messages != rhs.messages {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Onboarding_AppMessage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".AppMessage"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "version"),
    3: .same(proto: "content"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.version) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._content) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if self.version != 0 {
      try visitor.visitSingularUInt32Field(value: self.version, fieldNumber: 2)
    }
    try { if let v = self._content {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Onboarding_AppMessage, rhs: Onboarding_AppMessage) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.version != rhs.version {return false}
    if lhs._content != rhs._content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Onboarding_AppMessageContent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".AppMessageContent"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .standard(proto: "bullet_content"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.bulletContent) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.bulletContent.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.bulletContent, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Onboarding_AppMessageContent, rhs: Onboarding_AppMessageContent) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.bulletContent != rhs.bulletContent {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Onboarding_BulletContent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".BulletContent"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "image_url"),
    2: .same(proto: "title"),
    3: .same(proto: "description"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.imageURL) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.imageURL.isEmpty {
      try visitor.visitSingularStringField(value: self.imageURL, fieldNumber: 1)
    }
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 2)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Onboarding_BulletContent, rhs: Onboarding_BulletContent) -> Bool {
    if lhs.imageURL != rhs.imageURL {return false}
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
