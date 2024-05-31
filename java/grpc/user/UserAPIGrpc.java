package user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * API for CRUD-operations on users.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: proto/user/user_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserAPIGrpc {

  private UserAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "user.UserAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<user.UserApi.UserRequest,
      user.UserApi.UserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = user.UserApi.UserRequest.class,
      responseType = user.UserApi.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<user.UserApi.UserRequest,
      user.UserApi.UserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<user.UserApi.UserRequest, user.UserApi.UserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserAPIGrpc.getCreateUserMethod) == null) {
      synchronized (UserAPIGrpc.class) {
        if ((getCreateUserMethod = UserAPIGrpc.getCreateUserMethod) == null) {
          UserAPIGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<user.UserApi.UserRequest, user.UserApi.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserApi.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserApi.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAPIMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<user.UserApi.UserRequest,
      user.UserApi.UserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = user.UserApi.UserRequest.class,
      responseType = user.UserApi.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<user.UserApi.UserRequest,
      user.UserApi.UserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<user.UserApi.UserRequest, user.UserApi.UserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserAPIGrpc.getGetUserMethod) == null) {
      synchronized (UserAPIGrpc.class) {
        if ((getGetUserMethod = UserAPIGrpc.getGetUserMethod) == null) {
          UserAPIGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<user.UserApi.UserRequest, user.UserApi.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserApi.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserApi.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAPIMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<user.UserApi.UserRequest,
      user.UserApi.UserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = user.UserApi.UserRequest.class,
      responseType = user.UserApi.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<user.UserApi.UserRequest,
      user.UserApi.UserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<user.UserApi.UserRequest, user.UserApi.UserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserAPIGrpc.getUpdateUserMethod) == null) {
      synchronized (UserAPIGrpc.class) {
        if ((getUpdateUserMethod = UserAPIGrpc.getUpdateUserMethod) == null) {
          UserAPIGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<user.UserApi.UserRequest, user.UserApi.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserApi.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserApi.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAPIMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<user.UserApi.UserRequest,
      user.UserApi.UserResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = user.UserApi.UserRequest.class,
      responseType = user.UserApi.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<user.UserApi.UserRequest,
      user.UserApi.UserResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<user.UserApi.UserRequest, user.UserApi.UserResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserAPIGrpc.getDeleteUserMethod) == null) {
      synchronized (UserAPIGrpc.class) {
        if ((getDeleteUserMethod = UserAPIGrpc.getDeleteUserMethod) == null) {
          UserAPIGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<user.UserApi.UserRequest, user.UserApi.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserApi.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserApi.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAPIMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<user.UserApi.UpdateUserNotificationRequest,
      user.UserApi.UpdateUserNotificationResponse> getUpdateUserNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserNotification",
      requestType = user.UserApi.UpdateUserNotificationRequest.class,
      responseType = user.UserApi.UpdateUserNotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<user.UserApi.UpdateUserNotificationRequest,
      user.UserApi.UpdateUserNotificationResponse> getUpdateUserNotificationMethod() {
    io.grpc.MethodDescriptor<user.UserApi.UpdateUserNotificationRequest, user.UserApi.UpdateUserNotificationResponse> getUpdateUserNotificationMethod;
    if ((getUpdateUserNotificationMethod = UserAPIGrpc.getUpdateUserNotificationMethod) == null) {
      synchronized (UserAPIGrpc.class) {
        if ((getUpdateUserNotificationMethod = UserAPIGrpc.getUpdateUserNotificationMethod) == null) {
          UserAPIGrpc.getUpdateUserNotificationMethod = getUpdateUserNotificationMethod =
              io.grpc.MethodDescriptor.<user.UserApi.UpdateUserNotificationRequest, user.UserApi.UpdateUserNotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserApi.UpdateUserNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserApi.UpdateUserNotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAPIMethodDescriptorSupplier("UpdateUserNotification"))
              .build();
        }
      }
    }
    return getUpdateUserNotificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAPIStub>() {
        @java.lang.Override
        public UserAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAPIStub(channel, callOptions);
        }
      };
    return UserAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAPIBlockingStub>() {
        @java.lang.Override
        public UserAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAPIBlockingStub(channel, callOptions);
        }
      };
    return UserAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAPIFutureStub>() {
        @java.lang.Override
        public UserAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAPIFutureStub(channel, callOptions);
        }
      };
    return UserAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * API for CRUD-operations on users.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a user.
     * </pre>
     */
    default void createUser(user.UserApi.UserRequest request,
        io.grpc.stub.StreamObserver<user.UserApi.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the current user.
     * </pre>
     */
    default void getUser(user.UserApi.UserRequest request,
        io.grpc.stub.StreamObserver<user.UserApi.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update information on the current user.
     * </pre>
     */
    default void updateUser(user.UserApi.UserRequest request,
        io.grpc.stub.StreamObserver<user.UserApi.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete the current.
     * </pre>
     */
    default void deleteUser(user.UserApi.UserRequest request,
        io.grpc.stub.StreamObserver<user.UserApi.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update notification token on the current user.
     * </pre>
     */
    default void updateUserNotification(user.UserApi.UpdateUserNotificationRequest request,
        io.grpc.stub.StreamObserver<user.UserApi.UpdateUserNotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserNotificationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserAPI.
   * <pre>
   * API for CRUD-operations on users.
   * </pre>
   */
  public static abstract class UserAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserAPI.
   * <pre>
   * API for CRUD-operations on users.
   * </pre>
   */
  public static final class UserAPIStub
      extends io.grpc.stub.AbstractAsyncStub<UserAPIStub> {
    private UserAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a user.
     * </pre>
     */
    public void createUser(user.UserApi.UserRequest request,
        io.grpc.stub.StreamObserver<user.UserApi.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the current user.
     * </pre>
     */
    public void getUser(user.UserApi.UserRequest request,
        io.grpc.stub.StreamObserver<user.UserApi.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update information on the current user.
     * </pre>
     */
    public void updateUser(user.UserApi.UserRequest request,
        io.grpc.stub.StreamObserver<user.UserApi.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete the current.
     * </pre>
     */
    public void deleteUser(user.UserApi.UserRequest request,
        io.grpc.stub.StreamObserver<user.UserApi.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update notification token on the current user.
     * </pre>
     */
    public void updateUserNotification(user.UserApi.UpdateUserNotificationRequest request,
        io.grpc.stub.StreamObserver<user.UserApi.UpdateUserNotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserNotificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserAPI.
   * <pre>
   * API for CRUD-operations on users.
   * </pre>
   */
  public static final class UserAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserAPIBlockingStub> {
    private UserAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a user.
     * </pre>
     */
    public user.UserApi.UserResponse createUser(user.UserApi.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the current user.
     * </pre>
     */
    public user.UserApi.UserResponse getUser(user.UserApi.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update information on the current user.
     * </pre>
     */
    public user.UserApi.UserResponse updateUser(user.UserApi.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete the current.
     * </pre>
     */
    public user.UserApi.UserResponse deleteUser(user.UserApi.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update notification token on the current user.
     * </pre>
     */
    public user.UserApi.UpdateUserNotificationResponse updateUserNotification(user.UserApi.UpdateUserNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserNotificationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserAPI.
   * <pre>
   * API for CRUD-operations on users.
   * </pre>
   */
  public static final class UserAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserAPIFutureStub> {
    private UserAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<user.UserApi.UserResponse> createUser(
        user.UserApi.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<user.UserApi.UserResponse> getUser(
        user.UserApi.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update information on the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<user.UserApi.UserResponse> updateUser(
        user.UserApi.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete the current.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<user.UserApi.UserResponse> deleteUser(
        user.UserApi.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update notification token on the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<user.UserApi.UpdateUserNotificationResponse> updateUserNotification(
        user.UserApi.UpdateUserNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserNotificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_DELETE_USER = 3;
  private static final int METHODID_UPDATE_USER_NOTIFICATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((user.UserApi.UserRequest) request,
              (io.grpc.stub.StreamObserver<user.UserApi.UserResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((user.UserApi.UserRequest) request,
              (io.grpc.stub.StreamObserver<user.UserApi.UserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((user.UserApi.UserRequest) request,
              (io.grpc.stub.StreamObserver<user.UserApi.UserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((user.UserApi.UserRequest) request,
              (io.grpc.stub.StreamObserver<user.UserApi.UserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_NOTIFICATION:
          serviceImpl.updateUserNotification((user.UserApi.UpdateUserNotificationRequest) request,
              (io.grpc.stub.StreamObserver<user.UserApi.UpdateUserNotificationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              user.UserApi.UserRequest,
              user.UserApi.UserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              user.UserApi.UserRequest,
              user.UserApi.UserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              user.UserApi.UserRequest,
              user.UserApi.UserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              user.UserApi.UserRequest,
              user.UserApi.UserResponse>(
                service, METHODID_DELETE_USER)))
        .addMethod(
          getUpdateUserNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              user.UserApi.UpdateUserNotificationRequest,
              user.UserApi.UpdateUserNotificationResponse>(
                service, METHODID_UPDATE_USER_NOTIFICATION)))
        .build();
  }

  private static abstract class UserAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return user.UserApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAPI");
    }
  }

  private static final class UserAPIFileDescriptorSupplier
      extends UserAPIBaseDescriptorSupplier {
    UserAPIFileDescriptorSupplier() {}
  }

  private static final class UserAPIMethodDescriptorSupplier
      extends UserAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserAPIMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserAPIFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getUpdateUserNotificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
