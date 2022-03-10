// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainDomainEndpointOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainDomainEndpointOptionsGetArgs Empty = new DomainDomainEndpointOptionsGetArgs();

    /**
     * Fully qualified domain for your custom endpoint.
     * 
     */
    @InputImport(name="customEndpoint")
      private final @Nullable Input<String> customEndpoint;

    public Input<String> getCustomEndpoint() {
        return this.customEndpoint == null ? Input.empty() : this.customEndpoint;
    }

    /**
     * ACM certificate ARN for your custom endpoint.
     * 
     */
    @InputImport(name="customEndpointCertificateArn")
      private final @Nullable Input<String> customEndpointCertificateArn;

    public Input<String> getCustomEndpointCertificateArn() {
        return this.customEndpointCertificateArn == null ? Input.empty() : this.customEndpointCertificateArn;
    }

    /**
     * Whether to enable custom endpoint for the Elasticsearch domain.
     * 
     */
    @InputImport(name="customEndpointEnabled")
      private final @Nullable Input<Boolean> customEndpointEnabled;

    public Input<Boolean> getCustomEndpointEnabled() {
        return this.customEndpointEnabled == null ? Input.empty() : this.customEndpointEnabled;
    }

    /**
     * Whether or not to require HTTPS. Defaults to `true`.
     * 
     */
    @InputImport(name="enforceHttps")
      private final @Nullable Input<Boolean> enforceHttps;

    public Input<Boolean> getEnforceHttps() {
        return this.enforceHttps == null ? Input.empty() : this.enforceHttps;
    }

    @InputImport(name="tlsSecurityPolicy")
      private final @Nullable Input<String> tlsSecurityPolicy;

    public Input<String> getTlsSecurityPolicy() {
        return this.tlsSecurityPolicy == null ? Input.empty() : this.tlsSecurityPolicy;
    }

    public DomainDomainEndpointOptionsGetArgs(
        @Nullable Input<String> customEndpoint,
        @Nullable Input<String> customEndpointCertificateArn,
        @Nullable Input<Boolean> customEndpointEnabled,
        @Nullable Input<Boolean> enforceHttps,
        @Nullable Input<String> tlsSecurityPolicy) {
        this.customEndpoint = customEndpoint;
        this.customEndpointCertificateArn = customEndpointCertificateArn;
        this.customEndpointEnabled = customEndpointEnabled;
        this.enforceHttps = enforceHttps;
        this.tlsSecurityPolicy = tlsSecurityPolicy;
    }

    private DomainDomainEndpointOptionsGetArgs() {
        this.customEndpoint = Input.empty();
        this.customEndpointCertificateArn = Input.empty();
        this.customEndpointEnabled = Input.empty();
        this.enforceHttps = Input.empty();
        this.tlsSecurityPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDomainEndpointOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customEndpoint;
        private @Nullable Input<String> customEndpointCertificateArn;
        private @Nullable Input<Boolean> customEndpointEnabled;
        private @Nullable Input<Boolean> enforceHttps;
        private @Nullable Input<String> tlsSecurityPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDomainEndpointOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEndpoint = defaults.customEndpoint;
    	      this.customEndpointCertificateArn = defaults.customEndpointCertificateArn;
    	      this.customEndpointEnabled = defaults.customEndpointEnabled;
    	      this.enforceHttps = defaults.enforceHttps;
    	      this.tlsSecurityPolicy = defaults.tlsSecurityPolicy;
        }

        public Builder customEndpoint(@Nullable Input<String> customEndpoint) {
            this.customEndpoint = customEndpoint;
            return this;
        }

        public Builder customEndpoint(@Nullable String customEndpoint) {
            this.customEndpoint = Input.ofNullable(customEndpoint);
            return this;
        }

        public Builder customEndpointCertificateArn(@Nullable Input<String> customEndpointCertificateArn) {
            this.customEndpointCertificateArn = customEndpointCertificateArn;
            return this;
        }

        public Builder customEndpointCertificateArn(@Nullable String customEndpointCertificateArn) {
            this.customEndpointCertificateArn = Input.ofNullable(customEndpointCertificateArn);
            return this;
        }

        public Builder customEndpointEnabled(@Nullable Input<Boolean> customEndpointEnabled) {
            this.customEndpointEnabled = customEndpointEnabled;
            return this;
        }

        public Builder customEndpointEnabled(@Nullable Boolean customEndpointEnabled) {
            this.customEndpointEnabled = Input.ofNullable(customEndpointEnabled);
            return this;
        }

        public Builder enforceHttps(@Nullable Input<Boolean> enforceHttps) {
            this.enforceHttps = enforceHttps;
            return this;
        }

        public Builder enforceHttps(@Nullable Boolean enforceHttps) {
            this.enforceHttps = Input.ofNullable(enforceHttps);
            return this;
        }

        public Builder tlsSecurityPolicy(@Nullable Input<String> tlsSecurityPolicy) {
            this.tlsSecurityPolicy = tlsSecurityPolicy;
            return this;
        }

        public Builder tlsSecurityPolicy(@Nullable String tlsSecurityPolicy) {
            this.tlsSecurityPolicy = Input.ofNullable(tlsSecurityPolicy);
            return this;
        }
        public DomainDomainEndpointOptionsGetArgs build() {
            return new DomainDomainEndpointOptionsGetArgs(customEndpoint, customEndpointCertificateArn, customEndpointEnabled, enforceHttps, tlsSecurityPolicy);
        }
    }
}
