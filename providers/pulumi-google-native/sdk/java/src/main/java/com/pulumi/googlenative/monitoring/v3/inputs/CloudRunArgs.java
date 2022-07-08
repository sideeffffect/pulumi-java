// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cloud Run service. Learn more at https://cloud.google.com/run.
 * 
 */
public final class CloudRunArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudRunArgs Empty = new CloudRunArgs();

    /**
     * The location the service is run. Corresponds to the location resource label in the cloud_run_revision monitored resource (https://cloud.google.com/monitoring/api/resources#tag_cloud_run_revision).
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location the service is run. Corresponds to the location resource label in the cloud_run_revision monitored resource (https://cloud.google.com/monitoring/api/resources#tag_cloud_run_revision).
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Cloud Run service. Corresponds to the service_name resource label in the cloud_run_revision monitored resource (https://cloud.google.com/monitoring/api/resources#tag_cloud_run_revision).
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The name of the Cloud Run service. Corresponds to the service_name resource label in the cloud_run_revision monitored resource (https://cloud.google.com/monitoring/api/resources#tag_cloud_run_revision).
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private CloudRunArgs() {}

    private CloudRunArgs(CloudRunArgs $) {
        this.location = $.location;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudRunArgs $;

        public Builder() {
            $ = new CloudRunArgs();
        }

        public Builder(CloudRunArgs defaults) {
            $ = new CloudRunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location the service is run. Corresponds to the location resource label in the cloud_run_revision monitored resource (https://cloud.google.com/monitoring/api/resources#tag_cloud_run_revision).
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location the service is run. Corresponds to the location resource label in the cloud_run_revision monitored resource (https://cloud.google.com/monitoring/api/resources#tag_cloud_run_revision).
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param serviceName The name of the Cloud Run service. Corresponds to the service_name resource label in the cloud_run_revision monitored resource (https://cloud.google.com/monitoring/api/resources#tag_cloud_run_revision).
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the Cloud Run service. Corresponds to the service_name resource label in the cloud_run_revision monitored resource (https://cloud.google.com/monitoring/api/resources#tag_cloud_run_revision).
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public CloudRunArgs build() {
            return $;
        }
    }

}
