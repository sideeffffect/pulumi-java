// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resiliencehub.inputs;

import java.util.Objects;


public final class ResiliencyPolicyTagMap extends com.pulumi.resources.InvokeArgs {

    public static final ResiliencyPolicyTagMap Empty = new ResiliencyPolicyTagMap();

    public ResiliencyPolicyTagMap() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResiliencyPolicyTagMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ResiliencyPolicyTagMap defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public ResiliencyPolicyTagMap build() {
            return new ResiliencyPolicyTagMap();
        }
    }
}
