// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainEndpointOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainEndpointOptionsArgs Empty = new DomainEndpointOptionsArgs();

    @InputImport(name="customEndpoint")
      private final @Nullable Input<String> customEndpoint;

    public Input<String> getCustomEndpoint() {
        return this.customEndpoint == null ? Input.empty() : this.customEndpoint;
    }

    @InputImport(name="customEndpointCertificateArn")
      private final @Nullable Input<String> customEndpointCertificateArn;

    public Input<String> getCustomEndpointCertificateArn() {
        return this.customEndpointCertificateArn == null ? Input.empty() : this.customEndpointCertificateArn;
    }

    @InputImport(name="customEndpointEnabled")
      private final @Nullable Input<Boolean> customEndpointEnabled;

    public Input<Boolean> getCustomEndpointEnabled() {
        return this.customEndpointEnabled == null ? Input.empty() : this.customEndpointEnabled;
    }

    @InputImport(name="enforceHTTPS")
      private final @Nullable Input<Boolean> enforceHTTPS;

    public Input<Boolean> getEnforceHTTPS() {
        return this.enforceHTTPS == null ? Input.empty() : this.enforceHTTPS;
    }

    @InputImport(name="tLSSecurityPolicy")
      private final @Nullable Input<String> tLSSecurityPolicy;

    public Input<String> getTLSSecurityPolicy() {
        return this.tLSSecurityPolicy == null ? Input.empty() : this.tLSSecurityPolicy;
    }

    public DomainEndpointOptionsArgs(
        @Nullable Input<String> customEndpoint,
        @Nullable Input<String> customEndpointCertificateArn,
        @Nullable Input<Boolean> customEndpointEnabled,
        @Nullable Input<Boolean> enforceHTTPS,
        @Nullable Input<String> tLSSecurityPolicy) {
        this.customEndpoint = customEndpoint;
        this.customEndpointCertificateArn = customEndpointCertificateArn;
        this.customEndpointEnabled = customEndpointEnabled;
        this.enforceHTTPS = enforceHTTPS;
        this.tLSSecurityPolicy = tLSSecurityPolicy;
    }

    private DomainEndpointOptionsArgs() {
        this.customEndpoint = Input.empty();
        this.customEndpointCertificateArn = Input.empty();
        this.customEndpointEnabled = Input.empty();
        this.enforceHTTPS = Input.empty();
        this.tLSSecurityPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEndpointOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customEndpoint;
        private @Nullable Input<String> customEndpointCertificateArn;
        private @Nullable Input<Boolean> customEndpointEnabled;
        private @Nullable Input<Boolean> enforceHTTPS;
        private @Nullable Input<String> tLSSecurityPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEndpointOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEndpoint = defaults.customEndpoint;
    	      this.customEndpointCertificateArn = defaults.customEndpointCertificateArn;
    	      this.customEndpointEnabled = defaults.customEndpointEnabled;
    	      this.enforceHTTPS = defaults.enforceHTTPS;
    	      this.tLSSecurityPolicy = defaults.tLSSecurityPolicy;
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

        public Builder enforceHTTPS(@Nullable Input<Boolean> enforceHTTPS) {
            this.enforceHTTPS = enforceHTTPS;
            return this;
        }

        public Builder enforceHTTPS(@Nullable Boolean enforceHTTPS) {
            this.enforceHTTPS = Input.ofNullable(enforceHTTPS);
            return this;
        }

        public Builder tLSSecurityPolicy(@Nullable Input<String> tLSSecurityPolicy) {
            this.tLSSecurityPolicy = tLSSecurityPolicy;
            return this;
        }

        public Builder tLSSecurityPolicy(@Nullable String tLSSecurityPolicy) {
            this.tLSSecurityPolicy = Input.ofNullable(tLSSecurityPolicy);
            return this;
        }
        public DomainEndpointOptionsArgs build() {
            return new DomainEndpointOptionsArgs(customEndpoint, customEndpointCertificateArn, customEndpointEnabled, enforceHTTPS, tLSSecurityPolicy);
        }
    }
}
