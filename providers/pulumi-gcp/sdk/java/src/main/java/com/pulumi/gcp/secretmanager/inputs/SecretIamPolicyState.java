// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretIamPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final SecretIamPolicyState Empty = new SecretIamPolicyState();

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
    private @Nullable Output<String> policyData;

    public Optional<Output<String>> policyData() {
        return Optional.ofNullable(this.policyData);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="secretId")
    private @Nullable Output<String> secretId;

    public Optional<Output<String>> secretId() {
        return Optional.ofNullable(this.secretId);
    }

    private SecretIamPolicyState() {}

    private SecretIamPolicyState(SecretIamPolicyState $) {
        this.etag = $.etag;
        this.policyData = $.policyData;
        this.project = $.project;
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretIamPolicyState $;

        public Builder() {
            $ = new SecretIamPolicyState();
        }

        public Builder(SecretIamPolicyState defaults) {
            $ = new SecretIamPolicyState(Objects.requireNonNull(defaults));
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

        public Builder secretId(@Nullable Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        public SecretIamPolicyState build() {
            return $;
        }
    }

}
