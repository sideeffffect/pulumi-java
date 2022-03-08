// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PublicAdvertisedPrefixPublicDelegatedPrefixResponse {
    /**
     * The IP address range of the public delegated prefix
     * 
     */
    private final String ipRange;
    /**
     * The name of the public delegated prefix
     * 
     */
    private final String name;
    /**
     * The project number of the public delegated prefix
     * 
     */
    private final String project;
    /**
     * The region of the public delegated prefix if it is regional. If absent, the prefix is global.
     * 
     */
    private final String region;
    /**
     * The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"ipRange","name","project","region","status"})
    private PublicAdvertisedPrefixPublicDelegatedPrefixResponse(
        String ipRange,
        String name,
        String project,
        String region,
        String status) {
        this.ipRange = ipRange;
        this.name = name;
        this.project = project;
        this.region = region;
        this.status = status;
    }

    /**
     * The IP address range of the public delegated prefix
     * 
    */
    public String getIpRange() {
        return this.ipRange;
    }
    /**
     * The name of the public delegated prefix
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The project number of the public delegated prefix
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * The region of the public delegated prefix if it is regional. If absent, the prefix is global.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicAdvertisedPrefixPublicDelegatedPrefixResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipRange;
        private String name;
        private String project;
        private String region;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicAdvertisedPrefixPublicDelegatedPrefixResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRange = defaults.ipRange;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
        }

        public Builder setIpRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public PublicAdvertisedPrefixPublicDelegatedPrefixResponse build() {
            return new PublicAdvertisedPrefixPublicDelegatedPrefixResponse(ipRange, name, project, region, status);
        }
    }
}
