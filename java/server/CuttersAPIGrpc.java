package server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * API for getting status about salons, or making bookings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: proto/server/cutters_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CuttersAPIGrpc {

  private CuttersAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "server.CuttersAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.GetWaitingTimesRequest,
      server.CuttersApi.GetWaitingTimesResponse> getGetWaitingTimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaitingTimes",
      requestType = server.CuttersApi.GetWaitingTimesRequest.class,
      responseType = server.CuttersApi.GetWaitingTimesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<server.CuttersApi.GetWaitingTimesRequest,
      server.CuttersApi.GetWaitingTimesResponse> getGetWaitingTimesMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.GetWaitingTimesRequest, server.CuttersApi.GetWaitingTimesResponse> getGetWaitingTimesMethod;
    if ((getGetWaitingTimesMethod = CuttersAPIGrpc.getGetWaitingTimesMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getGetWaitingTimesMethod = CuttersAPIGrpc.getGetWaitingTimesMethod) == null) {
          CuttersAPIGrpc.getGetWaitingTimesMethod = getGetWaitingTimesMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.GetWaitingTimesRequest, server.CuttersApi.GetWaitingTimesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaitingTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetWaitingTimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetWaitingTimesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("GetWaitingTimes"))
              .build();
        }
      }
    }
    return getGetWaitingTimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.GetSalonRequest,
      server.CuttersApi.GetSalonResponse> getGetSalonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSalon",
      requestType = server.CuttersApi.GetSalonRequest.class,
      responseType = server.CuttersApi.GetSalonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.GetSalonRequest,
      server.CuttersApi.GetSalonResponse> getGetSalonMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.GetSalonRequest, server.CuttersApi.GetSalonResponse> getGetSalonMethod;
    if ((getGetSalonMethod = CuttersAPIGrpc.getGetSalonMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getGetSalonMethod = CuttersAPIGrpc.getGetSalonMethod) == null) {
          CuttersAPIGrpc.getGetSalonMethod = getGetSalonMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.GetSalonRequest, server.CuttersApi.GetSalonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSalon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetSalonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetSalonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("GetSalon"))
              .build();
        }
      }
    }
    return getGetSalonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.BookRequest,
      server.CuttersApi.BookResponse> getBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Book",
      requestType = server.CuttersApi.BookRequest.class,
      responseType = server.CuttersApi.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.BookRequest,
      server.CuttersApi.BookResponse> getBookMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.BookRequest, server.CuttersApi.BookResponse> getBookMethod;
    if ((getBookMethod = CuttersAPIGrpc.getBookMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getBookMethod = CuttersAPIGrpc.getBookMethod) == null) {
          CuttersAPIGrpc.getBookMethod = getBookMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.BookRequest, server.CuttersApi.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Book"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.BookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.BookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("Book"))
              .build();
        }
      }
    }
    return getBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.PurchaseRequest,
      server.CuttersApi.PurchaseResponse> getPurchaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Purchase",
      requestType = server.CuttersApi.PurchaseRequest.class,
      responseType = server.CuttersApi.PurchaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.PurchaseRequest,
      server.CuttersApi.PurchaseResponse> getPurchaseMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.PurchaseRequest, server.CuttersApi.PurchaseResponse> getPurchaseMethod;
    if ((getPurchaseMethod = CuttersAPIGrpc.getPurchaseMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getPurchaseMethod = CuttersAPIGrpc.getPurchaseMethod) == null) {
          CuttersAPIGrpc.getPurchaseMethod = getPurchaseMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.PurchaseRequest, server.CuttersApi.PurchaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Purchase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.PurchaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.PurchaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("Purchase"))
              .build();
        }
      }
    }
    return getPurchaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.GetAvailablePaymentProvidersRequest,
      server.CuttersApi.GetAvailablePaymentProvidersResponse> getGetAvailablePaymentProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailablePaymentProviders",
      requestType = server.CuttersApi.GetAvailablePaymentProvidersRequest.class,
      responseType = server.CuttersApi.GetAvailablePaymentProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.GetAvailablePaymentProvidersRequest,
      server.CuttersApi.GetAvailablePaymentProvidersResponse> getGetAvailablePaymentProvidersMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.GetAvailablePaymentProvidersRequest, server.CuttersApi.GetAvailablePaymentProvidersResponse> getGetAvailablePaymentProvidersMethod;
    if ((getGetAvailablePaymentProvidersMethod = CuttersAPIGrpc.getGetAvailablePaymentProvidersMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getGetAvailablePaymentProvidersMethod = CuttersAPIGrpc.getGetAvailablePaymentProvidersMethod) == null) {
          CuttersAPIGrpc.getGetAvailablePaymentProvidersMethod = getGetAvailablePaymentProvidersMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.GetAvailablePaymentProvidersRequest, server.CuttersApi.GetAvailablePaymentProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailablePaymentProviders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetAvailablePaymentProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetAvailablePaymentProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("GetAvailablePaymentProviders"))
              .build();
        }
      }
    }
    return getGetAvailablePaymentProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.GetPriceRequest,
      server.CuttersApi.GetPriceResponse> getGetPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrice",
      requestType = server.CuttersApi.GetPriceRequest.class,
      responseType = server.CuttersApi.GetPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.GetPriceRequest,
      server.CuttersApi.GetPriceResponse> getGetPriceMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.GetPriceRequest, server.CuttersApi.GetPriceResponse> getGetPriceMethod;
    if ((getGetPriceMethod = CuttersAPIGrpc.getGetPriceMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getGetPriceMethod = CuttersAPIGrpc.getGetPriceMethod) == null) {
          CuttersAPIGrpc.getGetPriceMethod = getGetPriceMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.GetPriceRequest, server.CuttersApi.GetPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("GetPrice"))
              .build();
        }
      }
    }
    return getGetPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.GetCampaignsRequest,
      server.CuttersApi.GetCampaignsResponse> getGetCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaigns",
      requestType = server.CuttersApi.GetCampaignsRequest.class,
      responseType = server.CuttersApi.GetCampaignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.GetCampaignsRequest,
      server.CuttersApi.GetCampaignsResponse> getGetCampaignsMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.GetCampaignsRequest, server.CuttersApi.GetCampaignsResponse> getGetCampaignsMethod;
    if ((getGetCampaignsMethod = CuttersAPIGrpc.getGetCampaignsMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getGetCampaignsMethod = CuttersAPIGrpc.getGetCampaignsMethod) == null) {
          CuttersAPIGrpc.getGetCampaignsMethod = getGetCampaignsMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.GetCampaignsRequest, server.CuttersApi.GetCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetCampaignsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("GetCampaigns"))
              .build();
        }
      }
    }
    return getGetCampaignsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.GetServicesRequest,
      server.CuttersApi.GetServicesResponse> getGetServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServices",
      requestType = server.CuttersApi.GetServicesRequest.class,
      responseType = server.CuttersApi.GetServicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<server.CuttersApi.GetServicesRequest,
      server.CuttersApi.GetServicesResponse> getGetServicesMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.GetServicesRequest, server.CuttersApi.GetServicesResponse> getGetServicesMethod;
    if ((getGetServicesMethod = CuttersAPIGrpc.getGetServicesMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getGetServicesMethod = CuttersAPIGrpc.getGetServicesMethod) == null) {
          CuttersAPIGrpc.getGetServicesMethod = getGetServicesMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.GetServicesRequest, server.CuttersApi.GetServicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetServicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetServicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("GetServices"))
              .build();
        }
      }
    }
    return getGetServicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.GetProductsRequest,
      server.CuttersApi.GetProductsResponse> getGetProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProducts",
      requestType = server.CuttersApi.GetProductsRequest.class,
      responseType = server.CuttersApi.GetProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<server.CuttersApi.GetProductsRequest,
      server.CuttersApi.GetProductsResponse> getGetProductsMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.GetProductsRequest, server.CuttersApi.GetProductsResponse> getGetProductsMethod;
    if ((getGetProductsMethod = CuttersAPIGrpc.getGetProductsMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getGetProductsMethod = CuttersAPIGrpc.getGetProductsMethod) == null) {
          CuttersAPIGrpc.getGetProductsMethod = getGetProductsMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.GetProductsRequest, server.CuttersApi.GetProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("GetProducts"))
              .build();
        }
      }
    }
    return getGetProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.GetWaitingStatusRequest,
      server.CuttersApi.GetWaitingStatusResponse> getGetWaitingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaitingStatus",
      requestType = server.CuttersApi.GetWaitingStatusRequest.class,
      responseType = server.CuttersApi.GetWaitingStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.GetWaitingStatusRequest,
      server.CuttersApi.GetWaitingStatusResponse> getGetWaitingStatusMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.GetWaitingStatusRequest, server.CuttersApi.GetWaitingStatusResponse> getGetWaitingStatusMethod;
    if ((getGetWaitingStatusMethod = CuttersAPIGrpc.getGetWaitingStatusMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getGetWaitingStatusMethod = CuttersAPIGrpc.getGetWaitingStatusMethod) == null) {
          CuttersAPIGrpc.getGetWaitingStatusMethod = getGetWaitingStatusMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.GetWaitingStatusRequest, server.CuttersApi.GetWaitingStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaitingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetWaitingStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetWaitingStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("GetWaitingStatus"))
              .build();
        }
      }
    }
    return getGetWaitingStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.ListTransactionsRequest,
      server.CuttersApi.ListTransactionsResponse> getListTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransactions",
      requestType = server.CuttersApi.ListTransactionsRequest.class,
      responseType = server.CuttersApi.ListTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.ListTransactionsRequest,
      server.CuttersApi.ListTransactionsResponse> getListTransactionsMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.ListTransactionsRequest, server.CuttersApi.ListTransactionsResponse> getListTransactionsMethod;
    if ((getListTransactionsMethod = CuttersAPIGrpc.getListTransactionsMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getListTransactionsMethod = CuttersAPIGrpc.getListTransactionsMethod) == null) {
          CuttersAPIGrpc.getListTransactionsMethod = getListTransactionsMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.ListTransactionsRequest, server.CuttersApi.ListTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.ListTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.ListTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("ListTransactions"))
              .build();
        }
      }
    }
    return getListTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.CanRedeemVoucherRequest,
      server.CuttersApi.CanRedeemVoucherResponse> getCanRedeemVoucherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CanRedeemVoucher",
      requestType = server.CuttersApi.CanRedeemVoucherRequest.class,
      responseType = server.CuttersApi.CanRedeemVoucherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.CanRedeemVoucherRequest,
      server.CuttersApi.CanRedeemVoucherResponse> getCanRedeemVoucherMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.CanRedeemVoucherRequest, server.CuttersApi.CanRedeemVoucherResponse> getCanRedeemVoucherMethod;
    if ((getCanRedeemVoucherMethod = CuttersAPIGrpc.getCanRedeemVoucherMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getCanRedeemVoucherMethod = CuttersAPIGrpc.getCanRedeemVoucherMethod) == null) {
          CuttersAPIGrpc.getCanRedeemVoucherMethod = getCanRedeemVoucherMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.CanRedeemVoucherRequest, server.CuttersApi.CanRedeemVoucherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CanRedeemVoucher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.CanRedeemVoucherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.CanRedeemVoucherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("CanRedeemVoucher"))
              .build();
        }
      }
    }
    return getCanRedeemVoucherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.CreateVoucherRequest,
      server.CuttersApi.CreateVoucherResponse> getCreateVoucherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVoucher",
      requestType = server.CuttersApi.CreateVoucherRequest.class,
      responseType = server.CuttersApi.CreateVoucherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.CreateVoucherRequest,
      server.CuttersApi.CreateVoucherResponse> getCreateVoucherMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.CreateVoucherRequest, server.CuttersApi.CreateVoucherResponse> getCreateVoucherMethod;
    if ((getCreateVoucherMethod = CuttersAPIGrpc.getCreateVoucherMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getCreateVoucherMethod = CuttersAPIGrpc.getCreateVoucherMethod) == null) {
          CuttersAPIGrpc.getCreateVoucherMethod = getCreateVoucherMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.CreateVoucherRequest, server.CuttersApi.CreateVoucherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVoucher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.CreateVoucherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.CreateVoucherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("CreateVoucher"))
              .build();
        }
      }
    }
    return getCreateVoucherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.GetReferralStatusRequest,
      server.CuttersApi.GetReferralStatusResponse> getGetReferralStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReferralStatus",
      requestType = server.CuttersApi.GetReferralStatusRequest.class,
      responseType = server.CuttersApi.GetReferralStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.GetReferralStatusRequest,
      server.CuttersApi.GetReferralStatusResponse> getGetReferralStatusMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.GetReferralStatusRequest, server.CuttersApi.GetReferralStatusResponse> getGetReferralStatusMethod;
    if ((getGetReferralStatusMethod = CuttersAPIGrpc.getGetReferralStatusMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getGetReferralStatusMethod = CuttersAPIGrpc.getGetReferralStatusMethod) == null) {
          CuttersAPIGrpc.getGetReferralStatusMethod = getGetReferralStatusMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.GetReferralStatusRequest, server.CuttersApi.GetReferralStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReferralStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetReferralStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.GetReferralStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("GetReferralStatus"))
              .build();
        }
      }
    }
    return getGetReferralStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.CancelServiceRequest,
      server.CuttersApi.CancelServiceResponse> getCancelServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelService",
      requestType = server.CuttersApi.CancelServiceRequest.class,
      responseType = server.CuttersApi.CancelServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.CancelServiceRequest,
      server.CuttersApi.CancelServiceResponse> getCancelServiceMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.CancelServiceRequest, server.CuttersApi.CancelServiceResponse> getCancelServiceMethod;
    if ((getCancelServiceMethod = CuttersAPIGrpc.getCancelServiceMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getCancelServiceMethod = CuttersAPIGrpc.getCancelServiceMethod) == null) {
          CuttersAPIGrpc.getCancelServiceMethod = getCancelServiceMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.CancelServiceRequest, server.CuttersApi.CancelServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.CancelServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.CancelServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("CancelService"))
              .build();
        }
      }
    }
    return getCancelServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.RemoteLogRequest,
      server.CuttersApi.RemoteLogResponse> getRemoteLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoteLog",
      requestType = server.CuttersApi.RemoteLogRequest.class,
      responseType = server.CuttersApi.RemoteLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.RemoteLogRequest,
      server.CuttersApi.RemoteLogResponse> getRemoteLogMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.RemoteLogRequest, server.CuttersApi.RemoteLogResponse> getRemoteLogMethod;
    if ((getRemoteLogMethod = CuttersAPIGrpc.getRemoteLogMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getRemoteLogMethod = CuttersAPIGrpc.getRemoteLogMethod) == null) {
          CuttersAPIGrpc.getRemoteLogMethod = getRemoteLogMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.RemoteLogRequest, server.CuttersApi.RemoteLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoteLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.RemoteLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.RemoteLogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("RemoteLog"))
              .build();
        }
      }
    }
    return getRemoteLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.TimeoutRequest,
      server.CuttersApi.TimeoutResponse> getTimeoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Timeout",
      requestType = server.CuttersApi.TimeoutRequest.class,
      responseType = server.CuttersApi.TimeoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.TimeoutRequest,
      server.CuttersApi.TimeoutResponse> getTimeoutMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.TimeoutRequest, server.CuttersApi.TimeoutResponse> getTimeoutMethod;
    if ((getTimeoutMethod = CuttersAPIGrpc.getTimeoutMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getTimeoutMethod = CuttersAPIGrpc.getTimeoutMethod) == null) {
          CuttersAPIGrpc.getTimeoutMethod = getTimeoutMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.TimeoutRequest, server.CuttersApi.TimeoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Timeout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.TimeoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.TimeoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("Timeout"))
              .build();
        }
      }
    }
    return getTimeoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.ListActiveTransactionsRequest,
      server.CuttersApi.ListActiveTransactionsResponse> getListActiveTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListActiveTransactions",
      requestType = server.CuttersApi.ListActiveTransactionsRequest.class,
      responseType = server.CuttersApi.ListActiveTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.ListActiveTransactionsRequest,
      server.CuttersApi.ListActiveTransactionsResponse> getListActiveTransactionsMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.ListActiveTransactionsRequest, server.CuttersApi.ListActiveTransactionsResponse> getListActiveTransactionsMethod;
    if ((getListActiveTransactionsMethod = CuttersAPIGrpc.getListActiveTransactionsMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getListActiveTransactionsMethod = CuttersAPIGrpc.getListActiveTransactionsMethod) == null) {
          CuttersAPIGrpc.getListActiveTransactionsMethod = getListActiveTransactionsMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.ListActiveTransactionsRequest, server.CuttersApi.ListActiveTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListActiveTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.ListActiveTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.ListActiveTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("ListActiveTransactions"))
              .build();
        }
      }
    }
    return getListActiveTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.ListHistoricalTransactionsRequest,
      server.CuttersApi.ListHistoricalTransactionsResponse> getListHistoricalTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHistoricalTransactions",
      requestType = server.CuttersApi.ListHistoricalTransactionsRequest.class,
      responseType = server.CuttersApi.ListHistoricalTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.ListHistoricalTransactionsRequest,
      server.CuttersApi.ListHistoricalTransactionsResponse> getListHistoricalTransactionsMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.ListHistoricalTransactionsRequest, server.CuttersApi.ListHistoricalTransactionsResponse> getListHistoricalTransactionsMethod;
    if ((getListHistoricalTransactionsMethod = CuttersAPIGrpc.getListHistoricalTransactionsMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getListHistoricalTransactionsMethod = CuttersAPIGrpc.getListHistoricalTransactionsMethod) == null) {
          CuttersAPIGrpc.getListHistoricalTransactionsMethod = getListHistoricalTransactionsMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.ListHistoricalTransactionsRequest, server.CuttersApi.ListHistoricalTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHistoricalTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.ListHistoricalTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.ListHistoricalTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("ListHistoricalTransactions"))
              .build();
        }
      }
    }
    return getListHistoricalTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<server.CuttersApi.AvailableHairdressersRequest,
      server.CuttersApi.AvailableHairdressersResponse> getGetAvailableHairdressersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableHairdressers",
      requestType = server.CuttersApi.AvailableHairdressersRequest.class,
      responseType = server.CuttersApi.AvailableHairdressersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<server.CuttersApi.AvailableHairdressersRequest,
      server.CuttersApi.AvailableHairdressersResponse> getGetAvailableHairdressersMethod() {
    io.grpc.MethodDescriptor<server.CuttersApi.AvailableHairdressersRequest, server.CuttersApi.AvailableHairdressersResponse> getGetAvailableHairdressersMethod;
    if ((getGetAvailableHairdressersMethod = CuttersAPIGrpc.getGetAvailableHairdressersMethod) == null) {
      synchronized (CuttersAPIGrpc.class) {
        if ((getGetAvailableHairdressersMethod = CuttersAPIGrpc.getGetAvailableHairdressersMethod) == null) {
          CuttersAPIGrpc.getGetAvailableHairdressersMethod = getGetAvailableHairdressersMethod =
              io.grpc.MethodDescriptor.<server.CuttersApi.AvailableHairdressersRequest, server.CuttersApi.AvailableHairdressersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableHairdressers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.AvailableHairdressersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  server.CuttersApi.AvailableHairdressersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CuttersAPIMethodDescriptorSupplier("GetAvailableHairdressers"))
              .build();
        }
      }
    }
    return getGetAvailableHairdressersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CuttersAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CuttersAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CuttersAPIStub>() {
        @java.lang.Override
        public CuttersAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CuttersAPIStub(channel, callOptions);
        }
      };
    return CuttersAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CuttersAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CuttersAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CuttersAPIBlockingStub>() {
        @java.lang.Override
        public CuttersAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CuttersAPIBlockingStub(channel, callOptions);
        }
      };
    return CuttersAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CuttersAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CuttersAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CuttersAPIFutureStub>() {
        @java.lang.Override
        public CuttersAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CuttersAPIFutureStub(channel, callOptions);
        }
      };
    return CuttersAPIFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * API for getting status about salons, or making bookings.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns all the salons with estimated waiting times.
     * </pre>
     */
    default void getWaitingTimes(server.CuttersApi.GetWaitingTimesRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetWaitingTimesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaitingTimesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a salon with updated waiting-times.
     * </pre>
     */
    default void getSalon(server.CuttersApi.GetSalonRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetSalonResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSalonMethod(), responseObserver);
    }

    /**
     * <pre>
     * Book a haircut.
     * </pre>
     */
    @java.lang.Deprecated
    default void book(server.CuttersApi.BookRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.BookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Purchase a certain number of haircuts and/or products.
     * </pre>
     */
    default void purchase(server.CuttersApi.PurchaseRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.PurchaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurchaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the payment-providers that are available to the app for the given user.
     * </pre>
     */
    default void getAvailablePaymentProviders(server.CuttersApi.GetAvailablePaymentProvidersRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetAvailablePaymentProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailablePaymentProvidersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the total price for the requested items.
     * </pre>
     */
    default void getPrice(server.CuttersApi.GetPriceRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all active campaigns/sales.
     * </pre>
     */
    default void getCampaigns(server.CuttersApi.GetCampaignsRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetCampaignsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all the services available for a salon. The best-matching locale will be used.
     * </pre>
     */
    default void getServices(server.CuttersApi.GetServicesRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetServicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all the products available for a salon. The best-matching locale will be used.
     * </pre>
     */
    default void getProducts(server.CuttersApi.GetProductsRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the current waiting-status.
     * </pre>
     */
    default void getWaitingStatus(server.CuttersApi.GetWaitingStatusRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetWaitingStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaitingStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all current and historic purchases. Replaced by ListActiveTransactions and ListHistoricalTransactions.
     * </pre>
     */
    @java.lang.Deprecated
    default void listTransactions(server.CuttersApi.ListTransactionsRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.ListTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks if a voucher can be redeemed.
     * </pre>
     */
    default void canRedeemVoucher(server.CuttersApi.CanRedeemVoucherRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.CanRedeemVoucherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCanRedeemVoucherMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a sharable voucher.
     * </pre>
     */
    default void createVoucher(server.CuttersApi.CreateVoucherRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.CreateVoucherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVoucherMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get Voucher referral-status.
     * </pre>
     */
    default void getReferralStatus(server.CuttersApi.GetReferralStatusRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetReferralStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReferralStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel a upcoming service.
     * </pre>
     */
    default void cancelService(server.CuttersApi.CancelServiceRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.CancelServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Log a remote event.
     * </pre>
     */
    default void remoteLog(server.CuttersApi.RemoteLogRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.RemoteLogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoteLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Force a timeout.
     * </pre>
     */
    default void timeout(server.CuttersApi.TimeoutRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.TimeoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTimeoutMethod(), responseObserver);
    }

    /**
     * <pre>
     * List active transactions (booked haircuts and products to pickup).
     * </pre>
     */
    default void listActiveTransactions(server.CuttersApi.ListActiveTransactionsRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.ListActiveTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListActiveTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List historical transactions (performed haircuts and picked up products).
     * </pre>
     */
    default void listHistoricalTransactions(server.CuttersApi.ListHistoricalTransactionsRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.ListHistoricalTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHistoricalTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all punched-in hairdressers for a given salon.
     * </pre>
     */
    default void getAvailableHairdressers(server.CuttersApi.AvailableHairdressersRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.AvailableHairdressersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableHairdressersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CuttersAPI.
   * <pre>
   * API for getting status about salons, or making bookings.
   * </pre>
   */
  public static abstract class CuttersAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CuttersAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CuttersAPI.
   * <pre>
   * API for getting status about salons, or making bookings.
   * </pre>
   */
  public static final class CuttersAPIStub
      extends io.grpc.stub.AbstractAsyncStub<CuttersAPIStub> {
    private CuttersAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CuttersAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CuttersAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all the salons with estimated waiting times.
     * </pre>
     */
    public void getWaitingTimes(server.CuttersApi.GetWaitingTimesRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetWaitingTimesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetWaitingTimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a salon with updated waiting-times.
     * </pre>
     */
    public void getSalon(server.CuttersApi.GetSalonRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetSalonResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSalonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Book a haircut.
     * </pre>
     */
    @java.lang.Deprecated
    public void book(server.CuttersApi.BookRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.BookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Purchase a certain number of haircuts and/or products.
     * </pre>
     */
    public void purchase(server.CuttersApi.PurchaseRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.PurchaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the payment-providers that are available to the app for the given user.
     * </pre>
     */
    public void getAvailablePaymentProviders(server.CuttersApi.GetAvailablePaymentProvidersRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetAvailablePaymentProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailablePaymentProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the total price for the requested items.
     * </pre>
     */
    public void getPrice(server.CuttersApi.GetPriceRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all active campaigns/sales.
     * </pre>
     */
    public void getCampaigns(server.CuttersApi.GetCampaignsRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetCampaignsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all the services available for a salon. The best-matching locale will be used.
     * </pre>
     */
    public void getServices(server.CuttersApi.GetServicesRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetServicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetServicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all the products available for a salon. The best-matching locale will be used.
     * </pre>
     */
    public void getProducts(server.CuttersApi.GetProductsRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the current waiting-status.
     * </pre>
     */
    public void getWaitingStatus(server.CuttersApi.GetWaitingStatusRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetWaitingStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaitingStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all current and historic purchases. Replaced by ListActiveTransactions and ListHistoricalTransactions.
     * </pre>
     */
    @java.lang.Deprecated
    public void listTransactions(server.CuttersApi.ListTransactionsRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.ListTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks if a voucher can be redeemed.
     * </pre>
     */
    public void canRedeemVoucher(server.CuttersApi.CanRedeemVoucherRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.CanRedeemVoucherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCanRedeemVoucherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a sharable voucher.
     * </pre>
     */
    public void createVoucher(server.CuttersApi.CreateVoucherRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.CreateVoucherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVoucherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Voucher referral-status.
     * </pre>
     */
    public void getReferralStatus(server.CuttersApi.GetReferralStatusRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.GetReferralStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReferralStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel a upcoming service.
     * </pre>
     */
    public void cancelService(server.CuttersApi.CancelServiceRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.CancelServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Log a remote event.
     * </pre>
     */
    public void remoteLog(server.CuttersApi.RemoteLogRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.RemoteLogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoteLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Force a timeout.
     * </pre>
     */
    public void timeout(server.CuttersApi.TimeoutRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.TimeoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTimeoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List active transactions (booked haircuts and products to pickup).
     * </pre>
     */
    public void listActiveTransactions(server.CuttersApi.ListActiveTransactionsRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.ListActiveTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListActiveTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List historical transactions (performed haircuts and picked up products).
     * </pre>
     */
    public void listHistoricalTransactions(server.CuttersApi.ListHistoricalTransactionsRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.ListHistoricalTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHistoricalTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all punched-in hairdressers for a given salon.
     * </pre>
     */
    public void getAvailableHairdressers(server.CuttersApi.AvailableHairdressersRequest request,
        io.grpc.stub.StreamObserver<server.CuttersApi.AvailableHairdressersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailableHairdressersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CuttersAPI.
   * <pre>
   * API for getting status about salons, or making bookings.
   * </pre>
   */
  public static final class CuttersAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CuttersAPIBlockingStub> {
    private CuttersAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CuttersAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CuttersAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all the salons with estimated waiting times.
     * </pre>
     */
    public java.util.Iterator<server.CuttersApi.GetWaitingTimesResponse> getWaitingTimes(
        server.CuttersApi.GetWaitingTimesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetWaitingTimesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a salon with updated waiting-times.
     * </pre>
     */
    public server.CuttersApi.GetSalonResponse getSalon(server.CuttersApi.GetSalonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSalonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Book a haircut.
     * </pre>
     */
    @java.lang.Deprecated
    public server.CuttersApi.BookResponse book(server.CuttersApi.BookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Purchase a certain number of haircuts and/or products.
     * </pre>
     */
    public server.CuttersApi.PurchaseResponse purchase(server.CuttersApi.PurchaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurchaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the payment-providers that are available to the app for the given user.
     * </pre>
     */
    public server.CuttersApi.GetAvailablePaymentProvidersResponse getAvailablePaymentProviders(server.CuttersApi.GetAvailablePaymentProvidersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailablePaymentProvidersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the total price for the requested items.
     * </pre>
     */
    public server.CuttersApi.GetPriceResponse getPrice(server.CuttersApi.GetPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all active campaigns/sales.
     * </pre>
     */
    public server.CuttersApi.GetCampaignsResponse getCampaigns(server.CuttersApi.GetCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all the services available for a salon. The best-matching locale will be used.
     * </pre>
     */
    public java.util.Iterator<server.CuttersApi.GetServicesResponse> getServices(
        server.CuttersApi.GetServicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetServicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all the products available for a salon. The best-matching locale will be used.
     * </pre>
     */
    public java.util.Iterator<server.CuttersApi.GetProductsResponse> getProducts(
        server.CuttersApi.GetProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the current waiting-status.
     * </pre>
     */
    public server.CuttersApi.GetWaitingStatusResponse getWaitingStatus(server.CuttersApi.GetWaitingStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaitingStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all current and historic purchases. Replaced by ListActiveTransactions and ListHistoricalTransactions.
     * </pre>
     */
    @java.lang.Deprecated
    public server.CuttersApi.ListTransactionsResponse listTransactions(server.CuttersApi.ListTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks if a voucher can be redeemed.
     * </pre>
     */
    public server.CuttersApi.CanRedeemVoucherResponse canRedeemVoucher(server.CuttersApi.CanRedeemVoucherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCanRedeemVoucherMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a sharable voucher.
     * </pre>
     */
    public server.CuttersApi.CreateVoucherResponse createVoucher(server.CuttersApi.CreateVoucherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVoucherMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Voucher referral-status.
     * </pre>
     */
    public server.CuttersApi.GetReferralStatusResponse getReferralStatus(server.CuttersApi.GetReferralStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReferralStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel a upcoming service.
     * </pre>
     */
    public server.CuttersApi.CancelServiceResponse cancelService(server.CuttersApi.CancelServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Log a remote event.
     * </pre>
     */
    public server.CuttersApi.RemoteLogResponse remoteLog(server.CuttersApi.RemoteLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoteLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Force a timeout.
     * </pre>
     */
    public server.CuttersApi.TimeoutResponse timeout(server.CuttersApi.TimeoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTimeoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List active transactions (booked haircuts and products to pickup).
     * </pre>
     */
    public server.CuttersApi.ListActiveTransactionsResponse listActiveTransactions(server.CuttersApi.ListActiveTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListActiveTransactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List historical transactions (performed haircuts and picked up products).
     * </pre>
     */
    public server.CuttersApi.ListHistoricalTransactionsResponse listHistoricalTransactions(server.CuttersApi.ListHistoricalTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHistoricalTransactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all punched-in hairdressers for a given salon.
     * </pre>
     */
    public server.CuttersApi.AvailableHairdressersResponse getAvailableHairdressers(server.CuttersApi.AvailableHairdressersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableHairdressersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CuttersAPI.
   * <pre>
   * API for getting status about salons, or making bookings.
   * </pre>
   */
  public static final class CuttersAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<CuttersAPIFutureStub> {
    private CuttersAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CuttersAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CuttersAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a salon with updated waiting-times.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.GetSalonResponse> getSalon(
        server.CuttersApi.GetSalonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSalonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Book a haircut.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.BookResponse> book(
        server.CuttersApi.BookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Purchase a certain number of haircuts and/or products.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.PurchaseResponse> purchase(
        server.CuttersApi.PurchaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the payment-providers that are available to the app for the given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.GetAvailablePaymentProvidersResponse> getAvailablePaymentProviders(
        server.CuttersApi.GetAvailablePaymentProvidersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailablePaymentProvidersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the total price for the requested items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.GetPriceResponse> getPrice(
        server.CuttersApi.GetPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all active campaigns/sales.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.GetCampaignsResponse> getCampaigns(
        server.CuttersApi.GetCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the current waiting-status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.GetWaitingStatusResponse> getWaitingStatus(
        server.CuttersApi.GetWaitingStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaitingStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all current and historic purchases. Replaced by ListActiveTransactions and ListHistoricalTransactions.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.ListTransactionsResponse> listTransactions(
        server.CuttersApi.ListTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransactionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks if a voucher can be redeemed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.CanRedeemVoucherResponse> canRedeemVoucher(
        server.CuttersApi.CanRedeemVoucherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCanRedeemVoucherMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a sharable voucher.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.CreateVoucherResponse> createVoucher(
        server.CuttersApi.CreateVoucherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVoucherMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Voucher referral-status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.GetReferralStatusResponse> getReferralStatus(
        server.CuttersApi.GetReferralStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReferralStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel a upcoming service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.CancelServiceResponse> cancelService(
        server.CuttersApi.CancelServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Log a remote event.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.RemoteLogResponse> remoteLog(
        server.CuttersApi.RemoteLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoteLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Force a timeout.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.TimeoutResponse> timeout(
        server.CuttersApi.TimeoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTimeoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List active transactions (booked haircuts and products to pickup).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.ListActiveTransactionsResponse> listActiveTransactions(
        server.CuttersApi.ListActiveTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListActiveTransactionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List historical transactions (performed haircuts and picked up products).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.ListHistoricalTransactionsResponse> listHistoricalTransactions(
        server.CuttersApi.ListHistoricalTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHistoricalTransactionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all punched-in hairdressers for a given salon.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<server.CuttersApi.AvailableHairdressersResponse> getAvailableHairdressers(
        server.CuttersApi.AvailableHairdressersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailableHairdressersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WAITING_TIMES = 0;
  private static final int METHODID_GET_SALON = 1;
  private static final int METHODID_BOOK = 2;
  private static final int METHODID_PURCHASE = 3;
  private static final int METHODID_GET_AVAILABLE_PAYMENT_PROVIDERS = 4;
  private static final int METHODID_GET_PRICE = 5;
  private static final int METHODID_GET_CAMPAIGNS = 6;
  private static final int METHODID_GET_SERVICES = 7;
  private static final int METHODID_GET_PRODUCTS = 8;
  private static final int METHODID_GET_WAITING_STATUS = 9;
  private static final int METHODID_LIST_TRANSACTIONS = 10;
  private static final int METHODID_CAN_REDEEM_VOUCHER = 11;
  private static final int METHODID_CREATE_VOUCHER = 12;
  private static final int METHODID_GET_REFERRAL_STATUS = 13;
  private static final int METHODID_CANCEL_SERVICE = 14;
  private static final int METHODID_REMOTE_LOG = 15;
  private static final int METHODID_TIMEOUT = 16;
  private static final int METHODID_LIST_ACTIVE_TRANSACTIONS = 17;
  private static final int METHODID_LIST_HISTORICAL_TRANSACTIONS = 18;
  private static final int METHODID_GET_AVAILABLE_HAIRDRESSERS = 19;

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
        case METHODID_GET_WAITING_TIMES:
          serviceImpl.getWaitingTimes((server.CuttersApi.GetWaitingTimesRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.GetWaitingTimesResponse>) responseObserver);
          break;
        case METHODID_GET_SALON:
          serviceImpl.getSalon((server.CuttersApi.GetSalonRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.GetSalonResponse>) responseObserver);
          break;
        case METHODID_BOOK:
          serviceImpl.book((server.CuttersApi.BookRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.BookResponse>) responseObserver);
          break;
        case METHODID_PURCHASE:
          serviceImpl.purchase((server.CuttersApi.PurchaseRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.PurchaseResponse>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_PAYMENT_PROVIDERS:
          serviceImpl.getAvailablePaymentProviders((server.CuttersApi.GetAvailablePaymentProvidersRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.GetAvailablePaymentProvidersResponse>) responseObserver);
          break;
        case METHODID_GET_PRICE:
          serviceImpl.getPrice((server.CuttersApi.GetPriceRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.GetPriceResponse>) responseObserver);
          break;
        case METHODID_GET_CAMPAIGNS:
          serviceImpl.getCampaigns((server.CuttersApi.GetCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.GetCampaignsResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICES:
          serviceImpl.getServices((server.CuttersApi.GetServicesRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.GetServicesResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((server.CuttersApi.GetProductsRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.GetProductsResponse>) responseObserver);
          break;
        case METHODID_GET_WAITING_STATUS:
          serviceImpl.getWaitingStatus((server.CuttersApi.GetWaitingStatusRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.GetWaitingStatusResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSACTIONS:
          serviceImpl.listTransactions((server.CuttersApi.ListTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.ListTransactionsResponse>) responseObserver);
          break;
        case METHODID_CAN_REDEEM_VOUCHER:
          serviceImpl.canRedeemVoucher((server.CuttersApi.CanRedeemVoucherRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.CanRedeemVoucherResponse>) responseObserver);
          break;
        case METHODID_CREATE_VOUCHER:
          serviceImpl.createVoucher((server.CuttersApi.CreateVoucherRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.CreateVoucherResponse>) responseObserver);
          break;
        case METHODID_GET_REFERRAL_STATUS:
          serviceImpl.getReferralStatus((server.CuttersApi.GetReferralStatusRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.GetReferralStatusResponse>) responseObserver);
          break;
        case METHODID_CANCEL_SERVICE:
          serviceImpl.cancelService((server.CuttersApi.CancelServiceRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.CancelServiceResponse>) responseObserver);
          break;
        case METHODID_REMOTE_LOG:
          serviceImpl.remoteLog((server.CuttersApi.RemoteLogRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.RemoteLogResponse>) responseObserver);
          break;
        case METHODID_TIMEOUT:
          serviceImpl.timeout((server.CuttersApi.TimeoutRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.TimeoutResponse>) responseObserver);
          break;
        case METHODID_LIST_ACTIVE_TRANSACTIONS:
          serviceImpl.listActiveTransactions((server.CuttersApi.ListActiveTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.ListActiveTransactionsResponse>) responseObserver);
          break;
        case METHODID_LIST_HISTORICAL_TRANSACTIONS:
          serviceImpl.listHistoricalTransactions((server.CuttersApi.ListHistoricalTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.ListHistoricalTransactionsResponse>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_HAIRDRESSERS:
          serviceImpl.getAvailableHairdressers((server.CuttersApi.AvailableHairdressersRequest) request,
              (io.grpc.stub.StreamObserver<server.CuttersApi.AvailableHairdressersResponse>) responseObserver);
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
          getGetWaitingTimesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              server.CuttersApi.GetWaitingTimesRequest,
              server.CuttersApi.GetWaitingTimesResponse>(
                service, METHODID_GET_WAITING_TIMES)))
        .addMethod(
          getGetSalonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.GetSalonRequest,
              server.CuttersApi.GetSalonResponse>(
                service, METHODID_GET_SALON)))
        .addMethod(
          getBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.BookRequest,
              server.CuttersApi.BookResponse>(
                service, METHODID_BOOK)))
        .addMethod(
          getPurchaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.PurchaseRequest,
              server.CuttersApi.PurchaseResponse>(
                service, METHODID_PURCHASE)))
        .addMethod(
          getGetAvailablePaymentProvidersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.GetAvailablePaymentProvidersRequest,
              server.CuttersApi.GetAvailablePaymentProvidersResponse>(
                service, METHODID_GET_AVAILABLE_PAYMENT_PROVIDERS)))
        .addMethod(
          getGetPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.GetPriceRequest,
              server.CuttersApi.GetPriceResponse>(
                service, METHODID_GET_PRICE)))
        .addMethod(
          getGetCampaignsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.GetCampaignsRequest,
              server.CuttersApi.GetCampaignsResponse>(
                service, METHODID_GET_CAMPAIGNS)))
        .addMethod(
          getGetServicesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              server.CuttersApi.GetServicesRequest,
              server.CuttersApi.GetServicesResponse>(
                service, METHODID_GET_SERVICES)))
        .addMethod(
          getGetProductsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              server.CuttersApi.GetProductsRequest,
              server.CuttersApi.GetProductsResponse>(
                service, METHODID_GET_PRODUCTS)))
        .addMethod(
          getGetWaitingStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.GetWaitingStatusRequest,
              server.CuttersApi.GetWaitingStatusResponse>(
                service, METHODID_GET_WAITING_STATUS)))
        .addMethod(
          getListTransactionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.ListTransactionsRequest,
              server.CuttersApi.ListTransactionsResponse>(
                service, METHODID_LIST_TRANSACTIONS)))
        .addMethod(
          getCanRedeemVoucherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.CanRedeemVoucherRequest,
              server.CuttersApi.CanRedeemVoucherResponse>(
                service, METHODID_CAN_REDEEM_VOUCHER)))
        .addMethod(
          getCreateVoucherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.CreateVoucherRequest,
              server.CuttersApi.CreateVoucherResponse>(
                service, METHODID_CREATE_VOUCHER)))
        .addMethod(
          getGetReferralStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.GetReferralStatusRequest,
              server.CuttersApi.GetReferralStatusResponse>(
                service, METHODID_GET_REFERRAL_STATUS)))
        .addMethod(
          getCancelServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.CancelServiceRequest,
              server.CuttersApi.CancelServiceResponse>(
                service, METHODID_CANCEL_SERVICE)))
        .addMethod(
          getRemoteLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.RemoteLogRequest,
              server.CuttersApi.RemoteLogResponse>(
                service, METHODID_REMOTE_LOG)))
        .addMethod(
          getTimeoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.TimeoutRequest,
              server.CuttersApi.TimeoutResponse>(
                service, METHODID_TIMEOUT)))
        .addMethod(
          getListActiveTransactionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.ListActiveTransactionsRequest,
              server.CuttersApi.ListActiveTransactionsResponse>(
                service, METHODID_LIST_ACTIVE_TRANSACTIONS)))
        .addMethod(
          getListHistoricalTransactionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.ListHistoricalTransactionsRequest,
              server.CuttersApi.ListHistoricalTransactionsResponse>(
                service, METHODID_LIST_HISTORICAL_TRANSACTIONS)))
        .addMethod(
          getGetAvailableHairdressersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              server.CuttersApi.AvailableHairdressersRequest,
              server.CuttersApi.AvailableHairdressersResponse>(
                service, METHODID_GET_AVAILABLE_HAIRDRESSERS)))
        .build();
  }

  private static abstract class CuttersAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CuttersAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return server.CuttersApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CuttersAPI");
    }
  }

  private static final class CuttersAPIFileDescriptorSupplier
      extends CuttersAPIBaseDescriptorSupplier {
    CuttersAPIFileDescriptorSupplier() {}
  }

  private static final class CuttersAPIMethodDescriptorSupplier
      extends CuttersAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CuttersAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CuttersAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CuttersAPIFileDescriptorSupplier())
              .addMethod(getGetWaitingTimesMethod())
              .addMethod(getGetSalonMethod())
              .addMethod(getBookMethod())
              .addMethod(getPurchaseMethod())
              .addMethod(getGetAvailablePaymentProvidersMethod())
              .addMethod(getGetPriceMethod())
              .addMethod(getGetCampaignsMethod())
              .addMethod(getGetServicesMethod())
              .addMethod(getGetProductsMethod())
              .addMethod(getGetWaitingStatusMethod())
              .addMethod(getListTransactionsMethod())
              .addMethod(getCanRedeemVoucherMethod())
              .addMethod(getCreateVoucherMethod())
              .addMethod(getGetReferralStatusMethod())
              .addMethod(getCancelServiceMethod())
              .addMethod(getRemoteLogMethod())
              .addMethod(getTimeoutMethod())
              .addMethod(getListActiveTransactionsMethod())
              .addMethod(getListHistoricalTransactionsMethod())
              .addMethod(getGetAvailableHairdressersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
