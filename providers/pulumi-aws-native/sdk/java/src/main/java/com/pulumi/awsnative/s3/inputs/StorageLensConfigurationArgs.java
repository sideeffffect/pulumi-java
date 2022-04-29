// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.StorageLensAccountLevelArgs;
import com.pulumi.awsnative.s3.inputs.StorageLensAwsOrgArgs;
import com.pulumi.awsnative.s3.inputs.StorageLensBucketsAndRegionsArgs;
import com.pulumi.awsnative.s3.inputs.StorageLensDataExportArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the details of Amazon S3 Storage Lens configuration.
 * 
 */
public final class StorageLensConfigurationArgs extends ResourceArgs {

    public static final StorageLensConfigurationArgs Empty = new StorageLensConfigurationArgs();

    @Import(name="accountLevel", required=true)
    private Output<StorageLensAccountLevelArgs> accountLevel;

    public Output<StorageLensAccountLevelArgs> accountLevel() {
        return this.accountLevel;
    }

    @Import(name="awsOrg")
    private @Nullable Output<StorageLensAwsOrgArgs> awsOrg;

    public Optional<Output<StorageLensAwsOrgArgs>> awsOrg() {
        return Optional.ofNullable(this.awsOrg);
    }

    @Import(name="dataExport")
    private @Nullable Output<StorageLensDataExportArgs> dataExport;

    public Optional<Output<StorageLensDataExportArgs>> dataExport() {
        return Optional.ofNullable(this.dataExport);
    }

    @Import(name="exclude")
    private @Nullable Output<StorageLensBucketsAndRegionsArgs> exclude;

    public Optional<Output<StorageLensBucketsAndRegionsArgs>> exclude() {
        return Optional.ofNullable(this.exclude);
    }

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    @Import(name="include")
    private @Nullable Output<StorageLensBucketsAndRegionsArgs> include;

    public Optional<Output<StorageLensBucketsAndRegionsArgs>> include() {
        return Optional.ofNullable(this.include);
    }

    /**
     * Specifies whether the Amazon S3 Storage Lens configuration is enabled or disabled.
     * 
     */
    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    /**
     * @return Specifies whether the Amazon S3 Storage Lens configuration is enabled or disabled.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    /**
     * The ARN for the Amazon S3 Storage Lens configuration.
     * 
     */
    @Import(name="storageLensArn")
    private @Nullable Output<String> storageLensArn;

    /**
     * @return The ARN for the Amazon S3 Storage Lens configuration.
     * 
     */
    public Optional<Output<String>> storageLensArn() {
        return Optional.ofNullable(this.storageLensArn);
    }

    private StorageLensConfigurationArgs() {}

    private StorageLensConfigurationArgs(StorageLensConfigurationArgs $) {
        this.accountLevel = $.accountLevel;
        this.awsOrg = $.awsOrg;
        this.dataExport = $.dataExport;
        this.exclude = $.exclude;
        this.id = $.id;
        this.include = $.include;
        this.isEnabled = $.isEnabled;
        this.storageLensArn = $.storageLensArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageLensConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageLensConfigurationArgs $;

        public Builder() {
            $ = new StorageLensConfigurationArgs();
        }

        public Builder(StorageLensConfigurationArgs defaults) {
            $ = new StorageLensConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountLevel(Output<StorageLensAccountLevelArgs> accountLevel) {
            $.accountLevel = accountLevel;
            return this;
        }

        public Builder accountLevel(StorageLensAccountLevelArgs accountLevel) {
            return accountLevel(Output.of(accountLevel));
        }

        public Builder awsOrg(@Nullable Output<StorageLensAwsOrgArgs> awsOrg) {
            $.awsOrg = awsOrg;
            return this;
        }

        public Builder awsOrg(StorageLensAwsOrgArgs awsOrg) {
            return awsOrg(Output.of(awsOrg));
        }

        public Builder dataExport(@Nullable Output<StorageLensDataExportArgs> dataExport) {
            $.dataExport = dataExport;
            return this;
        }

        public Builder dataExport(StorageLensDataExportArgs dataExport) {
            return dataExport(Output.of(dataExport));
        }

        public Builder exclude(@Nullable Output<StorageLensBucketsAndRegionsArgs> exclude) {
            $.exclude = exclude;
            return this;
        }

        public Builder exclude(StorageLensBucketsAndRegionsArgs exclude) {
            return exclude(Output.of(exclude));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder include(@Nullable Output<StorageLensBucketsAndRegionsArgs> include) {
            $.include = include;
            return this;
        }

        public Builder include(StorageLensBucketsAndRegionsArgs include) {
            return include(Output.of(include));
        }

        /**
         * @param isEnabled Specifies whether the Amazon S3 Storage Lens configuration is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Specifies whether the Amazon S3 Storage Lens configuration is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param storageLensArn The ARN for the Amazon S3 Storage Lens configuration.
         * 
         * @return builder
         * 
         */
        public Builder storageLensArn(@Nullable Output<String> storageLensArn) {
            $.storageLensArn = storageLensArn;
            return this;
        }

        /**
         * @param storageLensArn The ARN for the Amazon S3 Storage Lens configuration.
         * 
         * @return builder
         * 
         */
        public Builder storageLensArn(String storageLensArn) {
            return storageLensArn(Output.of(storageLensArn));
        }

        public StorageLensConfigurationArgs build() {
            $.accountLevel = Objects.requireNonNull($.accountLevel, "expected parameter 'accountLevel' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            return $;
        }
    }

}
