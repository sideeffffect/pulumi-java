// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionIamPolicyState extends ResourceArgs {

    public static final FunctionIamPolicyState Empty = new FunctionIamPolicyState();

    @Import(name="cloudFunction")
    private @Nullable Output<String> cloudFunction;

    public Optional<Output<String>> cloudFunction() {
        return Optional.ofNullable(this.cloudFunction);
    }

    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="policyData")
    private @Nullable Output<String> policyData;

    public Optional<Output<String>> policyData() {
        return Optional.ofNullable(this.policyData);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private FunctionIamPolicyState() {}

    private FunctionIamPolicyState(FunctionIamPolicyState $) {
        this.cloudFunction = $.cloudFunction;
        this.etag = $.etag;
        this.policyData = $.policyData;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionIamPolicyState $;

        public Builder() {
            $ = new FunctionIamPolicyState();
        }

        public Builder(FunctionIamPolicyState defaults) {
            $ = new FunctionIamPolicyState(Objects.requireNonNull(defaults));
        }

        public Builder cloudFunction(@Nullable Output<String> cloudFunction) {
            $.cloudFunction = cloudFunction;
            return this;
        }

        public Builder cloudFunction(String cloudFunction) {
            return cloudFunction(Output.of(cloudFunction));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder policyData(@Nullable Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public FunctionIamPolicyState build() {
            return $;
        }
    }

}
