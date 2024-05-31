package payments;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * API for CRUD-operations on payment-cards.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: proto/payments/card_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CardAPIGrpc {

  private CardAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "payments.CardAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<payments.Payments.CardRequest,
      payments.Payments.CardResponse> getCreateCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCard",
      requestType = payments.Payments.CardRequest.class,
      responseType = payments.Payments.CardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<payments.Payments.CardRequest,
      payments.Payments.CardResponse> getCreateCardMethod() {
    io.grpc.MethodDescriptor<payments.Payments.CardRequest, payments.Payments.CardResponse> getCreateCardMethod;
    if ((getCreateCardMethod = CardAPIGrpc.getCreateCardMethod) == null) {
      synchronized (CardAPIGrpc.class) {
        if ((getCreateCardMethod = CardAPIGrpc.getCreateCardMethod) == null) {
          CardAPIGrpc.getCreateCardMethod = getCreateCardMethod =
              io.grpc.MethodDescriptor.<payments.Payments.CardRequest, payments.Payments.CardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payments.Payments.CardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payments.Payments.CardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CardAPIMethodDescriptorSupplier("CreateCard"))
              .build();
        }
      }
    }
    return getCreateCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<payments.Payments.CardRequest,
      payments.Payments.CardResponse> getUpdateCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCard",
      requestType = payments.Payments.CardRequest.class,
      responseType = payments.Payments.CardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<payments.Payments.CardRequest,
      payments.Payments.CardResponse> getUpdateCardMethod() {
    io.grpc.MethodDescriptor<payments.Payments.CardRequest, payments.Payments.CardResponse> getUpdateCardMethod;
    if ((getUpdateCardMethod = CardAPIGrpc.getUpdateCardMethod) == null) {
      synchronized (CardAPIGrpc.class) {
        if ((getUpdateCardMethod = CardAPIGrpc.getUpdateCardMethod) == null) {
          CardAPIGrpc.getUpdateCardMethod = getUpdateCardMethod =
              io.grpc.MethodDescriptor.<payments.Payments.CardRequest, payments.Payments.CardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payments.Payments.CardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payments.Payments.CardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CardAPIMethodDescriptorSupplier("UpdateCard"))
              .build();
        }
      }
    }
    return getUpdateCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<payments.Payments.CardRequest,
      payments.Payments.CardResponse> getDeleteCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCard",
      requestType = payments.Payments.CardRequest.class,
      responseType = payments.Payments.CardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<payments.Payments.CardRequest,
      payments.Payments.CardResponse> getDeleteCardMethod() {
    io.grpc.MethodDescriptor<payments.Payments.CardRequest, payments.Payments.CardResponse> getDeleteCardMethod;
    if ((getDeleteCardMethod = CardAPIGrpc.getDeleteCardMethod) == null) {
      synchronized (CardAPIGrpc.class) {
        if ((getDeleteCardMethod = CardAPIGrpc.getDeleteCardMethod) == null) {
          CardAPIGrpc.getDeleteCardMethod = getDeleteCardMethod =
              io.grpc.MethodDescriptor.<payments.Payments.CardRequest, payments.Payments.CardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payments.Payments.CardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payments.Payments.CardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CardAPIMethodDescriptorSupplier("DeleteCard"))
              .build();
        }
      }
    }
    return getDeleteCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<payments.Payments.CardRequest,
      payments.Payments.CardResponse> getListCardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCards",
      requestType = payments.Payments.CardRequest.class,
      responseType = payments.Payments.CardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<payments.Payments.CardRequest,
      payments.Payments.CardResponse> getListCardsMethod() {
    io.grpc.MethodDescriptor<payments.Payments.CardRequest, payments.Payments.CardResponse> getListCardsMethod;
    if ((getListCardsMethod = CardAPIGrpc.getListCardsMethod) == null) {
      synchronized (CardAPIGrpc.class) {
        if ((getListCardsMethod = CardAPIGrpc.getListCardsMethod) == null) {
          CardAPIGrpc.getListCardsMethod = getListCardsMethod =
              io.grpc.MethodDescriptor.<payments.Payments.CardRequest, payments.Payments.CardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payments.Payments.CardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  payments.Payments.CardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CardAPIMethodDescriptorSupplier("ListCards"))
              .build();
        }
      }
    }
    return getListCardsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CardAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CardAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CardAPIStub>() {
        @java.lang.Override
        public CardAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CardAPIStub(channel, callOptions);
        }
      };
    return CardAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CardAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CardAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CardAPIBlockingStub>() {
        @java.lang.Override
        public CardAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CardAPIBlockingStub(channel, callOptions);
        }
      };
    return CardAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CardAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CardAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CardAPIFutureStub>() {
        @java.lang.Override
        public CardAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CardAPIFutureStub(channel, callOptions);
        }
      };
    return CardAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * API for CRUD-operations on payment-cards.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create a card on the current user.
     * </pre>
     */
    default void createCard(payments.Payments.CardRequest request,
        io.grpc.stub.StreamObserver<payments.Payments.CardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update information on a card.
     * </pre>
     */
    default void updateCard(payments.Payments.CardRequest request,
        io.grpc.stub.StreamObserver<payments.Payments.CardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a card. Note: This will not remove any payments done.
     * </pre>
     */
    default void deleteCard(payments.Payments.CardRequest request,
        io.grpc.stub.StreamObserver<payments.Payments.CardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all cards connected to a user.
     * </pre>
     */
    default void listCards(payments.Payments.CardRequest request,
        io.grpc.stub.StreamObserver<payments.Payments.CardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCardsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CardAPI.
   * <pre>
   * API for CRUD-operations on payment-cards.
   * </pre>
   */
  public static abstract class CardAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CardAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CardAPI.
   * <pre>
   * API for CRUD-operations on payment-cards.
   * </pre>
   */
  public static final class CardAPIStub
      extends io.grpc.stub.AbstractAsyncStub<CardAPIStub> {
    private CardAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CardAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CardAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a card on the current user.
     * </pre>
     */
    public void createCard(payments.Payments.CardRequest request,
        io.grpc.stub.StreamObserver<payments.Payments.CardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update information on a card.
     * </pre>
     */
    public void updateCard(payments.Payments.CardRequest request,
        io.grpc.stub.StreamObserver<payments.Payments.CardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a card. Note: This will not remove any payments done.
     * </pre>
     */
    public void deleteCard(payments.Payments.CardRequest request,
        io.grpc.stub.StreamObserver<payments.Payments.CardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all cards connected to a user.
     * </pre>
     */
    public void listCards(payments.Payments.CardRequest request,
        io.grpc.stub.StreamObserver<payments.Payments.CardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListCardsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CardAPI.
   * <pre>
   * API for CRUD-operations on payment-cards.
   * </pre>
   */
  public static final class CardAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CardAPIBlockingStub> {
    private CardAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CardAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CardAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a card on the current user.
     * </pre>
     */
    public payments.Payments.CardResponse createCard(payments.Payments.CardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update information on a card.
     * </pre>
     */
    public payments.Payments.CardResponse updateCard(payments.Payments.CardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a card. Note: This will not remove any payments done.
     * </pre>
     */
    public payments.Payments.CardResponse deleteCard(payments.Payments.CardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all cards connected to a user.
     * </pre>
     */
    public java.util.Iterator<payments.Payments.CardResponse> listCards(
        payments.Payments.CardRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListCardsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CardAPI.
   * <pre>
   * API for CRUD-operations on payment-cards.
   * </pre>
   */
  public static final class CardAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<CardAPIFutureStub> {
    private CardAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CardAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CardAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a card on the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<payments.Payments.CardResponse> createCard(
        payments.Payments.CardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update information on a card.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<payments.Payments.CardResponse> updateCard(
        payments.Payments.CardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a card. Note: This will not remove any payments done.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<payments.Payments.CardResponse> deleteCard(
        payments.Payments.CardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CARD = 0;
  private static final int METHODID_UPDATE_CARD = 1;
  private static final int METHODID_DELETE_CARD = 2;
  private static final int METHODID_LIST_CARDS = 3;

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
        case METHODID_CREATE_CARD:
          serviceImpl.createCard((payments.Payments.CardRequest) request,
              (io.grpc.stub.StreamObserver<payments.Payments.CardResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CARD:
          serviceImpl.updateCard((payments.Payments.CardRequest) request,
              (io.grpc.stub.StreamObserver<payments.Payments.CardResponse>) responseObserver);
          break;
        case METHODID_DELETE_CARD:
          serviceImpl.deleteCard((payments.Payments.CardRequest) request,
              (io.grpc.stub.StreamObserver<payments.Payments.CardResponse>) responseObserver);
          break;
        case METHODID_LIST_CARDS:
          serviceImpl.listCards((payments.Payments.CardRequest) request,
              (io.grpc.stub.StreamObserver<payments.Payments.CardResponse>) responseObserver);
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
          getCreateCardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              payments.Payments.CardRequest,
              payments.Payments.CardResponse>(
                service, METHODID_CREATE_CARD)))
        .addMethod(
          getUpdateCardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              payments.Payments.CardRequest,
              payments.Payments.CardResponse>(
                service, METHODID_UPDATE_CARD)))
        .addMethod(
          getDeleteCardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              payments.Payments.CardRequest,
              payments.Payments.CardResponse>(
                service, METHODID_DELETE_CARD)))
        .addMethod(
          getListCardsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              payments.Payments.CardRequest,
              payments.Payments.CardResponse>(
                service, METHODID_LIST_CARDS)))
        .build();
  }

  private static abstract class CardAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CardAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return payments.CardApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CardAPI");
    }
  }

  private static final class CardAPIFileDescriptorSupplier
      extends CardAPIBaseDescriptorSupplier {
    CardAPIFileDescriptorSupplier() {}
  }

  private static final class CardAPIMethodDescriptorSupplier
      extends CardAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CardAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CardAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CardAPIFileDescriptorSupplier())
              .addMethod(getCreateCardMethod())
              .addMethod(getUpdateCardMethod())
              .addMethod(getDeleteCardMethod())
              .addMethod(getListCardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
