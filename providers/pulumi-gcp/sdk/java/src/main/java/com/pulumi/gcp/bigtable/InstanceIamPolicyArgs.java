// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceIamPolicyArgs extends ResourceArgs {

    public static final InstanceIamPolicyArgs Empty = new InstanceIamPolicyArgs();

    /**
     * The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    /**
     * @return The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }

    /**
     * The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     * The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private InstanceIamPolicyArgs() {}

    private InstanceIamPolicyArgs(InstanceIamPolicyArgs $) {
        this.instance = $.instance;
        this.policyData = $.policyData;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceIamPolicyArgs $;

        public Builder() {
            $ = new InstanceIamPolicyArgs();
        }

        public Builder(InstanceIamPolicyArgs defaults) {
            $ = new InstanceIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instance The name or relative resource id of the instance to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name or relative resource id of the instance to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param policyData The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        /**
         * @param project The project in which the instance belongs. If it
         * is not provided, a default will be supplied.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the instance belongs. If it
         * is not provided, a default will be supplied.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public InstanceIamPolicyArgs build() {
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}
