package TaocheES;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *grpc 服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: taochees.proto")
public final class TaocheESServiceGrpc {

  private TaocheESServiceGrpc() {}

  public static final String SERVICE_NAME = "TaocheES.TaocheESService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchTaocheCarMethod()} instead. 
  public static final io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> METHOD_SEARCH_TAOCHE_CAR = getSearchTaocheCarMethodHelper();

  private static volatile io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> getSearchTaocheCarMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> getSearchTaocheCarMethod() {
    return getSearchTaocheCarMethodHelper();
  }

  private static io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> getSearchTaocheCarMethodHelper() {
    io.grpc.MethodDescriptor<TaocheES.SearchCondition, TaocheES.SearchResult> getSearchTaocheCarMethod;
    if ((getSearchTaocheCarMethod = TaocheESServiceGrpc.getSearchTaocheCarMethod) == null) {
      synchronized (TaocheESServiceGrpc.class) {
        if ((getSearchTaocheCarMethod = TaocheESServiceGrpc.getSearchTaocheCarMethod) == null) {
          TaocheESServiceGrpc.getSearchTaocheCarMethod = getSearchTaocheCarMethod = 
              io.grpc.MethodDescriptor.<TaocheES.SearchCondition, TaocheES.SearchResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TaocheES.TaocheESService", "SearchTaocheCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TaocheES.SearchCondition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TaocheES.SearchResult.getDefaultInstance()))
                  .setSchemaDescriptor(new TaocheESServiceMethodDescriptorSupplier("SearchTaocheCar"))
                  .build();
          }
        }
     }
     return getSearchTaocheCarMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchJDCarMethod()} instead. 
  public static final io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> METHOD_SEARCH_JDCAR = getSearchJDCarMethodHelper();

  private static volatile io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> getSearchJDCarMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> getSearchJDCarMethod() {
    return getSearchJDCarMethodHelper();
  }

  private static io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> getSearchJDCarMethodHelper() {
    io.grpc.MethodDescriptor<TaocheES.SearchCondition, TaocheES.SearchResult> getSearchJDCarMethod;
    if ((getSearchJDCarMethod = TaocheESServiceGrpc.getSearchJDCarMethod) == null) {
      synchronized (TaocheESServiceGrpc.class) {
        if ((getSearchJDCarMethod = TaocheESServiceGrpc.getSearchJDCarMethod) == null) {
          TaocheESServiceGrpc.getSearchJDCarMethod = getSearchJDCarMethod = 
              io.grpc.MethodDescriptor.<TaocheES.SearchCondition, TaocheES.SearchResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TaocheES.TaocheESService", "SearchJDCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TaocheES.SearchCondition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TaocheES.SearchResult.getDefaultInstance()))
                  .setSchemaDescriptor(new TaocheESServiceMethodDescriptorSupplier("SearchJDCar"))
                  .build();
          }
        }
     }
     return getSearchJDCarMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchCPCCarMethod()} instead. 
  public static final io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> METHOD_SEARCH_CPCCAR = getSearchCPCCarMethodHelper();

  private static volatile io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> getSearchCPCCarMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> getSearchCPCCarMethod() {
    return getSearchCPCCarMethodHelper();
  }

  private static io.grpc.MethodDescriptor<TaocheES.SearchCondition,
      TaocheES.SearchResult> getSearchCPCCarMethodHelper() {
    io.grpc.MethodDescriptor<TaocheES.SearchCondition, TaocheES.SearchResult> getSearchCPCCarMethod;
    if ((getSearchCPCCarMethod = TaocheESServiceGrpc.getSearchCPCCarMethod) == null) {
      synchronized (TaocheESServiceGrpc.class) {
        if ((getSearchCPCCarMethod = TaocheESServiceGrpc.getSearchCPCCarMethod) == null) {
          TaocheESServiceGrpc.getSearchCPCCarMethod = getSearchCPCCarMethod = 
              io.grpc.MethodDescriptor.<TaocheES.SearchCondition, TaocheES.SearchResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TaocheES.TaocheESService", "SearchCPCCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TaocheES.SearchCondition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TaocheES.SearchResult.getDefaultInstance()))
                  .setSchemaDescriptor(new TaocheESServiceMethodDescriptorSupplier("SearchCPCCar"))
                  .build();
          }
        }
     }
     return getSearchCPCCarMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchQuestionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<TaocheES.SearchQuestionCondition,
      TaocheES.SearchResult> METHOD_SEARCH_QUESTION = getSearchQuestionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<TaocheES.SearchQuestionCondition,
      TaocheES.SearchResult> getSearchQuestionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<TaocheES.SearchQuestionCondition,
      TaocheES.SearchResult> getSearchQuestionMethod() {
    return getSearchQuestionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<TaocheES.SearchQuestionCondition,
      TaocheES.SearchResult> getSearchQuestionMethodHelper() {
    io.grpc.MethodDescriptor<TaocheES.SearchQuestionCondition, TaocheES.SearchResult> getSearchQuestionMethod;
    if ((getSearchQuestionMethod = TaocheESServiceGrpc.getSearchQuestionMethod) == null) {
      synchronized (TaocheESServiceGrpc.class) {
        if ((getSearchQuestionMethod = TaocheESServiceGrpc.getSearchQuestionMethod) == null) {
          TaocheESServiceGrpc.getSearchQuestionMethod = getSearchQuestionMethod = 
              io.grpc.MethodDescriptor.<TaocheES.SearchQuestionCondition, TaocheES.SearchResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TaocheES.TaocheESService", "SearchQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TaocheES.SearchQuestionCondition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TaocheES.SearchResult.getDefaultInstance()))
                  .setSchemaDescriptor(new TaocheESServiceMethodDescriptorSupplier("SearchQuestion"))
                  .build();
          }
        }
     }
     return getSearchQuestionMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchRecommendCarMethod()} instead. 
  public static final io.grpc.MethodDescriptor<TaocheES.SearchRecommendCondition,
      TaocheES.SearchRecommendResult> METHOD_SEARCH_RECOMMEND_CAR = getSearchRecommendCarMethodHelper();

  private static volatile io.grpc.MethodDescriptor<TaocheES.SearchRecommendCondition,
      TaocheES.SearchRecommendResult> getSearchRecommendCarMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<TaocheES.SearchRecommendCondition,
      TaocheES.SearchRecommendResult> getSearchRecommendCarMethod() {
    return getSearchRecommendCarMethodHelper();
  }

  private static io.grpc.MethodDescriptor<TaocheES.SearchRecommendCondition,
      TaocheES.SearchRecommendResult> getSearchRecommendCarMethodHelper() {
    io.grpc.MethodDescriptor<TaocheES.SearchRecommendCondition, TaocheES.SearchRecommendResult> getSearchRecommendCarMethod;
    if ((getSearchRecommendCarMethod = TaocheESServiceGrpc.getSearchRecommendCarMethod) == null) {
      synchronized (TaocheESServiceGrpc.class) {
        if ((getSearchRecommendCarMethod = TaocheESServiceGrpc.getSearchRecommendCarMethod) == null) {
          TaocheESServiceGrpc.getSearchRecommendCarMethod = getSearchRecommendCarMethod = 
              io.grpc.MethodDescriptor.<TaocheES.SearchRecommendCondition, TaocheES.SearchRecommendResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TaocheES.TaocheESService", "SearchRecommendCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TaocheES.SearchRecommendCondition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TaocheES.SearchRecommendResult.getDefaultInstance()))
                  .setSchemaDescriptor(new TaocheESServiceMethodDescriptorSupplier("SearchRecommendCar"))
                  .build();
          }
        }
     }
     return getSearchRecommendCarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaocheESServiceStub newStub(io.grpc.Channel channel) {
    return new TaocheESServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaocheESServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TaocheESServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaocheESServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TaocheESServiceFutureStub(channel);
  }

  /**
   * <pre>
   *grpc 服务
   * </pre>
   */
  public static abstract class TaocheESServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchTaocheCar(TaocheES.SearchCondition request,
        io.grpc.stub.StreamObserver<TaocheES.SearchResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchTaocheCarMethodHelper(), responseObserver);
    }

    /**
     */
    public void searchJDCar(TaocheES.SearchCondition request,
        io.grpc.stub.StreamObserver<TaocheES.SearchResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchJDCarMethodHelper(), responseObserver);
    }

    /**
     */
    public void searchCPCCar(TaocheES.SearchCondition request,
        io.grpc.stub.StreamObserver<TaocheES.SearchResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchCPCCarMethodHelper(), responseObserver);
    }

    /**
     */
    public void searchQuestion(TaocheES.SearchQuestionCondition request,
        io.grpc.stub.StreamObserver<TaocheES.SearchResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchQuestionMethodHelper(), responseObserver);
    }

    /**
     */
    public void searchRecommendCar(TaocheES.SearchRecommendCondition request,
        io.grpc.stub.StreamObserver<TaocheES.SearchRecommendResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchRecommendCarMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchTaocheCarMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                TaocheES.SearchCondition,
                TaocheES.SearchResult>(
                  this, METHODID_SEARCH_TAOCHE_CAR)))
          .addMethod(
            getSearchJDCarMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                TaocheES.SearchCondition,
                TaocheES.SearchResult>(
                  this, METHODID_SEARCH_JDCAR)))
          .addMethod(
            getSearchCPCCarMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                TaocheES.SearchCondition,
                TaocheES.SearchResult>(
                  this, METHODID_SEARCH_CPCCAR)))
          .addMethod(
            getSearchQuestionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                TaocheES.SearchQuestionCondition,
                TaocheES.SearchResult>(
                  this, METHODID_SEARCH_QUESTION)))
          .addMethod(
            getSearchRecommendCarMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                TaocheES.SearchRecommendCondition,
                TaocheES.SearchRecommendResult>(
                  this, METHODID_SEARCH_RECOMMEND_CAR)))
          .build();
    }
  }

  /**
   * <pre>
   *grpc 服务
   * </pre>
   */
  public static final class TaocheESServiceStub extends io.grpc.stub.AbstractStub<TaocheESServiceStub> {
    private TaocheESServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaocheESServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaocheESServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaocheESServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchTaocheCar(TaocheES.SearchCondition request,
        io.grpc.stub.StreamObserver<TaocheES.SearchResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchTaocheCarMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchJDCar(TaocheES.SearchCondition request,
        io.grpc.stub.StreamObserver<TaocheES.SearchResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchJDCarMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchCPCCar(TaocheES.SearchCondition request,
        io.grpc.stub.StreamObserver<TaocheES.SearchResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchCPCCarMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchQuestion(TaocheES.SearchQuestionCondition request,
        io.grpc.stub.StreamObserver<TaocheES.SearchResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchQuestionMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchRecommendCar(TaocheES.SearchRecommendCondition request,
        io.grpc.stub.StreamObserver<TaocheES.SearchRecommendResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchRecommendCarMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *grpc 服务
   * </pre>
   */
  public static final class TaocheESServiceBlockingStub extends io.grpc.stub.AbstractStub<TaocheESServiceBlockingStub> {
    private TaocheESServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaocheESServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaocheESServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaocheESServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public TaocheES.SearchResult searchTaocheCar(TaocheES.SearchCondition request) {
      return blockingUnaryCall(
          getChannel(), getSearchTaocheCarMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public TaocheES.SearchResult searchJDCar(TaocheES.SearchCondition request) {
      return blockingUnaryCall(
          getChannel(), getSearchJDCarMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public TaocheES.SearchResult searchCPCCar(TaocheES.SearchCondition request) {
      return blockingUnaryCall(
          getChannel(), getSearchCPCCarMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public TaocheES.SearchResult searchQuestion(TaocheES.SearchQuestionCondition request) {
      return blockingUnaryCall(
          getChannel(), getSearchQuestionMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public TaocheES.SearchRecommendResult searchRecommendCar(TaocheES.SearchRecommendCondition request) {
      return blockingUnaryCall(
          getChannel(), getSearchRecommendCarMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *grpc 服务
   * </pre>
   */
  public static final class TaocheESServiceFutureStub extends io.grpc.stub.AbstractStub<TaocheESServiceFutureStub> {
    private TaocheESServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaocheESServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaocheESServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaocheESServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TaocheES.SearchResult> searchTaocheCar(
        TaocheES.SearchCondition request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchTaocheCarMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TaocheES.SearchResult> searchJDCar(
        TaocheES.SearchCondition request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchJDCarMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TaocheES.SearchResult> searchCPCCar(
        TaocheES.SearchCondition request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchCPCCarMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TaocheES.SearchResult> searchQuestion(
        TaocheES.SearchQuestionCondition request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchQuestionMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TaocheES.SearchRecommendResult> searchRecommendCar(
        TaocheES.SearchRecommendCondition request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchRecommendCarMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_TAOCHE_CAR = 0;
  private static final int METHODID_SEARCH_JDCAR = 1;
  private static final int METHODID_SEARCH_CPCCAR = 2;
  private static final int METHODID_SEARCH_QUESTION = 3;
  private static final int METHODID_SEARCH_RECOMMEND_CAR = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaocheESServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TaocheESServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_TAOCHE_CAR:
          serviceImpl.searchTaocheCar((TaocheES.SearchCondition) request,
              (io.grpc.stub.StreamObserver<TaocheES.SearchResult>) responseObserver);
          break;
        case METHODID_SEARCH_JDCAR:
          serviceImpl.searchJDCar((TaocheES.SearchCondition) request,
              (io.grpc.stub.StreamObserver<TaocheES.SearchResult>) responseObserver);
          break;
        case METHODID_SEARCH_CPCCAR:
          serviceImpl.searchCPCCar((TaocheES.SearchCondition) request,
              (io.grpc.stub.StreamObserver<TaocheES.SearchResult>) responseObserver);
          break;
        case METHODID_SEARCH_QUESTION:
          serviceImpl.searchQuestion((TaocheES.SearchQuestionCondition) request,
              (io.grpc.stub.StreamObserver<TaocheES.SearchResult>) responseObserver);
          break;
        case METHODID_SEARCH_RECOMMEND_CAR:
          serviceImpl.searchRecommendCar((TaocheES.SearchRecommendCondition) request,
              (io.grpc.stub.StreamObserver<TaocheES.SearchRecommendResult>) responseObserver);
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

  private static abstract class TaocheESServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaocheESServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return TaocheES.Taochees.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaocheESService");
    }
  }

  private static final class TaocheESServiceFileDescriptorSupplier
      extends TaocheESServiceBaseDescriptorSupplier {
    TaocheESServiceFileDescriptorSupplier() {}
  }

  private static final class TaocheESServiceMethodDescriptorSupplier
      extends TaocheESServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TaocheESServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TaocheESServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaocheESServiceFileDescriptorSupplier())
              .addMethod(getSearchTaocheCarMethodHelper())
              .addMethod(getSearchJDCarMethodHelper())
              .addMethod(getSearchCPCCarMethodHelper())
              .addMethod(getSearchQuestionMethodHelper())
              .addMethod(getSearchRecommendCarMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
