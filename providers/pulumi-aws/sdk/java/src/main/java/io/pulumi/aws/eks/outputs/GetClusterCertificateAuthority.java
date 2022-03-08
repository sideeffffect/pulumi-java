// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterCertificateAuthority {
    /**
     * The base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     * 
     */
    private final String data;

    @OutputCustomType.Constructor({"data"})
    private GetClusterCertificateAuthority(String data) {
        this.data = data;
    }

    /**
     * The base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     * 
    */
    public String getData() {
        return this.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterCertificateAuthority defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String data;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterCertificateAuthority defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
        }

        public Builder setData(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public GetClusterCertificateAuthority build() {
            return new GetClusterCertificateAuthority(data);
        }
    }
}
