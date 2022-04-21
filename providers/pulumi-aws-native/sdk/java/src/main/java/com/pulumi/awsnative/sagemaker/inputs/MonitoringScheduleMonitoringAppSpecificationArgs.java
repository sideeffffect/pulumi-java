// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container image configuration object for the monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringAppSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleMonitoringAppSpecificationArgs Empty = new MonitoringScheduleMonitoringAppSpecificationArgs();

    /**
     * An array of arguments for the container used to run the monitoring job.
     * 
     */
    @Import(name="containerArguments")
    private @Nullable Output<List<String>> containerArguments;

    public Optional<Output<List<String>>> containerArguments() {
        return Optional.ofNullable(this.containerArguments);
    }

    /**
     * Specifies the entrypoint for a container used to run the monitoring job.
     * 
     */
    @Import(name="containerEntrypoint")
    private @Nullable Output<List<String>> containerEntrypoint;

    public Optional<Output<List<String>>> containerEntrypoint() {
        return Optional.ofNullable(this.containerEntrypoint);
    }

    /**
     * The container image to be run by the monitoring job.
     * 
     */
    @Import(name="imageUri", required=true)
    private Output<String> imageUri;

    public Output<String> imageUri() {
        return this.imageUri;
    }

    /**
     * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
     * 
     */
    @Import(name="postAnalyticsProcessorSourceUri")
    private @Nullable Output<String> postAnalyticsProcessorSourceUri;

    public Optional<Output<String>> postAnalyticsProcessorSourceUri() {
        return Optional.ofNullable(this.postAnalyticsProcessorSourceUri);
    }

    /**
     * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers
     * 
     */
    @Import(name="recordPreprocessorSourceUri")
    private @Nullable Output<String> recordPreprocessorSourceUri;

    public Optional<Output<String>> recordPreprocessorSourceUri() {
        return Optional.ofNullable(this.recordPreprocessorSourceUri);
    }

    private MonitoringScheduleMonitoringAppSpecificationArgs() {}

    private MonitoringScheduleMonitoringAppSpecificationArgs(MonitoringScheduleMonitoringAppSpecificationArgs $) {
        this.containerArguments = $.containerArguments;
        this.containerEntrypoint = $.containerEntrypoint;
        this.imageUri = $.imageUri;
        this.postAnalyticsProcessorSourceUri = $.postAnalyticsProcessorSourceUri;
        this.recordPreprocessorSourceUri = $.recordPreprocessorSourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleMonitoringAppSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleMonitoringAppSpecificationArgs $;

        public Builder() {
            $ = new MonitoringScheduleMonitoringAppSpecificationArgs();
        }

        public Builder(MonitoringScheduleMonitoringAppSpecificationArgs defaults) {
            $ = new MonitoringScheduleMonitoringAppSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerArguments(@Nullable Output<List<String>> containerArguments) {
            $.containerArguments = containerArguments;
            return this;
        }

        public Builder containerArguments(List<String> containerArguments) {
            return containerArguments(Output.of(containerArguments));
        }

        public Builder containerArguments(String... containerArguments) {
            return containerArguments(List.of(containerArguments));
        }

        public Builder containerEntrypoint(@Nullable Output<List<String>> containerEntrypoint) {
            $.containerEntrypoint = containerEntrypoint;
            return this;
        }

        public Builder containerEntrypoint(List<String> containerEntrypoint) {
            return containerEntrypoint(Output.of(containerEntrypoint));
        }

        public Builder containerEntrypoint(String... containerEntrypoint) {
            return containerEntrypoint(List.of(containerEntrypoint));
        }

        public Builder imageUri(Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        public Builder postAnalyticsProcessorSourceUri(@Nullable Output<String> postAnalyticsProcessorSourceUri) {
            $.postAnalyticsProcessorSourceUri = postAnalyticsProcessorSourceUri;
            return this;
        }

        public Builder postAnalyticsProcessorSourceUri(String postAnalyticsProcessorSourceUri) {
            return postAnalyticsProcessorSourceUri(Output.of(postAnalyticsProcessorSourceUri));
        }

        public Builder recordPreprocessorSourceUri(@Nullable Output<String> recordPreprocessorSourceUri) {
            $.recordPreprocessorSourceUri = recordPreprocessorSourceUri;
            return this;
        }

        public Builder recordPreprocessorSourceUri(String recordPreprocessorSourceUri) {
            return recordPreprocessorSourceUri(Output.of(recordPreprocessorSourceUri));
        }

        public MonitoringScheduleMonitoringAppSpecificationArgs build() {
            $.imageUri = Objects.requireNonNull($.imageUri, "expected parameter 'imageUri' to be non-null");
            return $;
        }
    }

}
