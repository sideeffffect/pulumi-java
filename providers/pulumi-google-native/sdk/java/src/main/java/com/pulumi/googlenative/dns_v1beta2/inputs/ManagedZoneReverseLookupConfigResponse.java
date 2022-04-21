// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedZoneReverseLookupConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedZoneReverseLookupConfigResponse Empty = new ManagedZoneReverseLookupConfigResponse();

    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    private ManagedZoneReverseLookupConfigResponse() {}

    private ManagedZoneReverseLookupConfigResponse(ManagedZoneReverseLookupConfigResponse $) {
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneReverseLookupConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneReverseLookupConfigResponse $;

        public Builder() {
            $ = new ManagedZoneReverseLookupConfigResponse();
        }

        public Builder(ManagedZoneReverseLookupConfigResponse defaults) {
            $ = new ManagedZoneReverseLookupConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public ManagedZoneReverseLookupConfigResponse build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
