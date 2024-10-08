// DO NOT EDIT.
// swift-format-ignore-file
// swiftlint:disable all
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: proto/rest/rest_api.proto
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

/// NotificationType contains all the possible notification-types that can be sent.
public enum Rest_NotificationType: SwiftProtobuf.Enum, Swift.CaseIterable {
  public typealias RawValue = Int
  case invalid // = 0
  case waitwhileSuccess // = 1
  case UNRECOGNIZED(Int)

  public init() {
    self = .invalid
  }

  public init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .invalid
    case 1: self = .waitwhileSuccess
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  public var rawValue: Int {
    switch self {
    case .invalid: return 0
    case .waitwhileSuccess: return 1
    case .UNRECOGNIZED(let i): return i
    }
  }

  // The compiler won't synthesize support with the UNRECOGNIZED case.
  public static let allCases: [Rest_NotificationType] = [
    .invalid,
    .waitwhileSuccess,
  ]

}

/// VoucherNotificationType contains all the possible notification-types that can be sent.
public enum Rest_VoucherNotificationType: SwiftProtobuf.Enum, Swift.CaseIterable {
  public typealias RawValue = Int
  case invalid // = 0
  case referredFriends // = 1
  case UNRECOGNIZED(Int)

  public init() {
    self = .invalid
  }

  public init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .invalid
    case 1: self = .referredFriends
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  public var rawValue: Int {
    switch self {
    case .invalid: return 0
    case .referredFriends: return 1
    case .UNRECOGNIZED(let i): return i
    }
  }

  // The compiler won't synthesize support with the UNRECOGNIZED case.
  public static let allCases: [Rest_VoucherNotificationType] = [
    .invalid,
    .referredFriends,
  ]

}

public struct Rest_NotificationRequest: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Required server-authentication.
  public var auth: Auth_Authentication {
    get {return _auth ?? Auth_Authentication()}
    set {_auth = newValue}
  }
  /// Returns true if `auth` has been explicitly set.
  public var hasAuth: Bool {return self._auth != nil}
  /// Clears the value of `auth`. Subsequent reads from it will return its default value.
  public mutating func clearAuth() {self._auth = nil}

  /// The recipient of the notification.
  public var customerID: String = String()

  /// The notification payload.
  public var appNotification: Notifications_AppNotification {
    get {return _appNotification ?? Notifications_AppNotification()}
    set {_appNotification = newValue}
  }
  /// Returns true if `appNotification` has been explicitly set.
  public var hasAppNotification: Bool {return self._appNotification != nil}
  /// Clears the value of `appNotification`. Subsequent reads from it will return its default value.
  public mutating func clearAppNotification() {self._appNotification = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _auth: Auth_Authentication? = nil
  fileprivate var _appNotification: Notifications_AppNotification? = nil
}

public struct Rest_NotificationResponse: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var message: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Rest_UpdateServiceRequest: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Required server-authentication.
  public var auth: Auth_Authentication {
    get {return _auth ?? Auth_Authentication()}
    set {_auth = newValue}
  }
  /// Returns true if `auth` has been explicitly set.
  public var hasAuth: Bool {return self._auth != nil}
  /// Clears the value of `auth`. Subsequent reads from it will return its default value.
  public mutating func clearAuth() {self._auth = nil}

  /// The service to check for updates on.
  public var service: Rest_ServiceUpdate {
    get {return _service ?? Rest_ServiceUpdate()}
    set {_service = newValue}
  }
  /// Returns true if `service` has been explicitly set.
  public var hasService: Bool {return self._service != nil}
  /// Clears the value of `service`. Subsequent reads from it will return its default value.
  public mutating func clearService() {self._service = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _auth: Auth_Authentication? = nil
  fileprivate var _service: Rest_ServiceUpdate? = nil
}

public struct Rest_UpdateServiceResponse: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var message: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Rest_VoucherNotificationRequest: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Required server-authentication.
  public var auth: Auth_Authentication {
    get {return _auth ?? Auth_Authentication()}
    set {_auth = newValue}
  }
  /// Returns true if `auth` has been explicitly set.
  public var hasAuth: Bool {return self._auth != nil}
  /// Clears the value of `auth`. Subsequent reads from it will return its default value.
  public mutating func clearAuth() {self._auth = nil}

  /// An ID for idempotency.
  public var eventID: String = String()

  /// The country-code and phone-number for the recipient, prefixed with "+", e.g.: "+4712345678".
  public var phoneNumber: String = String()

  /// The type of notification to send out.
  public var voucherNotificationType: Rest_VoucherNotificationType = .invalid

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _auth: Auth_Authentication? = nil
}

public struct Rest_VoucherNotificationResponse: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var message: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// ServiceUpdate defines the required fields to keep a customer updated on his service-purchase.
public struct Rest_ServiceUpdate: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Required transaction-id.
  public var transactionID: String = String()

  /// Required customer-id.
  public var customerID: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "rest"

extension Rest_NotificationType: SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "NOTIFICATION_TYPE_INVALID"),
    1: .same(proto: "NOTIFICATION_TYPE_WAITWHILE_SUCCESS"),
  ]
}

extension Rest_VoucherNotificationType: SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "VOUCHER_NOTIFICATION_TYPE_INVALID"),
    1: .same(proto: "VOUCHER_NOTIFICATION_TYPE_REFERRED_FRIENDS"),
  ]
}

extension Rest_NotificationRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".NotificationRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "auth"),
    2: .standard(proto: "customer_id"),
    3: .standard(proto: "app_notification"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._auth) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.customerID) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._appNotification) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._auth {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.customerID.isEmpty {
      try visitor.visitSingularStringField(value: self.customerID, fieldNumber: 2)
    }
    try { if let v = self._appNotification {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Rest_NotificationRequest, rhs: Rest_NotificationRequest) -> Bool {
    if lhs._auth != rhs._auth {return false}
    if lhs.customerID != rhs.customerID {return false}
    if lhs._appNotification != rhs._appNotification {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rest_NotificationResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".NotificationResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "message"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.message) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.message.isEmpty {
      try visitor.visitSingularStringField(value: self.message, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Rest_NotificationResponse, rhs: Rest_NotificationResponse) -> Bool {
    if lhs.message != rhs.message {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rest_UpdateServiceRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".UpdateServiceRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "auth"),
    2: .same(proto: "service"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._auth) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._service) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._auth {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._service {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Rest_UpdateServiceRequest, rhs: Rest_UpdateServiceRequest) -> Bool {
    if lhs._auth != rhs._auth {return false}
    if lhs._service != rhs._service {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rest_UpdateServiceResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".UpdateServiceResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "message"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.message) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.message.isEmpty {
      try visitor.visitSingularStringField(value: self.message, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Rest_UpdateServiceResponse, rhs: Rest_UpdateServiceResponse) -> Bool {
    if lhs.message != rhs.message {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rest_VoucherNotificationRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".VoucherNotificationRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "auth"),
    2: .standard(proto: "event_id"),
    3: .standard(proto: "phone_number"),
    4: .standard(proto: "voucher_notification_type"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._auth) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.eventID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.phoneNumber) }()
      case 4: try { try decoder.decodeSingularEnumField(value: &self.voucherNotificationType) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._auth {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.eventID.isEmpty {
      try visitor.visitSingularStringField(value: self.eventID, fieldNumber: 2)
    }
    if !self.phoneNumber.isEmpty {
      try visitor.visitSingularStringField(value: self.phoneNumber, fieldNumber: 3)
    }
    if self.voucherNotificationType != .invalid {
      try visitor.visitSingularEnumField(value: self.voucherNotificationType, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Rest_VoucherNotificationRequest, rhs: Rest_VoucherNotificationRequest) -> Bool {
    if lhs._auth != rhs._auth {return false}
    if lhs.eventID != rhs.eventID {return false}
    if lhs.phoneNumber != rhs.phoneNumber {return false}
    if lhs.voucherNotificationType != rhs.voucherNotificationType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rest_VoucherNotificationResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".VoucherNotificationResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "message"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.message) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.message.isEmpty {
      try visitor.visitSingularStringField(value: self.message, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Rest_VoucherNotificationResponse, rhs: Rest_VoucherNotificationResponse) -> Bool {
    if lhs.message != rhs.message {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Rest_ServiceUpdate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ServiceUpdate"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "transaction_id"),
    2: .standard(proto: "customer_id"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.transactionID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.customerID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.transactionID.isEmpty {
      try visitor.visitSingularStringField(value: self.transactionID, fieldNumber: 1)
    }
    if !self.customerID.isEmpty {
      try visitor.visitSingularStringField(value: self.customerID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Rest_ServiceUpdate, rhs: Rest_ServiceUpdate) -> Bool {
    if lhs.transactionID != rhs.transactionID {return false}
    if lhs.customerID != rhs.customerID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
