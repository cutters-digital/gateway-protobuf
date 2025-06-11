package cutters;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: proto/cutters/salon_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SalonAPIGrpc {

  private SalonAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cutters.SalonAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cutters.SalonApi.GetSalonRequest,
      cutters.SalonApi.GetSalonResponse> getGetSalonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSalon",
      requestType = cutters.SalonApi.GetSalonRequest.class,
      responseType = cutters.SalonApi.GetSalonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cutters.SalonApi.GetSalonRequest,
      cutters.SalonApi.GetSalonResponse> getGetSalonMethod() {
    io.grpc.MethodDescriptor<cutters.SalonApi.GetSalonRequest, cutters.SalonApi.GetSalonResponse> getGetSalonMethod;
    if ((getGetSalonMethod = SalonAPIGrpc.getGetSalonMethod) == null) {
      synchronized (SalonAPIGrpc.class) {
        if ((getGetSalonMethod = SalonAPIGrpc.getGetSalonMethod) == null) {
          SalonAPIGrpc.getGetSalonMethod = getGetSalonMethod =
              io.grpc.MethodDescriptor.<cutters.SalonApi.GetSalonRequest, cutters.SalonApi.GetSalonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSalon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cutters.SalonApi.GetSalonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cutters.SalonApi.GetSalonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalonAPIMethodDescriptorSupplier("GetSalon"))
              .build();
        }
      }
    }
    return getGetSalonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cutters.SalonApi.ListSalonsRequest,
      cutters.SalonApi.ListSalonsResponse> getListSalonsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSalons",
      requestType = cutters.SalonApi.ListSalonsRequest.class,
      responseType = cutters.SalonApi.ListSalonsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cutters.SalonApi.ListSalonsRequest,
      cutters.SalonApi.ListSalonsResponse> getListSalonsMethod() {
    io.grpc.MethodDescriptor<cutters.SalonApi.ListSalonsRequest, cutters.SalonApi.ListSalonsResponse> getListSalonsMethod;
    if ((getListSalonsMethod = SalonAPIGrpc.getListSalonsMethod) == null) {
      synchronized (SalonAPIGrpc.class) {
        if ((getListSalonsMethod = SalonAPIGrpc.getListSalonsMethod) == null) {
          SalonAPIGrpc.getListSalonsMethod = getListSalonsMethod =
              io.grpc.MethodDescriptor.<cutters.SalonApi.ListSalonsRequest, cutters.SalonApi.ListSalonsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSalons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cutters.SalonApi.ListSalonsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cutters.SalonApi.ListSalonsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalonAPIMethodDescriptorSupplier("ListSalons"))
              .build();
        }
      }
    }
    return getListSalonsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cutters.SalonApi.EchoRequest,
      cutters.SalonApi.EchoResponse> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = cutters.SalonApi.EchoRequest.class,
      responseType = cutters.SalonApi.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cutters.SalonApi.EchoRequest,
      cutters.SalonApi.EchoResponse> getEchoMethod() {
    io.grpc.MethodDescriptor<cutters.SalonApi.EchoRequest, cutters.SalonApi.EchoResponse> getEchoMethod;
    if ((getEchoMethod = SalonAPIGrpc.getEchoMethod) == null) {
      synchronized (SalonAPIGrpc.class) {
        if ((getEchoMethod = SalonAPIGrpc.getEchoMethod) == null) {
          SalonAPIGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<cutters.SalonApi.EchoRequest, cutters.SalonApi.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cutters.SalonApi.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cutters.SalonApi.EchoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalonAPIMethodDescriptorSupplier("Echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SalonAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalonAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalonAPIStub>() {
        @java.lang.Override
        public SalonAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalonAPIStub(channel, callOptions);
        }
      };
    return SalonAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SalonAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalonAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalonAPIBlockingStub>() {
        @java.lang.Override
        public SalonAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalonAPIBlockingStub(channel, callOptions);
        }
      };
    return SalonAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SalonAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalonAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalonAPIFutureStub>() {
        @java.lang.Override
        public SalonAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalonAPIFutureStub(channel, callOptions);
        }
      };
    return SalonAPIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getSalon(cutters.SalonApi.GetSalonRequest request,
        io.grpc.stub.StreamObserver<cutters.SalonApi.GetSalonResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSalonMethod(), responseObserver);
    }

    /**
     */
    default void listSalons(cutters.SalonApi.ListSalonsRequest request,
        io.grpc.stub.StreamObserver<cutters.SalonApi.ListSalonsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSalonsMethod(), responseObserver);
    }

    /**
     */
    default void echo(cutters.SalonApi.EchoRequest request,
        io.grpc.stub.StreamObserver<cutters.SalonApi.EchoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SalonAPI.
   */
  public static abstract class SalonAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SalonAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SalonAPI.
   */
  public static final class SalonAPIStub
      extends io.grpc.stub.AbstractAsyncStub<SalonAPIStub> {
    private SalonAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalonAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalonAPIStub(channel, callOptions);
    }

    /**
     */
    public void getSalon(cutters.SalonApi.GetSalonRequest request,
        io.grpc.stub.StreamObserver<cutters.SalonApi.GetSalonResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSalonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSalons(cutters.SalonApi.ListSalonsRequest request,
        io.grpc.stub.StreamObserver<cutters.SalonApi.ListSalonsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListSalonsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void echo(cutters.SalonApi.EchoRequest request,
        io.grpc.stub.StreamObserver<cutters.SalonApi.EchoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SalonAPI.
   */
  public static final class SalonAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SalonAPIBlockingStub> {
    private SalonAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalonAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalonAPIBlockingStub(channel, callOptions);
    }

    /**
     */
    public cutters.SalonApi.GetSalonResponse getSalon(cutters.SalonApi.GetSalonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSalonMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cutters.SalonApi.ListSalonsResponse> listSalons(
        cutters.SalonApi.ListSalonsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListSalonsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cutters.SalonApi.EchoResponse echo(cutters.SalonApi.EchoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SalonAPI.
   */
  public static final class SalonAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<SalonAPIFutureStub> {
    private SalonAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalonAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalonAPIFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cutters.SalonApi.GetSalonResponse> getSalon(
        cutters.SalonApi.GetSalonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSalonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cutters.SalonApi.EchoResponse> echo(
        cutters.SalonApi.EchoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SALON = 0;
  private static final int METHODID_LIST_SALONS = 1;
  private static final int METHODID_ECHO = 2;

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
        case METHODID_GET_SALON:
          serviceImpl.getSalon((cutters.SalonApi.GetSalonRequest) request,
              (io.grpc.stub.StreamObserver<cutters.SalonApi.GetSalonResponse>) responseObserver);
          break;
        case METHODID_LIST_SALONS:
          serviceImpl.listSalons((cutters.SalonApi.ListSalonsRequest) request,
              (io.grpc.stub.StreamObserver<cutters.SalonApi.ListSalonsResponse>) responseObserver);
          break;
        case METHODID_ECHO:
          serviceImpl.echo((cutters.SalonApi.EchoRequest) request,
              (io.grpc.stub.StreamObserver<cutters.SalonApi.EchoResponse>) responseObserver);
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
          getGetSalonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cutters.SalonApi.GetSalonRequest,
              cutters.SalonApi.GetSalonResponse>(
                service, METHODID_GET_SALON)))
        .addMethod(
          getListSalonsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              cutters.SalonApi.ListSalonsRequest,
              cutters.SalonApi.ListSalonsResponse>(
                service, METHODID_LIST_SALONS)))
        .addMethod(
          getEchoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cutters.SalonApi.EchoRequest,
              cutters.SalonApi.EchoResponse>(
                service, METHODID_ECHO)))
        .build();
  }

  private static abstract class SalonAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SalonAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cutters.SalonApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SalonAPI");
    }
  }

  private static final class SalonAPIFileDescriptorSupplier
      extends SalonAPIBaseDescriptorSupplier {
    SalonAPIFileDescriptorSupplier() {}
  }

  private static final class SalonAPIMethodDescriptorSupplier
      extends SalonAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SalonAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SalonAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SalonAPIFileDescriptorSupplier())
              .addMethod(getGetSalonMethod())
              .addMethod(getListSalonsMethod())
              .addMethod(getEchoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
