// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceBindingIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceBindingIamPolicyArgs Empty = new GetServiceBindingIamPolicyArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="serviceBindingId", required=true)
    private Output<String> serviceBindingId;

    public Output<String> serviceBindingId() {
        return this.serviceBindingId;
    }

    private GetServiceBindingIamPolicyArgs() {}

    private GetServiceBindingIamPolicyArgs(GetServiceBindingIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.serviceBindingId = $.serviceBindingId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceBindingIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceBindingIamPolicyArgs $;

        public Builder() {
            $ = new GetServiceBindingIamPolicyArgs();
        }

        public Builder(GetServiceBindingIamPolicyArgs defaults) {
            $ = new GetServiceBindingIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder serviceBindingId(Output<String> serviceBindingId) {
            $.serviceBindingId = serviceBindingId;
            return this;
        }

        public Builder serviceBindingId(String serviceBindingId) {
            return serviceBindingId(Output.of(serviceBindingId));
        }

        public GetServiceBindingIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.serviceBindingId = Objects.requireNonNull($.serviceBindingId, "expected parameter 'serviceBindingId' to be non-null");
            return $;
        }
    }

}
