// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs();

    /**
     * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
     */
    @InputImport(name="acm")
      private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs> acm;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs> getAcm() {
        return this.acm == null ? Input.empty() : this.acm;
    }

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @InputImport(name="file")
      private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs> file;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs> getFile() {
        return this.file == null ? Input.empty() : this.file;
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @InputImport(name="sds")
      private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs> sds;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs> getSds() {
        return this.sds == null ? Input.empty() : this.sds;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs(
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs> acm,
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs> file,
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs> sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs() {
        this.acm = Input.empty();
        this.file = Input.empty();
        this.sds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs> acm;
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs> file;
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder acm(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs> acm) {
            this.acm = acm;
            return this;
        }

        public Builder acm(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs acm) {
            this.acm = Input.ofNullable(acm);
            return this;
        }

        public Builder file(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs> file) {
            this.file = file;
            return this;
        }

        public Builder file(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs file) {
            this.file = Input.ofNullable(file);
            return this;
        }

        public Builder sds(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs> sds) {
            this.sds = sds;
            return this;
        }

        public Builder sds(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs sds) {
            this.sds = Input.ofNullable(sds);
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs(acm, file, sds);
        }
    }
}
