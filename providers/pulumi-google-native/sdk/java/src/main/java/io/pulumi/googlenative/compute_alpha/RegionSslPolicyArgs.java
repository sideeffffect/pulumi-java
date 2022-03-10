// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.RegionSslPolicyMinTlsVersion;
import io.pulumi.googlenative.compute_alpha.enums.RegionSslPolicyProfile;
import io.pulumi.googlenative.compute_alpha.inputs.ServerTlsSettingsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionSslPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionSslPolicyArgs Empty = new RegionSslPolicyArgs();

    /**
     * A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
     * 
     */
    @InputImport(name="customFeatures")
      private final @Nullable Input<List<String>> customFeatures;

    public Input<List<String>> getCustomFeatures() {
        return this.customFeatures == null ? Input.empty() : this.customFeatures;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
     */
    @InputImport(name="minTlsVersion")
      private final @Nullable Input<RegionSslPolicyMinTlsVersion> minTlsVersion;

    public Input<RegionSslPolicyMinTlsVersion> getMinTlsVersion() {
        return this.minTlsVersion == null ? Input.empty() : this.minTlsVersion;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
     * 
     */
    @InputImport(name="profile")
      private final @Nullable Input<RegionSslPolicyProfile> profile;

    public Input<RegionSslPolicyProfile> getProfile() {
        return this.profile == null ? Input.empty() : this.profile;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Security settings for the proxy. This field is only applicable to a global backend service with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="tlsSettings")
      private final @Nullable Input<ServerTlsSettingsArgs> tlsSettings;

    public Input<ServerTlsSettingsArgs> getTlsSettings() {
        return this.tlsSettings == null ? Input.empty() : this.tlsSettings;
    }

    public RegionSslPolicyArgs(
        @Nullable Input<List<String>> customFeatures,
        @Nullable Input<String> description,
        @Nullable Input<RegionSslPolicyMinTlsVersion> minTlsVersion,
        @Nullable Input<String> name,
        @Nullable Input<RegionSslPolicyProfile> profile,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<ServerTlsSettingsArgs> tlsSettings) {
        this.customFeatures = customFeatures;
        this.description = description;
        this.minTlsVersion = minTlsVersion;
        this.name = name;
        this.profile = profile;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.tlsSettings = tlsSettings;
    }

    private RegionSslPolicyArgs() {
        this.customFeatures = Input.empty();
        this.description = Input.empty();
        this.minTlsVersion = Input.empty();
        this.name = Input.empty();
        this.profile = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.tlsSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionSslPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> customFeatures;
        private @Nullable Input<String> description;
        private @Nullable Input<RegionSslPolicyMinTlsVersion> minTlsVersion;
        private @Nullable Input<String> name;
        private @Nullable Input<RegionSslPolicyProfile> profile;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<ServerTlsSettingsArgs> tlsSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionSslPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFeatures = defaults.customFeatures;
    	      this.description = defaults.description;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.name = defaults.name;
    	      this.profile = defaults.profile;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.tlsSettings = defaults.tlsSettings;
        }

        public Builder customFeatures(@Nullable Input<List<String>> customFeatures) {
            this.customFeatures = customFeatures;
            return this;
        }

        public Builder customFeatures(@Nullable List<String> customFeatures) {
            this.customFeatures = Input.ofNullable(customFeatures);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder minTlsVersion(@Nullable Input<RegionSslPolicyMinTlsVersion> minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }

        public Builder minTlsVersion(@Nullable RegionSslPolicyMinTlsVersion minTlsVersion) {
            this.minTlsVersion = Input.ofNullable(minTlsVersion);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder profile(@Nullable Input<RegionSslPolicyProfile> profile) {
            this.profile = profile;
            return this;
        }

        public Builder profile(@Nullable RegionSslPolicyProfile profile) {
            this.profile = Input.ofNullable(profile);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder region(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder region(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder tlsSettings(@Nullable Input<ServerTlsSettingsArgs> tlsSettings) {
            this.tlsSettings = tlsSettings;
            return this;
        }

        public Builder tlsSettings(@Nullable ServerTlsSettingsArgs tlsSettings) {
            this.tlsSettings = Input.ofNullable(tlsSettings);
            return this;
        }
        public RegionSslPolicyArgs build() {
            return new RegionSslPolicyArgs(customFeatures, description, minTlsVersion, name, profile, project, region, requestId, tlsSettings);
        }
    }
}
