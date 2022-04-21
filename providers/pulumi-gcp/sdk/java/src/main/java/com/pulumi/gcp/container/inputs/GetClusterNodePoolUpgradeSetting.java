// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetClusterNodePoolUpgradeSetting extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolUpgradeSetting Empty = new GetClusterNodePoolUpgradeSetting();

    @Import(name="maxSurge", required=true)
    private Integer maxSurge;

    public Integer maxSurge() {
        return this.maxSurge;
    }

    @Import(name="maxUnavailable", required=true)
    private Integer maxUnavailable;

    public Integer maxUnavailable() {
        return this.maxUnavailable;
    }

    private GetClusterNodePoolUpgradeSetting() {}

    private GetClusterNodePoolUpgradeSetting(GetClusterNodePoolUpgradeSetting $) {
        this.maxSurge = $.maxSurge;
        this.maxUnavailable = $.maxUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterNodePoolUpgradeSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterNodePoolUpgradeSetting $;

        public Builder() {
            $ = new GetClusterNodePoolUpgradeSetting();
        }

        public Builder(GetClusterNodePoolUpgradeSetting defaults) {
            $ = new GetClusterNodePoolUpgradeSetting(Objects.requireNonNull(defaults));
        }

        public Builder maxSurge(Integer maxSurge) {
            $.maxSurge = maxSurge;
            return this;
        }

        public Builder maxUnavailable(Integer maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        public GetClusterNodePoolUpgradeSetting build() {
            $.maxSurge = Objects.requireNonNull($.maxSurge, "expected parameter 'maxSurge' to be non-null");
            $.maxUnavailable = Objects.requireNonNull($.maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
            return $;
        }
    }

}
