package rest;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * API for calls that go through a REST-proxy for REST-specific authentication, such as HMAC.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: proto/rest/rest_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RestAPIGrpc {

  private RestAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rest.RestAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rest.RestApi.NotificationRequest,
      rest.RestApi.NotificationResponse> getNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Notification",
      requestType = rest.RestApi.NotificationRequest.class,
      responseType = rest.RestApi.NotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rest.RestApi.NotificationRequest,
      rest.RestApi.NotificationResponse> getNotificationMethod() {
    io.grpc.MethodDescriptor<rest.RestApi.NotificationRequest, rest.RestApi.NotificationResponse> getNotificationMethod;
    if ((getNotificationMethod = RestAPIGrpc.getNotificationMethod) == null) {
      synchronized (RestAPIGrpc.class) {
        if ((getNotificationMethod = RestAPIGrpc.getNotificationMethod) == null) {
          RestAPIGrpc.getNotificationMethod = getNotificationMethod =
              io.grpc.MethodDescriptor.<rest.RestApi.NotificationRequest, rest.RestApi.NotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Notification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rest.RestApi.NotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rest.RestApi.NotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RestAPIMethodDescriptorSupplier("Notification"))
              .build();
        }
      }
    }
    return getNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rest.RestApi.UpdateServiceRequest,
      rest.RestApi.UpdateServiceResponse> getUpdateServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateService",
      requestType = rest.RestApi.UpdateServiceRequest.class,
      responseType = rest.RestApi.UpdateServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rest.RestApi.UpdateServiceRequest,
      rest.RestApi.UpdateServiceResponse> getUpdateServiceMethod() {
    io.grpc.MethodDescriptor<rest.RestApi.UpdateServiceRequest, rest.RestApi.UpdateServiceResponse> getUpdateServiceMethod;
    if ((getUpdateServiceMethod = RestAPIGrpc.getUpdateServiceMethod) == null) {
      synchronized (RestAPIGrpc.class) {
        if ((getUpdateServiceMethod = RestAPIGrpc.getUpdateServiceMethod) == null) {
          RestAPIGrpc.getUpdateServiceMethod = getUpdateServiceMethod =
              io.grpc.MethodDescriptor.<rest.RestApi.UpdateServiceRequest, rest.RestApi.UpdateServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rest.RestApi.UpdateServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rest.RestApi.UpdateServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RestAPIMethodDescriptorSupplier("UpdateService"))
              .build();
        }
      }
    }
    return getUpdateServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rest.RestApi.VoucherNotificationRequest,
      rest.RestApi.VoucherNotificationResponse> getVoucherNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoucherNotification",
      requestType = rest.RestApi.VoucherNotificationRequest.class,
      responseType = rest.RestApi.VoucherNotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rest.RestApi.VoucherNotificationRequest,
      rest.RestApi.VoucherNotificationResponse> getVoucherNotificationMethod() {
    io.grpc.MethodDescriptor<rest.RestApi.VoucherNotificationRequest, rest.RestApi.VoucherNotificationResponse> getVoucherNotificationMethod;
    if ((getVoucherNotificationMethod = RestAPIGrpc.getVoucherNotificationMethod) == null) {
      synchronized (RestAPIGrpc.class) {
        if ((getVoucherNotificationMethod = RestAPIGrpc.getVoucherNotificationMethod) == null) {
          RestAPIGrpc.getVoucherNotificationMethod = getVoucherNotificationMethod =
              io.grpc.MethodDescriptor.<rest.RestApi.VoucherNotificationRequest, rest.RestApi.VoucherNotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoucherNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rest.RestApi.VoucherNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rest.RestApi.VoucherNotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RestAPIMethodDescriptorSupplier("VoucherNotification"))
              .build();
        }
      }
    }
    return getVoucherNotificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RestAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RestAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RestAPIStub>() {
        @java.lang.Override
        public RestAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RestAPIStub(channel, callOptions);
        }
      };
    return RestAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RestAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RestAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RestAPIBlockingStub>() {
        @java.lang.Override
        public RestAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RestAPIBlockingStub(channel, callOptions);
        }
      };
    return RestAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RestAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RestAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RestAPIFutureStub>() {
        @java.lang.Override
        public RestAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RestAPIFutureStub(channel, callOptions);
        }
      };
    return RestAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * API for calls that go through a REST-proxy for REST-specific authentication, such as HMAC.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Send a notification to a specific user.
     * </pre>
     */
    default void notification(rest.RestApi.NotificationRequest request,
        io.grpc.stub.StreamObserver<rest.RestApi.NotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send customer-notification and update a service.
     * </pre>
     */
    default void updateService(rest.RestApi.UpdateServiceRequest request,
        io.grpc.stub.StreamObserver<rest.RestApi.UpdateServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a voucher-notification to a specific user.
     * </pre>
     */
    default void voucherNotification(rest.RestApi.VoucherNotificationRequest request,
        io.grpc.stub.StreamObserver<rest.RestApi.VoucherNotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoucherNotificationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RestAPI.
   * <pre>
   * API for calls that go through a REST-proxy for REST-specific authentication, such as HMAC.
   * </pre>
   */
  public static abstract class RestAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RestAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RestAPI.
   * <pre>
   * API for calls that go through a REST-proxy for REST-specific authentication, such as HMAC.
   * </pre>
   */
  public static final class RestAPIStub
      extends io.grpc.stub.AbstractAsyncStub<RestAPIStub> {
    private RestAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RestAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RestAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a notification to a specific user.
     * </pre>
     */
    public void notification(rest.RestApi.NotificationRequest request,
        io.grpc.stub.StreamObserver<rest.RestApi.NotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send customer-notification and update a service.
     * </pre>
     */
    public void updateService(rest.RestApi.UpdateServiceRequest request,
        io.grpc.stub.StreamObserver<rest.RestApi.UpdateServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a voucher-notification to a specific user.
     * </pre>
     */
    public void voucherNotification(rest.RestApi.VoucherNotificationRequest request,
        io.grpc.stub.StreamObserver<rest.RestApi.VoucherNotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoucherNotificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RestAPI.
   * <pre>
   * API for calls that go through a REST-proxy for REST-specific authentication, such as HMAC.
   * </pre>
   */
  public static final class RestAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RestAPIBlockingStub> {
    private RestAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RestAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RestAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a notification to a specific user.
     * </pre>
     */
    public rest.RestApi.NotificationResponse notification(rest.RestApi.NotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send customer-notification and update a service.
     * </pre>
     */
    public rest.RestApi.UpdateServiceResponse updateService(rest.RestApi.UpdateServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a voucher-notification to a specific user.
     * </pre>
     */
    public rest.RestApi.VoucherNotificationResponse voucherNotification(rest.RestApi.VoucherNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoucherNotificationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RestAPI.
   * <pre>
   * API for calls that go through a REST-proxy for REST-specific authentication, such as HMAC.
   * </pre>
   */
  public static final class RestAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<RestAPIFutureStub> {
    private RestAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RestAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RestAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a notification to a specific user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<rest.RestApi.NotificationResponse> notification(
        rest.RestApi.NotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send customer-notification and update a service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<rest.RestApi.UpdateServiceResponse> updateService(
        rest.RestApi.UpdateServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a voucher-notification to a specific user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<rest.RestApi.VoucherNotificationResponse> voucherNotification(
        rest.RestApi.VoucherNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoucherNotificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFICATION = 0;
  private static final int METHODID_UPDATE_SERVICE = 1;
  private static final int METHODID_VOUCHER_NOTIFICATION = 2;

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
        case METHODID_NOTIFICATION:
          serviceImpl.notification((rest.RestApi.NotificationRequest) request,
              (io.grpc.stub.StreamObserver<rest.RestApi.NotificationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE:
          serviceImpl.updateService((rest.RestApi.UpdateServiceRequest) request,
              (io.grpc.stub.StreamObserver<rest.RestApi.UpdateServiceResponse>) responseObserver);
          break;
        case METHODID_VOUCHER_NOTIFICATION:
          serviceImpl.voucherNotification((rest.RestApi.VoucherNotificationRequest) request,
              (io.grpc.stub.StreamObserver<rest.RestApi.VoucherNotificationResponse>) responseObserver);
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
          getNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rest.RestApi.NotificationRequest,
              rest.RestApi.NotificationResponse>(
                service, METHODID_NOTIFICATION)))
        .addMethod(
          getUpdateServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rest.RestApi.UpdateServiceRequest,
              rest.RestApi.UpdateServiceResponse>(
                service, METHODID_UPDATE_SERVICE)))
        .addMethod(
          getVoucherNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rest.RestApi.VoucherNotificationRequest,
              rest.RestApi.VoucherNotificationResponse>(
                service, METHODID_VOUCHER_NOTIFICATION)))
        .build();
  }

  private static abstract class RestAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RestAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rest.RestApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RestAPI");
    }
  }

  private static final class RestAPIFileDescriptorSupplier
      extends RestAPIBaseDescriptorSupplier {
    RestAPIFileDescriptorSupplier() {}
  }

  private static final class RestAPIMethodDescriptorSupplier
      extends RestAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RestAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RestAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RestAPIFileDescriptorSupplier())
              .addMethod(getNotificationMethod())
              .addMethod(getUpdateServiceMethod())
              .addMethod(getVoucherNotificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
