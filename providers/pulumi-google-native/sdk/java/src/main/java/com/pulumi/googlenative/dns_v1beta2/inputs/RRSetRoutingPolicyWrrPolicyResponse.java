// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1beta2.inputs.RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configures a RRSetRoutingPolicy that routes in a weighted round robin fashion.
 * 
 */
public final class RRSetRoutingPolicyWrrPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final RRSetRoutingPolicyWrrPolicyResponse Empty = new RRSetRoutingPolicyWrrPolicyResponse();

    @Import(name="items", required=true)
      private final List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse> items;

    public List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse> items() {
        return this.items;
    }

    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    public RRSetRoutingPolicyWrrPolicyResponse(
        List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse> items,
        String kind) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private RRSetRoutingPolicyWrrPolicyResponse() {
        this.items = List.of();
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyWrrPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse> items;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyWrrPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
        }

        public Builder items(List<RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse... items) {
            return items(List.of(items));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public RRSetRoutingPolicyWrrPolicyResponse build() {
            return new RRSetRoutingPolicyWrrPolicyResponse(items, kind);
        }
    }
}
