// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: proto/payments/stripe.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
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

/// StripePaymentRequest contains request-information about Stripe-payments.
public struct Payments_StripePaymentRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var paymentMethodID: String = String()

  public var paymentIntentID: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// StripePaymentResponse contains response-information about Stripe-payments.
public struct Payments_StripePaymentResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var clientSecret: String = String()

  public var stripeAccount: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// StripeCardRequest contains request-information about Stripe-cards.
public struct Payments_StripeCardRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var paymentMethodID: String = String()

  public var setupIntentID: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// StripeCardResponse contains response-information about Stripe-cards.
public struct Payments_StripeCardResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var clientSecret: String = String()

  public var paymentMethodID: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Payments_StripePaymentRequest: @unchecked Sendable {}
extension Payments_StripePaymentResponse: @unchecked Sendable {}
extension Payments_StripeCardRequest: @unchecked Sendable {}
extension Payments_StripeCardResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "payments"

extension Payments_StripePaymentRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".StripePaymentRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "payment_method_id"),
    2: .standard(proto: "payment_intent_id"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.paymentMethodID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.paymentIntentID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.paymentMethodID.isEmpty {
      try visitor.visitSingularStringField(value: self.paymentMethodID, fieldNumber: 1)
    }
    if !self.paymentIntentID.isEmpty {
      try visitor.visitSingularStringField(value: self.paymentIntentID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Payments_StripePaymentRequest, rhs: Payments_StripePaymentRequest) -> Bool {
    if lhs.paymentMethodID != rhs.paymentMethodID {return false}
    if lhs.paymentIntentID != rhs.paymentIntentID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Payments_StripePaymentResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".StripePaymentResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "client_secret"),
    2: .standard(proto: "stripe_account"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.clientSecret) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.stripeAccount) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.clientSecret.isEmpty {
      try visitor.visitSingularStringField(value: self.clientSecret, fieldNumber: 1)
    }
    if !self.stripeAccount.isEmpty {
      try visitor.visitSingularStringField(value: self.stripeAccount, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Payments_StripePaymentResponse, rhs: Payments_StripePaymentResponse) -> Bool {
    if lhs.clientSecret != rhs.clientSecret {return false}
    if lhs.stripeAccount != rhs.stripeAccount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Payments_StripeCardRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".StripeCardRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "payment_method_id"),
    2: .standard(proto: "setup_intent_id"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.paymentMethodID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.setupIntentID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.paymentMethodID.isEmpty {
      try visitor.visitSingularStringField(value: self.paymentMethodID, fieldNumber: 1)
    }
    if !self.setupIntentID.isEmpty {
      try visitor.visitSingularStringField(value: self.setupIntentID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Payments_StripeCardRequest, rhs: Payments_StripeCardRequest) -> Bool {
    if lhs.paymentMethodID != rhs.paymentMethodID {return false}
    if lhs.setupIntentID != rhs.setupIntentID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Payments_StripeCardResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".StripeCardResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "client_secret"),
    2: .standard(proto: "payment_method_id"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.clientSecret) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.paymentMethodID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.clientSecret.isEmpty {
      try visitor.visitSingularStringField(value: self.clientSecret, fieldNumber: 1)
    }
    if !self.paymentMethodID.isEmpty {
      try visitor.visitSingularStringField(value: self.paymentMethodID, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Payments_StripeCardResponse, rhs: Payments_StripeCardResponse) -> Bool {
    if lhs.clientSecret != rhs.clientSecret {return false}
    if lhs.paymentMethodID != rhs.paymentMethodID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}