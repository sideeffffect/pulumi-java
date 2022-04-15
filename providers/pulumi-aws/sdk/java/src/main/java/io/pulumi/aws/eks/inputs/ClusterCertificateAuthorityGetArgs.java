// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterCertificateAuthorityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCertificateAuthorityGetArgs Empty = new ClusterCertificateAuthorityGetArgs();

    /**
     * Base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> data() {
        return this.data == null ? Codegen.empty() : this.data;
    }

    public ClusterCertificateAuthorityGetArgs(@Nullable Output<String> data) {
        this.data = data;
    }

    private ClusterCertificateAuthorityGetArgs() {
        this.data = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCertificateAuthorityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> data;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCertificateAuthorityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
        }

        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable String data) {
            this.data = Codegen.ofNullable(data);
            return this;
        }        public ClusterCertificateAuthorityGetArgs build() {
            return new ClusterCertificateAuthorityGetArgs(data);
        }
    }
}
