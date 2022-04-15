// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyGetArgs();

    /**
     * The Transport Layer Security (TLS) client policy.
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs> tls;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs> tls() {
        return this.tls == null ? Codegen.empty() : this.tls;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyGetArgs(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs> tls) {
        this.tls = tls;
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyGetArgs() {
        this.tls = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        public Builder tls(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsGetArgs tls) {
            this.tls = Codegen.ofNullable(tls);
            return this;
        }        public VirtualNodeSpecBackendDefaultsClientPolicyGetArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyGetArgs(tls);
        }
    }
}
