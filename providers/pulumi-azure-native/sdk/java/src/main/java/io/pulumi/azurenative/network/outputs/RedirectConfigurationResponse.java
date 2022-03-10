// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RedirectConfigurationResponse {
    /**
     * Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
     */
    private final @Nullable String customFragment;
    /**
     * Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     */
    private final @Nullable String customHost;
    /**
     * The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
     */
    private final @Nullable String customPath;
    /**
     * The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in <key>=<value> format. The first ? and & will be added automatically so do not include them in the front, but do separate multiple query strings with &.
     * 
     */
    private final @Nullable String customQueryString;
    /**
     * Expected value is '#Microsoft.Azure.FrontDoor.Models.FrontdoorRedirectConfiguration'.
     * 
     */
    private final String odataType;
    /**
     * The protocol of the destination to where the traffic is redirected
     * 
     */
    private final @Nullable String redirectProtocol;
    /**
     * The redirect type the rule will use when redirecting traffic.
     * 
     */
    private final @Nullable String redirectType;

    @OutputCustomType.Constructor
    private RedirectConfigurationResponse(
        @OutputCustomType.Parameter("customFragment") @Nullable String customFragment,
        @OutputCustomType.Parameter("customHost") @Nullable String customHost,
        @OutputCustomType.Parameter("customPath") @Nullable String customPath,
        @OutputCustomType.Parameter("customQueryString") @Nullable String customQueryString,
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("redirectProtocol") @Nullable String redirectProtocol,
        @OutputCustomType.Parameter("redirectType") @Nullable String redirectType) {
        this.customFragment = customFragment;
        this.customHost = customHost;
        this.customPath = customPath;
        this.customQueryString = customQueryString;
        this.odataType = odataType;
        this.redirectProtocol = redirectProtocol;
        this.redirectType = redirectType;
    }

    /**
     * Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
    */
    public Optional<String> getCustomFragment() {
        return Optional.ofNullable(this.customFragment);
    }
    /**
     * Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
    */
    public Optional<String> getCustomHost() {
        return Optional.ofNullable(this.customHost);
    }
    /**
     * The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
    */
    public Optional<String> getCustomPath() {
        return Optional.ofNullable(this.customPath);
    }
    /**
     * The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in <key>=<value> format. The first ? and & will be added automatically so do not include them in the front, but do separate multiple query strings with &.
     * 
    */
    public Optional<String> getCustomQueryString() {
        return Optional.ofNullable(this.customQueryString);
    }
    /**
     * Expected value is '#Microsoft.Azure.FrontDoor.Models.FrontdoorRedirectConfiguration'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * The protocol of the destination to where the traffic is redirected
     * 
    */
    public Optional<String> getRedirectProtocol() {
        return Optional.ofNullable(this.redirectProtocol);
    }
    /**
     * The redirect type the rule will use when redirecting traffic.
     * 
    */
    public Optional<String> getRedirectType() {
        return Optional.ofNullable(this.redirectType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedirectConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customFragment;
        private @Nullable String customHost;
        private @Nullable String customPath;
        private @Nullable String customQueryString;
        private String odataType;
        private @Nullable String redirectProtocol;
        private @Nullable String redirectType;

        public Builder() {
    	      // Empty
        }

        public Builder(RedirectConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFragment = defaults.customFragment;
    	      this.customHost = defaults.customHost;
    	      this.customPath = defaults.customPath;
    	      this.customQueryString = defaults.customQueryString;
    	      this.odataType = defaults.odataType;
    	      this.redirectProtocol = defaults.redirectProtocol;
    	      this.redirectType = defaults.redirectType;
        }

        public Builder customFragment(@Nullable String customFragment) {
            this.customFragment = customFragment;
            return this;
        }

        public Builder customHost(@Nullable String customHost) {
            this.customHost = customHost;
            return this;
        }

        public Builder customPath(@Nullable String customPath) {
            this.customPath = customPath;
            return this;
        }

        public Builder customQueryString(@Nullable String customQueryString) {
            this.customQueryString = customQueryString;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder redirectProtocol(@Nullable String redirectProtocol) {
            this.redirectProtocol = redirectProtocol;
            return this;
        }

        public Builder redirectType(@Nullable String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public RedirectConfigurationResponse build() {
            return new RedirectConfigurationResponse(customFragment, customHost, customPath, customQueryString, odataType, redirectProtocol, redirectType);
        }
    }
}
