// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterMasterAuthClientCertificateConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterAuthClientCertificateConfigArgs Empty = new ClusterMasterAuthClientCertificateConfigArgs();

    @InputImport(name="issueClientCertificate", required=true)
      private final Input<Boolean> issueClientCertificate;

    public Input<Boolean> getIssueClientCertificate() {
        return this.issueClientCertificate;
    }

    public ClusterMasterAuthClientCertificateConfigArgs(Input<Boolean> issueClientCertificate) {
        this.issueClientCertificate = Objects.requireNonNull(issueClientCertificate, "expected parameter 'issueClientCertificate' to be non-null");
    }

    private ClusterMasterAuthClientCertificateConfigArgs() {
        this.issueClientCertificate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterAuthClientCertificateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> issueClientCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterAuthClientCertificateConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issueClientCertificate = defaults.issueClientCertificate;
        }

        public Builder issueClientCertificate(Input<Boolean> issueClientCertificate) {
            this.issueClientCertificate = Objects.requireNonNull(issueClientCertificate);
            return this;
        }

        public Builder issueClientCertificate(Boolean issueClientCertificate) {
            this.issueClientCertificate = Input.of(Objects.requireNonNull(issueClientCertificate));
            return this;
        }
        public ClusterMasterAuthClientCertificateConfigArgs build() {
            return new ClusterMasterAuthClientCertificateConfigArgs(issueClientCertificate);
        }
    }
}
