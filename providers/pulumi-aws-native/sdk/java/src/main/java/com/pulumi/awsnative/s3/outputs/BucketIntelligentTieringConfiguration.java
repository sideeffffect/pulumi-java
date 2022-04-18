// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.outputs;

import com.pulumi.awsnative.s3.enums.BucketIntelligentTieringConfigurationStatus;
import com.pulumi.awsnative.s3.outputs.BucketTagFilter;
import com.pulumi.awsnative.s3.outputs.BucketTiering;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketIntelligentTieringConfiguration {
    /**
     * The ID used to identify the S3 Intelligent-Tiering configuration.
     * 
     */
    private final String id;
    /**
     * An object key name prefix that identifies the subset of objects to which the rule applies.
     * 
     */
    private final @Nullable String prefix;
    /**
     * Specifies the status of the configuration.
     * 
     */
    private final BucketIntelligentTieringConfigurationStatus status;
    /**
     * A container for a key-value pair.
     * 
     */
    private final @Nullable List<BucketTagFilter> tagFilters;
    /**
     * Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration. At least one tier must be defined in the list. At most, you can specify two tiers in the list, one for each available AccessTier: ARCHIVE_ACCESS and DEEP_ARCHIVE_ACCESS.
     * 
     */
    private final List<BucketTiering> tierings;

    @CustomType.Constructor
    private BucketIntelligentTieringConfiguration(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("status") BucketIntelligentTieringConfigurationStatus status,
        @CustomType.Parameter("tagFilters") @Nullable List<BucketTagFilter> tagFilters,
        @CustomType.Parameter("tierings") List<BucketTiering> tierings) {
        this.id = id;
        this.prefix = prefix;
        this.status = status;
        this.tagFilters = tagFilters;
        this.tierings = tierings;
    }

    /**
     * The ID used to identify the S3 Intelligent-Tiering configuration.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * An object key name prefix that identifies the subset of objects to which the rule applies.
     * 
    */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * Specifies the status of the configuration.
     * 
    */
    public BucketIntelligentTieringConfigurationStatus status() {
        return this.status;
    }
    /**
     * A container for a key-value pair.
     * 
    */
    public List<BucketTagFilter> tagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }
    /**
     * Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration. At least one tier must be defined in the list. At most, you can specify two tiers in the list, one for each available AccessTier: ARCHIVE_ACCESS and DEEP_ARCHIVE_ACCESS.
     * 
    */
    public List<BucketTiering> tierings() {
        return this.tierings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIntelligentTieringConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String prefix;
        private BucketIntelligentTieringConfigurationStatus status;
        private @Nullable List<BucketTagFilter> tagFilters;
        private List<BucketTiering> tierings;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIntelligentTieringConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.status = defaults.status;
    	      this.tagFilters = defaults.tagFilters;
    	      this.tierings = defaults.tierings;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder status(BucketIntelligentTieringConfigurationStatus status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tagFilters(@Nullable List<BucketTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public Builder tagFilters(BucketTagFilter... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }
        public Builder tierings(List<BucketTiering> tierings) {
            this.tierings = Objects.requireNonNull(tierings);
            return this;
        }
        public Builder tierings(BucketTiering... tierings) {
            return tierings(List.of(tierings));
        }        public BucketIntelligentTieringConfiguration build() {
            return new BucketIntelligentTieringConfiguration(id, prefix, status, tagFilters, tierings);
        }
    }
}
