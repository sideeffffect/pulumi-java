// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolGrpcGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolHttp2GetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolHttpGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolTcpGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerConnectionPoolGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerConnectionPoolGetArgs Empty = new VirtualNodeSpecListenerConnectionPoolGetArgs();

    /**
     * Connection pool information for gRPC listeners.
     * 
     */
    @Import(name="grpc")
      private final @Nullable Output<VirtualNodeSpecListenerConnectionPoolGrpcGetArgs> grpc;

    public Output<VirtualNodeSpecListenerConnectionPoolGrpcGetArgs> grpc() {
        return this.grpc == null ? Codegen.empty() : this.grpc;
    }

    /**
     * Connection pool information for HTTP listeners.
     * 
     */
    @Import(name="http")
      private final @Nullable Output<VirtualNodeSpecListenerConnectionPoolHttpGetArgs> http;

    public Output<VirtualNodeSpecListenerConnectionPoolHttpGetArgs> http() {
        return this.http == null ? Codegen.empty() : this.http;
    }

    /**
     * Connection pool information for HTTP2 listeners.
     * 
     */
    @Import(name="http2")
      private final @Nullable Output<VirtualNodeSpecListenerConnectionPoolHttp2GetArgs> http2;

    public Output<VirtualNodeSpecListenerConnectionPoolHttp2GetArgs> http2() {
        return this.http2 == null ? Codegen.empty() : this.http2;
    }

    /**
     * Connection pool information for TCP listeners.
     * 
     */
    @Import(name="tcp")
      private final @Nullable Output<VirtualNodeSpecListenerConnectionPoolTcpGetArgs> tcp;

    public Output<VirtualNodeSpecListenerConnectionPoolTcpGetArgs> tcp() {
        return this.tcp == null ? Codegen.empty() : this.tcp;
    }

    public VirtualNodeSpecListenerConnectionPoolGetArgs(
        @Nullable Output<VirtualNodeSpecListenerConnectionPoolGrpcGetArgs> grpc,
        @Nullable Output<VirtualNodeSpecListenerConnectionPoolHttpGetArgs> http,
        @Nullable Output<VirtualNodeSpecListenerConnectionPoolHttp2GetArgs> http2,
        @Nullable Output<VirtualNodeSpecListenerConnectionPoolTcpGetArgs> tcp) {
        this.grpc = grpc;
        this.http = http;
        this.http2 = http2;
        this.tcp = tcp;
    }

    private VirtualNodeSpecListenerConnectionPoolGetArgs() {
        this.grpc = Codegen.empty();
        this.http = Codegen.empty();
        this.http2 = Codegen.empty();
        this.tcp = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecListenerConnectionPoolGrpcGetArgs> grpc;
        private @Nullable Output<VirtualNodeSpecListenerConnectionPoolHttpGetArgs> http;
        private @Nullable Output<VirtualNodeSpecListenerConnectionPoolHttp2GetArgs> http2;
        private @Nullable Output<VirtualNodeSpecListenerConnectionPoolTcpGetArgs> tcp;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpc = defaults.grpc;
    	      this.http = defaults.http;
    	      this.http2 = defaults.http2;
    	      this.tcp = defaults.tcp;
        }

        public Builder grpc(@Nullable Output<VirtualNodeSpecListenerConnectionPoolGrpcGetArgs> grpc) {
            this.grpc = grpc;
            return this;
        }
        public Builder grpc(@Nullable VirtualNodeSpecListenerConnectionPoolGrpcGetArgs grpc) {
            this.grpc = Codegen.ofNullable(grpc);
            return this;
        }
        public Builder http(@Nullable Output<VirtualNodeSpecListenerConnectionPoolHttpGetArgs> http) {
            this.http = http;
            return this;
        }
        public Builder http(@Nullable VirtualNodeSpecListenerConnectionPoolHttpGetArgs http) {
            this.http = Codegen.ofNullable(http);
            return this;
        }
        public Builder http2(@Nullable Output<VirtualNodeSpecListenerConnectionPoolHttp2GetArgs> http2) {
            this.http2 = http2;
            return this;
        }
        public Builder http2(@Nullable VirtualNodeSpecListenerConnectionPoolHttp2GetArgs http2) {
            this.http2 = Codegen.ofNullable(http2);
            return this;
        }
        public Builder tcp(@Nullable Output<VirtualNodeSpecListenerConnectionPoolTcpGetArgs> tcp) {
            this.tcp = tcp;
            return this;
        }
        public Builder tcp(@Nullable VirtualNodeSpecListenerConnectionPoolTcpGetArgs tcp) {
            this.tcp = Codegen.ofNullable(tcp);
            return this;
        }        public VirtualNodeSpecListenerConnectionPoolGetArgs build() {
            return new VirtualNodeSpecListenerConnectionPoolGetArgs(grpc, http, http2, tcp);
        }
    }
}
