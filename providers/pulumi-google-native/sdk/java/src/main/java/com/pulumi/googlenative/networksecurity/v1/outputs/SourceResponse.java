// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SourceResponse {
    /**
     * @return Optional. List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., &#34;1.2.3.4&#34;) and CIDR (e.g., &#34;1.2.3.0/24&#34;) are supported. Authorization based on source IP alone should be avoided. The IP addresses of any load balancers or proxies should be considered untrusted.
     * 
     */
    private final List<String> ipBlocks;
    /**
     * @return Optional. List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, &#34;namespace/*&#34;) or a suffix match (example, // *{@literal /}service-account&#34;) or a presence match &#34;*&#34;. Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
     * 
     */
    private final List<String> principals;

    @CustomType.Constructor
    private SourceResponse(
        @CustomType.Parameter("ipBlocks") List<String> ipBlocks,
        @CustomType.Parameter("principals") List<String> principals) {
        this.ipBlocks = ipBlocks;
        this.principals = principals;
    }

    /**
     * @return Optional. List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., &#34;1.2.3.4&#34;) and CIDR (e.g., &#34;1.2.3.0/24&#34;) are supported. Authorization based on source IP alone should be avoided. The IP addresses of any load balancers or proxies should be considered untrusted.
     * 
     */
    public List<String> ipBlocks() {
        return this.ipBlocks;
    }
    /**
     * @return Optional. List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, &#34;namespace/*&#34;) or a suffix match (example, // *{@literal /}service-account&#34;) or a presence match &#34;*&#34;. Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
     * 
     */
    public List<String> principals() {
        return this.principals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> ipBlocks;
        private List<String> principals;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipBlocks = defaults.ipBlocks;
    	      this.principals = defaults.principals;
        }

        public Builder ipBlocks(List<String> ipBlocks) {
            this.ipBlocks = Objects.requireNonNull(ipBlocks);
            return this;
        }
        public Builder ipBlocks(String... ipBlocks) {
            return ipBlocks(List.of(ipBlocks));
        }
        public Builder principals(List<String> principals) {
            this.principals = Objects.requireNonNull(principals);
            return this;
        }
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }        public SourceResponse build() {
            return new SourceResponse(ipBlocks, principals);
        }
    }
}
