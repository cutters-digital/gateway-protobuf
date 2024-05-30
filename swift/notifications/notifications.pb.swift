// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: proto/notifications/notifications.proto
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

/// NotificationCategory contains all the known notification-categories that exist.
public enum Notifications_NotificationCategory: SwiftProtobuf.Enum {
  public typealias RawValue = Int

  /// Default value if not serializable.
  case invalid // = 0

  /// Used for advertisements.
  case advertisement // = 1

  /// Used for updates about your upcoming haircut.
  case currentHaircut // = 2

  /// Used for notifications about feedback on your completed haircut.
  case feedback // = 3
  case UNRECOGNIZED(Int)

  public init() {
    self = .invalid
  }

  public init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .invalid
    case 1: self = .advertisement
    case 2: self = .currentHaircut
    case 3: self = .feedback
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  public var rawValue: Int {
    switch self {
    case .invalid: return 0
    case .advertisement: return 1
    case .currentHaircut: return 2
    case .feedback: return 3
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Notifications_NotificationCategory: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  public static let allCases: [Notifications_NotificationCategory] = [
    .invalid,
    .advertisement,
    .currentHaircut,
    .feedback,
  ]
}

#endif  // swift(>=4.2)

/// NotificationPriority contains all the known notification-priorities that exist.
public enum Notifications_NotificationPriority: SwiftProtobuf.Enum {
  public typealias RawValue = Int

  /// Default value if not serializable. Should use default-value if it occurs.
  case invalid // = 0

  /// Used for default/low priority notifications.
  case `default` // = 1

  /// Used for high-priority notifications, such as important queue-changes, or messages from hairdressers.
  case high // = 2
  case UNRECOGNIZED(Int)

  public init() {
    self = .invalid
  }

  public init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .invalid
    case 1: self = .default
    case 2: self = .high
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  public var rawValue: Int {
    switch self {
    case .invalid: return 0
    case .default: return 1
    case .high: return 2
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Notifications_NotificationPriority: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  public static let allCases: [Notifications_NotificationPriority] = [
    .invalid,
    .default,
    .high,
  ]
}

#endif  // swift(>=4.2)

/// DialogButtonType declares a material-design style for a button.
public enum Notifications_DialogButtonType: SwiftProtobuf.Enum {
  public typealias RawValue = Int
  case invalid // = 0
  case negative // = 1
  case neutral // = 2
  case positive // = 3
  case UNRECOGNIZED(Int)

  public init() {
    self = .invalid
  }

  public init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .invalid
    case 1: self = .negative
    case 2: self = .neutral
    case 3: self = .positive
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  public var rawValue: Int {
    switch self {
    case .invalid: return 0
    case .negative: return 1
    case .neutral: return 2
    case .positive: return 3
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Notifications_DialogButtonType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  public static let allCases: [Notifications_DialogButtonType] = [
    .invalid,
    .negative,
    .neutral,
    .positive,
  ]
}

#endif  // swift(>=4.2)

/// InAppDisplayType declares the different in-app display-types for messages.
public enum Notifications_InAppDisplayType: SwiftProtobuf.Enum {
  public typealias RawValue = Int
  case invalid // = 0
  case none // = 1
  case dialog // = 2
  case snackbar // = 3
  case UNRECOGNIZED(Int)

  public init() {
    self = .invalid
  }

  public init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .invalid
    case 1: self = .none
    case 2: self = .dialog
    case 3: self = .snackbar
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  public var rawValue: Int {
    switch self {
    case .invalid: return 0
    case .none: return 1
    case .dialog: return 2
    case .snackbar: return 3
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Notifications_InAppDisplayType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  public static let allCases: [Notifications_InAppDisplayType] = [
    .invalid,
    .none,
    .dialog,
    .snackbar,
  ]
}

#endif  // swift(>=4.2)

/// Notification contains eveything to be able to send a notification to a user.
public struct Notifications_Notification {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Token is a FCM Registration-token.
  public var token: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// AppNotification describes what fields are available for push-messages from the gateway.
public struct Notifications_AppNotification {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// If this ID is reused, the previous notification should be replaced or removed.
  public var id: UInt32 {
    get {return _storage._id}
    set {_uniqueStorage()._id = newValue}
  }

  public var alert: Notifications_Alert {
    get {return _storage._alert ?? Notifications_Alert()}
    set {_uniqueStorage()._alert = newValue}
  }
  /// Returns true if `alert` has been explicitly set.
  public var hasAlert: Bool {return _storage._alert != nil}
  /// Clears the value of `alert`. Subsequent reads from it will return its default value.
  public mutating func clearAlert() {_uniqueStorage()._alert = nil}

  public var dialog: Notifications_Dialog {
    get {return _storage._dialog ?? Notifications_Dialog()}
    set {_uniqueStorage()._dialog = newValue}
  }
  /// Returns true if `dialog` has been explicitly set.
  public var hasDialog: Bool {return _storage._dialog != nil}
  /// Clears the value of `dialog`. Subsequent reads from it will return its default value.
  public mutating func clearDialog() {_uniqueStorage()._dialog = nil}

  public var snackbar: Notifications_Snackbar {
    get {return _storage._snackbar ?? Notifications_Snackbar()}
    set {_uniqueStorage()._snackbar = newValue}
  }
  /// Returns true if `snackbar` has been explicitly set.
  public var hasSnackbar: Bool {return _storage._snackbar != nil}
  /// Clears the value of `snackbar`. Subsequent reads from it will return its default value.
  public mutating func clearSnackbar() {_uniqueStorage()._snackbar = nil}

  /// If should_dismiss is true, the notification with the given ID should be dismissed.
  public var shouldDismiss: Bool {
    get {return _storage._shouldDismiss}
    set {_uniqueStorage()._shouldDismiss = newValue}
  }

  /// If alert_plus_in_app is true, AND the app is in the background, AND Alert is set, AND dialog/snackbar is set, AND the app goes to foreground (either by tapping notification or opening the app manually), the dialog/snackbar should be shown. Will only be used for VERY important messages.
  public var alertPlusInApp: Bool {
    get {return _storage._alertPlusInApp}
    set {_uniqueStorage()._alertPlusInApp = newValue}
  }

  /// Priority for the payload. Should be used wherever applicable (Notifcation/Queue).
  public var priority: Notifications_NotificationPriority {
    get {return _storage._priority}
    set {_uniqueStorage()._priority = newValue}
  }

  /// If this is set, the app should attempt to refresh the data/info (salons on map, current haircuts, profile, etc) that is currently displayed.
  public var shouldRefreshInfo: Bool {
    get {return _storage._shouldRefreshInfo}
    set {_uniqueStorage()._shouldRefreshInfo = newValue}
  }

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// Alert describes the fields available for showing a local notification/alert.
public struct Notifications_Alert {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var title: String = String()

  public var message: String = String()

  /// Category is used for grouping certain kinds of notifications together.
  public var category: Notifications_Category {
    get {return _category ?? Notifications_Category()}
    set {_category = newValue}
  }
  /// Returns true if `category` has been explicitly set.
  public var hasCategory: Bool {return self._category != nil}
  /// Clears the value of `category`. Subsequent reads from it will return its default value.
  public mutating func clearCategory() {self._category = nil}

  /// Default-action is the action that is run when the notification is tapped. If not set, it defaults to open the app.
  public var defaultAction: Notifications_NotificationAction {
    get {return _defaultAction ?? Notifications_NotificationAction()}
    set {_defaultAction = newValue}
  }
  /// Returns true if `defaultAction` has been explicitly set.
  public var hasDefaultAction: Bool {return self._defaultAction != nil}
  /// Clears the value of `defaultAction`. Subsequent reads from it will return its default value.
  public mutating func clearDefaultAction() {self._defaultAction = nil}

  /// Actions is a list of buttons that are available from the notification-drawer, and is optional.
  public var actions: [Notifications_NotificationAction] = []

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _category: Notifications_Category? = nil
  fileprivate var _defaultAction: Notifications_NotificationAction? = nil
}

/// Category defines a category of notification. It is also known as "Channel" on Android.
public struct Notifications_Category {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// ID is a non-localizable identifier of the category, e.g. "status_updates".
  public var id: String = String()

  /// Name is a localized human-readable name of the category, e.g. "Status updates" or "Statusoppdateringer".
  public var name: String = String()

  public var description_p: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// Dialog defines the fields available for showing a local dialog.
public struct Notifications_Dialog {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var title: String = String()

  public var message: String = String()

  /// Actions is an optional list of dialog-actions. If empty, a default dismiss-button should be used. If not empty, the list should be used.
  public var actions: [Notifications_DialogAction] = []

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// Snackbar defines the fields available for showing a local snackbar.
public struct Notifications_Snackbar {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var message: String = String()

  /// Action is optional. Default is to use system-default dismiss timer or dismiss on tap.
  public var action: Notifications_SnackbarAction {
    get {return _action ?? Notifications_SnackbarAction()}
    set {_action = newValue}
  }
  /// Returns true if `action` has been explicitly set.
  public var hasAction: Bool {return self._action != nil}
  /// Clears the value of `action`. Subsequent reads from it will return its default value.
  public mutating func clearAction() {self._action = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _action: Notifications_SnackbarAction? = nil
}

/// NotificationAction defines the fields that an action on a Notification can have.
public struct Notifications_NotificationAction {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var title: String = String()

  /// URL is optional. Default is to open the app.
  public var url: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// DialogAction defines the fields that an action on a Dialog can have.
public struct Notifications_DialogAction {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var title: String = String()

  /// URL is optional. Default is to dismiss dialog.
  public var url: String = String()

  /// Button-type is used in accordance to Material Design.
  public var buttonType: Notifications_DialogButtonType = .invalid

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

/// SnackbarAction defines the fields that an action on a Snackbar can have.
public struct Notifications_SnackbarAction {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var title: String = String()

  /// URL is optional. Default is to dismiss snackbar.
  public var url: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Notifications_NotificationCategory: @unchecked Sendable {}
extension Notifications_NotificationPriority: @unchecked Sendable {}
extension Notifications_DialogButtonType: @unchecked Sendable {}
extension Notifications_InAppDisplayType: @unchecked Sendable {}
extension Notifications_Notification: @unchecked Sendable {}
extension Notifications_AppNotification: @unchecked Sendable {}
extension Notifications_Alert: @unchecked Sendable {}
extension Notifications_Category: @unchecked Sendable {}
extension Notifications_Dialog: @unchecked Sendable {}
extension Notifications_Snackbar: @unchecked Sendable {}
extension Notifications_NotificationAction: @unchecked Sendable {}
extension Notifications_DialogAction: @unchecked Sendable {}
extension Notifications_SnackbarAction: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "notifications"

extension Notifications_NotificationCategory: SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "NOTIFICATION_CATEGORY_INVALID"),
    1: .same(proto: "NOTIFICATION_CATEGORY_ADVERTISEMENT"),
    2: .same(proto: "NOTIFICATION_CATEGORY_CURRENT_HAIRCUT"),
    3: .same(proto: "NOTIFICATION_CATEGORY_FEEDBACK"),
  ]
}

extension Notifications_NotificationPriority: SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "NOTIFICATION_PRIORITY_INVALID"),
    1: .same(proto: "NOTIFICATION_PRIORITY_DEFAULT"),
    2: .same(proto: "NOTIFICATION_PRIORITY_HIGH"),
  ]
}

extension Notifications_DialogButtonType: SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "DIALOG_BUTTON_TYPE_INVALID"),
    1: .same(proto: "DIALOG_BUTTON_TYPE_NEGATIVE"),
    2: .same(proto: "DIALOG_BUTTON_TYPE_NEUTRAL"),
    3: .same(proto: "DIALOG_BUTTON_TYPE_POSITIVE"),
  ]
}

extension Notifications_InAppDisplayType: SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "IN_APP_DISPLAY_TYPE_INVALID"),
    1: .same(proto: "IN_APP_DISPLAY_TYPE_NONE"),
    2: .same(proto: "IN_APP_DISPLAY_TYPE_DIALOG"),
    3: .same(proto: "IN_APP_DISPLAY_TYPE_SNACKBAR"),
  ]
}

extension Notifications_Notification: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Notification"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "token"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.token) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.token.isEmpty {
      try visitor.visitSingularStringField(value: self.token, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Notifications_Notification, rhs: Notifications_Notification) -> Bool {
    if lhs.token != rhs.token {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Notifications_AppNotification: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".AppNotification"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "alert"),
    3: .same(proto: "dialog"),
    4: .same(proto: "snackbar"),
    5: .standard(proto: "should_dismiss"),
    6: .standard(proto: "alert_plus_in_app"),
    8: .same(proto: "priority"),
    9: .standard(proto: "should_refresh_info"),
  ]

  fileprivate class _StorageClass {
    var _id: UInt32 = 0
    var _alert: Notifications_Alert? = nil
    var _dialog: Notifications_Dialog? = nil
    var _snackbar: Notifications_Snackbar? = nil
    var _shouldDismiss: Bool = false
    var _alertPlusInApp: Bool = false
    var _priority: Notifications_NotificationPriority = .invalid
    var _shouldRefreshInfo: Bool = false

    #if swift(>=5.10)
      // This property is used as the initial default value for new instances of the type.
      // The type itself is protecting the reference to its storage via CoW semantics.
      // This will force a copy to be made of this reference when the first mutation occurs;
      // hence, it is safe to mark this as `nonisolated(unsafe)`.
      static nonisolated(unsafe) let defaultInstance = _StorageClass()
    #else
      static let defaultInstance = _StorageClass()
    #endif

    private init() {}

    init(copying source: _StorageClass) {
      _id = source._id
      _alert = source._alert
      _dialog = source._dialog
      _snackbar = source._snackbar
      _shouldDismiss = source._shouldDismiss
      _alertPlusInApp = source._alertPlusInApp
      _priority = source._priority
      _shouldRefreshInfo = source._shouldRefreshInfo
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeSingularUInt32Field(value: &_storage._id) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._alert) }()
        case 3: try { try decoder.decodeSingularMessageField(value: &_storage._dialog) }()
        case 4: try { try decoder.decodeSingularMessageField(value: &_storage._snackbar) }()
        case 5: try { try decoder.decodeSingularBoolField(value: &_storage._shouldDismiss) }()
        case 6: try { try decoder.decodeSingularBoolField(value: &_storage._alertPlusInApp) }()
        case 8: try { try decoder.decodeSingularEnumField(value: &_storage._priority) }()
        case 9: try { try decoder.decodeSingularBoolField(value: &_storage._shouldRefreshInfo) }()
        default: break
        }
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every if/case branch local when no optimizations
      // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
      // https://github.com/apple/swift-protobuf/issues/1182
      if _storage._id != 0 {
        try visitor.visitSingularUInt32Field(value: _storage._id, fieldNumber: 1)
      }
      try { if let v = _storage._alert {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      try { if let v = _storage._dialog {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      } }()
      try { if let v = _storage._snackbar {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      } }()
      if _storage._shouldDismiss != false {
        try visitor.visitSingularBoolField(value: _storage._shouldDismiss, fieldNumber: 5)
      }
      if _storage._alertPlusInApp != false {
        try visitor.visitSingularBoolField(value: _storage._alertPlusInApp, fieldNumber: 6)
      }
      if _storage._priority != .invalid {
        try visitor.visitSingularEnumField(value: _storage._priority, fieldNumber: 8)
      }
      if _storage._shouldRefreshInfo != false {
        try visitor.visitSingularBoolField(value: _storage._shouldRefreshInfo, fieldNumber: 9)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Notifications_AppNotification, rhs: Notifications_AppNotification) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._id != rhs_storage._id {return false}
        if _storage._alert != rhs_storage._alert {return false}
        if _storage._dialog != rhs_storage._dialog {return false}
        if _storage._snackbar != rhs_storage._snackbar {return false}
        if _storage._shouldDismiss != rhs_storage._shouldDismiss {return false}
        if _storage._alertPlusInApp != rhs_storage._alertPlusInApp {return false}
        if _storage._priority != rhs_storage._priority {return false}
        if _storage._shouldRefreshInfo != rhs_storage._shouldRefreshInfo {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Notifications_Alert: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Alert"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "message"),
    3: .same(proto: "category"),
    4: .standard(proto: "default_action"),
    5: .same(proto: "actions"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.message) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._category) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._defaultAction) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.actions) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.message.isEmpty {
      try visitor.visitSingularStringField(value: self.message, fieldNumber: 2)
    }
    try { if let v = self._category {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._defaultAction {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if !self.actions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.actions, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Notifications_Alert, rhs: Notifications_Alert) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.message != rhs.message {return false}
    if lhs._category != rhs._category {return false}
    if lhs._defaultAction != rhs._defaultAction {return false}
    if lhs.actions != rhs.actions {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Notifications_Category: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Category"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "name"),
    3: .same(proto: "description"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Notifications_Category, rhs: Notifications_Category) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.name != rhs.name {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Notifications_Dialog: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Dialog"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "message"),
    3: .same(proto: "actions"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.message) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.actions) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.message.isEmpty {
      try visitor.visitSingularStringField(value: self.message, fieldNumber: 2)
    }
    if !self.actions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.actions, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Notifications_Dialog, rhs: Notifications_Dialog) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.message != rhs.message {return false}
    if lhs.actions != rhs.actions {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Notifications_Snackbar: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Snackbar"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "message"),
    2: .same(proto: "action"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.message) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._action) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.message.isEmpty {
      try visitor.visitSingularStringField(value: self.message, fieldNumber: 1)
    }
    try { if let v = self._action {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Notifications_Snackbar, rhs: Notifications_Snackbar) -> Bool {
    if lhs.message != rhs.message {return false}
    if lhs._action != rhs._action {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Notifications_NotificationAction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".NotificationAction"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "url"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.url) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.url.isEmpty {
      try visitor.visitSingularStringField(value: self.url, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Notifications_NotificationAction, rhs: Notifications_NotificationAction) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.url != rhs.url {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Notifications_DialogAction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".DialogAction"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "url"),
    3: .standard(proto: "button_type"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.url) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.buttonType) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.url.isEmpty {
      try visitor.visitSingularStringField(value: self.url, fieldNumber: 2)
    }
    if self.buttonType != .invalid {
      try visitor.visitSingularEnumField(value: self.buttonType, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Notifications_DialogAction, rhs: Notifications_DialogAction) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.url != rhs.url {return false}
    if lhs.buttonType != rhs.buttonType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Notifications_SnackbarAction: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".SnackbarAction"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "url"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.url) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.url.isEmpty {
      try visitor.visitSingularStringField(value: self.url, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Notifications_SnackbarAction, rhs: Notifications_SnackbarAction) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.url != rhs.url {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
