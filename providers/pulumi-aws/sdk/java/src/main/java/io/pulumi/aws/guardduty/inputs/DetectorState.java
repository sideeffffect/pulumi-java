// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.aws.guardduty.inputs.DetectorDatasourcesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorState extends io.pulumi.resources.ResourceArgs {

    public static final DetectorState Empty = new DetectorState();

    /**
     * The AWS account ID of the GuardDuty detector
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * Amazon Resource Name (ARN) of the GuardDuty detector
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Describes which data sources will be enabled for the detector. See Data Sources below for more details.
     * 
     */
    @Import(name="datasources")
      private final @Nullable Output<DetectorDatasourcesGetArgs> datasources;

    public Output<DetectorDatasourcesGetArgs> datasources() {
        return this.datasources == null ? Codegen.empty() : this.datasources;
    }

    /**
     * If true, enables [S3 Protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3_detection.html). Defaults to `true`.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> enable() {
        return this.enable == null ? Codegen.empty() : this.enable;
    }

    /**
     * Specifies the frequency of notifications sent for subsequent finding occurrences. If the detector is a GuardDuty member account, the value is determined by the GuardDuty primary account and cannot be modified, otherwise defaults to `SIX_HOURS`. For standalone and GuardDuty primary accounts, it must be configured in this provider to enable drift detection. Valid values for standalone and primary accounts: `FIFTEEN_MINUTES`, `ONE_HOUR`, `SIX_HOURS`. See [AWS Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings_cloudwatch.html#guardduty_findings_cloudwatch_notification_frequency) for more information.
     * 
     */
    @Import(name="findingPublishingFrequency")
      private final @Nullable Output<String> findingPublishingFrequency;

    public Output<String> findingPublishingFrequency() {
        return this.findingPublishingFrequency == null ? Codegen.empty() : this.findingPublishingFrequency;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public DetectorState(
        @Nullable Output<String> accountId,
        @Nullable Output<String> arn,
        @Nullable Output<DetectorDatasourcesGetArgs> datasources,
        @Nullable Output<Boolean> enable,
        @Nullable Output<String> findingPublishingFrequency,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.accountId = accountId;
        this.arn = arn;
        this.datasources = datasources;
        this.enable = enable;
        this.findingPublishingFrequency = findingPublishingFrequency;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DetectorState() {
        this.accountId = Codegen.empty();
        this.arn = Codegen.empty();
        this.datasources = Codegen.empty();
        this.enable = Codegen.empty();
        this.findingPublishingFrequency = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> arn;
        private @Nullable Output<DetectorDatasourcesGetArgs> datasources;
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<String> findingPublishingFrequency;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.arn = defaults.arn;
    	      this.datasources = defaults.datasources;
    	      this.enable = defaults.enable;
    	      this.findingPublishingFrequency = defaults.findingPublishingFrequency;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder datasources(@Nullable Output<DetectorDatasourcesGetArgs> datasources) {
            this.datasources = datasources;
            return this;
        }
        public Builder datasources(@Nullable DetectorDatasourcesGetArgs datasources) {
            this.datasources = Codegen.ofNullable(datasources);
            return this;
        }
        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Codegen.ofNullable(enable);
            return this;
        }
        public Builder findingPublishingFrequency(@Nullable Output<String> findingPublishingFrequency) {
            this.findingPublishingFrequency = findingPublishingFrequency;
            return this;
        }
        public Builder findingPublishingFrequency(@Nullable String findingPublishingFrequency) {
            this.findingPublishingFrequency = Codegen.ofNullable(findingPublishingFrequency);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public DetectorState build() {
            return new DetectorState(accountId, arn, datasources, enable, findingPublishingFrequency, tags, tagsAll);
        }
    }
}
