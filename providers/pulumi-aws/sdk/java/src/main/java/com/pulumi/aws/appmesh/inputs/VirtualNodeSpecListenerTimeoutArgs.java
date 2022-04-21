// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttp2Args;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpArgs;
import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutTcpArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutArgs Empty = new VirtualNodeSpecListenerTimeoutArgs();

    /**
     * Timeouts for gRPC listeners.
     * 
     */
    @Import(name="grpc")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutGrpcArgs> grpc;

    public Optional<Output<VirtualNodeSpecListenerTimeoutGrpcArgs>> grpc() {
        return Optional.ofNullable(this.grpc);
    }

    /**
     * Timeouts for HTTP listeners.
     * 
     */
    @Import(name="http")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutHttpArgs> http;

    public Optional<Output<VirtualNodeSpecListenerTimeoutHttpArgs>> http() {
        return Optional.ofNullable(this.http);
    }

    /**
     * Timeouts for HTTP2 listeners.
     * 
     */
    @Import(name="http2")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutHttp2Args> http2;

    public Optional<Output<VirtualNodeSpecListenerTimeoutHttp2Args>> http2() {
        return Optional.ofNullable(this.http2);
    }

    /**
     * Timeouts for TCP listeners.
     * 
     */
    @Import(name="tcp")
    private @Nullable Output<VirtualNodeSpecListenerTimeoutTcpArgs> tcp;

    public Optional<Output<VirtualNodeSpecListenerTimeoutTcpArgs>> tcp() {
        return Optional.ofNullable(this.tcp);
    }

    private VirtualNodeSpecListenerTimeoutArgs() {}

    private VirtualNodeSpecListenerTimeoutArgs(VirtualNodeSpecListenerTimeoutArgs $) {
        this.grpc = $.grpc;
        this.http = $.http;
        this.http2 = $.http2;
        this.tcp = $.tcp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecListenerTimeoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTimeoutArgs $;

        public Builder() {
            $ = new VirtualNodeSpecListenerTimeoutArgs();
        }

        public Builder(VirtualNodeSpecListenerTimeoutArgs defaults) {
            $ = new VirtualNodeSpecListenerTimeoutArgs(Objects.requireNonNull(defaults));
        }

        public Builder grpc(@Nullable Output<VirtualNodeSpecListenerTimeoutGrpcArgs> grpc) {
            $.grpc = grpc;
            return this;
        }

        public Builder grpc(VirtualNodeSpecListenerTimeoutGrpcArgs grpc) {
            return grpc(Output.of(grpc));
        }

        public Builder http(@Nullable Output<VirtualNodeSpecListenerTimeoutHttpArgs> http) {
            $.http = http;
            return this;
        }

        public Builder http(VirtualNodeSpecListenerTimeoutHttpArgs http) {
            return http(Output.of(http));
        }

        public Builder http2(@Nullable Output<VirtualNodeSpecListenerTimeoutHttp2Args> http2) {
            $.http2 = http2;
            return this;
        }

        public Builder http2(VirtualNodeSpecListenerTimeoutHttp2Args http2) {
            return http2(Output.of(http2));
        }

        public Builder tcp(@Nullable Output<VirtualNodeSpecListenerTimeoutTcpArgs> tcp) {
            $.tcp = tcp;
            return this;
        }

        public Builder tcp(VirtualNodeSpecListenerTimeoutTcpArgs tcp) {
            return tcp(Output.of(tcp));
        }

        public VirtualNodeSpecListenerTimeoutArgs build() {
            return $;
        }
    }

}
