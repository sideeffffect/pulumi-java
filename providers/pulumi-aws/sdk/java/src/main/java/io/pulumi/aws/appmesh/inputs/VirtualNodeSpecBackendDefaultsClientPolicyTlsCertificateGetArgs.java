// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs();

    /**
     * A local file certificate.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file() {
        return this.file == null ? Codegen.empty() : this.file;
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds() {
        return this.sds == null ? Codegen.empty() : this.sds;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs(
        @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file,
        @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds) {
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs() {
        this.file = Codegen.empty();
        this.sds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file;
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder file(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file) {
            this.file = file;
            return this;
        }
        public Builder file(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs file) {
            this.file = Codegen.ofNullable(file);
            return this;
        }
        public Builder sds(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds) {
            this.sds = sds;
            return this;
        }
        public Builder sds(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs sds) {
            this.sds = Codegen.ofNullable(sds);
            return this;
        }        public VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateGetArgs(file, sds);
        }
    }
}
