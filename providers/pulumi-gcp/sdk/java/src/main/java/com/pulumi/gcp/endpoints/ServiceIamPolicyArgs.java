// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.endpoints;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIamPolicyArgs Empty = new ServiceIamPolicyArgs();

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ServiceIamPolicyArgs() {}

    private ServiceIamPolicyArgs(ServiceIamPolicyArgs $) {
        this.policyData = $.policyData;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIamPolicyArgs $;

        public Builder() {
            $ = new ServiceIamPolicyArgs();
        }

        public Builder(ServiceIamPolicyArgs defaults) {
            $ = new ServiceIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ServiceIamPolicyArgs build() {
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
