// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        v4.25.1
// source: proto/rest/rest_api.proto

package restpb

import (
	authpb "github.com/cutters-digital/gateway-protobuf/golang/authpb"
	notificationspb "github.com/cutters-digital/gateway-protobuf/golang/notificationspb"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// NotificationType contains all the possible notification-types that can be sent.
type NotificationType int32

const (
	NotificationType_NOTIFICATION_TYPE_INVALID           NotificationType = 0
	NotificationType_NOTIFICATION_TYPE_WAITWHILE_SUCCESS NotificationType = 1
)

// Enum value maps for NotificationType.
var (
	NotificationType_name = map[int32]string{
		0: "NOTIFICATION_TYPE_INVALID",
		1: "NOTIFICATION_TYPE_WAITWHILE_SUCCESS",
	}
	NotificationType_value = map[string]int32{
		"NOTIFICATION_TYPE_INVALID":           0,
		"NOTIFICATION_TYPE_WAITWHILE_SUCCESS": 1,
	}
)

func (x NotificationType) Enum() *NotificationType {
	p := new(NotificationType)
	*p = x
	return p
}

func (x NotificationType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (NotificationType) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_rest_rest_api_proto_enumTypes[0].Descriptor()
}

func (NotificationType) Type() protoreflect.EnumType {
	return &file_proto_rest_rest_api_proto_enumTypes[0]
}

func (x NotificationType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use NotificationType.Descriptor instead.
func (NotificationType) EnumDescriptor() ([]byte, []int) {
	return file_proto_rest_rest_api_proto_rawDescGZIP(), []int{0}
}

// VoucherNotificationType contains all the possible notification-types that can be sent.
type VoucherNotificationType int32

const (
	VoucherNotificationType_VOUCHER_NOTIFICATION_TYPE_INVALID          VoucherNotificationType = 0
	VoucherNotificationType_VOUCHER_NOTIFICATION_TYPE_REFERRED_FRIENDS VoucherNotificationType = 1
)

// Enum value maps for VoucherNotificationType.
var (
	VoucherNotificationType_name = map[int32]string{
		0: "VOUCHER_NOTIFICATION_TYPE_INVALID",
		1: "VOUCHER_NOTIFICATION_TYPE_REFERRED_FRIENDS",
	}
	VoucherNotificationType_value = map[string]int32{
		"VOUCHER_NOTIFICATION_TYPE_INVALID":          0,
		"VOUCHER_NOTIFICATION_TYPE_REFERRED_FRIENDS": 1,
	}
)

func (x VoucherNotificationType) Enum() *VoucherNotificationType {
	p := new(VoucherNotificationType)
	*p = x
	return p
}

func (x VoucherNotificationType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (VoucherNotificationType) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_rest_rest_api_proto_enumTypes[1].Descriptor()
}

func (VoucherNotificationType) Type() protoreflect.EnumType {
	return &file_proto_rest_rest_api_proto_enumTypes[1]
}

func (x VoucherNotificationType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use VoucherNotificationType.Descriptor instead.
func (VoucherNotificationType) EnumDescriptor() ([]byte, []int) {
	return file_proto_rest_rest_api_proto_rawDescGZIP(), []int{1}
}

type NotificationRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required server-authentication.
	Auth *authpb.Authentication `protobuf:"bytes,1,opt,name=auth,proto3" json:"auth,omitempty"`
	// The recipient of the notification.
	CustomerId string `protobuf:"bytes,2,opt,name=customer_id,json=customerId,proto3" json:"customer_id,omitempty"`
	// The notification payload.
	AppNotification *notificationspb.AppNotification `protobuf:"bytes,3,opt,name=app_notification,json=appNotification,proto3" json:"app_notification,omitempty"`
}

func (x *NotificationRequest) Reset() {
	*x = NotificationRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_rest_rest_api_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NotificationRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NotificationRequest) ProtoMessage() {}

func (x *NotificationRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_rest_rest_api_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NotificationRequest.ProtoReflect.Descriptor instead.
func (*NotificationRequest) Descriptor() ([]byte, []int) {
	return file_proto_rest_rest_api_proto_rawDescGZIP(), []int{0}
}

func (x *NotificationRequest) GetAuth() *authpb.Authentication {
	if x != nil {
		return x.Auth
	}
	return nil
}

func (x *NotificationRequest) GetCustomerId() string {
	if x != nil {
		return x.CustomerId
	}
	return ""
}

func (x *NotificationRequest) GetAppNotification() *notificationspb.AppNotification {
	if x != nil {
		return x.AppNotification
	}
	return nil
}

type NotificationResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Message string `protobuf:"bytes,1,opt,name=message,proto3" json:"message,omitempty"`
}

func (x *NotificationResponse) Reset() {
	*x = NotificationResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_rest_rest_api_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NotificationResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NotificationResponse) ProtoMessage() {}

func (x *NotificationResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_rest_rest_api_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NotificationResponse.ProtoReflect.Descriptor instead.
func (*NotificationResponse) Descriptor() ([]byte, []int) {
	return file_proto_rest_rest_api_proto_rawDescGZIP(), []int{1}
}

func (x *NotificationResponse) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

type UpdateServiceRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required server-authentication.
	Auth *authpb.Authentication `protobuf:"bytes,1,opt,name=auth,proto3" json:"auth,omitempty"`
	// The service to check for updates on.
	Service *ServiceUpdate `protobuf:"bytes,2,opt,name=service,proto3" json:"service,omitempty"`
}

func (x *UpdateServiceRequest) Reset() {
	*x = UpdateServiceRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_rest_rest_api_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateServiceRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateServiceRequest) ProtoMessage() {}

func (x *UpdateServiceRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_rest_rest_api_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateServiceRequest.ProtoReflect.Descriptor instead.
func (*UpdateServiceRequest) Descriptor() ([]byte, []int) {
	return file_proto_rest_rest_api_proto_rawDescGZIP(), []int{2}
}

func (x *UpdateServiceRequest) GetAuth() *authpb.Authentication {
	if x != nil {
		return x.Auth
	}
	return nil
}

func (x *UpdateServiceRequest) GetService() *ServiceUpdate {
	if x != nil {
		return x.Service
	}
	return nil
}

type UpdateServiceResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Message string `protobuf:"bytes,1,opt,name=message,proto3" json:"message,omitempty"`
}

func (x *UpdateServiceResponse) Reset() {
	*x = UpdateServiceResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_rest_rest_api_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateServiceResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateServiceResponse) ProtoMessage() {}

func (x *UpdateServiceResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_rest_rest_api_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateServiceResponse.ProtoReflect.Descriptor instead.
func (*UpdateServiceResponse) Descriptor() ([]byte, []int) {
	return file_proto_rest_rest_api_proto_rawDescGZIP(), []int{3}
}

func (x *UpdateServiceResponse) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

type VoucherNotificationRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required server-authentication.
	Auth *authpb.Authentication `protobuf:"bytes,1,opt,name=auth,proto3" json:"auth,omitempty"`
	// An ID for idempotency.
	EventId string `protobuf:"bytes,2,opt,name=event_id,json=eventId,proto3" json:"event_id,omitempty"`
	// The country-code and phone-number for the recipient, prefixed with "+", e.g.: "+4712345678".
	PhoneNumber string `protobuf:"bytes,3,opt,name=phone_number,json=phoneNumber,proto3" json:"phone_number,omitempty"`
	// The type of notification to send out.
	VoucherNotificationType VoucherNotificationType `protobuf:"varint,4,opt,name=voucher_notification_type,json=voucherNotificationType,proto3,enum=rest.VoucherNotificationType" json:"voucher_notification_type,omitempty"`
}

func (x *VoucherNotificationRequest) Reset() {
	*x = VoucherNotificationRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_rest_rest_api_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VoucherNotificationRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VoucherNotificationRequest) ProtoMessage() {}

func (x *VoucherNotificationRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_rest_rest_api_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use VoucherNotificationRequest.ProtoReflect.Descriptor instead.
func (*VoucherNotificationRequest) Descriptor() ([]byte, []int) {
	return file_proto_rest_rest_api_proto_rawDescGZIP(), []int{4}
}

func (x *VoucherNotificationRequest) GetAuth() *authpb.Authentication {
	if x != nil {
		return x.Auth
	}
	return nil
}

func (x *VoucherNotificationRequest) GetEventId() string {
	if x != nil {
		return x.EventId
	}
	return ""
}

func (x *VoucherNotificationRequest) GetPhoneNumber() string {
	if x != nil {
		return x.PhoneNumber
	}
	return ""
}

func (x *VoucherNotificationRequest) GetVoucherNotificationType() VoucherNotificationType {
	if x != nil {
		return x.VoucherNotificationType
	}
	return VoucherNotificationType_VOUCHER_NOTIFICATION_TYPE_INVALID
}

type VoucherNotificationResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Message string `protobuf:"bytes,1,opt,name=message,proto3" json:"message,omitempty"`
}

func (x *VoucherNotificationResponse) Reset() {
	*x = VoucherNotificationResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_rest_rest_api_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VoucherNotificationResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VoucherNotificationResponse) ProtoMessage() {}

func (x *VoucherNotificationResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_rest_rest_api_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use VoucherNotificationResponse.ProtoReflect.Descriptor instead.
func (*VoucherNotificationResponse) Descriptor() ([]byte, []int) {
	return file_proto_rest_rest_api_proto_rawDescGZIP(), []int{5}
}

func (x *VoucherNotificationResponse) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

// ServiceUpdate defines the required fields to keep a customer updated on his service-purchase.
type ServiceUpdate struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Required transaction-id.
	TransactionId string `protobuf:"bytes,1,opt,name=transaction_id,json=transactionId,proto3" json:"transaction_id,omitempty"`
	// Required customer-id.
	CustomerId string `protobuf:"bytes,2,opt,name=customer_id,json=customerId,proto3" json:"customer_id,omitempty"`
}

func (x *ServiceUpdate) Reset() {
	*x = ServiceUpdate{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_rest_rest_api_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ServiceUpdate) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ServiceUpdate) ProtoMessage() {}

func (x *ServiceUpdate) ProtoReflect() protoreflect.Message {
	mi := &file_proto_rest_rest_api_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ServiceUpdate.ProtoReflect.Descriptor instead.
func (*ServiceUpdate) Descriptor() ([]byte, []int) {
	return file_proto_rest_rest_api_proto_rawDescGZIP(), []int{6}
}

func (x *ServiceUpdate) GetTransactionId() string {
	if x != nil {
		return x.TransactionId
	}
	return ""
}

func (x *ServiceUpdate) GetCustomerId() string {
	if x != nil {
		return x.CustomerId
	}
	return ""
}

var File_proto_rest_rest_api_proto protoreflect.FileDescriptor

var file_proto_rest_rest_api_proto_rawDesc = []byte{
	0x0a, 0x19, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x72, 0x65, 0x73, 0x74, 0x2f, 0x72, 0x65, 0x73,
	0x74, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x04, 0x72, 0x65, 0x73,
	0x74, 0x1a, 0x15, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x61, 0x75, 0x74, 0x68, 0x2f, 0x61, 0x75,
	0x74, 0x68, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x27, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x6e, 0x6f,
	0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0xab, 0x01, 0x0a, 0x13, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x28, 0x0a, 0x04, 0x61, 0x75, 0x74,
	0x68, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x61, 0x75, 0x74, 0x68, 0x2e, 0x41,
	0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x04, 0x61,
	0x75, 0x74, 0x68, 0x12, 0x1f, 0x0a, 0x0b, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x5f,
	0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x63, 0x75, 0x73, 0x74, 0x6f, 0x6d,
	0x65, 0x72, 0x49, 0x64, 0x12, 0x49, 0x0a, 0x10, 0x61, 0x70, 0x70, 0x5f, 0x6e, 0x6f, 0x74, 0x69,
	0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1e,
	0x2e, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x41,
	0x70, 0x70, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0f,
	0x61, 0x70, 0x70, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x22,
	0x30, 0x0a, 0x14, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61,
	0x67, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67,
	0x65, 0x22, 0x6f, 0x0a, 0x14, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x28, 0x0a, 0x04, 0x61, 0x75, 0x74,
	0x68, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x61, 0x75, 0x74, 0x68, 0x2e, 0x41,
	0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x04, 0x61,
	0x75, 0x74, 0x68, 0x12, 0x2d, 0x0a, 0x07, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x72, 0x65, 0x73, 0x74, 0x2e, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x52, 0x07, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x22, 0x31, 0x0a, 0x15, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x6d,
	0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x6d, 0x65,
	0x73, 0x73, 0x61, 0x67, 0x65, 0x22, 0xdf, 0x01, 0x0a, 0x1a, 0x56, 0x6f, 0x75, 0x63, 0x68, 0x65,
	0x72, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x28, 0x0a, 0x04, 0x61, 0x75, 0x74, 0x68, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x14, 0x2e, 0x61, 0x75, 0x74, 0x68, 0x2e, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e,
	0x74, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x04, 0x61, 0x75, 0x74, 0x68, 0x12, 0x19,
	0x0a, 0x08, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x07, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x49, 0x64, 0x12, 0x21, 0x0a, 0x0c, 0x70, 0x68, 0x6f,
	0x6e, 0x65, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0b, 0x70, 0x68, 0x6f, 0x6e, 0x65, 0x4e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x12, 0x59, 0x0a, 0x19,
	0x76, 0x6f, 0x75, 0x63, 0x68, 0x65, 0x72, 0x5f, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0e, 0x32,
	0x1d, 0x2e, 0x72, 0x65, 0x73, 0x74, 0x2e, 0x56, 0x6f, 0x75, 0x63, 0x68, 0x65, 0x72, 0x4e, 0x6f,
	0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x52, 0x17,
	0x76, 0x6f, 0x75, 0x63, 0x68, 0x65, 0x72, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x22, 0x37, 0x0a, 0x1b, 0x56, 0x6f, 0x75, 0x63, 0x68,
	0x65, 0x72, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65,
	0x22, 0x57, 0x0a, 0x0d, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x55, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x12, 0x25, 0x0a, 0x0e, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x74, 0x72, 0x61, 0x6e, 0x73,
	0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x12, 0x1f, 0x0a, 0x0b, 0x63, 0x75, 0x73, 0x74,
	0x6f, 0x6d, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x63,
	0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x49, 0x64, 0x2a, 0x5a, 0x0a, 0x10, 0x4e, 0x6f, 0x74,
	0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1d, 0x0a,
	0x19, 0x4e, 0x4f, 0x54, 0x49, 0x46, 0x49, 0x43, 0x41, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x54, 0x59,
	0x50, 0x45, 0x5f, 0x49, 0x4e, 0x56, 0x41, 0x4c, 0x49, 0x44, 0x10, 0x00, 0x12, 0x27, 0x0a, 0x23,
	0x4e, 0x4f, 0x54, 0x49, 0x46, 0x49, 0x43, 0x41, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x54, 0x59, 0x50,
	0x45, 0x5f, 0x57, 0x41, 0x49, 0x54, 0x57, 0x48, 0x49, 0x4c, 0x45, 0x5f, 0x53, 0x55, 0x43, 0x43,
	0x45, 0x53, 0x53, 0x10, 0x01, 0x2a, 0x70, 0x0a, 0x17, 0x56, 0x6f, 0x75, 0x63, 0x68, 0x65, 0x72,
	0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x54, 0x79, 0x70, 0x65,
	0x12, 0x25, 0x0a, 0x21, 0x56, 0x4f, 0x55, 0x43, 0x48, 0x45, 0x52, 0x5f, 0x4e, 0x4f, 0x54, 0x49,
	0x46, 0x49, 0x43, 0x41, 0x54, 0x49, 0x4f, 0x4e, 0x5f, 0x54, 0x59, 0x50, 0x45, 0x5f, 0x49, 0x4e,
	0x56, 0x41, 0x4c, 0x49, 0x44, 0x10, 0x00, 0x12, 0x2e, 0x0a, 0x2a, 0x56, 0x4f, 0x55, 0x43, 0x48,
	0x45, 0x52, 0x5f, 0x4e, 0x4f, 0x54, 0x49, 0x46, 0x49, 0x43, 0x41, 0x54, 0x49, 0x4f, 0x4e, 0x5f,
	0x54, 0x59, 0x50, 0x45, 0x5f, 0x52, 0x45, 0x46, 0x45, 0x52, 0x52, 0x45, 0x44, 0x5f, 0x46, 0x52,
	0x49, 0x45, 0x4e, 0x44, 0x53, 0x10, 0x01, 0x32, 0xf6, 0x01, 0x0a, 0x07, 0x52, 0x65, 0x73, 0x74,
	0x41, 0x50, 0x49, 0x12, 0x45, 0x0a, 0x0c, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x12, 0x19, 0x2e, 0x72, 0x65, 0x73, 0x74, 0x2e, 0x4e, 0x6f, 0x74, 0x69, 0x66,
	0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1a,
	0x2e, 0x72, 0x65, 0x73, 0x74, 0x2e, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x48, 0x0a, 0x0d, 0x55, 0x70,
	0x64, 0x61, 0x74, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x1a, 0x2e, 0x72, 0x65,
	0x73, 0x74, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1b, 0x2e, 0x72, 0x65, 0x73, 0x74, 0x2e, 0x55,
	0x70, 0x64, 0x61, 0x74, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x5a, 0x0a, 0x13, 0x56, 0x6f, 0x75, 0x63, 0x68, 0x65, 0x72, 0x4e,
	0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x20, 0x2e, 0x72, 0x65,
	0x73, 0x74, 0x2e, 0x56, 0x6f, 0x75, 0x63, 0x68, 0x65, 0x72, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69,
	0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x21, 0x2e,
	0x72, 0x65, 0x73, 0x74, 0x2e, 0x56, 0x6f, 0x75, 0x63, 0x68, 0x65, 0x72, 0x4e, 0x6f, 0x74, 0x69,
	0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x42, 0x3b, 0x5a, 0x39, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63,
	0x75, 0x74, 0x74, 0x65, 0x72, 0x73, 0x2d, 0x64, 0x69, 0x67, 0x69, 0x74, 0x61, 0x6c, 0x2f, 0x67,
	0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f,
	0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x72, 0x65, 0x73, 0x74, 0x70, 0x62, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_rest_rest_api_proto_rawDescOnce sync.Once
	file_proto_rest_rest_api_proto_rawDescData = file_proto_rest_rest_api_proto_rawDesc
)

func file_proto_rest_rest_api_proto_rawDescGZIP() []byte {
	file_proto_rest_rest_api_proto_rawDescOnce.Do(func() {
		file_proto_rest_rest_api_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_rest_rest_api_proto_rawDescData)
	})
	return file_proto_rest_rest_api_proto_rawDescData
}

var file_proto_rest_rest_api_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_proto_rest_rest_api_proto_msgTypes = make([]protoimpl.MessageInfo, 7)
var file_proto_rest_rest_api_proto_goTypes = []interface{}{
	(NotificationType)(0),                   // 0: rest.NotificationType
	(VoucherNotificationType)(0),            // 1: rest.VoucherNotificationType
	(*NotificationRequest)(nil),             // 2: rest.NotificationRequest
	(*NotificationResponse)(nil),            // 3: rest.NotificationResponse
	(*UpdateServiceRequest)(nil),            // 4: rest.UpdateServiceRequest
	(*UpdateServiceResponse)(nil),           // 5: rest.UpdateServiceResponse
	(*VoucherNotificationRequest)(nil),      // 6: rest.VoucherNotificationRequest
	(*VoucherNotificationResponse)(nil),     // 7: rest.VoucherNotificationResponse
	(*ServiceUpdate)(nil),                   // 8: rest.ServiceUpdate
	(*authpb.Authentication)(nil),           // 9: auth.Authentication
	(*notificationspb.AppNotification)(nil), // 10: notifications.AppNotification
}
var file_proto_rest_rest_api_proto_depIdxs = []int32{
	9,  // 0: rest.NotificationRequest.auth:type_name -> auth.Authentication
	10, // 1: rest.NotificationRequest.app_notification:type_name -> notifications.AppNotification
	9,  // 2: rest.UpdateServiceRequest.auth:type_name -> auth.Authentication
	8,  // 3: rest.UpdateServiceRequest.service:type_name -> rest.ServiceUpdate
	9,  // 4: rest.VoucherNotificationRequest.auth:type_name -> auth.Authentication
	1,  // 5: rest.VoucherNotificationRequest.voucher_notification_type:type_name -> rest.VoucherNotificationType
	2,  // 6: rest.RestAPI.Notification:input_type -> rest.NotificationRequest
	4,  // 7: rest.RestAPI.UpdateService:input_type -> rest.UpdateServiceRequest
	6,  // 8: rest.RestAPI.VoucherNotification:input_type -> rest.VoucherNotificationRequest
	3,  // 9: rest.RestAPI.Notification:output_type -> rest.NotificationResponse
	5,  // 10: rest.RestAPI.UpdateService:output_type -> rest.UpdateServiceResponse
	7,  // 11: rest.RestAPI.VoucherNotification:output_type -> rest.VoucherNotificationResponse
	9,  // [9:12] is the sub-list for method output_type
	6,  // [6:9] is the sub-list for method input_type
	6,  // [6:6] is the sub-list for extension type_name
	6,  // [6:6] is the sub-list for extension extendee
	0,  // [0:6] is the sub-list for field type_name
}

func init() { file_proto_rest_rest_api_proto_init() }
func file_proto_rest_rest_api_proto_init() {
	if File_proto_rest_rest_api_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_rest_rest_api_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NotificationRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_rest_rest_api_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NotificationResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_rest_rest_api_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateServiceRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_rest_rest_api_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateServiceResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_rest_rest_api_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*VoucherNotificationRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_rest_rest_api_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*VoucherNotificationResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_rest_rest_api_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ServiceUpdate); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_rest_rest_api_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   7,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_rest_rest_api_proto_goTypes,
		DependencyIndexes: file_proto_rest_rest_api_proto_depIdxs,
		EnumInfos:         file_proto_rest_rest_api_proto_enumTypes,
		MessageInfos:      file_proto_rest_rest_api_proto_msgTypes,
	}.Build()
	File_proto_rest_rest_api_proto = out.File
	file_proto_rest_rest_api_proto_rawDesc = nil
	file_proto_rest_rest_api_proto_goTypes = nil
	file_proto_rest_rest_api_proto_depIdxs = nil
}
