// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1beta.inputs.FixedOrPercentResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Patch rollout configuration specifications. Contains details on the concurrency control when applying patch(es) to all targeted VMs.
 * 
 */
public final class PatchRolloutResponse extends com.pulumi.resources.InvokeArgs {

    public static final PatchRolloutResponse Empty = new PatchRolloutResponse();

    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment. The number of VMs calculated from multiplying the percentage by the total number of VMs in a zone is rounded up. During patching, a VM is considered disrupted from the time the agent is notified to begin until patching has completed. This disruption time includes the time to complete reboot and any post-patch steps. A VM contributes to the disruption budget if its patching operation fails either when applying the patches, running pre or post patch steps, or if it fails to respond with a success notification before timing out. VMs that are not running or do not have an active agent do not count toward this disruption budget. For zone-by-zone rollouts, if the disruption budget in a zone is exceeded, the patch job stops, because continuing to the next zone requires completion of the patch process in the previous zone. For example, if the disruption budget has a fixed value of `10`, and 8 VMs fail to patch in the current zone, the patch job continues to patch 2 VMs at a time until the zone is completed. When that zone is completed successfully, patching begins with 10 VMs at a time in the next zone. If 10 VMs in the next zone fail to patch, the patch job stops.
     * 
     */
    @Import(name="disruptionBudget", required=true)
    private FixedOrPercentResponse disruptionBudget;

    public FixedOrPercentResponse disruptionBudget() {
        return this.disruptionBudget;
    }

    /**
     * Mode of the patch rollout.
     * 
     */
    @Import(name="mode", required=true)
    private String mode;

    public String mode() {
        return this.mode;
    }

    private PatchRolloutResponse() {}

    private PatchRolloutResponse(PatchRolloutResponse $) {
        this.disruptionBudget = $.disruptionBudget;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchRolloutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchRolloutResponse $;

        public Builder() {
            $ = new PatchRolloutResponse();
        }

        public Builder(PatchRolloutResponse defaults) {
            $ = new PatchRolloutResponse(Objects.requireNonNull(defaults));
        }

        public Builder disruptionBudget(FixedOrPercentResponse disruptionBudget) {
            $.disruptionBudget = disruptionBudget;
            return this;
        }

        public Builder mode(String mode) {
            $.mode = mode;
            return this;
        }

        public PatchRolloutResponse build() {
            $.disruptionBudget = Objects.requireNonNull($.disruptionBudget, "expected parameter 'disruptionBudget' to be non-null");
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
