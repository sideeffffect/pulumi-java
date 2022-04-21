// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Configuration of preserved resources.
 * 
 */
public final class StatefulPolicyPreservedStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final StatefulPolicyPreservedStateResponse Empty = new StatefulPolicyPreservedStateResponse();

    /**
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * 
     */
    @Import(name="disks", required=true)
    private Map<String,String> disks;

    public Map<String,String> disks() {
        return this.disks;
    }

    private StatefulPolicyPreservedStateResponse() {}

    private StatefulPolicyPreservedStateResponse(StatefulPolicyPreservedStateResponse $) {
        this.disks = $.disks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulPolicyPreservedStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulPolicyPreservedStateResponse $;

        public Builder() {
            $ = new StatefulPolicyPreservedStateResponse();
        }

        public Builder(StatefulPolicyPreservedStateResponse defaults) {
            $ = new StatefulPolicyPreservedStateResponse(Objects.requireNonNull(defaults));
        }

        public Builder disks(Map<String,String> disks) {
            $.disks = disks;
            return this;
        }

        public StatefulPolicyPreservedStateResponse build() {
            $.disks = Objects.requireNonNull($.disks, "expected parameter 'disks' to be non-null");
            return $;
        }
    }

}
