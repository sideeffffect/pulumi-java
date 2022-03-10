// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.licensemanager;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LicenseConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LicenseConfigurationArgs Empty = new LicenseConfigurationArgs();

    /**
     * Description of the license configuration.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Number of licenses managed by the license configuration.
     * 
     */
    @InputImport(name="licenseCount")
      private final @Nullable Input<Integer> licenseCount;

    public Input<Integer> getLicenseCount() {
        return this.licenseCount == null ? Input.empty() : this.licenseCount;
    }

    /**
     * Sets the number of available licenses as a hard limit.
     * 
     */
    @InputImport(name="licenseCountHardLimit")
      private final @Nullable Input<Boolean> licenseCountHardLimit;

    public Input<Boolean> getLicenseCountHardLimit() {
        return this.licenseCountHardLimit == null ? Input.empty() : this.licenseCountHardLimit;
    }

    /**
     * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
     * 
     */
    @InputImport(name="licenseCountingType", required=true)
      private final Input<String> licenseCountingType;

    public Input<String> getLicenseCountingType() {
        return this.licenseCountingType;
    }

    /**
     * Array of configured License Manager rules.
     * 
     */
    @InputImport(name="licenseRules")
      private final @Nullable Input<List<String>> licenseRules;

    public Input<List<String>> getLicenseRules() {
        return this.licenseRules == null ? Input.empty() : this.licenseRules;
    }

    /**
     * Name of the license configuration.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LicenseConfigurationArgs(
        @Nullable Input<String> description,
        @Nullable Input<Integer> licenseCount,
        @Nullable Input<Boolean> licenseCountHardLimit,
        Input<String> licenseCountingType,
        @Nullable Input<List<String>> licenseRules,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.licenseCount = licenseCount;
        this.licenseCountHardLimit = licenseCountHardLimit;
        this.licenseCountingType = Objects.requireNonNull(licenseCountingType, "expected parameter 'licenseCountingType' to be non-null");
        this.licenseRules = licenseRules;
        this.name = name;
        this.tags = tags;
    }

    private LicenseConfigurationArgs() {
        this.description = Input.empty();
        this.licenseCount = Input.empty();
        this.licenseCountHardLimit = Input.empty();
        this.licenseCountingType = Input.empty();
        this.licenseRules = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Integer> licenseCount;
        private @Nullable Input<Boolean> licenseCountHardLimit;
        private Input<String> licenseCountingType;
        private @Nullable Input<List<String>> licenseRules;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.licenseCount = defaults.licenseCount;
    	      this.licenseCountHardLimit = defaults.licenseCountHardLimit;
    	      this.licenseCountingType = defaults.licenseCountingType;
    	      this.licenseRules = defaults.licenseRules;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder licenseCount(@Nullable Input<Integer> licenseCount) {
            this.licenseCount = licenseCount;
            return this;
        }

        public Builder licenseCount(@Nullable Integer licenseCount) {
            this.licenseCount = Input.ofNullable(licenseCount);
            return this;
        }

        public Builder licenseCountHardLimit(@Nullable Input<Boolean> licenseCountHardLimit) {
            this.licenseCountHardLimit = licenseCountHardLimit;
            return this;
        }

        public Builder licenseCountHardLimit(@Nullable Boolean licenseCountHardLimit) {
            this.licenseCountHardLimit = Input.ofNullable(licenseCountHardLimit);
            return this;
        }

        public Builder licenseCountingType(Input<String> licenseCountingType) {
            this.licenseCountingType = Objects.requireNonNull(licenseCountingType);
            return this;
        }

        public Builder licenseCountingType(String licenseCountingType) {
            this.licenseCountingType = Input.of(Objects.requireNonNull(licenseCountingType));
            return this;
        }

        public Builder licenseRules(@Nullable Input<List<String>> licenseRules) {
            this.licenseRules = licenseRules;
            return this;
        }

        public Builder licenseRules(@Nullable List<String> licenseRules) {
            this.licenseRules = Input.ofNullable(licenseRules);
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

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LicenseConfigurationArgs build() {
            return new LicenseConfigurationArgs(description, licenseCount, licenseCountHardLimit, licenseCountingType, licenseRules, name, tags);
        }
    }
}
