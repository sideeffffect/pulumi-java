// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourceRepositoryResourceZypperRepositoryResponse {
    /**
     * The location of the repository directory.
     * 
     */
    private final String baseUrl;
    /**
     * The display name of the repository.
     * 
     */
    private final String displayName;
    /**
     * URIs of GPG keys.
     * 
     */
    private final List<String> gpgKeys;

    @OutputCustomType.Constructor
    private OSPolicyResourceRepositoryResourceZypperRepositoryResponse(
        @OutputCustomType.Parameter("baseUrl") String baseUrl,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("gpgKeys") List<String> gpgKeys) {
        this.baseUrl = baseUrl;
        this.displayName = displayName;
        this.gpgKeys = gpgKeys;
    }

    /**
     * The location of the repository directory.
     * 
    */
    public String getBaseUrl() {
        return this.baseUrl;
    }
    /**
     * The display name of the repository.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * URIs of GPG keys.
     * 
    */
    public List<String> getGpgKeys() {
        return this.gpgKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceZypperRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseUrl;
        private String displayName;
        private List<String> gpgKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceZypperRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder gpgKeys(List<String> gpgKeys) {
            this.gpgKeys = Objects.requireNonNull(gpgKeys);
            return this;
        }
        public OSPolicyResourceRepositoryResourceZypperRepositoryResponse build() {
            return new OSPolicyResourceRepositoryResourceZypperRepositoryResponse(baseUrl, displayName, gpgKeys);
        }
    }
}
