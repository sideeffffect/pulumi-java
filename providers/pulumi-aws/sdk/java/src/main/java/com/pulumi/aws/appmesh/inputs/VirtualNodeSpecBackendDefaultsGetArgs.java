// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsGetArgs Empty = new VirtualNodeSpecBackendDefaultsGetArgs();

    /**
     * The default client policy for virtual service backends. See above for details.
     * 
     */
    @Import(name="clientPolicy")
    private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyGetArgs> clientPolicy;

    public Optional<Output<VirtualNodeSpecBackendDefaultsClientPolicyGetArgs>> clientPolicy() {
        return Optional.ofNullable(this.clientPolicy);
    }

    private VirtualNodeSpecBackendDefaultsGetArgs() {}

    private VirtualNodeSpecBackendDefaultsGetArgs(VirtualNodeSpecBackendDefaultsGetArgs $) {
        this.clientPolicy = $.clientPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendDefaultsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendDefaultsGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendDefaultsGetArgs();
        }

        public Builder(VirtualNodeSpecBackendDefaultsGetArgs defaults) {
            $ = new VirtualNodeSpecBackendDefaultsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientPolicy(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyGetArgs> clientPolicy) {
            $.clientPolicy = clientPolicy;
            return this;
        }

        public Builder clientPolicy(VirtualNodeSpecBackendDefaultsClientPolicyGetArgs clientPolicy) {
            return clientPolicy(Output.of(clientPolicy));
        }

        public VirtualNodeSpecBackendDefaultsGetArgs build() {
            return $;
        }
    }

}
