// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutHttp2Idle;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutHttp2PerRequest;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecListenerTimeoutHttp2 {
    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutHttp2Idle idle;
    /**
     * The per request timeout.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutHttp2PerRequest perRequest;

    @CustomType.Constructor
    private VirtualNodeSpecListenerTimeoutHttp2(
        @CustomType.Parameter("idle") @Nullable VirtualNodeSpecListenerTimeoutHttp2Idle idle,
        @CustomType.Parameter("perRequest") @Nullable VirtualNodeSpecListenerTimeoutHttp2PerRequest perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
    */
    public Optional<VirtualNodeSpecListenerTimeoutHttp2Idle> idle() {
        return Optional.ofNullable(this.idle);
    }
    /**
     * The per request timeout.
     * 
    */
    public Optional<VirtualNodeSpecListenerTimeoutHttp2PerRequest> perRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutHttp2 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecListenerTimeoutHttp2Idle idle;
        private @Nullable VirtualNodeSpecListenerTimeoutHttp2PerRequest perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutHttp2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable VirtualNodeSpecListenerTimeoutHttp2Idle idle) {
            this.idle = idle;
            return this;
        }
        public Builder perRequest(@Nullable VirtualNodeSpecListenerTimeoutHttp2PerRequest perRequest) {
            this.perRequest = perRequest;
            return this;
        }        public VirtualNodeSpecListenerTimeoutHttp2 build() {
            return new VirtualNodeSpecListenerTimeoutHttp2(idle, perRequest);
        }
    }
}
