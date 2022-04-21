// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetClusterDefaultSnatStatus extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterDefaultSnatStatus Empty = new GetClusterDefaultSnatStatus();

    @Import(name="disabled", required=true)
    private Boolean disabled;

    public Boolean disabled() {
        return this.disabled;
    }

    private GetClusterDefaultSnatStatus() {}

    private GetClusterDefaultSnatStatus(GetClusterDefaultSnatStatus $) {
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterDefaultSnatStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterDefaultSnatStatus $;

        public Builder() {
            $ = new GetClusterDefaultSnatStatus();
        }

        public Builder(GetClusterDefaultSnatStatus defaults) {
            $ = new GetClusterDefaultSnatStatus(Objects.requireNonNull(defaults));
        }

        public Builder disabled(Boolean disabled) {
            $.disabled = disabled;
            return this;
        }

        public GetClusterDefaultSnatStatus build() {
            $.disabled = Objects.requireNonNull($.disabled, "expected parameter 'disabled' to be non-null");
            return $;
        }
    }

}
