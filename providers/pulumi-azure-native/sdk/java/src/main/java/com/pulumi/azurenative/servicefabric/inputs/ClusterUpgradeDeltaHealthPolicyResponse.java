// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.inputs.ApplicationDeltaHealthPolicyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the delta health policies for the cluster upgrade.
 * 
 */
public final class ClusterUpgradeDeltaHealthPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClusterUpgradeDeltaHealthPolicyResponse Empty = new ClusterUpgradeDeltaHealthPolicyResponse();

    /**
     * Defines the application delta health policy map used to evaluate the health of an application or one of its child entities when upgrading the cluster.
     * 
     */
    @Import(name="applicationDeltaHealthPolicies")
    private @Nullable Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies;

    public Optional<Map<String,ApplicationDeltaHealthPolicyResponse>> applicationDeltaHealthPolicies() {
        return Optional.ofNullable(this.applicationDeltaHealthPolicies);
    }

    /**
     * The maximum allowed percentage of applications health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the applications at the beginning of upgrade and the state of the applications at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits. System services are not included in this.
     * 
     */
    @Import(name="maxPercentDeltaUnhealthyApplications", required=true)
    private Integer maxPercentDeltaUnhealthyApplications;

    public Integer maxPercentDeltaUnhealthyApplications() {
        return this.maxPercentDeltaUnhealthyApplications;
    }

    /**
     * The maximum allowed percentage of nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the nodes at the beginning of upgrade and the state of the nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     * 
     */
    @Import(name="maxPercentDeltaUnhealthyNodes", required=true)
    private Integer maxPercentDeltaUnhealthyNodes;

    public Integer maxPercentDeltaUnhealthyNodes() {
        return this.maxPercentDeltaUnhealthyNodes;
    }

    /**
     * The maximum allowed percentage of upgrade domain nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the upgrade domain nodes at the beginning of upgrade and the state of the upgrade domain nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion for all completed upgrade domains to make sure the state of the upgrade domains is within tolerated limits.
     * 
     */
    @Import(name="maxPercentUpgradeDomainDeltaUnhealthyNodes", required=true)
    private Integer maxPercentUpgradeDomainDeltaUnhealthyNodes;

    public Integer maxPercentUpgradeDomainDeltaUnhealthyNodes() {
        return this.maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    private ClusterUpgradeDeltaHealthPolicyResponse() {}

    private ClusterUpgradeDeltaHealthPolicyResponse(ClusterUpgradeDeltaHealthPolicyResponse $) {
        this.applicationDeltaHealthPolicies = $.applicationDeltaHealthPolicies;
        this.maxPercentDeltaUnhealthyApplications = $.maxPercentDeltaUnhealthyApplications;
        this.maxPercentDeltaUnhealthyNodes = $.maxPercentDeltaUnhealthyNodes;
        this.maxPercentUpgradeDomainDeltaUnhealthyNodes = $.maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterUpgradeDeltaHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterUpgradeDeltaHealthPolicyResponse $;

        public Builder() {
            $ = new ClusterUpgradeDeltaHealthPolicyResponse();
        }

        public Builder(ClusterUpgradeDeltaHealthPolicyResponse defaults) {
            $ = new ClusterUpgradeDeltaHealthPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder applicationDeltaHealthPolicies(@Nullable Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies) {
            $.applicationDeltaHealthPolicies = applicationDeltaHealthPolicies;
            return this;
        }

        public Builder maxPercentDeltaUnhealthyApplications(Integer maxPercentDeltaUnhealthyApplications) {
            $.maxPercentDeltaUnhealthyApplications = maxPercentDeltaUnhealthyApplications;
            return this;
        }

        public Builder maxPercentDeltaUnhealthyNodes(Integer maxPercentDeltaUnhealthyNodes) {
            $.maxPercentDeltaUnhealthyNodes = maxPercentDeltaUnhealthyNodes;
            return this;
        }

        public Builder maxPercentUpgradeDomainDeltaUnhealthyNodes(Integer maxPercentUpgradeDomainDeltaUnhealthyNodes) {
            $.maxPercentUpgradeDomainDeltaUnhealthyNodes = maxPercentUpgradeDomainDeltaUnhealthyNodes;
            return this;
        }

        public ClusterUpgradeDeltaHealthPolicyResponse build() {
            $.maxPercentDeltaUnhealthyApplications = Objects.requireNonNull($.maxPercentDeltaUnhealthyApplications, "expected parameter 'maxPercentDeltaUnhealthyApplications' to be non-null");
            $.maxPercentDeltaUnhealthyNodes = Objects.requireNonNull($.maxPercentDeltaUnhealthyNodes, "expected parameter 'maxPercentDeltaUnhealthyNodes' to be non-null");
            $.maxPercentUpgradeDomainDeltaUnhealthyNodes = Objects.requireNonNull($.maxPercentUpgradeDomainDeltaUnhealthyNodes, "expected parameter 'maxPercentUpgradeDomainDeltaUnhealthyNodes' to be non-null");
            return $;
        }
    }

}
