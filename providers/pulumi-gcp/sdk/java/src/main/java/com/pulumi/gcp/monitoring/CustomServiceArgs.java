// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.monitoring.inputs.CustomServiceTelemetryArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomServiceArgs Empty = new CustomServiceArgs();

    /**
     * Name used for UI elements listing this Service.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * An optional service ID to use. If not given, the server will generate a
     * service ID.
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    /**
     * Configuration for how to query telemetry on a Service.
     * Structure is documented below.
     * 
     */
    @Import(name="telemetry")
    private @Nullable Output<CustomServiceTelemetryArgs> telemetry;

    public Optional<Output<CustomServiceTelemetryArgs>> telemetry() {
        return Optional.ofNullable(this.telemetry);
    }

    private CustomServiceArgs() {}

    private CustomServiceArgs(CustomServiceArgs $) {
        this.displayName = $.displayName;
        this.project = $.project;
        this.serviceId = $.serviceId;
        this.telemetry = $.telemetry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomServiceArgs $;

        public Builder() {
            $ = new CustomServiceArgs();
        }

        public Builder(CustomServiceArgs defaults) {
            $ = new CustomServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public Builder telemetry(@Nullable Output<CustomServiceTelemetryArgs> telemetry) {
            $.telemetry = telemetry;
            return this;
        }

        public Builder telemetry(CustomServiceTelemetryArgs telemetry) {
            return telemetry(Output.of(telemetry));
        }

        public CustomServiceArgs build() {
            return $;
        }
    }

}
