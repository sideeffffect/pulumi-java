// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpIdleGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutHttpGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutHttpGetArgs Empty = new VirtualNodeSpecListenerTimeoutHttpGetArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @Import(name="idle")
      private final @Nullable Output<VirtualNodeSpecListenerTimeoutHttpIdleGetArgs> idle;

    public Output<VirtualNodeSpecListenerTimeoutHttpIdleGetArgs> idle() {
        return this.idle == null ? Codegen.empty() : this.idle;
    }

    /**
     * The per request timeout.
     * 
     */
    @Import(name="perRequest")
      private final @Nullable Output<VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs> perRequest;

    public Output<VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs> perRequest() {
        return this.perRequest == null ? Codegen.empty() : this.perRequest;
    }

    public VirtualNodeSpecListenerTimeoutHttpGetArgs(
        @Nullable Output<VirtualNodeSpecListenerTimeoutHttpIdleGetArgs> idle,
        @Nullable Output<VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs> perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    private VirtualNodeSpecListenerTimeoutHttpGetArgs() {
        this.idle = Codegen.empty();
        this.perRequest = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutHttpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecListenerTimeoutHttpIdleGetArgs> idle;
        private @Nullable Output<VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs> perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutHttpGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable Output<VirtualNodeSpecListenerTimeoutHttpIdleGetArgs> idle) {
            this.idle = idle;
            return this;
        }
        public Builder idle(@Nullable VirtualNodeSpecListenerTimeoutHttpIdleGetArgs idle) {
            this.idle = Codegen.ofNullable(idle);
            return this;
        }
        public Builder perRequest(@Nullable Output<VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs> perRequest) {
            this.perRequest = perRequest;
            return this;
        }
        public Builder perRequest(@Nullable VirtualNodeSpecListenerTimeoutHttpPerRequestGetArgs perRequest) {
            this.perRequest = Codegen.ofNullable(perRequest);
            return this;
        }        public VirtualNodeSpecListenerTimeoutHttpGetArgs build() {
            return new VirtualNodeSpecListenerTimeoutHttpGetArgs(idle, perRequest);
        }
    }
}
