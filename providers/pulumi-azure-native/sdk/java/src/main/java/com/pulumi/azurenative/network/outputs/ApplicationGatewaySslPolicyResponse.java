// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewaySslPolicyResponse {
    /**
     * @return Ssl cipher suites to be enabled in the specified order to application gateway.
     * 
     */
    private final @Nullable List<String> cipherSuites;
    /**
     * @return Ssl protocols to be disabled on application gateway.
     * 
     */
    private final @Nullable List<String> disabledSslProtocols;
    /**
     * @return Minimum version of Ssl protocol to be supported on application gateway.
     * 
     */
    private final @Nullable String minProtocolVersion;
    /**
     * @return Name of Ssl predefined policy.
     * 
     */
    private final @Nullable String policyName;
    /**
     * @return Type of Ssl Policy.
     * 
     */
    private final @Nullable String policyType;

    @CustomType.Constructor
    private ApplicationGatewaySslPolicyResponse(
        @CustomType.Parameter("cipherSuites") @Nullable List<String> cipherSuites,
        @CustomType.Parameter("disabledSslProtocols") @Nullable List<String> disabledSslProtocols,
        @CustomType.Parameter("minProtocolVersion") @Nullable String minProtocolVersion,
        @CustomType.Parameter("policyName") @Nullable String policyName,
        @CustomType.Parameter("policyType") @Nullable String policyType) {
        this.cipherSuites = cipherSuites;
        this.disabledSslProtocols = disabledSslProtocols;
        this.minProtocolVersion = minProtocolVersion;
        this.policyName = policyName;
        this.policyType = policyType;
    }

    /**
     * @return Ssl cipher suites to be enabled in the specified order to application gateway.
     * 
     */
    public List<String> cipherSuites() {
        return this.cipherSuites == null ? List.of() : this.cipherSuites;
    }
    /**
     * @return Ssl protocols to be disabled on application gateway.
     * 
     */
    public List<String> disabledSslProtocols() {
        return this.disabledSslProtocols == null ? List.of() : this.disabledSslProtocols;
    }
    /**
     * @return Minimum version of Ssl protocol to be supported on application gateway.
     * 
     */
    public Optional<String> minProtocolVersion() {
        return Optional.ofNullable(this.minProtocolVersion);
    }
    /**
     * @return Name of Ssl predefined policy.
     * 
     */
    public Optional<String> policyName() {
        return Optional.ofNullable(this.policyName);
    }
    /**
     * @return Type of Ssl Policy.
     * 
     */
    public Optional<String> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySslPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cipherSuites;
        private @Nullable List<String> disabledSslProtocols;
        private @Nullable String minProtocolVersion;
        private @Nullable String policyName;
        private @Nullable String policyType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySslPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cipherSuites = defaults.cipherSuites;
    	      this.disabledSslProtocols = defaults.disabledSslProtocols;
    	      this.minProtocolVersion = defaults.minProtocolVersion;
    	      this.policyName = defaults.policyName;
    	      this.policyType = defaults.policyType;
        }

        public Builder cipherSuites(@Nullable List<String> cipherSuites) {
            this.cipherSuites = cipherSuites;
            return this;
        }
        public Builder cipherSuites(String... cipherSuites) {
            return cipherSuites(List.of(cipherSuites));
        }
        public Builder disabledSslProtocols(@Nullable List<String> disabledSslProtocols) {
            this.disabledSslProtocols = disabledSslProtocols;
            return this;
        }
        public Builder disabledSslProtocols(String... disabledSslProtocols) {
            return disabledSslProtocols(List.of(disabledSslProtocols));
        }
        public Builder minProtocolVersion(@Nullable String minProtocolVersion) {
            this.minProtocolVersion = minProtocolVersion;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }
        public Builder policyType(@Nullable String policyType) {
            this.policyType = policyType;
            return this;
        }        public ApplicationGatewaySslPolicyResponse build() {
            return new ApplicationGatewaySslPolicyResponse(cipherSuites, disabledSslProtocols, minProtocolVersion, policyName, policyType);
        }
    }
}
