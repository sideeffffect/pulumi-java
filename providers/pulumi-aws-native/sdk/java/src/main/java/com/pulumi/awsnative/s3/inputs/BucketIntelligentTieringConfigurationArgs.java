// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketIntelligentTieringConfigurationStatus;
import com.pulumi.awsnative.s3.inputs.BucketTagFilterArgs;
import com.pulumi.awsnative.s3.inputs.BucketTieringArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketIntelligentTieringConfigurationArgs extends ResourceArgs {

    public static final BucketIntelligentTieringConfigurationArgs Empty = new BucketIntelligentTieringConfigurationArgs();

    /**
     * The ID used to identify the S3 Intelligent-Tiering configuration.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID used to identify the S3 Intelligent-Tiering configuration.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * An object key name prefix that identifies the subset of objects to which the rule applies.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return An object key name prefix that identifies the subset of objects to which the rule applies.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Specifies the status of the configuration.
     * 
     */
    @Import(name="status", required=true)
    private Output<BucketIntelligentTieringConfigurationStatus> status;

    /**
     * @return Specifies the status of the configuration.
     * 
     */
    public Output<BucketIntelligentTieringConfigurationStatus> status() {
        return this.status;
    }

    /**
     * A container for a key-value pair.
     * 
     */
    @Import(name="tagFilters")
    private @Nullable Output<List<BucketTagFilterArgs>> tagFilters;

    /**
     * @return A container for a key-value pair.
     * 
     */
    public Optional<Output<List<BucketTagFilterArgs>>> tagFilters() {
        return Optional.ofNullable(this.tagFilters);
    }

    /**
     * Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration. At least one tier must be defined in the list. At most, you can specify two tiers in the list, one for each available AccessTier: ARCHIVE_ACCESS and DEEP_ARCHIVE_ACCESS.
     * 
     */
    @Import(name="tierings", required=true)
    private Output<List<BucketTieringArgs>> tierings;

    /**
     * @return Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration. At least one tier must be defined in the list. At most, you can specify two tiers in the list, one for each available AccessTier: ARCHIVE_ACCESS and DEEP_ARCHIVE_ACCESS.
     * 
     */
    public Output<List<BucketTieringArgs>> tierings() {
        return this.tierings;
    }

    private BucketIntelligentTieringConfigurationArgs() {}

    private BucketIntelligentTieringConfigurationArgs(BucketIntelligentTieringConfigurationArgs $) {
        this.id = $.id;
        this.prefix = $.prefix;
        this.status = $.status;
        this.tagFilters = $.tagFilters;
        this.tierings = $.tierings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketIntelligentTieringConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketIntelligentTieringConfigurationArgs $;

        public Builder() {
            $ = new BucketIntelligentTieringConfigurationArgs();
        }

        public Builder(BucketIntelligentTieringConfigurationArgs defaults) {
            $ = new BucketIntelligentTieringConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID used to identify the S3 Intelligent-Tiering configuration.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID used to identify the S3 Intelligent-Tiering configuration.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param prefix An object key name prefix that identifies the subset of objects to which the rule applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix An object key name prefix that identifies the subset of objects to which the rule applies.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param status Specifies the status of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<BucketIntelligentTieringConfigurationStatus> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Specifies the status of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder status(BucketIntelligentTieringConfigurationStatus status) {
            return status(Output.of(status));
        }

        /**
         * @param tagFilters A container for a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder tagFilters(@Nullable Output<List<BucketTagFilterArgs>> tagFilters) {
            $.tagFilters = tagFilters;
            return this;
        }

        /**
         * @param tagFilters A container for a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder tagFilters(List<BucketTagFilterArgs> tagFilters) {
            return tagFilters(Output.of(tagFilters));
        }

        /**
         * @param tagFilters A container for a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder tagFilters(BucketTagFilterArgs... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }

        /**
         * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration. At least one tier must be defined in the list. At most, you can specify two tiers in the list, one for each available AccessTier: ARCHIVE_ACCESS and DEEP_ARCHIVE_ACCESS.
         * 
         * @return builder
         * 
         */
        public Builder tierings(Output<List<BucketTieringArgs>> tierings) {
            $.tierings = tierings;
            return this;
        }

        /**
         * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration. At least one tier must be defined in the list. At most, you can specify two tiers in the list, one for each available AccessTier: ARCHIVE_ACCESS and DEEP_ARCHIVE_ACCESS.
         * 
         * @return builder
         * 
         */
        public Builder tierings(List<BucketTieringArgs> tierings) {
            return tierings(Output.of(tierings));
        }

        /**
         * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration. At least one tier must be defined in the list. At most, you can specify two tiers in the list, one for each available AccessTier: ARCHIVE_ACCESS and DEEP_ARCHIVE_ACCESS.
         * 
         * @return builder
         * 
         */
        public Builder tierings(BucketTieringArgs... tierings) {
            return tierings(List.of(tierings));
        }

        public BucketIntelligentTieringConfigurationArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.tierings = Objects.requireNonNull($.tierings, "expected parameter 'tierings' to be non-null");
            return $;
        }
    }

}
