package onboarding;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * API for getting information about onboarding.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: proto/onboarding/onboarding_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OnboardingAPIGrpc {

  private OnboardingAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "onboarding.OnboardingAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<onboarding.OnboardingApi.ListMessagesRequest,
      onboarding.OnboardingApi.ListMessagesResponse> getListMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMessages",
      requestType = onboarding.OnboardingApi.ListMessagesRequest.class,
      responseType = onboarding.OnboardingApi.ListMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<onboarding.OnboardingApi.ListMessagesRequest,
      onboarding.OnboardingApi.ListMessagesResponse> getListMessagesMethod() {
    io.grpc.MethodDescriptor<onboarding.OnboardingApi.ListMessagesRequest, onboarding.OnboardingApi.ListMessagesResponse> getListMessagesMethod;
    if ((getListMessagesMethod = OnboardingAPIGrpc.getListMessagesMethod) == null) {
      synchronized (OnboardingAPIGrpc.class) {
        if ((getListMessagesMethod = OnboardingAPIGrpc.getListMessagesMethod) == null) {
          OnboardingAPIGrpc.getListMessagesMethod = getListMessagesMethod =
              io.grpc.MethodDescriptor.<onboarding.OnboardingApi.ListMessagesRequest, onboarding.OnboardingApi.ListMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  onboarding.OnboardingApi.ListMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  onboarding.OnboardingApi.ListMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OnboardingAPIMethodDescriptorSupplier("ListMessages"))
              .build();
        }
      }
    }
    return getListMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OnboardingAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OnboardingAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OnboardingAPIStub>() {
        @java.lang.Override
        public OnboardingAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OnboardingAPIStub(channel, callOptions);
        }
      };
    return OnboardingAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OnboardingAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OnboardingAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OnboardingAPIBlockingStub>() {
        @java.lang.Override
        public OnboardingAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OnboardingAPIBlockingStub(channel, callOptions);
        }
      };
    return OnboardingAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OnboardingAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OnboardingAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OnboardingAPIFutureStub>() {
        @java.lang.Override
        public OnboardingAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OnboardingAPIFutureStub(channel, callOptions);
        }
      };
    return OnboardingAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * API for getting information about onboarding.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * List all app-messages.
     * </pre>
     */
    default void listMessages(onboarding.OnboardingApi.ListMessagesRequest request,
        io.grpc.stub.StreamObserver<onboarding.OnboardingApi.ListMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMessagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OnboardingAPI.
   * <pre>
   * API for getting information about onboarding.
   * </pre>
   */
  public static abstract class OnboardingAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OnboardingAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OnboardingAPI.
   * <pre>
   * API for getting information about onboarding.
   * </pre>
   */
  public static final class OnboardingAPIStub
      extends io.grpc.stub.AbstractAsyncStub<OnboardingAPIStub> {
    private OnboardingAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnboardingAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OnboardingAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all app-messages.
     * </pre>
     */
    public void listMessages(onboarding.OnboardingApi.ListMessagesRequest request,
        io.grpc.stub.StreamObserver<onboarding.OnboardingApi.ListMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OnboardingAPI.
   * <pre>
   * API for getting information about onboarding.
   * </pre>
   */
  public static final class OnboardingAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OnboardingAPIBlockingStub> {
    private OnboardingAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnboardingAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OnboardingAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all app-messages.
     * </pre>
     */
    public onboarding.OnboardingApi.ListMessagesResponse listMessages(onboarding.OnboardingApi.ListMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OnboardingAPI.
   * <pre>
   * API for getting information about onboarding.
   * </pre>
   */
  public static final class OnboardingAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<OnboardingAPIFutureStub> {
    private OnboardingAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnboardingAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OnboardingAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List all app-messages.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<onboarding.OnboardingApi.ListMessagesResponse> listMessages(
        onboarding.OnboardingApi.ListMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MESSAGES = 0;

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
        case METHODID_LIST_MESSAGES:
          serviceImpl.listMessages((onboarding.OnboardingApi.ListMessagesRequest) request,
              (io.grpc.stub.StreamObserver<onboarding.OnboardingApi.ListMessagesResponse>) responseObserver);
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
          getListMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              onboarding.OnboardingApi.ListMessagesRequest,
              onboarding.OnboardingApi.ListMessagesResponse>(
                service, METHODID_LIST_MESSAGES)))
        .build();
  }

  private static abstract class OnboardingAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OnboardingAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return onboarding.OnboardingApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OnboardingAPI");
    }
  }

  private static final class OnboardingAPIFileDescriptorSupplier
      extends OnboardingAPIBaseDescriptorSupplier {
    OnboardingAPIFileDescriptorSupplier() {}
  }

  private static final class OnboardingAPIMethodDescriptorSupplier
      extends OnboardingAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OnboardingAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OnboardingAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OnboardingAPIFileDescriptorSupplier())
              .addMethod(getListMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
