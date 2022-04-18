// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The baseline constraints resource for a monitoring job.
 * 
 */
public final class MonitoringScheduleConstraintsResource extends com.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleConstraintsResource Empty = new MonitoringScheduleConstraintsResource();

    /**
     * The Amazon S3 URI for baseline constraint file in Amazon S3 that the current monitoring job should validated against.
     * 
     */
    @Import(name="s3Uri")
      private final @Nullable String s3Uri;

    public Optional<String> s3Uri() {
        return this.s3Uri == null ? Optional.empty() : Optional.ofNullable(this.s3Uri);
    }

    public MonitoringScheduleConstraintsResource(@Nullable String s3Uri) {
        this.s3Uri = s3Uri;
    }

    private MonitoringScheduleConstraintsResource() {
        this.s3Uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleConstraintsResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleConstraintsResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder s3Uri(@Nullable String s3Uri) {
            this.s3Uri = s3Uri;
            return this;
        }        public MonitoringScheduleConstraintsResource build() {
            return new MonitoringScheduleConstraintsResource(s3Uri);
        }
    }
}
