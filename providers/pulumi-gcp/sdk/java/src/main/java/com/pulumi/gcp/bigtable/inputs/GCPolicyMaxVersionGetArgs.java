// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GCPolicyMaxVersionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GCPolicyMaxVersionGetArgs Empty = new GCPolicyMaxVersionGetArgs();

    /**
     * Number of version before applying the GC policy.
     * 
     */
    @Import(name="number", required=true)
    private Output<Integer> number;

    public Output<Integer> number() {
        return this.number;
    }

    private GCPolicyMaxVersionGetArgs() {}

    private GCPolicyMaxVersionGetArgs(GCPolicyMaxVersionGetArgs $) {
        this.number = $.number;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GCPolicyMaxVersionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GCPolicyMaxVersionGetArgs $;

        public Builder() {
            $ = new GCPolicyMaxVersionGetArgs();
        }

        public Builder(GCPolicyMaxVersionGetArgs defaults) {
            $ = new GCPolicyMaxVersionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder number(Output<Integer> number) {
            $.number = number;
            return this;
        }

        public Builder number(Integer number) {
            return number(Output.of(number));
        }

        public GCPolicyMaxVersionGetArgs build() {
            $.number = Objects.requireNonNull($.number, "expected parameter 'number' to be non-null");
            return $;
        }
    }

}
