// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxWebAppSiteConfigCor {
    /**
     * @return A list of origins that should be allowed to make cross-origin calls.
     * 
     */
    private final List<String> allowedOrigins;
    /**
     * @return Whether CORS requests with credentials are allowed.
     * 
     */
    private final Boolean supportCredentials;

    @CustomType.Constructor
    private GetLinuxWebAppSiteConfigCor(
        @CustomType.Parameter("allowedOrigins") List<String> allowedOrigins,
        @CustomType.Parameter("supportCredentials") Boolean supportCredentials) {
        this.allowedOrigins = allowedOrigins;
        this.supportCredentials = supportCredentials;
    }

    /**
     * @return A list of origins that should be allowed to make cross-origin calls.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return Whether CORS requests with credentials are allowed.
     * 
     */
    public Boolean supportCredentials() {
        return this.supportCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxWebAppSiteConfigCor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedOrigins;
        private Boolean supportCredentials;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxWebAppSiteConfigCor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.supportCredentials = defaults.supportCredentials;
        }

        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        public Builder supportCredentials(Boolean supportCredentials) {
            this.supportCredentials = Objects.requireNonNull(supportCredentials);
            return this;
        }        public GetLinuxWebAppSiteConfigCor build() {
            return new GetLinuxWebAppSiteConfigCor(allowedOrigins, supportCredentials);
        }
    }
}
