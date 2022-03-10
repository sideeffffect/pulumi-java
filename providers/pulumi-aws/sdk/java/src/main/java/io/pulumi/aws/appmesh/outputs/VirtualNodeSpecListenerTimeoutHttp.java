// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutHttpIdle;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutHttpPerRequest;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecListenerTimeoutHttp {
    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutHttpIdle idle;
    /**
     * The per request timeout.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutHttpPerRequest perRequest;

    @OutputCustomType.Constructor
    private VirtualNodeSpecListenerTimeoutHttp(
        @OutputCustomType.Parameter("idle") @Nullable VirtualNodeSpecListenerTimeoutHttpIdle idle,
        @OutputCustomType.Parameter("perRequest") @Nullable VirtualNodeSpecListenerTimeoutHttpPerRequest perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
    */
    public Optional<VirtualNodeSpecListenerTimeoutHttpIdle> getIdle() {
        return Optional.ofNullable(this.idle);
    }
    /**
     * The per request timeout.
     * 
    */
    public Optional<VirtualNodeSpecListenerTimeoutHttpPerRequest> getPerRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutHttp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecListenerTimeoutHttpIdle idle;
        private @Nullable VirtualNodeSpecListenerTimeoutHttpPerRequest perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable VirtualNodeSpecListenerTimeoutHttpIdle idle) {
            this.idle = idle;
            return this;
        }

        public Builder perRequest(@Nullable VirtualNodeSpecListenerTimeoutHttpPerRequest perRequest) {
            this.perRequest = perRequest;
            return this;
        }
        public VirtualNodeSpecListenerTimeoutHttp build() {
            return new VirtualNodeSpecListenerTimeoutHttp(idle, perRequest);
        }
    }
}
