// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Autoscaling Policy config associated with the cluster.
 * 
 */
public final class AutoscalingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalingConfigArgs Empty = new AutoscalingConfigArgs();

    /**
     * Optional. The autoscaling policy used by the cluster.Only resource names including projectid and location (region) are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id] projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note that the policy must be in the same project and Dataproc region.
     * 
     */
    @Import(name="policyUri")
    private @Nullable Output<String> policyUri;

    /**
     * @return Optional. The autoscaling policy used by the cluster.Only resource names including projectid and location (region) are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id] projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note that the policy must be in the same project and Dataproc region.
     * 
     */
    public Optional<Output<String>> policyUri() {
        return Optional.ofNullable(this.policyUri);
    }

    private AutoscalingConfigArgs() {}

    private AutoscalingConfigArgs(AutoscalingConfigArgs $) {
        this.policyUri = $.policyUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingConfigArgs $;

        public Builder() {
            $ = new AutoscalingConfigArgs();
        }

        public Builder(AutoscalingConfigArgs defaults) {
            $ = new AutoscalingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyUri Optional. The autoscaling policy used by the cluster.Only resource names including projectid and location (region) are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id] projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note that the policy must be in the same project and Dataproc region.
         * 
         * @return builder
         * 
         */
        public Builder policyUri(@Nullable Output<String> policyUri) {
            $.policyUri = policyUri;
            return this;
        }

        /**
         * @param policyUri Optional. The autoscaling policy used by the cluster.Only resource names including projectid and location (region) are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id] projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note that the policy must be in the same project and Dataproc region.
         * 
         * @return builder
         * 
         */
        public Builder policyUri(String policyUri) {
            return policyUri(Output.of(policyUri));
        }

        public AutoscalingConfigArgs build() {
            return $;
        }
    }

}
