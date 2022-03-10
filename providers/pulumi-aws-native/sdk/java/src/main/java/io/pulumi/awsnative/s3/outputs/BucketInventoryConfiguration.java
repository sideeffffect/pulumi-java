// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketInventoryConfigurationIncludedObjectVersions;
import io.pulumi.awsnative.s3.enums.BucketInventoryConfigurationOptionalFieldsItem;
import io.pulumi.awsnative.s3.enums.BucketInventoryConfigurationScheduleFrequency;
import io.pulumi.awsnative.s3.outputs.BucketDestination;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketInventoryConfiguration {
    private final BucketDestination destination;
    /**
     * Specifies whether the inventory is enabled or disabled.
     * 
     */
    private final Boolean enabled;
    /**
     * The ID used to identify the inventory configuration.
     * 
     */
    private final String id;
    /**
     * Object versions to include in the inventory list.
     * 
     */
    private final BucketInventoryConfigurationIncludedObjectVersions includedObjectVersions;
    /**
     * Contains the optional fields that are included in the inventory results.
     * 
     */
    private final @Nullable List<BucketInventoryConfigurationOptionalFieldsItem> optionalFields;
    /**
     * The prefix that is prepended to all inventory results.
     * 
     */
    private final @Nullable String prefix;
    /**
     * Specifies the schedule for generating inventory results.
     * 
     */
    private final BucketInventoryConfigurationScheduleFrequency scheduleFrequency;

    @OutputCustomType.Constructor
    private BucketInventoryConfiguration(
        @OutputCustomType.Parameter("destination") BucketDestination destination,
        @OutputCustomType.Parameter("enabled") Boolean enabled,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("includedObjectVersions") BucketInventoryConfigurationIncludedObjectVersions includedObjectVersions,
        @OutputCustomType.Parameter("optionalFields") @Nullable List<BucketInventoryConfigurationOptionalFieldsItem> optionalFields,
        @OutputCustomType.Parameter("prefix") @Nullable String prefix,
        @OutputCustomType.Parameter("scheduleFrequency") BucketInventoryConfigurationScheduleFrequency scheduleFrequency) {
        this.destination = destination;
        this.enabled = enabled;
        this.id = id;
        this.includedObjectVersions = includedObjectVersions;
        this.optionalFields = optionalFields;
        this.prefix = prefix;
        this.scheduleFrequency = scheduleFrequency;
    }

    public BucketDestination getDestination() {
        return this.destination;
    }
    /**
     * Specifies whether the inventory is enabled or disabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The ID used to identify the inventory configuration.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Object versions to include in the inventory list.
     * 
    */
    public BucketInventoryConfigurationIncludedObjectVersions getIncludedObjectVersions() {
        return this.includedObjectVersions;
    }
    /**
     * Contains the optional fields that are included in the inventory results.
     * 
    */
    public List<BucketInventoryConfigurationOptionalFieldsItem> getOptionalFields() {
        return this.optionalFields == null ? List.of() : this.optionalFields;
    }
    /**
     * The prefix that is prepended to all inventory results.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * Specifies the schedule for generating inventory results.
     * 
    */
    public BucketInventoryConfigurationScheduleFrequency getScheduleFrequency() {
        return this.scheduleFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketInventoryConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketDestination destination;
        private Boolean enabled;
        private String id;
        private BucketInventoryConfigurationIncludedObjectVersions includedObjectVersions;
        private @Nullable List<BucketInventoryConfigurationOptionalFieldsItem> optionalFields;
        private @Nullable String prefix;
        private BucketInventoryConfigurationScheduleFrequency scheduleFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketInventoryConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.includedObjectVersions = defaults.includedObjectVersions;
    	      this.optionalFields = defaults.optionalFields;
    	      this.prefix = defaults.prefix;
    	      this.scheduleFrequency = defaults.scheduleFrequency;
        }

        public Builder destination(BucketDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder includedObjectVersions(BucketInventoryConfigurationIncludedObjectVersions includedObjectVersions) {
            this.includedObjectVersions = Objects.requireNonNull(includedObjectVersions);
            return this;
        }

        public Builder optionalFields(@Nullable List<BucketInventoryConfigurationOptionalFieldsItem> optionalFields) {
            this.optionalFields = optionalFields;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder scheduleFrequency(BucketInventoryConfigurationScheduleFrequency scheduleFrequency) {
            this.scheduleFrequency = Objects.requireNonNull(scheduleFrequency);
            return this;
        }
        public BucketInventoryConfiguration build() {
            return new BucketInventoryConfiguration(destination, enabled, id, includedObjectVersions, optionalFields, prefix, scheduleFrequency);
        }
    }
}
