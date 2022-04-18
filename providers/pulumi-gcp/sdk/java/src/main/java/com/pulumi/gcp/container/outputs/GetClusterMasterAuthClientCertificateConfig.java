// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetClusterMasterAuthClientCertificateConfig {
    private final Boolean issueClientCertificate;

    @CustomType.Constructor
    private GetClusterMasterAuthClientCertificateConfig(@CustomType.Parameter("issueClientCertificate") Boolean issueClientCertificate) {
        this.issueClientCertificate = issueClientCertificate;
    }

    public Boolean issueClientCertificate() {
        return this.issueClientCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMasterAuthClientCertificateConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean issueClientCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterMasterAuthClientCertificateConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issueClientCertificate = defaults.issueClientCertificate;
        }

        public Builder issueClientCertificate(Boolean issueClientCertificate) {
            this.issueClientCertificate = Objects.requireNonNull(issueClientCertificate);
            return this;
        }        public GetClusterMasterAuthClientCertificateConfig build() {
            return new GetClusterMasterAuthClientCertificateConfig(issueClientCertificate);
        }
    }
}
