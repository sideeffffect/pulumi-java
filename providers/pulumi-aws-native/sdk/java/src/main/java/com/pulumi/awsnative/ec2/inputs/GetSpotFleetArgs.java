// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetSpotFleetArgs extends InvokeArgs {

    public static final GetSpotFleetArgs Empty = new GetSpotFleetArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetSpotFleetArgs() {}

    private GetSpotFleetArgs(GetSpotFleetArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpotFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpotFleetArgs $;

        public Builder() {
            $ = new GetSpotFleetArgs();
        }

        public Builder(GetSpotFleetArgs defaults) {
            $ = new GetSpotFleetArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetSpotFleetArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
