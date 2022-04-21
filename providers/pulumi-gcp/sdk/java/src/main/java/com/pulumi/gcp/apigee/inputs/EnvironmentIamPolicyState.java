// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentIamPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentIamPolicyState Empty = new EnvironmentIamPolicyState();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="envId")
    private @Nullable Output<String> envId;

    public Optional<Output<String>> envId() {
        return Optional.ofNullable(this.envId);
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
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

    private EnvironmentIamPolicyState() {}

    private EnvironmentIamPolicyState(EnvironmentIamPolicyState $) {
        this.envId = $.envId;
        this.etag = $.etag;
        this.orgId = $.orgId;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentIamPolicyState $;

        public Builder() {
            $ = new EnvironmentIamPolicyState();
        }

        public Builder(EnvironmentIamPolicyState defaults) {
            $ = new EnvironmentIamPolicyState(Objects.requireNonNull(defaults));
        }

        public Builder envId(@Nullable Output<String> envId) {
            $.envId = envId;
            return this;
        }

        public Builder envId(String envId) {
            return envId(Output.of(envId));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder policyData(@Nullable Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public EnvironmentIamPolicyState build() {
            return $;
        }
    }

}
