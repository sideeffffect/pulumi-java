// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3;

import com.pulumi.awsnative.s3.enums.BucketAccessControl;
import com.pulumi.awsnative.s3.inputs.BucketAccelerateConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketAnalyticsConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketCorsConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketEncryptionArgs;
import com.pulumi.awsnative.s3.inputs.BucketIntelligentTieringConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketInventoryConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketLifecycleConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketLoggingConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketMetricsConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketNotificationConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketObjectLockConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketOwnershipControlsArgs;
import com.pulumi.awsnative.s3.inputs.BucketPublicAccessBlockConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketReplicationConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketTagArgs;
import com.pulumi.awsnative.s3.inputs.BucketVersioningConfigurationArgs;
import com.pulumi.awsnative.s3.inputs.BucketWebsiteConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketArgs extends ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    /**
     * Configuration for the transfer acceleration state.
     * 
     */
    @Import(name="accelerateConfiguration")
    private @Nullable Output<BucketAccelerateConfigurationArgs> accelerateConfiguration;

    /**
     * @return Configuration for the transfer acceleration state.
     * 
     */
    public Optional<Output<BucketAccelerateConfigurationArgs>> accelerateConfiguration() {
        return Optional.ofNullable(this.accelerateConfiguration);
    }

    /**
     * A canned access control list (ACL) that grants predefined permissions to the bucket.
     * 
     */
    @Import(name="accessControl")
    private @Nullable Output<BucketAccessControl> accessControl;

    /**
     * @return A canned access control list (ACL) that grants predefined permissions to the bucket.
     * 
     */
    public Optional<Output<BucketAccessControl>> accessControl() {
        return Optional.ofNullable(this.accessControl);
    }

    /**
     * The configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     * 
     */
    @Import(name="analyticsConfigurations")
    private @Nullable Output<List<BucketAnalyticsConfigurationArgs>> analyticsConfigurations;

    /**
     * @return The configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     * 
     */
    public Optional<Output<List<BucketAnalyticsConfigurationArgs>>> analyticsConfigurations() {
        return Optional.ofNullable(this.analyticsConfigurations);
    }

    @Import(name="bucketEncryption")
    private @Nullable Output<BucketEncryptionArgs> bucketEncryption;

    public Optional<Output<BucketEncryptionArgs>> bucketEncryption() {
        return Optional.ofNullable(this.bucketEncryption);
    }

    /**
     * A name for the bucket. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the bucket name.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return A name for the bucket. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the bucket name.
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * Rules that define cross-origin resource sharing of objects in this bucket.
     * 
     */
    @Import(name="corsConfiguration")
    private @Nullable Output<BucketCorsConfigurationArgs> corsConfiguration;

    /**
     * @return Rules that define cross-origin resource sharing of objects in this bucket.
     * 
     */
    public Optional<Output<BucketCorsConfigurationArgs>> corsConfiguration() {
        return Optional.ofNullable(this.corsConfiguration);
    }

    /**
     * Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
     * 
     */
    @Import(name="intelligentTieringConfigurations")
    private @Nullable Output<List<BucketIntelligentTieringConfigurationArgs>> intelligentTieringConfigurations;

    /**
     * @return Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
     * 
     */
    public Optional<Output<List<BucketIntelligentTieringConfigurationArgs>>> intelligentTieringConfigurations() {
        return Optional.ofNullable(this.intelligentTieringConfigurations);
    }

    /**
     * The inventory configuration for an Amazon S3 bucket.
     * 
     */
    @Import(name="inventoryConfigurations")
    private @Nullable Output<List<BucketInventoryConfigurationArgs>> inventoryConfigurations;

    /**
     * @return The inventory configuration for an Amazon S3 bucket.
     * 
     */
    public Optional<Output<List<BucketInventoryConfigurationArgs>>> inventoryConfigurations() {
        return Optional.ofNullable(this.inventoryConfigurations);
    }

    /**
     * Rules that define how Amazon S3 manages objects during their lifetime.
     * 
     */
    @Import(name="lifecycleConfiguration")
    private @Nullable Output<BucketLifecycleConfigurationArgs> lifecycleConfiguration;

    /**
     * @return Rules that define how Amazon S3 manages objects during their lifetime.
     * 
     */
    public Optional<Output<BucketLifecycleConfigurationArgs>> lifecycleConfiguration() {
        return Optional.ofNullable(this.lifecycleConfiguration);
    }

    /**
     * Settings that define where logs are stored.
     * 
     */
    @Import(name="loggingConfiguration")
    private @Nullable Output<BucketLoggingConfigurationArgs> loggingConfiguration;

    /**
     * @return Settings that define where logs are stored.
     * 
     */
    public Optional<Output<BucketLoggingConfigurationArgs>> loggingConfiguration() {
        return Optional.ofNullable(this.loggingConfiguration);
    }

    /**
     * Settings that define a metrics configuration for the CloudWatch request metrics from the bucket.
     * 
     */
    @Import(name="metricsConfigurations")
    private @Nullable Output<List<BucketMetricsConfigurationArgs>> metricsConfigurations;

    /**
     * @return Settings that define a metrics configuration for the CloudWatch request metrics from the bucket.
     * 
     */
    public Optional<Output<List<BucketMetricsConfigurationArgs>>> metricsConfigurations() {
        return Optional.ofNullable(this.metricsConfigurations);
    }

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     * 
     */
    @Import(name="notificationConfiguration")
    private @Nullable Output<BucketNotificationConfigurationArgs> notificationConfiguration;

    /**
     * @return Configuration that defines how Amazon S3 handles bucket notifications.
     * 
     */
    public Optional<Output<BucketNotificationConfigurationArgs>> notificationConfiguration() {
        return Optional.ofNullable(this.notificationConfiguration);
    }

    /**
     * Places an Object Lock configuration on the specified bucket.
     * 
     */
    @Import(name="objectLockConfiguration")
    private @Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration;

    /**
     * @return Places an Object Lock configuration on the specified bucket.
     * 
     */
    public Optional<Output<BucketObjectLockConfigurationArgs>> objectLockConfiguration() {
        return Optional.ofNullable(this.objectLockConfiguration);
    }

    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     * 
     */
    @Import(name="objectLockEnabled")
    private @Nullable Output<Boolean> objectLockEnabled;

    /**
     * @return Indicates whether this bucket has an Object Lock configuration enabled.
     * 
     */
    public Optional<Output<Boolean>> objectLockEnabled() {
        return Optional.ofNullable(this.objectLockEnabled);
    }

    /**
     * Specifies the container element for object ownership rules.
     * 
     */
    @Import(name="ownershipControls")
    private @Nullable Output<BucketOwnershipControlsArgs> ownershipControls;

    /**
     * @return Specifies the container element for object ownership rules.
     * 
     */
    public Optional<Output<BucketOwnershipControlsArgs>> ownershipControls() {
        return Optional.ofNullable(this.ownershipControls);
    }

    @Import(name="publicAccessBlockConfiguration")
    private @Nullable Output<BucketPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;

    public Optional<Output<BucketPublicAccessBlockConfigurationArgs>> publicAccessBlockConfiguration() {
        return Optional.ofNullable(this.publicAccessBlockConfiguration);
    }

    /**
     * Configuration for replicating objects in an S3 bucket.
     * 
     */
    @Import(name="replicationConfiguration")
    private @Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration;

    /**
     * @return Configuration for replicating objects in an S3 bucket.
     * 
     */
    public Optional<Output<BucketReplicationConfigurationArgs>> replicationConfiguration() {
        return Optional.ofNullable(this.replicationConfiguration);
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<BucketTagArgs>> tags;

    /**
     * @return An arbitrary set of tags (key-value pairs) for this S3 bucket.
     * 
     */
    public Optional<Output<List<BucketTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="versioningConfiguration")
    private @Nullable Output<BucketVersioningConfigurationArgs> versioningConfiguration;

    public Optional<Output<BucketVersioningConfigurationArgs>> versioningConfiguration() {
        return Optional.ofNullable(this.versioningConfiguration);
    }

    @Import(name="websiteConfiguration")
    private @Nullable Output<BucketWebsiteConfigurationArgs> websiteConfiguration;

    public Optional<Output<BucketWebsiteConfigurationArgs>> websiteConfiguration() {
        return Optional.ofNullable(this.websiteConfiguration);
    }

    private BucketArgs() {}

    private BucketArgs(BucketArgs $) {
        this.accelerateConfiguration = $.accelerateConfiguration;
        this.accessControl = $.accessControl;
        this.analyticsConfigurations = $.analyticsConfigurations;
        this.bucketEncryption = $.bucketEncryption;
        this.bucketName = $.bucketName;
        this.corsConfiguration = $.corsConfiguration;
        this.intelligentTieringConfigurations = $.intelligentTieringConfigurations;
        this.inventoryConfigurations = $.inventoryConfigurations;
        this.lifecycleConfiguration = $.lifecycleConfiguration;
        this.loggingConfiguration = $.loggingConfiguration;
        this.metricsConfigurations = $.metricsConfigurations;
        this.notificationConfiguration = $.notificationConfiguration;
        this.objectLockConfiguration = $.objectLockConfiguration;
        this.objectLockEnabled = $.objectLockEnabled;
        this.ownershipControls = $.ownershipControls;
        this.publicAccessBlockConfiguration = $.publicAccessBlockConfiguration;
        this.replicationConfiguration = $.replicationConfiguration;
        this.tags = $.tags;
        this.versioningConfiguration = $.versioningConfiguration;
        this.websiteConfiguration = $.websiteConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketArgs $;

        public Builder() {
            $ = new BucketArgs();
        }

        public Builder(BucketArgs defaults) {
            $ = new BucketArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accelerateConfiguration Configuration for the transfer acceleration state.
         * 
         * @return builder
         * 
         */
        public Builder accelerateConfiguration(@Nullable Output<BucketAccelerateConfigurationArgs> accelerateConfiguration) {
            $.accelerateConfiguration = accelerateConfiguration;
            return this;
        }

        /**
         * @param accelerateConfiguration Configuration for the transfer acceleration state.
         * 
         * @return builder
         * 
         */
        public Builder accelerateConfiguration(BucketAccelerateConfigurationArgs accelerateConfiguration) {
            return accelerateConfiguration(Output.of(accelerateConfiguration));
        }

        /**
         * @param accessControl A canned access control list (ACL) that grants predefined permissions to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder accessControl(@Nullable Output<BucketAccessControl> accessControl) {
            $.accessControl = accessControl;
            return this;
        }

        /**
         * @param accessControl A canned access control list (ACL) that grants predefined permissions to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder accessControl(BucketAccessControl accessControl) {
            return accessControl(Output.of(accessControl));
        }

        /**
         * @param analyticsConfigurations The configuration and any analyses for the analytics filter of an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder analyticsConfigurations(@Nullable Output<List<BucketAnalyticsConfigurationArgs>> analyticsConfigurations) {
            $.analyticsConfigurations = analyticsConfigurations;
            return this;
        }

        /**
         * @param analyticsConfigurations The configuration and any analyses for the analytics filter of an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder analyticsConfigurations(List<BucketAnalyticsConfigurationArgs> analyticsConfigurations) {
            return analyticsConfigurations(Output.of(analyticsConfigurations));
        }

        /**
         * @param analyticsConfigurations The configuration and any analyses for the analytics filter of an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder analyticsConfigurations(BucketAnalyticsConfigurationArgs... analyticsConfigurations) {
            return analyticsConfigurations(List.of(analyticsConfigurations));
        }

        public Builder bucketEncryption(@Nullable Output<BucketEncryptionArgs> bucketEncryption) {
            $.bucketEncryption = bucketEncryption;
            return this;
        }

        public Builder bucketEncryption(BucketEncryptionArgs bucketEncryption) {
            return bucketEncryption(Output.of(bucketEncryption));
        }

        /**
         * @param bucketName A name for the bucket. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the bucket name.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName A name for the bucket. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the bucket name.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param corsConfiguration Rules that define cross-origin resource sharing of objects in this bucket.
         * 
         * @return builder
         * 
         */
        public Builder corsConfiguration(@Nullable Output<BucketCorsConfigurationArgs> corsConfiguration) {
            $.corsConfiguration = corsConfiguration;
            return this;
        }

        /**
         * @param corsConfiguration Rules that define cross-origin resource sharing of objects in this bucket.
         * 
         * @return builder
         * 
         */
        public Builder corsConfiguration(BucketCorsConfigurationArgs corsConfiguration) {
            return corsConfiguration(Output.of(corsConfiguration));
        }

        /**
         * @param intelligentTieringConfigurations Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder intelligentTieringConfigurations(@Nullable Output<List<BucketIntelligentTieringConfigurationArgs>> intelligentTieringConfigurations) {
            $.intelligentTieringConfigurations = intelligentTieringConfigurations;
            return this;
        }

        /**
         * @param intelligentTieringConfigurations Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder intelligentTieringConfigurations(List<BucketIntelligentTieringConfigurationArgs> intelligentTieringConfigurations) {
            return intelligentTieringConfigurations(Output.of(intelligentTieringConfigurations));
        }

        /**
         * @param intelligentTieringConfigurations Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder intelligentTieringConfigurations(BucketIntelligentTieringConfigurationArgs... intelligentTieringConfigurations) {
            return intelligentTieringConfigurations(List.of(intelligentTieringConfigurations));
        }

        /**
         * @param inventoryConfigurations The inventory configuration for an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder inventoryConfigurations(@Nullable Output<List<BucketInventoryConfigurationArgs>> inventoryConfigurations) {
            $.inventoryConfigurations = inventoryConfigurations;
            return this;
        }

        /**
         * @param inventoryConfigurations The inventory configuration for an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder inventoryConfigurations(List<BucketInventoryConfigurationArgs> inventoryConfigurations) {
            return inventoryConfigurations(Output.of(inventoryConfigurations));
        }

        /**
         * @param inventoryConfigurations The inventory configuration for an Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder inventoryConfigurations(BucketInventoryConfigurationArgs... inventoryConfigurations) {
            return inventoryConfigurations(List.of(inventoryConfigurations));
        }

        /**
         * @param lifecycleConfiguration Rules that define how Amazon S3 manages objects during their lifetime.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleConfiguration(@Nullable Output<BucketLifecycleConfigurationArgs> lifecycleConfiguration) {
            $.lifecycleConfiguration = lifecycleConfiguration;
            return this;
        }

        /**
         * @param lifecycleConfiguration Rules that define how Amazon S3 manages objects during their lifetime.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleConfiguration(BucketLifecycleConfigurationArgs lifecycleConfiguration) {
            return lifecycleConfiguration(Output.of(lifecycleConfiguration));
        }

        /**
         * @param loggingConfiguration Settings that define where logs are stored.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfiguration(@Nullable Output<BucketLoggingConfigurationArgs> loggingConfiguration) {
            $.loggingConfiguration = loggingConfiguration;
            return this;
        }

        /**
         * @param loggingConfiguration Settings that define where logs are stored.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfiguration(BucketLoggingConfigurationArgs loggingConfiguration) {
            return loggingConfiguration(Output.of(loggingConfiguration));
        }

        /**
         * @param metricsConfigurations Settings that define a metrics configuration for the CloudWatch request metrics from the bucket.
         * 
         * @return builder
         * 
         */
        public Builder metricsConfigurations(@Nullable Output<List<BucketMetricsConfigurationArgs>> metricsConfigurations) {
            $.metricsConfigurations = metricsConfigurations;
            return this;
        }

        /**
         * @param metricsConfigurations Settings that define a metrics configuration for the CloudWatch request metrics from the bucket.
         * 
         * @return builder
         * 
         */
        public Builder metricsConfigurations(List<BucketMetricsConfigurationArgs> metricsConfigurations) {
            return metricsConfigurations(Output.of(metricsConfigurations));
        }

        /**
         * @param metricsConfigurations Settings that define a metrics configuration for the CloudWatch request metrics from the bucket.
         * 
         * @return builder
         * 
         */
        public Builder metricsConfigurations(BucketMetricsConfigurationArgs... metricsConfigurations) {
            return metricsConfigurations(List.of(metricsConfigurations));
        }

        /**
         * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket notifications.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfiguration(@Nullable Output<BucketNotificationConfigurationArgs> notificationConfiguration) {
            $.notificationConfiguration = notificationConfiguration;
            return this;
        }

        /**
         * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket notifications.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfiguration(BucketNotificationConfigurationArgs notificationConfiguration) {
            return notificationConfiguration(Output.of(notificationConfiguration));
        }

        /**
         * @param objectLockConfiguration Places an Object Lock configuration on the specified bucket.
         * 
         * @return builder
         * 
         */
        public Builder objectLockConfiguration(@Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration) {
            $.objectLockConfiguration = objectLockConfiguration;
            return this;
        }

        /**
         * @param objectLockConfiguration Places an Object Lock configuration on the specified bucket.
         * 
         * @return builder
         * 
         */
        public Builder objectLockConfiguration(BucketObjectLockConfigurationArgs objectLockConfiguration) {
            return objectLockConfiguration(Output.of(objectLockConfiguration));
        }

        /**
         * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration enabled.
         * 
         * @return builder
         * 
         */
        public Builder objectLockEnabled(@Nullable Output<Boolean> objectLockEnabled) {
            $.objectLockEnabled = objectLockEnabled;
            return this;
        }

        /**
         * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration enabled.
         * 
         * @return builder
         * 
         */
        public Builder objectLockEnabled(Boolean objectLockEnabled) {
            return objectLockEnabled(Output.of(objectLockEnabled));
        }

        /**
         * @param ownershipControls Specifies the container element for object ownership rules.
         * 
         * @return builder
         * 
         */
        public Builder ownershipControls(@Nullable Output<BucketOwnershipControlsArgs> ownershipControls) {
            $.ownershipControls = ownershipControls;
            return this;
        }

        /**
         * @param ownershipControls Specifies the container element for object ownership rules.
         * 
         * @return builder
         * 
         */
        public Builder ownershipControls(BucketOwnershipControlsArgs ownershipControls) {
            return ownershipControls(Output.of(ownershipControls));
        }

        public Builder publicAccessBlockConfiguration(@Nullable Output<BucketPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration) {
            $.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }

        public Builder publicAccessBlockConfiguration(BucketPublicAccessBlockConfigurationArgs publicAccessBlockConfiguration) {
            return publicAccessBlockConfiguration(Output.of(publicAccessBlockConfiguration));
        }

        /**
         * @param replicationConfiguration Configuration for replicating objects in an S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder replicationConfiguration(@Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration) {
            $.replicationConfiguration = replicationConfiguration;
            return this;
        }

        /**
         * @param replicationConfiguration Configuration for replicating objects in an S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder replicationConfiguration(BucketReplicationConfigurationArgs replicationConfiguration) {
            return replicationConfiguration(Output.of(replicationConfiguration));
        }

        /**
         * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<BucketTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<BucketTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder tags(BucketTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder versioningConfiguration(@Nullable Output<BucketVersioningConfigurationArgs> versioningConfiguration) {
            $.versioningConfiguration = versioningConfiguration;
            return this;
        }

        public Builder versioningConfiguration(BucketVersioningConfigurationArgs versioningConfiguration) {
            return versioningConfiguration(Output.of(versioningConfiguration));
        }

        public Builder websiteConfiguration(@Nullable Output<BucketWebsiteConfigurationArgs> websiteConfiguration) {
            $.websiteConfiguration = websiteConfiguration;
            return this;
        }

        public Builder websiteConfiguration(BucketWebsiteConfigurationArgs websiteConfiguration) {
            return websiteConfiguration(Output.of(websiteConfiguration));
        }

        public BucketArgs build() {
            return $;
        }
    }

}
