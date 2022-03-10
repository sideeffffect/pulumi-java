// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs();

    /**
     * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
     */
    @InputImport(name="acm")
      private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs> acm;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs> getAcm() {
        return this.acm == null ? Input.empty() : this.acm;
    }

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @InputImport(name="file")
      private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs> file;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs> getFile() {
        return this.file == null ? Input.empty() : this.file;
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @InputImport(name="sds")
      private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs> sds;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs> getSds() {
        return this.sds == null ? Input.empty() : this.sds;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs(
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs> acm,
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs> file,
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs> sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs() {
        this.acm = Input.empty();
        this.file = Input.empty();
        this.sds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs> acm;
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs> file;
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder acm(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs> acm) {
            this.acm = acm;
            return this;
        }

        public Builder acm(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmGetArgs acm) {
            this.acm = Input.ofNullable(acm);
            return this;
        }

        public Builder file(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs> file) {
            this.file = file;
            return this;
        }

        public Builder file(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileGetArgs file) {
            this.file = Input.ofNullable(file);
            return this;
        }

        public Builder sds(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs> sds) {
            this.sds = sds;
            return this;
        }

        public Builder sds(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsGetArgs sds) {
            this.sds = Input.ofNullable(sds);
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustGetArgs(acm, file, sds);
        }
    }
}
