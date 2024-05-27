// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        v4.25.1
// source: proto/user/user_api.proto

package userpb

import (
	authpb "github.com/cutters-digital/gateway-protobuf/golang/authpb"
	notificationspb "github.com/cutters-digital/gateway-protobuf/golang/notificationspb"
	utilspb "github.com/cutters-digital/gateway-protobuf/golang/utilspb"
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

// Gender contains all genders, while allowing "OTHER" as a catch-all for those that don't fit into a non-binary gender-world.
type Gender int32

const (
	Gender_GENDER_INVALID Gender = 0
	Gender_GENDER_OTHER   Gender = 1
	Gender_GENDER_MALE    Gender = 2
	Gender_GENDER_FEMALE  Gender = 3
)

// Enum value maps for Gender.
var (
	Gender_name = map[int32]string{
		0: "GENDER_INVALID",
		1: "GENDER_OTHER",
		2: "GENDER_MALE",
		3: "GENDER_FEMALE",
	}
	Gender_value = map[string]int32{
		"GENDER_INVALID": 0,
		"GENDER_OTHER":   1,
		"GENDER_MALE":    2,
		"GENDER_FEMALE":  3,
	}
)

func (x Gender) Enum() *Gender {
	p := new(Gender)
	*p = x
	return p
}

func (x Gender) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Gender) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_user_user_api_proto_enumTypes[0].Descriptor()
}

func (Gender) Type() protoreflect.EnumType {
	return &file_proto_user_user_api_proto_enumTypes[0]
}

func (x Gender) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Gender.Descriptor instead.
func (Gender) EnumDescriptor() ([]byte, []int) {
	return file_proto_user_user_api_proto_rawDescGZIP(), []int{0}
}

type UserRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Auth *authpb.Authentication `protobuf:"bytes,1,opt,name=auth,proto3" json:"auth,omitempty"`
	User *User                  `protobuf:"bytes,2,opt,name=user,proto3" json:"user,omitempty"`
	// Setting error_on_not_found to true will cause the `GetUser` rpc to throw a NotFound error if the customer does not exist. This will be deprecated, aka default `true`, in a later version.
	//
	// Deprecated: Do not use.
	ErrorOnNotFound bool `protobuf:"varint,17,opt,name=error_on_not_found,json=errorOnNotFound,proto3" json:"error_on_not_found,omitempty"`
}

func (x *UserRequest) Reset() {
	*x = UserRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_user_user_api_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserRequest) ProtoMessage() {}

func (x *UserRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_user_user_api_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserRequest.ProtoReflect.Descriptor instead.
func (*UserRequest) Descriptor() ([]byte, []int) {
	return file_proto_user_user_api_proto_rawDescGZIP(), []int{0}
}

func (x *UserRequest) GetAuth() *authpb.Authentication {
	if x != nil {
		return x.Auth
	}
	return nil
}

func (x *UserRequest) GetUser() *User {
	if x != nil {
		return x.User
	}
	return nil
}

// Deprecated: Do not use.
func (x *UserRequest) GetErrorOnNotFound() bool {
	if x != nil {
		return x.ErrorOnNotFound
	}
	return false
}

type UserResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	User *User `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
}

func (x *UserResponse) Reset() {
	*x = UserResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_user_user_api_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserResponse) ProtoMessage() {}

func (x *UserResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_user_user_api_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserResponse.ProtoReflect.Descriptor instead.
func (*UserResponse) Descriptor() ([]byte, []int) {
	return file_proto_user_user_api_proto_rawDescGZIP(), []int{1}
}

func (x *UserResponse) GetUser() *User {
	if x != nil {
		return x.User
	}
	return nil
}

type UpdateUserNotificationRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Auth         *authpb.Authentication        `protobuf:"bytes,1,opt,name=auth,proto3" json:"auth,omitempty"`
	Notification *notificationspb.Notification `protobuf:"bytes,2,opt,name=notification,proto3" json:"notification,omitempty"`
}

func (x *UpdateUserNotificationRequest) Reset() {
	*x = UpdateUserNotificationRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_user_user_api_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateUserNotificationRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateUserNotificationRequest) ProtoMessage() {}

func (x *UpdateUserNotificationRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_user_user_api_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateUserNotificationRequest.ProtoReflect.Descriptor instead.
func (*UpdateUserNotificationRequest) Descriptor() ([]byte, []int) {
	return file_proto_user_user_api_proto_rawDescGZIP(), []int{2}
}

func (x *UpdateUserNotificationRequest) GetAuth() *authpb.Authentication {
	if x != nil {
		return x.Auth
	}
	return nil
}

func (x *UpdateUserNotificationRequest) GetNotification() *notificationspb.Notification {
	if x != nil {
		return x.Notification
	}
	return nil
}

type UpdateUserNotificationResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *UpdateUserNotificationResponse) Reset() {
	*x = UpdateUserNotificationResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_user_user_api_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateUserNotificationResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateUserNotificationResponse) ProtoMessage() {}

func (x *UpdateUserNotificationResponse) ProtoReflect() protoreflect.Message {
	mi := &file_proto_user_user_api_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateUserNotificationResponse.ProtoReflect.Descriptor instead.
func (*UpdateUserNotificationResponse) Descriptor() ([]byte, []int) {
	return file_proto_user_user_api_proto_rawDescGZIP(), []int{3}
}

// User contains all the personal details we know about the user.
type User struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Name = First-name. Required. Will be displayed on the monitors in the salon when purchasing a cut.
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	// Email. Required. Receipts will be sent to this email.
	Email            string `protobuf:"bytes,2,opt,name=email,proto3" json:"email,omitempty"`
	LocalePreference string `protobuf:"bytes,3,opt,name=locale_preference,json=localePreference,proto3" json:"locale_preference,omitempty"`
	// Phone number contains the country-code and phone-number, prefixed with "+", e.g.: "+4712345678". Will be ignored if supplied in a UserRequest.
	PhoneNumber string `protobuf:"bytes,4,opt,name=phone_number,json=phoneNumber,proto3" json:"phone_number,omitempty"`
	// Notification contains information about the Firebase Cloud Messaging token to send notifications to a user.
	Notification *notificationspb.Notification `protobuf:"bytes,5,opt,name=notification,proto3" json:"notification,omitempty"`
	// The birthday is given in seconds after Unix Epoch: https://en.wikipedia.org/wiki/Unix_time
	Birthday       *utilspb.Timestamp `protobuf:"bytes,6,opt,name=birthday,proto3" json:"birthday,omitempty"`
	Gender         Gender             `protobuf:"varint,7,opt,name=gender,proto3,enum=user.Gender" json:"gender,omitempty"`
	Address        string             `protobuf:"bytes,8,opt,name=address,proto3" json:"address,omitempty"`
	PostalCode     string             `protobuf:"bytes,9,opt,name=postal_code,json=postalCode,proto3" json:"postal_code,omitempty"`
	PostalPlace    string             `protobuf:"bytes,10,opt,name=postal_place,json=postalPlace,proto3" json:"postal_place,omitempty"`
	AllowMarketing bool               `protobuf:"varint,11,opt,name=allow_marketing,json=allowMarketing,proto3" json:"allow_marketing,omitempty"`
	// Last name is optional.
	LastName string `protobuf:"bytes,12,opt,name=last_name,json=lastName,proto3" json:"last_name,omitempty"`
	// Should be exclusive with birthday, with the full date taking priority: if birthdate set, birth_year should be ignored.
	BirthYear int32 `protobuf:"varint,13,opt,name=birth_year,json=birthYear,proto3" json:"birth_year,omitempty"`
}

func (x *User) Reset() {
	*x = User{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_user_user_api_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *User) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*User) ProtoMessage() {}

func (x *User) ProtoReflect() protoreflect.Message {
	mi := &file_proto_user_user_api_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use User.ProtoReflect.Descriptor instead.
func (*User) Descriptor() ([]byte, []int) {
	return file_proto_user_user_api_proto_rawDescGZIP(), []int{4}
}

func (x *User) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *User) GetEmail() string {
	if x != nil {
		return x.Email
	}
	return ""
}

func (x *User) GetLocalePreference() string {
	if x != nil {
		return x.LocalePreference
	}
	return ""
}

func (x *User) GetPhoneNumber() string {
	if x != nil {
		return x.PhoneNumber
	}
	return ""
}

func (x *User) GetNotification() *notificationspb.Notification {
	if x != nil {
		return x.Notification
	}
	return nil
}

func (x *User) GetBirthday() *utilspb.Timestamp {
	if x != nil {
		return x.Birthday
	}
	return nil
}

func (x *User) GetGender() Gender {
	if x != nil {
		return x.Gender
	}
	return Gender_GENDER_INVALID
}

func (x *User) GetAddress() string {
	if x != nil {
		return x.Address
	}
	return ""
}

func (x *User) GetPostalCode() string {
	if x != nil {
		return x.PostalCode
	}
	return ""
}

func (x *User) GetPostalPlace() string {
	if x != nil {
		return x.PostalPlace
	}
	return ""
}

func (x *User) GetAllowMarketing() bool {
	if x != nil {
		return x.AllowMarketing
	}
	return false
}

func (x *User) GetLastName() string {
	if x != nil {
		return x.LastName
	}
	return ""
}

func (x *User) GetBirthYear() int32 {
	if x != nil {
		return x.BirthYear
	}
	return 0
}

var File_proto_user_user_api_proto protoreflect.FileDescriptor

var file_proto_user_user_api_proto_rawDesc = []byte{
	0x0a, 0x19, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x2f, 0x75, 0x73, 0x65,
	0x72, 0x5f, 0x61, 0x70, 0x69, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x04, 0x75, 0x73, 0x65,
	0x72, 0x1a, 0x15, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x61, 0x75, 0x74, 0x68, 0x2f, 0x61, 0x75,
	0x74, 0x68, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x27, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x6e, 0x6f,
	0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1b, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x75, 0x74, 0x69, 0x6c, 0x73, 0x2f, 0x74,
	0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x88,
	0x01, 0x0a, 0x0b, 0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x28,
	0x0a, 0x04, 0x61, 0x75, 0x74, 0x68, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x61,
	0x75, 0x74, 0x68, 0x2e, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x52, 0x04, 0x61, 0x75, 0x74, 0x68, 0x12, 0x1e, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0a, 0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x55, 0x73,
	0x65, 0x72, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x2f, 0x0a, 0x12, 0x65, 0x72, 0x72, 0x6f,
	0x72, 0x5f, 0x6f, 0x6e, 0x5f, 0x6e, 0x6f, 0x74, 0x5f, 0x66, 0x6f, 0x75, 0x6e, 0x64, 0x18, 0x11,
	0x20, 0x01, 0x28, 0x08, 0x42, 0x02, 0x18, 0x01, 0x52, 0x0f, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x4f,
	0x6e, 0x4e, 0x6f, 0x74, 0x46, 0x6f, 0x75, 0x6e, 0x64, 0x22, 0x2e, 0x0a, 0x0c, 0x55, 0x73, 0x65,
	0x72, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x1e, 0x0a, 0x04, 0x75, 0x73, 0x65,
	0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0a, 0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x55,
	0x73, 0x65, 0x72, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x22, 0x8a, 0x01, 0x0a, 0x1d, 0x55, 0x70,
	0x64, 0x61, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x28, 0x0a, 0x04, 0x61,
	0x75, 0x74, 0x68, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x61, 0x75, 0x74, 0x68,
	0x2e, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52,
	0x04, 0x61, 0x75, 0x74, 0x68, 0x12, 0x3f, 0x0a, 0x0c, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x6e, 0x6f,
	0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x4e, 0x6f, 0x74, 0x69,
	0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0c, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69,
	0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x20, 0x0a, 0x1e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x55, 0x73, 0x65, 0x72, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0xd8, 0x03, 0x0a, 0x04, 0x55, 0x73, 0x65,
	0x72, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x12, 0x2b, 0x0a, 0x11, 0x6c,
	0x6f, 0x63, 0x61, 0x6c, 0x65, 0x5f, 0x70, 0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x10, 0x6c, 0x6f, 0x63, 0x61, 0x6c, 0x65, 0x50, 0x72,
	0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x12, 0x21, 0x0a, 0x0c, 0x70, 0x68, 0x6f, 0x6e,
	0x65, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b,
	0x70, 0x68, 0x6f, 0x6e, 0x65, 0x4e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x12, 0x3f, 0x0a, 0x0c, 0x6e,
	0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x05, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x1b, 0x2e, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x2e, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0c,
	0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x2c, 0x0a, 0x08,
	0x62, 0x69, 0x72, 0x74, 0x68, 0x64, 0x61, 0x79, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10,
	0x2e, 0x75, 0x74, 0x69, 0x6c, 0x73, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70,
	0x52, 0x08, 0x62, 0x69, 0x72, 0x74, 0x68, 0x64, 0x61, 0x79, 0x12, 0x24, 0x0a, 0x06, 0x67, 0x65,
	0x6e, 0x64, 0x65, 0x72, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x0c, 0x2e, 0x75, 0x73, 0x65,
	0x72, 0x2e, 0x47, 0x65, 0x6e, 0x64, 0x65, 0x72, 0x52, 0x06, 0x67, 0x65, 0x6e, 0x64, 0x65, 0x72,
	0x12, 0x18, 0x0a, 0x07, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x18, 0x08, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x07, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x12, 0x1f, 0x0a, 0x0b, 0x70, 0x6f,
	0x73, 0x74, 0x61, 0x6c, 0x5f, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0a, 0x70, 0x6f, 0x73, 0x74, 0x61, 0x6c, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x21, 0x0a, 0x0c, 0x70,
	0x6f, 0x73, 0x74, 0x61, 0x6c, 0x5f, 0x70, 0x6c, 0x61, 0x63, 0x65, 0x18, 0x0a, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0b, 0x70, 0x6f, 0x73, 0x74, 0x61, 0x6c, 0x50, 0x6c, 0x61, 0x63, 0x65, 0x12, 0x27,
	0x0a, 0x0f, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x5f, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x69, 0x6e,
	0x67, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0e, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x4d, 0x61,
	0x72, 0x6b, 0x65, 0x74, 0x69, 0x6e, 0x67, 0x12, 0x1b, 0x0a, 0x09, 0x6c, 0x61, 0x73, 0x74, 0x5f,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x6c, 0x61, 0x73, 0x74,
	0x4e, 0x61, 0x6d, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x62, 0x69, 0x72, 0x74, 0x68, 0x5f, 0x79, 0x65,
	0x61, 0x72, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x05, 0x52, 0x09, 0x62, 0x69, 0x72, 0x74, 0x68, 0x59,
	0x65, 0x61, 0x72, 0x2a, 0x52, 0x0a, 0x06, 0x47, 0x65, 0x6e, 0x64, 0x65, 0x72, 0x12, 0x12, 0x0a,
	0x0e, 0x47, 0x45, 0x4e, 0x44, 0x45, 0x52, 0x5f, 0x49, 0x4e, 0x56, 0x41, 0x4c, 0x49, 0x44, 0x10,
	0x00, 0x12, 0x10, 0x0a, 0x0c, 0x47, 0x45, 0x4e, 0x44, 0x45, 0x52, 0x5f, 0x4f, 0x54, 0x48, 0x45,
	0x52, 0x10, 0x01, 0x12, 0x0f, 0x0a, 0x0b, 0x47, 0x45, 0x4e, 0x44, 0x45, 0x52, 0x5f, 0x4d, 0x41,
	0x4c, 0x45, 0x10, 0x02, 0x12, 0x11, 0x0a, 0x0d, 0x47, 0x45, 0x4e, 0x44, 0x45, 0x52, 0x5f, 0x46,
	0x45, 0x4d, 0x41, 0x4c, 0x45, 0x10, 0x03, 0x32, 0xbf, 0x02, 0x0a, 0x07, 0x55, 0x73, 0x65, 0x72,
	0x41, 0x50, 0x49, 0x12, 0x33, 0x0a, 0x0a, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x55, 0x73, 0x65,
	0x72, 0x12, 0x11, 0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x55, 0x73, 0x65, 0x72,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x30, 0x0a, 0x07, 0x47, 0x65, 0x74, 0x55,
	0x73, 0x65, 0x72, 0x12, 0x11, 0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x55, 0x73,
	0x65, 0x72, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x33, 0x0a, 0x0a, 0x55, 0x70,
	0x64, 0x61, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72, 0x12, 0x11, 0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e,
	0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e, 0x75, 0x73,
	0x65, 0x72, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12,
	0x33, 0x0a, 0x0a, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72, 0x12, 0x11, 0x2e,
	0x75, 0x73, 0x65, 0x72, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x12, 0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x12, 0x63, 0x0a, 0x16, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x55, 0x73,
	0x65, 0x72, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x23,
	0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72,
	0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x1a, 0x24, 0x2e, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x55, 0x73, 0x65, 0x72, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x3b, 0x5a, 0x39, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x63, 0x75, 0x74, 0x74, 0x65, 0x72, 0x73, 0x2d,
	0x64, 0x69, 0x67, 0x69, 0x74, 0x61, 0x6c, 0x2f, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x2d,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2f,
	0x75, 0x73, 0x65, 0x72, 0x70, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_user_user_api_proto_rawDescOnce sync.Once
	file_proto_user_user_api_proto_rawDescData = file_proto_user_user_api_proto_rawDesc
)

func file_proto_user_user_api_proto_rawDescGZIP() []byte {
	file_proto_user_user_api_proto_rawDescOnce.Do(func() {
		file_proto_user_user_api_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_user_user_api_proto_rawDescData)
	})
	return file_proto_user_user_api_proto_rawDescData
}

var file_proto_user_user_api_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_proto_user_user_api_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_proto_user_user_api_proto_goTypes = []interface{}{
	(Gender)(0),                            // 0: user.Gender
	(*UserRequest)(nil),                    // 1: user.UserRequest
	(*UserResponse)(nil),                   // 2: user.UserResponse
	(*UpdateUserNotificationRequest)(nil),  // 3: user.UpdateUserNotificationRequest
	(*UpdateUserNotificationResponse)(nil), // 4: user.UpdateUserNotificationResponse
	(*User)(nil),                           // 5: user.User
	(*authpb.Authentication)(nil),          // 6: auth.Authentication
	(*notificationspb.Notification)(nil),   // 7: notifications.Notification
	(*utilspb.Timestamp)(nil),              // 8: utils.Timestamp
}
var file_proto_user_user_api_proto_depIdxs = []int32{
	6,  // 0: user.UserRequest.auth:type_name -> auth.Authentication
	5,  // 1: user.UserRequest.user:type_name -> user.User
	5,  // 2: user.UserResponse.user:type_name -> user.User
	6,  // 3: user.UpdateUserNotificationRequest.auth:type_name -> auth.Authentication
	7,  // 4: user.UpdateUserNotificationRequest.notification:type_name -> notifications.Notification
	7,  // 5: user.User.notification:type_name -> notifications.Notification
	8,  // 6: user.User.birthday:type_name -> utils.Timestamp
	0,  // 7: user.User.gender:type_name -> user.Gender
	1,  // 8: user.UserAPI.CreateUser:input_type -> user.UserRequest
	1,  // 9: user.UserAPI.GetUser:input_type -> user.UserRequest
	1,  // 10: user.UserAPI.UpdateUser:input_type -> user.UserRequest
	1,  // 11: user.UserAPI.DeleteUser:input_type -> user.UserRequest
	3,  // 12: user.UserAPI.UpdateUserNotification:input_type -> user.UpdateUserNotificationRequest
	2,  // 13: user.UserAPI.CreateUser:output_type -> user.UserResponse
	2,  // 14: user.UserAPI.GetUser:output_type -> user.UserResponse
	2,  // 15: user.UserAPI.UpdateUser:output_type -> user.UserResponse
	2,  // 16: user.UserAPI.DeleteUser:output_type -> user.UserResponse
	4,  // 17: user.UserAPI.UpdateUserNotification:output_type -> user.UpdateUserNotificationResponse
	13, // [13:18] is the sub-list for method output_type
	8,  // [8:13] is the sub-list for method input_type
	8,  // [8:8] is the sub-list for extension type_name
	8,  // [8:8] is the sub-list for extension extendee
	0,  // [0:8] is the sub-list for field type_name
}

func init() { file_proto_user_user_api_proto_init() }
func file_proto_user_user_api_proto_init() {
	if File_proto_user_user_api_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_user_user_api_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserRequest); i {
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
		file_proto_user_user_api_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserResponse); i {
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
		file_proto_user_user_api_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateUserNotificationRequest); i {
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
		file_proto_user_user_api_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateUserNotificationResponse); i {
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
		file_proto_user_user_api_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*User); i {
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
			RawDescriptor: file_proto_user_user_api_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_user_user_api_proto_goTypes,
		DependencyIndexes: file_proto_user_user_api_proto_depIdxs,
		EnumInfos:         file_proto_user_user_api_proto_enumTypes,
		MessageInfos:      file_proto_user_user_api_proto_msgTypes,
	}.Build()
	File_proto_user_user_api_proto = out.File
	file_proto_user_user_api_proto_rawDesc = nil
	file_proto_user_user_api_proto_goTypes = nil
	file_proto_user_user_api_proto_depIdxs = nil
}