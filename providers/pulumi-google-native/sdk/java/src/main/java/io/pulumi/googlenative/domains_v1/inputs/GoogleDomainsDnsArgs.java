// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.domains_v1.enums.GoogleDomainsDnsDsState;
import java.util.Objects;


/**
 * Configuration for using the free DNS zone provided by Google Domains as a `Registration`'s `dns_provider`. You cannot configure the DNS zone itself using the API. To configure the DNS zone, go to [Google Domains](https://domains.google/).
 * 
 */
public final class GoogleDomainsDnsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDomainsDnsArgs Empty = new GoogleDomainsDnsArgs();

    /**
     * The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
     * 
     */
    @InputImport(name="dsState", required=true)
      private final Input<GoogleDomainsDnsDsState> dsState;

    public Input<GoogleDomainsDnsDsState> getDsState() {
        return this.dsState;
    }

    public GoogleDomainsDnsArgs(Input<GoogleDomainsDnsDsState> dsState) {
        this.dsState = Objects.requireNonNull(dsState, "expected parameter 'dsState' to be non-null");
    }

    private GoogleDomainsDnsArgs() {
        this.dsState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDomainsDnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GoogleDomainsDnsDsState> dsState;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDomainsDnsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dsState = defaults.dsState;
        }

        public Builder dsState(Input<GoogleDomainsDnsDsState> dsState) {
            this.dsState = Objects.requireNonNull(dsState);
            return this;
        }

        public Builder dsState(GoogleDomainsDnsDsState dsState) {
            this.dsState = Input.of(Objects.requireNonNull(dsState));
            return this;
        }
        public GoogleDomainsDnsArgs build() {
            return new GoogleDomainsDnsArgs(dsState);
        }
    }
}
